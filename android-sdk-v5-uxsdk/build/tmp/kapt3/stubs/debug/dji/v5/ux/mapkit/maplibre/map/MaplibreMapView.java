package dji.v5.ux.mapkit.maplibre.map;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0002\u00a8\u0006\u000e"}, d2 = {"Ldji/v5/ux/mapkit/maplibre/map/MaplibreMapView;", "Lcom/mapbox/mapboxsdk/maps/MapView;", "Ldji/v5/ux/mapkit/core/maps/DJIMapViewInternal;", "context", "Landroid/content/Context;", "options", "Lcom/mapbox/mapboxsdk/maps/MapboxMapOptions;", "(Landroid/content/Context;Lcom/mapbox/mapboxsdk/maps/MapboxMapOptions;)V", "getDJIMapAsync", "", "callback", "Ldji/v5/ux/mapkit/core/maps/DJIMapView$OnDJIMapReadyCallback;", "getMapboxStyle", "", "android-sdk-v5-uxsdk_debug"})
public final class MaplibreMapView extends com.mapbox.mapboxsdk.maps.MapView implements dji.v5.ux.mapkit.core.maps.DJIMapViewInternal {
    
    @kotlin.jvm.JvmOverloads
    public MaplibreMapView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public MaplibreMapView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.mapbox.mapboxsdk.maps.MapboxMapOptions options) {
        super(null);
    }
    
    @java.lang.Override
    public void getDJIMapAsync(@org.jetbrains.annotations.Nullable
    dji.v5.ux.mapkit.core.maps.DJIMapView.OnDJIMapReadyCallback callback) {
    }
    
    private final java.lang.String getMapboxStyle() {
        return null;
    }
}