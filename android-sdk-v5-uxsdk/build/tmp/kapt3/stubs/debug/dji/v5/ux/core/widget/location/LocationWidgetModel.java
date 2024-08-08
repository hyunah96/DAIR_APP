package dji.v5.ux.core.widget.location;

import java.lang.System;

/**
 * Widget Model for the [LocationWidget] used to define
 * the underlying logic and communication
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0017B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0014H\u0014J\b\u0010\u0016\u001a\u00020\u0014H\u0014R\u001f\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Ldji/v5/ux/core/widget/location/LocationWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;)V", "aircraftLocationProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "Ldji/sdk/keyvalue/value/common/LocationCoordinate2D;", "kotlin.jvm.PlatformType", "getAircraftLocationProcessor", "()Ldji/v5/ux/core/util/DataProcessor;", "locationState", "Lio/reactivex/rxjava3/core/Flowable;", "Ldji/v5/ux/core/widget/location/LocationWidgetModel$LocationState;", "getLocationState", "()Lio/reactivex/rxjava3/core/Flowable;", "locationStateProcessor", "inCleanup", "", "inSetup", "updateStates", "LocationState", "android-sdk-v5-uxsdk_debug"})
public final class LocationWidgetModel extends dji.v5.ux.core.base.WidgetModel {
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.common.LocationCoordinate2D> aircraftLocationProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.widget.location.LocationWidgetModel.LocationState> locationStateProcessor = null;
    
    public LocationWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.common.LocationCoordinate2D> getAircraftLocationProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.widget.location.LocationWidgetModel.LocationState> getLocationState() {
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
     * Class to represent states of location widget
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Ldji/v5/ux/core/widget/location/LocationWidgetModel$LocationState;", "", "()V", "CurrentLocation", "LocationUnavailable", "ProductDisconnected", "Ldji/v5/ux/core/widget/location/LocationWidgetModel$LocationState$CurrentLocation;", "Ldji/v5/ux/core/widget/location/LocationWidgetModel$LocationState$LocationUnavailable;", "Ldji/v5/ux/core/widget/location/LocationWidgetModel$LocationState$ProductDisconnected;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class LocationState {
        
        private LocationState() {
            super();
        }
        
        /**
         * Product is disconnected
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/widget/location/LocationWidgetModel$LocationState$ProductDisconnected;", "Ldji/v5/ux/core/widget/location/LocationWidgetModel$LocationState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductDisconnected extends dji.v5.ux.core.widget.location.LocationWidgetModel.LocationState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.widget.location.LocationWidgetModel.LocationState.ProductDisconnected INSTANCE = null;
            
            private ProductDisconnected() {
                super();
            }
        }
        
        /**
         * Product is connected but GPS location fix is unavailable
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/widget/location/LocationWidgetModel$LocationState$LocationUnavailable;", "Ldji/v5/ux/core/widget/location/LocationWidgetModel$LocationState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class LocationUnavailable extends dji.v5.ux.core.widget.location.LocationWidgetModel.LocationState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.widget.location.LocationWidgetModel.LocationState.LocationUnavailable INSTANCE = null;
            
            private LocationUnavailable() {
                super();
            }
        }
        
        /**
         * Reflecting the current location
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Ldji/v5/ux/core/widget/location/LocationWidgetModel$LocationState$CurrentLocation;", "Ldji/v5/ux/core/widget/location/LocationWidgetModel$LocationState;", "latitude", "", "longitude", "(DD)V", "getLatitude", "()D", "getLongitude", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class CurrentLocation extends dji.v5.ux.core.widget.location.LocationWidgetModel.LocationState {
            private final double latitude = 0.0;
            private final double longitude = 0.0;
            
            /**
             * Reflecting the current location
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.location.LocationWidgetModel.LocationState.CurrentLocation copy(double latitude, double longitude) {
                return null;
            }
            
            /**
             * Reflecting the current location
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Reflecting the current location
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Reflecting the current location
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public CurrentLocation(double latitude, double longitude) {
                super();
            }
            
            public final double component1() {
                return 0.0;
            }
            
            public final double getLatitude() {
                return 0.0;
            }
            
            public final double component2() {
                return 0.0;
            }
            
            public final double getLongitude() {
                return 0.0;
            }
        }
    }
}