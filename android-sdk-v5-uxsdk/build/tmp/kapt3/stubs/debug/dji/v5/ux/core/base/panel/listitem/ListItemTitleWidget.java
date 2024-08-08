package dji.v5.ux.core.base.panel.listitem;

import java.lang.System;

/**
 * This is the base class used for list item. The class represents
 * the item title and item icon.
 * @property defaultStyle - Resource id for tyle used for defining the default setup
 * of the widget.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004B/\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0002\u0010\fJ\u001a\u0010g\u001a\u00020h2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0003J\"\u0010i\u001a\u00020h2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0014J\u0012\u0010j\u001a\u00020h2\b\u0010k\u001a\u0004\u0018\u00010lH\u0016J\b\u0010m\u001a\u00020hH&J&\u0010n\u001a\u00020h2\u0006\u0010o\u001a\u00020\n2\u0006\u0010p\u001a\u00020\n2\u0006\u0010q\u001a\u00020\n2\u0006\u0010r\u001a\u00020\nJ\u0010\u0010s\u001a\u00020h2\u0006\u0010t\u001a\u000209H\u0016J\u0010\u0010G\u001a\u00020h2\b\b\u0001\u0010u\u001a\u00020\nJ\u0010\u0010v\u001a\u00020h2\b\b\u0001\u0010w\u001a\u00020\nR*\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0019\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0016\"\u0004\b\u001f\u0010\u001cR$\u0010 \u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u001cR$\u0010#\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0016\"\u0004\b%\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\nX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016R\u001e\u0010\'\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0016\"\u0004\b)\u0010\u001cR\u001e\u0010*\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0016\"\u0004\b,\u0010\u001cR\u0014\u0010-\u001a\u00020.X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0014\u00101\u001a\u00020.X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00100R\u0014\u00103\u001a\u00020.X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00100R\u0014\u00105\u001a\u00020.X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00100R\u0014\u00107\u001a\u00020.X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00100R$\u0010:\u001a\u0002092\u0006\u0010\r\u001a\u000209@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R*\u0010@\u001a\u0004\u0018\u00010?2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010?8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR(\u0010E\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bF\u0010\u0011\"\u0004\bG\u0010\u0013R*\u0010H\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bI\u0010\u0011\"\u0004\bJ\u0010\u0013R(\u0010K\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\n8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0016\"\u0004\bM\u0010\u001cR\u0016\u0010N\u001a\n O*\u0004\u0018\u00010\u00180\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010P\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\n8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bQ\u0010\u0016\"\u0004\bR\u0010\u001cR(\u0010T\u001a\u0004\u0018\u00010S2\b\u0010\r\u001a\u0004\u0018\u00010S8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR&\u0010Z\u001a\u00020Y2\b\b\u0001\u0010\r\u001a\u00020Y8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u0016\u0010_\u001a\n O*\u0004\u0018\u00010`0`X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010a\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\u0016\"\u0004\bc\u0010\u001cR\u001e\u0010d\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u0016\"\u0004\bf\u0010\u001c\u00a8\u0006x"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemTitleWidget;", "T", "", "Ldji/v5/ux/core/base/widget/ConstraintLayoutWidget;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defaultStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "value", "Landroid/graphics/drawable/Drawable;", "clickIndicatorIcon", "getClickIndicatorIcon", "()Landroid/graphics/drawable/Drawable;", "setClickIndicatorIcon", "(Landroid/graphics/drawable/Drawable;)V", "clickIndicatorId", "getClickIndicatorId", "()I", "clickIndicatorImageView", "Landroid/widget/ImageView;", "contentPaddingBottom", "getContentPaddingBottom", "setContentPaddingBottom", "(I)V", "contentPaddingLeft", "getContentPaddingLeft", "setContentPaddingLeft", "contentPaddingRight", "getContentPaddingRight", "setContentPaddingRight", "contentPaddingTop", "getContentPaddingTop", "setContentPaddingTop", "getDefaultStyle", "disconnectedValueColor", "getDisconnectedValueColor", "setDisconnectedValueColor", "errorValueColor", "getErrorValueColor", "setErrorValueColor", "guidelineBottom", "Landroidx/constraintlayout/widget/Guideline;", "getGuidelineBottom", "()Landroidx/constraintlayout/widget/Guideline;", "guidelineCenter", "getGuidelineCenter", "guidelineLeft", "getGuidelineLeft", "guidelineRight", "getGuidelineRight", "guidelineTop", "getGuidelineTop", "", "listItemClickable", "getListItemClickable", "()Z", "setListItemClickable", "(Z)V", "", "listItemTitle", "getListItemTitle", "()Ljava/lang/String;", "setListItemTitle", "(Ljava/lang/String;)V", "listItemTitleBackground", "getListItemTitleBackground", "setListItemTitleBackground", "listItemTitleIcon", "getListItemTitleIcon", "setListItemTitleIcon", "listItemTitleIconColor", "getListItemTitleIconColor", "setListItemTitleIconColor", "listItemTitleImageView", "kotlin.jvm.PlatformType", "listItemTitleTextColor", "getListItemTitleTextColor", "setListItemTitleTextColor", "Landroid/content/res/ColorStateList;", "listItemTitleTextColors", "getListItemTitleTextColors", "()Landroid/content/res/ColorStateList;", "setListItemTitleTextColors", "(Landroid/content/res/ColorStateList;)V", "", "listItemTitleTextSize", "getListItemTitleTextSize", "()F", "setListItemTitleTextSize", "(F)V", "listItemTitleTextView", "Landroid/widget/TextView;", "normalValueColor", "getNormalValueColor", "setNormalValueColor", "warningValueColor", "getWarningValueColor", "setWarningValueColor", "initAttributes", "", "initView", "onClick", "v", "Landroid/view/View;", "onListItemClick", "setContentPadding", "left", "top", "right", "bottom", "setEnabled", "enabled", "resourceId", "setListItemTitleTextAppearance", "textAppearanceResId", "android-sdk-v5-uxsdk_debug"})
public abstract class ListItemTitleWidget<T extends java.lang.Object> extends dji.v5.ux.core.base.widget.ConstraintLayoutWidget<T> implements android.view.View.OnClickListener {
    private final int defaultStyle = 0;
    private final android.widget.TextView listItemTitleTextView = null;
    private final android.widget.ImageView listItemTitleImageView = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.constraintlayout.widget.Guideline guidelineLeft = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.constraintlayout.widget.Guideline guidelineTop = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.constraintlayout.widget.Guideline guidelineRight = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.constraintlayout.widget.Guideline guidelineBottom = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.constraintlayout.widget.Guideline guidelineCenter = null;
    private final android.widget.ImageView clickIndicatorImageView = null;
    
    /**
     * ID of the click indicator view
     */
    private final int clickIndicatorId = 0;
    
    /**
     * Toggle clickable functionality of the list item
     */
    private boolean listItemClickable = false;
    
    /**
     * Color of label text when disconnected
     */
    @androidx.annotation.ColorInt
    private int disconnectedValueColor;
    
    /**
     * Color of the label text when state is normal
     */
    @androidx.annotation.ColorInt
    private int normalValueColor;
    
    /**
     * Color of the label text when state is warning
     */
    @androidx.annotation.ColorInt
    private int warningValueColor;
    
    /**
     * Color of the label text when state is error
     */
    @androidx.annotation.ColorInt
    private int errorValueColor;
    
    /**
     * The color of the icon
     */
    private int listItemTitleIconColor;
    
    /**
     * Left padding of the list item content
     */
    private int contentPaddingLeft;
    
    /**
     * Top padding of the list item content
     */
    private int contentPaddingTop;
    
    /**
     * Right padding of the list item content
     */
    private int contentPaddingRight;
    
    /**
     * Bottom padding of the list item content
     */
    private int contentPaddingBottom;
    
    @kotlin.jvm.JvmOverloads
    public ListItemTitleWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @androidx.annotation.StyleRes
    int defaultStyle) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public ListItemTitleWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, @androidx.annotation.StyleRes
    int defaultStyle) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public ListItemTitleWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr, @androidx.annotation.StyleRes
    int defaultStyle) {
        super(null, null, 0);
    }
    
    protected final int getDefaultStyle() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final androidx.constraintlayout.widget.Guideline getGuidelineLeft() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final androidx.constraintlayout.widget.Guideline getGuidelineTop() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final androidx.constraintlayout.widget.Guideline getGuidelineRight() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final androidx.constraintlayout.widget.Guideline getGuidelineBottom() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final androidx.constraintlayout.widget.Guideline getGuidelineCenter() {
        return null;
    }
    
    public final int getClickIndicatorId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getClickIndicatorIcon() {
        return null;
    }
    
    public final void setClickIndicatorIcon(@org.jetbrains.annotations.Nullable
    @androidx.annotation.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    public final boolean getListItemClickable() {
        return false;
    }
    
    public final void setListItemClickable(boolean value) {
    }
    
    public final int getDisconnectedValueColor() {
        return 0;
    }
    
    public final void setDisconnectedValueColor(int p0) {
    }
    
    public final int getNormalValueColor() {
        return 0;
    }
    
    public final void setNormalValueColor(int p0) {
    }
    
    public final int getWarningValueColor() {
        return 0;
    }
    
    public final void setWarningValueColor(int p0) {
    }
    
    public final int getErrorValueColor() {
        return 0;
    }
    
    public final void setErrorValueColor(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getListItemTitle() {
        return null;
    }
    
    public final void setListItemTitle(@org.jetbrains.annotations.Nullable
    @androidx.annotation.Nullable
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getListItemTitleIcon() {
        return null;
    }
    
    public final void setListItemTitleIcon(@org.jetbrains.annotations.Nullable
    @androidx.annotation.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @androidx.annotation.ColorInt
    public final int getListItemTitleIconColor() {
        return 0;
    }
    
    public final void setListItemTitleIconColor(@androidx.annotation.ColorInt
    int value) {
    }
    
    @androidx.annotation.Dimension
    public final float getListItemTitleTextSize() {
        return 0.0F;
    }
    
    public final void setListItemTitleTextSize(@androidx.annotation.Dimension
    float value) {
    }
    
    @androidx.annotation.ColorInt
    public final int getListItemTitleTextColor() {
        return 0;
    }
    
    public final void setListItemTitleTextColor(@androidx.annotation.ColorInt
    int value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.content.res.ColorStateList getListItemTitleTextColors() {
        return null;
    }
    
    public final void setListItemTitleTextColors(@org.jetbrains.annotations.Nullable
    android.content.res.ColorStateList value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getListItemTitleBackground() {
        return null;
    }
    
    public final void setListItemTitleBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    public final int getContentPaddingLeft() {
        return 0;
    }
    
    public final void setContentPaddingLeft(int value) {
    }
    
    public final int getContentPaddingTop() {
        return 0;
    }
    
    public final void setContentPaddingTop(int value) {
    }
    
    public final int getContentPaddingRight() {
        return 0;
    }
    
    public final void setContentPaddingRight(int value) {
    }
    
    public final int getContentPaddingBottom() {
        return 0;
    }
    
    public final void setContentPaddingBottom(int value) {
    }
    
    @java.lang.Override
    protected void initView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
    }
    
    @android.annotation.SuppressLint(value = {"Recycle"})
    private final void initAttributes(android.content.Context context, android.util.AttributeSet attrs) {
    }
    
    @java.lang.Override
    public void setEnabled(boolean enabled) {
    }
    
    @java.lang.Override
    public void onClick(@org.jetbrains.annotations.Nullable
    android.view.View v) {
    }
    
    public abstract void onListItemClick();
    
    /**
     * Set the background of the list item title
     *
     * @param resourceId Integer ID of the background resource
     */
    public final void setListItemTitleBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the text appearance of the title
     *
     * @param textAppearanceResId Style resource for text appearance
     */
    public final void setListItemTitleTextAppearance(@androidx.annotation.StyleRes
    int textAppearanceResId) {
    }
    
    /**
     * Set padding to the content of the list item
     */
    public final void setContentPadding(int left, int top, int right, int bottom) {
    }
}