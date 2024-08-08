package dji.v5.ux.warning;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0015H\u0014J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018J\b\u0010\u001a\u001a\u00020\u0015H\u0002R\'\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r\u00a8\u0006\u001c"}, d2 = {"Ldji/v5/ux/warning/DeviceHealthAndStatusWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;)V", "deviceMessageProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "Ljava/util/ArrayList;", "Ldji/v5/ux/warning/DeviceHealthAndStatusWidgetModel$DeviceMessage;", "Lkotlin/collections/ArrayList;", "getDeviceMessageProcessor", "()Ldji/v5/ux/core/util/DataProcessor;", "deviceStatusChangeListener", "Ldji/v5/manager/diagnostic/DJIDeviceStatusChangeListener;", "healthInfoChangeListener", "Ldji/v5/manager/diagnostic/DJIDeviceHealthInfoChangeListener;", "isConnectedProcessor", "", "inCleanup", "", "inSetup", "level2Count", "", "level3Count", "updateDeviceMessage", "DeviceMessage", "android-sdk-v5-uxsdk_debug"})
public final class DeviceHealthAndStatusWidgetModel extends dji.v5.ux.core.base.WidgetModel {
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<java.util.ArrayList<dji.v5.ux.warning.DeviceHealthAndStatusWidgetModel.DeviceMessage>> deviceMessageProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> isConnectedProcessor = null;
    private final dji.v5.manager.diagnostic.DJIDeviceHealthInfoChangeListener healthInfoChangeListener = null;
    private final dji.v5.manager.diagnostic.DJIDeviceStatusChangeListener deviceStatusChangeListener = null;
    
    public DeviceHealthAndStatusWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<java.util.ArrayList<dji.v5.ux.warning.DeviceHealthAndStatusWidgetModel.DeviceMessage>> getDeviceMessageProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> isConnectedProcessor() {
        return null;
    }
    
    @java.lang.Override
    protected void inSetup() {
    }
    
    @java.lang.Override
    protected void inCleanup() {
    }
    
    private final void updateDeviceMessage() {
    }
    
    public final int level3Count() {
        return 0;
    }
    
    public final int level2Count() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001J\u0006\u0010\u001a\u001a\u00020\u0003R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Ldji/v5/ux/warning/DeviceHealthAndStatusWidgetModel$DeviceMessage;", "", "title", "", "description", "warningLevel", "Ldji/v5/manager/diagnostic/WarningLevel;", "code", "(Ljava/lang/String;Ljava/lang/String;Ldji/v5/manager/diagnostic/WarningLevel;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getDescription", "getTitle", "getWarningLevel", "()Ldji/v5/manager/diagnostic/WarningLevel;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "validDescription", "android-sdk-v5-uxsdk_debug"})
    public static final class DeviceMessage {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String title = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String description = null;
        @org.jetbrains.annotations.NotNull
        private final dji.v5.manager.diagnostic.WarningLevel warningLevel = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String code = null;
        
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.warning.DeviceHealthAndStatusWidgetModel.DeviceMessage copy(@org.jetbrains.annotations.NotNull
        java.lang.String title, @org.jetbrains.annotations.NotNull
        java.lang.String description, @org.jetbrains.annotations.NotNull
        dji.v5.manager.diagnostic.WarningLevel warningLevel, @org.jetbrains.annotations.NotNull
        java.lang.String code) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public DeviceMessage(@org.jetbrains.annotations.NotNull
        java.lang.String title, @org.jetbrains.annotations.NotNull
        java.lang.String description, @org.jetbrains.annotations.NotNull
        dji.v5.manager.diagnostic.WarningLevel warningLevel, @org.jetbrains.annotations.NotNull
        java.lang.String code) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getDescription() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final dji.v5.manager.diagnostic.WarningLevel component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final dji.v5.manager.diagnostic.WarningLevel getWarningLevel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getCode() {
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
        public final java.lang.String validDescription() {
            return null;
        }
    }
}