package dji.v5.ux.core.widget.battery;

import java.lang.System;

/**
 * Widget Model for [BatteryWidget] used to define the
 * underlying logic and communication
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u000278B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010%\u001a\u00020&2\u000e\u0010\'\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\rH\u0002J8\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020&H\u0002J\b\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u000203H\u0014J\b\u00104\u001a\u000203H\u0014J\b\u00105\u001a\u000203H\u0014J\f\u00106\u001a\u00020\u001f*\u00020\u001cH\u0002R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00180\u00180\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u001c0\u001c0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001d\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u001c0\u001c0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010 \u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u001f0\u001f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010!\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u001f0\u001f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\"\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u001f0\u001f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010#\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u001f0\u001f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010$\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u001f0\u001f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Ldji/v5/ux/core/widget/battery/BatteryWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;)V", "batteryConnectedProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "", "kotlin.jvm.PlatformType", "batteryNeededToGoHomeProcessor", "batteryOverviewsProcessor", "", "Ldji/sdk/keyvalue/value/battery/BatteryOverviewValue;", "batteryPercentageProcessor1", "batteryPercentageProcessor2", "batteryState", "Lio/reactivex/rxjava3/core/Flowable;", "Ldji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryState;", "getBatteryState", "()Lio/reactivex/rxjava3/core/Flowable;", "batteryStateProcessor", "batteryThresholdBehaviorProcessor", "Ldji/sdk/keyvalue/value/flightcontroller/FCBatteryThresholdBehavior;", "batteryVoltageProcessor1", "batteryVoltageProcessor2", "batteryWarningRecordProcessor1", "Ldji/sdk/keyvalue/value/battery/BatteryException;", "batteryWarningRecordProcessor2", "isAircraftFlyingDataProcessor", "", "isAnyBatteryDisconnectedProcessor", "isCellDamagedDisconnectedProcessor", "isFirmwareDifferenceDetectedProcessor", "isLowCellVoltageDetectedProcessor", "isVoltageDifferenceDetectedProcessor", "calculateAverageVoltage", "", "cellVoltages", "calculateBatteryStatus", "Ldji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryStatus;", "batteryException", "batteryThresholdBehavior", "percentage", "goHomeBattery", "isFlying", "voltage", "findConnectedBattery", "Ldji/sdk/keyvalue/value/common/ComponentIndexType;", "inCleanup", "", "inSetup", "updateStates", "isError", "BatteryState", "BatteryStatus", "android-sdk-v5-uxsdk_debug"})
public final class BatteryWidgetModel extends dji.v5.ux.core.base.WidgetModel {
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Integer> batteryPercentageProcessor1 = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Integer> batteryPercentageProcessor2 = null;
    private final dji.v5.ux.core.util.DataProcessor<java.util.List<java.lang.Integer>> batteryVoltageProcessor1 = null;
    private final dji.v5.ux.core.util.DataProcessor<java.util.List<java.lang.Integer>> batteryVoltageProcessor2 = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.battery.BatteryException> batteryWarningRecordProcessor1 = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.battery.BatteryException> batteryWarningRecordProcessor2 = null;
    private final dji.v5.ux.core.util.DataProcessor<java.util.List<dji.sdk.keyvalue.value.battery.BatteryOverviewValue>> batteryOverviewsProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Integer> batteryConnectedProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> isAnyBatteryDisconnectedProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> isCellDamagedDisconnectedProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> isFirmwareDifferenceDetectedProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> isVoltageDifferenceDetectedProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> isLowCellVoltageDetectedProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryState> batteryStateProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.flightcontroller.FCBatteryThresholdBehavior> batteryThresholdBehaviorProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Integer> batteryNeededToGoHomeProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> isAircraftFlyingDataProcessor = null;
    
    public BatteryWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryState> getBatteryState() {
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
    
    private final dji.sdk.keyvalue.value.common.ComponentIndexType findConnectedBattery() {
        return null;
    }
    
    private final float calculateAverageVoltage(java.util.List<java.lang.Integer> cellVoltages) {
        return 0.0F;
    }
    
    private final dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus calculateBatteryStatus(dji.sdk.keyvalue.value.battery.BatteryException batteryException, dji.sdk.keyvalue.value.flightcontroller.FCBatteryThresholdBehavior batteryThresholdBehavior, int percentage, int goHomeBattery, boolean isFlying, float voltage) {
        return null;
    }
    
    private final boolean isError(dji.sdk.keyvalue.value.battery.BatteryException $this$isError) {
        return false;
    }
    
    /**
     * Class representing the current state of the battery
     * based on information received from the product
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Ldji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryState;", "", "()V", "AggregateBatteryState", "DisconnectedState", "DualBatteryState", "SingleBatteryState", "Ldji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryState$AggregateBatteryState;", "Ldji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryState$DisconnectedState;", "Ldji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryState$DualBatteryState;", "Ldji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryState$SingleBatteryState;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class BatteryState {
        
        private BatteryState() {
            super();
        }
        
        /**
         * Product is currently disconnected
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryState$DisconnectedState;", "Ldji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class DisconnectedState extends dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryState.DisconnectedState INSTANCE = null;
            
            private DisconnectedState() {
                super();
            }
        }
        
        /**
         * Product with single battery is connected. The status includes
         *
         * @property percentageRemaining - battery remaining in percentage
         * @property voltageLevel - voltage level of the battery
         * @property batteryStatus - [BatteryStatus] instance representing the battery
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Ldji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryState$SingleBatteryState;", "Ldji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryState;", "percentageRemaining", "", "voltageLevel", "", "batteryStatus", "Ldji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryStatus;", "(IFLdji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryStatus;)V", "getBatteryStatus", "()Ldji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryStatus;", "getPercentageRemaining", "()I", "getVoltageLevel", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class SingleBatteryState extends dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryState {
            private final int percentageRemaining = 0;
            private final float voltageLevel = 0.0F;
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus batteryStatus = null;
            
            /**
             * Product with single battery is connected. The status includes
             *
             * @property percentageRemaining - battery remaining in percentage
             * @property voltageLevel - voltage level of the battery
             * @property batteryStatus - [BatteryStatus] instance representing the battery
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryState.SingleBatteryState copy(int percentageRemaining, float voltageLevel, @org.jetbrains.annotations.NotNull
            dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus batteryStatus) {
                return null;
            }
            
            /**
             * Product with single battery is connected. The status includes
             *
             * @property percentageRemaining - battery remaining in percentage
             * @property voltageLevel - voltage level of the battery
             * @property batteryStatus - [BatteryStatus] instance representing the battery
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Product with single battery is connected. The status includes
             *
             * @property percentageRemaining - battery remaining in percentage
             * @property voltageLevel - voltage level of the battery
             * @property batteryStatus - [BatteryStatus] instance representing the battery
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Product with single battery is connected. The status includes
             *
             * @property percentageRemaining - battery remaining in percentage
             * @property voltageLevel - voltage level of the battery
             * @property batteryStatus - [BatteryStatus] instance representing the battery
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public SingleBatteryState(int percentageRemaining, float voltageLevel, @org.jetbrains.annotations.NotNull
            dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus batteryStatus) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            public final int getPercentageRemaining() {
                return 0;
            }
            
            public final float component2() {
                return 0.0F;
            }
            
            public final float getVoltageLevel() {
                return 0.0F;
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus getBatteryStatus() {
                return null;
            }
        }
        
        /**
         * Product with dual battery is connected. The status includes
         *
         * @property percentageRemaining1 - battery remaining in percentage of battery 1
         * @property voltageLevel1 - voltage level of the battery 1
         * @property batteryStatus1 - [BatteryStatus] instance representing the battery 1
         * @property percentageRemaining2 - battery remaining in percentage of battery 2
         * @property voltageLevel2 - voltage level of the battery 2
         * @property batteryStatus2 - [BatteryStatus] instance representing the battery 2
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0007H\u00c6\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u00d6\u0003J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013\u00a8\u0006#"}, d2 = {"Ldji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryState$DualBatteryState;", "Ldji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryState;", "percentageRemaining1", "", "voltageLevel1", "", "batteryStatus1", "Ldji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryStatus;", "percentageRemaining2", "voltageLevel2", "batteryStatus2", "(IFLdji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryStatus;IFLdji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryStatus;)V", "getBatteryStatus1", "()Ldji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryStatus;", "getBatteryStatus2", "getPercentageRemaining1", "()I", "getPercentageRemaining2", "getVoltageLevel1", "()F", "getVoltageLevel2", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class DualBatteryState extends dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryState {
            private final int percentageRemaining1 = 0;
            private final float voltageLevel1 = 0.0F;
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus batteryStatus1 = null;
            private final int percentageRemaining2 = 0;
            private final float voltageLevel2 = 0.0F;
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus batteryStatus2 = null;
            
            /**
             * Product with dual battery is connected. The status includes
             *
             * @property percentageRemaining1 - battery remaining in percentage of battery 1
             * @property voltageLevel1 - voltage level of the battery 1
             * @property batteryStatus1 - [BatteryStatus] instance representing the battery 1
             * @property percentageRemaining2 - battery remaining in percentage of battery 2
             * @property voltageLevel2 - voltage level of the battery 2
             * @property batteryStatus2 - [BatteryStatus] instance representing the battery 2
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryState.DualBatteryState copy(int percentageRemaining1, float voltageLevel1, @org.jetbrains.annotations.NotNull
            dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus batteryStatus1, int percentageRemaining2, float voltageLevel2, @org.jetbrains.annotations.NotNull
            dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus batteryStatus2) {
                return null;
            }
            
            /**
             * Product with dual battery is connected. The status includes
             *
             * @property percentageRemaining1 - battery remaining in percentage of battery 1
             * @property voltageLevel1 - voltage level of the battery 1
             * @property batteryStatus1 - [BatteryStatus] instance representing the battery 1
             * @property percentageRemaining2 - battery remaining in percentage of battery 2
             * @property voltageLevel2 - voltage level of the battery 2
             * @property batteryStatus2 - [BatteryStatus] instance representing the battery 2
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Product with dual battery is connected. The status includes
             *
             * @property percentageRemaining1 - battery remaining in percentage of battery 1
             * @property voltageLevel1 - voltage level of the battery 1
             * @property batteryStatus1 - [BatteryStatus] instance representing the battery 1
             * @property percentageRemaining2 - battery remaining in percentage of battery 2
             * @property voltageLevel2 - voltage level of the battery 2
             * @property batteryStatus2 - [BatteryStatus] instance representing the battery 2
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Product with dual battery is connected. The status includes
             *
             * @property percentageRemaining1 - battery remaining in percentage of battery 1
             * @property voltageLevel1 - voltage level of the battery 1
             * @property batteryStatus1 - [BatteryStatus] instance representing the battery 1
             * @property percentageRemaining2 - battery remaining in percentage of battery 2
             * @property voltageLevel2 - voltage level of the battery 2
             * @property batteryStatus2 - [BatteryStatus] instance representing the battery 2
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public DualBatteryState(int percentageRemaining1, float voltageLevel1, @org.jetbrains.annotations.NotNull
            dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus batteryStatus1, int percentageRemaining2, float voltageLevel2, @org.jetbrains.annotations.NotNull
            dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus batteryStatus2) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            public final int getPercentageRemaining1() {
                return 0;
            }
            
            public final float component2() {
                return 0.0F;
            }
            
            public final float getVoltageLevel1() {
                return 0.0F;
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus getBatteryStatus1() {
                return null;
            }
            
            public final int component4() {
                return 0;
            }
            
            public final int getPercentageRemaining2() {
                return 0;
            }
            
            public final float component5() {
                return 0.0F;
            }
            
            public final float getVoltageLevel2() {
                return 0.0F;
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus component6() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus getBatteryStatus2() {
                return null;
            }
        }
        
        /**
         * Product with more than 2 batteries is connected. The status includes
         *
         * @property aggregatePercentage - aggregate percentage remaining from all batteries
         * @property aggregateVoltage - aggregate voltage level of all batteries
         * @property aggregateBatteryStatus - [BatteryStatus] instance representing the aggregate status
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Ldji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryState$AggregateBatteryState;", "Ldji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryState;", "aggregatePercentage", "", "aggregateVoltage", "", "aggregateBatteryStatus", "Ldji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryStatus;", "(IFLdji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryStatus;)V", "getAggregateBatteryStatus", "()Ldji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryStatus;", "getAggregatePercentage", "()I", "getAggregateVoltage", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class AggregateBatteryState extends dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryState {
            private final int aggregatePercentage = 0;
            private final float aggregateVoltage = 0.0F;
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus aggregateBatteryStatus = null;
            
            /**
             * Product with more than 2 batteries is connected. The status includes
             *
             * @property aggregatePercentage - aggregate percentage remaining from all batteries
             * @property aggregateVoltage - aggregate voltage level of all batteries
             * @property aggregateBatteryStatus - [BatteryStatus] instance representing the aggregate status
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryState.AggregateBatteryState copy(int aggregatePercentage, float aggregateVoltage, @org.jetbrains.annotations.NotNull
            dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus aggregateBatteryStatus) {
                return null;
            }
            
            /**
             * Product with more than 2 batteries is connected. The status includes
             *
             * @property aggregatePercentage - aggregate percentage remaining from all batteries
             * @property aggregateVoltage - aggregate voltage level of all batteries
             * @property aggregateBatteryStatus - [BatteryStatus] instance representing the aggregate status
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Product with more than 2 batteries is connected. The status includes
             *
             * @property aggregatePercentage - aggregate percentage remaining from all batteries
             * @property aggregateVoltage - aggregate voltage level of all batteries
             * @property aggregateBatteryStatus - [BatteryStatus] instance representing the aggregate status
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Product with more than 2 batteries is connected. The status includes
             *
             * @property aggregatePercentage - aggregate percentage remaining from all batteries
             * @property aggregateVoltage - aggregate voltage level of all batteries
             * @property aggregateBatteryStatus - [BatteryStatus] instance representing the aggregate status
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public AggregateBatteryState(int aggregatePercentage, float aggregateVoltage, @org.jetbrains.annotations.NotNull
            dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus aggregateBatteryStatus) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            public final int getAggregatePercentage() {
                return 0;
            }
            
            public final float component2() {
                return 0.0F;
            }
            
            public final float getAggregateVoltage() {
                return 0.0F;
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus getAggregateBatteryStatus() {
                return null;
            }
        }
    }
    
    /**
     * Enum representing the state of each battery in the battery bank
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\u000e"}, d2 = {"Ldji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryStatus;", "", "index", "", "(Ljava/lang/String;II)V", "getIndex", "()I", "NORMAL", "WARNING_LEVEL_1", "WARNING_LEVEL_2", "ERROR", "OVERHEATING", "UNKNOWN", "Companion", "android-sdk-v5-uxsdk_debug"})
    public static enum BatteryStatus {
        /*public static final*/ NORMAL /* = new NORMAL(0) */,
        /*public static final*/ WARNING_LEVEL_1 /* = new WARNING_LEVEL_1(0) */,
        /*public static final*/ WARNING_LEVEL_2 /* = new WARNING_LEVEL_2(0) */,
        /*public static final*/ ERROR /* = new ERROR(0) */,
        /*public static final*/ OVERHEATING /* = new OVERHEATING(0) */,
        /*public static final*/ UNKNOWN /* = new UNKNOWN(0) */;
        private final int index = 0;
        @org.jetbrains.annotations.NotNull
        public static final dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus.Companion Companion = null;
        @org.jetbrains.annotations.NotNull
        private static final dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus[] values = null;
        
        BatteryStatus(int index) {
        }
        
        public final int getIndex() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public static final dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus[] getValues() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @kotlin.jvm.JvmStatic
        public static final dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus find(@androidx.annotation.IntRange(from = 0L, to = 5L)
        int index) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\t\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Ldji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryStatus$Companion;", "", "()V", "values", "", "Ldji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryStatus;", "getValues$annotations", "getValues", "()[Ldji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryStatus;", "[Ldji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryStatus;", "find", "index", "", "android-sdk-v5-uxsdk_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus[] getValues() {
                return null;
            }
            
            @kotlin.jvm.JvmStatic
            @java.lang.Deprecated
            public static void getValues$annotations() {
            }
            
            @org.jetbrains.annotations.NotNull
            @kotlin.jvm.JvmStatic
            public final dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus find(@androidx.annotation.IntRange(from = 0L, to = 5L)
            int index) {
                return null;
            }
        }
    }
}