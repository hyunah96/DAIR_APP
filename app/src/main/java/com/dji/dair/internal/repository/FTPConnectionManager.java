package com.dji.dair.internal.repository;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Environment;
import android.os.Handler;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.common.error.IDJIError;
import dji.v5.manager.datacenter.media.MediaFileDownloadListener;
import dji.v5.manager.datacenter.media.MediaFileFilter;
import dji.v5.manager.datacenter.media.MediaFileListState;
import dji.v5.manager.datacenter.media.MediaFileListStateListener;
import dji.v5.manager.interfaces.IMediaManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import dji.v5.manager.datacenter.MediaDataCenter;
import dji.v5.manager.datacenter.media.MediaFile;
import dji.v5.manager.datacenter.media.PullMediaFileListParam;
import dji.v5.manager.datacenter.media.MediaFileListData;
import dji.v5.ux.visualcamera.storage.SDCardInsertedEvent;
import dji.v5.ux.cameracore.widget.cameracapture.shootphoto.ShootPhotoEvent;
import dji.v5.ux.visualcamera.storage.SDCardRemovedEvent;

import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FTPConnectionManager {

    private FTPClient ftpClient;
    private static String server = "121.179.183.64";
    private static int port = 300;
    private static String user = "hakim";
    private static String password = "kgb0563";
    private boolean ftp_connected = false;
    private boolean onUpdate = false;
    private FileOutputStream fos;
    private FileInputStream fis;
    private ExecutorService executorService;
    private Channel channel = null;

    private ChannelSftp channelSftp = null;

    public FTPConnectionManager() {
        EventBus.getDefault().register(this);
        this.executorService = Executors.newSingleThreadExecutor();
    }

    //SD카드 삽입되면 이벤트 발생 감지하여 FTP 로그인
    public static Session getSFTPConnection() throws JSchException {
        JSch jSch = new JSch();
        Session session = null;
            try {
                Log.d("test","session");
                session = jSch.getSession(user, server, port);
                session.setPassword(password);
                Properties config = new Properties();
                config.put("StricHostKeyChecking", "no");
                session.setConfig(config);
                session.connect();
                Log.d("test","session.connect();");
            } catch (Exception e){
                e.printStackTrace();
            }

        return session;
    }
    //촬영 이벤트 감지 메서드
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void shootPhotoEvent(ShootPhotoEvent shootPhotoEvent) {
        IMediaManager mediaManager = MediaDataCenter.getInstance().getMediaManager();
        //파일 목록 변경 감지
        mediaManager.addMediaFileListStateListener(new MediaFileListStateListener() {
            @Override
            public void onUpdate(MediaFileListState mediaFileListState) {
                Log.d("test", "onUpdate ");

                Log.d("test", "MediaFileListState.UP_TO_DATE ");
                pollForMediaFiles(mediaManager);
            }
        });
        MediaFileFilter mediaFileFilter = MediaFileFilter.PHOTO;
        PullMediaFileListParam param = new PullMediaFileListParam.Builder().filter(mediaFileFilter).build();
        //파일 목록 가져오기
        mediaManager.pullMediaFileListFromCamera(param, new CommonCallbacks.CompletionCallback() {
            @Override
            public void onSuccess() {
                Log.d("test", "onSuccess");
                onUpdate = true;
                pollForMediaFiles(mediaManager);
            }
            @Override
            public void onFailure(@NonNull IDJIError idjiError) {
                Log.d("test", "onFailure" + idjiError);
            }
        });
    }

    private void pollForMediaFiles(IMediaManager mediaManager){
        Log.d("test","pollForMediaFiles");
        MediaFileListData mediaFileListData = mediaManager.getMediaFileListData();
        List<MediaFile> files = mediaFileListData.getData();

        if(onUpdate) {
            if (!files.isEmpty()) {
                //Set<String> seenFileNames = new HashSet<>();
                Log.d("test", "파일 갯수 " + files.size());
                MediaFile mediaFile = files.get(0);
                handleFiles(mediaFile);
            } else {
                Log.d("test", "files is empty");
                new Handler().postDelayed(() -> pollForMediaFiles(mediaManager), 1000);
            }
        }
    }

    //외부저장소로 업데이트
    private void handleFiles(MediaFile latestFile){
        Log.d("test","handleFiles");
        var savePath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        File localfile = new File(savePath,latestFile.getFileName());
        try {
            fos = new FileOutputStream(localfile,true);
        } catch (Exception e){
            Log.d("test","file Exception : "+ e);
        }
        latestFile.pullOriginalMediaFileFromCamera(0, new MediaFileDownloadListener() {
            @Override
            public void onStart() {
                Log.d(" test","onStart");
            }
            @Override
            public void onProgress(long total, long current) {
                double num = (double) current/total * 100;
                Log.d("test","파일명 : " + latestFile.getFileName() + " 다운로드 : " + num);
            }
            @Override
            public void onRealtimeDataUpdate(byte[] data, long position) {
                try {
                    fos.write(data);
                    fos.flush();
                } catch (IOException e) {
                    Log.d("test","onRealtimeDataUpdate error : "+ e);
                }
            }
            @Override
            public void onFinish() {
                Log.d("test","onFinish");
                if(localfile.exists()) {
                    Log.d("test","onFinish localfile.exists()");
                    uploadFileToFTP(localfile,latestFile.getFileName());
                }
            }
            @Override
            public void onFailure(IDJIError error) {
            }
        });
    }

    public void uploadFileToFTP(File localfile, String fileName) {
        executorService.execute(() -> {
            try {
                ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
                ftpClient.enterLocalPassiveMode();
                //String serverFilePath = "/srv/ftp/" + fileName;
                String serverFilePath = "/home/hakim" + fileName;
                try {
                    fis = new FileInputStream(localfile);
                    boolean result = ftpClient.storeFile(serverFilePath,fis);
                    Log.d("test","result : "+ result);
                    if (!result) {
                        Log.d("test", "FTP Upload Failed. Reply Code: " + ftpClient.getReplyCode() + " Reply String: " + ftpClient.getReplyString());
                    }
                }
                catch(FileNotFoundException e){
                    Log.d("test","FileNotFoundException");
                }
            }
            catch (Exception e){
                Log.d("test","uploadFileToFTP catch :"+e);
            }
        });
    }

    //    public boolean checkNetwork() {
//        ConnectivityManager connectivityManager = (ConnectivityManager)
//                conte
//    }
    @Subscribe
    public void onSDCardInserted(SDCardInsertedEvent event) throws JSchException {
        getSFTPConnection();
    }

    @Subscribe
    public void onSDCardRemoved(SDCardRemovedEvent event) throws IOException {
        Log.d("test", "FTP 연결 해제");
        Log.d("test","ftpClient??? "+ ftp_connected);
        if(ftpClient.isConnected() && ftp_connected) {
            try {
                ftpClient.logout();
                //ftpClient.disconnect();
                ftp_connected = false;
            } catch (IOException e) {
                Log.d("test", "FTP 연결 해제 도중 문제 발생 " + e);
            }
        } else {
            Log.d("test","ftpClient.isConnected() " + ftpClient.isConnected());
            Log.d("test", "ftp_connected " + ftp_connected);
            Log.d("test","문제있다");
        }


    }

    public void unregister() {
        EventBus.getDefault().unregister(this);
    }

    @Override
    protected void finalize() throws Throwable {
        unregister();
        super.finalize();
    }
}
