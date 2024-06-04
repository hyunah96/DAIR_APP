package dji.v5.ux.flight.returnhome;

import java.lang.System;

/**
 * A button that performs actions related to returning home. There are two possible states for the
 * widget: ready to return home, and returning home in progress. Clicking the button when the
 * aircraft is ready to return home will open a dialog to confirm returning to home.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b=\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0094\u0001B%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010s\u001a\u00020tH\u0002J\b\u0010u\u001a\u00020vH\u0014J\b\u0010w\u001a\u00020vH\u0002J\u0018\u0010x\u001a\u00020\u00152\u0006\u0010y\u001a\u00020.2\u0006\u0010z\u001a\u00020{H\u0002J\b\u0010|\u001a\u00020\u0015H\u0016J\u000e\u0010}\u001a\b\u0012\u0004\u0012\u00020\u00020~H\u0016J\u0018\u0010\u007f\u001a\u00020v2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0003J\t\u0010\u0080\u0001\u001a\u00020vH\u0002J\t\u0010\u0081\u0001\u001a\u00020vH\u0014J\u0015\u0010\u0082\u0001\u001a\u00020v2\n\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u0001H\u0016J\t\u0010\u0085\u0001\u001a\u00020vH\u0014J\t\u0010\u0086\u0001\u001a\u00020vH\u0014J\t\u0010\u0087\u0001\u001a\u00020tH\u0002J\u0011\u0010\u0010\u001a\u00020v2\t\b\u0001\u0010\u0088\u0001\u001a\u00020\tJ\u0012\u0010\u0089\u0001\u001a\u00020v2\t\b\u0001\u0010\u008a\u0001\u001a\u00020\tJ\u0012\u0010\u008b\u0001\u001a\u00020v2\t\b\u0001\u0010\u008a\u0001\u001a\u00020\tJ\u0012\u0010\u008c\u0001\u001a\u00020v2\t\b\u0001\u0010\u008a\u0001\u001a\u00020\tJ\u0012\u0010\u008d\u0001\u001a\u00020v2\t\b\u0001\u0010\u008a\u0001\u001a\u00020\tJ\u0011\u0010g\u001a\u00020v2\t\b\u0001\u0010\u0088\u0001\u001a\u00020\tJ\u0011\u0010j\u001a\u00020v2\t\b\u0001\u0010\u0088\u0001\u001a\u00020\tJ\u0012\u0010\u008e\u0001\u001a\u00020v2\u0007\u0010\u008f\u0001\u001a\u00020\u0015H\u0002J\t\u0010\u0090\u0001\u001a\u00020vH\u0002J\u0013\u0010\u0091\u0001\u001a\u00020v2\b\u0010\u0092\u0001\u001a\u00030\u0093\u0001H\u0002R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00158BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u0019\u001a\u0004\u0018\u00010\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R(\u0010\u001d\u001a\u0004\u0018\u00010\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R&\u0010!\u001a\u00020\t2\b\b\u0001\u0010 \u001a\u00020\t8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R(\u0010(\u001a\u0004\u0018\u00010\'2\b\u0010&\u001a\u0004\u0018\u00010\'8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R&\u0010/\u001a\u00020.2\b\b\u0001\u0010-\u001a\u00020.8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R(\u00104\u001a\u0004\u0018\u00010\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b5\u0010\u000f\"\u0004\b6\u0010\u0011R&\u00107\u001a\u00020\t2\b\b\u0001\u0010 \u001a\u00020\t8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b8\u0010#\"\u0004\b9\u0010%R$\u0010:\u001a\u00020.2\u0006\u0010\u001c\u001a\u00020.8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b;\u00101\"\u0004\b<\u00103R&\u0010=\u001a\u00020\t2\b\b\u0001\u0010 \u001a\u00020\t8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b>\u0010#\"\u0004\b?\u0010%R(\u0010A\u001a\u0004\u0018\u00010\f2\b\u0010@\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bB\u0010\u000f\"\u0004\bC\u0010\u0011R(\u0010D\u001a\u0004\u0018\u00010\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bE\u0010\u000f\"\u0004\bF\u0010\u0011R&\u0010G\u001a\u00020\t2\b\b\u0001\u0010 \u001a\u00020\t8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bH\u0010#\"\u0004\bI\u0010%R&\u0010J\u001a\u00020.2\b\b\u0001\u0010-\u001a\u00020.8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bK\u00101\"\u0004\bL\u00103R&\u0010M\u001a\u00020\t2\b\b\u0001\u0010 \u001a\u00020\t8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bN\u0010#\"\u0004\bO\u0010%R&\u0010P\u001a\u00020\t2\b\b\u0001\u0010 \u001a\u00020\t8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bQ\u0010#\"\u0004\bR\u0010%R(\u0010S\u001a\u00020\t2\b\b\u0001\u0010\u001c\u001a\u00020\t8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010#\"\u0004\bU\u0010%R(\u0010V\u001a\u0004\u0018\u00010\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bW\u0010\u000f\"\u0004\bX\u0010\u0011R\u001e\u0010Y\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010#\"\u0004\b[\u0010%R&\u0010\\\u001a\u00020.2\b\b\u0001\u0010-\u001a\u00020.8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b]\u00101\"\u0004\b^\u00103R\u001a\u0010_\u001a\u00020.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b`\u00101\"\u0004\ba\u00103R\u001a\u0010b\u001a\u00020.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u00101\"\u0004\bd\u00103R(\u0010e\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bf\u0010\u000f\"\u0004\bg\u0010\u0011R\u001c\u0010h\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bi\u0010\u000f\"\u0004\bj\u0010\u0011R\u0010\u0010k\u001a\u0004\u0018\u00010lX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010m\u001a\u00020n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bo\u0010p\u00a8\u0006\u0095\u0001"}, d2 = {"Ldji/v5/ux/flight/returnhome/ReturnHomeWidget;", "Ldji/v5/ux/core/base/widget/IconButtonWidget;", "Ldji/v5/ux/flight/returnhome/ReturnHomeWidget$ModelState;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "drawable", "Landroid/graphics/drawable/Drawable;", "cancelReturnHomeActionIcon", "getCancelReturnHomeActionIcon", "()Landroid/graphics/drawable/Drawable;", "setCancelReturnHomeActionIcon", "(Landroid/graphics/drawable/Drawable;)V", "decimalFormat", "Ljava/text/DecimalFormat;", "description", "", "getDescription", "()Ljava/lang/String;", "background", "dialogBackground", "getDialogBackground", "setDialogBackground", "value", "dialogCancelBackground", "getDialogCancelBackground", "setDialogCancelBackground", "color", "dialogCancelTextColor", "getDialogCancelTextColor", "()I", "setDialogCancelTextColor", "(I)V", "colors", "Landroid/content/res/ColorStateList;", "dialogCancelTextColors", "getDialogCancelTextColors", "()Landroid/content/res/ColorStateList;", "setDialogCancelTextColors", "(Landroid/content/res/ColorStateList;)V", "textSize", "", "dialogCancelTextSize", "getDialogCancelTextSize", "()F", "setDialogCancelTextSize", "(F)V", "dialogMessageBackground", "getDialogMessageBackground", "setDialogMessageBackground", "dialogMessageTextColor", "getDialogMessageTextColor", "setDialogMessageTextColor", "dialogMessageTextSize", "getDialogMessageTextSize", "setDialogMessageTextSize", "dialogSliderFillColor", "getDialogSliderFillColor", "setDialogSliderFillColor", "icon", "dialogSliderIcon", "getDialogSliderIcon", "setDialogSliderIcon", "dialogSliderMessageBackground", "getDialogSliderMessageBackground", "setDialogSliderMessageBackground", "dialogSliderMessageTextColor", "getDialogSliderMessageTextColor", "setDialogSliderMessageTextColor", "dialogSliderMessageTextSize", "getDialogSliderMessageTextSize", "setDialogSliderMessageTextSize", "dialogSliderThumbColor", "getDialogSliderThumbColor", "setDialogSliderThumbColor", "dialogSliderThumbSelectedColor", "getDialogSliderThumbSelectedColor", "setDialogSliderThumbSelectedColor", "dialogTheme", "getDialogTheme", "setDialogTheme", "dialogTitleBackground", "getDialogTitleBackground", "setDialogTitleBackground", "dialogTitleTextColor", "getDialogTitleTextColor", "setDialogTitleTextColor", "dialogTitleTextSize", "getDialogTitleTextSize", "setDialogTitleTextSize", "disabledAlpha", "getDisabledAlpha", "setDisabledAlpha", "enabledAlpha", "getEnabledAlpha", "setEnabledAlpha", "returnHomeActionIcon", "getReturnHomeActionIcon", "setReturnHomeActionIcon", "returnHomeDialogIcon", "getReturnHomeDialogIcon", "setReturnHomeDialogIcon", "slidingDialog", "Ldji/v5/ux/core/ui/SlidingDialog;", "widgetModel", "Ldji/v5/ux/flight/returnhome/ReturnHomeWidgetModel;", "getWidgetModel", "()Ldji/v5/ux/flight/returnhome/ReturnHomeWidgetModel;", "widgetModel$delegate", "Lkotlin/Lazy;", "cancelReturnToHome", "Lio/reactivex/rxjava3/disposables/Disposable;", "checkAndUpdateIconColor", "", "checkAndUpdateReturnHomeState", "getHeightString", "height", "unitType", "Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "getIdealDimensionRatioString", "getWidgetStateUpdate", "Lio/reactivex/rxjava3/core/Flowable;", "initAttributes", "initDialog", "onAttachedToWindow", "onClick", "view", "Landroid/view/View;", "onDetachedFromWindow", "reactToModelChanges", "returnToHome", "resourceId", "setDialogCancelTextAppearance", "textAppearance", "setDialogMessageTextAppearance", "setDialogSliderMessageTextAppearance", "setDialogTitleTextAppearance", "showConfirmDialog", "msg", "updateImageAlpha", "updateReturnHomeState", "returnHomeState", "Ldji/v5/ux/flight/returnhome/ReturnHomeWidgetModel$ReturnHomeState;", "ModelState", "android-sdk-v5-uxsdk_debug"})
public class ReturnHomeWidget extends dji.v5.ux.core.base.widget.IconButtonWidget<dji.v5.ux.flight.returnhome.ReturnHomeWidget.ModelState> implements android.view.View.OnClickListener {
    private dji.v5.ux.core.ui.SlidingDialog slidingDialog;
    private final java.text.DecimalFormat decimalFormat = null;
    private final kotlin.Lazy widgetModel$delegate = null;
    
    /**
     * The alpha of the image when the widget is disabled or pressed
     */
    private float disabledAlpha = 0.38F;
    
    /**
     * The alpha of the image when the widget is enabled
     */
    private float enabledAlpha = 1.0F;
    
    /**
     * The theme of the dialog
     */
    private int dialogTheme;
    
    /**
     * Cancel return home action icon drawable
     */
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable cancelReturnHomeActionIcon;
    
    /**
     * Return home action icon
     */
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable returnHomeActionIcon;
    
    /**
     * Dialog icon drawable
     */
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable returnHomeDialogIcon;
    
    /**
     * The color of the title for the dialog shown by this widget
     */
    @androidx.annotation.ColorInt
    private int dialogTitleTextColor;
    
    @kotlin.jvm.JvmOverloads
    public ReturnHomeWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public ReturnHomeWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public ReturnHomeWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    private final dji.v5.ux.flight.returnhome.ReturnHomeWidgetModel getWidgetModel() {
        return null;
    }
    
    private final java.lang.String getDescription() {
        return null;
    }
    
    public final float getDisabledAlpha() {
        return 0.0F;
    }
    
    public final void setDisabledAlpha(float p0) {
    }
    
    public final float getEnabledAlpha() {
        return 0.0F;
    }
    
    public final void setEnabledAlpha(float p0) {
    }
    
    @androidx.annotation.StyleRes
    public final int getDialogTheme() {
        return 0;
    }
    
    public final void setDialogTheme(@androidx.annotation.StyleRes
    int value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getCancelReturnHomeActionIcon() {
        return null;
    }
    
    public final void setCancelReturnHomeActionIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable drawable) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getReturnHomeActionIcon() {
        return null;
    }
    
    public final void setReturnHomeActionIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable drawable) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getReturnHomeDialogIcon() {
        return null;
    }
    
    public final void setReturnHomeDialogIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable p0) {
    }
    
    @androidx.annotation.Dimension
    public final float getDialogTitleTextSize() {
        return 0.0F;
    }
    
    public final void setDialogTitleTextSize(@androidx.annotation.Dimension
    float textSize) {
    }
    
    public final int getDialogTitleTextColor() {
        return 0;
    }
    
    public final void setDialogTitleTextColor(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getDialogTitleBackground() {
        return null;
    }
    
    public final void setDialogTitleBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    public final float getDialogMessageTextSize() {
        return 0.0F;
    }
    
    public final void setDialogMessageTextSize(float value) {
    }
    
    @androidx.annotation.ColorInt
    public final int getDialogMessageTextColor() {
        return 0;
    }
    
    public final void setDialogMessageTextColor(@androidx.annotation.ColorInt
    int color) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getDialogMessageBackground() {
        return null;
    }
    
    public final void setDialogMessageBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @androidx.annotation.Dimension
    public final float getDialogCancelTextSize() {
        return 0.0F;
    }
    
    public final void setDialogCancelTextSize(@androidx.annotation.Dimension
    float textSize) {
    }
    
    @androidx.annotation.ColorInt
    public final int getDialogCancelTextColor() {
        return 0;
    }
    
    public final void setDialogCancelTextColor(@androidx.annotation.ColorInt
    int color) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.content.res.ColorStateList getDialogCancelTextColors() {
        return null;
    }
    
    public final void setDialogCancelTextColors(@org.jetbrains.annotations.Nullable
    android.content.res.ColorStateList colors) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getDialogCancelBackground() {
        return null;
    }
    
    public final void setDialogCancelBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @androidx.annotation.Dimension
    public final float getDialogSliderMessageTextSize() {
        return 0.0F;
    }
    
    public final void setDialogSliderMessageTextSize(@androidx.annotation.Dimension
    float textSize) {
    }
    
    @androidx.annotation.ColorInt
    public final int getDialogSliderMessageTextColor() {
        return 0;
    }
    
    public final void setDialogSliderMessageTextColor(@androidx.annotation.ColorInt
    int color) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getDialogSliderMessageBackground() {
        return null;
    }
    
    public final void setDialogSliderMessageBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getDialogSliderIcon() {
        return null;
    }
    
    public final void setDialogSliderIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable icon) {
    }
    
    @androidx.annotation.ColorInt
    public final int getDialogSliderThumbColor() {
        return 0;
    }
    
    public final void setDialogSliderThumbColor(@androidx.annotation.ColorInt
    int color) {
    }
    
    @androidx.annotation.ColorInt
    public final int getDialogSliderThumbSelectedColor() {
        return 0;
    }
    
    public final void setDialogSliderThumbSelectedColor(@androidx.annotation.ColorInt
    int color) {
    }
    
    @androidx.annotation.ColorInt
    public final int getDialogSliderFillColor() {
        return 0;
    }
    
    public final void setDialogSliderFillColor(@androidx.annotation.ColorInt
    int color) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getDialogBackground() {
        return null;
    }
    
    public final void setDialogBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable background) {
    }
    
    @java.lang.Override
    protected void onAttachedToWindow() {
    }
    
    @java.lang.Override
    protected void onDetachedFromWindow() {
    }
    
    @java.lang.Override
    protected void reactToModelChanges() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getIdealDimensionRatioString() {
        return null;
    }
    
    @java.lang.Override
    public void onClick(@org.jetbrains.annotations.Nullable
    android.view.View view) {
    }
    
    private final void initDialog() {
    }
    
    private final void showConfirmDialog(java.lang.String msg) {
    }
    
    private final io.reactivex.rxjava3.disposables.Disposable returnToHome() {
        return null;
    }
    
    private final io.reactivex.rxjava3.disposables.Disposable cancelReturnToHome() {
        return null;
    }
    
    private final java.lang.String getHeightString(float height, dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
        return null;
    }
    
    private final void updateReturnHomeState(dji.v5.ux.flight.returnhome.ReturnHomeWidgetModel.ReturnHomeState returnHomeState) {
    }
    
    private final void updateImageAlpha() {
    }
    
    private final void checkAndUpdateReturnHomeState() {
    }
    
    @java.lang.Override
    protected void checkAndUpdateIconColor() {
    }
    
    @android.annotation.SuppressLint(value = {"Recycle"})
    private final void initAttributes(android.content.Context context, android.util.AttributeSet attrs) {
    }
    
    /**
     * Set return home action drawable resource
     *
     * @param resourceId resource id of return home action icon
     */
    public final void setReturnHomeActionIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set cancel return home action icon drawable
     *
     * @param resourceId resource id of cancel return home action
     */
    public final void setCancelReturnHomeActionIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set return home dialog icon drawable
     *
     * @param resourceId resource id of return home dialog icon
     */
    public final void setReturnHomeDialogIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the text appearance of the title for the dialog shown by this widget
     *
     * @param textAppearance Style resource for text appearance
     */
    public final void setDialogTitleTextAppearance(@androidx.annotation.StyleRes
    int textAppearance) {
    }
    
    /**
     * Set the text appearance of the message for the dialog shown by this widget
     *
     * @param textAppearance Style resource for text appearance
     */
    public final void setDialogMessageTextAppearance(@androidx.annotation.StyleRes
    int textAppearance) {
    }
    
    /**
     * Set the text appearance of the cancel button for the dialog shown by this widget
     *
     * @param textAppearance Style resource for text appearance
     */
    public final void setDialogCancelTextAppearance(@androidx.annotation.StyleRes
    int textAppearance) {
    }
    
    /**
     * Set the text appearance of the slider message for the dialog shown by this widget
     *
     * @param textAppearance Style resource for text appearance
     */
    public final void setDialogSliderMessageTextAppearance(@androidx.annotation.StyleRes
    int textAppearance) {
    }
    
    /**
     * Get the [ModelState] updates
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.SuppressWarnings(value = {})
    @java.lang.Override
    public io.reactivex.rxjava3.core.Flowable<dji.v5.ux.flight.returnhome.ReturnHomeWidget.ModelState> getWidgetStateUpdate() {
        return null;
    }
    
    /**
     * Class defines the widget state updates
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/flight/returnhome/ReturnHomeWidget$ModelState;", "", "()V", "ProductConnected", "ReturnHomeCancelFailed", "ReturnHomeCancelSucceeded", "ReturnHomeStartFailed", "ReturnHomeStartSucceeded", "ReturnHomeStateUpdated", "Ldji/v5/ux/flight/returnhome/ReturnHomeWidget$ModelState$ProductConnected;", "Ldji/v5/ux/flight/returnhome/ReturnHomeWidget$ModelState$ReturnHomeCancelFailed;", "Ldji/v5/ux/flight/returnhome/ReturnHomeWidget$ModelState$ReturnHomeCancelSucceeded;", "Ldji/v5/ux/flight/returnhome/ReturnHomeWidget$ModelState$ReturnHomeStartFailed;", "Ldji/v5/ux/flight/returnhome/ReturnHomeWidget$ModelState$ReturnHomeStartSucceeded;", "Ldji/v5/ux/flight/returnhome/ReturnHomeWidget$ModelState$ReturnHomeStateUpdated;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class ModelState {
        
        private ModelState() {
            super();
        }
        
        /**
         * Product connection update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/flight/returnhome/ReturnHomeWidget$ModelState$ProductConnected;", "Ldji/v5/ux/flight/returnhome/ReturnHomeWidget$ModelState;", "isConnected", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductConnected extends dji.v5.ux.flight.returnhome.ReturnHomeWidget.ModelState {
            private final boolean isConnected = false;
            
            /**
             * Product connection update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.flight.returnhome.ReturnHomeWidget.ModelState.ProductConnected copy(boolean isConnected) {
                return null;
            }
            
            /**
             * Product connection update
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Product connection update
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Product connection update
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public ProductConnected(boolean isConnected) {
                super();
            }
            
            public final boolean component1() {
                return false;
            }
            
            public final boolean isConnected() {
                return false;
            }
        }
        
        /**
         * Return Home State update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/flight/returnhome/ReturnHomeWidget$ModelState$ReturnHomeStateUpdated;", "Ldji/v5/ux/flight/returnhome/ReturnHomeWidget$ModelState;", "state", "Ldji/v5/ux/flight/returnhome/ReturnHomeWidgetModel$ReturnHomeState;", "(Ldji/v5/ux/flight/returnhome/ReturnHomeWidgetModel$ReturnHomeState;)V", "getState", "()Ldji/v5/ux/flight/returnhome/ReturnHomeWidgetModel$ReturnHomeState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class ReturnHomeStateUpdated extends dji.v5.ux.flight.returnhome.ReturnHomeWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.flight.returnhome.ReturnHomeWidgetModel.ReturnHomeState state = null;
            
            /**
             * Return Home State update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.flight.returnhome.ReturnHomeWidget.ModelState.ReturnHomeStateUpdated copy(@org.jetbrains.annotations.NotNull
            dji.v5.ux.flight.returnhome.ReturnHomeWidgetModel.ReturnHomeState state) {
                return null;
            }
            
            /**
             * Return Home State update
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Return Home State update
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Return Home State update
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public ReturnHomeStateUpdated(@org.jetbrains.annotations.NotNull
            dji.v5.ux.flight.returnhome.ReturnHomeWidgetModel.ReturnHomeState state) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.flight.returnhome.ReturnHomeWidgetModel.ReturnHomeState component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.flight.returnhome.ReturnHomeWidgetModel.ReturnHomeState getState() {
                return null;
            }
        }
        
        /**
         * Return to Home started successfully
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/flight/returnhome/ReturnHomeWidget$ModelState$ReturnHomeStartSucceeded;", "Ldji/v5/ux/flight/returnhome/ReturnHomeWidget$ModelState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class ReturnHomeStartSucceeded extends dji.v5.ux.flight.returnhome.ReturnHomeWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.flight.returnhome.ReturnHomeWidget.ModelState.ReturnHomeStartSucceeded INSTANCE = null;
            
            private ReturnHomeStartSucceeded() {
                super();
            }
        }
        
        /**
         * Return to Home not started due to error
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/flight/returnhome/ReturnHomeWidget$ModelState$ReturnHomeStartFailed;", "Ldji/v5/ux/flight/returnhome/ReturnHomeWidget$ModelState;", "error", "Ldji/v5/ux/core/base/UXSDKError;", "(Ldji/v5/ux/core/base/UXSDKError;)V", "getError", "()Ldji/v5/ux/core/base/UXSDKError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class ReturnHomeStartFailed extends dji.v5.ux.flight.returnhome.ReturnHomeWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.base.UXSDKError error = null;
            
            /**
             * Return to Home not started due to error
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.flight.returnhome.ReturnHomeWidget.ModelState.ReturnHomeStartFailed copy(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.base.UXSDKError error) {
                return null;
            }
            
            /**
             * Return to Home not started due to error
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Return to Home not started due to error
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Return to Home not started due to error
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public ReturnHomeStartFailed(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.base.UXSDKError error) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.base.UXSDKError component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.base.UXSDKError getError() {
                return null;
            }
        }
        
        /**
         * Return to Home canceled successfully
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/flight/returnhome/ReturnHomeWidget$ModelState$ReturnHomeCancelSucceeded;", "Ldji/v5/ux/flight/returnhome/ReturnHomeWidget$ModelState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class ReturnHomeCancelSucceeded extends dji.v5.ux.flight.returnhome.ReturnHomeWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.flight.returnhome.ReturnHomeWidget.ModelState.ReturnHomeCancelSucceeded INSTANCE = null;
            
            private ReturnHomeCancelSucceeded() {
                super();
            }
        }
        
        /**
         * Return to Home not canceled due to error
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/flight/returnhome/ReturnHomeWidget$ModelState$ReturnHomeCancelFailed;", "Ldji/v5/ux/flight/returnhome/ReturnHomeWidget$ModelState;", "error", "Ldji/v5/ux/core/base/UXSDKError;", "(Ldji/v5/ux/core/base/UXSDKError;)V", "getError", "()Ldji/v5/ux/core/base/UXSDKError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class ReturnHomeCancelFailed extends dji.v5.ux.flight.returnhome.ReturnHomeWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.base.UXSDKError error = null;
            
            /**
             * Return to Home not canceled due to error
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.flight.returnhome.ReturnHomeWidget.ModelState.ReturnHomeCancelFailed copy(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.base.UXSDKError error) {
                return null;
            }
            
            /**
             * Return to Home not canceled due to error
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Return to Home not canceled due to error
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Return to Home not canceled due to error
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public ReturnHomeCancelFailed(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.base.UXSDKError error) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.base.UXSDKError component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.base.UXSDKError getError() {
                return null;
            }
        }
    }
}