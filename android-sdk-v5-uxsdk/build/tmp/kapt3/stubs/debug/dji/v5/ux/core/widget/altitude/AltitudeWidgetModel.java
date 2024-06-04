package dji.v5.ux.core.widget.altitude;

import java.lang.System;

/**
 * Widget Model for the [AMSLAltitudeWidget] and [AGLAltitudeWidget] used to define
 * the underlying logic and communication.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0019B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0015\u001a\u00020\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0016H\u0014J\b\u0010\u0018\u001a\u00020\u0016H\u0014R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Ldji/v5/ux/core/widget/altitude/AltitudeWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "preferencesManager", "Ldji/v5/ux/core/communication/GlobalPreferencesInterface;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;Ldji/v5/ux/core/communication/GlobalPreferencesInterface;)V", "altitudeProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "", "altitudeState", "Lio/reactivex/rxjava3/core/Flowable;", "Ldji/v5/ux/core/widget/altitude/AltitudeWidgetModel$AltitudeState;", "getAltitudeState", "()Lio/reactivex/rxjava3/core/Flowable;", "altitudeStateProcessor", "takeOffLocationAltitudeProcessor", "unitTypeDataProcessor", "Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "inCleanup", "", "inSetup", "updateStates", "AltitudeState", "android-sdk-v5-uxsdk_debug"})
public final class AltitudeWidgetModel extends dji.v5.ux.core.base.WidgetModel {
    private final dji.v5.ux.core.communication.GlobalPreferencesInterface preferencesManager = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Double> altitudeProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Double> takeOffLocationAltitudeProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.util.UnitConversionUtil.UnitType> unitTypeDataProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.widget.altitude.AltitudeWidgetModel.AltitudeState> altitudeStateProcessor = null;
    
    @kotlin.jvm.JvmOverloads
    public AltitudeWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore, @org.jetbrains.annotations.Nullable
    dji.v5.ux.core.communication.GlobalPreferencesInterface preferencesManager) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.widget.altitude.AltitudeWidgetModel.AltitudeState> getAltitudeState() {
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
     * Class to represent states of Altitude
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Ldji/v5/ux/core/widget/altitude/AltitudeWidgetModel$AltitudeState;", "", "()V", "CurrentAltitude", "ProductDisconnected", "Ldji/v5/ux/core/widget/altitude/AltitudeWidgetModel$AltitudeState$CurrentAltitude;", "Ldji/v5/ux/core/widget/altitude/AltitudeWidgetModel$AltitudeState$ProductDisconnected;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class AltitudeState {
        
        private AltitudeState() {
            super();
        }
        
        /**
         * When product is disconnected
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/widget/altitude/AltitudeWidgetModel$AltitudeState$ProductDisconnected;", "Ldji/v5/ux/core/widget/altitude/AltitudeWidgetModel$AltitudeState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductDisconnected extends dji.v5.ux.core.widget.altitude.AltitudeWidgetModel.AltitudeState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.widget.altitude.AltitudeWidgetModel.AltitudeState.ProductDisconnected INSTANCE = null;
            
            private ProductDisconnected() {
                super();
            }
        }
        
        /**
         * When product is connected and altitude level is available
         *
         * @property altitudeAGL - Above Ground Level Altitude
         * @property altitudeAMSL - Above Mean Sea Level Altitude
         * @property unitType - Unit of altitude
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0019"}, d2 = {"Ldji/v5/ux/core/widget/altitude/AltitudeWidgetModel$AltitudeState$CurrentAltitude;", "Ldji/v5/ux/core/widget/altitude/AltitudeWidgetModel$AltitudeState;", "altitudeAGL", "", "altitudeAMSL", "unitType", "Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "(DDLdji/v5/ux/core/util/UnitConversionUtil$UnitType;)V", "getAltitudeAGL", "()D", "getAltitudeAMSL", "getUnitType", "()Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class CurrentAltitude extends dji.v5.ux.core.widget.altitude.AltitudeWidgetModel.AltitudeState {
            private final double altitudeAGL = 0.0;
            private final double altitudeAMSL = 0.0;
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType = null;
            
            /**
             * When product is connected and altitude level is available
             *
             * @property altitudeAGL - Above Ground Level Altitude
             * @property altitudeAMSL - Above Mean Sea Level Altitude
             * @property unitType - Unit of altitude
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.altitude.AltitudeWidgetModel.AltitudeState.CurrentAltitude copy(double altitudeAGL, double altitudeAMSL, @org.jetbrains.annotations.NotNull
            dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
                return null;
            }
            
            /**
             * When product is connected and altitude level is available
             *
             * @property altitudeAGL - Above Ground Level Altitude
             * @property altitudeAMSL - Above Mean Sea Level Altitude
             * @property unitType - Unit of altitude
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * When product is connected and altitude level is available
             *
             * @property altitudeAGL - Above Ground Level Altitude
             * @property altitudeAMSL - Above Mean Sea Level Altitude
             * @property unitType - Unit of altitude
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * When product is connected and altitude level is available
             *
             * @property altitudeAGL - Above Ground Level Altitude
             * @property altitudeAMSL - Above Mean Sea Level Altitude
             * @property unitType - Unit of altitude
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public CurrentAltitude(double altitudeAGL, double altitudeAMSL, @org.jetbrains.annotations.NotNull
            dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
                super();
            }
            
            public final double component1() {
                return 0.0;
            }
            
            public final double getAltitudeAGL() {
                return 0.0;
            }
            
            public final double component2() {
                return 0.0;
            }
            
            public final double getAltitudeAMSL() {
                return 0.0;
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.util.UnitConversionUtil.UnitType component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.util.UnitConversionUtil.UnitType getUnitType() {
                return null;
            }
        }
    }
}