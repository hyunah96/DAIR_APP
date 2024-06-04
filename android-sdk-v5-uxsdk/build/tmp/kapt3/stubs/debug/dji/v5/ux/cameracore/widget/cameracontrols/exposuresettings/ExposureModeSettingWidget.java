package dji.v5.ux.cameracore.widget.cameracontrols.exposuresettings;

import java.lang.System;

/**
 * Class Description
 *
 * @author Hoker
 * @date 2021/10/19
 *
 * Copyright (c) 2021, DJI All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001-B%\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\"\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u001a\u001a\u00020\u0019H\u0014J\u0012\u0010\u001b\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0019H\u0014J \u0010\u001f\u001a\u00020 2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"2\u0006\u0010$\u001a\u00020#H\u0002J\b\u0010%\u001a\u00020\u0019H\u0014J\b\u0010&\u001a\u00020\u0019H\u0002J\u0018\u0010\'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u0017H\u0016J\u0010\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020#H\u0002J\u0016\u0010,\u001a\u00020\u00192\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006."}, d2 = {"Ldji/v5/ux/cameracore/widget/cameracontrols/exposuresettings/ExposureModeSettingWidget;", "Ldji/v5/ux/core/base/widget/ConstraintLayoutWidget;", "Ldji/v5/ux/cameracore/widget/cameracontrols/exposuresettings/ExposureModeSettingWidget$ModelState;", "Landroid/view/View$OnClickListener;", "Ldji/v5/ux/core/base/ICameraIndex;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widgetModel", "Ldji/v5/ux/cameracore/widget/cameracontrols/exposuresettings/ExposureModeSettingModel;", "getWidgetModel", "()Ldji/v5/ux/cameracore/widget/cameracontrols/exposuresettings/ExposureModeSettingModel;", "widgetModel$delegate", "Lkotlin/Lazy;", "getCameraIndex", "Ldji/sdk/keyvalue/value/common/ComponentIndexType;", "getIdealDimensionRatioString", "", "getLensType", "Ldji/sdk/keyvalue/value/common/CameraLensType;", "initView", "", "onAttachedToWindow", "onClick", "v", "Landroid/view/View;", "onDetachedFromWindow", "rangeContains", "", "range", "", "Ldji/sdk/keyvalue/value/camera/CameraExposureMode;", "value", "reactToModelChanges", "restoreToCurrentExposureMode", "updateCameraSource", "cameraIndex", "lensType", "updateExposureMode", "mode", "updateExposureModeRange", "ModelState", "android-sdk-v5-uxsdk_debug"})
public class ExposureModeSettingWidget extends dji.v5.ux.core.base.widget.ConstraintLayoutWidget<dji.v5.ux.cameracore.widget.cameracontrols.exposuresettings.ExposureModeSettingWidget.ModelState> implements android.view.View.OnClickListener, dji.v5.ux.core.base.ICameraIndex {
    private final kotlin.Lazy widgetModel$delegate = null;
    
    @kotlin.jvm.JvmOverloads
    public ExposureModeSettingWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public ExposureModeSettingWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public ExposureModeSettingWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    private final dji.v5.ux.cameracore.widget.cameracontrols.exposuresettings.ExposureModeSettingModel getWidgetModel() {
        return null;
    }
    
    @java.lang.Override
    protected void initView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
    }
    
    @java.lang.Override
    protected void onAttachedToWindow() {
    }
    
    @java.lang.Override
    protected void onDetachedFromWindow() {
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
    protected void reactToModelChanges() {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String getIdealDimensionRatioString() {
        return null;
    }
    
    @java.lang.Override
    public void onClick(@org.jetbrains.annotations.Nullable
    android.view.View v) {
    }
    
    private final void updateExposureModeRange(java.util.List<? extends dji.sdk.keyvalue.value.camera.CameraExposureMode> range) {
    }
    
    private final void updateExposureMode(dji.sdk.keyvalue.value.camera.CameraExposureMode mode) {
    }
    
    private final void restoreToCurrentExposureMode() {
    }
    
    private final boolean rangeContains(java.util.List<? extends dji.sdk.keyvalue.value.camera.CameraExposureMode> range, dji.sdk.keyvalue.value.camera.CameraExposureMode value) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/cameracore/widget/cameracontrols/exposuresettings/ExposureModeSettingWidget$ModelState;", "", "()V", "android-sdk-v5-uxsdk_debug"})
    public static abstract class ModelState {
        
        private ModelState() {
            super();
        }
    }
}