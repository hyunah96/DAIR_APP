package dji.v5.ux.visualcamera.ndvi;

import java.lang.System;

/**
 * 码流窄带及植被指数工具类
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\n\u0010\u0007R!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000f\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Ldji/v5/ux/visualcamera/ndvi/StreamPanelUtil;", "", "()V", "ALL_STREAM_LIST", "", "Ldji/sdk/keyvalue/value/camera/CameraVideoStreamSourceType;", "getALL_STREAM_LIST", "()Ljava/util/List;", "NARROW_BAND_MODEL_LIST", "Ldji/v5/ux/visualcamera/ndvi/StreamPanelUtil$NarrowBandModel;", "getNARROW_BAND_MODEL_LIST", "NARROW_BAND_MODEL_LIST$delegate", "Lkotlin/Lazy;", "VEGETATION_MODEL_LIST", "Ldji/v5/ux/visualcamera/ndvi/StreamPanelUtil$VegetationModel;", "getVEGETATION_MODEL_LIST", "VEGETATION_MODEL_LIST$delegate", "NarrowBandModel", "VegetationModel", "android-sdk-v5-uxsdk_debug"})
public final class StreamPanelUtil {
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.visualcamera.ndvi.StreamPanelUtil INSTANCE = null;
    @org.jetbrains.annotations.NotNull
    private static final java.util.List<dji.sdk.keyvalue.value.camera.CameraVideoStreamSourceType> ALL_STREAM_LIST = null;
    @org.jetbrains.annotations.NotNull
    private static final kotlin.Lazy NARROW_BAND_MODEL_LIST$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final kotlin.Lazy VEGETATION_MODEL_LIST$delegate = null;
    
    private StreamPanelUtil() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<dji.sdk.keyvalue.value.camera.CameraVideoStreamSourceType> getALL_STREAM_LIST() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<dji.v5.ux.visualcamera.ndvi.StreamPanelUtil.NarrowBandModel> getNARROW_BAND_MODEL_LIST() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<dji.v5.ux.visualcamera.ndvi.StreamPanelUtil.VegetationModel> getVEGETATION_MODEL_LIST() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Ldji/v5/ux/visualcamera/ndvi/StreamPanelUtil$NarrowBandModel;", "", "sourceType", "Ldji/sdk/keyvalue/value/camera/CameraVideoStreamSourceType;", "name", "", "image", "", "(Ldji/sdk/keyvalue/value/camera/CameraVideoStreamSourceType;Ljava/lang/String;I)V", "getImage", "()I", "imageRes", "getImageRes", "getName", "()Ljava/lang/String;", "nameRes", "getNameRes", "getSourceType", "()Ldji/sdk/keyvalue/value/camera/CameraVideoStreamSourceType;", "android-sdk-v5-uxsdk_debug"})
    public static final class NarrowBandModel {
        @org.jetbrains.annotations.NotNull
        private final dji.sdk.keyvalue.value.camera.CameraVideoStreamSourceType sourceType = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String name = null;
        private final int image = 0;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String nameRes = null;
        private final int imageRes = 0;
        
        public NarrowBandModel(@org.jetbrains.annotations.NotNull
        dji.sdk.keyvalue.value.camera.CameraVideoStreamSourceType sourceType, @org.jetbrains.annotations.NotNull
        java.lang.String name, int image) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final dji.sdk.keyvalue.value.camera.CameraVideoStreamSourceType getSourceType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getName() {
            return null;
        }
        
        public final int getImage() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getNameRes() {
            return null;
        }
        
        public final int getImageRes() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Ldji/v5/ux/visualcamera/ndvi/StreamPanelUtil$VegetationModel;", "", "sourceType", "Ldji/sdk/keyvalue/value/camera/MultiSpectralFusionType;", "name", "", "image", "", "(Ldji/sdk/keyvalue/value/camera/MultiSpectralFusionType;Ljava/lang/String;I)V", "getImage", "()I", "imageRes", "getImageRes", "getName", "()Ljava/lang/String;", "nameRes", "getNameRes", "getSourceType", "()Ldji/sdk/keyvalue/value/camera/MultiSpectralFusionType;", "android-sdk-v5-uxsdk_debug"})
    public static final class VegetationModel {
        @org.jetbrains.annotations.NotNull
        private final dji.sdk.keyvalue.value.camera.MultiSpectralFusionType sourceType = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String name = null;
        private final int image = 0;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String nameRes = null;
        private final int imageRes = 0;
        
        public VegetationModel(@org.jetbrains.annotations.NotNull
        dji.sdk.keyvalue.value.camera.MultiSpectralFusionType sourceType, @org.jetbrains.annotations.NotNull
        java.lang.String name, int image) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final dji.sdk.keyvalue.value.camera.MultiSpectralFusionType getSourceType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getName() {
            return null;
        }
        
        public final int getImage() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getNameRes() {
            return null;
        }
        
        public final int getImageRes() {
            return 0;
        }
    }
}