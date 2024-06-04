package dji.v5.ux.core.ui.component;

import java.lang.System;

/**
 * 等温线范围条件控件
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u00012B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0014J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0014J\u0010\u0010#\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0014J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u0019H\u0014J\u0012\u0010&\u001a\u00020\f2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014J\u0010\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020+H\u0014J\u0010\u0010,\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0014J\u0018\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\u0019H\u0014J\u000e\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u00020(R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001b\u00a8\u00063"}, d2 = {"Ldji/v5/ux/core/ui/component/IsothermRangeSeekbar;", "Ldji/v5/ux/core/ui/RangeSeekBar;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "DEBUG_TOUCH_RECT", "", "paint", "Landroid/graphics/Paint;", "textBounds", "Landroid/graphics/Rect;", "getTextBounds", "()Landroid/graphics/Rect;", "textFormatCallback", "Ldji/v5/ux/core/ui/component/IsothermRangeSeekbar$TextFormatCallback;", "getTextFormatCallback", "()Ldji/v5/ux/core/ui/component/IsothermRangeSeekbar$TextFormatCallback;", "setTextFormatCallback", "(Ldji/v5/ux/core/ui/component/IsothermRangeSeekbar$TextFormatCallback;)V", "textPaint", "getTextPaint", "()Landroid/graphics/Paint;", "thumbHeight", "", "getThumbHeight", "()I", "thumbWidth", "getThumbWidth", "drawLeftThumb", "", "canvas", "Landroid/graphics/Canvas;", "drawProgress", "drawRightThumb", "getThumbPosition", "value", "getTouchRect", "thumb", "Landroid/graphics/drawable/Drawable;", "getValueByDelta", "delta", "", "onDraw", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setProgressDrawable", "drawable", "TextFormatCallback", "android-sdk-v5-uxsdk_debug"})
public class IsothermRangeSeekbar extends dji.v5.ux.core.ui.RangeSeekBar {
    private final boolean DEBUG_TOUCH_RECT = false;
    private final android.graphics.Paint paint = null;
    @org.jetbrains.annotations.NotNull
    private final android.graphics.Paint textPaint = null;
    @org.jetbrains.annotations.NotNull
    private final android.graphics.Rect textBounds = null;
    private final int thumbWidth = 0;
    private final int thumbHeight = 0;
    @org.jetbrains.annotations.Nullable
    private dji.v5.ux.core.ui.component.IsothermRangeSeekbar.TextFormatCallback textFormatCallback;
    
    @kotlin.jvm.JvmOverloads
    public IsothermRangeSeekbar(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public IsothermRangeSeekbar(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.graphics.Paint getTextPaint() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.graphics.Rect getTextBounds() {
        return null;
    }
    
    public final int getThumbWidth() {
        return 0;
    }
    
    public final int getThumbHeight() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final dji.v5.ux.core.ui.component.IsothermRangeSeekbar.TextFormatCallback getTextFormatCallback() {
        return null;
    }
    
    public final void setTextFormatCallback(@org.jetbrains.annotations.Nullable
    dji.v5.ux.core.ui.component.IsothermRangeSeekbar.TextFormatCallback p0) {
    }
    
    @java.lang.Override
    protected void onDraw(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected android.graphics.Rect getTouchRect(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable thumb) {
        return null;
    }
    
    @java.lang.Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    @java.lang.Override
    protected void drawLeftThumb(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas) {
    }
    
    @java.lang.Override
    protected void drawRightThumb(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas) {
    }
    
    @java.lang.Override
    protected void drawProgress(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas) {
    }
    
    public final void setProgressDrawable(@org.jetbrains.annotations.NotNull
    android.graphics.drawable.Drawable drawable) {
    }
    
    @java.lang.Override
    protected int getThumbPosition(int value) {
        return 0;
    }
    
    @java.lang.Override
    protected int getValueByDelta(float delta) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Ldji/v5/ux/core/ui/component/IsothermRangeSeekbar$TextFormatCallback;", "", "format", "", "value", "", "android-sdk-v5-uxsdk_debug"})
    public static abstract interface TextFormatCallback {
        
        @org.jetbrains.annotations.NotNull
        public abstract java.lang.String format(int value);
    }
}