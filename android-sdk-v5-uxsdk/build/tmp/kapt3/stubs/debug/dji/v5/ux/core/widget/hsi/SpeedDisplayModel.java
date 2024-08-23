package dji.v5.ux.core.widget.hsi;

import java.lang.System;

/**
 * Class Description
 *
 * @author Hoker
 * @date 2021/11/25
 *
 * Copyright (c) 2021, DJI All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u001b\u001a\u00020\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u001cH\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00100\u00100\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u001f\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00130\u00130\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000bR\u001f\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00160\u00160\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000bR\u001f\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00190\u00190\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000b\u00a8\u0006\u001e"}, d2 = {"Ldji/v5/ux/core/widget/hsi/SpeedDisplayModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;)V", "aircraftAttitudeProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "Ldji/sdk/keyvalue/value/common/Attitude;", "getAircraftAttitudeProcessor", "()Ldji/v5/ux/core/util/DataProcessor;", "tag", "", "kotlin.jvm.PlatformType", "velocityProcessor", "Ldji/sdk/keyvalue/value/common/Velocity3D;", "getVelocityProcessor", "windDirectionProcessor", "Ldji/sdk/keyvalue/value/flightcontroller/WindDirection;", "getWindDirectionProcessor", "windSpeedProcessor", "", "getWindSpeedProcessor", "windWarningProcessor", "Ldji/sdk/keyvalue/value/flightcontroller/WindWarning;", "getWindWarningProcessor", "inCleanup", "", "inSetup", "android-sdk-v5-uxsdk_debug"})
public class SpeedDisplayModel extends dji.v5.ux.core.base.WidgetModel {
    private final java.lang.String tag = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.common.Velocity3D> velocityProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.common.Attitude> aircraftAttitudeProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Integer> windSpeedProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.flightcontroller.WindDirection> windDirectionProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.flightcontroller.WindWarning> windWarningProcessor = null;
    
    public SpeedDisplayModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.common.Velocity3D> getVelocityProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.common.Attitude> getAircraftAttitudeProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<java.lang.Integer> getWindSpeedProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.flightcontroller.WindDirection> getWindDirectionProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.flightcontroller.WindWarning> getWindWarningProcessor() {
        return null;
    }
    
    @java.lang.Override
    protected void inSetup() {
    }
    
    @java.lang.Override
    protected void inCleanup() {
    }
}