package dji.v5.ux.core.ui.hsi;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u000b\u001a\u00020\fJ\r\u0010\r\u001a\u00028\u0000H$\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0011R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Ldji/v5/ux/core/ui/hsi/RecyclerPool;", "T", "", "poolSize", "", "(I)V", "mList", "", "mPoolSize", "acquire", "()Ljava/lang/Object;", "clear", "", "create", "recycle", "", "t", "(Ljava/lang/Object;)Z", "android-sdk-v5-uxsdk_debug"})
public abstract class RecyclerPool<T extends java.lang.Object> {
    private final int mPoolSize = 0;
    private final java.util.List<T> mList = null;
    
    public RecyclerPool(int poolSize) {
        super();
    }
    
    @kotlin.jvm.Synchronized
    public final synchronized T acquire() {
        return null;
    }
    
    protected abstract T create();
    
    @kotlin.jvm.Synchronized
    public final synchronized boolean recycle(T t) {
        return false;
    }
    
    @kotlin.jvm.Synchronized
    public final synchronized void clear() {
    }
}