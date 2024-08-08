package dji.v5.ux.mapkit.maplibre.annotations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 h2\u00020\u0001:\u0001hBU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00126\u0010\b\u001a2\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u0000\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\t\u00a2\u0006\u0002\u0010\u0010J\r\u0010@\u001a\u00020AH\u0000\u00a2\u0006\u0002\bBJ\b\u0010C\u001a\u00020AH\u0002J\b\u0010D\u001a\u00020AH\u0002J\u0010\u0010E\u001a\u00020F2\u0006\u0010\u0019\u001a\u00020GH\u0002J\b\u0010H\u001a\u00020IH\u0016J\n\u0010J\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010K\u001a\u00020AH\u0016J\b\u0010L\u001a\u00020\u000fH\u0016J\b\u0010M\u001a\u00020\u000fH\u0016J\b\u0010N\u001a\u00020\u000fH\u0016J\b\u0010O\u001a\u00020AH\u0016J\r\u0010P\u001a\u00020AH\u0000\u00a2\u0006\u0002\bQJ\u0018\u0010R\u001a\u00020A2\u0006\u0010S\u001a\u0002072\u0006\u0010T\u001a\u000207H\u0016J\u0010\u0010U\u001a\u00020A2\u0006\u0010V\u001a\u00020\u000fH\u0016J\u0012\u0010W\u001a\u00020A2\b\u0010X\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010Y\u001a\u00020A2\u0006\u0010Z\u001a\u00020IH\u0016J\u0010\u0010[\u001a\u00020A2\u0006\u0010\\\u001a\u000207H\u0016J\u0012\u0010]\u001a\u00020A2\b\u0010?\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010^\u001a\u00020A2\u0006\u0010_\u001a\u00020`2\b\u0010a\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010b\u001a\u00020A2\u0006\u0010_\u001a\u00020`H\u0002J\u0010\u0010c\u001a\u00020A2\u0006\u0010d\u001a\u00020\u000fH\u0016J\b\u0010e\u001a\u00020AH\u0016J\b\u0010f\u001a\u00020\u0016H\u0016J\u0012\u0010g\u001a\u00020A2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001b\u0010\"\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\u001b\u0010\'\u001a\u00020(8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b)\u0010*R\u001b\u0010,\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b-\u0010$R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u00101\u001a\u00020(8@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\b3\u0010&\u001a\u0004\b2\u0010*R\u0014\u00104\u001a\u00020\u0016X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010$R>\u0010\b\u001a2\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u0000\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u00108\u001a\u0002098BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b<\u0010&\u001a\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020\u0016X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010$R\u0010\u0010?\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006i"}, d2 = {"Ldji/v5/ux/mapkit/maplibre/annotations/MaplibreMarker;", "Ldji/v5/ux/mapkit/core/models/annotations/DJIMarker;", "context", "Landroid/content/Context;", "mapboxMap", "Lcom/mapbox/mapboxsdk/maps/MapboxMap;", "options", "Ldji/v5/ux/mapkit/core/models/annotations/DJIMarkerOptions;", "onRemoveMarker", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "zindex", "marker", "", "(Landroid/content/Context;Lcom/mapbox/mapboxsdk/maps/MapboxMap;Ldji/v5/ux/mapkit/core/models/annotations/DJIMarkerOptions;Lkotlin/jvm/functions/Function2;)V", "descriptor", "Ldji/v5/ux/mapkit/core/models/DJIBitmapDescriptor;", "kotlin.jvm.PlatformType", "draggable", "iconId", "", "value", "Ldji/v5/ux/mapkit/core/maps/DJIInfoWindow;", "infoWindow", "setInfoWindow", "(Ldji/v5/ux/mapkit/core/maps/DJIInfoWindow;)V", "infoWindowAdapter", "Ldji/v5/ux/mapkit/core/maps/DJIMap$InfoWindowAdapter;", "getInfoWindowAdapter$android_sdk_v5_uxsdk_debug", "()Ldji/v5/ux/mapkit/core/maps/DJIMap$InfoWindowAdapter;", "setInfoWindowAdapter$android_sdk_v5_uxsdk_debug", "(Ldji/v5/ux/mapkit/core/maps/DJIMap$InfoWindowAdapter;)V", "infoWindowIconId", "getInfoWindowIconId", "()Ljava/lang/String;", "infoWindowIconId$delegate", "Lkotlin/Lazy;", "infoWindowLayer", "Lcom/mapbox/mapboxsdk/style/layers/SymbolLayer;", "getInfoWindowLayer", "()Lcom/mapbox/mapboxsdk/style/layers/SymbolLayer;", "infoWindowLayer$delegate", "infoWindowLayerId", "getInfoWindowLayerId", "infoWindowLayerId$delegate", "markerIconHeight", "markerIconWidth", "markerLayer", "getMarkerLayer$android_sdk_v5_uxsdk_debug", "markerLayer$delegate", "markerLayerId", "getMarkerLayerId$android_sdk_v5_uxsdk_debug", "pixelRatio", "", "source", "Lcom/mapbox/mapboxsdk/style/sources/GeoJsonSource;", "getSource", "()Lcom/mapbox/mapboxsdk/style/sources/GeoJsonSource;", "source$delegate", "sourceFeatureId", "getSourceFeatureId$android_sdk_v5_uxsdk_debug", "title", "clearMarker", "", "clearMarker$android_sdk_v5_uxsdk_debug", "createInfoWindowLayer", "destroyInfoWindowLayer", "generateInfoWindowBitmap", "Landroid/graphics/Bitmap;", "Landroid/view/View;", "getPosition", "Ldji/v5/ux/mapkit/core/models/DJILatLng;", "getTitle", "hideInfoWindow", "isDraggable", "isInfoWindowShown", "isVisible", "remove", "restore", "restore$android_sdk_v5_uxsdk_debug", "setAnchor", "u", "v", "setDraggable", "b", "setIcon", "bitmap", "setPosition", "latLng", "setRotation", "rotation", "setTitle", "setUpMarkerIcon", "style", "Lcom/mapbox/mapboxsdk/maps/Style;", "icon", "setUpSource", "setVisible", "visible", "showInfoWindow", "toString", "updateInfoWindow", "Companion", "android-sdk-v5-uxsdk_debug"})
public final class MaplibreMarker extends dji.v5.ux.mapkit.core.models.annotations.DJIMarker {
    private final android.content.Context context = null;
    private final com.mapbox.mapboxsdk.maps.MapboxMap mapboxMap = null;
    private final dji.v5.ux.mapkit.core.models.annotations.DJIMarkerOptions options = null;
    private final kotlin.jvm.functions.Function2<java.lang.Integer, dji.v5.ux.mapkit.maplibre.annotations.MaplibreMarker, java.lang.Boolean> onRemoveMarker = null;
    private final kotlin.Lazy source$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy markerLayer$delegate = null;
    private final kotlin.Lazy infoWindowLayer$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String sourceFeatureId = null;
    private final java.lang.String iconId = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String markerLayerId = null;
    private dji.v5.ux.mapkit.core.models.DJIBitmapDescriptor descriptor;
    private int markerIconWidth = 0;
    private int markerIconHeight = 0;
    private final float pixelRatio = 0.0F;
    private final kotlin.Lazy infoWindowIconId$delegate = null;
    private final kotlin.Lazy infoWindowLayerId$delegate = null;
    @org.jetbrains.annotations.Nullable
    private dji.v5.ux.mapkit.core.maps.DJIMap.InfoWindowAdapter infoWindowAdapter;
    private dji.v5.ux.mapkit.core.maps.DJIInfoWindow infoWindow;
    private java.lang.String title;
    private boolean draggable;
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.mapkit.maplibre.annotations.MaplibreMarker.Companion Companion = null;
    private static final java.lang.String TAG = "MaplibreMarker";
    
    public MaplibreMarker(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.mapbox.mapboxsdk.maps.MapboxMap mapboxMap, @org.jetbrains.annotations.NotNull
    dji.v5.ux.mapkit.core.models.annotations.DJIMarkerOptions options, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super dji.v5.ux.mapkit.maplibre.annotations.MaplibreMarker, java.lang.Boolean> onRemoveMarker) {
        super();
    }
    
    private final com.mapbox.mapboxsdk.style.sources.GeoJsonSource getSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.mapbox.mapboxsdk.style.layers.SymbolLayer getMarkerLayer$android_sdk_v5_uxsdk_debug() {
        return null;
    }
    
    private final com.mapbox.mapboxsdk.style.layers.SymbolLayer getInfoWindowLayer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSourceFeatureId$android_sdk_v5_uxsdk_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMarkerLayerId$android_sdk_v5_uxsdk_debug() {
        return null;
    }
    
    private final java.lang.String getInfoWindowIconId() {
        return null;
    }
    
    private final java.lang.String getInfoWindowLayerId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final dji.v5.ux.mapkit.core.maps.DJIMap.InfoWindowAdapter getInfoWindowAdapter$android_sdk_v5_uxsdk_debug() {
        return null;
    }
    
    public final void setInfoWindowAdapter$android_sdk_v5_uxsdk_debug(@org.jetbrains.annotations.Nullable
    dji.v5.ux.mapkit.core.maps.DJIMap.InfoWindowAdapter p0) {
    }
    
    private final void setInfoWindow(dji.v5.ux.mapkit.core.maps.DJIInfoWindow value) {
    }
    
    @java.lang.Override
    public void setPosition(@org.jetbrains.annotations.NotNull
    dji.v5.ux.mapkit.core.models.DJILatLng latLng) {
    }
    
    @java.lang.Override
    public void setRotation(float rotation) {
    }
    
    @java.lang.Override
    public void setIcon(@org.jetbrains.annotations.Nullable
    dji.v5.ux.mapkit.core.models.DJIBitmapDescriptor bitmap) {
    }
    
    @java.lang.Override
    public void setAnchor(float u, float v) {
    }
    
    @java.lang.Override
    public void setTitle(@org.jetbrains.annotations.Nullable
    java.lang.String title) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dji.v5.ux.mapkit.core.models.DJILatLng getPosition() {
        return null;
    }
    
    @java.lang.Override
    public void setVisible(boolean visible) {
    }
    
    @java.lang.Override
    public boolean isVisible() {
        return false;
    }
    
    @java.lang.Override
    public void showInfoWindow() {
    }
    
    @java.lang.Override
    public void hideInfoWindow() {
    }
    
    @java.lang.Override
    public boolean isInfoWindowShown() {
        return false;
    }
    
    @java.lang.Override
    public void remove() {
    }
    
    @java.lang.Override
    public void setDraggable(boolean b) {
    }
    
    @java.lang.Override
    public boolean isDraggable() {
        return false;
    }
    
    /**
     * 地图 style 切换后，将资源加载回来
     */
    public final void restore$android_sdk_v5_uxsdk_debug() {
    }
    
    /**
     * 地图 style 切换前，将资源 remove 掉
     */
    public final void clearMarker$android_sdk_v5_uxsdk_debug() {
    }
    
    private final void createInfoWindowLayer() {
    }
    
    private final void destroyInfoWindowLayer() {
    }
    
    private final android.graphics.Bitmap generateInfoWindowBitmap(android.view.View infoWindow) {
        return null;
    }
    
    private final void setUpMarkerIcon(com.mapbox.mapboxsdk.maps.Style style, dji.v5.ux.mapkit.core.models.DJIBitmapDescriptor icon) {
    }
    
    private final void setUpSource(com.mapbox.mapboxsdk.maps.Style style) {
    }
    
    private final void updateInfoWindow(dji.v5.ux.mapkit.core.maps.DJIInfoWindow infoWindow) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Ldji/v5/ux/mapkit/maplibre/annotations/MaplibreMarker$Companion;", "", "()V", "TAG", "", "android-sdk-v5-uxsdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}