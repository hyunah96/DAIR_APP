package dji.v5.ux.core.base.panel;

import java.lang.System;

/**
 * Core functions to navigate in the [PanelNavigationView].
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Ldji/v5/ux/core/base/panel/PanelNavigator;", "", "peek", "Landroid/view/View;", "pop", "", "push", "view", "android-sdk-v5-uxsdk_debug"})
public abstract interface PanelNavigator {
    
    /**
     * Push a [View] to the top.
     */
    public abstract void push(@org.jetbrains.annotations.NotNull
    android.view.View view);
    
    /**
     * Pop the current view. Will not pop if the current view is the root.
     */
    public abstract void pop();
    
    /**
     * Get the top level [View].
     */
    @org.jetbrains.annotations.Nullable
    public abstract android.view.View peek();
}