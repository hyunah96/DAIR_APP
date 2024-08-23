package dji.v5.ux.obstacle;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001$B%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\"\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0014J\b\u0010\u0019\u001a\u00020\u0018H\u0014J\u001a\u0010\u001a\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0018H\u0014J\b\u0010 \u001a\u00020\u0018H\u0014J\u000e\u0010!\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u001eH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006%"}, d2 = {"Ldji/v5/ux/obstacle/VisionPositionWidget;", "Ldji/v5/ux/core/base/widget/ConstraintLayoutWidget;", "Ldji/v5/ux/obstacle/VisionPositionWidget$ModelState;", "Ldji/v5/ux/core/base/SwitcherCell$OnCheckedChangedListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Ldji/v5/ux/databinding/UxsdkWidgetVisionPositionWidgetLayoutBinding;", "listener", "Ldji/v5/ux/obstacle/SwitchStateListener;", "widgetModel", "Ldji/v5/ux/obstacle/VisionPositionWidgetModel;", "getWidgetModel", "()Ldji/v5/ux/obstacle/VisionPositionWidgetModel;", "widgetModel$delegate", "Lkotlin/Lazy;", "getIdealDimensionRatioString", "", "initView", "", "onAttachedToWindow", "onCheckedChanged", "cell", "Ldji/v5/ux/core/base/SwitcherCell;", "isChecked", "", "onDetachedFromWindow", "reactToModelChanges", "setSwitchStateListener", "updateVisionSwitchCell", "enable", "ModelState", "android-sdk-v5-uxsdk_debug"})
public final class VisionPositionWidget extends dji.v5.ux.core.base.widget.ConstraintLayoutWidget<dji.v5.ux.obstacle.VisionPositionWidget.ModelState> implements dji.v5.ux.core.base.SwitcherCell.OnCheckedChangedListener {
    private dji.v5.ux.databinding.UxsdkWidgetVisionPositionWidgetLayoutBinding binding;
    private dji.v5.ux.obstacle.SwitchStateListener listener;
    private final kotlin.Lazy widgetModel$delegate = null;
    
    @kotlin.jvm.JvmOverloads
    public VisionPositionWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public VisionPositionWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public VisionPositionWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    private final dji.v5.ux.obstacle.VisionPositionWidgetModel getWidgetModel() {
        return null;
    }
    
    @java.lang.Override
    protected void initView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
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
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String getIdealDimensionRatioString() {
        return null;
    }
    
    @java.lang.Override
    public void onCheckedChanged(@org.jetbrains.annotations.Nullable
    dji.v5.ux.core.base.SwitcherCell cell, boolean isChecked) {
    }
    
    /**
     * 启用视视觉定位
     * @param enable 开启
     */
    private final void updateVisionSwitchCell(boolean enable) {
    }
    
    public final void setSwitchStateListener(@org.jetbrains.annotations.NotNull
    dji.v5.ux.obstacle.SwitchStateListener listener) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/obstacle/VisionPositionWidget$ModelState;", "", "()V", "android-sdk-v5-uxsdk_debug"})
    public static abstract class ModelState {
        
        private ModelState() {
            super();
        }
    }
}