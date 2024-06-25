package com.dji.dair.internal.repository;

import android.os.Environment;
import android.util.Log;
import dji.v5.manager.SDKManager;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.io.File;

import dji.v5.manager.SDKManager;
import dji.v5.manager.datacenter.media.MediaManager;
import dji.v5.ux.core.base.DJISDKModel;
import dji.v5.ux.visualcamera.storage.SDCardInsertedEvent;
import dji.v5.ux.visualcamera.storage.SDCardRemovedEvent;

public class FTPConnectionManager {

    private FTPClient ftpClient;
    private String server = "192.168.10.200";
    private int port = 21;
    private String user = "hakim";
    private String password = "kgb0563";
    String sdCardPath = Environment.getExternalStorageDirectory().getAbsolutePath();

    public FTPConnectionManager() {
//        this.server = server;
//        this.port = port;
//        this.user = user;
//        this.password = password;
//        this.ftpClient = new FTPClient();
        EventBus.getDefault().register(this);
    }
//    private boolean connectFTP() {
//        try {
//            Log.d("test","connectFTP");
//            try{
//            ftpClient.connect(server, port);
////            if(ftpClient.login(user, password)) {
////                Log.d("test", "ftpClient login"+ sdCardPath);
////                int reply = 0;
////                reply = ftpClient.getReplyCode();
////                Log.d("test","reply : "+ reply);
////                //ftpClient.enterLocalActiveMode();
////                //ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
////                }
//            }
//            catch (Exception e){
//                Log.d("test","connectFTP error : "+ e);
//            }
//
//            return true;
//        }
//        catch (Exception e){
//            return false;
//        }
//    }

    public boolean connectFTP() {
        try {
            ftpClient = new FTPClient();
                ftpClient.connect(server, port);
                Log.d("test", "ftpClient.getReplyCode(): " + ftpClient.getReplyCode());
                if (ftpClient.login(user, password)) {
                    //var product = SDKManager.getInstance().getProductCategory();
                    ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
                    // 230 : 로그인 성공
                    Log.d("test", "connectFTP login 성공 " + ftpClient.getReplyCode());
                    return true;
                } else {
                    Log.d("test", "connectFTP login 실패");
                    return false;
                }
        } catch (Exception e) {
            Log.e("test", "connectFTP Error : ", e);
            return false;
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
