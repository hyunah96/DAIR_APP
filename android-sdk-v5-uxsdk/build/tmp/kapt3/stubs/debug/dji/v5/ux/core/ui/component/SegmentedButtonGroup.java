package dji.v5.ux.core.ui.component;

import java.lang.System;

/**
 * 类似iOS的分段控件
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u00018B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010/\u001a\u0002002\b\b\u0001\u00101\u001a\u00020\u0010J\u0010\u00102\u001a\u0002002\u0006\u00103\u001a\u00020!H\u0002J\u0010\u00104\u001a\u0002002\u0006\u00105\u001a\u000206H\u0014J\b\u00107\u001a\u000200H\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001a\u0010(\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Ldji/v5/ux/core/ui/component/SegmentedButtonGroup;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "NOT_SET", "", "animator", "Landroid/animation/ValueAnimator;", "getAnimator", "()Landroid/animation/ValueAnimator;", "setAnimator", "(Landroid/animation/ValueAnimator;)V", "checkedItemBgColor", "", "getCheckedItemBgColor", "()I", "setCheckedItemBgColor", "(I)V", "checkedItemLeft", "getCheckedItemLeft", "()F", "setCheckedItemLeft", "(F)V", "checkedItemRect", "Landroid/graphics/RectF;", "getCheckedItemRect", "()Landroid/graphics/RectF;", "setCheckedItemRect", "(Landroid/graphics/RectF;)V", "checkedItemView", "Landroid/view/View;", "onCheckedChangedListener", "Ldji/v5/ux/core/ui/component/SegmentedButtonGroup$OnCheckedListener;", "getOnCheckedChangedListener", "()Ldji/v5/ux/core/ui/component/SegmentedButtonGroup$OnCheckedListener;", "setOnCheckedChangedListener", "(Ldji/v5/ux/core/ui/component/SegmentedButtonGroup$OnCheckedListener;)V", "paint", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "setPaint", "(Landroid/graphics/Paint;)V", "radius", "check", "", "id", "onClickItem", "view", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onFinishInflate", "OnCheckedListener", "android-sdk-v5-uxsdk_debug"})
public final class SegmentedButtonGroup extends android.widget.LinearLayout {
    private final float NOT_SET = 3.4028235E38F;
    private int checkedItemBgColor = android.graphics.Color.TRANSPARENT;
    @org.jetbrains.annotations.NotNull
    private android.graphics.RectF checkedItemRect;
    private float checkedItemLeft;
    @org.jetbrains.annotations.Nullable
    private android.animation.ValueAnimator animator;
    @org.jetbrains.annotations.NotNull
    private android.graphics.Paint paint;
    private float radius = 0.0F;
    private android.view.View checkedItemView;
    @org.jetbrains.annotations.Nullable
    private dji.v5.ux.core.ui.component.SegmentedButtonGroup.OnCheckedListener onCheckedChangedListener;
    
    @kotlin.jvm.JvmOverloads
    public SegmentedButtonGroup(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public SegmentedButtonGroup(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public final int getCheckedItemBgColor() {
        return 0;
    }
    
    public final void setCheckedItemBgColor(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.graphics.RectF getCheckedItemRect() {
        return null;
    }
    
    public final void setCheckedItemRect(@org.jetbrains.annotations.NotNull
    android.graphics.RectF p0) {
    }
    
    public final float getCheckedItemLeft() {
        return 0.0F;
    }
    
    public final void setCheckedItemLeft(float p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.animation.ValueAnimator getAnimator() {
        return null;
    }
    
    public final void setAnimator(@org.jetbrains.annotations.Nullable
    android.animation.ValueAnimator p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.graphics.Paint getPaint() {
        return null;
    }
    
    public final void setPaint(@org.jetbrains.annotations.NotNull
    android.graphics.Paint p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final dji.v5.ux.core.ui.component.SegmentedButtonGroup.OnCheckedListener getOnCheckedChangedListener() {
        return null;
    }
    
    public final void setOnCheckedChangedListener(@org.jetbrains.annotations.Nullable
    dji.v5.ux.core.ui.component.SegmentedButtonGroup.OnCheckedListener p0) {
    }
    
    @java.lang.Override
    protected void onFinishInflate() {
    }
    
    @java.lang.Override
    protected void onDraw(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas) {
    }
    
    private final void onClickItem(android.view.View view) {
    }
    
    public final void check(@androidx.annotation.IdRes
    int id) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Ldji/v5/ux/core/ui/component/SegmentedButtonGroup$OnCheckedListener;", "", "onChecked", "", "id", "", "android-sdk-v5-uxsdk_debug"})
    public static abstract interface OnCheckedListener {
        
        public abstract void onChecked(@androidx.annotation.IdRes
        int id);
    }
}