package com.dji.dair.internal.controller;

import android.util.Log;

import dji.sdk.keyvalue.value.camera.CameraStorageInfo;
import dji.sdk.keyvalue.value.camera.CameraStorageInfos;
import dji.sdk.keyvalue.value.camera.CameraStorageLocation;
import dji.sdk.keyvalue.value.camera.SDCardLoadState;
import dji.v5.ux.core.util.DataProcessor;

class SDCardState {
    CameraStorageInfo storageInfo;


    public void checkSDCardStatus() {
        if(storageInfo != null) {
            SDCardLoadState state = storageInfo.getStorageState();
            Log.d("test","sdcard state :" + state);
        }
    }
}
