package dji.v5.ux.visualcamera.ndvi;

import java.lang.System;

/**
 * M3M码流选择面板:植被指数和窄带
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\"\u0010\u001f\u001a\u00020 2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0014J\b\u0010!\u001a\u00020 H\u0014J\b\u0010\"\u001a\u00020 H\u0014J\b\u0010#\u001a\u00020 H\u0014J\u0010\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020\rH\u0002J\u0010\u0010&\u001a\u00020 2\u0006\u0010%\u001a\u00020\u0013H\u0002J\u0016\u0010\'\u001a\u00020 2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0)H\u0002J\u0016\u0010*\u001a\u00020 2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00130)H\u0002J\u0018\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u001eH\u0016R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006."}, d2 = {"Ldji/v5/ux/visualcamera/ndvi/NDVIStreamSelectionPanelWidget;", "Ldji/v5/ux/core/base/widget/ConstraintLayoutWidget;", "", "Ldji/v5/ux/core/base/ICameraIndex;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "narrowBandAdapter", "Ldji/v5/ux/visualcamera/ndvi/StreamAdapter;", "Ldji/v5/ux/visualcamera/ndvi/StreamPanelUtil$NarrowBandModel;", "narrowBandList", "Landroidx/recyclerview/widget/RecyclerView;", "narrowBandTv", "Landroid/widget/TextView;", "vegetationAdapter", "Ldji/v5/ux/visualcamera/ndvi/StreamPanelUtil$VegetationModel;", "vegetationList", "widgetModel", "Ldji/v5/ux/visualcamera/ndvi/NDVIStreamSelectionPanelWidgetModel;", "getWidgetModel", "()Ldji/v5/ux/visualcamera/ndvi/NDVIStreamSelectionPanelWidgetModel;", "widgetModel$delegate", "Lkotlin/Lazy;", "getCameraIndex", "Ldji/sdk/keyvalue/value/common/ComponentIndexType;", "getLensType", "Ldji/sdk/keyvalue/value/common/CameraLensType;", "initView", "", "onAttachedToWindow", "onDetachedFromWindow", "reactToModelChanges", "setCurrentNarrowBandPosition", "position", "setCurrentVegetationPosition", "setNarrowBandData", "models", "", "setVegetationData", "updateCameraSource", "cameraIndex", "lensType", "android-sdk-v5-uxsdk_debug"})
public class NDVIStreamSelectionPanelWidget extends dji.v5.ux.core.base.widget.ConstraintLayoutWidget<java.lang.Object> implements dji.v5.ux.core.base.ICameraIndex {
    private final kotlin.Lazy widgetModel$delegate = null;
    private androidx.recyclerview.widget.RecyclerView vegetationList;
    private dji.v5.ux.visualcamera.ndvi.StreamAdapter<dji.v5.ux.visualcamera.ndvi.StreamPanelUtil.VegetationModel> vegetationAdapter;
    private androidx.recyclerview.widget.RecyclerView narrowBandList;
    private android.widget.TextView narrowBandTv;
    private dji.v5.ux.visualcamera.ndvi.StreamAdapter<dji.v5.ux.visualcamera.ndvi.StreamPanelUtil.NarrowBandModel> narrowBandAdapter;
    
    @kotlin.jvm.JvmOverloads
    public NDVIStreamSelectionPanelWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public NDVIStreamSelectionPanelWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public NDVIStreamSelectionPanelWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    private final dji.v5.ux.visualcamera.ndvi.NDVIStreamSelectionPanelWidgetModel getWidgetModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dji.sdk.keyvalue.value.common.ComponentIndexType getCameraIndex() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dji.sdk.keyvalue.value.common.CameraLensType getLensType() {
        return null;
    }
    
    @java.lang.Override
    public void updateCameraSource(@org.jetbrains.annotations.NotNull
    dji.sdk.keyvalue.value.common.ComponentIndexType cameraIndex, @org.jetbrains.annotations.NotNull
    dji.sdk.keyvalue.value.common.CameraLensType lensType) {
    }
    
    @java.lang.Override
    protected void initView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
    }
    
    @java.lang.Override
    protected void reactToModelChanges() {
    }
    
    @java.lang.Override
    protected void onAttachedToWindow() {
    }
    
    @java.lang.Override
    protected void onDetachedFromWindow() {
    }
    
    private final void setVegetationData(java.util.List<dji.v5.ux.visualcamera.ndvi.StreamPanelUtil.VegetationModel> models) {
    }
    
    private final void setNarrowBandData(java.util.List<dji.v5.ux.visualcamera.ndvi.StreamPanelUtil.NarrowBandModel> models) {
    }
    
    private final void setCurrentVegetationPosition(dji.v5.ux.visualcamera.ndvi.StreamPanelUtil.VegetationModel position) {
    }
    
    private final void setCurrentNarrowBandPosition(dji.v5.ux.visualcamera.ndvi.StreamPanelUtil.NarrowBandModel position) {
    }
}