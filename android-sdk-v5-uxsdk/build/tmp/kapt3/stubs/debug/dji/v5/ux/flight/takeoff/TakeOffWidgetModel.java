package dji.v5.ux.flight.takeoff;

import java.lang.System;

/**
 * Widget Model for the [TakeOffWidget] used to define
 * the underlying logic and communication
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002@AB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u00101\u001a\u00020\u001e2\u0006\u00102\u001a\u000203H\u0002J\b\u0010\u001f\u001a\u000203H\u0002J\b\u00104\u001a\u000205H\u0014J\b\u00106\u001a\u000205H\u0014J\b\u00107\u001a\u00020\u000bH\u0002J\u0006\u00108\u001a\u000209J\u0006\u0010:\u001a\u000209J\u0006\u0010;\u001a\u000209J\u0006\u0010<\u001a\u000209J\u0006\u0010=\u001a\u000209J\b\u0010>\u001a\u000205H\u0002J\b\u0010?\u001a\u000205H\u0014R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00198F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u001aR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u001e8F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010#\u001a\u00020\u001e8F\u00a2\u0006\u0006\u001a\u0004\b$\u0010 R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\'\u001a\b\u0012\u0004\u0012\u00020(0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010)\u001a\u00020\u001e8F\u00a2\u0006\u0006\u001a\u0004\b*\u0010 R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00198F\u00a2\u0006\u0006\u001a\u0004\b-\u0010\u001aR\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020,0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u0002000\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006B"}, d2 = {"Ldji/v5/ux/flight/takeoff/TakeOffWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "preferencesManager", "Ldji/v5/ux/core/communication/GlobalPreferencesInterface;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;Ldji/v5/ux/core/communication/GlobalPreferencesInterface;)V", "areMotorsOnDataProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "", "autoRTHReasonProcessor", "Ldji/sdk/keyvalue/value/flightcontroller/FCAutoRTHReason;", "flightModeProcessor", "Ldji/sdk/keyvalue/value/flightcontroller/FCFlightMode;", "flightModeStringDataProcessor", "", "forceLandingHeightDataProcessor", "", "isAutoLandingDataProcessor", "isCancelAutoLandingDisabledProcessor", "isFlyingDataProcessor", "isGoingHomeDataProcessor", "isInAttiMode", "Lio/reactivex/rxjava3/core/Flowable;", "()Lio/reactivex/rxjava3/core/Flowable;", "isInAttiModeDataProcessor", "isLandingConfNeededDataProcessor", "landHeight", "Ldji/v5/ux/flight/takeoff/TakeOffWidgetModel$Height;", "getLandHeight", "()Ldji/v5/ux/flight/takeoff/TakeOffWidgetModel$Height;", "landingProtectionStateDataProcessor", "Ldji/sdk/keyvalue/value/flightassistant/LandingProtectionState;", "precisionTakeOffHeight", "getPrecisionTakeOffHeight", "productModelProcessor", "Ldji/sdk/keyvalue/value/product/ProductType;", "rcModeDataProcessor", "Ldji/sdk/keyvalue/value/remotecontroller/RCMode;", "takeOffHeight", "getTakeOffHeight", "takeOffLandingState", "Ldji/v5/ux/flight/takeoff/TakeOffWidgetModel$TakeOffLandingState;", "getTakeOffLandingState", "takeOffLandingStateDataProcessor", "unitTypeProcessor", "Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "getHeightFromValue", "value", "", "inCleanup", "", "inSetup", "isCancelAutoLandingDisabled", "performCancelLandingAction", "Lio/reactivex/rxjava3/core/Completable;", "performLandingAction", "performLandingConfirmationAction", "performPrecisionTakeOffAction", "performTakeOffAction", "updateAutoLandingData", "updateStates", "Height", "TakeOffLandingState", "android-sdk-v5-uxsdk_debug"})
public final class TakeOffWidgetModel extends dji.v5.ux.core.base.WidgetModel {
    private final dji.v5.ux.core.communication.GlobalPreferencesInterface preferencesManager = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> isFlyingDataProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> isAutoLandingDataProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> isLandingConfNeededDataProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Integer> forceLandingHeightDataProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> areMotorsOnDataProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> isGoingHomeDataProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.String> flightModeStringDataProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> isCancelAutoLandingDisabledProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.flightcontroller.FCAutoRTHReason> autoRTHReasonProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.remotecontroller.RCMode> rcModeDataProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.product.ProductType> productModelProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.util.UnitConversionUtil.UnitType> unitTypeProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.flightassistant.LandingProtectionState> landingProtectionStateDataProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.flightcontroller.FCFlightMode> flightModeProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.flight.takeoff.TakeOffWidgetModel.TakeOffLandingState> takeOffLandingStateDataProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> isInAttiModeDataProcessor = null;
    
    public TakeOffWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore, @org.jetbrains.annotations.Nullable
    dji.v5.ux.core.communication.GlobalPreferencesInterface preferencesManager) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.ux.flight.takeoff.TakeOffWidgetModel.TakeOffLandingState> getTakeOffLandingState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<java.lang.Boolean> isInAttiMode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.flight.takeoff.TakeOffWidgetModel.Height getTakeOffHeight() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.flight.takeoff.TakeOffWidgetModel.Height getPrecisionTakeOffHeight() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.flight.takeoff.TakeOffWidgetModel.Height getLandHeight() {
        return null;
    }
    
    /**
     * Performs take off action
     */
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Completable performTakeOffAction() {
        return null;
    }
    
    /**
     * Performs precision take off action
     */
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Completable performPrecisionTakeOffAction() {
        return null;
    }
    
    /**
     * Performs landing action
     */
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Completable performLandingAction() {
        return null;
    }
    
    /**
     * Performs cancel landing action
     */
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Completable performCancelLandingAction() {
        return null;
    }
    
    /**
     * Performs the landing confirmation action. This allows aircraft to land when
     * landing confirmation is received.
     */
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Completable performLandingConfirmationAction() {
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
    
    private final void updateAutoLandingData() {
    }
    
    private final boolean isCancelAutoLandingDisabled() {
        return false;
    }
    
    private final dji.v5.ux.flight.takeoff.TakeOffWidgetModel.Height getHeightFromValue(float value) {
        return null;
    }
    
    private final float getLandHeight() {
        return 0.0F;
    }
    
    /**
     * The state of the aircraft
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\r"}, d2 = {"Ldji/v5/ux/flight/takeoff/TakeOffWidgetModel$TakeOffLandingState;", "", "(Ljava/lang/String;I)V", "READY_TO_TAKE_OFF", "READY_TO_LAND", "AUTO_LANDING", "FORCED_AUTO_LANDING", "WAITING_FOR_LANDING_CONFIRMATION", "UNSAFE_TO_LAND", "RETURNING_TO_HOME", "TAKE_OFF_DISABLED", "LAND_DISABLED", "DISCONNECTED", "android-sdk-v5-uxsdk_debug"})
    public static enum TakeOffLandingState {
        /*public static final*/ READY_TO_TAKE_OFF /* = new READY_TO_TAKE_OFF() */,
        /*public static final*/ READY_TO_LAND /* = new READY_TO_LAND() */,
        /*public static final*/ AUTO_LANDING /* = new AUTO_LANDING() */,
        /*public static final*/ FORCED_AUTO_LANDING /* = new FORCED_AUTO_LANDING() */,
        /*public static final*/ WAITING_FOR_LANDING_CONFIRMATION /* = new WAITING_FOR_LANDING_CONFIRMATION() */,
        /*public static final*/ UNSAFE_TO_LAND /* = new UNSAFE_TO_LAND() */,
        /*public static final*/ RETURNING_TO_HOME /* = new RETURNING_TO_HOME() */,
        /*public static final*/ TAKE_OFF_DISABLED /* = new TAKE_OFF_DISABLED() */,
        /*public static final*/ LAND_DISABLED /* = new LAND_DISABLED() */,
        /*public static final*/ DISCONNECTED /* = new DISCONNECTED() */;
        
        TakeOffLandingState() {
        }
    }
    
    /**
     * Represents a height and the height's unit.
     *
     * @property height The current height of the aircraft in [unitType]
     * @property unitType The unit type of [height]
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Ldji/v5/ux/flight/takeoff/TakeOffWidgetModel$Height;", "", "height", "", "unitType", "Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "(FLdji/v5/ux/core/util/UnitConversionUtil$UnitType;)V", "getHeight", "()F", "getUnitType", "()Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
    public static final class Height {
        private final float height = 0.0F;
        @org.jetbrains.annotations.NotNull
        private final dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType = null;
        
        /**
         * Represents a height and the height's unit.
         *
         * @property height The current height of the aircraft in [unitType]
         * @property unitType The unit type of [height]
         */
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.flight.takeoff.TakeOffWidgetModel.Height copy(float height, @org.jetbrains.annotations.NotNull
        dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
            return null;
        }
        
        /**
         * Represents a height and the height's unit.
         *
         * @property height The current height of the aircraft in [unitType]
         * @property unitType The unit type of [height]
         */
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Represents a height and the height's unit.
         *
         * @property height The current height of the aircraft in [unitType]
         * @property unitType The unit type of [height]
         */
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        /**
         * Represents a height and the height's unit.
         *
         * @property height The current height of the aircraft in [unitType]
         * @property unitType The unit type of [height]
         */
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public Height(float height, @org.jetbrains.annotations.NotNull
        dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
            super();
        }
        
        public final float component1() {
            return 0.0F;
        }
        
        public final float getHeight() {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.core.util.UnitConversionUtil.UnitType component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.core.util.UnitConversionUtil.UnitType getUnitType() {
            return null;
        }
    }
}