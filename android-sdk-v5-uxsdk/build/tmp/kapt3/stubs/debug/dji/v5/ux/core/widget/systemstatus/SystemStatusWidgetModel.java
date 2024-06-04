package dji.v5.ux.core.widget.systemstatus;

import java.lang.System;

/**
 * Widget Model for the [SystemStatusWidget] used to define
 * the underlying logic and communication
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001)B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001aH\u0002J\b\u0010#\u001a\u00020$H\u0014J\b\u0010%\u001a\u00020$H\u0014J\u0006\u0010&\u001a\u00020\'J\b\u0010(\u001a\u00020$H\u0014R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u0010R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Ldji/v5/ux/core/widget/systemstatus/SystemStatusWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "preferencesManager", "Ldji/v5/ux/core/communication/GlobalPreferencesInterface;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;Ldji/v5/ux/core/communication/GlobalPreferencesInterface;)V", "areMotorsOnDataProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "", "deviceStatusChangeListener", "Ldji/v5/manager/diagnostic/DJIDeviceStatusChangeListener;", "isMotorOn", "Lio/reactivex/rxjava3/core/Flowable;", "()Lio/reactivex/rxjava3/core/Flowable;", "maxHeightProcessor", "", "sendVoiceNotificationKey", "Ldji/v5/ux/core/communication/UXKey;", "systemStatus", "Ldji/v5/manager/diagnostic/DJIDeviceStatus;", "getSystemStatus", "systemStatusProcessor", "unitTypeProcessor", "Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "warningStatusMessageData", "Ldji/v5/ux/core/widget/systemstatus/SystemStatusWidgetModel$WarningStatusMessageData;", "getWarningStatusMessageData", "warningStatusMessageProcessor", "getMaxHeight", "", "maxHeight", "unitType", "inCleanup", "", "inSetup", "sendVoiceNotification", "Lio/reactivex/rxjava3/core/Completable;", "updateStates", "WarningStatusMessageData", "android-sdk-v5-uxsdk_debug"})
public final class SystemStatusWidgetModel extends dji.v5.ux.core.base.WidgetModel {
    private final dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore = null;
    private final dji.v5.ux.core.communication.GlobalPreferencesInterface preferencesManager = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.manager.diagnostic.DJIDeviceStatus> systemStatusProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> areMotorsOnDataProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Integer> maxHeightProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.util.UnitConversionUtil.UnitType> unitTypeProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.widget.systemstatus.SystemStatusWidgetModel.WarningStatusMessageData> warningStatusMessageProcessor = null;
    private final dji.v5.ux.core.communication.UXKey sendVoiceNotificationKey = null;
    private final dji.v5.manager.diagnostic.DJIDeviceStatusChangeListener deviceStatusChangeListener = null;
    
    public SystemStatusWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore, @org.jetbrains.annotations.Nullable
    dji.v5.ux.core.communication.GlobalPreferencesInterface preferencesManager) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.manager.diagnostic.DJIDeviceStatus> getSystemStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<java.lang.Boolean> isMotorOn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.widget.systemstatus.SystemStatusWidgetModel.WarningStatusMessageData> getWarningStatusMessageData() {
        return null;
    }
    
    /**
     * Send a voice notification.
     *
     * @return Completable representing the success/failure of the set action.
     */
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Completable sendVoiceNotification() {
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
    
    private final float getMaxHeight(float maxHeight, dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
        return 0.0F;
    }
    
    /**
     * Class representing data for displaying a warning status message
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Ldji/v5/ux/core/widget/systemstatus/SystemStatusWidgetModel$WarningStatusMessageData;", "", "message", "", "maxHeight", "", "unitType", "Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "(Ljava/lang/String;FLdji/v5/ux/core/util/UnitConversionUtil$UnitType;)V", "getMaxHeight", "()F", "getMessage", "()Ljava/lang/String;", "getUnitType", "()Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-sdk-v5-uxsdk_debug"})
    public static final class WarningStatusMessageData {
        
        /**
         * Warning Status Message
         */
        @org.jetbrains.annotations.NotNull
        private final java.lang.String message = null;
        
        /**
         * Max height of a height-limited no-fly zone
         */
        private final float maxHeight = 0.0F;
        
        /**
         * Unit type for the height
         */
        @org.jetbrains.annotations.NotNull
        private final dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType = null;
        
        /**
         * Class representing data for displaying a warning status message
         */
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.core.widget.systemstatus.SystemStatusWidgetModel.WarningStatusMessageData copy(@org.jetbrains.annotations.NotNull
        java.lang.String message, float maxHeight, @org.jetbrains.annotations.NotNull
        dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
            return null;
        }
        
        /**
         * Class representing data for displaying a warning status message
         */
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Class representing data for displaying a warning status message
         */
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        /**
         * Class representing data for displaying a warning status message
         */
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public WarningStatusMessageData(@org.jetbrains.annotations.NotNull
        java.lang.String message, float maxHeight, @org.jetbrains.annotations.NotNull
        dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
            super();
        }
        
        /**
         * Warning Status Message
         */
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        /**
         * Warning Status Message
         */
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getMessage() {
            return null;
        }
        
        /**
         * Max height of a height-limited no-fly zone
         */
        public final float component2() {
            return 0.0F;
        }
        
        /**
         * Max height of a height-limited no-fly zone
         */
        public final float getMaxHeight() {
            return 0.0F;
        }
        
        /**
         * Unit type for the height
         */
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.core.util.UnitConversionUtil.UnitType component3() {
            return null;
        }
        
        /**
         * Unit type for the height
         */
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.core.util.UnitConversionUtil.UnitType getUnitType() {
            return null;
        }
    }
}