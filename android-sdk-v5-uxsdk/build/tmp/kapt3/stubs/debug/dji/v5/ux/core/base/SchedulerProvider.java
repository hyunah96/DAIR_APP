package dji.v5.ux.core.base;

import java.lang.System;

/**
 * A singleton class is used throughout the UXSDK for getting schedulers.
 * The class provides an option to inject custom schedulers using [SchedulerProviderInterface]
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\u000bH\u0007J\b\u0010\r\u001a\u00020\u000bH\u0007R&\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u000e"}, d2 = {"Ldji/v5/ux/core/base/SchedulerProvider;", "", "()V", "scheduler", "Ldji/v5/ux/core/base/SchedulerProviderInterface;", "getScheduler$annotations", "getScheduler", "()Ldji/v5/ux/core/base/SchedulerProviderInterface;", "setScheduler", "(Ldji/v5/ux/core/base/SchedulerProviderInterface;)V", "computation", "Lio/reactivex/rxjava3/core/Scheduler;", "io", "ui", "android-sdk-v5-uxsdk_debug"})
public final class SchedulerProvider {
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.core.base.SchedulerProvider INSTANCE = null;
    
    /**
     * Custom scheduler to be used instead of default schedulers
     */
    @org.jetbrains.annotations.Nullable
    @kotlin.jvm.Volatile
    private static volatile dji.v5.ux.core.base.SchedulerProviderInterface scheduler;
    
    private SchedulerProvider() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public static final dji.v5.ux.core.base.SchedulerProviderInterface getScheduler() {
        return null;
    }
    
    /**
     * Custom scheduler to be used instead of default schedulers
     */
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    public static void getScheduler$annotations() {
    }
    
    public static final void setScheduler(@org.jetbrains.annotations.Nullable
    dji.v5.ux.core.base.SchedulerProviderInterface p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmStatic
    public static final io.reactivex.rxjava3.core.Scheduler io() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmStatic
    public static final io.reactivex.rxjava3.core.Scheduler computation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmStatic
    public static final io.reactivex.rxjava3.core.Scheduler ui() {
        return null;
    }
}