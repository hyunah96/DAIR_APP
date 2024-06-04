package dji.v5.ux.cameracore.widget.cameracontrols.lenscontrol;

import java.lang.System;

/**
 * Class Description
 *
 * @author Hoker
 * @date 2021/12/13
 *
 * Copyright (c) 2021, DJI All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0012H\u0014J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nJ\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f\u00a8\u0006\u001c"}, d2 = {"Ldji/v5/ux/cameracore/widget/cameracontrols/lenscontrol/LensControlModel;", "Ldji/v5/ux/core/base/CameraWidgetModel;", "Ldji/v5/ux/core/base/ICameraIndex;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;)V", "cameraVideoStreamSourceProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "Ldji/sdk/keyvalue/value/camera/CameraVideoStreamSourceType;", "getCameraVideoStreamSourceProcessor", "()Ldji/v5/ux/core/util/DataProcessor;", "cameraVideoStreamSourceRangeProcessor", "", "properCameraVideoStreamSourceRangeProcessor", "getProperCameraVideoStreamSourceRangeProcessor", "inCleanup", "", "inSetup", "setCameraVideoStreamSource", "Lio/reactivex/rxjava3/core/Completable;", "source", "updateCameraSource", "cameraIndex", "Ldji/sdk/keyvalue/value/common/ComponentIndexType;", "lensType", "Ldji/sdk/keyvalue/value/common/CameraLensType;", "android-sdk-v5-uxsdk_debug"})
public class LensControlModel extends dji.v5.ux.core.base.CameraWidgetModel implements dji.v5.ux.core.base.ICameraIndex {
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.CameraVideoStreamSourceType> cameraVideoStreamSourceProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.util.List<dji.sdk.keyvalue.value.camera.CameraVideoStreamSourceType>> cameraVideoStreamSourceRangeProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<java.util.List<dji.sdk.keyvalue.value.camera.CameraVideoStreamSourceType>> properCameraVideoStreamSourceRangeProcessor = null;
    
    public LensControlModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.CameraVideoStreamSourceType> getCameraVideoStreamSourceProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<java.util.List<dji.sdk.keyvalue.value.camera.CameraVideoStreamSourceType>> getProperCameraVideoStreamSourceRangeProcessor() {
        return null;
    }
    
    @java.lang.Override
    public void updateCameraSource(@org.jetbrains.annotations.NotNull
    dji.sdk.keyvalue.value.common.ComponentIndexType cameraIndex, @org.jetbrains.annotations.NotNull
    dji.sdk.keyvalue.value.common.CameraLensType lensType) {
    }
    
    @java.lang.Override
    protected void inSetup() {
    }
    
    @java.lang.Override
    protected void inCleanup() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Completable setCameraVideoStreamSource(@org.jetbrains.annotations.NotNull
    dji.sdk.keyvalue.value.camera.CameraVideoStreamSourceType source) {
        return null;
    }
}