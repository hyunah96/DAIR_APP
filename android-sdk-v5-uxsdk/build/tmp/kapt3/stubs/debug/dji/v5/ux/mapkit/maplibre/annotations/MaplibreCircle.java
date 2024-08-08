package dji.v5.ux.mapkit.maplibre.annotations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 L2\u00020\u0001:\u0001LB\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00126\u0010\u0006\u001a2\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0000\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007\u00126\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0000\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u0007\u00a2\u0006\u0002\u0010\u0011J\r\u0010(\u001a\u00020\u0010H\u0000\u00a2\u0006\u0002\b)J\b\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020\bH\u0016J \u0010-\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00192\u0006\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u000200H\u0016J\b\u00102\u001a\u00020\bH\u0016J\b\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u000204H\u0016J\b\u00106\u001a\u00020\rH\u0016J\b\u00107\u001a\u00020\u0010H\u0016J\r\u00108\u001a\u00020\u0010H\u0000\u00a2\u0006\u0002\b9J\u0010\u0010:\u001a\u00020\u00102\u0006\u0010.\u001a\u00020+H\u0016J\u0018\u0010;\u001a\u00020\u00102\u0006\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u000200H\u0016J\u0010\u0010<\u001a\u00020\u00102\u0006\u0010=\u001a\u00020\bH\u0016J\u0010\u0010>\u001a\u00020\u00102\u0006\u0010/\u001a\u000200H\u0016J\u0010\u0010?\u001a\u00020\u00102\u0006\u0010=\u001a\u00020\bH\u0016J\u0010\u0010@\u001a\u00020\u00102\u0006\u0010A\u001a\u000204H\u0016J\u0010\u0010B\u001a\u00020\u00102\u0006\u0010C\u001a\u00020DH\u0002J\u0010\u0010E\u001a\u00020\u00102\u0006\u0010C\u001a\u00020DH\u0002J\u0010\u0010F\u001a\u00020\u00102\u0006\u0010G\u001a\u00020\rH\u0016J\u0010\u0010H\u001a\u00020\u00102\u0006\u0010I\u001a\u000204H\u0016J\b\u0010J\u001a\u00020KH\u0016R\u001b\u0010\u0012\u001a\u00020\u00138@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\n \u001a*\u0004\u0018\u00010\u00190\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020!8@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b\"\u0010#R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R>\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0000\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R>\u0010\u0006\u001a2\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0000\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010%\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\'\u0010\u0017\u001a\u0004\b&\u0010\u001e\u00a8\u0006M"}, d2 = {"Ldji/v5/ux/mapkit/maplibre/annotations/MaplibreCircle;", "Ldji/v5/ux/mapkit/core/models/annotations/DJICircle;", "mapboxMap", "Lcom/mapbox/mapboxsdk/maps/MapboxMap;", "options", "Ldji/v5/ux/mapkit/core/models/annotations/DJICircleOptions;", "onRemoveCircle", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "zindex", "circle", "", "onAddCircle", "polyline", "", "(Lcom/mapbox/mapboxsdk/maps/MapboxMap;Ldji/v5/ux/mapkit/core/models/annotations/DJICircleOptions;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "borderLayer", "Lcom/mapbox/mapboxsdk/style/layers/LineLayer;", "getBorderLayer$android_sdk_v5_uxsdk_debug", "()Lcom/mapbox/mapboxsdk/style/layers/LineLayer;", "borderLayer$delegate", "Lkotlin/Lazy;", "borderLineString", "Lcom/mapbox/geojson/LineString;", "kotlin.jvm.PlatformType", "borderSource", "Lcom/mapbox/mapboxsdk/style/sources/GeoJsonSource;", "getBorderSource", "()Lcom/mapbox/mapboxsdk/style/sources/GeoJsonSource;", "borderSource$delegate", "circleLayer", "Lcom/mapbox/mapboxsdk/style/layers/FillLayer;", "getCircleLayer$android_sdk_v5_uxsdk_debug", "()Lcom/mapbox/mapboxsdk/style/layers/FillLayer;", "circleLayer$delegate", "source", "getSource", "source$delegate", "clearCircle", "clearCircle$android_sdk_v5_uxsdk_debug", "getCenter", "Ldji/v5/ux/mapkit/core/models/DJILatLng;", "getFillColor", "getLineString", "center", "radius", "", "getRadius", "getStrokeColor", "getStrokeWidth", "", "getZIndex", "isVisible", "remove", "restore", "restore$android_sdk_v5_uxsdk_debug", "setCenter", "setCircle", "setFillColor", "color", "setRadius", "setStrokeColor", "setStrokeWidth", "strokeWidth", "setUpBorderSource", "style", "Lcom/mapbox/mapboxsdk/maps/Style;", "setUpCircleSource", "setVisible", "visible", "setZIndex", "zIndex", "toString", "", "Companion", "android-sdk-v5-uxsdk_debug"})
public final class MaplibreCircle implements dji.v5.ux.mapkit.core.models.annotations.DJICircle {
    private final com.mapbox.mapboxsdk.maps.MapboxMap mapboxMap = null;
    private final dji.v5.ux.mapkit.core.models.annotations.DJICircleOptions options = null;
    private final kotlin.jvm.functions.Function2<java.lang.Integer, dji.v5.ux.mapkit.maplibre.annotations.MaplibreCircle, java.lang.Boolean> onRemoveCircle = null;
    private final kotlin.jvm.functions.Function2<java.lang.Integer, dji.v5.ux.mapkit.maplibre.annotations.MaplibreCircle, kotlin.Unit> onAddCircle = null;
    private final com.mapbox.geojson.LineString borderLineString = null;
    private final kotlin.Lazy source$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy circleLayer$delegate = null;
    private final kotlin.Lazy borderSource$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy borderLayer$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.mapkit.maplibre.annotations.MaplibreCircle.Companion Companion = null;
    private static final java.lang.String TAG = "MapboxCircle";
    
    public MaplibreCircle(@org.jetbrains.annotations.NotNull
    com.mapbox.mapboxsdk.maps.MapboxMap mapboxMap, @org.jetbrains.annotations.NotNull
    dji.v5.ux.mapkit.core.models.annotations.DJICircleOptions options, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super dji.v5.ux.mapkit.maplibre.annotations.MaplibreCircle, java.lang.Boolean> onRemoveCircle, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super dji.v5.ux.mapkit.maplibre.annotations.MaplibreCircle, kotlin.Unit> onAddCircle) {
        super();
    }
    
    private final com.mapbox.mapboxsdk.style.sources.GeoJsonSource getSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.mapbox.mapboxsdk.style.layers.FillLayer getCircleLayer$android_sdk_v5_uxsdk_debug() {
        return null;
    }
    
    private final com.mapbox.mapboxsdk.style.sources.GeoJsonSource getBorderSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.mapbox.mapboxsdk.style.layers.LineLayer getBorderLayer$android_sdk_v5_uxsdk_debug() {
        return null;
    }
    
    @java.lang.Override
    public void remove() {
    }
    
    @java.lang.Override
    public void setVisible(boolean visible) {
    }
    
    @java.lang.Override
    public boolean isVisible() {
        return false;
    }
    
    @java.lang.Override
    public void setFillColor(int color) {
    }
    
    @java.lang.Override
    public int getFillColor() {
        return 0;
    }
    
    @java.lang.Override
    public void setStrokeColor(int color) {
    }
    
    @java.lang.Override
    public int getStrokeColor() {
        return 0;
    }
    
    @java.lang.Override
    public void setCircle(@org.jetbrains.annotations.NotNull
    dji.v5.ux.mapkit.core.models.DJILatLng center, double radius) {
    }
    
    public final void clearCircle$android_sdk_v5_uxsdk_debug() {
    }
    
    public final void restore$android_sdk_v5_uxsdk_debug() {
    }
    
    private final com.mapbox.geojson.LineString getLineString(dji.v5.ux.mapkit.core.models.DJILatLng center, double radius) {
        return null;
    }
    
    private final void setUpBorderSource(com.mapbox.mapboxsdk.maps.Style style) {
    }
    
    private final void setUpCircleSource(com.mapbox.mapboxsdk.maps.Style style) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dji.v5.ux.mapkit.core.models.DJILatLng getCenter() {
        return null;
    }
    
    @java.lang.Override
    public void setCenter(@org.jetbrains.annotations.NotNull
    dji.v5.ux.mapkit.core.models.DJILatLng center) {
    }
    
    @java.lang.Override
    public double getRadius() {
        return 0.0;
    }
    
    @java.lang.Override
    public void setRadius(double radius) {
    }
    
    @java.lang.Override
    public float getStrokeWidth() {
        return 0.0F;
    }
    
    @java.lang.Override
    public void setStrokeWidth(float strokeWidth) {
    }
    
    @java.lang.Override
    public float getZIndex() {
        return 0.0F;
    }
    
    @java.lang.Override
    public void setZIndex(float zIndex) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Ldji/v5/ux/mapkit/maplibre/annotations/MaplibreCircle$Companion;", "", "()V", "TAG", "", "android-sdk-v5-uxsdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}