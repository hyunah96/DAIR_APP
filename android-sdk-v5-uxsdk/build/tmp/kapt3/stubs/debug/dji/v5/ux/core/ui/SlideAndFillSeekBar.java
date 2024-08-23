package dji.v5.ux.core.ui;

import java.lang.System;

/**
 * A SeekBar that features a progress color
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!H\u0014J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u000bH\u0016R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u000e\u0010\u0018\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011\u00a8\u0006$"}, d2 = {"Ldji/v5/ux/core/ui/SlideAndFillSeekBar;", "Landroidx/appcompat/widget/AppCompatSeekBar;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "currentProgress", "outerListener", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "value", "progressColor", "getProgressColor", "()I", "setProgressColor", "(I)V", "reachedPaint", "Landroid/graphics/Paint;", "startPaint", "thumbNormalColor", "getThumbNormalColor", "setThumbNormalColor", "thumbPaint", "thumbSelectedColor", "getThumbSelectedColor", "setThumbSelectedColor", "initListener", "", "initPaints", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setOnSeekBarChangeListener", "l", "android-sdk-v5-uxsdk_debug"})
public final class SlideAndFillSeekBar extends androidx.appcompat.widget.AppCompatSeekBar {
    private android.graphics.Paint reachedPaint;
    private android.graphics.Paint thumbPaint;
    private android.graphics.Paint startPaint;
    private android.widget.SeekBar.OnSeekBarChangeListener outerListener;
    private int currentProgress = 0;
    
    /**
     * The color of the thumb when selected
     */
    private int thumbSelectedColor;
    
    /**
     * The color of the thumb when unselected
     */
    private int thumbNormalColor;
    
    /**
     * The color of the filled section of the SeekBar
     */
    private int progressColor;
    
    @kotlin.jvm.JvmOverloads
    public SlideAndFillSeekBar(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public SlideAndFillSeekBar(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public SlideAndFillSeekBar(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public final int getThumbSelectedColor() {
        return 0;
    }
    
    public final void setThumbSelectedColor(int p0) {
    }
    
    public final int getThumbNormalColor() {
        return 0;
    }
    
    public final void setThumbNormalColor(int p0) {
    }
    
    public final int getProgressColor() {
        return 0;
    }
    
    public final void setProgressColor(int value) {
    }
    
    private final void initListener() {
    }
    
    @java.lang.Override
    public void setOnSeekBarChangeListener(@org.jetbrains.annotations.NotNull
    android.widget.SeekBar.OnSeekBarChangeListener l) {
    }
    
    private final void initPaints() {
    }
    
    @kotlin.jvm.Synchronized
    @java.lang.Override
    protected synchronized void onDraw(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas) {
    }
}