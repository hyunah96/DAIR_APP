package dji.v5.ux.core.panel.listitem.novicemode;

import java.lang.System;

/**
 * Widget Model for the [NoviceModeListItemWidget] used to define
 * the underlying logic and communication
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0017B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0012H\u0014J\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0012H\u0014R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Ldji/v5/ux/core/panel/listitem/novicemode/NoviceModeListItemWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;)V", "noviceModeDataProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "", "kotlin.jvm.PlatformType", "noviceModeState", "Lio/reactivex/rxjava3/core/Flowable;", "Ldji/v5/ux/core/panel/listitem/novicemode/NoviceModeListItemWidgetModel$NoviceModeState;", "getNoviceModeState", "()Lio/reactivex/rxjava3/core/Flowable;", "noviceModeStateDataProcessor", "inCleanup", "", "inSetup", "toggleNoviceMode", "Lio/reactivex/rxjava3/core/Completable;", "updateStates", "NoviceModeState", "android-sdk-v5-uxsdk_debug"})
public final class NoviceModeListItemWidgetModel extends dji.v5.ux.core.base.WidgetModel {
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> noviceModeDataProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.panel.listitem.novicemode.NoviceModeListItemWidgetModel.NoviceModeState> noviceModeStateDataProcessor = null;
    
    public NoviceModeListItemWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.panel.listitem.novicemode.NoviceModeListItemWidgetModel.NoviceModeState> getNoviceModeState() {
        return null;
    }
    
    @java.lang.Override
    protected void inSetup() {
    }
    
    @java.lang.Override
    protected void updateStates() {
    }
    
    @java.lang.Override
    protected void inCleanup() {
    }
    
    /**
     * Toggle novice mode on/off
     */
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Completable toggleNoviceMode() {
        return null;
    }
    
    /**
     * Class represents states of Novice Mode Item
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Ldji/v5/ux/core/panel/listitem/novicemode/NoviceModeListItemWidgetModel$NoviceModeState;", "", "()V", "Disabled", "Enabled", "ProductDisconnected", "Ldji/v5/ux/core/panel/listitem/novicemode/NoviceModeListItemWidgetModel$NoviceModeState$Disabled;", "Ldji/v5/ux/core/panel/listitem/novicemode/NoviceModeListItemWidgetModel$NoviceModeState$Enabled;", "Ldji/v5/ux/core/panel/listitem/novicemode/NoviceModeListItemWidgetModel$NoviceModeState$ProductDisconnected;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class NoviceModeState {
        
        private NoviceModeState() {
            super();
        }
        
        /**
         * When product is disconnected
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/novicemode/NoviceModeListItemWidgetModel$NoviceModeState$ProductDisconnected;", "Ldji/v5/ux/core/panel/listitem/novicemode/NoviceModeListItemWidgetModel$NoviceModeState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductDisconnected extends dji.v5.ux.core.panel.listitem.novicemode.NoviceModeListItemWidgetModel.NoviceModeState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.panel.listitem.novicemode.NoviceModeListItemWidgetModel.NoviceModeState.ProductDisconnected INSTANCE = null;
            
            private ProductDisconnected() {
                super();
            }
        }
        
        /**
         * When novice (beginner) mode is enabled
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/novicemode/NoviceModeListItemWidgetModel$NoviceModeState$Enabled;", "Ldji/v5/ux/core/panel/listitem/novicemode/NoviceModeListItemWidgetModel$NoviceModeState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class Enabled extends dji.v5.ux.core.panel.listitem.novicemode.NoviceModeListItemWidgetModel.NoviceModeState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.panel.listitem.novicemode.NoviceModeListItemWidgetModel.NoviceModeState.Enabled INSTANCE = null;
            
            private Enabled() {
                super();
            }
        }
        
        /**
         * When novice (beginner) mode is disabled
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/novicemode/NoviceModeListItemWidgetModel$NoviceModeState$Disabled;", "Ldji/v5/ux/core/panel/listitem/novicemode/NoviceModeListItemWidgetModel$NoviceModeState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class Disabled extends dji.v5.ux.core.panel.listitem.novicemode.NoviceModeListItemWidgetModel.NoviceModeState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.panel.listitem.novicemode.NoviceModeListItemWidgetModel.NoviceModeState.Disabled INSTANCE = null;
            
            private Disabled() {
                super();
            }
        }
    }
}