package dji.v5.ux.core.panel.listitem.overview;

import java.lang.System;

/**
 * Widget Model for the [OverviewListItemWidget] used to define
 * the underlying logic and communication
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0013H\u0014J\b\u0010\u0015\u001a\u00020\u0013H\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Ldji/v5/ux/core/panel/listitem/overview/OverviewListItemWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;)V", "deviceStatusChangeListener", "Ldji/v5/manager/diagnostic/DJIDeviceStatusChangeListener;", "overviewStateProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "Ldji/v5/ux/core/panel/listitem/overview/OverviewListItemWidgetModel$OverviewState;", "overviewStatus", "Lio/reactivex/rxjava3/core/Flowable;", "getOverviewStatus", "()Lio/reactivex/rxjava3/core/Flowable;", "systemStatusProcessor", "Ldji/v5/manager/diagnostic/DJIDeviceStatus;", "inCleanup", "", "inSetup", "updateStates", "OverviewState", "android-sdk-v5-uxsdk_debug"})
public final class OverviewListItemWidgetModel extends dji.v5.ux.core.base.WidgetModel {
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.manager.diagnostic.DJIDeviceStatus> systemStatusProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.panel.listitem.overview.OverviewListItemWidgetModel.OverviewState> overviewStateProcessor = null;
    private final dji.v5.manager.diagnostic.DJIDeviceStatusChangeListener deviceStatusChangeListener = null;
    
    public OverviewListItemWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.panel.listitem.overview.OverviewListItemWidgetModel.OverviewState> getOverviewStatus() {
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Ldji/v5/ux/core/panel/listitem/overview/OverviewListItemWidgetModel$OverviewState;", "", "()V", "CurrentStatus", "ProductDisconnected", "Ldji/v5/ux/core/panel/listitem/overview/OverviewListItemWidgetModel$OverviewState$CurrentStatus;", "Ldji/v5/ux/core/panel/listitem/overview/OverviewListItemWidgetModel$OverviewState$ProductDisconnected;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class OverviewState {
        
        private OverviewState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/overview/OverviewListItemWidgetModel$OverviewState$ProductDisconnected;", "Ldji/v5/ux/core/panel/listitem/overview/OverviewListItemWidgetModel$OverviewState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductDisconnected extends dji.v5.ux.core.panel.listitem.overview.OverviewListItemWidgetModel.OverviewState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.panel.listitem.overview.OverviewListItemWidgetModel.OverviewState.ProductDisconnected INSTANCE = null;
            
            private ProductDisconnected() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/core/panel/listitem/overview/OverviewListItemWidgetModel$OverviewState$CurrentStatus;", "Ldji/v5/ux/core/panel/listitem/overview/OverviewListItemWidgetModel$OverviewState;", "warningStatusItem", "Ldji/v5/manager/diagnostic/DJIDeviceStatus;", "(Ldji/v5/manager/diagnostic/DJIDeviceStatus;)V", "getWarningStatusItem", "()Ldji/v5/manager/diagnostic/DJIDeviceStatus;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class CurrentStatus extends dji.v5.ux.core.panel.listitem.overview.OverviewListItemWidgetModel.OverviewState {
            @org.jetbrains.annotations.NotNull
            private final dji.v5.manager.diagnostic.DJIDeviceStatus warningStatusItem = null;
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.overview.OverviewListItemWidgetModel.OverviewState.CurrentStatus copy(@org.jetbrains.annotations.NotNull
            dji.v5.manager.diagnostic.DJIDeviceStatus warningStatusItem) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public CurrentStatus(@org.jetbrains.annotations.NotNull
            dji.v5.manager.diagnostic.DJIDeviceStatus warningStatusItem) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.manager.diagnostic.DJIDeviceStatus component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.manager.diagnostic.DJIDeviceStatus getWarningStatusItem() {
                return null;
            }
        }
    }
}