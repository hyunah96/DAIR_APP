package dji.v5.ux.mapkit.maplibre.map;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00f4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 b2\u00020\u0001:\u0002bcB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000bH\u0002J\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0018\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0012\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\'H\u0016J\u0014\u0010(\u001a\u0004\u0018\u00010)2\b\u0010\u001f\u001a\u0004\u0018\u00010*H\u0016J\u0010\u0010+\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020,H\u0016J\u0012\u0010-\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001f\u001a\u00020.H\u0016J\u0018\u0010/\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u0014H\u0002J\u0010\u00101\u001a\u00020)2\u0006\u0010\u001f\u001a\u00020*H\u0016J\u0010\u00102\u001a\u00020\u00192\u0006\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u00020\u0019H\u0016J\b\u00106\u001a\u000207H\u0016J\b\u00108\u001a\u00020\u0003H\u0016J\b\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020\u0019H\u0002J\u0010\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0002J\u0010\u0010B\u001a\u00020?2\u0006\u0010C\u001a\u00020DH\u0002J\u0010\u0010E\u001a\u00020?2\u0006\u0010C\u001a\u00020DH\u0002J\u0018\u0010F\u001a\u00020?2\u0006\u0010G\u001a\u00020\u00072\u0006\u0010H\u001a\u00020IH\u0002J\u0010\u0010J\u001a\u00020\u00192\u0006\u00103\u001a\u000204H\u0016J\u0018\u0010K\u001a\u00020?2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u001a\u0010L\u001a\u00020\u00192\u0006\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010PH\u0002J\u0010\u0010Q\u001a\u00020\u00192\u0006\u0010R\u001a\u00020\u000fH\u0016J\u0010\u0010S\u001a\u00020\u00192\u0006\u0010T\u001a\u00020UH\u0016J\u001a\u0010S\u001a\u00020\u00192\u0006\u0010T\u001a\u00020U2\b\u0010O\u001a\u0004\u0018\u00010PH\u0016J\u0010\u0010S\u001a\u00020\u00192\u0006\u0010T\u001a\u00020\u001bH\u0016J\u0010\u0010V\u001a\u00020\u00192\u0006\u0010W\u001a\u00020XH\u0016J%\u0010Y\u001a\u00020\u0019\"\u0004\b\u0000\u0010Z*\b\u0012\u0004\u0012\u0002HZ0\u00162\u0006\u0010[\u001a\u0002HZH\u0002\u00a2\u0006\u0002\u0010\\J/\u0010Y\u001a\u00020\u0019\"\u0004\b\u0000\u0010Z*\u0012\u0012\u0004\u0012\u0002HZ0\nj\b\u0012\u0004\u0012\u0002HZ`]2\u0006\u0010[\u001a\u0002HZH\u0002\u00a2\u0006\u0002\u0010^J%\u0010_\u001a\u00020?\"\u0004\b\u0000\u0010Z*\b\u0012\u0004\u0012\u0002HZ0\u00162\u0006\u0010[\u001a\u0002HZH\u0002\u00a2\u0006\u0002\u0010`J/\u0010_\u001a\u00020?\"\u0004\b\u0000\u0010Z*\u0012\u0012\u0004\u0012\u0002HZ0\nj\b\u0012\u0004\u0012\u0002HZ`]2\u0006\u0010[\u001a\u0002HZH\u0002\u00a2\u0006\u0002\u0010aR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006d"}, d2 = {"Ldji/v5/ux/mapkit/maplibre/map/MaplibreMapDelegateKt;", "Ldji/v5/ux/mapkit/core/maps/DJIBaseMap;", "mapboxMap", "Lcom/mapbox/mapboxsdk/maps/MapboxMap;", "context", "Landroid/content/Context;", "mapView", "Landroid/view/View;", "(Lcom/mapbox/mapboxsdk/maps/MapboxMap;Landroid/content/Context;Landroid/view/View;)V", "circleSet", "Ljava/util/HashSet;", "Ldji/v5/ux/mapkit/maplibre/annotations/MaplibreCircle;", "currentSelectedMarker", "Ldji/v5/ux/mapkit/maplibre/annotations/MaplibreMarker;", "infoWindowAdapter", "Ldji/v5/ux/mapkit/core/maps/DJIMap$InfoWindowAdapter;", "markerSet", "polygonSet", "Ldji/v5/ux/mapkit/maplibre/annotations/MaplibrePolygon;", "polylineSet", "Ldji/v5/ux/mapkit/maplibre/annotations/MaplibrePolyline;", "sortedLayerWithZindex", "Ljava/util/TreeSet;", "Ldji/v5/ux/mapkit/maplibre/map/MaplibreMapDelegateKt$LayerWithZindex;", "addCircleAtZIndex", "", "zindex", "", "circle", "addGroupCircle", "Ldji/v5/ux/mapkit/core/models/annotations/DJIGroupCircle;", "options", "Ldji/v5/ux/mapkit/core/models/annotations/DJIGroupCircleOptions;", "addLayer", "layer", "Lcom/mapbox/mapboxsdk/style/layers/Layer;", "addMarker", "Ldji/v5/ux/mapkit/core/models/annotations/DJIMarker;", "markerOptions", "Ldji/v5/ux/mapkit/core/models/annotations/DJIMarkerOptions;", "addMarkerCircle", "Ldji/v5/ux/mapkit/core/models/annotations/DJICircle;", "Ldji/v5/ux/mapkit/core/models/annotations/DJICircleOptions;", "addPolygon", "Ldji/v5/ux/mapkit/core/models/annotations/DJIPolygonOptions;", "addPolyline", "Ldji/v5/ux/mapkit/core/models/annotations/DJIPolylineOptions;", "addPolylineAtZIndex", "polyline", "addSingleCircle", "animateCamera", "cameraUpdate", "Ldji/v5/ux/mapkit/core/camera/DJICameraUpdate;", "clear", "getCameraPosition", "Ldji/v5/ux/mapkit/core/models/DJICameraPosition;", "getMap", "getProjection", "Ldji/v5/ux/mapkit/maplibre/map/MProjection;", "getUiSettings", "Ldji/v5/ux/mapkit/maplibre/map/MUiSettings;", "handleCameraMove", "handleClickIcon", "", "screenPoint", "Landroid/graphics/PointF;", "handleClickMap", "latLng", "Lcom/mapbox/mapboxsdk/geometry/LatLng;", "handleLongClickMap", "handleTouch", "v", "motionEvent", "Landroid/view/MotionEvent;", "moveCamera", "removeLayer", "restoreResources", "style", "Lcom/mapbox/mapboxsdk/maps/Style;", "listener", "Ldji/v5/ux/mapkit/core/callback/OnMapTypeLoadedListener;", "setInfoWindowAdapter", "adapter", "setMapType", "type", "Ldji/v5/ux/mapkit/core/maps/DJIMap$MapType;", "snapshot", "callback", "Ldji/v5/ux/mapkit/core/callback/MapScreenShotListener;", "addAndLog", "T", "e", "(Ljava/util/TreeSet;Ljava/lang/Object;)V", "Lkotlin/collections/HashSet;", "(Ljava/util/HashSet;Ljava/lang/Object;)V", "removeAndLog", "(Ljava/util/TreeSet;Ljava/lang/Object;)Z", "(Ljava/util/HashSet;Ljava/lang/Object;)Z", "Companion", "LayerWithZindex", "android-sdk-v5-uxsdk_debug"})
public final class MaplibreMapDelegateKt extends dji.v5.ux.mapkit.core.maps.DJIBaseMap {
    private final com.mapbox.mapboxsdk.maps.MapboxMap mapboxMap = null;
    private final android.content.Context context = null;
    private dji.v5.ux.mapkit.core.maps.DJIMap.InfoWindowAdapter infoWindowAdapter;
    private dji.v5.ux.mapkit.maplibre.annotations.MaplibreMarker currentSelectedMarker;
    private final java.util.HashSet<dji.v5.ux.mapkit.maplibre.annotations.MaplibreMarker> markerSet = null;
    private final java.util.HashSet<dji.v5.ux.mapkit.maplibre.annotations.MaplibreCircle> circleSet = null;
    private final java.util.HashSet<dji.v5.ux.mapkit.maplibre.annotations.MaplibrePolygon> polygonSet = null;
    private final java.util.HashSet<dji.v5.ux.mapkit.maplibre.annotations.MaplibrePolyline> polylineSet = null;
    private final java.util.TreeSet<dji.v5.ux.mapkit.maplibre.map.MaplibreMapDelegateKt.LayerWithZindex> sortedLayerWithZindex = null;
    @org.jetbrains.annotations.NotNull
    private static final dji.v5.ux.mapkit.maplibre.map.MaplibreMapDelegateKt.Companion Companion = null;
    @java.lang.Deprecated
    private static final java.lang.String TAG = "MaplibreMapDelegateKt";
    
    public MaplibreMapDelegateKt(@org.jetbrains.annotations.NotNull
    com.mapbox.mapboxsdk.maps.MapboxMap mapboxMap, @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.view.View mapView) {
        super();
    }
    
    private final <T extends java.lang.Object>void addAndLog(java.util.HashSet<T> $this$addAndLog, T e) {
    }
    
    private final <T extends java.lang.Object>boolean removeAndLog(java.util.HashSet<T> $this$removeAndLog, T e) {
        return false;
    }
    
    private final <T extends java.lang.Object>void addAndLog(java.util.TreeSet<T> $this$addAndLog, T e) {
    }
    
    private final <T extends java.lang.Object>boolean removeAndLog(java.util.TreeSet<T> $this$removeAndLog, T e) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public dji.v5.ux.mapkit.core.models.annotations.DJIMarker addMarker(@org.jetbrains.annotations.NotNull
    dji.v5.ux.mapkit.core.models.annotations.DJIMarkerOptions markerOptions) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public dji.v5.ux.mapkit.core.models.annotations.DJICircle addMarkerCircle(@org.jetbrains.annotations.Nullable
    dji.v5.ux.mapkit.core.models.annotations.DJICircleOptions options) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public dji.v5.ux.mapkit.core.models.annotations.DJIGroupCircle addGroupCircle(@org.jetbrains.annotations.Nullable
    dji.v5.ux.mapkit.core.models.annotations.DJIGroupCircleOptions options) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.mapbox.mapboxsdk.maps.MapboxMap getMap() {
        return null;
    }
    
    @java.lang.Override
    public void animateCamera(@org.jetbrains.annotations.NotNull
    dji.v5.ux.mapkit.core.camera.DJICameraUpdate cameraUpdate) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dji.v5.ux.mapkit.core.models.DJICameraPosition getCameraPosition() {
        return null;
    }
    
    @java.lang.Override
    public void moveCamera(@org.jetbrains.annotations.NotNull
    dji.v5.ux.mapkit.core.camera.DJICameraUpdate cameraUpdate) {
    }
    
    @java.lang.Override
    public void setInfoWindowAdapter(@org.jetbrains.annotations.NotNull
    dji.v5.ux.mapkit.core.maps.DJIMap.InfoWindowAdapter adapter) {
    }
    
    @java.lang.Override
    public void setMapType(@org.jetbrains.annotations.NotNull
    dji.v5.ux.mapkit.core.maps.DJIMap.MapType type) {
    }
    
    @java.lang.Override
    public void setMapType(@org.jetbrains.annotations.NotNull
    dji.v5.ux.mapkit.core.maps.DJIMap.MapType type, @org.jetbrains.annotations.Nullable
    dji.v5.ux.mapkit.core.callback.OnMapTypeLoadedListener listener) {
    }
    
    private final void restoreResources(com.mapbox.mapboxsdk.maps.Style style, dji.v5.ux.mapkit.core.callback.OnMapTypeLoadedListener listener) {
    }
    
    @java.lang.Override
    public void setMapType(int type) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public dji.v5.ux.mapkit.maplibre.annotations.MaplibrePolyline addPolyline(@org.jetbrains.annotations.NotNull
    dji.v5.ux.mapkit.core.models.annotations.DJIPolylineOptions options) {
        return null;
    }
    
    private final void addPolylineAtZIndex(int zindex, dji.v5.ux.mapkit.maplibre.annotations.MaplibrePolyline polyline) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dji.v5.ux.mapkit.maplibre.annotations.MaplibrePolygon addPolygon(@org.jetbrains.annotations.NotNull
    dji.v5.ux.mapkit.core.models.annotations.DJIPolygonOptions options) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dji.v5.ux.mapkit.core.models.annotations.DJICircle addSingleCircle(@org.jetbrains.annotations.NotNull
    dji.v5.ux.mapkit.core.models.annotations.DJICircleOptions options) {
        return null;
    }
    
    private final void addCircleAtZIndex(int zindex, dji.v5.ux.mapkit.maplibre.annotations.MaplibreCircle circle) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dji.v5.ux.mapkit.maplibre.map.MUiSettings getUiSettings() {
        return null;
    }
    
    @java.lang.Override
    public void snapshot(@org.jetbrains.annotations.NotNull
    dji.v5.ux.mapkit.core.callback.MapScreenShotListener callback) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dji.v5.ux.mapkit.maplibre.map.MProjection getProjection() {
        return null;
    }
    
    @java.lang.Override
    public void clear() {
    }
    
    private final void addLayer(com.mapbox.mapboxsdk.style.layers.Layer layer, int zindex) {
    }
    
    private final boolean removeLayer(com.mapbox.mapboxsdk.style.layers.Layer layer, int zindex) {
        return false;
    }
    
    private final boolean handleClickIcon(android.graphics.PointF screenPoint) {
        return false;
    }
    
    private final boolean handleClickMap(com.mapbox.mapboxsdk.geometry.LatLng latLng) {
        return false;
    }
    
    private final boolean handleLongClickMap(com.mapbox.mapboxsdk.geometry.LatLng latLng) {
        return false;
    }
    
    private final boolean handleTouch(android.view.View v, android.view.MotionEvent motionEvent) {
        return false;
    }
    
    private final void handleCameraMove() {
    }
    
    /**
     * 因为 addLayer 只支持 layer，不支持 layer id，因此这里只能保存 layer
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00d6\u0001J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Ldji/v5/ux/mapkit/maplibre/map/MaplibreMapDelegateKt$LayerWithZindex;", "", "layer", "Lcom/mapbox/mapboxsdk/style/layers/Layer;", "zindex", "", "(Lcom/mapbox/mapboxsdk/style/layers/Layer;I)V", "getLayer", "()Lcom/mapbox/mapboxsdk/style/layers/Layer;", "getZindex", "()I", "compareTo", "other", "component1", "component2", "copy", "equals", "", "", "hashCode", "toString", "", "android-sdk-v5-uxsdk_debug"})
    static final class LayerWithZindex implements java.lang.Comparable<dji.v5.ux.mapkit.maplibre.map.MaplibreMapDelegateKt.LayerWithZindex> {
        @org.jetbrains.annotations.NotNull
        private final com.mapbox.mapboxsdk.style.layers.Layer layer = null;
        private final int zindex = 0;
        
        /**
         * 因为 addLayer 只支持 layer，不支持 layer id，因此这里只能保存 layer
         */
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.mapkit.maplibre.map.MaplibreMapDelegateKt.LayerWithZindex copy(@org.jetbrains.annotations.NotNull
        com.mapbox.mapboxsdk.style.layers.Layer layer, int zindex) {
            return null;
        }
        
        /**
         * 因为 addLayer 只支持 layer，不支持 layer id，因此这里只能保存 layer
         */
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        /**
         * 因为 addLayer 只支持 layer，不支持 layer id，因此这里只能保存 layer
         */
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        public LayerWithZindex(@org.jetbrains.annotations.NotNull
        com.mapbox.mapboxsdk.style.layers.Layer layer, int zindex) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.mapbox.mapboxsdk.style.layers.Layer component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.mapbox.mapboxsdk.style.layers.Layer getLayer() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getZindex() {
            return 0;
        }
        
        @java.lang.Override
        public int compareTo(@org.jetbrains.annotations.NotNull
        dji.v5.ux.mapkit.maplibre.map.MaplibreMapDelegateKt.LayerWithZindex other) {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Ldji/v5/ux/mapkit/maplibre/map/MaplibreMapDelegateKt$Companion;", "", "()V", "TAG", "", "android-sdk-v5-uxsdk_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}