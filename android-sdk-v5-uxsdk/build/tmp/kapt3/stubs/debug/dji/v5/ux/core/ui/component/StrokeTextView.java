package dji.v5.ux.core.ui.component;

import java.lang.System;

/**
 * 支持描边的TextView
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0014R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001f"}, d2 = {"Ldji/v5/ux/core/ui/component/StrokeTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onDrawingFlag", "", "getOnDrawingFlag", "()Z", "setOnDrawingFlag", "(Z)V", "strokeColor", "getStrokeColor", "()I", "setStrokeColor", "(I)V", "strokeWidth", "", "getStrokeWidth", "()F", "setStrokeWidth", "(F)V", "invalidate", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "android-sdk-v5-uxsdk_debug"})
public class StrokeTextView extends androidx.appcompat.widget.AppCompatTextView {
    private float strokeWidth = 0.0F;
    private int strokeColor = 0;
    private boolean onDrawingFlag = false;
    
    @kotlin.jvm.JvmOverloads
    public StrokeTextView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public StrokeTextView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public StrokeTextView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public final float getStrokeWidth() {
        return 0.0F;
    }
    
    public final void setStrokeWidth(float p0) {
    }
    
    public final int getStrokeColor() {
        return 0;
    }
    
    public final void setStrokeColor(int p0) {
    }
    
    public final boolean getOnDrawingFlag() {
        return false;
    }
    
    public final void setOnDrawingFlag(boolean p0) {
    }
    
    @java.lang.Override
    public void invalidate() {
    }
    
    @java.lang.Override
    protected void onDraw(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas) {
    }
}