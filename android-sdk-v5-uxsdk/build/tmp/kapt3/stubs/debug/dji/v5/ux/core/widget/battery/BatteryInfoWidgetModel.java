package dji.v5.ux.core.widget.battery;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010B\u001a\u00020\u0011J\b\u0010C\u001a\u00020DH\u0014J\b\u0010E\u001a\u00020DH\u0014J\u0006\u0010F\u001a\u00020DJ\b\u0010G\u001a\u00020DH\u0016J\u000e\u0010H\u001a\u00020D2\u0006\u0010\u001f\u001a\u00020\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\t0\t0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u000bR(\u0010\u0013\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0011 \u000e*\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u00100\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u000bR\u001c\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00110\u00110\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u000bR\u001c\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00180\u00180\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\b8F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u001c0\u001c0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\b8F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u000bR\u001c\u0010#\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010!0!0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\b8F\u00a2\u0006\u0006\u001a\u0004\b&\u0010\u000bR\u001c\u0010\'\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010%0%0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\b8F\u00a2\u0006\u0006\u001a\u0004\b*\u0010\u000bR\u001c\u0010+\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010)0)0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00110\b8F\u00a2\u0006\u0006\u001a\u0004\b-\u0010\u000bR\u001c\u0010.\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00110\u00110\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u00100\b8F\u00a2\u0006\u0006\u001a\u0004\b1\u0010\u000bR(\u00102\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000200 \u000e*\n\u0012\u0004\u0012\u000200\u0018\u00010\u00100\u00100\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u00103\u001a\b\u0012\u0004\u0012\u0002040\b8F\u00a2\u0006\u0006\u001a\u0004\b5\u0010\u000bR\u001c\u00106\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u000104040\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u00107\u001a\b\u0012\u0004\u0012\u0002080\b8F\u00a2\u0006\u0006\u001a\u0004\b9\u0010\u000bR\u001c\u0010:\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u000108080\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00110\b8F\u00a2\u0006\u0006\u001a\u0004\b<\u0010\u000bR\u001c\u0010=\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00110\u00110\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\b8F\u00a2\u0006\u0006\u001a\u0004\b@\u0010\u000bR\u001c\u0010A\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010?0?0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006I"}, d2 = {"Ldji/v5/ux/core/widget/battery/BatteryInfoWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "uxKeyManager", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;)V", "batteryBatteryHighVoltageStorageSec", "Lio/reactivex/rxjava3/core/Flowable;", "", "getBatteryBatteryHighVoltageStorageSec", "()Lio/reactivex/rxjava3/core/Flowable;", "batteryBatteryHighVoltageStorageSecProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "kotlin.jvm.PlatformType", "batteryCellVoltages", "", "", "getBatteryCellVoltages", "batteryCellVoltagesProcessor", "batteryChargeRemaining", "getBatteryChargeRemaining", "batteryChargeRemainingProcessor", "batteryConnection", "", "getBatteryConnection", "batteryConnectionProcessor", "batteryException", "Ldji/sdk/keyvalue/value/battery/BatteryException;", "getBatteryException", "batteryExceptionProcessor", "batteryIndex", "batteryIndustryBatteryType", "Ldji/sdk/keyvalue/value/battery/IndustryBatteryType;", "getBatteryIndustryBatteryType", "batteryIndustryBatteryTypeProcessor", "batteryIsCommunicationException", "Ldji/sdk/keyvalue/value/battery/BatteryConnectionStateMsg;", "getBatteryIsCommunicationException", "batteryIsCommunicationExceptionProcessor", "batteryManufacturedDate", "Ldji/sdk/keyvalue/value/common/Date;", "getBatteryManufacturedDate", "batteryManufacturedDateProcessor", "batteryNumberOfDischarges", "getBatteryNumberOfDischarges", "batteryNumberOfDischargesProcessor", "batteryOverview", "Ldji/sdk/keyvalue/value/battery/BatteryOverviewValue;", "getBatteryOverview", "batteryOverviewProcessor", "batterySerialNumber", "", "getBatterySerialNumber", "batterySerialNumberProcessor", "batteryTemperature", "", "getBatteryTemperature", "batteryTemperatureProcessor", "batteryVoltage", "getBatteryVoltage", "batteryVoltageProcessor", "productType", "Ldji/sdk/keyvalue/value/product/ProductType;", "getProductType", "productTypeProcessor", "getBatteryIndex", "inCleanup", "", "inSetup", "reset", "restart", "setBatteryIndex", "android-sdk-v5-uxsdk_debug"})
public final class BatteryInfoWidgetModel extends dji.v5.ux.core.base.WidgetModel {
    private int batteryIndex = 0;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.battery.BatteryException> batteryExceptionProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Double> batteryTemperatureProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Integer> batteryVoltageProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Integer> batteryChargeRemainingProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> batteryConnectionProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.battery.BatteryConnectionStateMsg> batteryIsCommunicationExceptionProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Integer> batteryNumberOfDischargesProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.battery.IndustryBatteryType> batteryIndustryBatteryTypeProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Long> batteryBatteryHighVoltageStorageSecProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.String> batterySerialNumberProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.common.Date> batteryManufacturedDateProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.util.List<java.lang.Integer>> batteryCellVoltagesProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.util.List<dji.sdk.keyvalue.value.battery.BatteryOverviewValue>> batteryOverviewProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.product.ProductType> productTypeProcessor = null;
    
    public BatteryInfoWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore uxKeyManager) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.sdk.keyvalue.value.battery.BatteryException> getBatteryException() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<java.lang.Double> getBatteryTemperature() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<java.lang.Integer> getBatteryVoltage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<java.lang.Integer> getBatteryChargeRemaining() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<java.lang.Boolean> getBatteryConnection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.sdk.keyvalue.value.battery.BatteryConnectionStateMsg> getBatteryIsCommunicationException() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<java.lang.Integer> getBatteryNumberOfDischarges() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.sdk.keyvalue.value.battery.IndustryBatteryType> getBatteryIndustryBatteryType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<java.lang.Long> getBatteryBatteryHighVoltageStorageSec() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<java.lang.String> getBatterySerialNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.sdk.keyvalue.value.common.Date> getBatteryManufacturedDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<java.util.List<java.lang.Integer>> getBatteryCellVoltages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<java.util.List<dji.sdk.keyvalue.value.battery.BatteryOverviewValue>> getBatteryOverview() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.sdk.keyvalue.value.product.ProductType> getProductType() {
        return null;
    }
    
    @java.lang.Override
    protected void inSetup() {
    }
    
    @java.lang.Override
    protected void inCleanup() {
    }
    
    public final void setBatteryIndex(int batteryIndex) {
    }
    
    public final void reset() {
    }
    
    @java.lang.Override
    public void restart() {
    }
    
    public final int getBatteryIndex() {
        return 0;
    }
}