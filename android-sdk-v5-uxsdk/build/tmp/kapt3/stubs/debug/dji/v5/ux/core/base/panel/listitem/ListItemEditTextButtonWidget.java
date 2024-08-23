package dji.v5.ux.core.base.panel.listitem;

import java.lang.System;

/**
 * This is the base class to be used for list item
 * The class represents the item with icon, item name and editable fields
 * @property widgetType - The [WidgetType] of the current widget.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004:\u0004\u008e\u0001\u008f\u0001B7\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000eJ\b\u0010p\u001a\u00020qH\u0002J\b\u0010r\u001a\u00020qH\u0002J\u000e\u0010s\u001a\b\u0012\u0004\u0012\u00020k0tH\u0016J\b\u0010u\u001a\u00020qH\u0002J\u001a\u0010v\u001a\u00020q2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0003J\b\u0010w\u001a\u00020qH\u0002J\b\u0010x\u001a\u00020qH\u0002J\b\u0010y\u001a\u00020qH\u0002J\u001a\u0010z\u001a\u00020\u001d2\u0006\u0010{\u001a\u00020\n2\b\u0010|\u001a\u0004\u0018\u00010}H\u0002J\b\u0010~\u001a\u00020qH\u0014J\b\u0010\u007f\u001a\u00020qH&J\u0015\u0010\u0080\u0001\u001a\u00020q2\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0082\u0001H\u0017J\u0014\u0010\u0083\u0001\u001a\u00020q2\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010$H&J\t\u0010\u0085\u0001\u001a\u00020qH&J\t\u0010\u0086\u0001\u001a\u00020qH\u0017J\u0012\u0010\u0087\u0001\u001a\u00020q2\u0007\u0010\u0088\u0001\u001a\u00020\u001dH\u0016J\u0011\u0010\u001b\u001a\u00020q2\t\b\u0001\u0010\u0089\u0001\u001a\u00020\nJ\u0012\u0010\u008a\u0001\u001a\u00020q2\t\b\u0001\u0010\u008b\u0001\u001a\u00020\nJ\u0011\u0010>\u001a\u00020q2\t\b\u0001\u0010\u0089\u0001\u001a\u00020\nJ\u0012\u0010\u008c\u0001\u001a\u00020q2\t\b\u0001\u0010\u008b\u0001\u001a\u00020\nJ\u0011\u0010[\u001a\u00020q2\t\b\u0001\u0010\u0089\u0001\u001a\u00020\nJ\u0012\u0010\u008d\u0001\u001a\u00020q2\t\b\u0001\u0010\u008b\u0001\u001a\u00020\nR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u001d8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0001\u0010#\u001a\u0004\u0018\u00010$8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R&\u0010*\u001a\u00020\n2\b\b\u0001\u0010\u0016\u001a\u00020\n8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b+\u0010\u0011\"\u0004\b,\u0010\u0013R(\u0010.\u001a\u0004\u0018\u00010-2\b\u0010\u0016\u001a\u0004\u0018\u00010-8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R&\u00104\u001a\u0002032\b\b\u0001\u0010#\u001a\u0002038G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u00109\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u001d8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b:\u0010 \"\u0004\b;\u0010\"R(\u0010<\u001a\u0004\u0018\u00010\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b=\u0010\u001a\"\u0004\b>\u0010\u001cR&\u0010?\u001a\u00020\n2\b\b\u0001\u0010\u0016\u001a\u00020\n8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b@\u0010\u0011\"\u0004\bA\u0010\u0013R(\u0010B\u001a\u0004\u0018\u00010-2\b\u0010\u0016\u001a\u0004\u0018\u00010-8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bC\u00100\"\u0004\bD\u00102R$\u0010E\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bF\u0010\u0011\"\u0004\bG\u0010\u0013R$\u0010H\u001a\u0002032\u0006\u0010\u0016\u001a\u0002038F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bI\u00106\"\u0004\bJ\u00108R(\u0010K\u001a\u0004\u0018\u00010$2\b\u0010\u0016\u001a\u0004\u0018\u00010$8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bL\u0010\'\"\u0004\bM\u0010)R\u000e\u0010N\u001a\u00020OX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010P\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u001d8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bQ\u0010 \"\u0004\bR\u0010\"R&\u0010S\u001a\u00020\n2\b\b\u0001\u0010\u0016\u001a\u00020\n8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bT\u0010\u0011\"\u0004\bU\u0010\u0013R*\u0010V\u001a\u0004\u0018\u00010$2\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010$8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bW\u0010\'\"\u0004\bX\u0010)R(\u0010Y\u001a\u0004\u0018\u00010\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bZ\u0010\u001a\"\u0004\b[\u0010\u001cR&\u0010\\\u001a\u00020\n2\b\b\u0001\u0010\u0016\u001a\u00020\n8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b]\u0010\u0011\"\u0004\b^\u0010\u0013R(\u0010_\u001a\u0004\u0018\u00010-2\b\u0010\u0016\u001a\u0004\u0018\u00010-8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b`\u00100\"\u0004\ba\u00102R&\u0010b\u001a\u0002032\b\b\u0001\u0010\u0016\u001a\u0002038G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bc\u00106\"\u0004\bd\u00108R\u000e\u0010e\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010f\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u001d8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bg\u0010 \"\u0004\bh\u0010\"R\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020k0jX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\bn\u0010o\u00a8\u0006\u0090\u0001"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget;", "T", "", "Ldji/v5/ux/core/base/panel/listitem/ListItemTitleWidget;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "widgetType", "Ldji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget$WidgetType;", "defaultStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;ILdji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget$WidgetType;I)V", "editTextNormalColor", "getEditTextNormalColor", "()I", "setEditTextNormalColor", "(I)V", "listItemButton", "Landroid/widget/TextView;", "value", "Landroid/graphics/drawable/Drawable;", "listItemButtonBackground", "getListItemButtonBackground", "()Landroid/graphics/drawable/Drawable;", "setListItemButtonBackground", "(Landroid/graphics/drawable/Drawable;)V", "", "listItemButtonEnabled", "getListItemButtonEnabled", "()Z", "setListItemButtonEnabled", "(Z)V", "hint", "", "listItemButtonText", "getListItemButtonText", "()Ljava/lang/String;", "setListItemButtonText", "(Ljava/lang/String;)V", "listItemButtonTextColor", "getListItemButtonTextColor", "setListItemButtonTextColor", "Landroid/content/res/ColorStateList;", "listItemButtonTextColors", "getListItemButtonTextColors", "()Landroid/content/res/ColorStateList;", "setListItemButtonTextColors", "(Landroid/content/res/ColorStateList;)V", "", "listItemButtonTextSize", "getListItemButtonTextSize", "()F", "setListItemButtonTextSize", "(F)V", "listItemButtonVisibility", "getListItemButtonVisibility", "setListItemButtonVisibility", "listItemEditTextBackground", "getListItemEditTextBackground", "setListItemEditTextBackground", "listItemEditTextColor", "getListItemEditTextColor", "setListItemEditTextColor", "listItemEditTextColors", "getListItemEditTextColors", "setListItemEditTextColors", "listItemEditTextInputType", "getListItemEditTextInputType", "setListItemEditTextInputType", "listItemEditTextSize", "getListItemEditTextSize", "setListItemEditTextSize", "listItemEditTextValue", "getListItemEditTextValue", "setListItemEditTextValue", "listItemEditTextView", "Landroid/widget/EditText;", "listItemEditTextVisibility", "getListItemEditTextVisibility", "setListItemEditTextVisibility", "listItemEditTextWidth", "getListItemEditTextWidth", "setListItemEditTextWidth", "listItemHint", "getListItemHint", "setListItemHint", "listItemHintBackground", "getListItemHintBackground", "setListItemHintBackground", "listItemHintTextColor", "getListItemHintTextColor", "setListItemHintTextColor", "listItemHintTextColors", "getListItemHintTextColors", "setListItemHintTextColors", "listItemHintTextSize", "getListItemHintTextSize", "setListItemHintTextSize", "listItemHintTextView", "listItemHintVisibility", "getListItemHintVisibility", "setListItemHintVisibility", "uiUpdateStateProcessor", "Lio/reactivex/rxjava3/processors/PublishProcessor;", "Ldji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget$UIState;", "getUiUpdateStateProcessor", "()Lio/reactivex/rxjava3/processors/PublishProcessor;", "getWidgetType", "()Ldji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget$WidgetType;", "configureEditTextButtonWidget", "", "configureEditTextWidget", "getUIStateUpdates", "Lio/reactivex/rxjava3/core/Flowable;", "hideKeyboardFrom", "initAttributes", "initButton", "initEditText", "initHint", "isDoneActionClicked", "actionId", "keyEvent", "Landroid/view/KeyEvent;", "onAttachedToWindow", "onButtonClick", "onClick", "view", "Landroid/view/View;", "onEditorTextChanged", "currentText", "onKeyboardDoneAction", "onListItemClick", "setEnabled", "enabled", "resourceId", "setListItemButtonTextAppearance", "textAppearanceResId", "setListItemEditTextTextAppearance", "setListItemHintTextAppearance", "UIState", "WidgetType", "android-sdk-v5-uxsdk_debug"})
public abstract class ListItemEditTextButtonWidget<T extends java.lang.Object> extends dji.v5.ux.core.base.panel.listitem.ListItemTitleWidget<T> implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.base.panel.listitem.ListItemEditTextButtonWidget.WidgetType widgetType = null;
    private final android.widget.TextView listItemButton = null;
    private final android.widget.TextView listItemHintTextView = null;
    private final android.widget.EditText listItemEditTextView = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.rxjava3.processors.PublishProcessor<dji.v5.ux.core.base.panel.listitem.ListItemEditTextButtonWidget.UIState> uiUpdateStateProcessor = null;
    
    /**
     * Default color of the edit text value
     */
    @androidx.annotation.ColorInt
    private int editTextNormalColor;
    
    @kotlin.jvm.JvmOverloads
    public ListItemEditTextButtonWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.listitem.ListItemEditTextButtonWidget.WidgetType widgetType, @androidx.annotation.StyleRes
    int defaultStyle) {
        super(null, null, 0, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public ListItemEditTextButtonWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.listitem.ListItemEditTextButtonWidget.WidgetType widgetType, @androidx.annotation.StyleRes
    int defaultStyle) {
        super(null, null, 0, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public ListItemEditTextButtonWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.listitem.ListItemEditTextButtonWidget.WidgetType widgetType, @androidx.annotation.StyleRes
    int defaultStyle) {
        super(null, null, 0, 0);
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.base.panel.listitem.ListItemEditTextButtonWidget.WidgetType getWidgetType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final io.reactivex.rxjava3.processors.PublishProcessor<dji.v5.ux.core.base.panel.listitem.ListItemEditTextButtonWidget.UIState> getUiUpdateStateProcessor() {
        return null;
    }
    
    /**
     * Get the [UIState] updates
     */
    @org.jetbrains.annotations.NotNull
    public io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.base.panel.listitem.ListItemEditTextButtonWidget.UIState> getUIStateUpdates() {
        return null;
    }
    
    public final int getEditTextNormalColor() {
        return 0;
    }
    
    public final void setEditTextNormalColor(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.annotation.Nullable
    public final java.lang.String getListItemHint() {
        return null;
    }
    
    public final void setListItemHint(@org.jetbrains.annotations.Nullable
    @androidx.annotation.Nullable
    java.lang.String value) {
    }
    
    @androidx.annotation.Dimension
    public final float getListItemHintTextSize() {
        return 0.0F;
    }
    
    public final void setListItemHintTextSize(@androidx.annotation.Dimension
    float value) {
    }
    
    @androidx.annotation.ColorInt
    public final int getListItemHintTextColor() {
        return 0;
    }
    
    public final void setListItemHintTextColor(@androidx.annotation.ColorInt
    int value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.content.res.ColorStateList getListItemHintTextColors() {
        return null;
    }
    
    public final void setListItemHintTextColors(@org.jetbrains.annotations.Nullable
    android.content.res.ColorStateList value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getListItemHintBackground() {
        return null;
    }
    
    public final void setListItemHintBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    public final boolean getListItemHintVisibility() {
        return false;
    }
    
    public final void setListItemHintVisibility(boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.annotation.Nullable
    public final java.lang.String getListItemButtonText() {
        return null;
    }
    
    public final void setListItemButtonText(@org.jetbrains.annotations.Nullable
    @androidx.annotation.Nullable
    java.lang.String hint) {
    }
    
    @androidx.annotation.Dimension
    public final float getListItemButtonTextSize() {
        return 0.0F;
    }
    
    public final void setListItemButtonTextSize(@androidx.annotation.Dimension
    float hint) {
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
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getListItemEditTextBackground() {
        return null;
    }
    
    public final void setListItemEditTextBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @androidx.annotation.ColorInt
    public final int getListItemEditTextColor() {
        return 0;
    }
    
    public final void setListItemEditTextColor(@androidx.annotation.ColorInt
    int value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.content.res.ColorStateList getListItemEditTextColors() {
        return null;
    }
    
    public final void setListItemEditTextColors(@org.jetbrains.annotations.Nullable
    android.content.res.ColorStateList value) {
    }
    
    @androidx.annotation.Dimension
    public final int getListItemEditTextWidth() {
        return 0;
    }
    
    public final void setListItemEditTextWidth(@androidx.annotation.Dimension
    int value) {
    }
    
    public final int getListItemEditTextInputType() {
        return 0;
    }
    
    public final void setListItemEditTextInputType(int value) {
    }
    
    public final boolean getListItemEditTextVisibility() {
        return false;
    }
    
    public final void setListItemEditTextVisibility(boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getListItemEditTextValue() {
        return null;
    }
    
    public final void setListItemEditTextValue(@org.jetbrains.annotations.Nullable
    java.lang.String value) {
    }
    
    public final float getListItemEditTextSize() {
        return 0.0F;
    }
    
    public final void setListItemEditTextSize(float value) {
    }
    
    @android.annotation.SuppressLint(value = {"Recycle"})
    private final void initAttributes(android.content.Context context, android.util.AttributeSet attrs) {
    }
    
    private final void initEditText() {
    }
    
    private final void initHint() {
    }
    
    private final void initButton() {
    }
    
    private final void configureEditTextWidget() {
    }
    
    private final void configureEditTextButtonWidget() {
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
     * Set the background of the item hint
     *
     * @param resourceId Integer ID of the background resource
     */
    public final void setListItemHintBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the background of the item edit text
     *
     * @param resourceId Integer ID of the background resource
     */
    public final void setListItemEditTextBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the text appearance of the item hint
     *
     * @param textAppearanceResId Style resource for text appearance
     */
    public final void setListItemHintTextAppearance(@androidx.annotation.StyleRes
    int textAppearanceResId) {
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
     * Set the text appearance of the item edit text
     *
     * @param textAppearanceResId Style resource for text appearance
     */
    public final void setListItemEditTextTextAppearance(@androidx.annotation.StyleRes
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
    
    @java.lang.Override
    protected void onAttachedToWindow() {
    }
    
    private final boolean isDoneActionClicked(int actionId, android.view.KeyEvent keyEvent) {
        return false;
    }
    
    private final void hideKeyboardFrom() {
    }
    
    /**
     * Called when button click event occurs
     */
    public abstract void onButtonClick();
    
    /**
     * Called when keyboard is hidden
     */
    public abstract void onKeyboardDoneAction();
    
    /**
     * Called when user changes text
     */
    public abstract void onEditorTextChanged(@org.jetbrains.annotations.Nullable
    java.lang.String currentText);
    
    /**
     * Widget UI update State
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\nB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u00a8\u0006\u0013"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget$UIState;", "", "()V", "ButtonClicked", "DialogActionCanceled", "DialogActionConfirmed", "DialogDismissed", "DialogDisplayed", "EditFinished", "EditStarted", "ListItemClicked", "Ldji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget$UIState$ButtonClicked;", "Ldji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget$UIState$DialogActionCanceled;", "Ldji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget$UIState$DialogActionConfirmed;", "Ldji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget$UIState$DialogDismissed;", "Ldji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget$UIState$DialogDisplayed;", "Ldji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget$UIState$EditFinished;", "Ldji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget$UIState$EditStarted;", "Ldji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget$UIState$ListItemClicked;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class UIState {
        
        private UIState() {
            super();
        }
        
        /**
         * List Item click update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget$UIState$ListItemClicked;", "Ldji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget$UIState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class ListItemClicked extends dji.v5.ux.core.base.panel.listitem.ListItemEditTextButtonWidget.UIState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.base.panel.listitem.ListItemEditTextButtonWidget.UIState.ListItemClicked INSTANCE = null;
            
            private ListItemClicked() {
                super();
            }
        }
        
        /**
         * Button click update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget$UIState$ButtonClicked;", "Ldji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget$UIState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class ButtonClicked extends dji.v5.ux.core.base.panel.listitem.ListItemEditTextButtonWidget.UIState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.base.panel.listitem.ListItemEditTextButtonWidget.UIState.ButtonClicked INSTANCE = null;
            
            private ButtonClicked() {
                super();
            }
        }
        
        /**
         * Update when user clicks edit text to modify
         * value
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget$UIState$EditStarted;", "Ldji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget$UIState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class EditStarted extends dji.v5.ux.core.base.panel.listitem.ListItemEditTextButtonWidget.UIState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.base.panel.listitem.ListItemEditTextButtonWidget.UIState.EditStarted INSTANCE = null;
            
            private EditStarted() {
                super();
            }
        }
        
        /**
         * Update when user finishes edit action
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget$UIState$EditFinished;", "Ldji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget$UIState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class EditFinished extends dji.v5.ux.core.base.panel.listitem.ListItemEditTextButtonWidget.UIState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.base.panel.listitem.ListItemEditTextButtonWidget.UIState.EditFinished INSTANCE = null;
            
            private EditFinished() {
                super();
            }
        }
        
        /**
         * Dialog shown update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget$UIState$DialogDisplayed;", "Ldji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget$UIState;", "info", "", "(Ljava/lang/Object;)V", "getInfo", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class DialogDisplayed extends dji.v5.ux.core.base.panel.listitem.ListItemEditTextButtonWidget.UIState {
            @org.jetbrains.annotations.Nullable
            private final java.lang.Object info = null;
            
            /**
             * Dialog shown update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.base.panel.listitem.ListItemEditTextButtonWidget.UIState.DialogDisplayed copy(@org.jetbrains.annotations.Nullable
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
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget$UIState$DialogActionConfirmed;", "Ldji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget$UIState;", "info", "", "(Ljava/lang/Object;)V", "getInfo", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class DialogActionConfirmed extends dji.v5.ux.core.base.panel.listitem.ListItemEditTextButtonWidget.UIState {
            @org.jetbrains.annotations.Nullable
            private final java.lang.Object info = null;
            
            /**
             * Dialog action confirm
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.base.panel.listitem.ListItemEditTextButtonWidget.UIState.DialogActionConfirmed copy(@org.jetbrains.annotations.Nullable
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
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget$UIState$DialogActionCanceled;", "Ldji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget$UIState;", "info", "", "(Ljava/lang/Object;)V", "getInfo", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class DialogActionCanceled extends dji.v5.ux.core.base.panel.listitem.ListItemEditTextButtonWidget.UIState {
            @org.jetbrains.annotations.Nullable
            private final java.lang.Object info = null;
            
            /**
             * Dialog action cancel
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.base.panel.listitem.ListItemEditTextButtonWidget.UIState.DialogActionCanceled copy(@org.jetbrains.annotations.Nullable
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
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget$UIState$DialogDismissed;", "Ldji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget$UIState;", "info", "", "(Ljava/lang/Object;)V", "getInfo", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class DialogDismissed extends dji.v5.ux.core.base.panel.listitem.ListItemEditTextButtonWidget.UIState {
            @org.jetbrains.annotations.Nullable
            private final java.lang.Object info = null;
            
            /**
             * Dialog action dismiss
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.base.panel.listitem.ListItemEditTextButtonWidget.UIState.DialogDismissed copy(@org.jetbrains.annotations.Nullable
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
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget$WidgetType;", "", "(Ljava/lang/String;I)V", "EDIT", "EDIT_BUTTON", "android-sdk-v5-uxsdk_debug"})
    public static enum WidgetType {
        /*public static final*/ EDIT /* = new EDIT() */,
        /*public static final*/ EDIT_BUTTON /* = new EDIT_BUTTON() */;
        
        WidgetType() {
        }
    }
}