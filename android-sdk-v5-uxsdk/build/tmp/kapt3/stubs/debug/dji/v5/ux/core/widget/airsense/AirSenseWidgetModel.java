package dji.v5.ux.core.widget.airsense;

import java.lang.System;

/**
 * Widget Model for the [AirSenseWidget] used to define
 * the underlying logic and communication
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001)B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0019H\u0014J0\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002J,\u0010$\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010%\u001a\u0004\u0018\u00010\u001e2\b\u0010&\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\'\u001a\u00020\u0013J\b\u0010(\u001a\u00020\u0019H\u0014R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Ldji/v5/ux/core/widget/airsense/AirSenseWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;)V", "airSenseConnectedProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "", "airSenseState", "Lio/reactivex/rxjava3/core/Flowable;", "Ldji/v5/ux/core/widget/airsense/AirSenseWidgetModel$AirSenseState;", "getAirSenseState", "()Lio/reactivex/rxjava3/core/Flowable;", "airSenseStateProcessor", "airSenseSystemInformationProcessor", "Ldji/sdk/keyvalue/value/flightcontroller/AirSenseSystemInformation;", "airSenseWarningLevel", "Ldji/sdk/keyvalue/value/flightcontroller/AirSenseWarningLevel;", "getAirSenseWarningLevel", "airSenseWarningLevelProcessor", "sendWarningMessageKey", "Ldji/v5/ux/core/communication/UXKey;", "inCleanup", "", "inSetup", "sendWarningMessage", "Lio/reactivex/rxjava3/core/Completable;", "reason", "", "solution", "level", "Ldji/v5/ux/core/model/WarningMessage$Level;", "action", "Ldji/v5/ux/core/model/WarningMessage$Action;", "sendWarningMessages", "warningSolution", "dangerousSolution", "warningLevel", "updateStates", "AirSenseState", "android-sdk-v5-uxsdk_debug"})
public final class AirSenseWidgetModel extends dji.v5.ux.core.base.WidgetModel {
    private final dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> airSenseConnectedProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.flightcontroller.AirSenseSystemInformation> airSenseSystemInformationProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.flightcontroller.AirSenseWarningLevel> airSenseWarningLevelProcessor = null;
    private final dji.v5.ux.core.communication.UXKey sendWarningMessageKey = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.widget.airsense.AirSenseWidgetModel.AirSenseState> airSenseStateProcessor = null;
    
    @kotlin.jvm.JvmOverloads
    public AirSenseWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.sdk.keyvalue.value.flightcontroller.AirSenseWarningLevel> getAirSenseWarningLevel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.widget.airsense.AirSenseWidgetModel.AirSenseState> getAirSenseState() {
        return null;
    }
    
    /**
     * Send two warning messages with the given solutions for warning and dangerous levels. Based
     * on the warning level, only one message at a time will be displayed, and the other will be
     * removed.
     *
     * @param reason The reason to display on the warning message.
     * @param warningSolution The solution to display if the level is [WarningMessage.Level.WARNING]
     * @param dangerousSolution The solution to display if the level is [WarningMessage.Level.DANGEROUS]
     * @param warningLevel The current AirSense warning level.
     * @return Completable representing the success/failure of the set action.
     */
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Completable sendWarningMessages(@org.jetbrains.annotations.Nullable
    java.lang.String reason, @org.jetbrains.annotations.Nullable
    java.lang.String warningSolution, @org.jetbrains.annotations.Nullable
    java.lang.String dangerousSolution, @org.jetbrains.annotations.NotNull
    dji.sdk.keyvalue.value.flightcontroller.AirSenseWarningLevel warningLevel) {
        return null;
    }
    
    private final io.reactivex.rxjava3.core.Completable sendWarningMessage(java.lang.String reason, java.lang.String solution, dji.v5.ux.core.model.WarningMessage.Level level, dji.v5.ux.core.model.WarningMessage.Action action) {
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
     * The status of the AirSense system.
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b\u00a8\u0006\f"}, d2 = {"Ldji/v5/ux/core/widget/airsense/AirSenseWidgetModel$AirSenseState;", "", "(Ljava/lang/String;I)V", "DISCONNECTED", "NO_AIR_SENSE_CONNECTED", "NO_AIRPLANES_NEARBY", "WARNING_LEVEL_0", "WARNING_LEVEL_1", "WARNING_LEVEL_2", "WARNING_LEVEL_3", "WARNING_LEVEL_4", "UNKNOWN", "android-sdk-v5-uxsdk_debug"})
    public static enum AirSenseState {
        /*public static final*/ DISCONNECTED /* = new DISCONNECTED() */,
        /*public static final*/ NO_AIR_SENSE_CONNECTED /* = new NO_AIR_SENSE_CONNECTED() */,
        /*public static final*/ NO_AIRPLANES_NEARBY /* = new NO_AIRPLANES_NEARBY() */,
        /*public static final*/ WARNING_LEVEL_0 /* = new WARNING_LEVEL_0() */,
        /*public static final*/ WARNING_LEVEL_1 /* = new WARNING_LEVEL_1() */,
        /*public static final*/ WARNING_LEVEL_2 /* = new WARNING_LEVEL_2() */,
        /*public static final*/ WARNING_LEVEL_3 /* = new WARNING_LEVEL_3() */,
        /*public static final*/ WARNING_LEVEL_4 /* = new WARNING_LEVEL_4() */,
        /*public static final*/ UNKNOWN /* = new UNKNOWN() */;
        
        AirSenseState() {
        }
    }
}