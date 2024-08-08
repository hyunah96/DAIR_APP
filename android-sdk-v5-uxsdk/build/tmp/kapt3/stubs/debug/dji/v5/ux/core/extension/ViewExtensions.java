package dji.v5.ux.core.extension;

import java.lang.System;

@kotlin.jvm.JvmName(name = "ViewExtensions")
@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0016\u0010\u0019\u001a\u00020\u0001*\u00020\u001a2\b\b\u0001\u0010\u001b\u001a\u00020\u0001H\u0007\u001a\u0016\u0010\u001c\u001a\u00020\u001d*\u00020\u001a2\b\b\u0001\u0010\u001e\u001a\u00020\u0001H\u0007\u001a\u0012\u0010\u001f\u001a\u00020 *\u00020\u001a2\u0006\u0010!\u001a\u00020\"\u001a\u0014\u0010#\u001a\u00020\u0006*\u00020\u001a2\b\b\u0001\u0010$\u001a\u00020\u0001\u001a-\u0010%\u001a\u00020 *\u00020\u001a2\b\b\u0001\u0010&\u001a\u00020\u00012\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020(0\'\"\u00020(\u00a2\u0006\u0002\u0010)\u001a\u0012\u0010*\u001a\u00020 *\u00020\u001a2\u0006\u0010!\u001a\u00020\"\u001a\n\u0010+\u001a\u00020,*\u00020\u001a\u001a\n\u0010-\u001a\u00020.*\u00020/\u001a\u0012\u0010-\u001a\u00020.*\u00020/2\u0006\u00100\u001a\u00020\u0001\u001a<\u00101\u001a\u0002H2\"\b\b\u0000\u00102*\u000203*\u0002H22!\u00104\u001a\u001d\u0012\u0013\u0012\u00110\u0001\u00a2\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(8\u0012\u0004\u0012\u00020,05\u00a2\u0006\u0002\u00109\u001aF\u0010:\u001a\u00020,*\u00020\u001a2\b\b\u0003\u0010;\u001a\u00020\u00012\b\b\u0003\u0010<\u001a\u00020\u00012\b\b\u0002\u0010=\u001a\u00020\u00012\b\b\u0002\u0010>\u001a\u00020\u00012\b\b\u0002\u0010?\u001a\u00020\u00012\b\b\u0002\u0010@\u001a\u00020\u0001\u001a\n\u0010A\u001a\u00020,*\u00020\u001a\u001a\\\u0010B\u001a\u00020,*\u00020\u001a2\b\b\u0003\u0010C\u001a\u00020\u00012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010F\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010I2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010K\u001aP\u0010L\u001a\u00020,*\u00020\u001a2\b\b\u0003\u0010C\u001a\u00020\u00012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010F\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010I2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010K\u001a\u0014\u0010M\u001a\u00020,*\u00020\u001a2\b\b\u0001\u0010N\u001a\u00020\u0001\u001a\u0014\u0010M\u001a\u00020,*\u00020\u001a2\b\u0010F\u001a\u0004\u0018\u00010 \u001a\u0014\u0010O\u001a\u00020,*\u00020\u001a2\b\b\u0001\u0010N\u001a\u00020\u0001\u001a\u0014\u0010O\u001a\u00020,*\u00020\u001a2\b\u0010F\u001a\u0004\u0018\u00010 \u001a\n\u0010P\u001a\u00020,*\u00020\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\",\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\"*\u0010\r\u001a\u00020\u0001*\u00020\u000e2\b\b\u0001\u0010\u0005\u001a\u00020\u00018G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\",\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006Q"}, d2 = {"FAST_CLICK_DURATION", "", "TRANSITION_OFFSET", "sClickTimes", "Landroid/util/SparseLongArray;", "value", "Landroid/graphics/drawable/Drawable;", "imageDrawable", "Landroid/widget/ImageView;", "getImageDrawable", "(Landroid/widget/ImageView;)Landroid/graphics/drawable/Drawable;", "setImageDrawable", "(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V", "textColor", "Landroid/widget/TextView;", "getTextColor", "(Landroid/widget/TextView;)I", "setTextColor", "(Landroid/widget/TextView;I)V", "Landroid/content/res/ColorStateList;", "textColorStateList", "getTextColorStateList", "(Landroid/widget/TextView;)Landroid/content/res/ColorStateList;", "setTextColorStateList", "(Landroid/widget/TextView;Landroid/content/res/ColorStateList;)V", "getColor", "Landroid/view/View;", "colorRes", "getDimension", "", "dimenRes", "getDistanceString", "", "unitType", "Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "getDrawable", "drawableRes", "getString", "stringRes", "", "", "(Landroid/view/View;I[Ljava/lang/Object;)Ljava/lang/String;", "getVelocityString", "hide", "", "isFastClick", "", "Landroid/widget/Button;", "duration", "listen", "T", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "event", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "position", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Lkotlin/jvm/functions/Function1;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "setBorder", "backgroundColor", "borderColor", "leftBorder", "topBorder", "rightBorder", "bottomBorder", "show", "showAlertDialog", "dialogTheme", "title", "icon", "message", "dismissButton", "dialogClickListener", "Landroid/content/DialogInterface$OnClickListener;", "dialogDismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "showConfirmationDialog", "showLongToast", "messageResId", "showShortToast", "toggleVisibility", "android-sdk-v5-uxsdk_debug"})
public final class ViewExtensions {
    public static final int TRANSITION_OFFSET = 80;
    private static final int FAST_CLICK_DURATION = 300;
    private static final android.util.SparseLongArray sClickTimes = null;
    
    /**
     * Get the [String] for the given [stringRes].
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getString(@org.jetbrains.annotations.NotNull
    android.view.View $this$getString, @androidx.annotation.StringRes
    int stringRes, @org.jetbrains.annotations.NotNull
    java.lang.Object... value) {
        return null;
    }
    
    /**
     * Get the [Drawable] for the given [drawableRes].
     */
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.drawable.Drawable getDrawable(@org.jetbrains.annotations.NotNull
    android.view.View $this$getDrawable, @androidx.annotation.DrawableRes
    int drawableRes) {
        return null;
    }
    
    /**
     * The the color int for the given [colorRes].
     */
    @androidx.annotation.ColorInt
    public static final int getColor(@org.jetbrains.annotations.NotNull
    android.view.View $this$getColor, @androidx.annotation.ColorRes
    int colorRes) {
        return 0;
    }
    
    /**
     * The the px size for the given [dimenRes].
     */
    @androidx.annotation.Px
    public static final float getDimension(@org.jetbrains.annotations.NotNull
    android.view.View $this$getDimension, @androidx.annotation.DimenRes
    int dimenRes) {
        return 0.0F;
    }
    
    /**
     * Set the view [View.VISIBLE].
     */
    public static final void show(@org.jetbrains.annotations.NotNull
    android.view.View $this$show) {
    }
    
    /**
     * Set the view [View.GONE].
     */
    public static final void hide(@org.jetbrains.annotations.NotNull
    android.view.View $this$hide) {
    }
    
    /**
     * Toggle the view between [View.GONE] and [View.VISIBLE]
     */
    public static final void toggleVisibility(@org.jetbrains.annotations.NotNull
    android.view.View $this$toggleVisibility) {
    }
    
    /**
     * Show a short length toast with the given [messageResId].
     */
    public static final void showShortToast(@org.jetbrains.annotations.NotNull
    android.view.View $this$showShortToast, @androidx.annotation.StringRes
    int messageResId) {
    }
    
    /**
     * Show a long length toast with the given [messageResId].
     */
    public static final void showLongToast(@org.jetbrains.annotations.NotNull
    android.view.View $this$showLongToast, @androidx.annotation.StringRes
    int messageResId) {
    }
    
    /**
     * Show a short length toast with the given [String].
     */
    public static final void showShortToast(@org.jetbrains.annotations.NotNull
    android.view.View $this$showShortToast, @org.jetbrains.annotations.Nullable
    java.lang.String message) {
    }
    
    /**
     * Show a long length toast with the given [String].
     */
    public static final void showLongToast(@org.jetbrains.annotations.NotNull
    android.view.View $this$showLongToast, @org.jetbrains.annotations.Nullable
    java.lang.String message) {
    }
    
    @androidx.annotation.ColorInt
    public static final int getTextColor(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$textColor) {
        return 0;
    }
    
    public static final void setTextColor(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$textColor, @androidx.annotation.ColorInt
    int value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public static final android.content.res.ColorStateList getTextColorStateList(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$textColorStateList) {
        return null;
    }
    
    public static final void setTextColorStateList(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$textColorStateList, @org.jetbrains.annotations.Nullable
    android.content.res.ColorStateList value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public static final android.graphics.drawable.Drawable getImageDrawable(@org.jetbrains.annotations.NotNull
    android.widget.ImageView $this$imageDrawable) {
        return null;
    }
    
    public static final void setImageDrawable(@org.jetbrains.annotations.NotNull
    android.widget.ImageView $this$imageDrawable, @org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    /**
     * Show an alert dialog.
     * @param dialogTheme The style of the dialog
     * @param isCancellable Dismiss the dialog when touch outside its bounds
     * @param title Dialog title text
     * @param icon  Dialog title icon
     * @param message Dialog message
     * @param dismissButton Dismiss button text
     * @param dialogClickListener
     */
    public static final void showAlertDialog(@org.jetbrains.annotations.NotNull
    android.view.View $this$showAlertDialog, @androidx.annotation.StyleRes
    int dialogTheme, @org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable icon, @org.jetbrains.annotations.Nullable
    java.lang.String message, @org.jetbrains.annotations.Nullable
    java.lang.String dismissButton, @org.jetbrains.annotations.Nullable
    android.content.DialogInterface.OnClickListener dialogClickListener, @org.jetbrains.annotations.Nullable
    android.content.DialogInterface.OnDismissListener dialogDismissListener) {
    }
    
    /**
     * Show an alert dialog.
     * @param dialogTheme The style of the dialog
     * @param isCancellable Dismiss the dialog when touch outside its bounds
     * @param title Dialog title text
     * @param icon  Dialog title icon
     * @param message Dialog message
     * @param positiveButton Positive button text
     * @param negativeButton Negative button text
     * @param dialogClickListener
     */
    public static final void showConfirmationDialog(@org.jetbrains.annotations.NotNull
    android.view.View $this$showConfirmationDialog, @androidx.annotation.StyleRes
    int dialogTheme, @org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable icon, @org.jetbrains.annotations.Nullable
    java.lang.String message, @org.jetbrains.annotations.Nullable
    android.content.DialogInterface.OnClickListener dialogClickListener, @org.jetbrains.annotations.Nullable
    android.content.DialogInterface.OnDismissListener dialogDismissListener) {
    }
    
    /**
     * Get the unit string for velocity based on [UnitType]
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getVelocityString(@org.jetbrains.annotations.NotNull
    android.view.View $this$getVelocityString, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
        return null;
    }
    
    /**
     * Get the unit string for distance based on [UnitType]
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getDistanceString(@org.jetbrains.annotations.NotNull
    android.view.View $this$getDistanceString, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
        return null;
    }
    
    /**
     * Set the border to a view.
     * The extension creates a layered background which can be used to set up a border to the view.
     *
     * @param backgroundColor - The color for the solid background.
     * @param borderColor - The color for the border for the view.
     * @param leftBorder - The size of the left border.
     * @param topBorder - The size of the top border.
     * @param rightBorder - The size of the right border.
     * @param bottomBorder - The size of the bottom border.
     */
    public static final void setBorder(@org.jetbrains.annotations.NotNull
    android.view.View $this$setBorder, @androidx.annotation.ColorInt
    int backgroundColor, @androidx.annotation.ColorInt
    int borderColor, int leftBorder, int topBorder, int rightBorder, int bottomBorder) {
    }
    
    /**
     * On click listener for recycler view.
     */
    @org.jetbrains.annotations.NotNull
    public static final <T extends androidx.recyclerview.widget.RecyclerView.ViewHolder>T listen(@org.jetbrains.annotations.NotNull
    T $this$listen, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> event) {
        return null;
    }
    
    /**
     * 判断是否点击过快
     * @param viewId
     * @param duration
     * @return
     */
    public static final boolean isFastClick(@org.jetbrains.annotations.NotNull
    android.widget.Button $this$isFastClick, int duration) {
        return false;
    }
    
    /**
     * 判断是否点击过快
     * @param viewId
     * @return
     */
    public static final boolean isFastClick(@org.jetbrains.annotations.NotNull
    android.widget.Button $this$isFastClick) {
        return false;
    }
}