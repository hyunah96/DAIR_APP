package dji.v5.ux.mapkit.core.maps;

import java.lang.System;

/**
 * @author joe.yang@dji.com
 * @date 2019-10-17 15:36
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0016\u0010\u0005\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&\u00a8\u0006\b"}, d2 = {"Ldji/v5/ux/mapkit/core/maps/DJIInfoWindow;", "", "onCreate", "", "onDestroy", "setOnViewChangedListener", "listener", "Lkotlin/Function0;", "android-sdk-v5-uxsdk_debug"})
public abstract interface DJIInfoWindow {
    
    public abstract void setOnViewChangedListener(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> listener);
    
    public abstract void onCreate();
    
    public abstract void onDestroy();
}