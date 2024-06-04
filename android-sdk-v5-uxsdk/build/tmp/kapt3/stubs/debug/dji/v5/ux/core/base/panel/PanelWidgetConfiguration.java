package dji.v5.ux.core.base.panel;

import java.lang.System;

/**
 * Configuration properties to initialize a panel.
 * @param context asd
 * @property panelWidgetType The type of panel widget
 * @property showTitleBar Boolean to hide or show the whole title bar
 * @property hasCloseButton Boolean to hide or show the close button
 * @property panelTitle Default panel title text
 * @param titleBarHeightDimensionResID [DimenRes] for the height of the title bar
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0003\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u0006\u0010\"\u001a\u00020\u0007R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u0006#"}, d2 = {"Ldji/v5/ux/core/base/panel/PanelWidgetConfiguration;", "", "context", "Landroid/content/Context;", "panelWidgetType", "Ldji/v5/ux/core/base/panel/PanelWidgetType;", "showTitleBar", "", "hasCloseButton", "panelTitle", "", "titleBarHeightDimensionResID", "", "(Landroid/content/Context;Ldji/v5/ux/core/base/panel/PanelWidgetType;ZZLjava/lang/String;I)V", "getHasCloseButton", "()Z", "setHasCloseButton", "(Z)V", "getPanelTitle", "()Ljava/lang/String;", "setPanelTitle", "(Ljava/lang/String;)V", "getPanelWidgetType", "()Ldji/v5/ux/core/base/panel/PanelWidgetType;", "setPanelWidgetType", "(Ldji/v5/ux/core/base/panel/PanelWidgetType;)V", "getShowTitleBar", "setShowTitleBar", "titleBarHeight", "", "getTitleBarHeight", "()F", "setTitleBarHeight", "(F)V", "isBarPanelWidget", "android-sdk-v5-uxsdk_debug"})
public final class PanelWidgetConfiguration {
    @org.jetbrains.annotations.NotNull
    private dji.v5.ux.core.base.panel.PanelWidgetType panelWidgetType;
    private boolean showTitleBar;
    private boolean hasCloseButton;
    @org.jetbrains.annotations.NotNull
    private java.lang.String panelTitle;
    
    /**
     * The title bar height in pixels.
     */
    @androidx.annotation.Px
    private float titleBarHeight;
    
    public PanelWidgetConfiguration(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.PanelWidgetType panelWidgetType, boolean showTitleBar, boolean hasCloseButton, @org.jetbrains.annotations.NotNull
    java.lang.String panelTitle, @androidx.annotation.DimenRes
    int titleBarHeightDimensionResID) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.base.panel.PanelWidgetType getPanelWidgetType() {
        return null;
    }
    
    public final void setPanelWidgetType(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.PanelWidgetType p0) {
    }
    
    public final boolean getShowTitleBar() {
        return false;
    }
    
    public final void setShowTitleBar(boolean p0) {
    }
    
    public final boolean getHasCloseButton() {
        return false;
    }
    
    public final void setHasCloseButton(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPanelTitle() {
        return null;
    }
    
    public final void setPanelTitle(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final float getTitleBarHeight() {
        return 0.0F;
    }
    
    public final void setTitleBarHeight(float p0) {
    }
    
    /**
     * Check if the [PanelWidget] is a [BarPanelWidget].
     */
    public final boolean isBarPanelWidget() {
        return false;
    }
}