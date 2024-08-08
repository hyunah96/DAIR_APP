package dji.v5.ux.core.base.panel.listitem;

import java.lang.System;

/**
 * This is the base class to be used for display
 * type of list item
 * @property widgetType - The [WidgetType] of the current widget.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004:\u0002fgB5\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000eJ\b\u0010R\u001a\u00020SH\u0002J\b\u0010T\u001a\u00020SH\u0002J\b\u0010U\u001a\u00020SH\u0002J\u000e\u0010V\u001a\b\u0012\u0004\u0012\u00020M0WH\u0016J\u0018\u0010X\u001a\u00020S2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0003J\b\u0010Y\u001a\u00020SH\u0002J\b\u0010Z\u001a\u00020SH\u0002J\b\u0010[\u001a\u00020SH&J\u0012\u0010\\\u001a\u00020S2\b\u0010]\u001a\u0004\u0018\u00010^H\u0017J\b\u0010_\u001a\u00020SH\u0017J\u0010\u0010`\u001a\u00020S2\u0006\u0010a\u001a\u00020\u0018H\u0016J\u0010\u0010\u0016\u001a\u00020S2\b\b\u0001\u0010b\u001a\u00020\nJ\u0010\u0010c\u001a\u00020S2\b\b\u0001\u0010d\u001a\u00020\nJ\u0010\u0010=\u001a\u00020S2\b\b\u0001\u0010b\u001a\u00020\nJ\u0010\u0010e\u001a\u00020S2\b\b\u0001\u0010d\u001a\u00020\nR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00188F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u001e8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R&\u0010$\u001a\u00020\n2\b\b\u0001\u0010\u0011\u001a\u00020\n8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R(\u0010*\u001a\u0004\u0018\u00010)2\b\u0010\u0011\u001a\u0004\u0018\u00010)8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R&\u00100\u001a\u00020/2\b\b\u0001\u0010\u0011\u001a\u00020/8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u00105\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00188F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b6\u0010\u001b\"\u0004\b7\u0010\u001dR*\u00108\u001a\u0004\u0018\u00010\u001e2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u001e8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b9\u0010!\"\u0004\b:\u0010#R(\u0010;\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b<\u0010\u0015\"\u0004\b=\u0010\u0017R&\u0010>\u001a\u00020\n2\b\b\u0001\u0010\u0011\u001a\u00020\n8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b?\u0010&\"\u0004\b@\u0010(R(\u0010A\u001a\u0004\u0018\u00010)2\b\u0010\u0011\u001a\u0004\u0018\u00010)8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bB\u0010,\"\u0004\bC\u0010.R&\u0010D\u001a\u00020/2\b\b\u0001\u0010\u0011\u001a\u00020/8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bE\u00102\"\u0004\bF\u00104R\u000e\u0010G\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010H\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00188F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bI\u0010\u001b\"\u0004\bJ\u0010\u001dR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020M0LX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010Q\u00a8\u0006h"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemLabelButtonWidget;", "T", "", "Ldji/v5/ux/core/base/panel/listitem/ListItemTitleWidget;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "widgetType", "Ldji/v5/ux/core/base/panel/listitem/ListItemLabelButtonWidget$WidgetType;", "defaultStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;ILdji/v5/ux/core/base/panel/listitem/ListItemLabelButtonWidget$WidgetType;I)V", "listItemButton", "Landroid/widget/TextView;", "value", "Landroid/graphics/drawable/Drawable;", "listItemButtonBackground", "getListItemButtonBackground", "()Landroid/graphics/drawable/Drawable;", "setListItemButtonBackground", "(Landroid/graphics/drawable/Drawable;)V", "", "listItemButtonEnabled", "getListItemButtonEnabled", "()Z", "setListItemButtonEnabled", "(Z)V", "", "listItemButtonText", "getListItemButtonText", "()Ljava/lang/String;", "setListItemButtonText", "(Ljava/lang/String;)V", "listItemButtonTextColor", "getListItemButtonTextColor", "()I", "setListItemButtonTextColor", "(I)V", "Landroid/content/res/ColorStateList;", "listItemButtonTextColors", "getListItemButtonTextColors", "()Landroid/content/res/ColorStateList;", "setListItemButtonTextColors", "(Landroid/content/res/ColorStateList;)V", "", "listItemButtonTextSize", "getListItemButtonTextSize", "()F", "setListItemButtonTextSize", "(F)V", "listItemButtonVisibility", "getListItemButtonVisibility", "setListItemButtonVisibility", "listItemLabel", "getListItemLabel", "setListItemLabel", "listItemLabelBackground", "getListItemLabelBackground", "setListItemLabelBackground", "listItemLabelTextColor", "getListItemLabelTextColor", "setListItemLabelTextColor", "listItemLabelTextColors", "getListItemLabelTextColors", "setListItemLabelTextColors", "listItemLabelTextSize", "getListItemLabelTextSize", "setListItemLabelTextSize", "listItemLabelTextView", "listItemLabelVisibility", "getListItemLabelVisibility", "setListItemLabelVisibility", "uiUpdateStateProcessor", "Lio/reactivex/rxjava3/processors/PublishProcessor;", "Ldji/v5/ux/core/base/panel/listitem/ListItemLabelButtonWidget$UIState;", "getUiUpdateStateProcessor", "()Lio/reactivex/rxjava3/processors/PublishProcessor;", "getWidgetType", "()Ldji/v5/ux/core/base/panel/listitem/ListItemLabelButtonWidget$WidgetType;", "configureButtonWidget", "", "configureLabelButtonWidget", "configureLabelWidget", "getUIStateUpdates", "Lio/reactivex/rxjava3/core/Flowable;", "initAttributes", "initButton", "initLabel", "onButtonClick", "onClick", "view", "Landroid/view/View;", "onListItemClick", "setEnabled", "enabled", "resourceId", "setListItemButtonTextAppearance", "textAppearanceResId", "setListItemLabelTextAppearance", "UIState", "WidgetType", "android-sdk-v5-uxsdk_debug"})
public abstract class ListItemLabelButtonWidget<T extends java.lang.Object> extends dji.v5.ux.core.base.panel.listitem.ListItemTitleWidget<T> implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.base.panel.listitem.ListItemLabelButtonWidget.WidgetType widgetType = null;
    private final android.widget.TextView listItemButton = null;
    private final android.widget.TextView listItemLabelTextView = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.rxjava3.processors.PublishProcessor<dji.v5.ux.core.base.panel.listitem.ListItemLabelButtonWidget.UIState> uiUpdateStateProcessor = null;
    
    @kotlin.jvm.JvmOverloads
    public ListItemLabelButtonWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.listitem.ListItemLabelButtonWidget.WidgetType widgetType, int defaultStyle) {
        super(null, null, 0, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public ListItemLabelButtonWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.listitem.ListItemLabelButtonWidget.WidgetType widgetType, int defaultStyle) {
        super(null, null, 0, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public ListItemLabelButtonWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.listitem.ListItemLabelButtonWidget.WidgetType widgetType, int defaultStyle) {
        super(null, null, 0, 0);
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.base.panel.listitem.ListItemLabelButtonWidget.WidgetType getWidgetType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final io.reactivex.rxjava3.processors.PublishProcessor<dji.v5.ux.core.base.panel.listitem.ListItemLabelButtonWidget.UIState> getUiUpdateStateProcessor() {
        return null;
    }
    
    /**
     * Get the [UIState] updates
     */
    @org.jetbrains.annotations.NotNull
    public io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.base.panel.listitem.ListItemLabelButtonWidget.UIState> getUIStateUpdates() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.annotation.Nullable
    public final java.lang.String getListItemLabel() {
        return null;
    }
    
    public final void setListItemLabel(@org.jetbrains.annotations.Nullable
    @androidx.annotation.Nullable
    java.lang.String value) {
    }
    
    @androidx.annotation.Dimension
    public final float getListItemLabelTextSize() {
        return 0.0F;
    }
    
    public final void setListItemLabelTextSize(@androidx.annotation.Dimension
    float value) {
    }
    
    @androidx.annotation.ColorInt
    public final int getListItemLabelTextColor() {
        return 0;
    }
    
    public final void setListItemLabelTextColor(@androidx.annotation.ColorInt
    int value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.content.res.ColorStateList getListItemLabelTextColors() {
        return null;
    }
    
    public final void setListItemLabelTextColors(@org.jetbrains.annotations.Nullable
    android.content.res.ColorStateList value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getListItemLabelBackground() {
        return null;
    }
    
    public final void setListItemLabelBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    public final boolean getListItemLabelVisibility() {
        return false;
    }
    
    public final void setListItemLabelVisibility(boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.annotation.Nullable
    public final java.lang.String getListItemButtonText() {
        return null;
    }
    
    public final void setListItemButtonText(@org.jetbrains.annotations.Nullable
    @androidx.annotation.Nullable
    java.lang.String value) {
    }
    
    @androidx.annotation.Dimension
    public final float getListItemButtonTextSize() {
        return 0.0F;
    }
    
    public final void setListItemButtonTextSize(@androidx.annotation.Dimension
    float value) {
    }
    
    @androidx.annotation.ColorInt
    public final int getListItemButtonTextColor() {
        return 0;
    }
    
    public final void setListItemButtonTextColor(@androidx.annotation.ColorInt
    int value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.content.res.ColorStateList getListItemButtonTextColors() {
        return null;
    }
    
    public final void setListItemButtonTextColors(@org.jetbrains.annotations.Nullable
    android.content.res.ColorStateList value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getListItemButtonBackground() {
        return null;
    }
    
    public final void setListItemButtonBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    public final boolean getListItemButtonEnabled() {
        return false;
    }
    
    public final void setListItemButtonEnabled(boolean value) {
    }
    
    public final boolean getListItemButtonVisibility() {
        return false;
    }
    
    public final void setListItemButtonVisibility(boolean value) {
    }
    
    @android.annotation.SuppressLint(value = {"Recycle"})
    private final void initAttributes(android.content.Context context, android.util.AttributeSet attrs) {
    }
    
    private final void initLabel() {
    }
    
    private final void initButton() {
    }
    
    private final void configureLabelWidget() {
    }
    
    private final void configureButtonWidget() {
    }
    
    private final void configureLabelButtonWidget() {
    }
    
    /**
     * Set the background of the item button
     *
     * @param resourceId Integer ID of the background resource
     */
    public final void setListItemButtonBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the text appearance of the item button
     *
     * @param textAppearanceResId Style resource for text appearance
     */
    public final void setListItemButtonTextAppearance(@androidx.annotation.StyleRes
    int textAppearanceResId) {
    }
    
    /**
     * Set the background of the item label
     *
     * @param resourceId Integer ID of the background resource
     */
    public final void setListItemLabelBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the text appearance of the item label
     *
     * @param textAppearanceResId Style resource for text appearance
     */
    public final void setListItemLabelTextAppearance(@androidx.annotation.StyleRes
    int textAppearanceResId) {
    }
    
    @java.lang.Override
    public void setEnabled(boolean enabled) {
    }
    
    @androidx.annotation.CallSuper
    @java.lang.Override
    public void onClick(@org.jetbrains.annotations.Nullable
    android.view.View view) {
    }
    
    @androidx.annotation.CallSuper
    @java.lang.Override
    public void onListItemClick() {
    }
    
    public abstract void onButtonClick();
    
    /**
     * Widget UI update State
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemLabelButtonWidget$UIState;", "", "()V", "ButtonClicked", "DialogActionCanceled", "DialogActionConfirmed", "DialogDismissed", "DialogDisplayed", "ListItemClicked", "Ldji/v5/ux/core/base/panel/listitem/ListItemLabelButtonWidget$UIState$ButtonClicked;", "Ldji/v5/ux/core/base/panel/listitem/ListItemLabelButtonWidget$UIState$DialogActionCanceled;", "Ldji/v5/ux/core/base/panel/listitem/ListItemLabelButtonWidget$UIState$DialogActionConfirmed;", "Ldji/v5/ux/core/base/panel/listitem/ListItemLabelButtonWidget$UIState$DialogDismissed;", "Ldji/v5/ux/core/base/panel/listitem/ListItemLabelButtonWidget$UIState$DialogDisplayed;", "Ldji/v5/ux/core/base/panel/listitem/ListItemLabelButtonWidget$UIState$ListItemClicked;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class UIState {
        
        private UIState() {
            super();
        }
        
        /**
         * List Item click update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemLabelButtonWidget$UIState$ListItemClicked;", "Ldji/v5/ux/core/base/panel/listitem/ListItemLabelButtonWidget$UIState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class ListItemClicked extends dji.v5.ux.core.base.panel.listitem.ListItemLabelButtonWidget.UIState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.base.panel.listitem.ListItemLabelButtonWidget.UIState.ListItemClicked INSTANCE = null;
            
            private ListItemClicked() {
                super();
            }
        }
        
        /**
         * Button click update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemLabelButtonWidget$UIState$ButtonClicked;", "Ldji/v5/ux/core/base/panel/listitem/ListItemLabelButtonWidget$UIState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class ButtonClicked extends dji.v5.ux.core.base.panel.listitem.ListItemLabelButtonWidget.UIState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.base.panel.listitem.ListItemLabelButtonWidget.UIState.ButtonClicked INSTANCE = null;
            
            private ButtonClicked() {
                super();
            }
        }
        
        /**
         * Dialog shown update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemLabelButtonWidget$UIState$DialogDisplayed;", "Ldji/v5/ux/core/base/panel/listitem/ListItemLabelButtonWidget$UIState;", "info", "", "(Ljava/lang/Object;)V", "getInfo", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class DialogDisplayed extends dji.v5.ux.core.base.panel.listitem.ListItemLabelButtonWidget.UIState {
            @org.jetbrains.annotations.Nullable
            private final java.lang.Object info = null;
            
            /**
             * Dialog shown update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.base.panel.listitem.ListItemLabelButtonWidget.UIState.DialogDisplayed copy(@org.jetbrains.annotations.Nullable
            java.lang.Object info) {
                return null;
            }
            
            /**
             * Dialog shown update
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Dialog shown update
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Dialog shown update
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public DialogDisplayed(@org.jetbrains.annotations.Nullable
            java.lang.Object info) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object getInfo() {
                return null;
            }
        }
        
        /**
         * Dialog action confirm
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemLabelButtonWidget$UIState$DialogActionConfirmed;", "Ldji/v5/ux/core/base/panel/listitem/ListItemLabelButtonWidget$UIState;", "info", "", "(Ljava/lang/Object;)V", "getInfo", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class DialogActionConfirmed extends dji.v5.ux.core.base.panel.listitem.ListItemLabelButtonWidget.UIState {
            @org.jetbrains.annotations.Nullable
            private final java.lang.Object info = null;
            
            /**
             * Dialog action confirm
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.base.panel.listitem.ListItemLabelButtonWidget.UIState.DialogActionConfirmed copy(@org.jetbrains.annotations.Nullable
            java.lang.Object info) {
                return null;
            }
            
            /**
             * Dialog action confirm
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Dialog action confirm
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Dialog action confirm
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public DialogActionConfirmed(@org.jetbrains.annotations.Nullable
            java.lang.Object info) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object getInfo() {
                return null;
            }
        }
        
        /**
         * Dialog action cancel
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemLabelButtonWidget$UIState$DialogActionCanceled;", "Ldji/v5/ux/core/base/panel/listitem/ListItemLabelButtonWidget$UIState;", "info", "", "(Ljava/lang/Object;)V", "getInfo", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class DialogActionCanceled extends dji.v5.ux.core.base.panel.listitem.ListItemLabelButtonWidget.UIState {
            @org.jetbrains.annotations.Nullable
            private final java.lang.Object info = null;
            
            /**
             * Dialog action cancel
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.base.panel.listitem.ListItemLabelButtonWidget.UIState.DialogActionCanceled copy(@org.jetbrains.annotations.Nullable
            java.lang.Object info) {
                return null;
            }
            
            /**
             * Dialog action cancel
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Dialog action cancel
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Dialog action cancel
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public DialogActionCanceled(@org.jetbrains.annotations.Nullable
            java.lang.Object info) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object getInfo() {
                return null;
            }
        }
        
        /**
         * Dialog action dismiss
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemLabelButtonWidget$UIState$DialogDismissed;", "Ldji/v5/ux/core/base/panel/listitem/ListItemLabelButtonWidget$UIState;", "info", "", "(Ljava/lang/Object;)V", "getInfo", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class DialogDismissed extends dji.v5.ux.core.base.panel.listitem.ListItemLabelButtonWidget.UIState {
            @org.jetbrains.annotations.Nullable
            private final java.lang.Object info = null;
            
            /**
             * Dialog action dismiss
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.base.panel.listitem.ListItemLabelButtonWidget.UIState.DialogDismissed copy(@org.jetbrains.annotations.Nullable
            java.lang.Object info) {
                return null;
            }
            
            /**
             * Dialog action dismiss
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Dialog action dismiss
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Dialog action dismiss
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public DialogDismissed(@org.jetbrains.annotations.Nullable
            java.lang.Object info) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object getInfo() {
                return null;
            }
        }
    }
    
    /**
     * Defines the type of widget
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemLabelButtonWidget$WidgetType;", "", "(Ljava/lang/String;I)V", "LABEL", "BUTTON", "LABEL_BUTTON", "android-sdk-v5-uxsdk_debug"})
    public static enum WidgetType {
        /*public static final*/ LABEL /* = new LABEL() */,
        /*public static final*/ BUTTON /* = new BUTTON() */,
        /*public static final*/ LABEL_BUTTON /* = new LABEL_BUTTON() */;
        
        WidgetType() {
        }
    }
}