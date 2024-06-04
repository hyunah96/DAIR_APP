package dji.v5.ux.core.base;

import java.lang.System;

/**
 * Class Description
 *
 * @author Hoker
 * @date 2021/10/20
 *
 * Copyright (c) 2021, DJI All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H&\u00a8\u0006\n"}, d2 = {"Ldji/v5/ux/core/base/ICameraIndex;", "", "getCameraIndex", "Ldji/sdk/keyvalue/value/common/ComponentIndexType;", "getLensType", "Ldji/sdk/keyvalue/value/common/CameraLensType;", "updateCameraSource", "", "cameraIndex", "lensType", "android-sdk-v5-uxsdk_debug"})
public abstract interface ICameraIndex {
    
    /**
     * Get the camera index for which the model is reacting.
     *
     * @return int representing [ComponentIndexType].
     */
    @org.jetbrains.annotations.NotNull
    public abstract dji.sdk.keyvalue.value.common.ComponentIndexType getCameraIndex();
    
    /**
     * Get the current type of the lens the widget model is reacting to
     *
     * @return current lens type.
     */
    @org.jetbrains.annotations.NotNull
    public abstract dji.sdk.keyvalue.value.common.CameraLensType getLensType();
    
    /**
     * Update camera/lens index to which the model should react.
     *
     * @param cameraIndex index of the camera.
     * @param lensType index of the lens.
     */
    public abstract void updateCameraSource(@org.jetbrains.annotations.NotNull
    dji.sdk.keyvalue.value.common.ComponentIndexType cameraIndex, @org.jetbrains.annotations.NotNull
    dji.sdk.keyvalue.value.common.CameraLensType lensType);
}