package dji.v5.ux.core.widget.verticalvelocity;

import java.lang.System;

/**
 * Widget Model for the [VerticalVelocityWidget] used to define
 * the underlying logic and communication
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0015\u001a\u00020\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0016H\u0014J\b\u0010\u0018\u001a\u00020\u0016H\u0014R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Ldji/v5/ux/core/widget/verticalvelocity/VerticalVelocityWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "preferencesManager", "Ldji/v5/ux/core/communication/GlobalPreferencesInterface;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;Ldji/v5/ux/core/communication/GlobalPreferencesInterface;)V", "unitTypeDataProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "velocityProcessor", "Ldji/sdk/keyvalue/value/common/Velocity3D;", "kotlin.jvm.PlatformType", "verticalVelocityState", "Lio/reactivex/rxjava3/core/Flowable;", "Ldji/v5/ux/core/widget/verticalvelocity/VerticalVelocityWidgetModel$VerticalVelocityState;", "getVerticalVelocityState", "()Lio/reactivex/rxjava3/core/Flowable;", "verticalVelocityStateProcessor", "inCleanup", "", "inSetup", "updateStates", "VerticalVelocityState", "android-sdk-v5-uxsdk_debug"})
public final class VerticalVelocityWidgetModel extends dji.v5.ux.core.base.WidgetModel {
    private final dji.v5.ux.core.communication.GlobalPreferencesInterface preferencesManager = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.common.Velocity3D> velocityProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.util.UnitConversionUtil.UnitType> unitTypeDataProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.widget.verticalvelocity.VerticalVelocityWidgetModel.VerticalVelocityState> verticalVelocityStateProcessor = null;
    
    public VerticalVelocityWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore, @org.jetbrains.annotations.Nullable
    dji.v5.ux.core.communication.GlobalPreferencesInterface preferencesManager) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.widget.verticalvelocity.VerticalVelocityWidgetModel.VerticalVelocityState> getVerticalVelocityState() {
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
     * Class to represent states of vertical velocity
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Ldji/v5/ux/core/widget/verticalvelocity/VerticalVelocityWidgetModel$VerticalVelocityState;", "", "()V", "DownwardVelocity", "Idle", "ProductDisconnected", "UpwardVelocity", "Ldji/v5/ux/core/widget/verticalvelocity/VerticalVelocityWidgetModel$VerticalVelocityState$DownwardVelocity;", "Ldji/v5/ux/core/widget/verticalvelocity/VerticalVelocityWidgetModel$VerticalVelocityState$Idle;", "Ldji/v5/ux/core/widget/verticalvelocity/VerticalVelocityWidgetModel$VerticalVelocityState$ProductDisconnected;", "Ldji/v5/ux/core/widget/verticalvelocity/VerticalVelocityWidgetModel$VerticalVelocityState$UpwardVelocity;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class VerticalVelocityState {
        
        private VerticalVelocityState() {
            super();
        }
        
        /**
         * When product is disconnected
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/widget/verticalvelocity/VerticalVelocityWidgetModel$VerticalVelocityState$ProductDisconnected;", "Ldji/v5/ux/core/widget/verticalvelocity/VerticalVelocityWidgetModel$VerticalVelocityState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductDisconnected extends dji.v5.ux.core.widget.verticalvelocity.VerticalVelocityWidgetModel.VerticalVelocityState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.widget.verticalvelocity.VerticalVelocityWidgetModel.VerticalVelocityState.ProductDisconnected INSTANCE = null;
            
            private ProductDisconnected() {
                super();
            }
        }
        
        /**
         * When aircraft is not moving vertically
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/core/widget/verticalvelocity/VerticalVelocityWidgetModel$VerticalVelocityState$Idle;", "Ldji/v5/ux/core/widget/verticalvelocity/VerticalVelocityWidgetModel$VerticalVelocityState;", "unitType", "Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "(Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;)V", "getUnitType", "()Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class Idle extends dji.v5.ux.core.widget.verticalvelocity.VerticalVelocityWidgetModel.VerticalVelocityState {
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType = null;
            
            /**
             * When aircraft is not moving vertically
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.verticalvelocity.VerticalVelocityWidgetModel.VerticalVelocityState.Idle copy(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
                return null;
            }
            
            /**
             * When aircraft is not moving vertically
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * When aircraft is not moving vertically
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * When aircraft is not moving vertically
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public Idle(@org.jetbrains.annotations.NotNull
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
         * When aircraft is moving in upward direction
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Ldji/v5/ux/core/widget/verticalvelocity/VerticalVelocityWidgetModel$VerticalVelocityState$UpwardVelocity;", "Ldji/v5/ux/core/widget/verticalvelocity/VerticalVelocityWidgetModel$VerticalVelocityState;", "velocity", "", "unitType", "Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "(DLdji/v5/ux/core/util/UnitConversionUtil$UnitType;)V", "getUnitType", "()Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "getVelocity", "()D", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class UpwardVelocity extends dji.v5.ux.core.widget.verticalvelocity.VerticalVelocityWidgetModel.VerticalVelocityState {
            private final double velocity = 0.0;
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType = null;
            
            /**
             * When aircraft is moving in upward direction
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.verticalvelocity.VerticalVelocityWidgetModel.VerticalVelocityState.UpwardVelocity copy(double velocity, @org.jetbrains.annotations.NotNull
            dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
                return null;
            }
            
            /**
             * When aircraft is moving in upward direction
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * When aircraft is moving in upward direction
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * When aircraft is moving in upward direction
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public UpwardVelocity(double velocity, @org.jetbrains.annotations.NotNull
            dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
                super();
            }
            
            public final double component1() {
                return 0.0;
            }
            
            public final double getVelocity() {
                return 0.0;
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
        
        /**
         * When aircraft is moving in downward direction
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Ldji/v5/ux/core/widget/verticalvelocity/VerticalVelocityWidgetModel$VerticalVelocityState$DownwardVelocity;", "Ldji/v5/ux/core/widget/verticalvelocity/VerticalVelocityWidgetModel$VerticalVelocityState;", "velocity", "", "unitType", "Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "(DLdji/v5/ux/core/util/UnitConversionUtil$UnitType;)V", "getUnitType", "()Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "getVelocity", "()D", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class DownwardVelocity extends dji.v5.ux.core.widget.verticalvelocity.VerticalVelocityWidgetModel.VerticalVelocityState {
            private final double velocity = 0.0;
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType = null;
            
            /**
             * When aircraft is moving in downward direction
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.verticalvelocity.VerticalVelocityWidgetModel.VerticalVelocityState.DownwardVelocity copy(double velocity, @org.jetbrains.annotations.NotNull
            dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
                return null;
            }
            
            /**
             * When aircraft is moving in downward direction
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * When aircraft is moving in downward direction
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * When aircraft is moving in downward direction
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public DownwardVelocity(double velocity, @org.jetbrains.annotations.NotNull
            dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
                super();
            }
            
            public final double component1() {
                return 0.0;
            }
            
            public final double getVelocity() {
                return 0.0;
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