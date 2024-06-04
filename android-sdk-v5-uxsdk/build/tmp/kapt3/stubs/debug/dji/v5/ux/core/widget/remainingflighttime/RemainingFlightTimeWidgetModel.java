package dji.v5.ux.core.widget.remainingflighttime;

import java.lang.System;

/**
 * Remaining Flight Time Widget Model
 *
 *
 * Widget Model for the [RemainingFlightTimeWidget] used to define the
 * underlying logic and communication
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001dB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u001aH\u0014J\b\u0010\u001c\u001a\u00020\u001aH\u0014R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Ldji/v5/ux/core/widget/remainingflighttime/RemainingFlightTimeWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;)V", "chargeRemainingProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "", "goHomeAssessmentProcessor", "Ldji/sdk/keyvalue/value/flightcontroller/LowBatteryRTHInfo;", "kotlin.jvm.PlatformType", "isAircraftFlying", "Lio/reactivex/rxjava3/core/Flowable;", "", "()Lio/reactivex/rxjava3/core/Flowable;", "isAircraftFlyingDataProcessor", "lowBatteryThresholdProcessor", "remainingFlightProcessor", "remainingFlightTimeData", "Ldji/v5/ux/core/widget/remainingflighttime/RemainingFlightTimeWidgetModel$RemainingFlightTimeData;", "getRemainingFlightTimeData", "remainingFlightTimeDataProcessor", "seriousLowBatteryThresholdProcessor", "inCleanup", "", "inSetup", "updateStates", "RemainingFlightTimeData", "android-sdk-v5-uxsdk_debug"})
public final class RemainingFlightTimeWidgetModel extends dji.v5.ux.core.base.WidgetModel {
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Integer> chargeRemainingProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.flightcontroller.LowBatteryRTHInfo> goHomeAssessmentProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Integer> seriousLowBatteryThresholdProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Integer> lowBatteryThresholdProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Integer> remainingFlightProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.widget.remainingflighttime.RemainingFlightTimeWidgetModel.RemainingFlightTimeData> remainingFlightTimeDataProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> isAircraftFlyingDataProcessor = null;
    
    public RemainingFlightTimeWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore) {
        super(null, null);
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
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.widget.remainingflighttime.RemainingFlightTimeWidgetModel.RemainingFlightTimeData> getRemainingFlightTimeData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<java.lang.Boolean> isAircraftFlying() {
        return null;
    }
    
    /**
     * Class representing data for remaining flight time
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u001e"}, d2 = {"Ldji/v5/ux/core/widget/remainingflighttime/RemainingFlightTimeWidgetModel$RemainingFlightTimeData;", "", "remainingCharge", "", "batteryNeededToLand", "batteryNeededToGoHome", "seriousLowBatteryThreshold", "lowBatteryThreshold", "flightTime", "(IIIIII)V", "getBatteryNeededToGoHome", "()I", "getBatteryNeededToLand", "getFlightTime", "getLowBatteryThreshold", "getRemainingCharge", "getSeriousLowBatteryThreshold", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "android-sdk-v5-uxsdk_debug"})
    public static final class RemainingFlightTimeData {
        
        /**
         * Remaining battery charge in percent
         */
        private final int remainingCharge = 0;
        
        /**
         * Battery charge required to land
         */
        private final int batteryNeededToLand = 0;
        
        /**
         * Battery charge needed to go home
         */
        private final int batteryNeededToGoHome = 0;
        
        /**
         * Serious low battery level threshold
         */
        private final int seriousLowBatteryThreshold = 0;
        
        /**
         * Low battery level threshold
         */
        private final int lowBatteryThreshold = 0;
        
        /**
         * Flight time in micro seconds
         */
        private final int flightTime = 0;
        
        /**
         * Class representing data for remaining flight time
         */
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.core.widget.remainingflighttime.RemainingFlightTimeWidgetModel.RemainingFlightTimeData copy(int remainingCharge, int batteryNeededToLand, int batteryNeededToGoHome, int seriousLowBatteryThreshold, int lowBatteryThreshold, int flightTime) {
            return null;
        }
        
        /**
         * Class representing data for remaining flight time
         */
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Class representing data for remaining flight time
         */
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        /**
         * Class representing data for remaining flight time
         */
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public RemainingFlightTimeData(int remainingCharge, int batteryNeededToLand, int batteryNeededToGoHome, int seriousLowBatteryThreshold, int lowBatteryThreshold, int flightTime) {
            super();
        }
        
        /**
         * Remaining battery charge in percent
         */
        public final int component1() {
            return 0;
        }
        
        /**
         * Remaining battery charge in percent
         */
        public final int getRemainingCharge() {
            return 0;
        }
        
        /**
         * Battery charge required to land
         */
        public final int component2() {
            return 0;
        }
        
        /**
         * Battery charge required to land
         */
        public final int getBatteryNeededToLand() {
            return 0;
        }
        
        /**
         * Battery charge needed to go home
         */
        public final int component3() {
            return 0;
        }
        
        /**
         * Battery charge needed to go home
         */
        public final int getBatteryNeededToGoHome() {
            return 0;
        }
        
        /**
         * Serious low battery level threshold
         */
        public final int component4() {
            return 0;
        }
        
        /**
         * Serious low battery level threshold
         */
        public final int getSeriousLowBatteryThreshold() {
            return 0;
        }
        
        /**
         * Low battery level threshold
         */
        public final int component5() {
            return 0;
        }
        
        /**
         * Low battery level threshold
         */
        public final int getLowBatteryThreshold() {
            return 0;
        }
        
        /**
         * Flight time in micro seconds
         */
        public final int component6() {
            return 0;
        }
        
        /**
         * Flight time in micro seconds
         */
        public final int getFlightTime() {
            return 0;
        }
    }
}