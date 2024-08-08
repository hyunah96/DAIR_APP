package dji.v5.ux.cameracore.widget.cameracontrols.exposuresettings;

import java.lang.System;

/**
 * Class Description
 *
 * @author Hoker
 * @date 2021/11/2
 *
 * Copyright (c) 2021, DJI All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010*\u001a\u00020\u0011H\u0016J\b\u0010+\u001a\u00020)H\u0016J\b\u0010,\u001a\u00020-H\u0014J\b\u0010.\u001a\u00020-H\u0014J\u0006\u0010/\u001a\u000200J\u0006\u00101\u001a\u000200J\u000e\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0016J\u000e\u00105\u001a\u0002032\u0006\u00106\u001a\u00020\nJ\u0018\u00107\u001a\u00020-2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010(\u001a\u00020)H\u0016R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\fR\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000e0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\fR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\fR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\fR\u000e\u0010(\u001a\u00020)X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00068"}, d2 = {"Ldji/v5/ux/cameracore/widget/cameracontrols/exposuresettings/ISOAndEISettingModel;", "Ldji/v5/ux/core/base/WidgetModel;", "Ldji/v5/ux/core/base/ICameraIndex;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;)V", "ISOProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "Ldji/sdk/keyvalue/value/camera/CameraISO;", "getISOProcessor", "()Ldji/v5/ux/core/util/DataProcessor;", "ISORangeProcessor", "", "getISORangeProcessor", "cameraIndex", "Ldji/sdk/keyvalue/value/common/ComponentIndexType;", "cameraModeProcessor", "Ldji/sdk/keyvalue/value/camera/CameraWorkMode;", "getCameraModeProcessor", "eiRecommendedValueProcessor", "Ldji/sdk/keyvalue/value/camera/EIType;", "getEiRecommendedValueProcessor", "eiValueProcessor", "getEiValueProcessor", "eiValueRangeProcessor", "getEiValueRangeProcessor", "exposureModeProcessor", "Ldji/sdk/keyvalue/value/camera/CameraExposureMode;", "getExposureModeProcessor", "exposureSensitivityModeProcessor", "Ldji/sdk/keyvalue/value/camera/ExposureSensitivityMode;", "getExposureSensitivityModeProcessor", "exposureSettingsProcessor", "Ldji/sdk/keyvalue/value/camera/CameraExposureSettings;", "getExposureSettingsProcessor", "flatCameraModeProcessor", "Ldji/sdk/keyvalue/value/camera/CameraFlatMode;", "getFlatCameraModeProcessor", "lensType", "Ldji/sdk/keyvalue/value/common/CameraLensType;", "getCameraIndex", "getLensType", "inCleanup", "", "inSetup", "isEIEnable", "", "isRecordVideoEIMode", "setEI", "Lio/reactivex/rxjava3/core/Completable;", "ei", "setISO", "iso", "updateCameraSource", "android-sdk-v5-uxsdk_debug"})
public class ISOAndEISettingModel extends dji.v5.ux.core.base.WidgetModel implements dji.v5.ux.core.base.ICameraIndex {
    private dji.sdk.keyvalue.value.common.ComponentIndexType cameraIndex = dji.sdk.keyvalue.value.common.ComponentIndexType.LEFT_OR_MAIN;
    private dji.sdk.keyvalue.value.common.CameraLensType lensType = dji.sdk.keyvalue.value.common.CameraLensType.CAMERA_LENS_ZOOM;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.CameraExposureSettings> exposureSettingsProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.CameraISO> ISOProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<java.util.List<dji.sdk.keyvalue.value.camera.CameraISO>> ISORangeProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.ExposureSensitivityMode> exposureSensitivityModeProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.EIType> eiValueProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.EIType> eiRecommendedValueProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<java.util.List<dji.sdk.keyvalue.value.camera.EIType>> eiValueRangeProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.CameraExposureMode> exposureModeProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.CameraWorkMode> cameraModeProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.CameraFlatMode> flatCameraModeProcessor = null;
    
    public ISOAndEISettingModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.CameraExposureSettings> getExposureSettingsProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.CameraISO> getISOProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<java.util.List<dji.sdk.keyvalue.value.camera.CameraISO>> getISORangeProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.ExposureSensitivityMode> getExposureSensitivityModeProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.EIType> getEiValueProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.EIType> getEiRecommendedValueProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<java.util.List<dji.sdk.keyvalue.value.camera.EIType>> getEiValueRangeProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.CameraExposureMode> getExposureModeProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.CameraWorkMode> getCameraModeProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.CameraFlatMode> getFlatCameraModeProcessor() {
        return null;
    }
    
    @java.lang.Override
    protected void inSetup() {
    }
    
    @java.lang.Override
    protected void inCleanup() {
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
    public final io.reactivex.rxjava3.core.Completable setISO(@org.jetbrains.annotations.NotNull
    dji.sdk.keyvalue.value.camera.CameraISO iso) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Completable setEI(@org.jetbrains.annotations.NotNull
    dji.sdk.keyvalue.value.camera.EIType ei) {
        return null;
    }
    
    public final boolean isEIEnable() {
        return false;
    }
    
    public final boolean isRecordVideoEIMode() {
        return false;
    }
}