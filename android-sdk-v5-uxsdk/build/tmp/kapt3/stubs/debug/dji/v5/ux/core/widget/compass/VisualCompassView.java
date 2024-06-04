package dji.v5.ux.core.widget.compass;

import java.lang.System;

/**
 * Custom view to display the compass view for the aircraft
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 +2\u00020\u0001:\u0001+B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010%\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010&\u001a\u00020\u00072\u0006\u0010\'\u001a\u00020\nH\u0002J\b\u0010(\u001a\u00020!H\u0002J\u0010\u0010)\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0014J\u000e\u0010*\u001a\u00020!2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00078G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R$\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u001b\u001a\u00020\n2\b\b\u0001\u0010\u001b\u001a\u00020\n8\u0006@FX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u0006,"}, d2 = {"Ldji/v5/ux/core/widget/compass/VisualCompassView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "distance", "", "color", "lineColor", "getLineColor", "()I", "setLineColor", "(I)V", "interval", "lineInterval", "getLineInterval", "setLineInterval", "lines", "numberOfLines", "getNumberOfLines", "setNumberOfLines", "paint", "Landroid/graphics/Paint;", "strokeWidth", "getStrokeWidth", "()F", "setStrokeWidth", "(F)V", "drawDistance", "", "canvas", "Landroid/graphics/Canvas;", "drawObstacleInfo", "findMod", "getVirtualColor", "mod", "init", "onDraw", "setDistance", "Companion", "android-sdk-v5-uxsdk_debug"})
public final class VisualCompassView extends android.view.View {
    private final android.graphics.Paint paint = null;
    private float distance = 400.0F;
    
    /**
     * The interval between the lines
     */
    private int lineInterval = 100;
    
    /**
     * The number of lines to be drawn
     */
    private int numberOfLines = 4;
    
    /**
     * The stroke width for the lines in pixels
     */
    @androidx.annotation.FloatRange(from = 1.0, to = 4.0)
    @androidx.annotation.Px
    private float strokeWidth;
    
    /**
     * The color for the lines
     */
    private int lineColor;
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.core.widget.compass.VisualCompassView.Companion Companion = null;
    
    /**
     * The maximum width of the lines
     */
    public static final int MAX_LINE_WIDTH = 4;
    
    @kotlin.jvm.JvmOverloads
    public VisualCompassView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public VisualCompassView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public VisualCompassView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public final int getLineInterval() {
        return 0;
    }
    
    public final void setLineInterval(int interval) {
    }
    
    public final int getNumberOfLines() {
        return 0;
    }
    
    public final void setNumberOfLines(int lines) {
    }
    
    public final float getStrokeWidth() {
        return 0.0F;
    }
    
    public final void setStrokeWidth(@androidx.annotation.FloatRange(from = 1.0, to = 4.0)
    float strokeWidth) {
    }
    
    @androidx.annotation.ColorInt
    public final int getLineColor() {
        return 0;
    }
    
    public final void setLineColor(int color) {
    }
    
    private final void init() {
    }
    
    @java.lang.Override
    protected void onDraw(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas) {
    }
    
    private final float findMod(float distance) {
        return 0.0F;
    }
    
    private final int getVirtualColor(float mod) {
        return 0;
    }
    
    private final void drawDistance(android.graphics.Canvas canvas) {
    }
    
    private final void drawObstacleInfo(android.graphics.Canvas canvas) {
    }
    
    /**
     * Set the real-world distance that is represented by the length from the center to the edge
     * of the view.
     */
    public final void setDistance(float distance) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Ldji/v5/ux/core/widget/compass/VisualCompassView$Companion;", "", "()V", "MAX_LINE_WIDTH", "", "android-sdk-v5-uxsdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}