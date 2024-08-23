package dji.v5.ux.core.panel.listitem.rcbattery;

import java.lang.System;

/**
 * Widget Model for the [RCBatteryListItemWidget] used to define
 * the underlying logic and communication
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0013H\u0014J\b\u0010\u0015\u001a\u00020\u0013H\u0014R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Ldji/v5/ux/core/panel/listitem/rcbattery/RCBatteryListItemWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;)V", "rcBatteryLevelProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "Ldji/sdk/keyvalue/value/remotecontroller/BatteryInfo;", "rcBatteryState", "Lio/reactivex/rxjava3/core/Flowable;", "Ldji/v5/ux/core/panel/listitem/rcbattery/RCBatteryListItemWidgetModel$RCBatteryState;", "getRcBatteryState", "()Lio/reactivex/rxjava3/core/Flowable;", "rcBatteryStateProcessor", "rcConnectionProcessor", "", "inCleanup", "", "inSetup", "updateStates", "RCBatteryState", "android-sdk-v5-uxsdk_debug"})
public final class RCBatteryListItemWidgetModel extends dji.v5.ux.core.base.WidgetModel {
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.remotecontroller.BatteryInfo> rcBatteryLevelProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.panel.listitem.rcbattery.RCBatteryListItemWidgetModel.RCBatteryState> rcBatteryStateProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> rcConnectionProcessor = null;
    
    public RCBatteryListItemWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.panel.listitem.rcbattery.RCBatteryListItemWidgetModel.RCBatteryState> getRcBatteryState() {
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
     * Class to represent states of RCBatteryListItem
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Ldji/v5/ux/core/panel/listitem/rcbattery/RCBatteryListItemWidgetModel$RCBatteryState;", "", "()V", "Low", "Normal", "RCDisconnected", "Ldji/v5/ux/core/panel/listitem/rcbattery/RCBatteryListItemWidgetModel$RCBatteryState$Low;", "Ldji/v5/ux/core/panel/listitem/rcbattery/RCBatteryListItemWidgetModel$RCBatteryState$Normal;", "Ldji/v5/ux/core/panel/listitem/rcbattery/RCBatteryListItemWidgetModel$RCBatteryState$RCDisconnected;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class RCBatteryState {
        
        private RCBatteryState() {
            super();
        }
        
        /**
         * When remote controller is disconnected
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/rcbattery/RCBatteryListItemWidgetModel$RCBatteryState$RCDisconnected;", "Ldji/v5/ux/core/panel/listitem/rcbattery/RCBatteryListItemWidgetModel$RCBatteryState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class RCDisconnected extends dji.v5.ux.core.panel.listitem.rcbattery.RCBatteryListItemWidgetModel.RCBatteryState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.panel.listitem.rcbattery.RCBatteryListItemWidgetModel.RCBatteryState.RCDisconnected INSTANCE = null;
            
            private RCDisconnected() {
                super();
            }
        }
        
        /**
         * When product is connected and rc battery is normal
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Ldji/v5/ux/core/panel/listitem/rcbattery/RCBatteryListItemWidgetModel$RCBatteryState$Normal;", "Ldji/v5/ux/core/panel/listitem/rcbattery/RCBatteryListItemWidgetModel$RCBatteryState;", "remainingChargePercent", "", "(I)V", "getRemainingChargePercent", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class Normal extends dji.v5.ux.core.panel.listitem.rcbattery.RCBatteryListItemWidgetModel.RCBatteryState {
            private final int remainingChargePercent = 0;
            
            /**
             * When product is connected and rc battery is normal
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.rcbattery.RCBatteryListItemWidgetModel.RCBatteryState.Normal copy(int remainingChargePercent) {
                return null;
            }
            
            /**
             * When product is connected and rc battery is normal
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * When product is connected and rc battery is normal
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * When product is connected and rc battery is normal
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public Normal(int remainingChargePercent) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            public final int getRemainingChargePercent() {
                return 0;
            }
        }
        
        /**
         * When product is connected and rc battery is critically low
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Ldji/v5/ux/core/panel/listitem/rcbattery/RCBatteryListItemWidgetModel$RCBatteryState$Low;", "Ldji/v5/ux/core/panel/listitem/rcbattery/RCBatteryListItemWidgetModel$RCBatteryState;", "remainingChargePercent", "", "(I)V", "getRemainingChargePercent", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class Low extends dji.v5.ux.core.panel.listitem.rcbattery.RCBatteryListItemWidgetModel.RCBatteryState {
            private final int remainingChargePercent = 0;
            
            /**
             * When product is connected and rc battery is critically low
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.rcbattery.RCBatteryListItemWidgetModel.RCBatteryState.Low copy(int remainingChargePercent) {
                return null;
            }
            
            /**
             * When product is connected and rc battery is critically low
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * When product is connected and rc battery is critically low
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * When product is connected and rc battery is critically low
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public Low(int remainingChargePercent) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            public final int getRemainingChargePercent() {
                return 0;
            }
        }
    }
}