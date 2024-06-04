package dji.v5.ux.core.popover;

import java.lang.System;

/**
 * 把View的按键事件透传给Activity
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Ldji/v5/ux/core/popover/DispatchViewKeyEventToActivityListener;", "Landroid/view/View$OnKeyListener;", "()V", "keyDown", "", "needHandle", "onKey", "v", "Landroid/view/View;", "keyCode", "", "event", "Landroid/view/KeyEvent;", "android-sdk-v5-uxsdk_debug"})
public class DispatchViewKeyEventToActivityListener implements android.view.View.OnKeyListener {
    private boolean needHandle = false;
    private boolean keyDown = false;
    
    public DispatchViewKeyEventToActivityListener() {
        super();
    }
    
    @java.lang.Override
    public boolean onKey(@org.jetbrains.annotations.Nullable
    android.view.View v, int keyCode, @org.jetbrains.annotations.NotNull
    android.view.KeyEvent event) {
        return false;
    }
}