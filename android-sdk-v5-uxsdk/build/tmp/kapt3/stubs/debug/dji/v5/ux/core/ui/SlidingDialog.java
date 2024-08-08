package dji.v5.ux.core.ui;

import java.lang.System;

/**
 * A dialog where the positive action is represented by a [SlideAndFillSeekBar]. The negative
 * action is represented by a button at the bottom of the dialog. The dialog contains a title,
 * a message, and a checkbox.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u001e\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u00a7\u0001B#\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0003\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nJ6\u0010o\u001a\u00020p2\u0006\u0010q\u001a\u00020\b2\u0006\u0010r\u001a\u00020\b2\u0006\u0010s\u001a\u00020\b2\u0006\u0010t\u001a\u00020\b2\u0006\u0010u\u001a\u00020B2\u0006\u0010v\u001a\u00020BJ\b\u0010w\u001a\u00020pH\u0002J\u001a\u0010x\u001a\u00020p2\b\u0010y\u001a\u0004\u0018\u00010z2\u0006\u0010{\u001a\u00020BH\u0016J\u0010\u0010|\u001a\u00020p2\u0006\u0010}\u001a\u00020~H\u0016J\u0014\u0010\u007f\u001a\u00020p2\n\u0010\u0080\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0014J$\u0010\u0082\u0001\u001a\u00020p2\u0007\u0010l\u001a\u00030\u0083\u00012\u0007\u0010\u0084\u0001\u001a\u00020\b2\u0007\u0010\u0085\u0001\u001a\u00020BH\u0016J\u0012\u0010\u0086\u0001\u001a\u00020p2\u0007\u0010l\u001a\u00030\u0083\u0001H\u0016J\u0012\u0010\u0087\u0001\u001a\u00020p2\u0007\u0010l\u001a\u00030\u0083\u0001H\u0016J\u0011\u0010\u0088\u0001\u001a\u00020\u00002\b\u0010\u0089\u0001\u001a\u00030\u008a\u0001J\u0011\u0010\u0015\u001a\u00020\u00002\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010\fJ\u0012\u0010\u008c\u0001\u001a\u00020\u00002\t\b\u0001\u0010\u008d\u0001\u001a\u00020\bJ\u0012\u0010\u008e\u0001\u001a\u00020\u00002\t\b\u0001\u0010\u008f\u0001\u001a\u00020\bJ\u0010\u0010\u001a\u001a\u00020\u00002\b\b\u0001\u0010\u0016\u001a\u00020\bJ\u0010\u0010!\u001a\u00020\u00002\b\b\u0001\u0010\u001c\u001a\u00020\u001dJ\u0011\u00103\u001a\u00020\u00002\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010\fJ\u0012\u0010\u0090\u0001\u001a\u00020\u00002\t\b\u0001\u0010\u008f\u0001\u001a\u00020\bJ\u0010\u00106\u001a\u00020\u00002\b\b\u0001\u0010\u0016\u001a\u00020\bJ\u0010\u0010@\u001a\u00020\u00002\b\b\u0001\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010F\u001a\u00020\u00002\u0006\u0010{\u001a\u00020BJ\u0011\u0010\u0091\u0001\u001a\u00020\u00002\b\u0010\u0092\u0001\u001a\u00030\u008a\u0001J\u0011\u0010J\u001a\u00020\u00002\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010\fJ\u0012\u0010\u0093\u0001\u001a\u00020\u00002\t\b\u0001\u0010\u0094\u0001\u001a\u00020\bJ\u0012\u0010\u0095\u0001\u001a\u00020\u00002\t\b\u0001\u0010\u008f\u0001\u001a\u00020\bJ\u0010\u0010M\u001a\u00020\u00002\b\b\u0001\u0010\u0016\u001a\u00020\bJ\u0010\u0010P\u001a\u00020\u00002\b\b\u0001\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010\u0096\u0001\u001a\u00020\u00002\u0007\u0010\u0097\u0001\u001a\u00020BJ\u0012\u0010\u0098\u0001\u001a\u00020\u00002\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010\fJ\u0011\u0010\u0099\u0001\u001a\u00020\u00002\b\b\u0001\u0010\u0016\u001a\u00020\bJ\u0011\u0010\u009a\u0001\u001a\u00020\u00002\b\u0010\u0092\u0001\u001a\u00030\u008a\u0001J\u0011\u0010W\u001a\u00020\u00002\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010\fJ\u0012\u0010\u009b\u0001\u001a\u00020\u00002\t\b\u0001\u0010\u0094\u0001\u001a\u00020\bJ\u0012\u0010\u009c\u0001\u001a\u00020\u00002\t\b\u0001\u0010\u008f\u0001\u001a\u00020\bJ\u0010\u0010Z\u001a\u00020\u00002\b\b\u0001\u0010\u0016\u001a\u00020\bJ\u0010\u0010]\u001a\u00020\u00002\b\b\u0001\u0010\u001c\u001a\u00020\u001dJ\u0011\u0010\u009d\u0001\u001a\u00020\u00002\b\u0010\u009e\u0001\u001a\u00030\u008a\u0001J\u0011\u0010`\u001a\u00020\u00002\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010\fJ\u0012\u0010\u009f\u0001\u001a\u00020\u00002\t\b\u0001\u0010\u00a0\u0001\u001a\u00020\bJ\u0012\u0010\u00a1\u0001\u001a\u00020\u00002\t\b\u0001\u0010\u008f\u0001\u001a\u00020\bJ\u0010\u0010c\u001a\u00020\u00002\b\b\u0001\u0010\u0016\u001a\u00020\bJ\u0010\u0010f\u001a\u00020\u00002\b\b\u0001\u0010\u001c\u001a\u00020\u001dJ\u0012\u0010\u00a2\u0001\u001a\u00020p2\t\u0010\u00a3\u0001\u001a\u0004\u0018\u00010kJ\u0012\u0010\u00a4\u0001\u001a\u00020p2\u0007\u0010\u00a5\u0001\u001a\u00020BH\u0002J\t\u0010\u00a6\u0001\u001a\u00020pH\u0016R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0013\u001a\u0004\u0018\u00010\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R&\u0010\u0017\u001a\u00020\b2\b\b\u0001\u0010\u0016\u001a\u00020\b8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR&\u0010\u001e\u001a\u00020\u001d2\b\b\u0001\u0010\u001c\u001a\u00020\u001d8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R&\u0010#\u001a\u00020\b2\b\b\u0001\u0010\u0016\u001a\u00020\b8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR&\u0010&\u001a\u00020\b2\b\b\u0001\u0010\u0016\u001a\u00020\b8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\'\u0010\u0019\"\u0004\b(\u0010\u001bR&\u0010)\u001a\u00020\b2\b\b\u0001\u0010\u0016\u001a\u00020\b8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010\u001bR\u000e\u0010,\u001a\u00020-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010.\u001a\u0004\u0018\u00010\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b/\u0010\u000f\"\u0004\b0\u0010\u0011R(\u00101\u001a\u0004\u0018\u00010\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b2\u0010\u000f\"\u0004\b3\u0010\u0011R&\u00104\u001a\u00020\b2\b\b\u0001\u0010\u0016\u001a\u00020\b8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b5\u0010\u0019\"\u0004\b6\u0010\u001bR(\u00109\u001a\u0004\u0018\u0001082\b\u00107\u001a\u0004\u0018\u0001088F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R&\u0010>\u001a\u00020\u001d2\b\b\u0001\u0010\u001c\u001a\u00020\u001d8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b?\u0010 \"\u0004\b@\u0010\"R\u000e\u0010A\u001a\u00020-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010C\u001a\u00020B2\u0006\u0010\u0012\u001a\u00020B8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR(\u0010H\u001a\u0004\u0018\u00010\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bI\u0010\u000f\"\u0004\bJ\u0010\u0011R&\u0010K\u001a\u00020\b2\b\b\u0001\u0010\u0016\u001a\u00020\b8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bL\u0010\u0019\"\u0004\bM\u0010\u001bR&\u0010N\u001a\u00020\u001d2\b\b\u0001\u0010\u001c\u001a\u00020\u001d8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bO\u0010 \"\u0004\bP\u0010\"R\u000e\u0010Q\u001a\u00020RX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020TX\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010U\u001a\u0004\u0018\u00010\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bV\u0010\u000f\"\u0004\bW\u0010\u0011R&\u0010X\u001a\u00020\b2\b\b\u0001\u0010\u0016\u001a\u00020\b8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bY\u0010\u0019\"\u0004\bZ\u0010\u001bR&\u0010[\u001a\u00020\u001d2\b\b\u0001\u0010\u001c\u001a\u00020\u001d8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\\\u0010 \"\u0004\b]\u0010\"R(\u0010^\u001a\u0004\u0018\u00010\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b_\u0010\u000f\"\u0004\b`\u0010\u0011R&\u0010a\u001a\u00020\b2\b\b\u0001\u0010\u0016\u001a\u00020\b8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bb\u0010\u0019\"\u0004\bc\u0010\u001bR&\u0010d\u001a\u00020\u001d2\b\b\u0001\u0010\u001c\u001a\u00020\u001d8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\be\u0010 \"\u0004\bf\u0010\"R\u000e\u0010g\u001a\u00020hX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010j\u001a\u0004\u0018\u00010kX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020mX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00a8\u0001"}, d2 = {"Ldji/v5/ux/core/ui/SlidingDialog;", "Landroid/app/Dialog;", "Landroid/view/View$OnClickListener;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "context", "Landroid/content/Context;", "styleId", "", "widthId", "(Landroid/content/Context;II)V", "icon", "Landroid/graphics/drawable/Drawable;", "actionIcon", "getActionIcon", "()Landroid/graphics/drawable/Drawable;", "setActionIcon", "(Landroid/graphics/drawable/Drawable;)V", "value", "actionMessageBackground", "getActionMessageBackground", "setActionMessageBackground", "color", "actionMessageTextColor", "getActionMessageTextColor", "()I", "setActionMessageTextColor", "(I)V", "textSize", "", "actionMessageTextSize", "getActionMessageTextSize", "()F", "setActionMessageTextSize", "(F)V", "actionSliderFillColor", "getActionSliderFillColor", "setActionSliderFillColor", "actionSliderThumbColor", "getActionSliderThumbColor", "setActionSliderThumbColor", "actionSliderThumbSelectedColor", "getActionSliderThumbSelectedColor", "setActionSliderThumbSelectedColor", "actionTextView", "Landroid/widget/TextView;", "background", "getBackground", "setBackground", "cancelBackground", "getCancelBackground", "setCancelBackground", "cancelTextColor", "getCancelTextColor", "setCancelTextColor", "colors", "Landroid/content/res/ColorStateList;", "cancelTextColors", "getCancelTextColors", "()Landroid/content/res/ColorStateList;", "setCancelTextColors", "(Landroid/content/res/ColorStateList;)V", "cancelTextSize", "getCancelTextSize", "setCancelTextSize", "cancelTextView", "", "checkBoxChecked", "getCheckBoxChecked", "()Z", "setCheckBoxChecked", "(Z)V", "checkBoxMessageBackground", "getCheckBoxMessageBackground", "setCheckBoxMessageBackground", "checkBoxMessageTextColor", "getCheckBoxMessageTextColor", "setCheckBoxMessageTextColor", "checkBoxMessageTextSize", "getCheckBoxMessageTextSize", "setCheckBoxMessageTextSize", "checkbox", "Landroid/widget/CheckBox;", "container", "Landroidx/constraintlayout/widget/ConstraintLayout;", "dialogMessageBackground", "getDialogMessageBackground", "setDialogMessageBackground", "dialogMessageTextColor", "getDialogMessageTextColor", "setDialogMessageTextColor", "dialogMessageTextSize", "getDialogMessageTextSize", "setDialogMessageTextSize", "dialogTitleBackground", "getDialogTitleBackground", "setDialogTitleBackground", "dialogTitleTextColor", "getDialogTitleTextColor", "setDialogTitleTextColor", "dialogTitleTextSize", "getDialogTitleTextSize", "setDialogTitleTextSize", "iconImageView", "Landroid/widget/ImageView;", "messageTextView", "onEventListener", "Ldji/v5/ux/core/ui/SlidingDialog$OnEventListener;", "seekBar", "Ldji/v5/ux/core/ui/SlideAndFillSeekBar;", "titleTextView", "adjustAttrs", "", "width", "height", "yOffset", "gravity", "cancelable", "cancelTouchOutside", "handleSbStopTrack", "onCheckedChanged", "buttonView", "Landroid/widget/CompoundButton;", "isChecked", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onProgressChanged", "Landroid/widget/SeekBar;", "progress", "fromUser", "onStartTrackingTouch", "onStopTrackingTouch", "setActionMessage", "action", "", "drawable", "setActionMessageRes", "actionId", "setActionMessageTextAppearance", "textAppearance", "setCancelTextAppearance", "setCheckBoxMessage", "message", "setCheckBoxMessageRes", "messageId", "setCheckBoxMessageTextAppearance", "setCheckBoxVisibility", "visible", "setDialogIcon", "setDialogIconTint", "setDialogMessage", "setDialogMessageRes", "setDialogMessageTextAppearance", "setDialogTitle", "title", "setDialogTitleRes", "titleId", "setDialogTitleTextAppearance", "setOnEventListener", "listener", "setSlideChecked", "checked", "show", "OnEventListener", "android-sdk-v5-uxsdk_debug"})
public final class SlidingDialog extends android.app.Dialog implements android.view.View.OnClickListener, android.widget.SeekBar.OnSeekBarChangeListener, android.widget.CompoundButton.OnCheckedChangeListener {
    private final int widthId = 0;
    private androidx.constraintlayout.widget.ConstraintLayout container;
    private android.widget.ImageView iconImageView;
    private android.widget.TextView cancelTextView;
    private android.widget.TextView actionTextView;
    private android.widget.TextView titleTextView;
    private android.widget.TextView messageTextView;
    private android.widget.CheckBox checkbox;
    private dji.v5.ux.core.ui.SlideAndFillSeekBar seekBar;
    private dji.v5.ux.core.ui.SlidingDialog.OnEventListener onEventListener;
    
    @kotlin.jvm.JvmOverloads
    public SlidingDialog(@org.jetbrains.annotations.NotNull
    android.content.Context context, @androidx.annotation.StyleRes
    int styleId) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public SlidingDialog(@org.jetbrains.annotations.NotNull
    android.content.Context context, @androidx.annotation.StyleRes
    int styleId, @androidx.annotation.DimenRes
    int widthId) {
        super(null);
    }
    
    @androidx.annotation.Dimension
    public final float getDialogTitleTextSize() {
        return 0.0F;
    }
    
    public final void setDialogTitleTextSize(@androidx.annotation.Dimension
    float textSize) {
    }
    
    @androidx.annotation.ColorInt
    public final int getDialogTitleTextColor() {
        return 0;
    }
    
    public final void setDialogTitleTextColor(@androidx.annotation.ColorInt
    int color) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getDialogTitleBackground() {
        return null;
    }
    
    public final void setDialogTitleBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @androidx.annotation.Dimension
    public final float getDialogMessageTextSize() {
        return 0.0F;
    }
    
    public final void setDialogMessageTextSize(@androidx.annotation.Dimension
    float textSize) {
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
    public final float getCheckBoxMessageTextSize() {
        return 0.0F;
    }
    
    public final void setCheckBoxMessageTextSize(@androidx.annotation.Dimension
    float textSize) {
    }
    
    @androidx.annotation.ColorInt
    public final int getCheckBoxMessageTextColor() {
        return 0;
    }
    
    public final void setCheckBoxMessageTextColor(@androidx.annotation.ColorInt
    int color) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getCheckBoxMessageBackground() {
        return null;
    }
    
    public final void setCheckBoxMessageBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    public final boolean getCheckBoxChecked() {
        return false;
    }
    
    public final void setCheckBoxChecked(boolean value) {
    }
    
    @androidx.annotation.Dimension
    public final float getCancelTextSize() {
        return 0.0F;
    }
    
    public final void setCancelTextSize(@androidx.annotation.Dimension
    float textSize) {
    }
    
    @androidx.annotation.ColorInt
    public final int getCancelTextColor() {
        return 0;
    }
    
    public final void setCancelTextColor(@androidx.annotation.ColorInt
    int color) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.content.res.ColorStateList getCancelTextColors() {
        return null;
    }
    
    public final void setCancelTextColors(@org.jetbrains.annotations.Nullable
    android.content.res.ColorStateList colors) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getCancelBackground() {
        return null;
    }
    
    public final void setCancelBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @androidx.annotation.Dimension
    public final float getActionMessageTextSize() {
        return 0.0F;
    }
    
    public final void setActionMessageTextSize(@androidx.annotation.Dimension
    float textSize) {
    }
    
    @androidx.annotation.ColorInt
    public final int getActionMessageTextColor() {
        return 0;
    }
    
    public final void setActionMessageTextColor(@androidx.annotation.ColorInt
    int color) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getActionMessageBackground() {
        return null;
    }
    
    public final void setActionMessageBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getActionIcon() {
        return null;
    }
    
    public final void setActionIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable icon) {
    }
    
    @androidx.annotation.ColorInt
    public final int getActionSliderThumbColor() {
        return 0;
    }
    
    public final void setActionSliderThumbColor(@androidx.annotation.ColorInt
    int color) {
    }
    
    @androidx.annotation.ColorInt
    public final int getActionSliderThumbSelectedColor() {
        return 0;
    }
    
    public final void setActionSliderThumbSelectedColor(@androidx.annotation.ColorInt
    int color) {
    }
    
    @androidx.annotation.ColorInt
    public final int getActionSliderFillColor() {
        return 0;
    }
    
    public final void setActionSliderFillColor(@androidx.annotation.ColorInt
    int color) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getBackground() {
        return null;
    }
    
    public final void setBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onClick(@org.jetbrains.annotations.NotNull
    android.view.View v) {
    }
    
    @java.lang.Override
    public void onCheckedChanged(@org.jetbrains.annotations.Nullable
    android.widget.CompoundButton buttonView, boolean isChecked) {
    }
    
    private final void handleSbStopTrack() {
    }
    
    private final void setSlideChecked(boolean checked) {
    }
    
    /**
     * Set the listener for the slider, button, and check box interaction
     *
     * @param listener The listener for this dialog
     */
    public final void setOnEventListener(@org.jetbrains.annotations.Nullable
    dji.v5.ux.core.ui.SlidingDialog.OnEventListener listener) {
    }
    
    /**
     * Configure the dialog
     *
     * @param width The width of the dialog
     * @param height The height of the dialog
     * @param yOffset The y offset of the dialog
     * @param gravity The gravity of the dialog
     * @param cancelable Whether the dialog can be canceled
     * @param cancelTouchOutside Whether the dialog is canceled when a touch occurs outside
     */
    public final void adjustAttrs(int width, int height, int yOffset, int gravity, boolean cancelable, boolean cancelTouchOutside) {
    }
    
    @java.lang.Override
    public void show() {
    }
    
    @java.lang.Override
    public void onProgressChanged(@org.jetbrains.annotations.NotNull
    android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    }
    
    @java.lang.Override
    public void onStartTrackingTouch(@org.jetbrains.annotations.NotNull
    android.widget.SeekBar seekBar) {
    }
    
    @java.lang.Override
    public void onStopTrackingTouch(@org.jetbrains.annotations.NotNull
    android.widget.SeekBar seekBar) {
    }
    
    /**
     * Set the dialog title
     *
     * @param titleId The resource ID of the dialog title
     */
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.SlidingDialog setDialogTitleRes(@androidx.annotation.StringRes
    int titleId) {
        return null;
    }
    
    /**
     * Set the dialog title
     *
     * @param title The dialog title
     */
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.SlidingDialog setDialogTitle(@org.jetbrains.annotations.NotNull
    java.lang.String title) {
        return null;
    }
    
    /**
     * Set the dialog message
     *
     * @param messageId The resource ID of the dialog message
     */
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.SlidingDialog setDialogMessageRes(@androidx.annotation.StringRes
    int messageId) {
        return null;
    }
    
    /**
     * Set the dialog message
     *
     * @param message The dialog message
     */
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.SlidingDialog setDialogMessage(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
        return null;
    }
    
    /**
     * Set the color of the dialog title
     *
     * @param color The color of the dialog title
     */
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.SlidingDialog setDialogTitleTextColor(@androidx.annotation.ColorInt
    int color) {
        return null;
    }
    
    /**
     * Set the color of the dialog message
     *
     * @param color The color of the dialog message
     */
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.SlidingDialog setDialogMessageTextColor(@androidx.annotation.ColorInt
    int color) {
        return null;
    }
    
    /**
     * Set the size of the dialog title
     *
     * @param textSize The size of the dialog title
     */
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.SlidingDialog setDialogTitleTextSize(@androidx.annotation.Dimension
    float textSize) {
        return null;
    }
    
    /**
     * Set the size of the dialog message
     *
     * @param textSize The size of the dialog message
     */
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.SlidingDialog setDialogMessageTextSize(@androidx.annotation.Dimension
    float textSize) {
        return null;
    }
    
    /**
     * Set the background of the dialog title
     *
     * @param drawable The background of the dialog title
     */
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.SlidingDialog setDialogTitleBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable drawable) {
        return null;
    }
    
    /**
     * Set the background of the dialog message
     *
     * @param drawable The background of the dialog message
     */
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.SlidingDialog setDialogMessageBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable drawable) {
        return null;
    }
    
    /**
     * Set the text appearance of the dialog title
     *
     * @param textAppearance The text appearance of the dialog title
     */
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.SlidingDialog setDialogTitleTextAppearance(@androidx.annotation.StyleRes
    int textAppearance) {
        return null;
    }
    
    /**
     * Set the text appearance of the dialog message
     *
     * @param textAppearance The text appearance of the dialog message
     */
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.SlidingDialog setDialogMessageTextAppearance(@androidx.annotation.StyleRes
    int textAppearance) {
        return null;
    }
    
    /**
     * Set the visibility of the check box
     *
     * @param visible Whether the check box is visible
     */
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.SlidingDialog setCheckBoxVisibility(boolean visible) {
        return null;
    }
    
    /**
     * Set the check box message
     *
     * @param messageId The resource ID of the check box message
     */
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.SlidingDialog setCheckBoxMessageRes(@androidx.annotation.StringRes
    int messageId) {
        return null;
    }
    
    /**
     * Set the check box message
     *
     * @param message The check box message
     */
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.SlidingDialog setCheckBoxMessage(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
        return null;
    }
    
    /**
     * Set whether the check box is checked
     *
     * @param isChecked Whether the check box is checked
     */
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.SlidingDialog setCheckBoxChecked(boolean isChecked) {
        return null;
    }
    
    /**
     * Set the color of the check box message
     *
     * @param color The color of the check box message
     */
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.SlidingDialog setCheckBoxMessageTextColor(@androidx.annotation.ColorInt
    int color) {
        return null;
    }
    
    /**
     * Set the size of the check box message
     *
     * @param textSize The size of the check box message
     */
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.SlidingDialog setCheckBoxMessageTextSize(@androidx.annotation.Dimension
    float textSize) {
        return null;
    }
    
    /**
     * Set the background of the check box message
     *
     * @param drawable The background of the check box message
     */
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.SlidingDialog setCheckBoxMessageBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable drawable) {
        return null;
    }
    
    /**
     * Set the text appearance of the check box message
     *
     * @param textAppearance The text appearance of the check box message
     */
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.SlidingDialog setCheckBoxMessageTextAppearance(@androidx.annotation.StyleRes
    int textAppearance) {
        return null;
    }
    
    /**
     * Set the action message
     *
     * @param actionId The resource ID of the action message
     */
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.SlidingDialog setActionMessageRes(@androidx.annotation.StringRes
    int actionId) {
        return null;
    }
    
    /**
     * Set the action message
     *
     * @param action The action message
     */
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.SlidingDialog setActionMessage(@org.jetbrains.annotations.NotNull
    java.lang.String action) {
        return null;
    }
    
    /**
     * Set the color of the action message
     *
     * @param color The color of the action message
     */
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.SlidingDialog setActionMessageTextColor(@androidx.annotation.ColorInt
    int color) {
        return null;
    }
    
    /**
     * Set the size of the action message
     *
     * @param textSize The size of the action message
     */
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.SlidingDialog setActionMessageTextSize(@androidx.annotation.Dimension
    float textSize) {
        return null;
    }
    
    /**
     * Set the background of the action message
     *
     * @param drawable The background of the action message
     */
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.SlidingDialog setActionMessageBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable drawable) {
        return null;
    }
    
    /**
     * Set the text appearance of the action message
     *
     * @param textAppearance The text appearance of the action message
     */
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.SlidingDialog setActionMessageTextAppearance(@androidx.annotation.StyleRes
    int textAppearance) {
        return null;
    }
    
    /**
     * Set the icon next to the dialog title
     *
     * @param drawable The icon next to the dialog title
     */
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.SlidingDialog setDialogIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable drawable) {
        return null;
    }
    
    /**
     * Set the tint of the icon next to the dialog title
     *
     * @param color The tint of the icon
     */
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.SlidingDialog setDialogIconTint(@androidx.annotation.ColorInt
    int color) {
        return null;
    }
    
    /**
     * Set the color of the cancel button text
     *
     * @param color The color of the cancel text
     */
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.SlidingDialog setCancelTextColor(@androidx.annotation.ColorInt
    int color) {
        return null;
    }
    
    /**
     * Set the size of the cancel button text
     *
     * @param textSize The size of the cancel text
     */
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.SlidingDialog setCancelTextSize(@androidx.annotation.Dimension
    float textSize) {
        return null;
    }
    
    /**
     * Set the background of the cancel button
     *
     * @param drawable The background of the cancel button
     */
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.SlidingDialog setCancelBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable drawable) {
        return null;
    }
    
    /**
     * Set the text appearance of the cancel button
     *
     * @param textAppearance The text appearance of the cancel button
     */
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.SlidingDialog setCancelTextAppearance(@androidx.annotation.StyleRes
    int textAppearance) {
        return null;
    }
    
    /**
     * The listener that handles slider, button, and check box interaction
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u001a\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u001a\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Ldji/v5/ux/core/ui/SlidingDialog$OnEventListener;", "", "onCancelClick", "", "dialog", "Landroid/content/DialogInterface;", "onCheckBoxChecked", "checked", "", "onSlideChecked", "android-sdk-v5-uxsdk_debug"})
    public static abstract interface OnEventListener {
        
        /**
         * Event when the cancel button is clicked
         *
         * @param dialog The dialog that was interacted with
         */
        public abstract void onCancelClick(@org.jetbrains.annotations.Nullable
        android.content.DialogInterface dialog);
        
        /**
         * Event when the [SlideAndFillSeekBar] has been filled
         *
         * @param dialog The dialog that was interacted with
         * @param checked `true` if the [SlideAndFillSeekBar] is filled
         */
        public abstract void onSlideChecked(@org.jetbrains.annotations.Nullable
        android.content.DialogInterface dialog, boolean checked);
        
        /**
         * Event when the check box is checked
         *
         * @param dialog The dialog that was interacted with
         * @param checked `true` if the check box is checked
         */
        public abstract void onCheckBoxChecked(@org.jetbrains.annotations.Nullable
        android.content.DialogInterface dialog, boolean checked);
    }
}