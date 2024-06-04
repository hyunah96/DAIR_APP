package dji.v5.ux.warning;

import java.lang.System;

/**
 * Topbar上的告警提示
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 C2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001CB%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\"\u0010<\u001a\u00020=2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010>\u001a\u00020=H\u0014J\b\u0010?\u001a\u00020=H\u0014J\b\u0010@\u001a\u00020=H\u0014J\b\u0010A\u001a\u00020=H\u0002J\b\u0010B\u001a\u00020=H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u001fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\u001a\u0010\'\u001a\u00020\u001fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R\u001a\u0010*\u001a\u00020\u001fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R\u001a\u0010-\u001a\u00020.X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001b\u00103\u001a\u0002048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b7\u0010\u001d\u001a\u0004\b5\u00106R\u0014\u00108\u001a\u000209X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010;\u00a8\u0006D"}, d2 = {"Ldji/v5/ux/warning/DeviceHealthAndStatusWidget;", "Ldji/v5/ux/core/base/widget/ConstraintLayoutWidget;", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Ldji/v5/ux/databinding/UxsdkFpvTopBarWidgetWarningMessageBinding;", "cardViewWarningWrapper", "Landroid/widget/FrameLayout;", "getCardViewWarningWrapper", "()Landroid/widget/FrameLayout;", "setCardViewWarningWrapper", "(Landroid/widget/FrameLayout;)V", "popover", "Ldji/v5/ux/core/popover/Popover;", "getPopover", "()Ldji/v5/ux/core/popover/Popover;", "setPopover", "(Ldji/v5/ux/core/popover/Popover;)V", "popupView", "Landroid/view/View;", "getPopupView", "()Landroid/view/View;", "popupView$delegate", "Lkotlin/Lazy;", "tvLevel2Count", "Landroid/widget/TextView;", "getTvLevel2Count", "()Landroid/widget/TextView;", "setTvLevel2Count", "(Landroid/widget/TextView;)V", "tvLevel3Count", "getTvLevel3Count", "setTvLevel3Count", "tvNoMessage", "getTvNoMessage", "setTvNoMessage", "tvWarningMessage", "getTvWarningMessage", "setTvWarningMessage", "warningMessageCountWrapper", "Landroid/view/ViewGroup;", "getWarningMessageCountWrapper", "()Landroid/view/ViewGroup;", "setWarningMessageCountWrapper", "(Landroid/view/ViewGroup;)V", "widgetModel", "Ldji/v5/ux/warning/DeviceHealthAndStatusWidgetModel;", "getWidgetModel", "()Ldji/v5/ux/warning/DeviceHealthAndStatusWidgetModel;", "widgetModel$delegate", "widgetSizeDescription", "Ldji/v5/ux/core/base/WidgetSizeDescription;", "getWidgetSizeDescription", "()Ldji/v5/ux/core/base/WidgetSizeDescription;", "initView", "", "onAttachedToWindow", "onDetachedFromWindow", "reactToModelChanges", "updateDisplayMessage", "updateLevelCount", "Companion", "android-sdk-v5-uxsdk_debug"})
public class DeviceHealthAndStatusWidget extends dji.v5.ux.core.base.widget.ConstraintLayoutWidget<java.lang.Object> {
    private dji.v5.ux.databinding.UxsdkFpvTopBarWidgetWarningMessageBinding binding;
    public android.view.ViewGroup warningMessageCountWrapper;
    public android.widget.FrameLayout cardViewWarningWrapper;
    public android.widget.TextView tvWarningMessage;
    public android.widget.TextView tvLevel3Count;
    public android.widget.TextView tvLevel2Count;
    public android.widget.TextView tvNoMessage;
    private final kotlin.Lazy popupView$delegate = null;
    @org.jetbrains.annotations.Nullable
    private dji.v5.ux.core.popover.Popover popover;
    private final kotlin.Lazy widgetModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.base.WidgetSizeDescription widgetSizeDescription = null;
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.warning.DeviceHealthAndStatusWidget.Companion Companion = null;
    
    @kotlin.jvm.JvmOverloads
    public DeviceHealthAndStatusWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public DeviceHealthAndStatusWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public DeviceHealthAndStatusWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.view.ViewGroup getWarningMessageCountWrapper() {
        return null;
    }
    
    public final void setWarningMessageCountWrapper(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.FrameLayout getCardViewWarningWrapper() {
        return null;
    }
    
    public final void setCardViewWarningWrapper(@org.jetbrains.annotations.NotNull
    android.widget.FrameLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.TextView getTvWarningMessage() {
        return null;
    }
    
    public final void setTvWarningMessage(@org.jetbrains.annotations.NotNull
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.TextView getTvLevel3Count() {
        return null;
    }
    
    public final void setTvLevel3Count(@org.jetbrains.annotations.NotNull
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.TextView getTvLevel2Count() {
        return null;
    }
    
    public final void setTvLevel2Count(@org.jetbrains.annotations.NotNull
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.TextView getTvNoMessage() {
        return null;
    }
    
    public final void setTvNoMessage(@org.jetbrains.annotations.NotNull
    android.widget.TextView p0) {
    }
    
    private final android.view.View getPopupView() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final dji.v5.ux.core.popover.Popover getPopover() {
        return null;
    }
    
    public final void setPopover(@org.jetbrains.annotations.Nullable
    dji.v5.ux.core.popover.Popover p0) {
    }
    
    private final dji.v5.ux.warning.DeviceHealthAndStatusWidgetModel getWidgetModel() {
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
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dji.v5.ux.core.base.WidgetSizeDescription getWidgetSizeDescription() {
        return null;
    }
    
    private final void updateDisplayMessage() {
    }
    
    @java.lang.Override
    protected void onAttachedToWindow() {
    }
    
    @java.lang.Override
    protected void onDetachedFromWindow() {
    }
    
    /**
     * 更新告警信息的数字
     */
    private final void updateLevelCount() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\b"}, d2 = {"Ldji/v5/ux/warning/DeviceHealthAndStatusWidget$Companion;", "", "()V", "colorResId", "", "warningLevel", "Ldji/v5/manager/diagnostic/WarningLevel;", "popColorResId", "android-sdk-v5-uxsdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final int colorResId(@org.jetbrains.annotations.NotNull
        dji.v5.manager.diagnostic.WarningLevel warningLevel) {
            return 0;
        }
        
        public final int popColorResId(@org.jetbrains.annotations.NotNull
        dji.v5.manager.diagnostic.WarningLevel warningLevel) {
            return 0;
        }
    }
}