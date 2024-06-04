package dji.v5.ux.core.extension;

import java.lang.System;

@kotlin.jvm.JvmName(name = "CameraExtensions")
@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0002\u00a8\u0006\u0007"}, d2 = {"isPictureMode", "", "Ldji/sdk/keyvalue/value/camera/CameraMode;", "toFlatCameraMode", "Ldji/sdk/keyvalue/value/camera/CameraFlatMode;", "Ldji/sdk/keyvalue/value/camera/CameraShootPhotoMode;", "toShootPhotoMode", "android-sdk-v5-uxsdk_debug"})
public final class CameraExtensions {
    
    /**
     * Convert [CameraFlatMode] to [CameraShootPhotoMode]
     */
    @org.jetbrains.annotations.NotNull
    public static final dji.sdk.keyvalue.value.camera.CameraShootPhotoMode toShootPhotoMode(@org.jetbrains.annotations.NotNull
    dji.sdk.keyvalue.value.camera.CameraMode $this$toShootPhotoMode) {
        return null;
    }
    
    /**
     * Convert [CameraShootPhotoMode] to [CameraFlatMode]
     */
    @org.jetbrains.annotations.NotNull
    public static final dji.sdk.keyvalue.value.camera.CameraFlatMode toFlatCameraMode(@org.jetbrains.annotations.NotNull
    dji.sdk.keyvalue.value.camera.CameraShootPhotoMode $this$toFlatCameraMode) {
        return null;
    }
    
    /**
     * Check if flat camera mode is picture mode
     */
    public static final boolean isPictureMode(@org.jetbrains.annotations.NotNull
    dji.sdk.keyvalue.value.camera.CameraMode $this$isPictureMode) {
        return false;
    }
}