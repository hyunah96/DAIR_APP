package dji.v5.ux.core.panel.listitem.obstacleavoidance;

import java.lang.System;

/**
 * Widget Model for the [ObstacleAvoidanceListItemWidgetModel] used to define
 * the underlying logic and communication
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0015H\u0014J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\fJ\b\u0010\u001a\u001a\u00020\u0015H\u0002J\b\u0010\u001b\u001a\u00020\u0015H\u0014R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u000b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\f0\f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001c"}, d2 = {"Ldji/v5/ux/core/panel/listitem/obstacleavoidance/ObstacleAvoidanceListItemWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;)V", "flyControlConnectionProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "", "kotlin.jvm.PlatformType", "obstacleActionTypeProcessor", "Ldji/sdk/keyvalue/value/flightcontroller/ObstacleActionType;", "getObstacleActionTypeProcessor", "()Ldji/v5/ux/core/util/DataProcessor;", "getObstacleActionType", "obstacleAvoidanceType", "Ldji/v5/manager/aircraft/perception/data/ObstacleAvoidanceType;", "getObstacleAvoidanceType", "obstacleActionType", "inCleanup", "", "inSetup", "setObstacleActionType", "Lio/reactivex/rxjava3/core/Completable;", "type", "updateObstacleActionType", "updateStates", "android-sdk-v5-uxsdk_debug"})
public final class ObstacleAvoidanceListItemWidgetModel extends dji.v5.ux.core.base.WidgetModel {
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.flightcontroller.ObstacleActionType> obstacleActionTypeProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> flyControlConnectionProcessor = null;
    
    public ObstacleAvoidanceListItemWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.flightcontroller.ObstacleActionType> getObstacleActionTypeProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Completable setObstacleActionType(@org.jetbrains.annotations.NotNull
    dji.sdk.keyvalue.value.flightcontroller.ObstacleActionType type) {
        return null;
    }
    
    @java.lang.Override
    protected void inSetup() {
    }
    
    private final void updateObstacleActionType() {
    }
    
    @java.lang.Override
    protected void inCleanup() {
    }
    
    @java.lang.Override
    protected void updateStates() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.sdk.keyvalue.value.flightcontroller.ObstacleActionType getObstacleActionType(@org.jetbrains.annotations.Nullable
    dji.v5.manager.aircraft.perception.data.ObstacleAvoidanceType obstacleAvoidanceType) {
        return null;
    }
    
    private final dji.v5.manager.aircraft.perception.data.ObstacleAvoidanceType getObstacleAvoidanceType(dji.sdk.keyvalue.value.flightcontroller.ObstacleActionType obstacleActionType) {
        return null;
    }
}