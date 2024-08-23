package dji.v5.ux.mapkit.maplibre.annotations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 62\u00020\u0001:\u00016B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00126\u0010\u0006\u001a2\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0000\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007\u00126\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0000\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000f0\u0007\u00a2\u0006\u0002\u0010\u0010J\r\u0010\u001e\u001a\u00020\u000fH\u0000\u00a2\u0006\u0002\b\u001fJ\b\u0010 \u001a\u00020\bH\u0017J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0016J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020%H\u0016J\b\u0010\'\u001a\u00020\u000fH\u0016J\r\u0010(\u001a\u00020\u000fH\u0000\u00a2\u0006\u0002\b)J\u0012\u0010*\u001a\u00020\u000f2\b\b\u0001\u0010+\u001a\u00020\bH\u0016J\u0016\u0010,\u001a\u00020\u000f2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020#0.H\u0016J\u0010\u0010/\u001a\u00020\u000f2\u0006\u00100\u001a\u000201H\u0002J\u0010\u00102\u001a\u00020\u000f2\u0006\u00103\u001a\u00020%H\u0016J\u0010\u00104\u001a\u00020\u000f2\u0006\u00105\u001a\u00020%H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R>\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0000\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000f0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R>\u0010\u0006\u001a2\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0000\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001b\u0010\u001c\u00a8\u00067"}, d2 = {"Ldji/v5/ux/mapkit/maplibre/annotations/MaplibrePolyline;", "Ldji/v5/ux/mapkit/core/models/annotations/DJIPolyline;", "mapboxMap", "Lcom/mapbox/mapboxsdk/maps/MapboxMap;", "options", "Ldji/v5/ux/mapkit/core/models/annotations/DJIPolylineOptions;", "onRemovePolyline", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "zindex", "polyline", "", "onAddPolyline", "", "(Lcom/mapbox/mapboxsdk/maps/MapboxMap;Ldji/v5/ux/mapkit/core/models/annotations/DJIPolylineOptions;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "getOptions", "()Ldji/v5/ux/mapkit/core/models/annotations/DJIPolylineOptions;", "polylineLayer", "Lcom/mapbox/mapboxsdk/style/layers/LineLayer;", "getPolylineLayer$android_sdk_v5_uxsdk_debug", "()Lcom/mapbox/mapboxsdk/style/layers/LineLayer;", "polylineLayer$delegate", "Lkotlin/Lazy;", "source", "Lcom/mapbox/mapboxsdk/style/sources/GeoJsonSource;", "getSource", "()Lcom/mapbox/mapboxsdk/style/sources/GeoJsonSource;", "source$delegate", "clear", "clear$android_sdk_v5_uxsdk_debug", "getColor", "getPoints", "", "Ldji/v5/ux/mapkit/core/models/DJILatLng;", "getWidth", "", "getZIndex", "remove", "restore", "restore$android_sdk_v5_uxsdk_debug", "setColor", "color", "setPoints", "points", "", "setUpPolylineSource", "style", "Lcom/mapbox/mapboxsdk/maps/Style;", "setWidth", "width", "setZIndex", "zIndex", "Companion", "android-sdk-v5-uxsdk_debug"})
public final class MaplibrePolyline implements dji.v5.ux.mapkit.core.models.annotations.DJIPolyline {
    private final com.mapbox.mapboxsdk.maps.MapboxMap mapboxMap = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.mapkit.core.models.annotations.DJIPolylineOptions options = null;
    private final kotlin.jvm.functions.Function2<java.lang.Integer, dji.v5.ux.mapkit.maplibre.annotations.MaplibrePolyline, java.lang.Boolean> onRemovePolyline = null;
    private final kotlin.jvm.functions.Function2<java.lang.Integer, dji.v5.ux.mapkit.maplibre.annotations.MaplibrePolyline, kotlin.Unit> onAddPolyline = null;
    private final kotlin.Lazy source$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy polylineLayer$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.mapkit.maplibre.annotations.MaplibrePolyline.Companion Companion = null;
    private static final java.lang.String TAG = "MaplibrePolyline";
    
    public MaplibrePolyline(@org.jetbrains.annotations.NotNull
    com.mapbox.mapboxsdk.maps.MapboxMap mapboxMap, @org.jetbrains.annotations.NotNull
    dji.v5.ux.mapkit.core.models.annotations.DJIPolylineOptions options, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super dji.v5.ux.mapkit.maplibre.annotations.MaplibrePolyline, java.lang.Boolean> onRemovePolyline, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super dji.v5.ux.mapkit.maplibre.annotations.MaplibrePolyline, kotlin.Unit> onAddPolyline) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.mapkit.core.models.annotations.DJIPolylineOptions getOptions() {
        return null;
    }
    
    private final com.mapbox.mapboxsdk.style.sources.GeoJsonSource getSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.mapbox.mapboxsdk.style.layers.LineLayer getPolylineLayer$android_sdk_v5_uxsdk_debug() {
        return null;
    }
    
    @java.lang.Override
    public void remove() {
    }
    
    @java.lang.Override
    public void setWidth(float width) {
    }
    
    @java.lang.Override
    public float getWidth() {
        return 0.0F;
    }
    
    @java.lang.Override
    public void setPoints(@org.jetbrains.annotations.NotNull
    java.util.List<? extends dji.v5.ux.mapkit.core.models.DJILatLng> points) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<dji.v5.ux.mapkit.core.models.DJILatLng> getPoints() {
        return null;
    }
    
    @java.lang.Override
    public void setColor(@androidx.annotation.ColorInt
    int color) {
    }
    
    @androidx.annotation.ColorInt
    @java.lang.Override
    public int getColor() {
        return 0;
    }
    
    public final void clear$android_sdk_v5_uxsdk_debug() {
    }
    
    public final void restore$android_sdk_v5_uxsdk_debug() {
    }
    
    private final void setUpPolylineSource(com.mapbox.mapboxsdk.maps.Style style) {
    }
    
    @java.lang.Override
    public float getZIndex() {
        return 0.0F;
    }
    
    @java.lang.Override
    public void setZIndex(float zIndex) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Ldji/v5/ux/mapkit/maplibre/annotations/MaplibrePolyline$Companion;", "", "()V", "TAG", "", "android-sdk-v5-uxsdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}