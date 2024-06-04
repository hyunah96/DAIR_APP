package dji.v5.ux.core.ui.exposure;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\bH\u0014J\u0012\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Ldji/v5/ux/core/ui/exposure/ExposeVSeekBar;", "Ldji/v5/ux/core/ui/VerticalSeekBar;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "halfSunSize", "", "isShowSeekBar", "", "()Z", "setShowSeekBar", "(Z)V", "paint", "Landroid/graphics/Paint;", "rect", "Landroid/graphics/Rect;", "rectSolidColor", "rectStrokeColor", "rectStrokeWidth", "rectWidth", "sunMargin", "sunSize", "drawRect", "", "canvas", "Landroid/graphics/Canvas;", "onDraw", "onDrawRect", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "android-sdk-v5-uxsdk_debug"})
public final class ExposeVSeekBar extends dji.v5.ux.core.ui.VerticalSeekBar {
    private boolean isShowSeekBar = false;
    private final int sunSize = 0;
    private final int rectWidth = 0;
    private final int sunMargin = 0;
    private final int rectStrokeWidth = 0;
    private final int halfSunSize = 0;
    private final android.graphics.Rect rect = null;
    private final android.graphics.Paint paint = null;
    private final int rectSolidColor = 0;
    private final int rectStrokeColor = 0;
    
    @kotlin.jvm.JvmOverloads
    public ExposeVSeekBar(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null);
    }
    
    @kotlin.jvm.JvmOverloads
    public ExposeVSeekBar(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null);
    }
    
    public final boolean isShowSeekBar() {
        return false;
    }
    
    public final void setShowSeekBar(boolean p0) {
    }
    
    @java.lang.Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    @java.lang.Override
    public boolean onTouchEvent(@org.jetbrains.annotations.Nullable
    android.view.MotionEvent event) {
        return false;
    }
    
    @java.lang.Override
    protected void onDraw(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas) {
    }
    
    private final void drawRect(android.graphics.Canvas canvas) {
    }
    
    private final void onDrawRect(android.graphics.Canvas canvas) {
    }
}