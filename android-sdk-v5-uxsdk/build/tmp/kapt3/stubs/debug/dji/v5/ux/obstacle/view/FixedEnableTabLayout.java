package dji.v5.ux.obstacle.view;

import java.lang.System;

/**
 * TabLayout 设置 enable 为 false 之后还可以点击，在这里进行修改
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016\u00a8\u0006\r"}, d2 = {"Ldji/v5/ux/obstacle/view/FixedEnableTabLayout;", "Lcom/google/android/material/tabs/TabLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "android-sdk-v5-uxsdk_debug"})
public final class FixedEnableTabLayout extends com.google.android.material.tabs.TabLayout {
    
    @kotlin.jvm.JvmOverloads
    public FixedEnableTabLayout(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public FixedEnableTabLayout(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public FixedEnableTabLayout(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    @java.lang.Override
    public boolean onInterceptTouchEvent(@org.jetbrains.annotations.Nullable
    android.view.MotionEvent ev) {
        return false;
    }
}