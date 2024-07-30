package com.dji.dair.internal.repository;

import android.os.Environment;
import android.util.Log;

import androidx.annotation.NonNull;
import org.apache.commons.net.ftp.FTPClient;
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
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import dji.v5.manager.datacenter.MediaDataCenter;
import dji.v5.manager.datacenter.media.MediaFile;
import dji.v5.manager.datacenter.media.PullMediaFileListParam;
import dji.v5.manager.datacenter.media.MediaFileListData;
import dji.v5.ux.visualcamera.storage.SDCardInsertedEvent;
import dji.v5.ux.cameracore.widget.cameracapture.shootphoto.ShootPhotoEvent;
import dji.v5.ux.visualcamera.storage.SDCardRemovedEvent;
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
                    if (ftpClient.login(user, password)) {
                        // 230 : 로그인 성공
                        Log.d("test", "FTP CODE : " + ftpClient.getReplyCode());
                        ftp_connected = true;
                        return true;
                    } else {
                        Log.d("test", "FTP login 실패");
                        ftp_connected = false;
                        return false;
                }
        } catch (Exception e) {
            Log.e("test", "connectFTP Error : ", e);
            return false;
        }
        return false;
    }
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void fetchMediaFiles(ShootPhotoEvent shootPhotoEvent) {
        Log.d("test", "fetchMediaFiles");
        IMediaManager mediaManager = MediaDataCenter.getInstance().getMediaManager();
        MediaFileFilter mediaFileFilter = MediaFileFilter.PHOTO;
        PullMediaFileListParam params = new PullMediaFileListParam.Builder().filter(mediaFileFilter).build();
        mediaManager.pullMediaFileListFromCamera(params, new CommonCallbacks.CompletionCallback() {
                    @Override
                    public void onSuccess() {
                        Log.d("test","onSuccess");
                        MediaFileListData mediaFileListData = mediaManager.getMediaFileListData();
                        List<MediaFile> files = mediaFileListData.getData();
                        if(files.isEmpty()){
                            Log.d("test","files is empty");
                        }
                        for(MediaFile file : files){
                            Log.d("test","file은 ? : "+ file);
                            file.pullOriginalMediaFileFromCamera(0, new MediaFileDownloadListener(){
                                @Override
                                public void onStart() {
                                    Log.d("test"," onStart");
                                    var savePath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
                                    String TimeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
                                    var fileName = TimeStamp + ".png";
                                    File file = new File(savePath, fileName);
                                    try {
                                        fos = new FileOutputStream(file,true);
                                    } catch (FileNotFoundException e) {
                                        Log.d("test","FileOutputStream e : "+ e);
                                        throw new RuntimeException(e);
                                    }
                                }
                                @Override
                                public void onProgress(long total, long current) {
                                    //double progressPercentage = (double) current / total * 100;
                                    long progressPercentage = current;
                                    Log.d("test", "onProgress : "+ progressPercentage);
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



//




//        mediaManager.addMediaFileListStateListener(new MediaFileListStateListener() {
//
//            @Override
//            public void onUpdate(MediaFileListState mediaFileListState) {
//                Log.d("test","onUpdate");
//                mediaManager.pullMediaFileListFromCamera(params, new CommonCallbacks.CompletionCallback() {
//                    @Override
//                    public void onSuccess() {
//                        Log.d("test", "onSuccess");
//                        MediaFileListData mediaFileListData = mediaManager.getMediaFileListData();
//                        List<MediaFile> files = mediaFileListData.getData();
//
//                        for (MediaFile file : files) {
//                            file.pullOriginalMediaFileFromCamera(0, new MediaFileDownloadListener() {
//                                @Override
//                                public void onStart() {
//                                    Log.d("test", "onStart");
//                                    var savepath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
//                                    String TimeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
//                                    var fileName = TimeStamp + ".png";
//                                    File file = new File(savepath, fileName);
//                                    try {
//                                        fos = new FileOutputStream(file, true);
//                                    }
//                                    catch (FileNotFoundException e)
//                                    {
//                                        Log.d("test","FileNotFoundException e : "+ e);
//                                    }
//                                }
//
//                                @Override
//                                public void onProgress(long total, long current) {
//                                    Log.d("test", "onProgress : " + current);
//
//                                }
//
//                                @Override
//                                public void onRealtimeDataUpdate(byte[] data, long position) {
//                                    Log.d("test","onRealtimeDateUpdate");
//                                try {
//                                        fos.write(data);
//                                        fos.flush();
//                                    } catch (IOException e) {
//                                        throw new RuntimeException(e);
//                                    }
//
//                                }
//
//                                @Override
//                                public void onFinish() {
//
//                                }
//
//                                @Override
//                                public void onFailure(IDJIError error) {
//
//                                }
//                            });
//                        }
//                    }
//
//                    @Override
//                    public void onFailure(@NonNull IDJIError idjiError) {
//
//                    }
//                });
//            }
//        });












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
