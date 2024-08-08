package dji.v5.ux.core.widget.fpv;

import java.lang.System;

/**
 * Widget Model for the [FPVWidget] used to define
 * the underlying logic and communication
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u00108\u001a\u00020\u0012H\u0016J\b\u00109\u001a\u00020\u0014H\u0016J\n\u0010:\u001a\u0004\u0018\u00010;H\u0002J\b\u0010<\u001a\u00020=H\u0014J\b\u0010>\u001a\u00020=H\u0014J\u0006\u0010?\u001a\u00020=J\b\u0010@\u001a\u00020=H\u0002J\b\u0010A\u001a\u00020=H\u0002J\b\u0010B\u001a\u00020=H\u0002J\u0018\u0010C\u001a\u00020=2\u0006\u0010D\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u0014H\u0016J\b\u0010F\u001a\u00020=H\u0016R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168G\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000eR(\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u001f\u001a\u0004\u0018\u00010 @FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001f\u0010&\u001a\u0010\u0012\f\u0012\n (*\u0004\u0018\u00010\'0\'0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u000eR\u001c\u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u000201X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010\u000e\u00a8\u0006G"}, d2 = {"Ldji/v5/ux/core/widget/fpv/FPVWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "Ldji/v5/ux/core/base/ICameraIndex;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "flatCameraModule", "Ldji/v5/ux/core/module/FlatCameraModule;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;Ldji/v5/ux/core/module/FlatCameraModule;)V", "cameraNameProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "", "getCameraNameProcessor", "()Ldji/v5/ux/core/util/DataProcessor;", "cameraSideProcessor", "getCameraSideProcessor", "currentCameraIndex", "Ldji/sdk/keyvalue/value/common/ComponentIndexType;", "currentLensType", "Ldji/sdk/keyvalue/value/common/CameraLensType;", "hasVideoViewChanged", "Lio/reactivex/rxjava3/core/Flowable;", "", "()Lio/reactivex/rxjava3/core/Flowable;", "orientationProcessor", "Ldji/sdk/keyvalue/value/camera/CameraOrientation;", "getOrientationProcessor", "resolutionAndFrameRateProcessor", "Ldji/sdk/keyvalue/value/camera/VideoResolutionFrameRate;", "getResolutionAndFrameRateProcessor", "value", "Ldji/v5/common/video/stream/StreamSource;", "streamSource", "getStreamSource", "()Ldji/v5/common/video/stream/StreamSource;", "setStreamSource", "(Ldji/v5/common/video/stream/StreamSource;)V", "streamSourceCameraTypeProcessor", "Ldji/sdk/keyvalue/value/camera/CameraVideoStreamSourceType;", "kotlin.jvm.PlatformType", "getStreamSourceCameraTypeProcessor", "streamSourceListener", "Ldji/v5/ux/core/widget/fpv/FPVStreamSourceListener;", "getStreamSourceListener", "()Ldji/v5/ux/core/widget/fpv/FPVStreamSourceListener;", "setStreamSourceListener", "(Ldji/v5/ux/core/widget/fpv/FPVStreamSourceListener;)V", "videoChannelType", "Ldji/v5/common/video/channel/VideoChannelType;", "getVideoChannelType", "()Ldji/v5/common/video/channel/VideoChannelType;", "setVideoChannelType", "(Ldji/v5/common/video/channel/VideoChannelType;)V", "videoViewChangedProcessor", "getVideoViewChangedProcessor", "getCameraIndex", "getLensType", "getVideoChannel", "Ldji/v5/common/video/interfaces/IVideoChannel;", "inCleanup", "", "inSetup", "initStreamSource", "onStreamSourceUpdated", "sourceUpdate", "updateCameraDisplay", "updateCameraSource", "cameraIndex", "lensType", "updateStates", "android-sdk-v5-uxsdk_debug"})
public final class FPVWidgetModel extends dji.v5.ux.core.base.WidgetModel implements dji.v5.ux.core.base.ICameraIndex {
    private final dji.v5.ux.core.module.FlatCameraModule flatCameraModule = null;
    private dji.sdk.keyvalue.value.common.CameraLensType currentLensType = dji.sdk.keyvalue.value.common.CameraLensType.CAMERA_LENS_DEFAULT;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.CameraVideoStreamSourceType> streamSourceCameraTypeProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.CameraOrientation> orientationProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.VideoResolutionFrameRate> resolutionAndFrameRateProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<java.lang.String> cameraNameProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<java.lang.String> cameraSideProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> videoViewChangedProcessor = null;
    @org.jetbrains.annotations.Nullable
    private dji.v5.ux.core.widget.fpv.FPVStreamSourceListener streamSourceListener;
    @org.jetbrains.annotations.NotNull
    private dji.v5.common.video.channel.VideoChannelType videoChannelType = dji.v5.common.video.channel.VideoChannelType.PRIMARY_STREAM_CHANNEL;
    
    /**
     * The current camera index. This value should only be used for video size calculation.
     * To get the camera side, use [FPVWidgetModel.cameraSide] instead.
     */
    private dji.sdk.keyvalue.value.common.ComponentIndexType currentCameraIndex = dji.sdk.keyvalue.value.common.ComponentIndexType.LEFT_OR_MAIN;
    @org.jetbrains.annotations.Nullable
    private dji.v5.common.video.stream.StreamSource streamSource;
    
    public FPVWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.module.FlatCameraModule flatCameraModule) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.CameraVideoStreamSourceType> getStreamSourceCameraTypeProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.CameraOrientation> getOrientationProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.VideoResolutionFrameRate> getResolutionAndFrameRateProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<java.lang.String> getCameraNameProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<java.lang.String> getCameraSideProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> getVideoViewChangedProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final dji.v5.ux.core.widget.fpv.FPVStreamSourceListener getStreamSourceListener() {
        return null;
    }
    
    public final void setStreamSourceListener(@org.jetbrains.annotations.Nullable
    dji.v5.ux.core.widget.fpv.FPVStreamSourceListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.common.video.channel.VideoChannelType getVideoChannelType() {
        return null;
    }
    
    public final void setVideoChannelType(@org.jetbrains.annotations.NotNull
    dji.v5.common.video.channel.VideoChannelType p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final dji.v5.common.video.stream.StreamSource getStreamSource() {
        return null;
    }
    
    public final void setStreamSource(@org.jetbrains.annotations.Nullable
    dji.v5.common.video.stream.StreamSource value) {
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmName(name = "hasVideoViewChanged")
    public final io.reactivex.rxjava3.core.Flowable<java.lang.Boolean> hasVideoViewChanged() {
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
    
    public final void initStreamSource() {
    }
    
    @java.lang.Override
    protected void inSetup() {
    }
    
    @java.lang.Override
    protected void inCleanup() {
    }
    
    private final void sourceUpdate() {
    }
    
    @java.lang.Override
    public void updateStates() {
    }
    
    private final void updateCameraDisplay() {
    }
    
    private final void onStreamSourceUpdated() {
    }
    
    private final dji.v5.common.video.interfaces.IVideoChannel getVideoChannel() {
        return null;
    }
}