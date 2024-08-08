package dji.v5.ux.visualcamera.ndvi;

import java.lang.System;

/**
 * Class Description
 *
 * @author Hoker
 * @date 2022/11/29
 *
 * Copyright (c) 2022, DJI All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u000fH\u0014J\b\u0010\u0011\u001a\u00020\u000fH\u0014R\u001f\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000bR\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\r0\r0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Ldji/v5/ux/visualcamera/ndvi/SpectralDisplayModeWidgetModel;", "Ldji/v5/ux/core/base/CameraWidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;)V", "isSBSOnProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "", "kotlin.jvm.PlatformType", "()Ldji/v5/ux/core/util/DataProcessor;", "thermalDisplayModeProcessor", "Ldji/sdk/keyvalue/value/camera/ThermalDisplayMode;", "changeDisplayMode", "", "inCleanup", "inSetup", "android-sdk-v5-uxsdk_debug"})
public final class SpectralDisplayModeWidgetModel extends dji.v5.ux.core.base.CameraWidgetModel {
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> isSBSOnProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.ThermalDisplayMode> thermalDisplayModeProcessor = null;
    
    public SpectralDisplayModeWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> isSBSOnProcessor() {
        return null;
    }
    
    @java.lang.Override
    protected void inSetup() {
    }
    
    public final void changeDisplayMode() {
    }
    
    @java.lang.Override
    protected void inCleanup() {
    }
}