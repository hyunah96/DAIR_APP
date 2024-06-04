package dji.v5.ux.core.base.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 y2\u00020\u0001:\u0005yz{|}B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u00122\u0006\u0010J\u001a\u00020KH\u0002J\u0018\u0010L\u001a\u00020H2\u0006\u0010I\u001a\u00020\u00122\u0006\u0010J\u001a\u00020KH\u0002J\u0012\u0010M\u001a\u0004\u0018\u0001072\u0006\u0010N\u001a\u00020\u0012H\u0002J\u0006\u0010O\u001a\u00020PJ\u0006\u0010Q\u001a\u00020RJ\b\u0010S\u001a\u00020TH\u0002J\b\u0010U\u001a\u00020TH\u0002J\u0010\u0010V\u001a\u00020T2\u0006\u0010\u000b\u001a\u00020/H\u0002J\u0010\u0010W\u001a\u00020\u00152\u0006\u0010N\u001a\u00020\u0012H\u0002J\u0010\u0010X\u001a\u00020\u00152\u0006\u0010N\u001a\u00020\u0012H\u0002J\u0010\u0010Y\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u0012H\u0002J\u0010\u0010Z\u001a\u00020\u00122\u0006\u0010[\u001a\u00020/H\u0002J\u0010\u0010\\\u001a\u00020H2\u0006\u0010]\u001a\u00020^H\u0002J\u0010\u0010_\u001a\u00020H2\u0006\u0010J\u001a\u00020KH\u0015J\u0018\u0010`\u001a\u00020H2\u0006\u0010a\u001a\u00020\u00072\u0006\u0010b\u001a\u00020\u0007H\u0014J\u0010\u0010c\u001a\u00020H2\u0006\u0010d\u001a\u00020eH\u0014J\b\u0010f\u001a\u00020eH\u0014J\u0010\u0010g\u001a\u00020H2\u0006\u0010h\u001a\u00020^H\u0002J\u0012\u0010i\u001a\u00020\u00152\b\u0010]\u001a\u0004\u0018\u00010^H\u0017J\b\u0010j\u001a\u00020HH\u0002J\u0010\u0010k\u001a\u00020/2\u0006\u0010l\u001a\u00020\u0012H\u0002J\u0016\u0010m\u001a\u00020H2\u0006\u0010n\u001a\u00020\u00122\u0006\u0010o\u001a\u00020\u0012J\u0010\u0010p\u001a\u00020H2\u0006\u0010\u000b\u001a\u00020/H\u0002J\u0010\u0010q\u001a\u00020H2\u0006\u0010\u000b\u001a\u00020/H\u0002J\u001e\u0010r\u001a\u00020H2\u0006\u0010+\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010B\u001a\u00020\u0012J&\u0010r\u001a\u00020H2\u0006\u0010+\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010B\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J6\u0010r\u001a\u00020H2\u0006\u0010+\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010B\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0012J \u0010s\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010B\u001a\u00020\u0012H\u0002J\u0010\u0010t\u001a\u00020 2\u0006\u0010u\u001a\u00020vH\u0002J\u0010\u0010w\u001a\u00020H2\u0006\u0010]\u001a\u00020^H\u0002J\u0010\u0010x\u001a\u00020/2\u0006\u0010\u000b\u001a\u00020/H\u0002R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00078\u0006@FX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u0015@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00078\u0006@FX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u000e\u0010(\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010+\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0012@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u00109\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00078\u0006@FX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u000e\"\u0004\b;\u0010\u0010R\u000e\u0010<\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010>\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b?\u0010\u000eR\u000e\u0010B\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006~"}, d2 = {"Ldji/v5/ux/core/base/widget/BasicRangeSeekBar;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "activePointerId", "barHeight", "value", "centerBarColor", "getCenterBarColor", "()I", "setCenterBarColor", "(I)V", "downMotionX", "", "gapValue", "isDragging", "", "isShowLeftThumb", "()Z", "setShowLeftThumb", "(Z)V", "largerBoundaryValue", "leftPadding", "leftSideBarColor", "getLeftSideBarColor", "setLeftSideBarColor", "leftThumbImg", "Landroid/graphics/Bitmap;", "leftThumbOffset", "listener", "Ldji/v5/ux/core/base/widget/BasicRangeSeekBar$OnRangeSeekBarListener;", "getListener", "()Ldji/v5/ux/core/base/widget/BasicRangeSeekBar$OnRangeSeekBarListener;", "setListener", "(Ldji/v5/ux/core/base/widget/BasicRangeSeekBar$OnRangeSeekBarListener;)V", "lowerBoundaryValue", "maxValue", "<set-?>", "minValue", "getMinValue", "()F", "normalizedGapValue", "", "normalizedLargerBoundaryValue", "normalizedLowerBoundaryValue", "normalizedMaxValue", "normalizedMinValue", "paint", "Landroid/graphics/Paint;", "pressedThumb", "Ldji/v5/ux/core/base/widget/BasicRangeSeekBar$Thumb;", "rightPadding", "rightSideBarColor", "getRightSideBarColor", "setRightSideBarColor", "rightThumbImg", "rightThumbOffset", "scaledTouchSlop", "getScaledTouchSlop", "scaledTouchSlop$delegate", "Lkotlin/Lazy;", "stepValue", "stepsCount", "thumbBackPadding", "thumbLeftPointerPadding", "thumbRightPointerPadding", "drawLeftThumb", "", "screenCoord", "canvas", "Landroid/graphics/Canvas;", "drawRightThumb", "evalPressedThumb", "touchX", "getCurrentValues", "Ldji/v5/ux/core/base/widget/BasicRangeSeekBar$Range;", "getRangeInfo", "Ldji/v5/ux/core/base/widget/BasicRangeSeekBar$RangeInfo;", "getSelectedMaxValue", "Ljava/math/BigDecimal;", "getSelectedMinValue", "getValueAccordingToStep", "isInLeftThumbRange", "isInRightThumbRange", "normalizeToValue", "normalizedToScreen", "normalizedPos", "onActionMove", "event", "Landroid/view/MotionEvent;", "onDraw", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onRestoreInstanceState", "parcel", "Landroid/os/Parcelable;", "onSaveInstanceState", "onSecondaryPointerUp", "ev", "onTouchEvent", "resetRange", "screenToNormalized", "screenPos", "setCurrentValues", "leftValue", "rightValue", "setNormalizedMaxValue", "setNormalizedMinValue", "setRange", "stepValueValidation", "toBitmap", "drawable", "Landroid/graphics/drawable/Drawable;", "trackTouchEvent", "valueToNormalize", "Companion", "OnRangeSeekBarListener", "Range", "RangeInfo", "Thumb", "android-sdk-v5-uxsdk_debug"})
public final class BasicRangeSeekBar extends android.view.View {
    private final android.graphics.Bitmap leftThumbImg = null;
    private final android.graphics.Bitmap rightThumbImg = null;
    private int rightThumbOffset = 14;
    private int leftThumbOffset = 14;
    private float minValue = 0.0F;
    private float maxValue = 100.0F;
    private float stepValue = 1.0F;
    private float gapValue = 0.0F;
    private float lowerBoundaryValue = 100.0F;
    private float largerBoundaryValue = 0.0F;
    @androidx.annotation.ColorInt
    private int leftSideBarColor;
    @androidx.annotation.ColorInt
    private int centerBarColor;
    @androidx.annotation.ColorInt
    private int rightSideBarColor;
    @org.jetbrains.annotations.Nullable
    private dji.v5.ux.core.base.widget.BasicRangeSeekBar.OnRangeSeekBarListener listener;
    private boolean isShowLeftThumb = true;
    private int barHeight = 0;
    private int thumbLeftPointerPadding = 0;
    private int thumbRightPointerPadding = 24;
    private int thumbBackPadding = 0;
    private boolean isDragging = false;
    private int stepsCount = 0;
    private final kotlin.Lazy scaledTouchSlop$delegate = null;
    private int activePointerId = 255;
    private float downMotionX = 0.0F;
    private float leftPadding = 0.0F;
    private float rightPadding = 0.0F;
    private double normalizedMinValue = 0.0;
    private double normalizedMaxValue = 1.0;
    private double normalizedGapValue = 0.0;
    private double normalizedLowerBoundaryValue = 1.0;
    private double normalizedLargerBoundaryValue = 0.0;
    private dji.v5.ux.core.base.widget.BasicRangeSeekBar.Thumb pressedThumb;
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.core.base.widget.BasicRangeSeekBar.Companion Companion = null;
    private static final android.graphics.Rect srcThumbRect = null;
    private static final android.graphics.RectF dstThumbRectF = null;
    private static final android.graphics.Point center = null;
    private final android.graphics.Paint paint = null;
    
    @kotlin.jvm.JvmOverloads
    public BasicRangeSeekBar(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public BasicRangeSeekBar(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public BasicRangeSeekBar(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public final float getMinValue() {
        return 0.0F;
    }
    
    public final int getLeftSideBarColor() {
        return 0;
    }
    
    public final void setLeftSideBarColor(int value) {
    }
    
    public final int getCenterBarColor() {
        return 0;
    }
    
    public final void setCenterBarColor(int value) {
    }
    
    public final int getRightSideBarColor() {
        return 0;
    }
    
    public final void setRightSideBarColor(int value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final dji.v5.ux.core.base.widget.BasicRangeSeekBar.OnRangeSeekBarListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable
    dji.v5.ux.core.base.widget.BasicRangeSeekBar.OnRangeSeekBarListener p0) {
    }
    
    public final boolean isShowLeftThumb() {
        return false;
    }
    
    public final void setShowLeftThumb(boolean value) {
    }
    
    private final int getScaledTouchSlop() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    @kotlin.Suppress(names = {"NAME_SHADOWING"})
    @java.lang.Override
    public boolean onTouchEvent(@org.jetbrains.annotations.Nullable
    android.view.MotionEvent event) {
        return false;
    }
    
    private final void onActionMove(android.view.MotionEvent event) {
    }
    
    @android.annotation.SuppressLint(value = {"DrawAllocation"})
    @java.lang.Override
    protected void onDraw(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas) {
    }
    
    private final boolean stepValueValidation(float minValue, float maxValue, float stepValue) {
        return false;
    }
    
    private final void drawLeftThumb(float screenCoord, android.graphics.Canvas canvas) {
    }
    
    private final void drawRightThumb(float screenCoord, android.graphics.Canvas canvas) {
    }
    
    private final dji.v5.ux.core.base.widget.BasicRangeSeekBar.Thumb evalPressedThumb(float touchX) {
        return null;
    }
    
    private final void onSecondaryPointerUp(android.view.MotionEvent ev) {
    }
    
    private final boolean isInLeftThumbRange(float touchX) {
        return false;
    }
    
    private final boolean isInRightThumbRange(float touchX) {
        return false;
    }
    
    private final float normalizedToScreen(double normalizedPos) {
        return 0.0F;
    }
    
    private final void trackTouchEvent(android.view.MotionEvent event) {
    }
    
    private final void setNormalizedMinValue(double value) {
    }
    
    private final void setNormalizedMaxValue(double value) {
    }
    
    private final double screenToNormalized(float screenPos) {
        return 0.0;
    }
    
    private final double valueToNormalize(double value) {
        return 0.0;
    }
    
    private final float normalizeToValue(float value) {
        return 0.0F;
    }
    
    private final java.math.BigDecimal getSelectedMinValue() {
        return null;
    }
    
    private final java.math.BigDecimal getSelectedMaxValue() {
        return null;
    }
    
    private final java.math.BigDecimal getValueAccordingToStep(double value) {
        return null;
    }
    
    private final void resetRange() {
    }
    
    public final void setRange(float minValue, float maxValue, float stepValue) {
    }
    
    public final void setRange(float minValue, float maxValue, float stepValue, float gapValue) {
    }
    
    public final void setRange(float minValue, float maxValue, float stepValue, float gapValue, float lowerBoundaryValue, float largerBoundaryValue) {
    }
    
    public final void setCurrentValues(float leftValue, float rightValue) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.base.widget.BasicRangeSeekBar.RangeInfo getRangeInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.base.widget.BasicRangeSeekBar.Range getCurrentValues() {
        return null;
    }
    
    @java.lang.Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected android.os.Parcelable onSaveInstanceState() {
        return null;
    }
    
    @java.lang.Override
    protected void onRestoreInstanceState(@org.jetbrains.annotations.NotNull
    android.os.Parcelable parcel) {
    }
    
    private final android.graphics.Bitmap toBitmap(android.graphics.drawable.Drawable drawable) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Ldji/v5/ux/core/base/widget/BasicRangeSeekBar$OnRangeSeekBarListener;", "", "onValuesChanged", "", "minValue", "", "maxValue", "onValuesChanging", "android-sdk-v5-uxsdk_debug"})
    public static abstract interface OnRangeSeekBarListener {
        
        public abstract void onValuesChanging(float minValue, float maxValue);
        
        public abstract void onValuesChanged(float minValue, float maxValue);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Ldji/v5/ux/core/base/widget/BasicRangeSeekBar$Range;", "", "leftValue", "", "rightValue", "(FF)V", "getLeftValue", "()F", "getRightValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
    public static final class Range {
        private final float leftValue = 0.0F;
        private final float rightValue = 0.0F;
        
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.core.base.widget.BasicRangeSeekBar.Range copy(float leftValue, float rightValue) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public Range(float leftValue, float rightValue) {
            super();
        }
        
        public final float component1() {
            return 0.0F;
        }
        
        public final float getLeftValue() {
            return 0.0F;
        }
        
        public final float component2() {
            return 0.0F;
        }
        
        public final float getRightValue() {
            return 0.0F;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0019"}, d2 = {"Ldji/v5/ux/core/base/widget/BasicRangeSeekBar$RangeInfo;", "", "minValue", "", "maxValue", "stepValue", "gapValue", "(FFFF)V", "getGapValue", "()F", "getMaxValue", "getMinValue", "getStepValue", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
    public static final class RangeInfo {
        private final float minValue = 0.0F;
        private final float maxValue = 0.0F;
        private final float stepValue = 0.0F;
        private final float gapValue = 0.0F;
        
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.core.base.widget.BasicRangeSeekBar.RangeInfo copy(float minValue, float maxValue, float stepValue, float gapValue) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public RangeInfo(float minValue, float maxValue, float stepValue, float gapValue) {
            super();
        }
        
        public final float component1() {
            return 0.0F;
        }
        
        public final float getMinValue() {
            return 0.0F;
        }
        
        public final float component2() {
            return 0.0F;
        }
        
        public final float getMaxValue() {
            return 0.0F;
        }
        
        public final float component3() {
            return 0.0F;
        }
        
        public final float getStepValue() {
            return 0.0F;
        }
        
        public final float component4() {
            return 0.0F;
        }
        
        public final float getGapValue() {
            return 0.0F;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Ldji/v5/ux/core/base/widget/BasicRangeSeekBar$Thumb;", "", "(Ljava/lang/String;I)V", "MIN", "MAX", "android-sdk-v5-uxsdk_debug"})
    static enum Thumb {
        /*public static final*/ MIN /* = new MIN() */,
        /*public static final*/ MAX /* = new MAX() */;
        
        Thumb() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Ldji/v5/ux/core/base/widget/BasicRangeSeekBar$Companion;", "", "()V", "center", "Landroid/graphics/Point;", "dstThumbRectF", "Landroid/graphics/RectF;", "srcThumbRect", "Landroid/graphics/Rect;", "android-sdk-v5-uxsdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}