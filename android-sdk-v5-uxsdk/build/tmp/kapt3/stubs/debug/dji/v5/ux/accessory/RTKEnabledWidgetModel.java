package dji.v5.ux.accessory;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0019H\u0014J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\tJ\b\u0010\u001e\u001a\u00020\u0019H\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\b8G\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u000b\u00a8\u0006\u001f"}, d2 = {"Ldji/v5/ux/accessory/RTKEnabledWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;)V", "canEnableRTK", "Lio/reactivex/rxjava3/core/Flowable;", "", "getCanEnableRTK", "()Lio/reactivex/rxjava3/core/Flowable;", "canEnableRTKProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "homePointDataSourceProcessor", "Ldji/sdk/keyvalue/value/rtkmobilestation/RTKHomePointInfo;", "isMotorOnProcessor", "isRTKEnabledKey", "Ldji/sdk/keyvalue/key/DJIKey;", "isRTKEnabledProcessor", "isRTKTakeoffHeightSetProcessor", "Ldji/sdk/keyvalue/value/rtkmobilestation/RTKTakeoffAltitudeInfo;", "rtkEnabled", "getRTKEnabled", "inCleanup", "", "inSetup", "setRTKEnabled", "Lio/reactivex/rxjava3/core/Completable;", "enabled", "updateStates", "android-sdk-v5-uxsdk_debug"})
public final class RTKEnabledWidgetModel extends dji.v5.ux.core.base.WidgetModel {
    private final dji.sdk.keyvalue.key.DJIKey<java.lang.Boolean> isRTKEnabledKey = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> isRTKEnabledProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> isMotorOnProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.rtkmobilestation.RTKHomePointInfo> homePointDataSourceProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.rtkmobilestation.RTKTakeoffAltitudeInfo> isRTKTakeoffHeightSetProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> canEnableRTKProcessor = null;
    
    public RTKEnabledWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmName(name = "getRTKEnabled")
    public final io.reactivex.rxjava3.core.Flowable<java.lang.Boolean> getRTKEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<java.lang.Boolean> getCanEnableRTK() {
        return null;
    }
    
    @java.lang.Override
    protected void inSetup() {
    }
    
    @java.lang.Override
    protected void inCleanup() {
    }
    
    /**
     * RTK能否开启，这里捆绑了几个逻辑：
     * 1、只有在电机关闭时才可以设置RTK开启/关闭状态；
     * 2、如果电机已开启，则需要飞行高度已设置+返航点的类型设置为RTK，这时才可以开启/关闭RTK
     */
    @java.lang.Override
    protected void updateStates() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Completable setRTKEnabled(boolean enabled) {
        return null;
    }
}