package dji.v5.ux.training.simulatorcontrol;

import java.lang.System;

/**
 * Simulator Control Widget Model
 *
 *
 * Widget Model for [SimulatorControlWidget] used to define the
 * underlying logic and communication
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0016H\u0014J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0019J\b\u0010\u001d\u001a\u00020\u0016H\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\b8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Ldji/v5/ux/training/simulatorcontrol/SimulatorControlWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;)V", "isSimulatorActive", "Lio/reactivex/rxjava3/core/Flowable;", "", "()Lio/reactivex/rxjava3/core/Flowable;", "satelliteCount", "", "getSatelliteCount", "satelliteCountDataProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "simulatorActiveDataProcessor", "simulatorState", "Ldji/sdk/keyvalue/value/flightcontroller/SimulatorState;", "getSimulatorState", "simulatorStateDataProcessor", "inCleanup", "", "inSetup", "startSimulator", "Lio/reactivex/rxjava3/core/Completable;", "initializationData", "Ldji/sdk/keyvalue/value/flightcontroller/SimulatorInitializationSettings;", "stopSimulator", "updateStates", "android-sdk-v5-uxsdk_debug"})
public final class SimulatorControlWidgetModel extends dji.v5.ux.core.base.WidgetModel {
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.flightcontroller.SimulatorState> simulatorStateDataProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Integer> satelliteCountDataProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> simulatorActiveDataProcessor = null;
    
    public SimulatorControlWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore) {
        super(null, null);
    }
    
    @java.lang.Override
    protected void inSetup() {
    }
    
    @java.lang.Override
    protected void inCleanup() {
    }
    
    @java.lang.Override
    protected void updateStates() {
    }
    
    /**
     * Start simulator on the aircraft
     *
     * @param initializationData instance of [InitializationData] required to start simulation
     * @return Completable to determine status of the action
     */
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Completable startSimulator(@org.jetbrains.annotations.NotNull
    dji.sdk.keyvalue.value.flightcontroller.SimulatorInitializationSettings initializationData) {
        return null;
    }
    
    /**
     * Stop simulator on the aircraft
     *
     * @return Completable to determine status of the action
     */
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Completable stopSimulator() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.sdk.keyvalue.value.flightcontroller.SimulatorState> getSimulatorState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<java.lang.Integer> getSatelliteCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<java.lang.Boolean> isSimulatorActive() {
        return null;
    }
}