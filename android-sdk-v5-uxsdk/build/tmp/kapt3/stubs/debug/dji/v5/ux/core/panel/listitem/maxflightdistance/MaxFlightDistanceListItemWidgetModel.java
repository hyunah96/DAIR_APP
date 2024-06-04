package dji.v5.ux.core.panel.listitem.maxflightdistance;

import java.lang.System;

/**
 * Widget Model for the [MaxFlightDistanceListItemWidget] used to define
 * the underlying logic and communication
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001&B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0019\u001a\u00020\rH\u0002J\b\u0010\u001a\u001a\u00020\rH\u0002J\b\u0010\u001b\u001a\u00020\rH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001dH\u0014J\u000e\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\rJ\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\rJ\u0006\u0010$\u001a\u00020\"J\b\u0010%\u001a\u00020\u001dH\u0014R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "preferencesManager", "Ldji/v5/ux/core/communication/GlobalPreferencesInterface;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;Ldji/v5/ux/core/communication/GlobalPreferencesInterface;)V", "maxFlightDistanceEnabledProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "", "maxFlightDistanceProcessor", "", "maxFlightDistanceRangeProcessor", "Ldji/sdk/keyvalue/value/common/IntValueConfig;", "maxFlightDistanceState", "Lio/reactivex/rxjava3/core/Flowable;", "Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidgetModel$MaxFlightDistanceState;", "getMaxFlightDistanceState", "()Lio/reactivex/rxjava3/core/Flowable;", "maxFlightDistanceStateProcessor", "noviceModeProcessor", "unitTypeProcessor", "Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "getMaxFlightDistanceValue", "getMaxLimit", "getMinLimit", "inCleanup", "", "inSetup", "isInputInRange", "input", "setMaxFlightDistance", "Lio/reactivex/rxjava3/core/Completable;", "flightDistance", "toggleFlightDistanceAvailability", "updateStates", "MaxFlightDistanceState", "android-sdk-v5-uxsdk_debug"})
public final class MaxFlightDistanceListItemWidgetModel extends dji.v5.ux.core.base.WidgetModel {
    private final dji.v5.ux.core.communication.GlobalPreferencesInterface preferencesManager = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> maxFlightDistanceEnabledProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Integer> maxFlightDistanceProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.common.IntValueConfig> maxFlightDistanceRangeProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.util.UnitConversionUtil.UnitType> unitTypeProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.panel.listitem.maxflightdistance.MaxFlightDistanceListItemWidgetModel.MaxFlightDistanceState> maxFlightDistanceStateProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> noviceModeProcessor = null;
    
    public MaxFlightDistanceListItemWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore, @org.jetbrains.annotations.Nullable
    dji.v5.ux.core.communication.GlobalPreferencesInterface preferencesManager) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.panel.listitem.maxflightdistance.MaxFlightDistanceListItemWidgetModel.MaxFlightDistanceState> getMaxFlightDistanceState() {
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
    
    private final int getMaxFlightDistanceValue() {
        return 0;
    }
    
    private final int getMinLimit() {
        return 0;
    }
    
    private final int getMaxLimit() {
        return 0;
    }
    
    /**
     * Enable or disable max flight distance
     *
     * @return Completable to determine status of action
     */
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Completable toggleFlightDistanceAvailability() {
        return null;
    }
    
    /**
     * Set max flight distance
     *
     * @return Completable to determine status of action
     */
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Completable setMaxFlightDistance(int flightDistance) {
        return null;
    }
    
    /**
     * Check if input is in range
     *
     * @return Boolean
     * true - if the input is in range
     * false - if the input is out of range
     */
    public final boolean isInputInRange(int input) {
        return false;
    }
    
    /**
     * Class represents states of Max Flight Distance State
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidgetModel$MaxFlightDistanceState;", "", "()V", "Disabled", "MaxFlightDistanceValue", "NoviceMode", "ProductDisconnected", "Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidgetModel$MaxFlightDistanceState$Disabled;", "Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidgetModel$MaxFlightDistanceState$MaxFlightDistanceValue;", "Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidgetModel$MaxFlightDistanceState$NoviceMode;", "Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidgetModel$MaxFlightDistanceState$ProductDisconnected;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class MaxFlightDistanceState {
        
        private MaxFlightDistanceState() {
            super();
        }
        
        /**
         * When product is disconnected
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidgetModel$MaxFlightDistanceState$ProductDisconnected;", "Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidgetModel$MaxFlightDistanceState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductDisconnected extends dji.v5.ux.core.panel.listitem.maxflightdistance.MaxFlightDistanceListItemWidgetModel.MaxFlightDistanceState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.panel.listitem.maxflightdistance.MaxFlightDistanceListItemWidgetModel.MaxFlightDistanceState.ProductDisconnected INSTANCE = null;
            
            private ProductDisconnected() {
                super();
            }
        }
        
        /**
         * When max flight distance limit is disabled
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidgetModel$MaxFlightDistanceState$Disabled;", "Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidgetModel$MaxFlightDistanceState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class Disabled extends dji.v5.ux.core.panel.listitem.maxflightdistance.MaxFlightDistanceListItemWidgetModel.MaxFlightDistanceState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.panel.listitem.maxflightdistance.MaxFlightDistanceListItemWidgetModel.MaxFlightDistanceState.Disabled INSTANCE = null;
            
            private Disabled() {
                super();
            }
        }
        
        /**
         * When product is in beginner mode
         * @property unitType - current unit system used
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidgetModel$MaxFlightDistanceState$NoviceMode;", "Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidgetModel$MaxFlightDistanceState;", "unitType", "Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "(Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;)V", "getUnitType", "()Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class NoviceMode extends dji.v5.ux.core.panel.listitem.maxflightdistance.MaxFlightDistanceListItemWidgetModel.MaxFlightDistanceState {
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType = null;
            
            /**
             * When product is in beginner mode
             * @property unitType - current unit system used
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.maxflightdistance.MaxFlightDistanceListItemWidgetModel.MaxFlightDistanceState.NoviceMode copy(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
                return null;
            }
            
            /**
             * When product is in beginner mode
             * @property unitType - current unit system used
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * When product is in beginner mode
             * @property unitType - current unit system used
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * When product is in beginner mode
             * @property unitType - current unit system used
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public NoviceMode(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.util.UnitConversionUtil.UnitType component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.util.UnitConversionUtil.UnitType getUnitType() {
                return null;
            }
        }
        
        /**
         * Flight distance value with unit
         *
         * @property flightDistanceLimit - current flight distance limit
         * @property minDistanceLimit - flight distance limit range minimum
         * @property maxDistanceLimit - flight distance limit range maximum
         * @property unitType - current unit system used
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidgetModel$MaxFlightDistanceState$MaxFlightDistanceValue;", "Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidgetModel$MaxFlightDistanceState;", "flightDistanceLimit", "", "minDistanceLimit", "maxDistanceLimit", "unitType", "Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "(IIILdji/v5/ux/core/util/UnitConversionUtil$UnitType;)V", "getFlightDistanceLimit", "()I", "getMaxDistanceLimit", "getMinDistanceLimit", "getUnitType", "()Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class MaxFlightDistanceValue extends dji.v5.ux.core.panel.listitem.maxflightdistance.MaxFlightDistanceListItemWidgetModel.MaxFlightDistanceState {
            private final int flightDistanceLimit = 0;
            private final int minDistanceLimit = 0;
            private final int maxDistanceLimit = 0;
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType = null;
            
            /**
             * Flight distance value with unit
             *
             * @property flightDistanceLimit - current flight distance limit
             * @property minDistanceLimit - flight distance limit range minimum
             * @property maxDistanceLimit - flight distance limit range maximum
             * @property unitType - current unit system used
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.maxflightdistance.MaxFlightDistanceListItemWidgetModel.MaxFlightDistanceState.MaxFlightDistanceValue copy(int flightDistanceLimit, int minDistanceLimit, int maxDistanceLimit, @org.jetbrains.annotations.NotNull
            dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
                return null;
            }
            
            /**
             * Flight distance value with unit
             *
             * @property flightDistanceLimit - current flight distance limit
             * @property minDistanceLimit - flight distance limit range minimum
             * @property maxDistanceLimit - flight distance limit range maximum
             * @property unitType - current unit system used
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Flight distance value with unit
             *
             * @property flightDistanceLimit - current flight distance limit
             * @property minDistanceLimit - flight distance limit range minimum
             * @property maxDistanceLimit - flight distance limit range maximum
             * @property unitType - current unit system used
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Flight distance value with unit
             *
             * @property flightDistanceLimit - current flight distance limit
             * @property minDistanceLimit - flight distance limit range minimum
             * @property maxDistanceLimit - flight distance limit range maximum
             * @property unitType - current unit system used
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public MaxFlightDistanceValue(int flightDistanceLimit, int minDistanceLimit, int maxDistanceLimit, @org.jetbrains.annotations.NotNull
            dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            public final int getFlightDistanceLimit() {
                return 0;
            }
            
            public final int component2() {
                return 0;
            }
            
            public final int getMinDistanceLimit() {
                return 0;
            }
            
            public final int component3() {
                return 0;
            }
            
            public final int getMaxDistanceLimit() {
                return 0;
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
}