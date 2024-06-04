package dji.v5.ux.core.widget.gpssignal;

import java.lang.System;

/**
 * Description :
 *
 * @author: Byte.Cai
 * date : 2022/9/8
 *
 * Copyright (c) 2022, DJI All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003=>?B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\'\u001a\u00020\u00112\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010/\u001a\u000200H\u0014J\b\u00101\u001a\u000200H\u0014J\b\u00102\u001a\u000200H\u0002J\u000e\u00103\u001a\u0002002\u0006\u00104\u001a\u00020\u001cJ\b\u00105\u001a\u000206H\u0002J\u0010\u00107\u001a\u0002002\u0006\u00108\u001a\u000209H\u0002J\b\u0010:\u001a\u000206H\u0002J\b\u0010;\u001a\u000200H\u0002J\u0010\u0010<\u001a\u0002002\u0006\u0010\u0017\u001a\u00020\u000eH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00110\u00110\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013R\u001c\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00180\u00180\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00108F\u00a2\u0006\u0006\u001a\u0004\b$\u0010\u0013R\u001c\u0010%\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010#0#0\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108F\u00a2\u0006\u0006\u001a\u0004\b\'\u0010\u0013R\u001c\u0010(\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00110\u00110\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006@"}, d2 = {"Ldji/v5/ux/core/widget/gpssignal/GpsSignalWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "rtkCenter", "Ldji/v5/manager/interfaces/IRTKCenter;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;Ldji/v5/manager/interfaces/IRTKCenter;)V", "baseStationConnectStatus", "Ldji/sdk/keyvalue/value/rtkbasestation/RTKStationConnetState;", "connectStatusListener", "Ldji/v5/manager/aircraft/rtk/station/RTKStationConnectStatusListener;", "currentGpsSignalLevel", "Ldji/sdk/keyvalue/value/flightcontroller/GPSSignalLevel;", "gpsSatelliteCount", "Lio/reactivex/rxjava3/core/Flowable;", "", "getGpsSatelliteCount", "()Lio/reactivex/rxjava3/core/Flowable;", "gpsSatelliteCountProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "kotlin.jvm.PlatformType", "gpsSignalLevel", "Ldji/v5/ux/core/widget/gpssignal/GpsSignalWidgetModel$SignalLevel;", "getGpsSignalLevel", "gpsSignalLevelProcessor", "isRtkModuleAvailable", "", "isUsingRtkKeeping", "networkServiceInfoListener", "Ldji/v5/manager/aircraft/rtk/network/INetworkServiceInfoListener;", "getRtkCenter", "()Ldji/v5/manager/interfaces/IRTKCenter;", "rtkOverview", "Ldji/v5/ux/core/widget/gpssignal/GpsSignalWidgetModel$RtkOverview;", "getRtkOverview", "rtkOverviewProcessor", "rtkSatelliteCount", "getRtkSatelliteCount", "rtkSatelliteCountProcessor", "rtkServiceState", "Ldji/sdk/keyvalue/value/rtkbasestation/RTKServiceState;", "rtkSystemState", "Ldji/v5/manager/aircraft/rtk/RTKSystemState;", "rtkSystemStateListener", "Ldji/v5/manager/aircraft/rtk/RTKSystemStateListener;", "inCleanup", "", "inSetup", "resetData", "setRTKEnable", "boolean", "updateBaseRtkState", "Ldji/v5/ux/core/widget/gpssignal/GpsSignalWidgetModel$RtkState;", "updateRTKListener", "rtkSource", "Ldji/sdk/keyvalue/value/rtkbasestation/RTKReferenceStationSource;", "updateRtcmStatus", "updateRtkOverview", "updateSignalLevel", "RtkOverview", "RtkState", "SignalLevel", "android-sdk-v5-uxsdk_debug"})
public final class GpsSignalWidgetModel extends dji.v5.ux.core.base.WidgetModel {
    @org.jetbrains.annotations.NotNull
    private final dji.v5.manager.interfaces.IRTKCenter rtkCenter = null;
    private dji.v5.manager.aircraft.rtk.RTKSystemState rtkSystemState;
    private boolean isRtkModuleAvailable = false;
    private dji.sdk.keyvalue.value.rtkbasestation.RTKServiceState rtkServiceState = dji.sdk.keyvalue.value.rtkbasestation.RTKServiceState.UNKNOWN;
    private dji.sdk.keyvalue.value.flightcontroller.GPSSignalLevel currentGpsSignalLevel = dji.sdk.keyvalue.value.flightcontroller.GPSSignalLevel.UNKNOWN;
    private dji.sdk.keyvalue.value.rtkbasestation.RTKStationConnetState baseStationConnectStatus = dji.sdk.keyvalue.value.rtkbasestation.RTKStationConnetState.UNKNOWN;
    private boolean isUsingRtkKeeping = false;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Integer> gpsSatelliteCountProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Integer> rtkSatelliteCountProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.widget.gpssignal.GpsSignalWidgetModel.SignalLevel> gpsSignalLevelProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.widget.gpssignal.GpsSignalWidgetModel.RtkOverview> rtkOverviewProcessor = null;
    private final dji.v5.manager.aircraft.rtk.RTKSystemStateListener rtkSystemStateListener = null;
    private final dji.v5.manager.aircraft.rtk.station.RTKStationConnectStatusListener connectStatusListener = null;
    private final dji.v5.manager.aircraft.rtk.network.INetworkServiceInfoListener networkServiceInfoListener = null;
    
    public GpsSignalWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore, @org.jetbrains.annotations.NotNull
    dji.v5.manager.interfaces.IRTKCenter rtkCenter) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.manager.interfaces.IRTKCenter getRtkCenter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<java.lang.Integer> getGpsSatelliteCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<java.lang.Integer> getRtkSatelliteCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.widget.gpssignal.GpsSignalWidgetModel.RtkOverview> getRtkOverview() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.widget.gpssignal.GpsSignalWidgetModel.SignalLevel> getGpsSignalLevel() {
        return null;
    }
    
    @java.lang.Override
    protected void inSetup() {
    }
    
    @java.lang.Override
    protected void inCleanup() {
    }
    
    public final void setRTKEnable(boolean p0_32355860) {
    }
    
    private final void updateRTKListener(dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource rtkSource) {
    }
    
    /**
     * 更新RTK概览
     */
    private final void updateRtkOverview() {
    }
    
    private final void resetData() {
    }
    
    private final dji.v5.ux.core.widget.gpssignal.GpsSignalWidgetModel.RtkState updateBaseRtkState() {
        return null;
    }
    
    /**
     * 更新GPS信号强度LiveData
     */
    private final void updateSignalLevel(dji.sdk.keyvalue.value.flightcontroller.GPSSignalLevel gpsSignalLevel) {
    }
    
    private final dji.v5.ux.core.widget.gpssignal.GpsSignalWidgetModel.RtkState updateRtcmStatus() {
        return null;
    }
    
    /**
     * 计算RTK的星数。只能只取天线1（主天线）的卫星数作为标准，因为飞控大多数情况也只使用主天线的卫星数来计算。
     */
    private final int getRtkSatelliteCount(dji.v5.manager.aircraft.rtk.RTKSystemState rtkSystemState) {
        return 0;
    }
    
    /**
     * RTK概览状态
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\b\u0010 \u001a\u00020!H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\""}, d2 = {"Ldji/v5/ux/core/widget/gpssignal/GpsSignalWidgetModel$RtkOverview;", "", "connected", "", "enabled", "rtkHealthy", "rtkState", "Ldji/v5/ux/core/widget/gpssignal/GpsSignalWidgetModel$RtkState;", "rtkSource", "Ldji/sdk/keyvalue/value/rtkbasestation/RTKReferenceStationSource;", "rtkKeepingStatus", "(ZZZLdji/v5/ux/core/widget/gpssignal/GpsSignalWidgetModel$RtkState;Ldji/sdk/keyvalue/value/rtkbasestation/RTKReferenceStationSource;Z)V", "getConnected", "()Z", "getEnabled", "getRtkHealthy", "getRtkKeepingStatus", "getRtkSource", "()Ldji/sdk/keyvalue/value/rtkbasestation/RTKReferenceStationSource;", "getRtkState", "()Ldji/v5/ux/core/widget/gpssignal/GpsSignalWidgetModel$RtkState;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
    public static final class RtkOverview {
        private final boolean connected = false;
        private final boolean enabled = false;
        private final boolean rtkHealthy = false;
        @org.jetbrains.annotations.NotNull
        private final dji.v5.ux.core.widget.gpssignal.GpsSignalWidgetModel.RtkState rtkState = null;
        @org.jetbrains.annotations.NotNull
        private final dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource rtkSource = null;
        private final boolean rtkKeepingStatus = false;
        
        /**
         * RTK概览状态
         */
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.core.widget.gpssignal.GpsSignalWidgetModel.RtkOverview copy(boolean connected, boolean enabled, boolean rtkHealthy, @org.jetbrains.annotations.NotNull
        dji.v5.ux.core.widget.gpssignal.GpsSignalWidgetModel.RtkState rtkState, @org.jetbrains.annotations.NotNull
        dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource rtkSource, boolean rtkKeepingStatus) {
            return null;
        }
        
        /**
         * RTK概览状态
         */
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        /**
         * RTK概览状态
         */
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        public RtkOverview() {
            super();
        }
        
        public RtkOverview(boolean connected, boolean enabled, boolean rtkHealthy, @org.jetbrains.annotations.NotNull
        dji.v5.ux.core.widget.gpssignal.GpsSignalWidgetModel.RtkState rtkState, @org.jetbrains.annotations.NotNull
        dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource rtkSource, boolean rtkKeepingStatus) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean getConnected() {
            return false;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean getEnabled() {
            return false;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean getRtkHealthy() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.core.widget.gpssignal.GpsSignalWidgetModel.RtkState component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.core.widget.gpssignal.GpsSignalWidgetModel.RtkState getRtkState() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource getRtkSource() {
            return null;
        }
        
        public final boolean component6() {
            return false;
        }
        
        public final boolean getRtkKeepingStatus() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
    }
    
    /**
     * RTK统一状态（包含D-RTK和网络RTK的状态）
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Ldji/v5/ux/core/widget/gpssignal/GpsSignalWidgetModel$RtkState;", "", "(Ljava/lang/String;I)V", "NOT_OPEN", "NOT_CONNECT", "CONVERGING", "CONNECTED", "ERROR", "android-sdk-v5-uxsdk_debug"})
    public static enum RtkState {
        /*public static final*/ NOT_OPEN /* = new NOT_OPEN() */,
        /*public static final*/ NOT_CONNECT /* = new NOT_CONNECT() */,
        /*public static final*/ CONVERGING /* = new CONVERGING() */,
        /*public static final*/ CONNECTED /* = new CONNECTED() */,
        /*public static final*/ ERROR /* = new ERROR() */;
        
        RtkState() {
        }
    }
    
    /**
     * 信号强度
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Ldji/v5/ux/core/widget/gpssignal/GpsSignalWidgetModel$SignalLevel;", "", "(Ljava/lang/String;I)V", "LEVEL_1", "LEVEL_2", "LEVEL_3", "android-sdk-v5-uxsdk_debug"})
    public static enum SignalLevel {
        /*public static final*/ LEVEL_1 /* = new LEVEL_1() */,
        /*public static final*/ LEVEL_2 /* = new LEVEL_2() */,
        /*public static final*/ LEVEL_3 /* = new LEVEL_3() */;
        
        SignalLevel() {
        }
    }
}