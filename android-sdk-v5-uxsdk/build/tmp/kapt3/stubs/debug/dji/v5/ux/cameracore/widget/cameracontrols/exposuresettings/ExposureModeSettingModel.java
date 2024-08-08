package dji.v5.ux.cameracore.widget.cameracontrols.exposuresettings;

import java.lang.System;

/**
 * Class Description
 *
 * @author Hoker
 * @date 2021/10/19
 *
 * Copyright (c) 2021, DJI All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0014\u001a\u00020\tH\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0017H\u0014J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\fJ\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u001d\u001a\u00020\u0017H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00100\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Ldji/v5/ux/cameracore/widget/cameracontrols/exposuresettings/ExposureModeSettingModel;", "Ldji/v5/ux/core/base/WidgetModel;", "Ldji/v5/ux/core/base/ICameraIndex;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;)V", "cameraIndex", "Ldji/sdk/keyvalue/value/common/ComponentIndexType;", "exposureModeProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "Ldji/sdk/keyvalue/value/camera/CameraExposureMode;", "getExposureModeProcessor", "()Ldji/v5/ux/core/util/DataProcessor;", "exposureModeRangeProcessor", "", "getExposureModeRangeProcessor", "lensType", "Ldji/sdk/keyvalue/value/common/CameraLensType;", "getCameraIndex", "getLensType", "inCleanup", "", "inSetup", "setExposureMode", "Lio/reactivex/rxjava3/core/Completable;", "mode", "updateCameraSource", "updateStates", "android-sdk-v5-uxsdk_debug"})
public class ExposureModeSettingModel extends dji.v5.ux.core.base.WidgetModel implements dji.v5.ux.core.base.ICameraIndex {
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.CameraExposureMode> exposureModeProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<java.util.List<dji.sdk.keyvalue.value.camera.CameraExposureMode>> exposureModeRangeProcessor = null;
    private dji.sdk.keyvalue.value.common.ComponentIndexType cameraIndex = dji.sdk.keyvalue.value.common.ComponentIndexType.LEFT_OR_MAIN;
    private dji.sdk.keyvalue.value.common.CameraLensType lensType = dji.sdk.keyvalue.value.common.CameraLensType.CAMERA_LENS_ZOOM;
    
    public ExposureModeSettingModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.CameraExposureMode> getExposureModeProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<java.util.List<dji.sdk.keyvalue.value.camera.CameraExposureMode>> getExposureModeRangeProcessor() {
        return null;
    }
    
    @java.lang.Override
    protected void inSetup() {
    }
    
    @java.lang.Override
    protected void inCleanup() {
    }
    
    @java.lang.Override
    protected void updateStates() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dji.sdk.keyvalue.value.common.ComponentIndexType getCameraIndex() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dji.sdk.keyvalue.value.common.CameraLensType getLensType() {
        return null;
    }
    
    @java.lang.Override
    public void updateCameraSource(@org.jetbrains.annotations.NotNull
    dji.sdk.keyvalue.value.common.ComponentIndexType cameraIndex, @org.jetbrains.annotations.NotNull
    dji.sdk.keyvalue.value.common.CameraLensType lensType) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Completable setExposureMode(@org.jetbrains.annotations.NotNull
    dji.sdk.keyvalue.value.camera.CameraExposureMode mode) {
        return null;
    }
}