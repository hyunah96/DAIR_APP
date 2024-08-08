package dji.v5.ux.core.panel.listitem.unittype;

import java.lang.System;

/**
 * Widget Model for the [UnitModeListItemWidget] used to define
 * the underlying logic and communication
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0014\u001a\u00020\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0015H\u0014J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rJ\b\u0010\u001a\u001a\u00020\u0015H\u0014R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Ldji/v5/ux/core/panel/listitem/unittype/UnitModeListItemWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "preferencesManager", "Ldji/v5/ux/core/communication/GlobalPreferencesInterface;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;Ldji/v5/ux/core/communication/GlobalPreferencesInterface;)V", "unitTypeKey", "Ldji/v5/ux/core/communication/UXKey;", "unitTypeProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "unitTypeState", "Lio/reactivex/rxjava3/core/Flowable;", "Ldji/v5/ux/core/panel/listitem/unittype/UnitModeListItemWidgetModel$UnitTypeState;", "getUnitTypeState", "()Lio/reactivex/rxjava3/core/Flowable;", "unitTypeStateProcessor", "inCleanup", "", "inSetup", "setUnitType", "Lio/reactivex/rxjava3/core/Completable;", "unitType", "updateStates", "UnitTypeState", "android-sdk-v5-uxsdk_debug"})
public final class UnitModeListItemWidgetModel extends dji.v5.ux.core.base.WidgetModel {
    private final dji.v5.ux.core.communication.GlobalPreferencesInterface preferencesManager = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.panel.listitem.unittype.UnitModeListItemWidgetModel.UnitTypeState> unitTypeStateProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.util.UnitConversionUtil.UnitType> unitTypeProcessor = null;
    private final dji.v5.ux.core.communication.UXKey unitTypeKey = null;
    
    public UnitModeListItemWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore, @org.jetbrains.annotations.Nullable
    dji.v5.ux.core.communication.GlobalPreferencesInterface preferencesManager) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.panel.listitem.unittype.UnitModeListItemWidgetModel.UnitTypeState> getUnitTypeState() {
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
     * Set unit type
     */
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Completable setUnitType(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
        return null;
    }
    
    /**
     * Class represents states of Unit Type
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Ldji/v5/ux/core/panel/listitem/unittype/UnitModeListItemWidgetModel$UnitTypeState;", "", "()V", "CurrentUnitType", "ProductDisconnected", "Ldji/v5/ux/core/panel/listitem/unittype/UnitModeListItemWidgetModel$UnitTypeState$CurrentUnitType;", "Ldji/v5/ux/core/panel/listitem/unittype/UnitModeListItemWidgetModel$UnitTypeState$ProductDisconnected;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class UnitTypeState {
        
        private UnitTypeState() {
            super();
        }
        
        /**
         * When product is disconnected
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/unittype/UnitModeListItemWidgetModel$UnitTypeState$ProductDisconnected;", "Ldji/v5/ux/core/panel/listitem/unittype/UnitModeListItemWidgetModel$UnitTypeState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductDisconnected extends dji.v5.ux.core.panel.listitem.unittype.UnitModeListItemWidgetModel.UnitTypeState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.panel.listitem.unittype.UnitModeListItemWidgetModel.UnitTypeState.ProductDisconnected INSTANCE = null;
            
            private ProductDisconnected() {
                super();
            }
        }
        
        /**
         * Represents current unit system used
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/core/panel/listitem/unittype/UnitModeListItemWidgetModel$UnitTypeState$CurrentUnitType;", "Ldji/v5/ux/core/panel/listitem/unittype/UnitModeListItemWidgetModel$UnitTypeState;", "unitType", "Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "(Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;)V", "getUnitType", "()Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class CurrentUnitType extends dji.v5.ux.core.panel.listitem.unittype.UnitModeListItemWidgetModel.UnitTypeState {
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType = null;
            
            /**
             * Represents current unit system used
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.unittype.UnitModeListItemWidgetModel.UnitTypeState.CurrentUnitType copy(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
                return null;
            }
            
            /**
             * Represents current unit system used
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Represents current unit system used
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Represents current unit system used
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public CurrentUnitType(@org.jetbrains.annotations.NotNull
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
    }
}