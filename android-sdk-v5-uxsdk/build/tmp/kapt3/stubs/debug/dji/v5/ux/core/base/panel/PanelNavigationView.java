package dji.v5.ux.core.base.panel;

import java.lang.System;

/**
 * View to handheld navigation between panels.
 * If a panel item needs to navigate to another panel, make that view implement [Navigable].
 * The [PanelNavigationView] controls the stack of views being presented. It also provides
 * customization to change the transition animations.
 *
 * The PanelNavigationView can be initialized with root view. The root view can also be [push]
 * during Runtime.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010(\u001a\u00020\u0017H\u0002J\u0018\u0010)\u001a\u00020*2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J\u0018\u0010+\u001a\u00020*2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H$J\u001a\u0010,\u001a\n -*\u0004\u0018\u00010\r0\r2\b\b\u0001\u0010.\u001a\u00020\bH\u0002J\u0010\u0010/\u001a\u00020*2\u0006\u00100\u001a\u00020\nH$J\n\u00101\u001a\u0004\u0018\u00010\nH\u0016J\b\u00102\u001a\u00020*H\u0016J\u0010\u00103\u001a\u00020*2\u0006\u00100\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020*2\b\b\u0001\u0010.\u001a\u00020\bJ\u0010\u0010\u0015\u001a\u00020*2\b\b\u0001\u0010.\u001a\u00020\bJ\u0010\u0010!\u001a\u00020*2\b\b\u0001\u0010.\u001a\u00020\bJ\u0010\u0010$\u001a\u00020*2\b\b\u0001\u0010.\u001a\u00020\bJ\b\u00104\u001a\u00020*H\u0002J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\n05R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011R\u001a\u0010\"\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\u0011R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\'X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Ldji/v5/ux/core/base/panel/PanelNavigationView;", "Landroid/widget/FrameLayout;", "Ldji/v5/ux/core/base/panel/PanelNavigator;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "rootView", "Landroid/view/View;", "(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/view/View;)V", "addViewToTopAnimation", "Landroid/view/animation/Animation;", "getAddViewToTopAnimation", "()Landroid/view/animation/Animation;", "setAddViewToTopAnimation", "(Landroid/view/animation/Animation;)V", "currentView", "hideViewAnimation", "getHideViewAnimation", "setHideViewAnimation", "isAnimationEnabled", "", "()Z", "setAnimationEnabled", "(Z)V", "isRootViewVisible", "Lio/reactivex/rxjava3/processors/BehaviorProcessor;", "layoutParams", "Landroid/widget/FrameLayout$LayoutParams;", "removeViewFromTopAnimation", "getRemoveViewFromTopAnimation", "setRemoveViewFromTopAnimation", "showViewAnimation", "getShowViewAnimation", "setShowViewAnimation", "viewAdded", "viewStack", "Ljava/util/Stack;", "canRemoveView", "initAnimationAttributes", "", "initAttributes", "loadAnimation", "kotlin.jvm.PlatformType", "animRes", "onViewPushed", "view", "peek", "pop", "push", "updateIsRootViewVisible", "Lio/reactivex/rxjava3/core/Flowable;", "android-sdk-v5-uxsdk_debug"})
public abstract class PanelNavigationView extends android.widget.FrameLayout implements dji.v5.ux.core.base.panel.PanelNavigator {
    
    /**
     * Enables or disables all transition animations.
     */
    private boolean isAnimationEnabled = true;
    
    /**
     * Transition animation for when a view is added on top.
     * Set to null to remove animation.
     */
    @org.jetbrains.annotations.NotNull
    private android.view.animation.Animation addViewToTopAnimation;
    
    /**
     * Transition animation for when a view is removed from the top.
     * * Set to null to remove animation.
     */
    @org.jetbrains.annotations.NotNull
    private android.view.animation.Animation removeViewFromTopAnimation;
    
    /**
     * Transition animation for when a view is reappearing.
     * * Set to null to remove animation.
     */
    @org.jetbrains.annotations.NotNull
    private android.view.animation.Animation showViewAnimation;
    
    /**
     * Transition animation for when a view is being replaced.
     * * Set to null to remove animation.
     */
    @org.jetbrains.annotations.NotNull
    private android.view.animation.Animation hideViewAnimation;
    private final java.util.Stack<android.view.View> viewStack = null;
    private android.view.View currentView;
    private final android.widget.FrameLayout.LayoutParams layoutParams = null;
    private final io.reactivex.rxjava3.processors.BehaviorProcessor<java.lang.Boolean> isRootViewVisible = null;
    private final io.reactivex.rxjava3.processors.BehaviorProcessor<android.view.View> viewAdded = null;
    
    @kotlin.jvm.JvmOverloads
    public PanelNavigationView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public PanelNavigationView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public PanelNavigationView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public PanelNavigationView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr, @org.jetbrains.annotations.Nullable
    android.view.View rootView) {
        super(null);
    }
    
    public final boolean isAnimationEnabled() {
        return false;
    }
    
    public final void setAnimationEnabled(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.view.animation.Animation getAddViewToTopAnimation() {
        return null;
    }
    
    public final void setAddViewToTopAnimation(@org.jetbrains.annotations.NotNull
    android.view.animation.Animation p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.view.animation.Animation getRemoveViewFromTopAnimation() {
        return null;
    }
    
    public final void setRemoveViewFromTopAnimation(@org.jetbrains.annotations.NotNull
    android.view.animation.Animation p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.view.animation.Animation getShowViewAnimation() {
        return null;
    }
    
    public final void setShowViewAnimation(@org.jetbrains.annotations.NotNull
    android.view.animation.Animation p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.view.animation.Animation getHideViewAnimation() {
        return null;
    }
    
    public final void setHideViewAnimation(@org.jetbrains.annotations.NotNull
    android.view.animation.Animation p0) {
    }
    
    /**
     * Push a [View] to the top.
     */
    @java.lang.Override
    public void push(@org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
    
    /**
     * Pop the current view. Will not pop if the current view is the root.
     */
    @java.lang.Override
    public void pop() {
    }
    
    /**
     * Get the top level [View].
     */
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View peek() {
        return null;
    }
    
    /**
     * Callback for when a [View] is pushed to the top.
     */
    protected abstract void onViewPushed(@org.jetbrains.annotations.NotNull
    android.view.View view);
    
    /**
     * [Flowable] to observe when a [View] is added to the top.
     */
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<android.view.View> viewAdded() {
        return null;
    }
    
    /**
     * Set the [animRes] for when a view is added on top.
     */
    public final void setAddViewToTopAnimation(@androidx.annotation.AnimRes
    int animRes) {
    }
    
    /**
     * Set the [animRes] for when a view is removed from the top.
     */
    public final void setRemoveViewFromTopAnimation(@androidx.annotation.AnimRes
    int animRes) {
    }
    
    /**
     * Set the [animRes] for when a view is reappearing.
     */
    public final void setShowViewAnimation(@androidx.annotation.AnimRes
    int animRes) {
    }
    
    /**
     * Set the [animRes] for when a view is being replaced.
     */
    public final void setHideViewAnimation(@androidx.annotation.AnimRes
    int animRes) {
    }
    
    @android.annotation.SuppressLint(value = {"Recycle"})
    private final void initAnimationAttributes(android.content.Context context, android.util.AttributeSet attrs) {
    }
    
    /**
     * Initialize child attributes here.
     */
    protected abstract void initAttributes(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.util.AttributeSet attrs);
    
    private final boolean canRemoveView() {
        return false;
    }
    
    private final void updateIsRootViewVisible() {
    }
    
    private final android.view.animation.Animation loadAnimation(@androidx.annotation.AnimRes
    int animRes) {
        return null;
    }
}