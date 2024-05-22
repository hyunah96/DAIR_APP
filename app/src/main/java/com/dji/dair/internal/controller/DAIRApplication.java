package com.dji.dair.internal.controller;

import android.app.Application;
import android.content.Context;

import androidx.multidex.MultiDex;

import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;

import dji.sdk.base.BaseProduct;
import dji.sdk.products.Aircraft;
import dji.sdk.products.HandHeld;
import dji.sdk.sdkmanager.BluetoothProductConnector;
import dji.sdk.sdkmanager.DJISDKManager;

public class DAIRApplication extends Application {
    public static final String TAG = DAIRApplication.class.getName();

    private static BaseProduct product;
    private static BluetoothProductConnector bluetoothConnector = null;
    private static Bus bus = new Bus(ThreadEnforcer.ANY);
    private static Application app = null;

    public static synchronized BaseProduct getProductInstance() {
        product = DJISDKManager.getInstance().getProduct();
        return product;
    }

    public static synchronized BluetoothProductConnector getBluetoothConnector() {
        bluetoothConnector = DJISDKManager.getInstance().getBluetoothProductConnector();
        return bluetoothConnector;
    }

    //항공기인지 확인
    public static boolean isAircraftConnected() {
        return getProductInstance() != null && getProductInstance() instanceof Aircraft;
    }

    //핸드헬드인지 확인
    public static boolean isHandHeldConnected() {
        return getProductInstance() != null && getProductInstance() instanceof HandHeld;
    }

    //항공기, 핸드헬드 인스턴스 반환
    public static synchronized Aircraft getAircraftInstance() {
        if(!isAircraftConnected()) {
            return null;
        }
        return (Aircraft) getProductInstance();
    }

    public static synchronized HandHeld getHandHeldInstance() {
        if(!isHandHeldConnected()) {
            return null;
        }
        return (HandHeld) getProductInstance();
    }

    public static Application getInstance() {
        return DAIRApplication.app;
    }

    public static Bus getEventBus() {
        return bus;
    }

    @Override
    protected void attachBaseContext(Context paramContext) {
        super.attachBaseContext(paramContext);
        MultiDex.install(this);
        com.secneo.sdk.Helper.install(this);
        app = this;
    }

}
