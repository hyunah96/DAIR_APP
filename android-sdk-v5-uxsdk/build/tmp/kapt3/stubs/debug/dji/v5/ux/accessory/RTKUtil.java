package dji.v5.ux.accessory;

import java.lang.System;

/**
 * Description :
 *
 * @author: Byte.Cai
 * date : 2022/5/24
 *
 * Copyright (c) 2022, DJI All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\nJ\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Ldji/v5/ux/accessory/RTKUtil;", "", "()V", "TAG", "", "USER_RTK_NETWORK_COORDINATE_SYSTEM_CMCC", "USER_RTK_NETWORK_COORDINATE_SYSTEM_QX", "USER_RTK_NETWORK_SERVICE_SETTINGS", "USER_RTK_REFERENCE_SOURCE", "getCoordinateName", "Ldji/rtk/CoordinateSystem;", "value", "getNetRTKCoordinateSystem", "rtkReferenceStationSource", "Ldji/sdk/keyvalue/value/rtkbasestation/RTKReferenceStationSource;", "getRTKStatusName", "view", "Landroid/view/View;", "positioningSolution", "Ldji/sdk/keyvalue/value/rtkmobilestation/RTKPositioningSolution;", "getRTKTypeName", "getRtkCustomNetworkSetting", "Ldji/sdk/keyvalue/value/rtkbasestation/RTKCustomNetworkSetting;", "saveRTKCoordinateSystem", "", "coordinateSystem", "saveRtkCustomNetworkSetting", "settings", "android-sdk-v5-uxsdk_debug"})
public final class RTKUtil {
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.accessory.RTKUtil INSTANCE = null;
    private static final java.lang.String TAG = "RTKUtil";
    private static final java.lang.String USER_RTK_NETWORK_SERVICE_SETTINGS = "user_rtk_network_service_settings";
    private static final java.lang.String USER_RTK_REFERENCE_SOURCE = "user_rtk_reference_source";
    private static final java.lang.String USER_RTK_NETWORK_COORDINATE_SYSTEM_CMCC = "user_rtk_network_coordinate_system_cmcc";
    private static final java.lang.String USER_RTK_NETWORK_COORDINATE_SYSTEM_QX = "user_rtk_network_coordinate_system_qx";
    
    private RTKUtil() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRTKTypeName(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource rtkReferenceStationSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRTKStatusName(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    dji.sdk.keyvalue.value.rtkmobilestation.RTKPositioningSolution positioningSolution) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final dji.rtk.CoordinateSystem getNetRTKCoordinateSystem(@org.jetbrains.annotations.NotNull
    dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource rtkReferenceStationSource) {
        return null;
    }
    
    public final void saveRTKCoordinateSystem(@org.jetbrains.annotations.NotNull
    dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource rtkReferenceStationSource, @org.jetbrains.annotations.NotNull
    dji.rtk.CoordinateSystem coordinateSystem) {
    }
    
    public final void saveRtkCustomNetworkSetting(@org.jetbrains.annotations.NotNull
    dji.sdk.keyvalue.value.rtkbasestation.RTKCustomNetworkSetting settings) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final dji.sdk.keyvalue.value.rtkbasestation.RTKCustomNetworkSetting getRtkCustomNetworkSetting() {
        return null;
    }
    
    private final dji.rtk.CoordinateSystem getCoordinateName(java.lang.String value) {
        return null;
    }
}