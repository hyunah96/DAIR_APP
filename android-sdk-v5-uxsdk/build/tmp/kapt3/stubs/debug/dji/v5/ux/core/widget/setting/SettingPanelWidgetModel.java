package dji.v5.ux.core.widget.setting;

import java.lang.System;

/**
 * Description :
 *
 * @author: Byte.Cai
 * date : 2022/11/17
 *
 * Copyright (c) 2022, DJI All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0018\u001a\u00020\tJ\u0006\u0010\u0019\u001a\u00020\u0013J\b\u0010\u001a\u001a\u00020\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u001bH\u0014R\u001f\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R7\u0010\u0010\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t \n*\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000e0\u000e0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u001f\u0010\u0012\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00130\u00130\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u001f\u0010\u0015\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00160\u00160\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\f\u00a8\u0006\u001d"}, d2 = {"Ldji/v5/ux/core/widget/setting/SettingPanelWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;)V", "flightControllerConnectProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "", "kotlin.jvm.PlatformType", "getFlightControllerConnectProcessor", "()Ldji/v5/ux/core/util/DataProcessor;", "payloadConnectStatusMap", "Ljava/util/HashMap;", "Ldji/v5/manager/aircraft/payload/PayloadIndexType;", "payloadConnectedStatusMapProcessor", "getPayloadConnectedStatusMapProcessor", "productTypeProcessor", "Ldji/sdk/keyvalue/value/product/ProductType;", "getProductTypeProcessor", "rcModeProcessor", "Ldji/sdk/keyvalue/value/remotecontroller/RCMode;", "getRcModeProcessor", "getFlightControllerConnectStatus", "getProduceType", "inCleanup", "", "inSetup", "android-sdk-v5-uxsdk_debug"})
public final class SettingPanelWidgetModel extends dji.v5.ux.core.base.WidgetModel {
    private final java.util.HashMap<dji.v5.manager.aircraft.payload.PayloadIndexType, java.lang.Boolean> payloadConnectStatusMap = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.product.ProductType> productTypeProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> flightControllerConnectProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.remotecontroller.RCMode> rcModeProcessor = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.util.DataProcessor<java.util.HashMap<dji.v5.manager.aircraft.payload.PayloadIndexType, java.lang.Boolean>> payloadConnectedStatusMapProcessor = null;
    
    public SettingPanelWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.product.ProductType> getProductTypeProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<java.lang.Boolean> getFlightControllerConnectProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.remotecontroller.RCMode> getRcModeProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.util.DataProcessor<java.util.HashMap<dji.v5.manager.aircraft.payload.PayloadIndexType, java.lang.Boolean>> getPayloadConnectedStatusMapProcessor() {
        return null;
    }
    
    @java.lang.Override
    protected void inSetup() {
    }
    
    @java.lang.Override
    protected void inCleanup() {
    }
    
    public final boolean getFlightControllerConnectStatus() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.sdk.keyvalue.value.product.ProductType getProduceType() {
        return null;
    }
}