package dji.v5.ux.core.panel.listitem.returntohomealtitude;

import java.lang.System;

/**
 * Widget Model for the [ReturnToHomeAltitudeListItemWidget] used to define
 * the underlying logic and communication
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001&B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0019\u001a\u00020\u000bH\u0002J\b\u0010\u001a\u001a\u00020\u000bH\u0002J\b\u0010\u001b\u001a\u00020\u000bH\u0002J\b\u0010\u001c\u001a\u00020\u000bH\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0014J\b\u0010\u001f\u001a\u00020\u001eH\u0014J\u000e\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000bJ\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u000bJ\b\u0010%\u001a\u00020\u001eH\u0014R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "preferencesManager", "Ldji/v5/ux/core/communication/GlobalPreferencesInterface;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;Ldji/v5/ux/core/communication/GlobalPreferencesInterface;)V", "maxFlightAltitudeProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "", "maxFlightHeightRangeProcessor", "Ldji/sdk/keyvalue/value/common/IntValueConfig;", "noviceModeProcessor", "", "returnToHomeAltitudeProcessor", "returnToHomeAltitudeState", "Lio/reactivex/rxjava3/core/Flowable;", "Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidgetModel$ReturnToHomeAltitudeState;", "getReturnToHomeAltitudeState", "()Lio/reactivex/rxjava3/core/Flowable;", "returnToHomeAltitudeStateProcessor", "unitTypeProcessor", "Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "getMaxAltitudeLimitByUnit", "getMaxLimit", "getMinLimit", "getReturnToHomeAltitudeValue", "inCleanup", "", "inSetup", "isInputInRange", "input", "setReturnToHomeAltitude", "Lio/reactivex/rxjava3/core/Completable;", "returnToHomeAltitude", "updateStates", "ReturnToHomeAltitudeState", "android-sdk-v5-uxsdk_debug"})
public final class ReturnToHomeAltitudeListItemWidgetModel extends dji.v5.ux.core.base.WidgetModel {
    private final dji.v5.ux.core.communication.GlobalPreferencesInterface preferencesManager = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Integer> maxFlightAltitudeProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Integer> returnToHomeAltitudeProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.util.UnitConversionUtil.UnitType> unitTypeProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.panel.listitem.returntohomealtitude.ReturnToHomeAltitudeListItemWidgetModel.ReturnToHomeAltitudeState> returnToHomeAltitudeStateProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> noviceModeProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.common.IntValueConfig> maxFlightHeightRangeProcessor = null;
    
    public ReturnToHomeAltitudeListItemWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore, @org.jetbrains.annotations.Nullable
    dji.v5.ux.core.communication.GlobalPreferencesInterface preferencesManager) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.panel.listitem.returntohomealtitude.ReturnToHomeAltitudeListItemWidgetModel.ReturnToHomeAltitudeState> getReturnToHomeAltitudeState() {
        return null;
    }
    
    @java.lang.Override
    protected void inSetup() {
    }
    
    @java.lang.Override
    protected void updateStates() {
    }
    
    private final int getMaxAltitudeLimitByUnit() {
        return 0;
    }
    
    @java.lang.Override
    protected void inCleanup() {
    }
    
    private final int getReturnToHomeAltitudeValue() {
        return 0;
    }
    
    private final int getMinLimit() {
        return 0;
    }
    
    private final int getMaxLimit() {
        return 0;
    }
    
    /**
     * Set return to home altitude
     *
     * @return Completable to determine status of action
     */
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Completable setReturnToHomeAltitude(int returnToHomeAltitude) {
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
     * Class represents states of Return To Home Altitude List Item
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidgetModel$ReturnToHomeAltitudeState;", "", "()V", "NoviceMode", "ProductDisconnected", "ReturnToHomeAltitudeValue", "Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidgetModel$ReturnToHomeAltitudeState$NoviceMode;", "Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidgetModel$ReturnToHomeAltitudeState$ProductDisconnected;", "Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidgetModel$ReturnToHomeAltitudeState$ReturnToHomeAltitudeValue;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class ReturnToHomeAltitudeState {
        
        private ReturnToHomeAltitudeState() {
            super();
        }
        
        /**
         * When product is disconnected
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidgetModel$ReturnToHomeAltitudeState$ProductDisconnected;", "Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidgetModel$ReturnToHomeAltitudeState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductDisconnected extends dji.v5.ux.core.panel.listitem.returntohomealtitude.ReturnToHomeAltitudeListItemWidgetModel.ReturnToHomeAltitudeState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.panel.listitem.returntohomealtitude.ReturnToHomeAltitudeListItemWidgetModel.ReturnToHomeAltitudeState.ProductDisconnected INSTANCE = null;
            
            private ProductDisconnected() {
                super();
            }
        }
        
        /**
         * When product is in beginner mode
         * @property unitType - current unit system used
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidgetModel$ReturnToHomeAltitudeState$NoviceMode;", "Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidgetModel$ReturnToHomeAltitudeState;", "unitType", "Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "(Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;)V", "getUnitType", "()Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class NoviceMode extends dji.v5.ux.core.panel.listitem.returntohomealtitude.ReturnToHomeAltitudeListItemWidgetModel.ReturnToHomeAltitudeState {
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType = null;
            
            /**
             * When product is in beginner mode
             * @property unitType - current unit system used
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.returntohomealtitude.ReturnToHomeAltitudeListItemWidgetModel.ReturnToHomeAltitudeState.NoviceMode copy(@org.jetbrains.annotations.NotNull
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
         * Return to home value and range
         * along with unit
         * @property returnToHomeAltitude - Return to home altitude
         * @property minLimit - Minimum limit of return to home altitude
         * @property maxLimit - Maximum limit of return to home altitude
         * @property unitType - Unit of values
         * @property maxFlightAltitude - Maximum permitted flight altitude.
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001e"}, d2 = {"Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidgetModel$ReturnToHomeAltitudeState$ReturnToHomeAltitudeValue;", "Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidgetModel$ReturnToHomeAltitudeState;", "returnToHomeAltitude", "", "minLimit", "maxLimit", "unitType", "Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "maxFlightAltitude", "(IIILdji/v5/ux/core/util/UnitConversionUtil$UnitType;I)V", "getMaxFlightAltitude", "()I", "getMaxLimit", "getMinLimit", "getReturnToHomeAltitude", "getUnitType", "()Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class ReturnToHomeAltitudeValue extends dji.v5.ux.core.panel.listitem.returntohomealtitude.ReturnToHomeAltitudeListItemWidgetModel.ReturnToHomeAltitudeState {
            private final int returnToHomeAltitude = 0;
            private final int minLimit = 0;
            private final int maxLimit = 0;
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType = null;
            private final int maxFlightAltitude = 0;
            
            /**
             * Return to home value and range
             * along with unit
             * @property returnToHomeAltitude - Return to home altitude
             * @property minLimit - Minimum limit of return to home altitude
             * @property maxLimit - Maximum limit of return to home altitude
             * @property unitType - Unit of values
             * @property maxFlightAltitude - Maximum permitted flight altitude.
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.returntohomealtitude.ReturnToHomeAltitudeListItemWidgetModel.ReturnToHomeAltitudeState.ReturnToHomeAltitudeValue copy(int returnToHomeAltitude, int minLimit, int maxLimit, @org.jetbrains.annotations.NotNull
            dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType, int maxFlightAltitude) {
                return null;
            }
            
            /**
             * Return to home value and range
             * along with unit
             * @property returnToHomeAltitude - Return to home altitude
             * @property minLimit - Minimum limit of return to home altitude
             * @property maxLimit - Maximum limit of return to home altitude
             * @property unitType - Unit of values
             * @property maxFlightAltitude - Maximum permitted flight altitude.
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Return to home value and range
             * along with unit
             * @property returnToHomeAltitude - Return to home altitude
             * @property minLimit - Minimum limit of return to home altitude
             * @property maxLimit - Maximum limit of return to home altitude
             * @property unitType - Unit of values
             * @property maxFlightAltitude - Maximum permitted flight altitude.
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Return to home value and range
             * along with unit
             * @property returnToHomeAltitude - Return to home altitude
             * @property minLimit - Minimum limit of return to home altitude
             * @property maxLimit - Maximum limit of return to home altitude
             * @property unitType - Unit of values
             * @property maxFlightAltitude - Maximum permitted flight altitude.
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public ReturnToHomeAltitudeValue(int returnToHomeAltitude, int minLimit, int maxLimit, @org.jetbrains.annotations.NotNull
            dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType, int maxFlightAltitude) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            public final int getReturnToHomeAltitude() {
                return 0;
            }
            
            public final int component2() {
                return 0;
            }
            
            public final int getMinLimit() {
                return 0;
            }
            
            public final int component3() {
                return 0;
            }
            
            public final int getMaxLimit() {
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
            
            public final int component5() {
                return 0;
            }
            
            public final int getMaxFlightAltitude() {
                return 0;
            }
        }
    }
}