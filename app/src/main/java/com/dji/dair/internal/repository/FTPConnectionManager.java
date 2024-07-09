package com.dji.dair.internal.repository;

import android.os.Environment;
import android.util.Log;

import org.apache.commons.net.ftp.FTPClient;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.ArrayList;
import java.util.List;
import dji.v5.common.video.stream.PhysicalDeviceCategory;

import dji.v5.manager.datacenter.MediaDataCenter;
import dji.v5.manager.datacenter.media.MediaFile;
import dji.v5.manager.datacenter.media.MediaManager;
import dji.v5.manager.datacenter.media.PullMediaFileListParam;
import dji.v5.manager.datacenter.media.MediaFileListData;
import dji.v5.manager.interfaces.IMediaManager;
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
    String sdCardPath = Environment.getExternalStorageDirectory().getAbsolutePath();

    public FTPConnectionManager() {
//        this.server = server;
//        this.port = port;
//        this.user = user;
//        this.password = password;
//        this.ftpClient = new FTPClient();
        EventBus.getDefault().register(this);
    }


    public boolean connectFTP() {

            if(!ftp_connected)
                try {
                    ftpClient = new FTPClient();
                    ftpClient.connect(server, port);
                    Log.d("test", "ftpClient.getReplyCode(): " + ftpClient.getReplyCode());
                    if (ftpClient.login(user, password)) {
                        try{
                        //List<MediaFile> mediaFiles = MediaManager.getInstance().getMediaFileListData().getData();
                            fetchMediaFiles();
                        }
                        catch (Exception e) {
                            Log.d("test", " error : " + e);
                        }
                        //ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
                        // 230 : 로그인 성공

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
    private void fetchMediaFiles() {
        try{
            MediaManager mediaManager = MediaManager.getInstance();
            if(mediaManager != null){
            MediaFileListData mediaFileListData = mediaManager.getMediaFileListData();
            List<MediaFile> mediaFiles = mediaFileListData.getData();
            }

        }
        catch (Exception e){
            Log.d("test","error : "+e);
        }
    }




    @Subscribe
    public void onSDCardInserted(SDCardInsertedEvent event) {
        connectFTP();
    }

    @Subscribe
    public void onSDCardRemoved(SDCardRemovedEvent event) {
        disconnectFTP();
    }



    private void disconnectFTP() {
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
