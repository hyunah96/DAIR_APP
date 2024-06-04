package dji.v5.ux.core.base;

import java.lang.System;

/**
 * Base module class for grouping sets of data that are often used together.
 * Module生命周期已经刷新，依赖于widgetModel的刷新
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002JF\u0010\u0003\u001a\u00020\u0004\"\b\b\u0000\u0010\u0005*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00050\rH\u0014J\b\u0010\u000e\u001a\u00020\u0004H$J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H$\u00a8\u0006\u0010"}, d2 = {"Ldji/v5/ux/core/base/BaseModule;", "", "()V", "bindDataProcessor", "", "T", "widgetModel", "Ldji/v5/ux/core/base/WidgetModel;", "key", "Ldji/sdk/keyvalue/key/DJIKey;", "dataProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "sideEffectConsumer", "Lio/reactivex/rxjava3/functions/Consumer;", "cleanup", "setup", "android-sdk-v5-uxsdk_debug"})
public abstract class BaseModule {
    
    public BaseModule() {
        super();
    }
    
    /**
     * Setup method for initialization that must be implemented
     */
    protected abstract void setup(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.WidgetModel widgetModel);
    
    /**
     * Cleanup method for post-usage destruction that must be implemented
     */
    protected abstract void cleanup();
    
    /**
     * Bind the given DJIKey to the given data processor and attach the given consumer to it.
     * The data processor and side effect consumer will be invoked with every update to the key.
     * The side effect consumer will be called before the data processor is updated.
     *
     * @param key                DJIKey to be bound
     * @param dataProcessor      DataProcessor to be bound
     * @param sideEffectConsumer Consumer to be called along with data processor
     */
    protected <T extends java.lang.Object>void bindDataProcessor(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.WidgetModel widgetModel, @org.jetbrains.annotations.NotNull
    dji.sdk.keyvalue.key.DJIKey<T> key, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.util.DataProcessor<T> dataProcessor, @org.jetbrains.annotations.NotNull
    io.reactivex.rxjava3.functions.Consumer<T> sideEffectConsumer) {
    }
}