package dji.v5.ux.flight.returnhome;

import java.lang.System;

/**
 * Widget Model for the [ReturnHomeWidget] used to define
 * the underlying logic and communication
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u000234B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ(\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\'2\u0006\u0010)\u001a\u00020\'2\u0006\u0010*\u001a\u00020\'H\u0002J\b\u0010+\u001a\u00020,H\u0014J\b\u0010-\u001a\u00020,H\u0014J\b\u0010.\u001a\u00020\u000bH\u0002J\u0006\u0010/\u001a\u000200J\u0006\u00101\u001a\u000200J\b\u00102\u001a\u00020,H\u0014R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001f8F\u00a2\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Ldji/v5/ux/flight/returnhome/ReturnHomeWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "preferencesManager", "Ldji/v5/ux/core/communication/GlobalPreferencesInterface;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;Ldji/v5/ux/core/communication/GlobalPreferencesInterface;)V", "areMotorsOnDataProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "", "autoRTHReasonProcessor", "Ldji/sdk/keyvalue/value/flightcontroller/FCAutoRTHReason;", "distanceToHome", "Ldji/v5/ux/flight/returnhome/ReturnHomeWidgetModel$ReturnHomeDistance;", "getDistanceToHome", "()Ldji/v5/ux/flight/returnhome/ReturnHomeWidgetModel$ReturnHomeDistance;", "flightModeProcessor", "Ldji/sdk/keyvalue/value/flightcontroller/FCFlightMode;", "isAutoLandingDataProcessor", "isCancelReturnToHomeDisabledProcessor", "isFlyingDataProcessor", "isGoingHomeDataProcessor", "isRTHAtCurrentAltitudeEnabled", "()Z", "rcModeDataProcessor", "Ldji/sdk/keyvalue/value/remotecontroller/RCMode;", "returnHomeDataProcessor", "Ldji/v5/ux/flight/returnhome/ReturnHomeWidgetModel$ReturnHomeState;", "returnHomeState", "Lio/reactivex/rxjava3/core/Flowable;", "getReturnHomeState", "()Lio/reactivex/rxjava3/core/Flowable;", "unitTypeProcessor", "Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "distanceBetween", "", "latitude1", "", "longitude1", "latitude2", "longitude2", "inCleanup", "", "inSetup", "isCancelReturnHomeDisabled", "performCancelReturnHomeAction", "Lio/reactivex/rxjava3/core/Completable;", "performReturnHomeAction", "updateStates", "ReturnHomeDistance", "ReturnHomeState", "android-sdk-v5-uxsdk_debug"})
public final class ReturnHomeWidgetModel extends dji.v5.ux.core.base.WidgetModel {
    private final dji.v5.ux.core.communication.GlobalPreferencesInterface preferencesManager = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> isGoingHomeDataProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> isFlyingDataProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> isAutoLandingDataProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> areMotorsOnDataProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.flight.returnhome.ReturnHomeWidgetModel.ReturnHomeState> returnHomeDataProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> isCancelReturnToHomeDisabledProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.remotecontroller.RCMode> rcModeDataProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.flightcontroller.FCFlightMode> flightModeProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.flightcontroller.FCAutoRTHReason> autoRTHReasonProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.util.UnitConversionUtil.UnitType> unitTypeProcessor = null;
    
    public ReturnHomeWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore, @org.jetbrains.annotations.Nullable
    dji.v5.ux.core.communication.GlobalPreferencesInterface preferencesManager) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.ux.flight.returnhome.ReturnHomeWidgetModel.ReturnHomeState> getReturnHomeState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.flight.returnhome.ReturnHomeWidgetModel.ReturnHomeDistance getDistanceToHome() {
        return null;
    }
    
    public final boolean isRTHAtCurrentAltitudeEnabled() {
        return false;
    }
    
    /**
     * Performs return to home action
     */
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Completable performReturnHomeAction() {
        return null;
    }
    
    /**
     * Performs cancel return to home action
     */
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Completable performCancelReturnHomeAction() {
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
    
    private final boolean isCancelReturnHomeDisabled() {
        return false;
    }
    
    private final float distanceBetween(double latitude1, double longitude1, double latitude2, double longitude2) {
        return 0.0F;
    }
    
    /**
     * The state of the aircraft
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Ldji/v5/ux/flight/returnhome/ReturnHomeWidgetModel$ReturnHomeState;", "", "(Ljava/lang/String;I)V", "READY_TO_RETURN_HOME", "RETURN_HOME_DISABLED", "RETURNING_TO_HOME", "FORCED_RETURNING_TO_HOME", "AUTO_LANDING", "DISCONNECTED", "android-sdk-v5-uxsdk_debug"})
    public static enum ReturnHomeState {
        /*public static final*/ READY_TO_RETURN_HOME /* = new READY_TO_RETURN_HOME() */,
        /*public static final*/ RETURN_HOME_DISABLED /* = new RETURN_HOME_DISABLED() */,
        /*public static final*/ RETURNING_TO_HOME /* = new RETURNING_TO_HOME() */,
        /*public static final*/ FORCED_RETURNING_TO_HOME /* = new FORCED_RETURNING_TO_HOME() */,
        /*public static final*/ AUTO_LANDING /* = new AUTO_LANDING() */,
        /*public static final*/ DISCONNECTED /* = new DISCONNECTED() */;
        
        ReturnHomeState() {
        }
    }
    
    /**
     * The measurements describing the return to home behavior
     *
     * @property distanceToHome The distance to home in meters
     * @property currentHeight The current height of the aircraft in [unitType]
     * @property goToHomeHeight The height at which the aircraft will return to home in [unitType]
     * @property unitType The unit type of [currentHeight] and [goToHomeHeight]
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Ldji/v5/ux/flight/returnhome/ReturnHomeWidgetModel$ReturnHomeDistance;", "", "distanceToHome", "", "currentHeight", "goToHomeHeight", "unitType", "Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "(FFFLdji/v5/ux/core/util/UnitConversionUtil$UnitType;)V", "getCurrentHeight", "()F", "getDistanceToHome", "getGoToHomeHeight", "getUnitType", "()Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
    public static final class ReturnHomeDistance {
        private final float distanceToHome = 0.0F;
        private final float currentHeight = 0.0F;
        private final float goToHomeHeight = 0.0F;
        @org.jetbrains.annotations.NotNull
        private final dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType = null;
        
        /**
         * The measurements describing the return to home behavior
         *
         * @property distanceToHome The distance to home in meters
         * @property currentHeight The current height of the aircraft in [unitType]
         * @property goToHomeHeight The height at which the aircraft will return to home in [unitType]
         * @property unitType The unit type of [currentHeight] and [goToHomeHeight]
         */
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.flight.returnhome.ReturnHomeWidgetModel.ReturnHomeDistance copy(float distanceToHome, float currentHeight, float goToHomeHeight, @org.jetbrains.annotations.NotNull
        dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
            return null;
        }
        
        /**
         * The measurements describing the return to home behavior
         *
         * @property distanceToHome The distance to home in meters
         * @property currentHeight The current height of the aircraft in [unitType]
         * @property goToHomeHeight The height at which the aircraft will return to home in [unitType]
         * @property unitType The unit type of [currentHeight] and [goToHomeHeight]
         */
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        /**
         * The measurements describing the return to home behavior
         *
         * @property distanceToHome The distance to home in meters
         * @property currentHeight The current height of the aircraft in [unitType]
         * @property goToHomeHeight The height at which the aircraft will return to home in [unitType]
         * @property unitType The unit type of [currentHeight] and [goToHomeHeight]
         */
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        /**
         * The measurements describing the return to home behavior
         *
         * @property distanceToHome The distance to home in meters
         * @property currentHeight The current height of the aircraft in [unitType]
         * @property goToHomeHeight The height at which the aircraft will return to home in [unitType]
         * @property unitType The unit type of [currentHeight] and [goToHomeHeight]
         */
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public ReturnHomeDistance(float distanceToHome, float currentHeight, float goToHomeHeight, @org.jetbrains.annotations.NotNull
        dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
            super();
        }
        
        public final float component1() {
            return 0.0F;
        }
        
        public final float getDistanceToHome() {
            return 0.0F;
        }
        
        public final float component2() {
            return 0.0F;
        }
        
        public final float getCurrentHeight() {
            return 0.0F;
        }
        
        public final float component3() {
            return 0.0F;
        }
        
        public final float getGoToHomeHeight() {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.core.util.UnitConversionUtil.UnitType component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.core.util.UnitConversionUtil.UnitType getUnitType() {
            return null;
        }
    }
}