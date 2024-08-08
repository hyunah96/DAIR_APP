package dji.v5.ux.accessory;

import java.lang.System;

/**
 * Description :Widget Model for the [RTKStationConnectWidget] used to define
 * the underlying logic and communication
 *
 * @author: Byte.Cai
 * date : 2022/9/1
 *
 * Copyright (c) 2022, DJI All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*H\u0002J\b\u0010,\u001a\u00020-H\u0014J\b\u0010.\u001a\u00020-H\u0014J\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020\u0013002\u0006\u00101\u001a\u000202J\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u001300J\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u001300J\f\u00105\u001a\u00020%*\u00020+H\u0002R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\rR\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190\n8F\u00a2\u0006\u0006\u001a\u0004\b \u0010\rR\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0\n8F\u00a2\u0006\u0006\u001a\u0004\b&\u0010\rR\u001a\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Ldji/v5/ux/accessory/RTKStationConnectWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "rtkCenter", "Ldji/v5/manager/interfaces/IRTKCenter;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;Ldji/v5/manager/interfaces/IRTKCenter;)V", "connectedRTKStationInfo", "Lio/reactivex/rxjava3/core/Flowable;", "Ldji/v5/manager/aircraft/rtk/station/ConnectedRTKStationInfo;", "getConnectedRTKStationInfo", "()Lio/reactivex/rxjava3/core/Flowable;", "connectedRTKStationInfoListener", "Ldji/v5/manager/aircraft/rtk/station/ConnectedRTKStationInfoListener;", "connectedRTKStationInfoProcessor", "Lio/reactivex/rxjava3/processors/BehaviorProcessor;", "isMotorOn", "", "isMotorOnProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "getRtkCenter", "()Ldji/v5/manager/interfaces/IRTKCenter;", "rtkStationConnectStateProcessor", "Ldji/sdk/keyvalue/value/rtkbasestation/RTKStationConnetState;", "rtkStationManager", "Ldji/v5/manager/interfaces/IRTKStationManager;", "kotlin.jvm.PlatformType", "searchStationListener", "Ldji/v5/manager/aircraft/rtk/station/SearchRTKStationListener;", "stationConnectStatus", "getStationConnectStatus", "stationConnectStatusListener", "Ldji/v5/manager/aircraft/rtk/station/RTKStationConnectStatusListener;", "stationList", "Ljava/util/ArrayList;", "Ldji/v5/ux/accessory/data/DJIRTKBaseStationConnectInfo;", "getStationList", "stationListProcessor", "convertToDJIRTKBaseStationConnectInfo", "list", "", "Ldji/sdk/keyvalue/value/rtkbasestation/RTKStationInfo;", "inCleanup", "", "inSetup", "startConnectToRTKStation", "Lio/reactivex/rxjava3/core/Single;", "stationId", "", "startSearchStationRTK", "stopSearchStationRTK", "toDJIRTKBaseStationConnectInfo", "android-sdk-v5-uxsdk_debug"})
public final class RTKStationConnectWidgetModel extends dji.v5.ux.core.base.WidgetModel {
    @org.jetbrains.annotations.NotNull
    private final dji.v5.manager.interfaces.IRTKCenter rtkCenter = null;
    private final dji.v5.manager.interfaces.IRTKStationManager rtkStationManager = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.rtkbasestation.RTKStationConnetState> rtkStationConnectStateProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.util.ArrayList<dji.v5.ux.accessory.data.DJIRTKBaseStationConnectInfo>> stationListProcessor = null;
    private final io.reactivex.rxjava3.processors.BehaviorProcessor<dji.v5.manager.aircraft.rtk.station.ConnectedRTKStationInfo> connectedRTKStationInfoProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> isMotorOnProcessor = null;
    private final dji.v5.manager.aircraft.rtk.station.RTKStationConnectStatusListener stationConnectStatusListener = null;
    private final dji.v5.manager.aircraft.rtk.station.ConnectedRTKStationInfoListener connectedRTKStationInfoListener = null;
    private final dji.v5.manager.aircraft.rtk.station.SearchRTKStationListener searchStationListener = null;
    
    public RTKStationConnectWidgetModel(@org.jetbrains.annotations.NotNull
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
    public final io.reactivex.rxjava3.core.Flowable<java.lang.Boolean> isMotorOn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.sdk.keyvalue.value.rtkbasestation.RTKStationConnetState> getStationConnectStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.manager.aircraft.rtk.station.ConnectedRTKStationInfo> getConnectedRTKStationInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<java.util.ArrayList<dji.v5.ux.accessory.data.DJIRTKBaseStationConnectInfo>> getStationList() {
        return null;
    }
    
    @java.lang.Override
    protected void inSetup() {
    }
    
    @java.lang.Override
    protected void inCleanup() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Single<java.lang.Boolean> startConnectToRTKStation(int stationId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Single<java.lang.Boolean> startSearchStationRTK() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Single<java.lang.Boolean> stopSearchStationRTK() {
        return null;
    }
    
    private final java.util.ArrayList<dji.v5.ux.accessory.data.DJIRTKBaseStationConnectInfo> convertToDJIRTKBaseStationConnectInfo(java.util.List<? extends dji.sdk.keyvalue.value.rtkbasestation.RTKStationInfo> list) {
        return null;
    }
    
    private final dji.v5.ux.accessory.data.DJIRTKBaseStationConnectInfo toDJIRTKBaseStationConnectInfo(dji.sdk.keyvalue.value.rtkbasestation.RTKStationInfo $this$toDJIRTKBaseStationConnectInfo) {
        return null;
    }
}