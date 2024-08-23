package dji.v5.ux.obstacle;

import java.lang.System;

/**
 * Description :
 *
 * @author: Byte.Cai
 * date : 2023/8/14
 *
 * Copyright (c) 2022, DJI All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0017\u001a\u00020\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0018H\u0014J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000b\u00a8\u0006\u001d"}, d2 = {"Ldji/v5/ux/obstacle/AvoidanceShortcutWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "uxKeyManager", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;)V", "flightModeProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "Ldji/sdk/keyvalue/value/flightcontroller/FCFlightMode;", "getFlightModeProcessor", "()Ldji/v5/ux/core/util/DataProcessor;", "obstacleAvoidanceTypeProcessor", "Ldji/v5/manager/aircraft/perception/data/ObstacleAvoidanceType;", "getObstacleAvoidanceTypeProcessor", "perceptionInformationListener", "Ldji/v5/manager/aircraft/perception/listener/PerceptionInformationListener;", "perceptionManager", "Ldji/v5/manager/interfaces/IPerceptionManager;", "kotlin.jvm.PlatformType", "productTypeProcessor", "Ldji/sdk/keyvalue/value/product/ProductType;", "getProductTypeProcessor", "inCleanup", "", "inSetup", "setObstacleActionType", "Lio/reactivex/rxjava3/core/Completable;", "type", "android-sdk-v5-uxsdk_debug"})
public final class AvoidanceShortcutWidgetModel extends dji.v5.ux.core.base.WidgetModel {
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.product.ProductType> productTypeProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.flightcontroller.FCFlightMode> flightModeProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.manager.aircraft.perception.data.ObstacleAvoidanceType> obstacleAvoidanceTypeProcessor = null;
    private final dji.v5.manager.interfaces.IPerceptionManager perceptionManager = null;
    private final dji.v5.manager.aircraft.perception.listener.PerceptionInformationListener perceptionInformationListener = null;
    
    public AvoidanceShortcutWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore uxKeyManager) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.product.ProductType> getProductTypeProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.flightcontroller.FCFlightMode> getFlightModeProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.v5.manager.aircraft.perception.data.ObstacleAvoidanceType> getObstacleAvoidanceTypeProcessor() {
        return null;
    }
    
    @java.lang.Override
    protected void inSetup() {
    }
    
    @java.lang.Override
    protected void inCleanup() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Completable setObstacleActionType(@org.jetbrains.annotations.NotNull
    dji.v5.manager.aircraft.perception.data.ObstacleAvoidanceType type) {
        return null;
    }
}