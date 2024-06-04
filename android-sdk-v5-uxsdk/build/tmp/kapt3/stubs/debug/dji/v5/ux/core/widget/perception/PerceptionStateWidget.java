package dji.v5.ux.core.widget.perception;

import java.lang.System;

/**
 * Description :The widget used to show whether the visual obstacle avoidance system is enabled.
 *
 * @author: William.Wong
 * date : 2022/9/21
 *
 * Copyright (c) 2022, DJI All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\n\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\"\u0010!\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J \u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u0002H\u0002J\b\u0010&\u001a\u00020\u001aH\u0014J\b\u0010\'\u001a\u00020\u001aH\u0014J\b\u0010(\u001a\u00020\u001aH\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006)"}, d2 = {"Ldji/v5/ux/core/widget/perception/PerceptionStateWidget;", "Ldji/v5/ux/core/base/widget/FrameLayoutWidget;", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "perceptionIconImageView", "Landroid/widget/ImageView;", "perceptionSwitchState", "Ldji/v5/ux/core/widget/perception/PerceptionStateWidgetModel$PerceptionSwitchState;", "perceptionSwitchStateMap", "", "Landroid/graphics/drawable/Drawable;", "widgetModel", "Ldji/v5/ux/core/widget/perception/PerceptionStateWidgetModel;", "getWidgetModel", "()Ldji/v5/ux/core/widget/perception/PerceptionStateWidgetModel;", "widgetModel$delegate", "Lkotlin/Lazy;", "getIdealDimensionRatioString", "", "handleAllPerceptionInfo", "", "perceptionInfo", "Ldji/v5/manager/aircraft/perception/data/PerceptionInfo;", "handleDownwardPerceptionInfo", "handleHorizontalPerceptionInfo", "handlePerceptionInfo", "handleUpwardPerceptionInfo", "initView", "isPerceptionEnabled", "horizontalDirection", "upwardDirection", "downwardDirection", "onAttachedToWindow", "onDetachedFromWindow", "reactToModelChanges", "android-sdk-v5-uxsdk_debug"})
public final class PerceptionStateWidget extends dji.v5.ux.core.base.widget.FrameLayoutWidget<java.lang.Boolean> {
    private final android.widget.ImageView perceptionIconImageView = null;
    private final kotlin.Lazy widgetModel$delegate = null;
    private dji.v5.ux.core.widget.perception.PerceptionStateWidgetModel.PerceptionSwitchState perceptionSwitchState = dji.v5.ux.core.widget.perception.PerceptionStateWidgetModel.PerceptionSwitchState.ALL_DISABLED;
    private final java.util.Map<dji.v5.ux.core.widget.perception.PerceptionStateWidgetModel.PerceptionSwitchState, android.graphics.drawable.Drawable> perceptionSwitchStateMap = null;
    
    @kotlin.jvm.JvmOverloads
    public PerceptionStateWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public PerceptionStateWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public PerceptionStateWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    private final dji.v5.ux.core.widget.perception.PerceptionStateWidgetModel getWidgetModel() {
        return null;
    }
    
    @java.lang.Override
    protected void initView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
    }
    
    @java.lang.Override
    protected void onAttachedToWindow() {
    }
    
    @java.lang.Override
    protected void onDetachedFromWindow() {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String getIdealDimensionRatioString() {
        return null;
    }
    
    @java.lang.Override
    protected void reactToModelChanges() {
    }
    
    /**
     * This function will determine the current perception switch state and draw image.
     */
    private final void handlePerceptionInfo(dji.v5.manager.aircraft.perception.data.PerceptionInfo perceptionInfo) {
    }
    
    /**
     * This function will determine the the current horizontal system state.
     */
    private final void handleHorizontalPerceptionInfo(dji.v5.manager.aircraft.perception.data.PerceptionInfo perceptionInfo) {
    }
    
    /**
     * This function will determine the the current upward system state.
     */
    private final void handleUpwardPerceptionInfo(dji.v5.manager.aircraft.perception.data.PerceptionInfo perceptionInfo) {
    }
    
    /**
     * This function will determine the the current downward system state.
     */
    private final void handleDownwardPerceptionInfo(dji.v5.manager.aircraft.perception.data.PerceptionInfo perceptionInfo) {
    }
    
    /**
     * This function will determine if all the perception is enabled.
     */
    private final void handleAllPerceptionInfo(dji.v5.manager.aircraft.perception.data.PerceptionInfo perceptionInfo) {
    }
    
    /**
     * This function will combine each direction's perception switch state.
     */
    private final boolean isPerceptionEnabled(boolean horizontalDirection, boolean upwardDirection, boolean downwardDirection) {
        return false;
    }
}