package dji.v5.ux.core.widget.perception;

import java.lang.System;

/**
 * Widget Model for the [PerceptionStateWidget] used to define
 * the underlying logic and communication
 *
 * @author: William.Wong
 * date : 2022/9/21
 *
 * Copyright (c) 2022, DJI All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001aB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0017\u001a\u00020\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0018H\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\r0\r0\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001b"}, d2 = {"Ldji/v5/ux/core/widget/perception/PerceptionStateWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "perceptionManager", "Ldji/v5/manager/interfaces/IPerceptionManager;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;Ldji/v5/manager/interfaces/IPerceptionManager;)V", "getKeyedStore", "()Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "perceptionInfo", "Lio/reactivex/rxjava3/core/Flowable;", "Ldji/v5/manager/aircraft/perception/data/PerceptionInfo;", "getPerceptionInfo", "()Lio/reactivex/rxjava3/core/Flowable;", "perceptionInfoListener", "Ldji/v5/manager/aircraft/perception/listener/PerceptionInformationListener;", "perceptionInfoProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "kotlin.jvm.PlatformType", "getPerceptionManager", "()Ldji/v5/manager/interfaces/IPerceptionManager;", "inCleanup", "", "inSetup", "PerceptionSwitchState", "android-sdk-v5-uxsdk_debug"})
public final class PerceptionStateWidgetModel extends dji.v5.ux.core.base.WidgetModel {
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.manager.interfaces.IPerceptionManager perceptionManager = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.manager.aircraft.perception.data.PerceptionInfo> perceptionInfoProcessor = null;
    private final dji.v5.manager.aircraft.perception.listener.PerceptionInformationListener perceptionInfoListener = null;
    
    public PerceptionStateWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore, @org.jetbrains.annotations.NotNull
    dji.v5.manager.interfaces.IPerceptionManager perceptionManager) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.communication.ObservableInMemoryKeyedStore getKeyedStore() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.manager.interfaces.IPerceptionManager getPerceptionManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.manager.aircraft.perception.data.PerceptionInfo> getPerceptionInfo() {
        return null;
    }
    
    @java.lang.Override
    protected void inSetup() {
    }
    
    @java.lang.Override
    protected void inCleanup() {
    }
    
    /**
     * Obstacle avoidance system switch state
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Ldji/v5/ux/core/widget/perception/PerceptionStateWidgetModel$PerceptionSwitchState;", "", "(Ljava/lang/String;I)V", "ALL_ENABLED", "ONLY_HORI_OFF", "ONLY_UP_OFF", "ONLY_DOWN_OFF", "ONLY_HORI_ON", "ONLY_UP_ON", "ONLY_DOWN_ON", "ALL_DISABLED", "android-sdk-v5-uxsdk_debug"})
    public static enum PerceptionSwitchState {
        /*public static final*/ ALL_ENABLED /* = new ALL_ENABLED() */,
        /*public static final*/ ONLY_HORI_OFF /* = new ONLY_HORI_OFF() */,
        /*public static final*/ ONLY_UP_OFF /* = new ONLY_UP_OFF() */,
        /*public static final*/ ONLY_DOWN_OFF /* = new ONLY_DOWN_OFF() */,
        /*public static final*/ ONLY_HORI_ON /* = new ONLY_HORI_ON() */,
        /*public static final*/ ONLY_UP_ON /* = new ONLY_UP_ON() */,
        /*public static final*/ ONLY_DOWN_ON /* = new ONLY_DOWN_ON() */,
        /*public static final*/ ALL_DISABLED /* = new ALL_DISABLED() */;
        
        PerceptionSwitchState() {
        }
    }
}