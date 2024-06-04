package dji.v5.ux.core.util;

import java.lang.System;

/**
 * Contains util methods for android devices made by DJI
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007\u00a8\u0006\b"}, d2 = {"Ldji/v5/ux/core/util/DJIDeviceUtil;", "", "()V", "getDJIDeviceType", "Ldji/v5/ux/core/util/DJIDeviceType;", "isDJIDevice", "", "isSmartController", "android-sdk-v5-uxsdk_debug"})
public final class DJIDeviceUtil {
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.core.util.DJIDeviceUtil INSTANCE = null;
    
    private DJIDeviceUtil() {
        super();
    }
    
    /**
     * Whether the current device is made by DJI
     */
    @kotlin.jvm.JvmStatic
    public static final boolean isDJIDevice() {
        return false;
    }
    
    /**
     * Whether the current device is a smart controller
     */
    @kotlin.jvm.JvmStatic
    public static final boolean isSmartController() {
        return false;
    }
    
    /**
     * Get the current device type
     */
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmStatic
    public static final dji.v5.ux.core.util.DJIDeviceType getDJIDeviceType() {
        return null;
    }
}