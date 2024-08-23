package dji.v5.ux.gimbal;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fJ\b\u0010\u0015\u001a\u00020\tH\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0017H\u0014J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u001aJ\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u001aJ\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\tH\u0016J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001aR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Ldji/v5/ux/gimbal/GimbalFineTuneWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "Ldji/v5/ux/core/base/IGimbalIndex;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "uxKeyManager", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;)V", "gimbalIndex", "Ldji/v5/ux/core/util/SettingDefinitions$GimbalIndex;", "pitchAdjustDegreeProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "", "kotlin.jvm.PlatformType", "rollAdjustDegreeProcessor", "yawAdjustDegreeProcessor", "fineTunePosture", "Lio/reactivex/rxjava3/core/Completable;", "axis", "Ldji/sdk/keyvalue/value/gimbal/PostureFineTuneAxis;", "value", "getGimbalIndex", "inCleanup", "", "inSetup", "pitchAdjustDegree", "Lio/reactivex/rxjava3/core/Flowable;", "rollAdjustDegree", "updateGimbalIndex", "yawAdjustDegree", "android-sdk-v5-uxsdk_debug"})
public class GimbalFineTuneWidgetModel extends dji.v5.ux.core.base.WidgetModel implements dji.v5.ux.core.base.IGimbalIndex {
    private dji.v5.ux.core.util.SettingDefinitions.GimbalIndex gimbalIndex = dji.v5.ux.core.util.SettingDefinitions.GimbalIndex.PORT;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Double> rollAdjustDegreeProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Double> yawAdjustDegreeProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Double> pitchAdjustDegreeProcessor = null;
    
    public GimbalFineTuneWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore uxKeyManager) {
        super(null, null);
    }
    
    @java.lang.Override
    protected void inSetup() {
    }
    
    @java.lang.Override
    protected void inCleanup() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Completable fineTunePosture(@org.jetbrains.annotations.NotNull
    dji.sdk.keyvalue.value.gimbal.PostureFineTuneAxis axis, double value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<java.lang.Double> rollAdjustDegree() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<java.lang.Double> yawAdjustDegree() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<java.lang.Double> pitchAdjustDegree() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dji.v5.ux.core.util.SettingDefinitions.GimbalIndex getGimbalIndex() {
        return null;
    }
    
    @java.lang.Override
    public void updateGimbalIndex(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.util.SettingDefinitions.GimbalIndex gimbalIndex) {
    }
}