package dji.v5.ux.core.communication;

import java.lang.System;

/**
 * Interface to be implemented by widgets for coupled 1:1 communication
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Ldji/v5/ux/core/communication/OnStateChangeCallback;", "T", "", "onStateChange", "", "state", "(Ljava/lang/Object;)V", "android-sdk-v5-uxsdk_debug"})
public abstract interface OnStateChangeCallback<T extends java.lang.Object> {
    
    /**
     * Called when the state has changed
     */
    public abstract void onStateChange(@org.jetbrains.annotations.Nullable
    T state);
}