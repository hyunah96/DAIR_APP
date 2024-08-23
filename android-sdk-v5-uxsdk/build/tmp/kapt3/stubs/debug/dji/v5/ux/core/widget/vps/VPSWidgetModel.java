package dji.v5.ux.core.widget.vps;

import java.lang.System;

/**
 * Widget Model for the [VPSWidget] used to define
 * the underlying logic and communication
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0017\u001a\u00020\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0018H\u0014J\b\u0010\u001a\u001a\u00020\u0018H\u0014R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Ldji/v5/ux/core/widget/vps/VPSWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "preferencesManager", "Ldji/v5/ux/core/communication/GlobalPreferencesInterface;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;Ldji/v5/ux/core/communication/GlobalPreferencesInterface;)V", "rawUltrasonicHeightProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "", "ultrasonicBeingUsedProcessor", "", "unitTypeDataProcessor", "Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "visionPositioningEnabledProcessor", "vpsState", "Lio/reactivex/rxjava3/core/Flowable;", "Ldji/v5/ux/core/widget/vps/VPSWidgetModel$VPSState;", "getVpsState", "()Lio/reactivex/rxjava3/core/Flowable;", "vpsStateProcessor", "inCleanup", "", "inSetup", "updateStates", "VPSState", "android-sdk-v5-uxsdk_debug"})
public final class VPSWidgetModel extends dji.v5.ux.core.base.WidgetModel {
    private final dji.v5.ux.core.communication.GlobalPreferencesInterface preferencesManager = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.util.UnitConversionUtil.UnitType> unitTypeDataProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> visionPositioningEnabledProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> ultrasonicBeingUsedProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Integer> rawUltrasonicHeightProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.widget.vps.VPSWidgetModel.VPSState> vpsStateProcessor = null;
    
    public VPSWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore, @org.jetbrains.annotations.Nullable
    dji.v5.ux.core.communication.GlobalPreferencesInterface preferencesManager) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.widget.vps.VPSWidgetModel.VPSState> getVpsState() {
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
     * Class to represent states of VPS
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Ldji/v5/ux/core/widget/vps/VPSWidgetModel$VPSState;", "", "()V", "Disabled", "Enabled", "ProductDisconnected", "Ldji/v5/ux/core/widget/vps/VPSWidgetModel$VPSState$Disabled;", "Ldji/v5/ux/core/widget/vps/VPSWidgetModel$VPSState$Enabled;", "Ldji/v5/ux/core/widget/vps/VPSWidgetModel$VPSState$ProductDisconnected;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class VPSState {
        
        private VPSState() {
            super();
        }
        
        /**
         * When product is disconnected
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/widget/vps/VPSWidgetModel$VPSState$ProductDisconnected;", "Ldji/v5/ux/core/widget/vps/VPSWidgetModel$VPSState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductDisconnected extends dji.v5.ux.core.widget.vps.VPSWidgetModel.VPSState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.widget.vps.VPSWidgetModel.VPSState.ProductDisconnected INSTANCE = null;
            
            private ProductDisconnected() {
                super();
            }
        }
        
        /**
         * Vision disabled or ultrasonic is not being used
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/widget/vps/VPSWidgetModel$VPSState$Disabled;", "Ldji/v5/ux/core/widget/vps/VPSWidgetModel$VPSState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class Disabled extends dji.v5.ux.core.widget.vps.VPSWidgetModel.VPSState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.widget.vps.VPSWidgetModel.VPSState.Disabled INSTANCE = null;
            
            private Disabled() {
                super();
            }
        }
        
        /**
         * Current VPS height
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Ldji/v5/ux/core/widget/vps/VPSWidgetModel$VPSState$Enabled;", "Ldji/v5/ux/core/widget/vps/VPSWidgetModel$VPSState;", "height", "", "unitType", "Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "(FLdji/v5/ux/core/util/UnitConversionUtil$UnitType;)V", "getHeight", "()F", "getUnitType", "()Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class Enabled extends dji.v5.ux.core.widget.vps.VPSWidgetModel.VPSState {
            private final float height = 0.0F;
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType = null;
            
            /**
             * Current VPS height
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.vps.VPSWidgetModel.VPSState.Enabled copy(float height, @org.jetbrains.annotations.NotNull
            dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
                return null;
            }
            
            /**
             * Current VPS height
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Current VPS height
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Current VPS height
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public Enabled(float height, @org.jetbrains.annotations.NotNull
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
}