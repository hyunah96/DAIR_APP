package dji.v5.ux.core.panel.listitem.rcstickmode;

import java.lang.System;

/**
 * Widget Model for the [RCStickModeListItemWidget] used to define
 * the underlying logic and communication
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001aB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0013H\u0014J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\tJ\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\tH\u0002J\b\u0010\u0019\u001a\u00020\u0013H\u0014R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;)V", "controlModeProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "Ldji/sdk/keyvalue/value/remotecontroller/ControlMode;", "rcStickModeState", "Lio/reactivex/rxjava3/core/Flowable;", "Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidgetModel$RCStickModeState;", "getRcStickModeState", "()Lio/reactivex/rxjava3/core/Flowable;", "rcStickModeStateProcessor", "getControlStickMode", "Lio/reactivex/rxjava3/core/Single;", "inCleanup", "", "inSetup", "setControlStickMode", "Lio/reactivex/rxjava3/core/Completable;", "mode", "updateCurrentStickMode", "updateStates", "RCStickModeState", "android-sdk-v5-uxsdk_debug"})
public final class RCStickModeListItemWidgetModel extends dji.v5.ux.core.base.WidgetModel {
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.panel.listitem.rcstickmode.RCStickModeListItemWidgetModel.RCStickModeState> rcStickModeStateProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.remotecontroller.ControlMode> controlModeProcessor = null;
    
    /**
     * Get the current rc stick list item state
     */
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.panel.listitem.rcstickmode.RCStickModeListItemWidgetModel.RCStickModeState> rcStickModeState = null;
    
    public RCStickModeListItemWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.panel.listitem.rcstickmode.RCStickModeListItemWidgetModel.RCStickModeState> getRcStickModeState() {
        return null;
    }
    
    /**
     * Set control stick mode to RC
     *
     * @param mode - state representing stick mode to be set to RC
     * @return Completable representing the action
     */
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Completable setControlStickMode(@org.jetbrains.annotations.NotNull
    dji.sdk.keyvalue.value.remotecontroller.ControlMode mode) {
        return null;
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
    
    private final void updateCurrentStickMode(dji.sdk.keyvalue.value.remotecontroller.ControlMode mode) {
    }
    
    private final io.reactivex.rxjava3.core.Single<dji.sdk.keyvalue.value.remotecontroller.ControlMode> getControlStickMode() {
        return null;
    }
    
    /**
     * Class representing states for RCStickMode
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidgetModel$RCStickModeState;", "", "()V", "CH", "Custom", "JP", "ProductDisconnected", "USA", "Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidgetModel$RCStickModeState$CH;", "Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidgetModel$RCStickModeState$Custom;", "Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidgetModel$RCStickModeState$JP;", "Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidgetModel$RCStickModeState$ProductDisconnected;", "Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidgetModel$RCStickModeState$USA;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class RCStickModeState {
        
        private RCStickModeState() {
            super();
        }
        
        /**
         * When product is disconnected
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidgetModel$RCStickModeState$ProductDisconnected;", "Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidgetModel$RCStickModeState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductDisconnected extends dji.v5.ux.core.panel.listitem.rcstickmode.RCStickModeListItemWidgetModel.RCStickModeState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.panel.listitem.rcstickmode.RCStickModeListItemWidgetModel.RCStickModeState.ProductDisconnected INSTANCE = null;
            
            private ProductDisconnected() {
                super();
            }
        }
        
        /**
         * When product is connected and stick mode is JP
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidgetModel$RCStickModeState$JP;", "Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidgetModel$RCStickModeState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class JP extends dji.v5.ux.core.panel.listitem.rcstickmode.RCStickModeListItemWidgetModel.RCStickModeState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.panel.listitem.rcstickmode.RCStickModeListItemWidgetModel.RCStickModeState.JP INSTANCE = null;
            
            private JP() {
                super();
            }
        }
        
        /**
         * When product is connected and stick mode is USA
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidgetModel$RCStickModeState$USA;", "Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidgetModel$RCStickModeState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class USA extends dji.v5.ux.core.panel.listitem.rcstickmode.RCStickModeListItemWidgetModel.RCStickModeState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.panel.listitem.rcstickmode.RCStickModeListItemWidgetModel.RCStickModeState.USA INSTANCE = null;
            
            private USA() {
                super();
            }
        }
        
        /**
         * When product is connected and stick mode is CH
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidgetModel$RCStickModeState$CH;", "Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidgetModel$RCStickModeState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class CH extends dji.v5.ux.core.panel.listitem.rcstickmode.RCStickModeListItemWidgetModel.RCStickModeState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.panel.listitem.rcstickmode.RCStickModeListItemWidgetModel.RCStickModeState.CH INSTANCE = null;
            
            private CH() {
                super();
            }
        }
        
        /**
         * When product is connected and stick mode is custom
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidgetModel$RCStickModeState$Custom;", "Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidgetModel$RCStickModeState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class Custom extends dji.v5.ux.core.panel.listitem.rcstickmode.RCStickModeListItemWidgetModel.RCStickModeState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.panel.listitem.rcstickmode.RCStickModeListItemWidgetModel.RCStickModeState.Custom INSTANCE = null;
            
            private Custom() {
                super();
            }
        }
    }
}