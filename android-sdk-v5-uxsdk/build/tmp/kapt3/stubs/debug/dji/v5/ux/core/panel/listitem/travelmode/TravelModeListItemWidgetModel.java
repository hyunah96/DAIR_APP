package dji.v5.ux.core.panel.listitem.travelmode;

import java.lang.System;

/**
 * Widget Model for the [TravelModeListItemWidget] used to define
 * the underlying logic and communication
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0012H\u0014J\b\u0010\u0014\u001a\u00020\u0012H\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Ldji/v5/ux/core/panel/listitem/travelmode/TravelModeListItemWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;)V", "travelModeState", "Lio/reactivex/rxjava3/core/Flowable;", "Ldji/v5/ux/core/panel/listitem/travelmode/TravelModeListItemWidgetModel$TravelModeState;", "getTravelModeState", "()Lio/reactivex/rxjava3/core/Flowable;", "travelModeStateProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "enterTravelMode", "Lio/reactivex/rxjava3/core/Completable;", "exitTravelMode", "inCleanup", "", "inSetup", "updateStates", "TravelModeState", "android-sdk-v5-uxsdk_debug"})
public final class TravelModeListItemWidgetModel extends dji.v5.ux.core.base.WidgetModel {
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.panel.listitem.travelmode.TravelModeListItemWidgetModel.TravelModeState> travelModeStateProcessor = null;
    
    public TravelModeListItemWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.panel.listitem.travelmode.TravelModeListItemWidgetModel.TravelModeState> getTravelModeState() {
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
    
    /**
     * Enter travel mode
     */
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Completable enterTravelMode() {
        return null;
    }
    
    /**
     * Exit travel mode
     */
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Completable exitTravelMode() {
        return null;
    }
    
    /**
     * Class to represent states of travel mode state
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Ldji/v5/ux/core/panel/listitem/travelmode/TravelModeListItemWidgetModel$TravelModeState;", "", "()V", "Active", "Inactive", "NotSupported", "ProductDisconnected", "Ldji/v5/ux/core/panel/listitem/travelmode/TravelModeListItemWidgetModel$TravelModeState$Active;", "Ldji/v5/ux/core/panel/listitem/travelmode/TravelModeListItemWidgetModel$TravelModeState$Inactive;", "Ldji/v5/ux/core/panel/listitem/travelmode/TravelModeListItemWidgetModel$TravelModeState$NotSupported;", "Ldji/v5/ux/core/panel/listitem/travelmode/TravelModeListItemWidgetModel$TravelModeState$ProductDisconnected;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class TravelModeState {
        
        private TravelModeState() {
            super();
        }
        
        /**
         * When product is disconnected
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/travelmode/TravelModeListItemWidgetModel$TravelModeState$ProductDisconnected;", "Ldji/v5/ux/core/panel/listitem/travelmode/TravelModeListItemWidgetModel$TravelModeState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductDisconnected extends dji.v5.ux.core.panel.listitem.travelmode.TravelModeListItemWidgetModel.TravelModeState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.panel.listitem.travelmode.TravelModeListItemWidgetModel.TravelModeState.ProductDisconnected INSTANCE = null;
            
            private ProductDisconnected() {
                super();
            }
        }
        
        /**
         * When product is connected and travel mode is not supported
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/travelmode/TravelModeListItemWidgetModel$TravelModeState$NotSupported;", "Ldji/v5/ux/core/panel/listitem/travelmode/TravelModeListItemWidgetModel$TravelModeState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class NotSupported extends dji.v5.ux.core.panel.listitem.travelmode.TravelModeListItemWidgetModel.TravelModeState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.panel.listitem.travelmode.TravelModeListItemWidgetModel.TravelModeState.NotSupported INSTANCE = null;
            
            private NotSupported() {
                super();
            }
        }
        
        /**
         * When product is connected and landing gear is in transport mode
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/travelmode/TravelModeListItemWidgetModel$TravelModeState$Active;", "Ldji/v5/ux/core/panel/listitem/travelmode/TravelModeListItemWidgetModel$TravelModeState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class Active extends dji.v5.ux.core.panel.listitem.travelmode.TravelModeListItemWidgetModel.TravelModeState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.panel.listitem.travelmode.TravelModeListItemWidgetModel.TravelModeState.Active INSTANCE = null;
            
            private Active() {
                super();
            }
        }
        
        /**
         * When product is connected and landing gear is not in transport mode
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/travelmode/TravelModeListItemWidgetModel$TravelModeState$Inactive;", "Ldji/v5/ux/core/panel/listitem/travelmode/TravelModeListItemWidgetModel$TravelModeState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class Inactive extends dji.v5.ux.core.panel.listitem.travelmode.TravelModeListItemWidgetModel.TravelModeState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.panel.listitem.travelmode.TravelModeListItemWidgetModel.TravelModeState.Inactive INSTANCE = null;
            
            private Inactive() {
                super();
            }
        }
    }
}