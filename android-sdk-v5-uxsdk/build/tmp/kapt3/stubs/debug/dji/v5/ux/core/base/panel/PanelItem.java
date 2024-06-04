package dji.v5.ux.core.base.panel;

import java.lang.System;

/**
 * Encapsulates a View with properties used to define how it is laid out.
 * @property view The child view to add into a panel.
 * @property itemMarginLeft Left margin pixel size, null by default
 * @property itemMarginTop Top margin pixel size, null by default
 * @property itemMarginRight Right margin pixel size, null by default
 * @property itemMarginBottom Bottom margin pixel size, null by default
 * @param desiredWidgetSizeDescription Widget size description, null by default
 * @param desiredRatioString Desired ratio for the view of the width to height, null by default
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006\u001c"}, d2 = {"Ldji/v5/ux/core/base/panel/PanelItem;", "", "view", "Landroid/view/View;", "itemMarginLeft", "", "itemMarginTop", "itemMarginRight", "itemMarginBottom", "desiredWidgetSizeDescription", "Ldji/v5/ux/core/base/WidgetSizeDescription;", "desiredRatioString", "", "(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ldji/v5/ux/core/base/WidgetSizeDescription;Ljava/lang/String;)V", "getItemMarginBottom", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getItemMarginLeft", "getItemMarginRight", "getItemMarginTop", "ratioString", "getRatioString", "()Ljava/lang/String;", "getView", "()Landroid/view/View;", "widgetSizeDescription", "getWidgetSizeDescription", "()Ldji/v5/ux/core/base/WidgetSizeDescription;", "android-sdk-v5-uxsdk_debug"})
public final class PanelItem {
    @org.jetbrains.annotations.NotNull
    private final android.view.View view = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer itemMarginLeft = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer itemMarginTop = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer itemMarginRight = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer itemMarginBottom = null;
    
    /**
     * The default [WidgetSizeDescription].
     */
    @org.jetbrains.annotations.Nullable
    private final dji.v5.ux.core.base.WidgetSizeDescription widgetSizeDescription = null;
    
    /**
     * The default ratio [String] of the width to height.
     */
    @org.jetbrains.annotations.Nullable
    private final java.lang.String ratioString = null;
    
    public PanelItem(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    @androidx.annotation.IntRange(from = 0L)
    java.lang.Integer itemMarginLeft, @org.jetbrains.annotations.Nullable
    @androidx.annotation.IntRange(from = 0L)
    java.lang.Integer itemMarginTop, @org.jetbrains.annotations.Nullable
    @androidx.annotation.IntRange(from = 0L)
    java.lang.Integer itemMarginRight, @org.jetbrains.annotations.Nullable
    @androidx.annotation.IntRange(from = 0L)
    java.lang.Integer itemMarginBottom, @org.jetbrains.annotations.Nullable
    dji.v5.ux.core.base.WidgetSizeDescription desiredWidgetSizeDescription, @org.jetbrains.annotations.Nullable
    java.lang.String desiredRatioString) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.view.View getView() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getItemMarginLeft() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getItemMarginTop() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getItemMarginRight() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getItemMarginBottom() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final dji.v5.ux.core.base.WidgetSizeDescription getWidgetSizeDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRatioString() {
        return null;
    }
}