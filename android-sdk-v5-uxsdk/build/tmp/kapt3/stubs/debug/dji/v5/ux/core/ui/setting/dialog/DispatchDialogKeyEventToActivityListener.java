package dji.v5.ux.core.ui.setting.dialog;

import java.lang.System;

/**
 * 把对话框的按钮事件传给Activity
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002J\u001c\u0010\f\u001a\u00020\b2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\"\u0010\u000f\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000eH\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Ldji/v5/ux/core/ui/setting/dialog/DispatchDialogKeyEventToActivityListener;", "Landroid/content/DialogInterface$OnKeyListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "keyDown", "", "needHandle", "contextToActivity", "Landroid/app/Activity;", "dispatchKeyEvent", "keyEvent", "Landroid/view/KeyEvent;", "onKey", "dialog", "Landroid/content/DialogInterface;", "keyCode", "", "event", "android-sdk-v5-uxsdk_debug"})
public class DispatchDialogKeyEventToActivityListener implements android.content.DialogInterface.OnKeyListener {
    @org.jetbrains.annotations.Nullable
    private final android.content.Context context = null;
    private boolean needHandle = false;
    private boolean keyDown = false;
    
    public DispatchDialogKeyEventToActivityListener(@org.jetbrains.annotations.Nullable
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.content.Context getContext() {
        return null;
    }
    
    @java.lang.Override
    public boolean onKey(@org.jetbrains.annotations.Nullable
    android.content.DialogInterface dialog, int keyCode, @org.jetbrains.annotations.NotNull
    android.view.KeyEvent event) {
        return false;
    }
    
    private final boolean dispatchKeyEvent(android.content.Context context, android.view.KeyEvent keyEvent) {
        return false;
    }
    
    private final android.app.Activity contextToActivity(android.content.Context context) {
        return null;
    }
}