package dji.v5.ux.core.ui.hsi;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010\r\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0007J\b\u0010\u000e\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Ldji/v5/ux/core/ui/hsi/FlashTimer;", "", "()V", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "listenerList", "", "Ldji/v5/ux/core/ui/hsi/FlashTimer$Listener;", "started", "", "addListener", "", "listener", "removeListener", "startFlash", "Listener", "android-sdk-v5-uxsdk_debug"})
public final class FlashTimer {
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.core.ui.hsi.FlashTimer INSTANCE = null;
    private static final io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable = null;
    private static final java.util.List<dji.v5.ux.core.ui.hsi.FlashTimer.Listener> listenerList = null;
    private static boolean started = false;
    
    private FlashTimer() {
        super();
    }
    
    @androidx.annotation.MainThread
    public final void addListener(@org.jetbrains.annotations.Nullable
    dji.v5.ux.core.ui.hsi.FlashTimer.Listener listener) {
    }
    
    @androidx.annotation.MainThread
    public final void removeListener(@org.jetbrains.annotations.Nullable
    dji.v5.ux.core.ui.hsi.FlashTimer.Listener listener) {
    }
    
    private final void startFlash() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Ldji/v5/ux/core/ui/hsi/FlashTimer$Listener;", "", "onValue", "", "show", "", "android-sdk-v5-uxsdk_debug"})
    public static abstract interface Listener {
        
        public abstract void onValue(boolean show);
    }
}