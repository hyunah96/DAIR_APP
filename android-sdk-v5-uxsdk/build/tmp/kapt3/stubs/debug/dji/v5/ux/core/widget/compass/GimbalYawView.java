package dji.v5.ux.core.widget.compass;

import java.lang.System;

/**
 * Custom view to display the aircraft gimbal's heading
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 -2\u00020\u0001:\u0001-B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020+H\u0014J\u000e\u0010,\u001a\u00020(2\u0006\u0010!\u001a\u00020\nR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\r\u001a\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020\u00078\u0006@FX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\u0013\u001a\u00020\u00072\b\b\u0001\u0010\u0013\u001a\u00020\u00078\u0006@FX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u000e\u0010\u0016\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u001c\u001a\u00020\n2\b\b\u0001\u0010\u001c\u001a\u00020\n8\u0006@FX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\"\u001a\u00020\u00072\b\b\u0001\u0010\"\u001a\u00020\u00078\u0006@FX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\u0011R\u000e\u0010%\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Ldji/v5/ux/core/widget/compass/GimbalYawView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "absYaw", "", "beforeShow", "", "blinkColor", "getBlinkColor", "()I", "setBlinkColor", "(I)V", "curBlinkColor", "invalidColor", "getInvalidColor", "setInvalidColor", "invalidStartAngle", "invalidSweepAngle", "paint", "Landroid/graphics/Paint;", "rect", "Landroid/graphics/RectF;", "strokeWidth", "getStrokeWidth", "()F", "setStrokeWidth", "(F)V", "yaw", "yawColor", "getYawColor", "setYawColor", "yawStartAngle", "yawSweepAngle", "init", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setYaw", "Companion", "android-sdk-v5-uxsdk_debug"})
public final class GimbalYawView extends android.view.View {
    private final android.graphics.RectF rect = null;
    private final android.graphics.Paint paint = null;
    private int curBlinkColor = 0;
    private boolean beforeShow = false;
    private float yaw = 0.0F;
    private float absYaw = 0.0F;
    private float yawStartAngle = 0.0F;
    private float yawSweepAngle = 0.0F;
    private float invalidStartAngle = 0.0F;
    private float invalidSweepAngle = 0.0F;
    
    /**
     * The stroke width for the lines in pixels
     */
    @androidx.annotation.FloatRange(from = 1.0, to = 4.0)
    @androidx.annotation.Px
    private float strokeWidth;
    
    /**
     * The yaw color
     */
    @androidx.annotation.ColorInt
    private int yawColor;
    
    /**
     * The invalid color
     */
    @androidx.annotation.ColorInt
    private int invalidColor;
    
    /**
     * The blink color
     */
    @androidx.annotation.ColorInt
    private int blinkColor;
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.core.widget.compass.GimbalYawView.Companion Companion = null;
    
    /**
     * The maximum width of the lines
     */
    public static final int MAX_LINE_WIDTH = 4;
    
    @kotlin.jvm.JvmOverloads
    public GimbalYawView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public GimbalYawView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public GimbalYawView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public final float getStrokeWidth() {
        return 0.0F;
    }
    
    public final void setStrokeWidth(@androidx.annotation.FloatRange(from = 1.0, to = 4.0)
    float strokeWidth) {
    }
    
    public final int getYawColor() {
        return 0;
    }
    
    public final void setYawColor(@androidx.annotation.ColorInt
    int yawColor) {
    }
    
    public final int getInvalidColor() {
        return 0;
    }
    
    public final void setInvalidColor(@androidx.annotation.ColorInt
    int invalidColor) {
    }
    
    public final int getBlinkColor() {
        return 0;
    }
    
    public final void setBlinkColor(@androidx.annotation.ColorInt
    int blinkColor) {
    }
    
    private final void init() {
    }
    
    /**
     * Set the yaw for the view
     *
     * @param yaw Yaw of the gimbal
     */
    public final void setYaw(float yaw) {
    }
    
    @java.lang.Override
    protected void onDraw(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Ldji/v5/ux/core/widget/compass/GimbalYawView$Companion;", "", "()V", "MAX_LINE_WIDTH", "", "android-sdk-v5-uxsdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}