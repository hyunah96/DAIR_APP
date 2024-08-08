package dji.v5.ux.accessory;

import java.lang.System;

/**
 * Description :
 *
 * @author: Byte.Cai
 * date : 2022/8/15
 *
 * Copyright (c) 2022, DJI All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 72\u00020\u0001:\u00017B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001a0.2\u0006\u0010/\u001a\u00020\u001eH\u0002J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020\u001a0.2\u0006\u0010/\u001a\u00020\u001eH\u0002J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00142\u0006\u0010/\u001a\u00020\u001eH\u0002J\b\u00102\u001a\u000203H\u0014J\b\u00104\u001a\u000203H\u0014J\b\u00105\u001a\u00020\u001eH\u0002J\b\u00106\u001a\u000203H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u0017R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00138F\u00a2\u0006\u0006\u001a\u0004\b&\u0010\u0017R\u0014\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00140\u00138F\u00a2\u0006\u0006\u001a\u0004\b+\u0010\u0017R\u001a\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00140\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00068"}, d2 = {"Ldji/v5/ux/accessory/RTKTypeSwitchWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "uxKeyManager", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "areaCodeManager", "Ldji/v5/manager/interfaces/IAreaCodeManager;", "rtkCenter", "Ldji/v5/manager/interfaces/IRTKCenter;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;Ldji/v5/manager/interfaces/IAreaCodeManager;Ldji/v5/manager/interfaces/IRTKCenter;)V", "areaCodeChangeListener", "Ldji/v5/manager/areacode/AreaCodeChangeListener;", "getAreaCodeManager", "()Ldji/v5/manager/interfaces/IAreaCodeManager;", "areaCodeProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "", "coordinateSystemList", "Lio/reactivex/rxjava3/core/Flowable;", "", "Ldji/rtk/CoordinateSystem;", "getCoordinateSystemList", "()Lio/reactivex/rxjava3/core/Flowable;", "coordinateSystemListProcessor", "currentRtkSource", "Ldji/sdk/keyvalue/value/rtkbasestation/RTKReferenceStationSource;", "customNetworkRTKManager", "Ldji/v5/manager/interfaces/INetworkRTKManager;", "isMotorOnProcessor", "", "isMotorsOn", "productTypeProcessor", "Ldji/sdk/keyvalue/value/product/ProductType;", "qxRTKManager", "getRtkCenter", "()Ldji/v5/manager/interfaces/IRTKCenter;", "rtkSource", "getRtkSource", "rtkSourceProcessor", "rtkSystemStateListener", "Ldji/v5/manager/aircraft/rtk/RTKSystemStateListener;", "supportReferenceStationList", "getSupportReferenceStationList", "supportReferenceStationListProcessor", "getDefaultSupportReferenceStationSource", "", "supportNetworkRTK", "getMavicSupportReferenceStationSource", "getSupportReferenceStationSource", "inCleanup", "", "inSetup", "isInChina", "updateSupportReferenceStationList", "Companion", "android-sdk-v5-uxsdk_debug"})
public final class RTKTypeSwitchWidgetModel extends dji.v5.ux.core.base.WidgetModel {
    @org.jetbrains.annotations.NotNull
    private final dji.v5.manager.interfaces.IAreaCodeManager areaCodeManager = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.manager.interfaces.IRTKCenter rtkCenter = null;
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.accessory.RTKTypeSwitchWidgetModel.Companion Companion = null;
    private static final java.lang.String TAG = "RTKTypeSwitchWidgetModel";
    private static final java.lang.String CUSTOM_RTK_SETTING_CACHE = "customRTKSettingCache";
    private final dji.v5.ux.core.util.DataProcessor<java.util.List<dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource>> supportReferenceStationListProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.String> areaCodeProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.product.ProductType> productTypeProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource> rtkSourceProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.util.List<dji.rtk.CoordinateSystem>> coordinateSystemListProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> isMotorOnProcessor = null;
    private dji.v5.manager.interfaces.INetworkRTKManager qxRTKManager;
    private dji.v5.manager.interfaces.INetworkRTKManager customNetworkRTKManager;
    private dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource currentRtkSource = dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource.UNKNOWN;
    private final dji.v5.manager.areacode.AreaCodeChangeListener areaCodeChangeListener = null;
    private final dji.v5.manager.aircraft.rtk.RTKSystemStateListener rtkSystemStateListener = null;
    
    public RTKTypeSwitchWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore uxKeyManager, @org.jetbrains.annotations.NotNull
    dji.v5.manager.interfaces.IAreaCodeManager areaCodeManager, @org.jetbrains.annotations.NotNull
    dji.v5.manager.interfaces.IRTKCenter rtkCenter) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.manager.interfaces.IAreaCodeManager getAreaCodeManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.manager.interfaces.IRTKCenter getRtkCenter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<java.lang.Boolean> isMotorsOn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource> getRtkSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<java.util.List<dji.rtk.CoordinateSystem>> getCoordinateSystemList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<java.util.List<dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource>> getSupportReferenceStationList() {
        return null;
    }
    
    @java.lang.Override
    protected void inSetup() {
    }
    
    @java.lang.Override
    protected void inCleanup() {
    }
    
    private final void updateSupportReferenceStationList() {
    }
    
    /**
     * 获取支持的差分数据源
     */
    private final java.util.List<dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource> getSupportReferenceStationSource(boolean supportNetworkRTK) {
        return null;
    }
    
    private final java.util.List<dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource> getMavicSupportReferenceStationSource(boolean supportNetworkRTK) {
        return null;
    }
    
    private final java.util.List<dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource> getDefaultSupportReferenceStationSource(boolean supportNetworkRTK) {
        return null;
    }
    
    /**
     * 是否在中国
     */
    private final boolean isInChina() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Ldji/v5/ux/accessory/RTKTypeSwitchWidgetModel$Companion;", "", "()V", "CUSTOM_RTK_SETTING_CACHE", "", "TAG", "android-sdk-v5-uxsdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}