package dji.v5.ux.core.panel.listitem.obstacleavoidance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\n\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u001aH\u0014J\u0018\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u0018H\u0016J\b\u0010\u001f\u001a\u00020\u001aH\u0014J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"H\u0002R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006$"}, d2 = {"Ldji/v5/ux/core/panel/listitem/obstacleavoidance/ObstacleAvoidanceListItemWidget;", "Ldji/v5/ux/core/base/panel/listitem/ListItemRadioButtonWidget;", "Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidget$ModelState;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "obstacleActionAvoidIndex", "obstacleActionCloseIndex", "obstacleActionStopIndex", "widgetModel", "Ldji/v5/ux/core/panel/listitem/obstacleavoidance/ObstacleAvoidanceListItemWidgetModel;", "getWidgetModel", "()Ldji/v5/ux/core/panel/listitem/obstacleavoidance/ObstacleAvoidanceListItemWidgetModel;", "widgetModel$delegate", "Lkotlin/Lazy;", "widgetSizeDescription", "Ldji/v5/ux/core/base/WidgetSizeDescription;", "getWidgetSizeDescription", "()Ldji/v5/ux/core/base/WidgetSizeDescription;", "getIdealDimensionRatioString", "", "onAttachedToWindow", "", "onDetachedFromWindow", "onOptionTapped", "optionIndex", "optionLabel", "reactToModelChanges", "updateUI", "type", "Ldji/sdk/keyvalue/value/flightcontroller/ObstacleActionType;", "ModelState", "android-sdk-v5-uxsdk_debug"})
public class ObstacleAvoidanceListItemWidget extends dji.v5.ux.core.base.panel.listitem.ListItemRadioButtonWidget<dji.v5.ux.core.panel.listitem.rcstickmode.RCStickModeListItemWidget.ModelState> {
    private final kotlin.Lazy widgetModel$delegate = null;
    private int obstacleActionCloseIndex = -1;
    private int obstacleActionStopIndex = -1;
    private int obstacleActionAvoidIndex = -1;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.base.WidgetSizeDescription widgetSizeDescription = null;
    
    @kotlin.jvm.JvmOverloads
    public ObstacleAvoidanceListItemWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public ObstacleAvoidanceListItemWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public ObstacleAvoidanceListItemWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0, 0);
    }
    
    private final dji.v5.ux.core.panel.listitem.obstacleavoidance.ObstacleAvoidanceListItemWidgetModel getWidgetModel() {
        return null;
    }
    
    @java.lang.Override
    protected void reactToModelChanges() {
    }
    
    @java.lang.Override
    protected void onAttachedToWindow() {
    }
    
    @java.lang.Override
    protected void onDetachedFromWindow() {
    }
    
    @java.lang.Override
    public void onOptionTapped(int optionIndex, @org.jetbrains.annotations.NotNull
    java.lang.String optionLabel) {
    }
    
    private final void updateUI(dji.sdk.keyvalue.value.flightcontroller.ObstacleActionType type) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String getIdealDimensionRatioString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dji.v5.ux.core.base.WidgetSizeDescription getWidgetSizeDescription() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/obstacleavoidance/ObstacleAvoidanceListItemWidget$ModelState;", "", "()V", "android-sdk-v5-uxsdk_debug"})
    public static abstract class ModelState {
        
        private ModelState() {
            super();
        }
    }
}