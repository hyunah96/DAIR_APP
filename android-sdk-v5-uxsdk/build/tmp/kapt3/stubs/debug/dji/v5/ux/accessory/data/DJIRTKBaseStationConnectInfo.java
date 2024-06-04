package dji.v5.ux.accessory.data;

import java.lang.System;

/**
 * Description :驱动UI的数据模型，基于RTKBaseStationConnectInfo新增一个连接状态属性
 *
 * @author: Byte.Cai
 * date : 2022/3/6
 *
 * Copyright (c) 2022, DJI All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0019\u001a\u00020\u0007H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Ldji/v5/ux/accessory/data/DJIRTKBaseStationConnectInfo;", "Ldji/sdk/keyvalue/value/rtkbasestation/RTKStationInfo;", "()V", "baseStationId", "", "signalLevel", "rtkStationName", "", "connectStatus", "Ldji/sdk/keyvalue/value/rtkbasestation/RTKStationConnetState;", "(IILjava/lang/String;Ldji/sdk/keyvalue/value/rtkbasestation/RTKStationConnetState;)V", "getBaseStationId", "()I", "setBaseStationId", "(I)V", "getConnectStatus", "()Ldji/sdk/keyvalue/value/rtkbasestation/RTKStationConnetState;", "setConnectStatus", "(Ldji/sdk/keyvalue/value/rtkbasestation/RTKStationConnetState;)V", "getRtkStationName", "()Ljava/lang/String;", "setRtkStationName", "(Ljava/lang/String;)V", "getSignalLevel", "setSignalLevel", "toString", "android-sdk-v5-uxsdk_debug"})
public final class DJIRTKBaseStationConnectInfo extends dji.sdk.keyvalue.value.rtkbasestation.RTKStationInfo {
    private int baseStationId;
    private int signalLevel;
    @org.jetbrains.annotations.NotNull
    private java.lang.String rtkStationName;
    @org.jetbrains.annotations.NotNull
    private dji.sdk.keyvalue.value.rtkbasestation.RTKStationConnetState connectStatus;
    
    public DJIRTKBaseStationConnectInfo(int baseStationId, int signalLevel, @org.jetbrains.annotations.NotNull
    java.lang.String rtkStationName, @org.jetbrains.annotations.NotNull
    dji.sdk.keyvalue.value.rtkbasestation.RTKStationConnetState connectStatus) {
        super();
    }
    
    public final int getBaseStationId() {
        return 0;
    }
    
    public final void setBaseStationId(int p0) {
    }
    
    public final int getSignalLevel() {
        return 0;
    }
    
    public final void setSignalLevel(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRtkStationName() {
        return null;
    }
    
    public final void setRtkStationName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.sdk.keyvalue.value.rtkbasestation.RTKStationConnetState getConnectStatus() {
        return null;
    }
    
    public final void setConnectStatus(@org.jetbrains.annotations.NotNull
    dji.sdk.keyvalue.value.rtkbasestation.RTKStationConnetState p0) {
    }
    
    public DJIRTKBaseStationConnectInfo() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
}