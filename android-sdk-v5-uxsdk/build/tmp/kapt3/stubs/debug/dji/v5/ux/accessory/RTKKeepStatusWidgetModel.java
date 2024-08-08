package dji.v5.ux.accessory;

import java.lang.System;

/**
 * Description :Widget Model for the [RTKKeepStatusWidget] used to define
 * the underlying logic and communication
 *
 * @author: Byte.Cai
 * date : 2022/7/11
 *
 * Copyright (c) 2022, DJI All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0012H\u0014J\u0012\u0010\u0014\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\fR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001a"}, d2 = {"Ldji/v5/ux/accessory/RTKKeepStatusWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "Ldji/v5/manager/aircraft/rtk/RTKSystemStateListener;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "uxKeyManager", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "rtkCenter", "Ldji/v5/manager/interfaces/IRTKCenter;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;Ldji/v5/manager/interfaces/IRTKCenter;)V", "isRTKKeepStatusEnabledProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "", "rtkKeepStatusEnable", "Lio/reactivex/rxjava3/core/Flowable;", "getRtkKeepStatusEnable", "()Lio/reactivex/rxjava3/core/Flowable;", "inCleanup", "", "inSetup", "onUpdate", "rtkSystemState", "Ldji/v5/manager/aircraft/rtk/RTKSystemState;", "setRTKKeepStatusEnable", "Lio/reactivex/rxjava3/core/Completable;", "enabled", "android-sdk-v5-uxsdk_debug"})
public final class RTKKeepStatusWidgetModel extends dji.v5.ux.core.base.WidgetModel implements dji.v5.manager.aircraft.rtk.RTKSystemStateListener {
    private final dji.v5.manager.interfaces.IRTKCenter rtkCenter = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> isRTKKeepStatusEnabledProcessor = null;
    
    public RTKKeepStatusWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore uxKeyManager, @org.jetbrains.annotations.NotNull
    dji.v5.manager.interfaces.IRTKCenter rtkCenter) {
        super(null, null);
    }
    
    @java.lang.Override
    protected void inSetup() {
    }
    
    @java.lang.Override
    protected void inCleanup() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<java.lang.Boolean> getRtkKeepStatusEnable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Completable setRTKKeepStatusEnable(boolean enabled) {
        return null;
    }
    
    @java.lang.Override
    public void onUpdate(@org.jetbrains.annotations.Nullable
    dji.v5.manager.aircraft.rtk.RTKSystemState rtkSystemState) {
    }
}