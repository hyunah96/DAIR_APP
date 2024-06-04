package dji.v5.ux.core.widget.hsi;

import java.lang.System;

/**
 * Class Description
 *
 * @author Hoker
 * @date 2021/11/26
 *
 * Copyright (c) 2021, DJI All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010/\u001a\u000200H\u0014J\b\u00101\u001a\u000200H\u0014R\u001f\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\r\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u000e0\u000e0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u001f\u0010\u0013\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00110\u00110\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u001f\u0010\u0015\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00160\u00160\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\fR\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n \n*\u0004\u0018\u00010\u001b0\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u001e\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u001f0\u001f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\fR\u001f\u0010!\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\"0\"0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\fR\u000e\u0010$\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\'\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u001f0\u001f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\fR\u001f\u0010)\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010*0*0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\fR\u001f\u0010,\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010-0-0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\f\u00a8\u00062"}, d2 = {"Ldji/v5/ux/core/widget/hsi/AttitudeDisplayModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;)V", "aircraftLocationDataProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "Ldji/sdk/keyvalue/value/common/LocationCoordinate2D;", "kotlin.jvm.PlatformType", "getAircraftLocationDataProcessor", "()Ldji/v5/ux/core/util/DataProcessor;", "altitudeProcessor", "", "getAltitudeProcessor", "goHomeHeightProcessor", "", "getGoHomeHeightProcessor", "limitMaxFlightHeightInMeterProcessor", "getLimitMaxFlightHeightInMeterProcessor", "perceptionInfoProcessor", "Ldji/v5/manager/aircraft/perception/data/PerceptionInfo;", "getPerceptionInfoProcessor", "perceptionInformationListener", "Ldji/v5/manager/aircraft/perception/listener/PerceptionInformationListener;", "perceptionManager", "Ldji/v5/manager/interfaces/IPerceptionManager;", "perceptionObstacleDataListener", "Ldji/v5/manager/aircraft/perception/listener/ObstacleDataListener;", "perceptionObstacleDataProcessor", "Ldji/v5/manager/aircraft/perception/data/ObstacleData;", "getPerceptionObstacleDataProcessor", "radarInfoProcessor", "Ldji/v5/manager/aircraft/perception/radar/RadarInformation;", "getRadarInfoProcessor", "radarInformationListener", "Ldji/v5/manager/aircraft/perception/radar/RadarInformationListener;", "radarObstacleDataListener", "radarObstacleDataProcessor", "getRadarObstacleDataProcessor", "rtkTakeoffAltitudeInfoProcessor", "Ldji/sdk/keyvalue/value/rtkmobilestation/RTKTakeoffAltitudeInfo;", "getRtkTakeoffAltitudeInfoProcessor", "velocityProcessor", "Ldji/sdk/keyvalue/value/common/Velocity3D;", "getVelocityProcessor", "inCleanup", "", "inSetup", "android-sdk-v5-uxsdk_debug"})
public class AttitudeDisplayModel extends dji.v5.ux.core.base.WidgetModel {
    private final dji.v5.manager.interfaces.IPerceptionManager perceptionManager = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.common.Velocity3D> velocityProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Double> altitudeProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Integer> goHomeHeightProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Integer> limitMaxFlightHeightInMeterProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.rtkmobilestation.RTKTakeoffAltitudeInfo> rtkTakeoffAltitudeInfoProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.common.LocationCoordinate2D> aircraftLocationDataProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.manager.aircraft.perception.data.PerceptionInfo> perceptionInfoProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.manager.aircraft.perception.radar.RadarInformation> radarInfoProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.manager.aircraft.perception.data.ObstacleData> perceptionObstacleDataProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.manager.aircraft.perception.data.ObstacleData> radarObstacleDataProcessor = null;
    private final dji.v5.manager.aircraft.perception.listener.PerceptionInformationListener perceptionInformationListener = null;
    private final dji.v5.manager.aircraft.perception.listener.ObstacleDataListener perceptionObstacleDataListener = null;
    private final dji.v5.manager.aircraft.perception.listener.ObstacleDataListener radarObstacleDataListener = null;
    private final dji.v5.manager.aircraft.perception.radar.RadarInformationListener radarInformationListener = null;
    
    public AttitudeDisplayModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.common.Velocity3D> getVelocityProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<java.lang.Double> getAltitudeProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<java.lang.Integer> getGoHomeHeightProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<java.lang.Integer> getLimitMaxFlightHeightInMeterProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.rtkmobilestation.RTKTakeoffAltitudeInfo> getRtkTakeoffAltitudeInfoProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.common.LocationCoordinate2D> getAircraftLocationDataProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.v5.manager.aircraft.perception.data.PerceptionInfo> getPerceptionInfoProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.v5.manager.aircraft.perception.radar.RadarInformation> getRadarInfoProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.v5.manager.aircraft.perception.data.ObstacleData> getPerceptionObstacleDataProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.v5.manager.aircraft.perception.data.ObstacleData> getRadarObstacleDataProcessor() {
        return null;
    }
    
    @java.lang.Override
    protected void inSetup() {
    }
    
    @java.lang.Override
    protected void inCleanup() {
    }
}