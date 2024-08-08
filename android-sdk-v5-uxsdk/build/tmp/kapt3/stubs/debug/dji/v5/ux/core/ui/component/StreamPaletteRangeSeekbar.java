package dji.v5.ux.core.ui.component;

import java.lang.System;

/**
 * 码流调试融合强度调整
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001c"}, d2 = {"Ldji/v5/ux/core/ui/component/StreamPaletteRangeSeekbar;", "Ldji/v5/ux/core/ui/component/IsothermRangeSeekbar;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "df", "Ljava/text/DecimalFormat;", "getDf", "()Ljava/text/DecimalFormat;", "setDf", "(Ljava/text/DecimalFormat;)V", "zoomMultiple", "", "getZoomMultiple", "()D", "setZoomMultiple", "(D)V", "drawLeftThumb", "", "canvas", "Landroid/graphics/Canvas;", "drawRightThumb", "getTouchRect", "Landroid/graphics/Rect;", "thumb", "Landroid/graphics/drawable/Drawable;", "android-sdk-v5-uxsdk_debug"})
public final class StreamPaletteRangeSeekbar extends dji.v5.ux.core.ui.component.IsothermRangeSeekbar {
    private double zoomMultiple = 1.0;
    @org.jetbrains.annotations.NotNull
    private java.text.DecimalFormat df;
    
    public StreamPaletteRangeSeekbar(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null);
    }
    
    public final double getZoomMultiple() {
        return 0.0;
    }
    
    public final void setZoomMultiple(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.text.DecimalFormat getDf() {
        return null;
    }
    
    public final void setDf(@org.jetbrains.annotations.NotNull
    java.text.DecimalFormat p0) {
    }
    
    @java.lang.Override
    protected void drawLeftThumb(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas) {
    }
    
    @java.lang.Override
    protected void drawRightThumb(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected android.graphics.Rect getTouchRect(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable thumb) {
        return null;
    }
}