package dji.v5.ux.accessory;

import java.lang.System;

/**
 * Description :Widget Model for the [RTKSatelliteStatusWidget] used to define
 * the underlying logic and communication
 *
 * @author: Byte.Cai
 * date : 2022/5/23
 *
 * Copyright (c) 2022, DJI All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00aa\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003CDEB\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u00104\u001a\u000205H\u0014J\b\u00106\u001a\u000205H\u0014J\u0012\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:H\u0002J\b\u0010;\u001a\u000205H\u0002J\b\u0010<\u001a\u000205H\u0002J\u0006\u0010=\u001a\u000205J\u0010\u0010>\u001a\u0002052\u0006\u0010?\u001a\u00020:H\u0002J\u0012\u0010@\u001a\u0002052\b\u0010A\u001a\u0004\u0018\u00010BH\u0002R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138G\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00138G\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00138G\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u0016R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020!0\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u00138G\u00a2\u0006\u0006\u001a\u0004\b(\u0010\u0016R\u000e\u0010)\u001a\u00020*X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020\'0\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00138F\u00a2\u0006\u0006\u001a\u0004\b.\u0010\u0016R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020-0\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u00102\u001a\b\u0012\u0004\u0012\u0002030\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006F"}, d2 = {"Ldji/v5/ux/accessory/RTKSatelliteStatusWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "uxKeyManager", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "preferencesManager", "Ldji/v5/ux/core/communication/GlobalPreferencesInterface;", "rtkCenter", "Ldji/v5/manager/interfaces/IRTKCenter;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;Ldji/v5/ux/core/communication/GlobalPreferencesInterface;Ldji/v5/manager/interfaces/IRTKCenter;)V", "TAG", "", "kotlin.jvm.PlatformType", "mRTKServiceState", "Ldji/sdk/keyvalue/value/rtkbasestation/RTKServiceState;", "networkServiceInfoListener", "Ldji/v5/manager/aircraft/rtk/network/INetworkServiceInfoListener;", "rtkBaseStationState", "Lio/reactivex/rxjava3/core/Flowable;", "Ldji/v5/ux/accessory/RTKSatelliteStatusWidgetModel$RTKBaseStationState;", "getRTKBaseStationState", "()Lio/reactivex/rxjava3/core/Flowable;", "rtkBaseStationStateProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "rtkLocationInfo", "Ldji/v5/manager/aircraft/rtk/RTKLocationInfo;", "getRTKLocationInfo", "rtkLocationInfoListener", "Ldji/v5/manager/aircraft/rtk/RTKLocationInfoListener;", "rtkLocationInfoProcessor", "rtkNetworkServiceInfoProcessor", "rtkNetworkServiceState", "Ldji/v5/ux/accessory/RTKSatelliteStatusWidgetModel$RTKNetworkServiceState;", "getRTKNetworkServiceState", "rtkNetworkServiceStateProcessor", "rtkStationConnectStateProcessor", "Ldji/sdk/keyvalue/value/rtkbasestation/RTKStationConnetState;", "rtkSystemState", "Ldji/v5/manager/aircraft/rtk/RTKSystemState;", "getRTKSystemState", "rtkSystemStateListener", "Ldji/v5/manager/aircraft/rtk/RTKSystemStateListener;", "rtkSystemStateProcessor", "standardDeviation", "Ldji/v5/ux/accessory/RTKSatelliteStatusWidgetModel$StandardDeviation;", "getStandardDeviation", "standardDeviationProcessor", "stationConnectStatusListener", "Ldji/v5/manager/aircraft/rtk/station/RTKStationConnectStatusListener;", "unitTypeProcessor", "Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "inCleanup", "", "inSetup", "isNetworkServiceOpen", "", "rtkSignal", "Ldji/sdk/keyvalue/value/rtkbasestation/RTKReferenceStationSource;", "updateBaseStationState", "updateNetworkServiceState", "updateRTKConnectionState", "updateRTKListener", "rtkSource", "updateStandardDeviation", "rtkLocation", "Ldji/sdk/keyvalue/value/rtkmobilestation/RTKLocation;", "RTKBaseStationState", "RTKNetworkServiceState", "StandardDeviation", "android-sdk-v5-uxsdk_debug"})
public final class RTKSatelliteStatusWidgetModel extends dji.v5.ux.core.base.WidgetModel {
    private final dji.v5.ux.core.communication.GlobalPreferencesInterface preferencesManager = null;
    private final dji.v5.manager.interfaces.IRTKCenter rtkCenter = null;
    private final java.lang.String TAG = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.manager.aircraft.rtk.RTKLocationInfo> rtkLocationInfoProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.manager.aircraft.rtk.RTKSystemState> rtkSystemStateProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.rtkbasestation.RTKStationConnetState> rtkStationConnectStateProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.rtkbasestation.RTKServiceState> rtkNetworkServiceInfoProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.util.UnitConversionUtil.UnitType> unitTypeProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.accessory.RTKSatelliteStatusWidgetModel.RTKBaseStationState> rtkBaseStationStateProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.accessory.RTKSatelliteStatusWidgetModel.RTKNetworkServiceState> rtkNetworkServiceStateProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.accessory.RTKSatelliteStatusWidgetModel.StandardDeviation> standardDeviationProcessor = null;
    private final dji.v5.manager.aircraft.rtk.RTKLocationInfoListener rtkLocationInfoListener = null;
    private final dji.v5.manager.aircraft.rtk.RTKSystemStateListener rtkSystemStateListener = null;
    private final dji.v5.manager.aircraft.rtk.station.RTKStationConnectStatusListener stationConnectStatusListener = null;
    private dji.sdk.keyvalue.value.rtkbasestation.RTKServiceState mRTKServiceState = dji.sdk.keyvalue.value.rtkbasestation.RTKServiceState.UNKNOWN;
    private final dji.v5.manager.aircraft.rtk.network.INetworkServiceInfoListener networkServiceInfoListener = null;
    
    public RTKSatelliteStatusWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore uxKeyManager, @org.jetbrains.annotations.Nullable
    dji.v5.ux.core.communication.GlobalPreferencesInterface preferencesManager, @org.jetbrains.annotations.NotNull
    dji.v5.manager.interfaces.IRTKCenter rtkCenter) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmName(name = "getRTKLocationInfo")
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.manager.aircraft.rtk.RTKLocationInfo> getRTKLocationInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmName(name = "getRTKSystemState")
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.manager.aircraft.rtk.RTKSystemState> getRTKSystemState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.ux.accessory.RTKSatelliteStatusWidgetModel.StandardDeviation> getStandardDeviation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmName(name = "getRTKBaseStationState")
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.ux.accessory.RTKSatelliteStatusWidgetModel.RTKBaseStationState> getRTKBaseStationState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmName(name = "getRTKNetworkServiceState")
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.ux.accessory.RTKSatelliteStatusWidgetModel.RTKNetworkServiceState> getRTKNetworkServiceState() {
        return null;
    }
    
    @java.lang.Override
    protected void inSetup() {
    }
    
    @java.lang.Override
    protected void inCleanup() {
    }
    
    private final void updateRTKListener(dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource rtkSource) {
    }
    
    private final void updateStandardDeviation(dji.sdk.keyvalue.value.rtkmobilestation.RTKLocation rtkLocation) {
    }
    
    /**
     * Sends the latest network service state or base station state to the corresponding flowable.
     */
    public final void updateRTKConnectionState() {
    }
    
    private final void updateNetworkServiceState() {
    }
    
    private final void updateBaseStationState() {
    }
    
    private final boolean isNetworkServiceOpen(dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource rtkSignal) {
        return false;
    }
    
    /**
     * The state of the network service.
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bH\u00c6\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0006\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\nR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Ldji/v5/ux/accessory/RTKSatelliteStatusWidgetModel$RTKNetworkServiceState;", "", "state", "Ldji/sdk/keyvalue/value/rtkbasestation/RTKServiceState;", "isRTKBeingUsed", "", "isNetworkServiceOpen", "rtkSignal", "Ldji/sdk/keyvalue/value/rtkbasestation/RTKReferenceStationSource;", "(Ldji/sdk/keyvalue/value/rtkbasestation/RTKServiceState;Ljava/lang/Boolean;Ljava/lang/Boolean;Ldji/sdk/keyvalue/value/rtkbasestation/RTKReferenceStationSource;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRTKSignal", "()Ldji/sdk/keyvalue/value/rtkbasestation/RTKReferenceStationSource;", "getState", "()Ldji/sdk/keyvalue/value/rtkbasestation/RTKServiceState;", "component1", "component2", "component3", "component4", "copy", "(Ldji/sdk/keyvalue/value/rtkbasestation/RTKServiceState;Ljava/lang/Boolean;Ljava/lang/Boolean;Ldji/sdk/keyvalue/value/rtkbasestation/RTKReferenceStationSource;)Ldji/v5/ux/accessory/RTKSatelliteStatusWidgetModel$RTKNetworkServiceState;", "equals", "other", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
    public static final class RTKNetworkServiceState {
        @org.jetbrains.annotations.Nullable
        private final dji.sdk.keyvalue.value.rtkbasestation.RTKServiceState state = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isRTKBeingUsed = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean isNetworkServiceOpen = null;
        @org.jetbrains.annotations.Nullable
        private final dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource rtkSignal = null;
        
        /**
         * The state of the network service.
         */
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.accessory.RTKSatelliteStatusWidgetModel.RTKNetworkServiceState copy(@org.jetbrains.annotations.Nullable
        dji.sdk.keyvalue.value.rtkbasestation.RTKServiceState state, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isRTKBeingUsed, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isNetworkServiceOpen, @org.jetbrains.annotations.Nullable
        dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource rtkSignal) {
            return null;
        }
        
        /**
         * The state of the network service.
         */
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        /**
         * The state of the network service.
         */
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        /**
         * The state of the network service.
         */
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public RTKNetworkServiceState(@org.jetbrains.annotations.Nullable
        dji.sdk.keyvalue.value.rtkbasestation.RTKServiceState state, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isRTKBeingUsed, @org.jetbrains.annotations.Nullable
        java.lang.Boolean isNetworkServiceOpen, @org.jetbrains.annotations.Nullable
        dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource rtkSignal) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final dji.sdk.keyvalue.value.rtkbasestation.RTKServiceState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final dji.sdk.keyvalue.value.rtkbasestation.RTKServiceState getState() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isRTKBeingUsed() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean isNetworkServiceOpen() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        @kotlin.jvm.JvmName(name = "getRTKSignal")
        public final dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource getRTKSignal() {
            return null;
        }
    }
    
    /**
     * The state of the RTK base station
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Ldji/v5/ux/accessory/RTKSatelliteStatusWidgetModel$RTKBaseStationState;", "", "(Ljava/lang/String;I)V", "CONNECTED_IN_USE", "CONNECTED_NOT_IN_USE", "DISCONNECTED", "android-sdk-v5-uxsdk_debug"})
    public static enum RTKBaseStationState {
        /*public static final*/ CONNECTED_IN_USE /* = new CONNECTED_IN_USE() */,
        /*public static final*/ CONNECTED_NOT_IN_USE /* = new CONNECTED_NOT_IN_USE() */,
        /*public static final*/ DISCONNECTED /* = new DISCONNECTED() */;
        
        RTKBaseStationState() {
        }
    }
    
    /**
     * The standard deviation of the location accuracy.
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Ldji/v5/ux/accessory/RTKSatelliteStatusWidgetModel$StandardDeviation;", "", "latitude", "", "longitude", "altitude", "unitType", "Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "(FFFLdji/v5/ux/core/util/UnitConversionUtil$UnitType;)V", "getAltitude", "()F", "getLatitude", "getLongitude", "getUnitType", "()Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
    public static final class StandardDeviation {
        private final float latitude = 0.0F;
        private final float longitude = 0.0F;
        private final float altitude = 0.0F;
        @org.jetbrains.annotations.NotNull
        private final dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType = null;
        
        /**
         * The standard deviation of the location accuracy.
         */
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.accessory.RTKSatelliteStatusWidgetModel.StandardDeviation copy(float latitude, float longitude, float altitude, @org.jetbrains.annotations.NotNull
        dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
            return null;
        }
        
        /**
         * The standard deviation of the location accuracy.
         */
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        /**
         * The standard deviation of the location accuracy.
         */
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        /**
         * The standard deviation of the location accuracy.
         */
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public StandardDeviation(float latitude, float longitude, float altitude, @org.jetbrains.annotations.NotNull
        dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
            super();
        }
        
        public final float component1() {
            return 0.0F;
        }
        
        public final float getLatitude() {
            return 0.0F;
        }
        
        public final float component2() {
            return 0.0F;
        }
        
        public final float getLongitude() {
            return 0.0F;
        }
        
        public final float component3() {
            return 0.0F;
        }
        
        public final float getAltitude() {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.core.util.UnitConversionUtil.UnitType component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.core.util.UnitConversionUtil.UnitType getUnitType() {
            return null;
        }
    }
}