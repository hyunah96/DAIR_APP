package com.dji.dair.internal.repository;

import android.os.Environment;
import android.util.Log;

import androidx.annotation.NonNull;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import dji.sdk.keyvalue.value.camera.CameraMode;
import dji.sdk.keyvalue.value.file.FileListRequestFilter;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.common.error.IDJIError;
import dji.v5.manager.datacenter.media.MediaFileDownloadListener;
import dji.v5.manager.datacenter.media.MediaFileFilter;
import dji.v5.manager.interfaces.IMediaManager;
import java.io.IOException;
import java.io.InputStream;
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
                            }

                            @Override
                            public void onProgress(long total, long current) {
                                double progressPercentage = (double) current / total * 100;
                                Log.d("test", "progressPercentage : "+ progressPercentage);


                            }

                            @Override
                            public void onRealtimeDataUpdate(byte[] data, long position) {

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
//    private void fetchMediaFiles() {
//        IMediaManager mediaManager = MediaDataCenter.getInstance().getMediaManager();
//        MediaFileFilter mediaFileFilter = MediaFileFilter.PHOTO;
//        PullMediaFileListParam params = new PullMediaFileListParam.Builder().filter(mediaFileFilter).build();
//        mediaManager.pullMediaFileListFromCamera(params, new CommonCallbacks.CompletionCallback<MediaFileListData>() {
//            @Override
//            public void onSuccess(MediaFileListData mediaFileListData) {
//                List<MediaFile> files = mediaFileListData.getData();
//                for (MediaFile mediaFile : files) {
//                    try {
//                        // 파일 다운로드
//                        InputStream inputStream = mediaFile.fetchOriginalMediaFileFromCamera();
//                        // FTP 설정
//                        ftpClient.enterLocalPassiveMode();
//                        ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
//                        // FTP로 파일 전송
//                        boolean success = ftpClient.storeFile(mediaFile.getFileName(), inputStream);
//                        if (success) {
//                            Log.d("FTP", "File uploaded successfully");
//                        } else {
//                            Log.d("FTP", "Failed to upload file");
//                        }
//                        inputStream.close();
//                    } catch (IOException ex) {
//                        Log.e("FTP", "Error in file transfer", ex);
//                    }
//                }
//            }
//
//            @Override
//            public void onFailure(IDJIError error) {
//                Log.e("FTP", "Failed to fetch media files: " + error.getDescription());
//            }
//        });
//    }









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
