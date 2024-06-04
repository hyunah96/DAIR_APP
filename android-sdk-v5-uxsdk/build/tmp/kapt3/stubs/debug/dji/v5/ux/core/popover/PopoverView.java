package dji.v5.ux.core.popover;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001QBI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\b\u00105\u001a\u000206H\u0002J\b\u00107\u001a\u000208H\u0002J\u0010\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020;H\u0014J(\u0010<\u001a\u0002082\u0006\u0010=\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u0005H\u0014J\u0016\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020\bJ\u000e\u0010E\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010F\u001a\u00020\u00002\u0006\u0010G\u001a\u00020HJ\u0016\u0010F\u001a\u00020\u00002\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JJ&\u0010K\u001a\u0002082\u0006\u0010L\u001a\u00020\b2\u0006\u0010M\u001a\u00020\b2\u0006\u0010N\u001a\u00020\b2\u0006\u0010O\u001a\u00020\u0005J\b\u0010P\u001a\u000208H\u0002R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010#\"\u0004\b(\u0010%R\u001a\u0010)\u001a\u00020*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u000200X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006R"}, d2 = {"Ldji/v5/ux/core/popover/PopoverView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "popoverBackgroundColor", "", "arrowColor", "borderRadius", "", "showArrow", "", "arrowOffset", "arrowPosition", "Ldji/v5/ux/core/popover/PopoverView$ArrowPosition;", "(Landroid/content/Context;IIFZFLdji/v5/ux/core/popover/PopoverView$ArrowPosition;)V", "arrowAngle", "arrowImageView", "Landroid/widget/ImageView;", "getArrowImageView", "()Landroid/widget/ImageView;", "setArrowImageView", "(Landroid/widget/ImageView;)V", "contentLayout", "Landroidx/cardview/widget/CardView;", "getContentLayout", "()Landroidx/cardview/widget/CardView;", "setContentLayout", "(Landroidx/cardview/widget/CardView;)V", "enableDropShadow", "getEnableDropShadow", "()Z", "setEnableDropShadow", "(Z)V", "shadowDx", "getShadowDx", "()F", "setShadowDx", "(F)V", "shadowDy", "getShadowDy", "setShadowDy", "shadowPaint", "Landroid/graphics/Paint;", "getShadowPaint", "()Landroid/graphics/Paint;", "setShadowPaint", "(Landroid/graphics/Paint;)V", "shadowRectF", "Landroid/graphics/RectF;", "getShadowRectF", "()Landroid/graphics/RectF;", "setShadowRectF", "(Landroid/graphics/RectF;)V", "getArrowDrawable", "Landroid/graphics/drawable/Drawable;", "initViews", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onSizeChanged", "w", "h", "oldw", "oldh", "rotateBitmap", "Landroid/graphics/Bitmap;", "source", "angle", "setArrowOffset", "setContentView", "view", "Landroid/view/View;", "layoutParams", "Landroid/view/ViewGroup$LayoutParams;", "setDropShadow", "blurRadius", "dx", "dy", "color", "updateArrow", "ArrowPosition", "android-sdk-v5-uxsdk_debug"})
public final class PopoverView extends android.widget.FrameLayout {
    private int popoverBackgroundColor;
    private int arrowColor;
    private float borderRadius;
    private boolean showArrow;
    private float arrowOffset;
    private dji.v5.ux.core.popover.PopoverView.ArrowPosition arrowPosition;
    private float arrowAngle = 270.0F;
    public android.widget.ImageView arrowImageView;
    public androidx.cardview.widget.CardView contentLayout;
    @org.jetbrains.annotations.NotNull
    private android.graphics.Paint shadowPaint;
    private float shadowDx = 0.0F;
    private float shadowDy = 0.0F;
    @org.jetbrains.annotations.NotNull
    private android.graphics.RectF shadowRectF;
    private boolean enableDropShadow = false;
    
    public PopoverView(@org.jetbrains.annotations.NotNull
    android.content.Context context, int popoverBackgroundColor, int arrowColor, float borderRadius, boolean showArrow, float arrowOffset, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.popover.PopoverView.ArrowPosition arrowPosition) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.ImageView getArrowImageView() {
        return null;
    }
    
    public final void setArrowImageView(@org.jetbrains.annotations.NotNull
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.cardview.widget.CardView getContentLayout() {
        return null;
    }
    
    public final void setContentLayout(@org.jetbrains.annotations.NotNull
    androidx.cardview.widget.CardView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.graphics.Paint getShadowPaint() {
        return null;
    }
    
    public final void setShadowPaint(@org.jetbrains.annotations.NotNull
    android.graphics.Paint p0) {
    }
    
    public final float getShadowDx() {
        return 0.0F;
    }
    
    public final void setShadowDx(float p0) {
    }
    
    public final float getShadowDy() {
        return 0.0F;
    }
    
    public final void setShadowDy(float p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.graphics.RectF getShadowRectF() {
        return null;
    }
    
    public final void setShadowRectF(@org.jetbrains.annotations.NotNull
    android.graphics.RectF p0) {
    }
    
    public final boolean getEnableDropShadow() {
        return false;
    }
    
    public final void setEnableDropShadow(boolean p0) {
    }
    
    private final android.graphics.drawable.Drawable getArrowDrawable() {
        return null;
    }
    
    private final void initViews() {
    }
    
    @java.lang.Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.graphics.Bitmap rotateBitmap(@org.jetbrains.annotations.NotNull
    android.graphics.Bitmap source, float angle) {
        return null;
    }
    
    private final void updateArrow() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.popover.PopoverView setArrowOffset(float arrowOffset) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.popover.PopoverView setContentView(@org.jetbrains.annotations.NotNull
    android.view.View view) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.popover.PopoverView setContentView(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.NotNull
    android.view.ViewGroup.LayoutParams layoutParams) {
        return null;
    }
    
    public final void setDropShadow(float blurRadius, float dx, float dy, int color) {
    }
    
    @java.lang.Override
    protected void onDraw(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Ldji/v5/ux/core/popover/PopoverView$ArrowPosition;", "", "(Ljava/lang/String;I)V", "TOP", "RIGHT", "BOTTOM", "LEFT", "android-sdk-v5-uxsdk_debug"})
    public static enum ArrowPosition {
        /*public static final*/ TOP /* = new TOP() */,
        /*public static final*/ RIGHT /* = new RIGHT() */,
        /*public static final*/ BOTTOM /* = new BOTTOM() */,
        /*public static final*/ LEFT /* = new LEFT() */;
        
        ArrowPosition() {
        }
    }
}