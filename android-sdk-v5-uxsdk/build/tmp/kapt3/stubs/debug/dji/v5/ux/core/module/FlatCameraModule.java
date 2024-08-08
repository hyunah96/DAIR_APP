package dji.v5.ux.core.module;

import java.lang.System;

/**
 * Abstraction for getting and setting camera mode and photo mode.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0016J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\bJ\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J\u0018\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\n\u00a8\u0006!"}, d2 = {"Ldji/v5/ux/core/module/FlatCameraModule;", "Ldji/v5/ux/core/base/BaseModule;", "Ldji/v5/ux/core/base/ICameraIndex;", "()V", "cameraIndex", "Ldji/sdk/keyvalue/value/common/ComponentIndexType;", "cameraModeDataProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "Ldji/sdk/keyvalue/value/camera/CameraMode;", "getCameraModeDataProcessor", "()Ldji/v5/ux/core/util/DataProcessor;", "isFlatCameraModeSupportedDataProcessor", "", "lensType", "Ldji/sdk/keyvalue/value/common/CameraLensType;", "shootPhotoModeProcessor", "Ldji/sdk/keyvalue/value/camera/CameraShootPhotoMode;", "getShootPhotoModeProcessor", "cleanup", "", "getCameraIndex", "getLensType", "setCameraMode", "Lio/reactivex/rxjava3/core/Completable;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "cameraMode", "setup", "widgetModel", "Ldji/v5/ux/core/base/WidgetModel;", "updateCameraSource", "updateModes", "flatCameraMode", "android-sdk-v5-uxsdk_debug"})
public final class FlatCameraModule extends dji.v5.ux.core.base.BaseModule implements dji.v5.ux.core.base.ICameraIndex {
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> isFlatCameraModeSupportedDataProcessor = null;
    private dji.sdk.keyvalue.value.common.ComponentIndexType cameraIndex = dji.sdk.keyvalue.value.common.ComponentIndexType.LEFT_OR_MAIN;
    private dji.sdk.keyvalue.value.common.CameraLensType lensType = dji.sdk.keyvalue.value.common.CameraLensType.CAMERA_LENS_ZOOM;
    
    /**
     * The camera mode.
     */
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.CameraMode> cameraModeDataProcessor = null;
    
    /**
     * The shoot photo mode.
     */
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.CameraShootPhotoMode> shootPhotoModeProcessor = null;
    
    public FlatCameraModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.CameraMode> getCameraModeDataProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.CameraShootPhotoMode> getShootPhotoModeProcessor() {
        return null;
    }
    
    @java.lang.Override
    protected void setup(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.WidgetModel widgetModel) {
    }
    
    @java.lang.Override
    protected void cleanup() {
    }
    
    /**
     * Set camera mode
     *
     * @return Completable
     */
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Completable setCameraMode(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.sdk.keyvalue.value.camera.CameraMode cameraMode) {
        return null;
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
    
    private final void updateModes(dji.sdk.keyvalue.value.camera.CameraMode flatCameraMode) {
    }
}