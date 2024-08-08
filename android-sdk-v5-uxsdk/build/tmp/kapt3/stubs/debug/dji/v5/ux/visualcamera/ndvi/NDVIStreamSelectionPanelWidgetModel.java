package dji.v5.ux.visualcamera.ndvi;

import java.lang.System;

/**
 * Class Description
 *
 * @author Hoker
 * @date 2022/12/1
 *
 * Copyright (c) 2022, DJI All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010$\u001a\u00020%H\u0014J\b\u0010&\u001a\u00020%H\u0014J\u000e\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0013J\u000e\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020\u0016J\u0010\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020\u0010H\u0002J\u0010\u0010.\u001a\u00020%2\u0006\u0010-\u001a\u00020\rH\u0002J\b\u0010/\u001a\u00020%H\u0002R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\b\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u000b\u00a8\u00060"}, d2 = {"Ldji/v5/ux/visualcamera/ndvi/NDVIStreamSelectionPanelWidgetModel;", "Ldji/v5/ux/core/base/CameraWidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;)V", "cameraModeDataProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "Ldji/sdk/keyvalue/value/camera/CameraMode;", "getCameraModeDataProcessor", "()Ldji/v5/ux/core/util/DataProcessor;", "cameraMultiSpectralFusionTypeProcessor", "Ldji/sdk/keyvalue/value/camera/MultiSpectralFusionType;", "getCameraMultiSpectralFusionTypeProcessor", "cameraVideoStreamSourceProcessor", "Ldji/sdk/keyvalue/value/camera/CameraVideoStreamSourceType;", "getCameraVideoStreamSourceProcessor", "currentNarrowBandModelProcessor", "Ldji/v5/ux/visualcamera/ndvi/StreamPanelUtil$NarrowBandModel;", "getCurrentNarrowBandModelProcessor", "currentVegetationModelProcessor", "Ldji/v5/ux/visualcamera/ndvi/StreamPanelUtil$VegetationModel;", "getCurrentVegetationModelProcessor", "isEnableProcessor", "", "isShootingContinuousPhotosProcessor", "isShootingVisionPanoramaPhotoProcessor", "narrowBandModelList", "", "getNarrowBandModelList", "()Ljava/util/List;", "vegetationModelList", "getVegetationModelList", "visibleNarrowBandModeProcessor", "getVisibleNarrowBandModeProcessor", "inCleanup", "", "inSetup", "setNarrowBandModel", "Lio/reactivex/rxjava3/core/Completable;", "narrowBandModel", "setVegetationModel", "model", "updateCurrentNarrowBandModelPosition", "type", "updateCurrentVegetationModelPosition", "updateEnable", "android-sdk-v5-uxsdk_debug"})
public final class NDVIStreamSelectionPanelWidgetModel extends dji.v5.ux.core.base.CameraWidgetModel {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<dji.v5.ux.visualcamera.ndvi.StreamPanelUtil.NarrowBandModel> narrowBandModelList = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.CameraVideoStreamSourceType> cameraVideoStreamSourceProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.visualcamera.ndvi.StreamPanelUtil.NarrowBandModel> currentNarrowBandModelProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.CameraMode> cameraModeDataProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> visibleNarrowBandModeProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<dji.v5.ux.visualcamera.ndvi.StreamPanelUtil.VegetationModel> vegetationModelList = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.MultiSpectralFusionType> cameraMultiSpectralFusionTypeProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.visualcamera.ndvi.StreamPanelUtil.VegetationModel> currentVegetationModelProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> isShootingContinuousPhotosProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> isShootingVisionPanoramaPhotoProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> isEnableProcessor = null;
    
    public NDVIStreamSelectionPanelWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<dji.v5.ux.visualcamera.ndvi.StreamPanelUtil.NarrowBandModel> getNarrowBandModelList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.CameraVideoStreamSourceType> getCameraVideoStreamSourceProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.visualcamera.ndvi.StreamPanelUtil.NarrowBandModel> getCurrentNarrowBandModelProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.CameraMode> getCameraModeDataProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> getVisibleNarrowBandModeProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<dji.v5.ux.visualcamera.ndvi.StreamPanelUtil.VegetationModel> getVegetationModelList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.MultiSpectralFusionType> getCameraMultiSpectralFusionTypeProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.visualcamera.ndvi.StreamPanelUtil.VegetationModel> getCurrentVegetationModelProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> isShootingContinuousPhotosProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> isShootingVisionPanoramaPhotoProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> isEnableProcessor() {
        return null;
    }
    
    @java.lang.Override
    protected void inSetup() {
    }
    
    private final void updateCurrentNarrowBandModelPosition(dji.sdk.keyvalue.value.camera.CameraVideoStreamSourceType type) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Completable setNarrowBandModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.visualcamera.ndvi.StreamPanelUtil.NarrowBandModel narrowBandModel) {
        return null;
    }
    
    private final void updateCurrentVegetationModelPosition(dji.sdk.keyvalue.value.camera.MultiSpectralFusionType type) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Completable setVegetationModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.visualcamera.ndvi.StreamPanelUtil.VegetationModel model) {
        return null;
    }
    
    private final void updateEnable() {
    }
    
    @java.lang.Override
    protected void inCleanup() {
    }
}