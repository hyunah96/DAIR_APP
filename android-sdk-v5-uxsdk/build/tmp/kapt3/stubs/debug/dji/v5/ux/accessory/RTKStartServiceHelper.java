package dji.v5.ux.accessory;

import java.lang.System;

/**
 * Description :用于实现自动重连RTK逻辑
 *
 * @author: Byte.Cai
 * date : 2022/8/16
 *
 * Copyright (c) 2022, DJI All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010!\u001a\u00020\nJ\b\u0010\"\u001a\u00020\nH\u0002J\u0010\u0010#\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\u001eJ\b\u0010%\u001a\u00020&H\u0002J\u0010\u0010\'\u001a\u00020&2\u0006\u0010(\u001a\u00020\nH\u0002J\u0010\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020\u0004H\u0002J\b\u0010+\u001a\u00020&H\u0002J\b\u0010,\u001a\u00020&H\u0002J\u0010\u0010,\u001a\u00020&2\u0006\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020&H\u0002J\u0010\u00100\u001a\u00020&2\b\b\u0002\u0010\u000f\u001a\u00020\nJ\b\u00101\u001a\u00020&H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0007*\u0004\u0018\u00010\u00150\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00188F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\n0\n0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Ldji/v5/ux/accessory/RTKStartServiceHelper;", "", "()V", "TAG", "", "cmccRtkManager", "Ldji/v5/manager/interfaces/INetworkRTKManager;", "kotlin.jvm.PlatformType", "customManager", "fcConnected", "", "handle", "Landroid/os/Handler;", "isHasStartRTK", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isStartByUser", "isStartRTKing", "productType", "Ldji/sdk/keyvalue/value/product/ProductType;", "qxRTKManager", "rtkCenter", "Ldji/v5/manager/interfaces/IRTKCenter;", "rtkDongleConnection", "rtkModuleAvailable", "Lio/reactivex/rxjava3/core/Flowable;", "getRtkModuleAvailable", "()Lio/reactivex/rxjava3/core/Flowable;", "rtkModuleAvailableProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "rtkSource", "Ldji/sdk/keyvalue/value/rtkbasestation/RTKReferenceStationSource;", "rtkSystemStateListener", "Ldji/v5/manager/aircraft/rtk/RTKSystemStateListener;", "isChannelB", "isNeedStartRtkNetworkService", "isNetworkRTK", "source", "observerRTKNoduleAvailable", "", "setStartRTKState", "isRTKStart", "showToast", "msg", "startCMCCRtkService", "startQxRtkService", "coordinateSystem", "Ldji/rtk/CoordinateSystem;", "startRtkCustomNetworkService", "startRtkService", "updateData", "android-sdk-v5-uxsdk_debug"})
public final class RTKStartServiceHelper {
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.accessory.RTKStartServiceHelper INSTANCE = null;
    private static final java.lang.String TAG = "RTKStartServiceHelper";
    private static final dji.v5.manager.interfaces.IRTKCenter rtkCenter = null;
    private static final dji.v5.manager.interfaces.INetworkRTKManager qxRTKManager = null;
    private static final dji.v5.manager.interfaces.INetworkRTKManager customManager = null;
    private static final dji.v5.manager.interfaces.INetworkRTKManager cmccRtkManager = null;
    private static boolean isStartByUser = false;
    private static dji.sdk.keyvalue.value.product.ProductType productType = dji.sdk.keyvalue.value.product.ProductType.UNKNOWN;
    private static boolean rtkDongleConnection = false;
    private static boolean fcConnected = false;
    private static final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> rtkModuleAvailableProcessor = null;
    private static dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource rtkSource = dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource.UNKNOWN;
    private static final java.util.concurrent.atomic.AtomicBoolean isStartRTKing = null;
    private static final java.util.concurrent.atomic.AtomicBoolean isHasStartRTK = null;
    private static final android.os.Handler handle = null;
    private static final dji.v5.manager.aircraft.rtk.RTKSystemStateListener rtkSystemStateListener = null;
    
    private RTKStartServiceHelper() {
        super();
    }
    
    private final void observerRTKNoduleAvailable() {
    }
    
    @kotlin.jvm.Synchronized
    private final synchronized void updateData() {
    }
    
    @kotlin.jvm.Synchronized
    public final synchronized void startRtkService(boolean isStartByUser) {
    }
    
    @kotlin.jvm.Synchronized
    private final synchronized void startCMCCRtkService() {
    }
    
    private final void showToast(java.lang.String msg) {
    }
    
    /**
     * 启动千寻RTK
     */
    @kotlin.jvm.Synchronized
    private final synchronized void startQxRtkService() {
    }
    
    private final void startQxRtkService(dji.rtk.CoordinateSystem coordinateSystem) {
    }
    
    /**
     * 从本地缓存中获取自定义网络RTK配置信息启动自定义网络RTK
     */
    @kotlin.jvm.Synchronized
    private final synchronized void startRtkCustomNetworkService() {
    }
    
    /**
     * 是否允许启动网络RTK （未判断网络数据模式）
     */
    private final boolean isNeedStartRtkNetworkService() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<java.lang.Boolean> getRtkModuleAvailable() {
        return null;
    }
    
    /**
     * 判断一个差分数据源是否是网络RTK
     */
    public final boolean isNetworkRTK(@org.jetbrains.annotations.Nullable
    dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource source) {
        return false;
    }
    
    /**
     * 是否为B控，非双控机型返回false
     */
    public final boolean isChannelB() {
        return false;
    }
    
    private final void setStartRTKState(boolean isRTKStart) {
    }
}