package dji.v5.ux.core.widget.videosignal;

import java.lang.System;

/**
 * Widget Model for the [VideoSignalWidget] used to define
 * the underlying logic and communication
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u001aH\u0014J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eH\u0014J\b\u0010\u001f\u001a\u00020\u001aH\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u000e\u0010\u0012\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u000bR\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Ldji/v5/ux/core/widget/videosignal/VideoSignalWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;)V", "airlinkFrequencyBand", "Lio/reactivex/rxjava3/core/Flowable;", "Ldji/sdk/keyvalue/value/airlink/FrequencyBand;", "getAirlinkFrequencyBand", "()Lio/reactivex/rxjava3/core/Flowable;", "airlinkFrequencyBandProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "ocuFrequencyPointIndexProcessor", "", "ocuSyncFrequencyPointIndex", "getOcuSyncFrequencyPointIndex", "signalValue", "tag", "", "kotlin.jvm.PlatformType", "videoSignalQuality", "getVideoSignalQuality", "videoSignalQualityProcessor", "inCleanup", "", "inSetup", "onProductConnectionChanged", "isConnected", "", "updateStates", "android-sdk-v5-uxsdk_debug"})
public final class VideoSignalWidgetModel extends dji.v5.ux.core.base.WidgetModel {
    private final java.lang.String tag = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Integer> videoSignalQualityProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.airlink.FrequencyBand> airlinkFrequencyBandProcessor = null;
    private int signalValue = 0;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Integer> ocuFrequencyPointIndexProcessor = null;
    
    public VideoSignalWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<java.lang.Integer> getVideoSignalQuality() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<java.lang.Integer> getOcuSyncFrequencyPointIndex() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.sdk.keyvalue.value.airlink.FrequencyBand> getAirlinkFrequencyBand() {
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
    
    @java.lang.Override
    protected void onProductConnectionChanged(boolean isConnected) {
    }
}