package dji.v5.ux.core.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Ldji/v5/ux/core/util/ViewIDGenerator;", "", "()V", "nextGeneratedID", "Ljava/util/concurrent/atomic/AtomicInteger;", "generateViewId", "", "android-sdk-v5-uxsdk_debug"})
public final class ViewIDGenerator {
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.core.util.ViewIDGenerator INSTANCE = null;
    private static final java.util.concurrent.atomic.AtomicInteger nextGeneratedID = null;
    
    private ViewIDGenerator() {
        super();
    }
    
    /**
     * Generates a unique ID that can be assigned to a @see[View].
     * Backwards compatible to any Android version.
     */
    public final int generateViewId() {
        return 0;
    }
}