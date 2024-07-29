package com.dji.dair.internal.repository;

import android.os.Environment;
import android.util.Log;

import androidx.annotation.NonNull;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ntp.TimeStamp;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import dji.sdk.keyvalue.value.camera.CameraMode;
import dji.sdk.keyvalue.value.file.FileListRequestFilter;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.common.error.IDJIError;
import dji.v5.manager.datacenter.media.MediaFileDownloadListener;
import dji.v5.manager.datacenter.media.MediaFileFilter;
import dji.v5.manager.interfaces.IMediaManager;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import dji.v5.manager.datacenter.MediaDataCenter;
import dji.v5.manager.datacenter.media.MediaFile;
import dji.v5.manager.datacenter.media.PullMediaFileListParam;
import dji.v5.manager.datacenter.media.MediaFileListData;
import dji.v5.ux.visualcamera.storage.SDCardInsertedEvent;
import dji.v5.ux.visualcamera.storage.SDCardRemovedEvent;
import dji.v5.common.video.stream.StreamSource;

public class FTPConnectionManager {

    private FTPClient ftpClient;
    private String server = "192.168.20.40";
    private int port = 21;
    private String user = "hakim";
    private String password = "kgb0563";
    private boolean ftp_connected = false;
    private FileOutputStream fos;

    public FTPConnectionManager() {
        EventBus.getDefault().register(this);
    }


    public boolean connectFTP() {

            if(!ftp_connected)
                try {
                    ftpClient = new FTPClient();
                    ftpClient.connect(server, port);
                    Log.d("test", "ftpClient.connect in ftpClient.getReplyCode(): " + ftpClient.getReplyCode());
                    if (ftpClient.login(user, password)) {
                        // 230 : 로그인 성공
                        try{
                            Log.d("test", "try in ftpClient.getReplyCode(): " + ftpClient.getReplyCode());

                            fetchMediaFiles();
                        }
                        catch (Exception e) {
                            Log.d("test", " error : " + e);
                        }
                        ftp_connected = true;
                        return true;
                    } else {
                        Log.d("test", "connectFTP login 실패");
                        ftp_connected = false;
                        return false;
                }
        } catch (Exception e) {
            Log.e("test", "connectFTP Error : ", e);
            return false;
        }
        return false;
    }
private void fetchMediaFiles()
    {
        IMediaManager mediaManager = MediaDataCenter.getInstance().getMediaManager();
        MediaFileFilter mediaFileFilter = MediaFileFilter.PHOTO;
        PullMediaFileListParam params = new PullMediaFileListParam.Builder().filter(mediaFileFilter).build();

            mediaManager.pullMediaFileListFromCamera(params, new CommonCallbacks.CompletionCallback() {
                @Override
                public void onSuccess() {
                    Log.d("test","onSuccess");
                    MediaFileListData mediaFileListData = mediaManager.getMediaFileListData();
                    List<MediaFile> files = mediaFileListData.getData();


                    for(MediaFile file : files){

                        Log.d("test","file은 ? : "+ file);
                        file.pullOriginalMediaFileFromCamera(0, new MediaFileDownloadListener(){
                            @Override
                            public void onStart() {
                                Log.d("test"," onStart");
                                fos = new FileOutputStream(file,true);
                                var savePath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
                                String TimeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
                                var fileName = TimeStamp + ".png";
                                File file = new File(savePath, fileName);
                            }

                            @Override
                            public void onProgress(long total, long current) {
                                double progressPercentage = (double) current / total * 100;
                                Log.d("test", "progressPercentage : "+ progressPercentage);
                            }
                            @Override
                            public void onRealtimeDataUpdate(byte[] data, long position) {
                                try {
                                    fos.write(data);
                                    fos.flush();
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }


                            }

                            @Override
                            public void onFinish() {
                                Log.d("test","onFinish");
                                var storageDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
                                String path = "storage/emulated/0/Pictures/";
                                //saveFileToLocalStorage(file,path);
                            }

                            @Override
                            public void onFailure(IDJIError error) {
                                Log.d("test","onFailure");
                            }
                        });
                    }
                }

                @Override
                public void onFailure(@NonNull IDJIError idjiError) {

                }
            });
}
//private void saveFileToLocalStorage(MediaFile mediaFile, String path) {
//        File file = new File(path , mediaFile.getFileName());
//        try {
//            FileOutputStream fos = new FileOutputStream(file){
//                InputStream inputStream = mediaFile.getDate()){
//                    byte [] buf = new byte[1024];
//                    int len;
//                    while ((len = inputStream.read(buf)) > 0){
//                        fos.write(buf, 0 ,len);
//                    }
//                    fos.flush();
//
//                }
//            };
//        }
//        catch (Exception e){
//            Log.d("test", "Exception e :" + e);
//        }
//}



    @Subscribe
    public void onSDCardInserted(SDCardInsertedEvent event) {
        connectFTP();
    }

    @Subscribe
    public void onSDCardRemoved(SDCardRemovedEvent event) {
        disconnectFTP();
    }



    private void disconnectFTP() {
        //disconnect추가
        Log.d("test", "Disconnected from FTP server");
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
