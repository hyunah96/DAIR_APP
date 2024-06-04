package dji.v5.ux.core.panel.listitem.ssdstatus;

import java.lang.System;

/**
 * Widget Model for the [SSDStatusListItemWidget] used to define
 * the underlying logic and communication
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\"B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u001fH\u0014J\b\u0010 \u001a\u00020\u001fH\u0014J\b\u0010!\u001a\u00020\u001fH\u0014R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00130\u00130\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u001b0\u001b0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;)V", "value", "Ldji/sdk/keyvalue/value/common/ComponentIndexType;", "cameraIndex", "getCameraIndex", "()Ldji/sdk/keyvalue/value/common/ComponentIndexType;", "setCameraIndex", "(Ldji/sdk/keyvalue/value/common/ComponentIndexType;)V", "ssdOperationStateProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "Ldji/sdk/keyvalue/value/camera/SSDOperationState;", "kotlin.jvm.PlatformType", "ssdRemainingCapacityProcessor", "", "ssdState", "Lio/reactivex/rxjava3/core/Flowable;", "Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidgetModel$SSDState;", "getSsdState", "()Lio/reactivex/rxjava3/core/Flowable;", "ssdStateProcessor", "ssdSupportedProcessor", "", "formatSSD", "Lio/reactivex/rxjava3/core/Completable;", "inCleanup", "", "inSetup", "updateStates", "SSDState", "android-sdk-v5-uxsdk_debug"})
public final class SSDStatusListItemWidgetModel extends dji.v5.ux.core.base.WidgetModel {
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.panel.listitem.ssdstatus.SSDStatusListItemWidgetModel.SSDState> ssdStateProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Integer> ssdRemainingCapacityProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.camera.SSDOperationState> ssdOperationStateProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> ssdSupportedProcessor = null;
    
    /**
     * Index of sdCard
     */
    @org.jetbrains.annotations.NotNull
    private dji.sdk.keyvalue.value.common.ComponentIndexType cameraIndex = dji.sdk.keyvalue.value.common.ComponentIndexType.LEFT_OR_MAIN;
    
    /**
     * Get the sd card state
     */
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.panel.listitem.ssdstatus.SSDStatusListItemWidgetModel.SSDState> ssdState = null;
    
    public SSDStatusListItemWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.sdk.keyvalue.value.common.ComponentIndexType getCameraIndex() {
        return null;
    }
    
    public final void setCameraIndex(@org.jetbrains.annotations.NotNull
    dji.sdk.keyvalue.value.common.ComponentIndexType value) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.panel.listitem.ssdstatus.SSDStatusListItemWidgetModel.SSDState> getSsdState() {
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
     * Format SSD
     */
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Completable formatSSD() {
        return null;
    }
    
    /**
     * Class represents states of SSD List Item
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidgetModel$SSDState;", "", "()V", "CurrentSSDState", "NotSupported", "ProductDisconnected", "Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidgetModel$SSDState$CurrentSSDState;", "Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidgetModel$SSDState$NotSupported;", "Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidgetModel$SSDState$ProductDisconnected;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class SSDState {
        
        private SSDState() {
            super();
        }
        
        /**
         * When product is disconnected
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidgetModel$SSDState$ProductDisconnected;", "Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidgetModel$SSDState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductDisconnected extends dji.v5.ux.core.panel.listitem.ssdstatus.SSDStatusListItemWidgetModel.SSDState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.panel.listitem.ssdstatus.SSDStatusListItemWidgetModel.SSDState.ProductDisconnected INSTANCE = null;
            
            private ProductDisconnected() {
                super();
            }
        }
        
        /**
         * When product does not support SSD
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidgetModel$SSDState$NotSupported;", "Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidgetModel$SSDState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class NotSupported extends dji.v5.ux.core.panel.listitem.ssdstatus.SSDStatusListItemWidgetModel.SSDState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.panel.listitem.ssdstatus.SSDStatusListItemWidgetModel.SSDState.NotSupported INSTANCE = null;
            
            private NotSupported() {
                super();
            }
        }
        
        /**
         * When product is connected
         *
         * @property ssdOperationState - Current operation State of SSD
         * @property remainingSpace - Remaining space in MB
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidgetModel$SSDState$CurrentSSDState;", "Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidgetModel$SSDState;", "ssdOperationState", "Ldji/sdk/keyvalue/value/camera/SSDOperationState;", "remainingSpace", "", "(Ldji/sdk/keyvalue/value/camera/SSDOperationState;I)V", "getRemainingSpace", "()I", "getSsdOperationState", "()Ldji/sdk/keyvalue/value/camera/SSDOperationState;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class CurrentSSDState extends dji.v5.ux.core.panel.listitem.ssdstatus.SSDStatusListItemWidgetModel.SSDState {
            @org.jetbrains.annotations.NotNull
            private final dji.sdk.keyvalue.value.camera.SSDOperationState ssdOperationState = null;
            private final int remainingSpace = 0;
            
            /**
             * When product is connected
             *
             * @property ssdOperationState - Current operation State of SSD
             * @property remainingSpace - Remaining space in MB
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.ssdstatus.SSDStatusListItemWidgetModel.SSDState.CurrentSSDState copy(@org.jetbrains.annotations.NotNull
            dji.sdk.keyvalue.value.camera.SSDOperationState ssdOperationState, int remainingSpace) {
                return null;
            }
            
            /**
             * When product is connected
             *
             * @property ssdOperationState - Current operation State of SSD
             * @property remainingSpace - Remaining space in MB
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * When product is connected
             *
             * @property ssdOperationState - Current operation State of SSD
             * @property remainingSpace - Remaining space in MB
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * When product is connected
             *
             * @property ssdOperationState - Current operation State of SSD
             * @property remainingSpace - Remaining space in MB
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public CurrentSSDState(@org.jetbrains.annotations.NotNull
            dji.sdk.keyvalue.value.camera.SSDOperationState ssdOperationState, int remainingSpace) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.sdk.keyvalue.value.camera.SSDOperationState component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.sdk.keyvalue.value.camera.SSDOperationState getSsdOperationState() {
                return null;
            }
            
            public final int component2() {
                return 0;
            }
            
            public final int getRemainingSpace() {
                return 0;
            }
        }
    }
}