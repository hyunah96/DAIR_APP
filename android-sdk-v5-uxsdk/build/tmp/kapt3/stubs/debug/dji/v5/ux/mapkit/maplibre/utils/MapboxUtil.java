package dji.v5.ux.mapkit.maplibre.utils;

import java.lang.System;

@kotlin.jvm.JvmName(name = "MapboxUtil")
@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000R\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b7\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u000e\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020N\u001a\u001a\u0010O\u001a\u0004\u0018\u00010P2\u0006\u0010Q\u001a\u00020R2\b\u0010S\u001a\u0004\u0018\u00010T\u001a\u0016\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020X2\u0006\u0010M\u001a\u00020N\u001a\u000e\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\\\u001a\u000e\u0010]\u001a\u00020\\2\u0006\u0010[\u001a\u00020Z\u001a\u000e\u0010^\u001a\u00020\u00012\u0006\u0010_\u001a\u00020`\u001a\u000e\u0010a\u001a\u00020\u00012\u0006\u0010b\u001a\u00020\u0001\u001a\u000e\u0010c\u001a\u00020\u00012\u0006\u0010d\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0011\u0010\u0010\u001a\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u0016\u0010\u0013\u001a\u00020\u00148BX\u0082\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0011\u0010\u0017\u001a\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012\"\u0016\u0010\u0019\u001a\u00020\u00148BX\u0082\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0011\u0010\u001b\u001a\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u0012\"\u0016\u0010\u001d\u001a\u00020\u00148BX\u0082\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016\"\u0011\u0010\u001f\u001a\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\b \u0010\u0012\"\u0016\u0010!\u001a\u00020\u00148BX\u0082\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016\"\u0016\u0010#\u001a\u00020\u00148BX\u0082\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016\"\u0011\u0010%\u001a\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\b&\u0010\u0012\"\u0016\u0010\'\u001a\u00020\u00148BX\u0082\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0016\"\u0011\u0010)\u001a\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\b*\u0010\u0012\"\u0016\u0010+\u001a\u00020\u00148BX\u0082\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0016\"\u0011\u0010-\u001a\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\b.\u0010\u0012\"\u0016\u0010/\u001a\u00020\u00148BX\u0082\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0016\"\u0011\u00101\u001a\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\b2\u0010\u0012\"\u0016\u00103\u001a\u00020\u00148BX\u0082\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0016\"\u0011\u00105\u001a\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\b6\u0010\u0012\"\u0016\u00107\u001a\u00020\u00148BX\u0082\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010\u0016\"\u0011\u00109\u001a\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\b:\u0010\u0012\"\u0016\u0010;\u001a\u00020\u00148BX\u0082\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0016\"\u0011\u0010=\u001a\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\b>\u0010\u0012\"\u0016\u0010?\u001a\u00020\u00148BX\u0082\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010\u0016\"\u0011\u0010A\u001a\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\bB\u0010\u0012\"\u0016\u0010C\u001a\u00020\u00148BX\u0082\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010\u0016\"\u0011\u0010E\u001a\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\bF\u0010\u0012\"\u0016\u0010G\u001a\u00020\u00148BX\u0082\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010\u0016\"\u0011\u0010I\u001a\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\bJ\u0010\u0012\u00a8\u0006e"}, d2 = {"CIRCLE_BORDER_LAYER_ID_PREFIX", "", "CIRCLE_BORDER_SOURCE_ID_PREFIX", "CIRCLE_LAYER_ID_PREFIX", "CIRCLE_SOURCE_ID_PREFIX", "FEATURE_ID_PREFIX", "INFO_WINDOW_ID_POSTFIX", "MARKER_ICON_ID_PREFIX", "MARKER_LAYER_ID_PREFIX", "MARKER_SOURCE_ID_PREFIX", "POLYGON_BORDER_LAYER_ID_PREFIX", "POLYGON_BORDER_SOURCE_ID_PREFIX", "POLYGON_LAYER_ID_PREFIX", "POLYGON_SOURCE_ID_PREFIX", "POLYLINE_LAYER_ID_PREFIX", "POLYLINE_SOURCE_ID_PREFIX", "circleBorderLayerIdAndIncrement", "getCircleBorderLayerIdAndIncrement", "()Ljava/lang/String;", "circleBorderLayerIndex", "", "getCircleBorderLayerIndex", "()I", "circleBorderSourceIdAndIncrement", "getCircleBorderSourceIdAndIncrement", "circleBorderSourceIndex", "getCircleBorderSourceIndex", "circleLayerIdAndIncrement", "getCircleLayerIdAndIncrement", "circleLayerIndex", "getCircleLayerIndex", "circleSourceIdAndIncrement", "getCircleSourceIdAndIncrement", "circleSourceIndex", "getCircleSourceIndex", "featureIdIndex", "getFeatureIdIndex", "markerIconIdAndIncrement", "getMarkerIconIdAndIncrement", "markerIconIndex", "getMarkerIconIndex", "markerLayerIdAndIncrement", "getMarkerLayerIdAndIncrement", "markerLayerIndex", "getMarkerLayerIndex", "markerSourceIdAndIncrement", "getMarkerSourceIdAndIncrement", "markerSourceIndex", "getMarkerSourceIndex", "polygonBorderLayerIdAndIncrement", "getPolygonBorderLayerIdAndIncrement", "polygonBorderLayerIndex", "getPolygonBorderLayerIndex", "polygonBorderSourceIdAndIncrement", "getPolygonBorderSourceIdAndIncrement", "polygonBorderSourceIndex", "getPolygonBorderSourceIndex", "polygonLayerIdAndIncrement", "getPolygonLayerIdAndIncrement", "polygonLayerIndex", "getPolygonLayerIndex", "polygonSourceIdAndIncrement", "getPolygonSourceIdAndIncrement", "polygonSourceIndex", "getPolygonSourceIndex", "polylineLayerIdAndIncrement", "getPolylineLayerIdAndIncrement", "polylineLayerIndex", "getPolylineLayerIndex", "polylineSourceIdAndIncrement", "getPolylineSourceIdAndIncrement", "polylineSourceIndex", "getPolylineSourceIndex", "sourceFeatureIdAndIncrement", "getSourceFeatureIdAndIncrement", "fromCameraPosition", "Ldji/v5/ux/mapkit/core/models/DJICameraPosition;", "cameraPosition", "Lcom/mapbox/mapboxsdk/camera/CameraPosition;", "fromDJIBitmapDescriptor", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "descriptor", "Ldji/v5/ux/mapkit/core/models/DJIBitmapDescriptor;", "fromDJICameraUpdate", "Lcom/mapbox/mapboxsdk/camera/CameraUpdate;", "cameraUpdate", "Ldji/v5/ux/mapkit/core/camera/DJICameraUpdate;", "fromDJILatLng", "Lcom/mapbox/mapboxsdk/geometry/LatLng;", "latLng", "Ldji/v5/ux/mapkit/core/models/DJILatLng;", "fromLatLng", "fromMapType", "mapType", "Ldji/v5/ux/mapkit/core/maps/DJIMap$MapType;", "getInfoWindowIconId", "markerIconId", "getInfoWindowLayerId", "markerLayerId", "android-sdk-v5-uxsdk_debug"})
public final class MapboxUtil {
    private static final java.lang.String FEATURE_ID_PREFIX = "FEATURE_ID_PREFIX";
    private static final java.lang.String MARKER_ICON_ID_PREFIX = "MARKER_ICON_ID_PREFIX";
    private static final java.lang.String MARKER_LAYER_ID_PREFIX = "MARKER_LAYER_ID_PREFIX";
    private static final java.lang.String MARKER_SOURCE_ID_PREFIX = "MARKER_SOURCE_ID_PREFIX";
    private static final java.lang.String CIRCLE_SOURCE_ID_PREFIX = "CIRCLE_SOURCE_ID_PREFIX";
    private static final java.lang.String CIRCLE_LAYER_ID_PREFIX = "CIRCLE_LAYER_ID_PREFIX";
    private static final java.lang.String CIRCLE_BORDER_LAYER_ID_PREFIX = "CIRCLE_BORDER_LAYER_ID_PREFIX";
    private static final java.lang.String CIRCLE_BORDER_SOURCE_ID_PREFIX = "CIRCLE_BORDER_SOURCE_ID_PREFIX";
    private static final java.lang.String POLYGON_LAYER_ID_PREFIX = "POLYGON_LAYER_ID_PREFIX";
    private static final java.lang.String POLYGON_SOURCE_ID_PREFIX = "POLYGON_SOURCE_ID_PREFIX";
    private static final java.lang.String POLYGON_BORDER_LAYER_ID_PREFIX = "POLYGON_BORDER_LAYER_ID_PREFIX";
    private static final java.lang.String POLYGON_BORDER_SOURCE_ID_PREFIX = "POLYGON_BORDER_SOURCE_ID_PREFIX";
    private static final java.lang.String POLYLINE_LAYER_ID_PREFIX = "POLYLINE_LAYER_ID_PREFIX";
    private static final java.lang.String POLYLINE_SOURCE_ID_PREFIX = "POLYLINE_SOURCE_ID_PREFIX";
    private static final java.lang.String INFO_WINDOW_ID_POSTFIX = "_INFO_WINDOW";
    private static int markerIconIndex = 0;
    private static int markerLayerIndex = 0;
    private static int markerSourceIndex = 0;
    private static int circleSourceIndex = 0;
    private static int circleLayerIndex = 0;
    private static int circleBorderLayerIndex = 0;
    private static int circleBorderSourceIndex = 0;
    private static int polygonLayerIndex = 0;
    private static int polygonSourceIndex = 0;
    private static int polygonBorderLayerIndex = 0;
    private static int polygonBorderSourceIndex = 0;
    private static int polylineLayerIndex = 0;
    private static int polylineSourceIndex = 0;
    private static int featureIdIndex = 0;
    
    private static final int getMarkerIconIndex() {
        return 0;
    }
    
    private static final int getMarkerLayerIndex() {
        return 0;
    }
    
    private static final int getMarkerSourceIndex() {
        return 0;
    }
    
    private static final int getCircleSourceIndex() {
        return 0;
    }
    
    private static final int getCircleLayerIndex() {
        return 0;
    }
    
    private static final int getCircleBorderLayerIndex() {
        return 0;
    }
    
    private static final int getCircleBorderSourceIndex() {
        return 0;
    }
    
    private static final int getPolygonLayerIndex() {
        return 0;
    }
    
    private static final int getPolygonSourceIndex() {
        return 0;
    }
    
    private static final int getPolygonBorderLayerIndex() {
        return 0;
    }
    
    private static final int getPolygonBorderSourceIndex() {
        return 0;
    }
    
    private static final int getPolylineLayerIndex() {
        return 0;
    }
    
    private static final int getPolylineSourceIndex() {
        return 0;
    }
    
    private static final int getFeatureIdIndex() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getMarkerIconIdAndIncrement() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getMarkerLayerIdAndIncrement() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getMarkerSourceIdAndIncrement() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getCircleLayerIdAndIncrement() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getCircleSourceIdAndIncrement() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getCircleBorderLayerIdAndIncrement() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getCircleBorderSourceIdAndIncrement() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getPolygonLayerIdAndIncrement() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getPolygonSourceIdAndIncrement() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getPolygonBorderLayerIdAndIncrement() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getPolygonBorderSourceIdAndIncrement() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getPolylineLayerIdAndIncrement() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getPolylineSourceIdAndIncrement() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getSourceFeatureIdAndIncrement() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getInfoWindowIconId(@org.jetbrains.annotations.NotNull
    java.lang.String markerIconId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getInfoWindowLayerId(@org.jetbrains.annotations.NotNull
    java.lang.String markerLayerId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final android.graphics.Bitmap fromDJIBitmapDescriptor(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    dji.v5.ux.mapkit.core.models.DJIBitmapDescriptor descriptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final com.mapbox.mapboxsdk.geometry.LatLng fromDJILatLng(@org.jetbrains.annotations.NotNull
    dji.v5.ux.mapkit.core.models.DJILatLng latLng) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.mapkit.core.models.DJILatLng fromLatLng(@org.jetbrains.annotations.NotNull
    com.mapbox.mapboxsdk.geometry.LatLng latLng) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.mapkit.core.models.DJICameraPosition fromCameraPosition(@org.jetbrains.annotations.NotNull
    com.mapbox.mapboxsdk.camera.CameraPosition cameraPosition) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final com.mapbox.mapboxsdk.camera.CameraUpdate fromDJICameraUpdate(@org.jetbrains.annotations.NotNull
    dji.v5.ux.mapkit.core.camera.DJICameraUpdate cameraUpdate, @org.jetbrains.annotations.NotNull
    com.mapbox.mapboxsdk.camera.CameraPosition cameraPosition) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String fromMapType(@org.jetbrains.annotations.NotNull
    dji.v5.ux.mapkit.core.maps.DJIMap.MapType mapType) {
        return null;
    }
}