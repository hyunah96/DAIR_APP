package dji.v5.ux.core.widget.horizontalvelocity;

import java.lang.System;

/**
 * Widget Model for the [HorizontalVelocityWidget] used to define
 * the underlying logic and communication
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001aB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0017H\u0014J\b\u0010\u0019\u001a\u00020\u0017H\u0014R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Ldji/v5/ux/core/widget/horizontalvelocity/HorizontalVelocityWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "preferencesManager", "Ldji/v5/ux/core/communication/GlobalPreferencesInterface;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;Ldji/v5/ux/core/communication/GlobalPreferencesInterface;)V", "aircraftVelocityProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "Ldji/sdk/keyvalue/value/common/Velocity3D;", "horizontalVelocityState", "Lio/reactivex/rxjava3/core/Flowable;", "Ldji/v5/ux/core/widget/horizontalvelocity/HorizontalVelocityWidgetModel$HorizontalVelocityState;", "getHorizontalVelocityState", "()Lio/reactivex/rxjava3/core/Flowable;", "horizontalVelocityStateProcessor", "unitTypeDataProcessor", "Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "calculateHorizontalVelocity", "", "inCleanup", "", "inSetup", "updateStates", "HorizontalVelocityState", "android-sdk-v5-uxsdk_debug"})
public final class HorizontalVelocityWidgetModel extends dji.v5.ux.core.base.WidgetModel {
    private final dji.v5.ux.core.communication.GlobalPreferencesInterface preferencesManager = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.common.Velocity3D> aircraftVelocityProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.util.UnitConversionUtil.UnitType> unitTypeDataProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.widget.horizontalvelocity.HorizontalVelocityWidgetModel.HorizontalVelocityState> horizontalVelocityStateProcessor = null;
    
    public HorizontalVelocityWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore, @org.jetbrains.annotations.Nullable
    dji.v5.ux.core.communication.GlobalPreferencesInterface preferencesManager) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.widget.horizontalvelocity.HorizontalVelocityWidgetModel.HorizontalVelocityState> getHorizontalVelocityState() {
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
    
    private final float calculateHorizontalVelocity() {
        return 0.0F;
    }
    
    /**
     * Class to represent states of horizontal velocity
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Ldji/v5/ux/core/widget/horizontalvelocity/HorizontalVelocityWidgetModel$HorizontalVelocityState;", "", "()V", "CurrentVelocity", "ProductDisconnected", "Ldji/v5/ux/core/widget/horizontalvelocity/HorizontalVelocityWidgetModel$HorizontalVelocityState$CurrentVelocity;", "Ldji/v5/ux/core/widget/horizontalvelocity/HorizontalVelocityWidgetModel$HorizontalVelocityState$ProductDisconnected;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class HorizontalVelocityState {
        
        private HorizontalVelocityState() {
            super();
        }
        
        /**
         * When product is disconnected
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/widget/horizontalvelocity/HorizontalVelocityWidgetModel$HorizontalVelocityState$ProductDisconnected;", "Ldji/v5/ux/core/widget/horizontalvelocity/HorizontalVelocityWidgetModel$HorizontalVelocityState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductDisconnected extends dji.v5.ux.core.widget.horizontalvelocity.HorizontalVelocityWidgetModel.HorizontalVelocityState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.widget.horizontalvelocity.HorizontalVelocityWidgetModel.HorizontalVelocityState.ProductDisconnected INSTANCE = null;
            
            private ProductDisconnected() {
                super();
            }
        }
        
        /**
         * When aircraft is moving horizontally
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Ldji/v5/ux/core/widget/horizontalvelocity/HorizontalVelocityWidgetModel$HorizontalVelocityState$CurrentVelocity;", "Ldji/v5/ux/core/widget/horizontalvelocity/HorizontalVelocityWidgetModel$HorizontalVelocityState;", "velocity", "", "unitType", "Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "(FLdji/v5/ux/core/util/UnitConversionUtil$UnitType;)V", "getUnitType", "()Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "getVelocity", "()F", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class CurrentVelocity extends dji.v5.ux.core.widget.horizontalvelocity.HorizontalVelocityWidgetModel.HorizontalVelocityState {
            private final float velocity = 0.0F;
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType = null;
            
            /**
             * When aircraft is moving horizontally
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.horizontalvelocity.HorizontalVelocityWidgetModel.HorizontalVelocityState.CurrentVelocity copy(float velocity, @org.jetbrains.annotations.NotNull
            dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
                return null;
            }
            
            /**
             * When aircraft is moving horizontally
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * When aircraft is moving horizontally
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * When aircraft is moving horizontally
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public CurrentVelocity(float velocity, @org.jetbrains.annotations.NotNull
            dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
                super();
            }
            
            public final float component1() {
                return 0.0F;
            }
            
            public final float getVelocity() {
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