package dji.v5.ux.core.widget.flightmode;

import java.lang.System;

/**
 * Widget Model for the [FlightModeWidget] used to define
 * the underlying logic and communication
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0011H\u0014J\b\u0010\u0013\u001a\u00020\u0011H\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Ldji/v5/ux/core/widget/flightmode/FlightModeWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;)V", "flightModeState", "Lio/reactivex/rxjava3/core/Flowable;", "Ldji/v5/ux/core/widget/flightmode/FlightModeWidgetModel$FlightModeState;", "getFlightModeState", "()Lio/reactivex/rxjava3/core/Flowable;", "flightModeStateProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "flightModeStringProcessor", "", "inCleanup", "", "inSetup", "updateStates", "FlightModeState", "android-sdk-v5-uxsdk_debug"})
public final class FlightModeWidgetModel extends dji.v5.ux.core.base.WidgetModel {
    private final dji.v5.ux.core.util.DataProcessor<java.lang.String> flightModeStringProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.widget.flightmode.FlightModeWidgetModel.FlightModeState> flightModeStateProcessor = null;
    
    public FlightModeWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.widget.flightmode.FlightModeWidgetModel.FlightModeState> getFlightModeState() {
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
     * Class to represent states of flight mode
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Ldji/v5/ux/core/widget/flightmode/FlightModeWidgetModel$FlightModeState;", "", "()V", "FlightModeUpdated", "ProductDisconnected", "Ldji/v5/ux/core/widget/flightmode/FlightModeWidgetModel$FlightModeState$FlightModeUpdated;", "Ldji/v5/ux/core/widget/flightmode/FlightModeWidgetModel$FlightModeState$ProductDisconnected;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class FlightModeState {
        
        private FlightModeState() {
            super();
        }
        
        /**
         * When the product is disconnected
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/widget/flightmode/FlightModeWidgetModel$FlightModeState$ProductDisconnected;", "Ldji/v5/ux/core/widget/flightmode/FlightModeWidgetModel$FlightModeState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductDisconnected extends dji.v5.ux.core.widget.flightmode.FlightModeWidgetModel.FlightModeState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.widget.flightmode.FlightModeWidgetModel.FlightModeState.ProductDisconnected INSTANCE = null;
            
            private ProductDisconnected() {
                super();
            }
        }
        
        /**
         * When the product is connected and current flight mode string
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Ldji/v5/ux/core/widget/flightmode/FlightModeWidgetModel$FlightModeState$FlightModeUpdated;", "Ldji/v5/ux/core/widget/flightmode/FlightModeWidgetModel$FlightModeState;", "flightModeString", "", "(Ljava/lang/String;)V", "getFlightModeString", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "android-sdk-v5-uxsdk_debug"})
        public static final class FlightModeUpdated extends dji.v5.ux.core.widget.flightmode.FlightModeWidgetModel.FlightModeState {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String flightModeString = null;
            
            /**
             * When the product is connected and current flight mode string
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.flightmode.FlightModeWidgetModel.FlightModeState.FlightModeUpdated copy(@org.jetbrains.annotations.NotNull
            java.lang.String flightModeString) {
                return null;
            }
            
            /**
             * When the product is connected and current flight mode string
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * When the product is connected and current flight mode string
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * When the product is connected and current flight mode string
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public FlightModeUpdated(@org.jetbrains.annotations.NotNull
            java.lang.String flightModeString) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getFlightModeString() {
                return null;
            }
        }
    }
}