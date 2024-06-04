package dji.v5.ux.gimbal;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0014J\b\u0010\u0018\u001a\u00020\u0012H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u001aH\u0014J\u0006\u0010\u001c\u001a\u00020\u0016J\u0006\u0010\u001d\u001a\u00020\u001aJ\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Ldji/v5/ux/gimbal/GimbalSettingWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "Ldji/v5/ux/core/base/IGimbalIndex;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "uxKeyManager", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;)V", "areMotorsOnProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "", "calibrationStatusProcessor", "Ldji/sdk/keyvalue/value/gimbal/GimbalCalibrationStatusInfo;", "gimbalAdjust", "Ldji/v5/ux/core/communication/UXKey;", "getGimbalAdjust", "()Ldji/v5/ux/core/communication/UXKey;", "gimbalIndex", "Ldji/v5/ux/core/util/SettingDefinitions$GimbalIndex;", "areMotorsOn", "Lio/reactivex/rxjava3/core/Flowable;", "calibrateGimbal", "Lio/reactivex/rxjava3/core/Completable;", "calibrationStatus", "getGimbalIndex", "inCleanup", "", "inSetup", "resetGimbal", "setGimbalClicked", "updateGimbalIndex", "android-sdk-v5-uxsdk_debug"})
public class GimbalSettingWidgetModel extends dji.v5.ux.core.base.WidgetModel implements dji.v5.ux.core.base.IGimbalIndex {
    private dji.v5.ux.core.util.SettingDefinitions.GimbalIndex gimbalIndex = dji.v5.ux.core.util.SettingDefinitions.GimbalIndex.PORT;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.gimbal.GimbalCalibrationStatusInfo> calibrationStatusProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.communication.UXKey gimbalAdjust = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> areMotorsOnProcessor = null;
    
    public GimbalSettingWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore uxKeyManager) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.communication.UXKey getGimbalAdjust() {
        return null;
    }
    
    @java.lang.Override
    protected void inSetup() {
    }
    
    @java.lang.Override
    protected void inCleanup() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Completable resetGimbal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Completable calibrateGimbal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.sdk.keyvalue.value.gimbal.GimbalCalibrationStatusInfo> calibrationStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<java.lang.Boolean> areMotorsOn() {
        return null;
    }
    
    public final void setGimbalClicked() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dji.v5.ux.core.util.SettingDefinitions.GimbalIndex getGimbalIndex() {
        return null;
    }
    
    @java.lang.Override
    public void updateGimbalIndex(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.util.SettingDefinitions.GimbalIndex gimbalIndex) {
    }
}