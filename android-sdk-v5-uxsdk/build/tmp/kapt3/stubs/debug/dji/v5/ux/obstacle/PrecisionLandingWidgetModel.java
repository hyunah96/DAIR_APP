package dji.v5.ux.obstacle;

import java.lang.System;

/**
 * Description :
 *
 * @author: Byte.Cai
 * date : 2023/8/15
 *
 * Copyright (c) 2022, DJI All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0012H\u0014J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Ldji/v5/ux/obstacle/PrecisionLandingWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "uxKeyManager", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;)V", "perceptionInfoProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "Ldji/v5/manager/aircraft/perception/data/PerceptionInfo;", "getPerceptionInfoProcessor", "()Ldji/v5/ux/core/util/DataProcessor;", "perceptionInformationListener", "Ldji/v5/manager/aircraft/perception/listener/PerceptionInformationListener;", "perceptionManager", "Ldji/v5/manager/interfaces/IPerceptionManager;", "kotlin.jvm.PlatformType", "inCleanup", "", "inSetup", "setPrecisionLandingEnabled", "Lio/reactivex/rxjava3/core/Completable;", "enable", "", "android-sdk-v5-uxsdk_debug"})
public final class PrecisionLandingWidgetModel extends dji.v5.ux.core.base.WidgetModel {
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.manager.aircraft.perception.data.PerceptionInfo> perceptionInfoProcessor = null;
    private final dji.v5.manager.interfaces.IPerceptionManager perceptionManager = null;
    private final dji.v5.manager.aircraft.perception.listener.PerceptionInformationListener perceptionInformationListener = null;
    
    public PrecisionLandingWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore uxKeyManager) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.v5.manager.aircraft.perception.data.PerceptionInfo> getPerceptionInfoProcessor() {
        return null;
    }
    
    @java.lang.Override
    protected void inSetup() {
    }
    
    @java.lang.Override
    protected void inCleanup() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Completable setPrecisionLandingEnabled(boolean enable) {
        return null;
    }
}