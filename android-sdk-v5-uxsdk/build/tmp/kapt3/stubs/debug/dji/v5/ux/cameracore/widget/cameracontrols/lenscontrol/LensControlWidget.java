package dji.v5.ux.cameracore.widget.cameracontrols.lenscontrol;

import java.lang.System;

/**
 * Class Description
 *
 * @author Hoker
 * @date 2021/12/13
 *
 * Copyright (c) 2021, DJI All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u00013B%\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\rH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\n\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0016J\u001e\u0010\"\u001a\u00020\r2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0$2\u0006\u0010%\u001a\u00020\rH\u0002J\"\u0010&\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0014J\b\u0010\'\u001a\u00020\u001aH\u0014J\u0012\u0010(\u001a\u00020\u001a2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020\u001aH\u0014J\b\u0010,\u001a\u00020\u001aH\u0014J\u0018\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\rH\u0002J\b\u0010/\u001a\u00020\u001aH\u0002J\u0018\u00100\u001a\u00020\u001a2\u0006\u00101\u001a\u00020\u001d2\u0006\u00102\u001a\u00020!H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016\u00a8\u00064"}, d2 = {"Ldji/v5/ux/cameracore/widget/cameracontrols/lenscontrol/LensControlWidget;", "Ldji/v5/ux/core/base/widget/ConstraintLayoutWidget;", "Ldji/v5/ux/cameracore/widget/cameracontrols/lenscontrol/LensControlWidget$ModelState;", "Landroid/view/View$OnClickListener;", "Ldji/v5/ux/core/base/ICameraIndex;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "firstBtnSource", "Ldji/sdk/keyvalue/value/camera/CameraVideoStreamSourceType;", "first_len_btn", "Landroid/widget/Button;", "kotlin.jvm.PlatformType", "secondBtnSource", "second_len_btn", "widgetModel", "Ldji/v5/ux/cameracore/widget/cameracontrols/lenscontrol/LensControlModel;", "getWidgetModel", "()Ldji/v5/ux/cameracore/widget/cameracontrols/lenscontrol/LensControlModel;", "widgetModel$delegate", "Lkotlin/Lazy;", "dealLensBtnClicked", "", "source", "getCameraIndex", "Ldji/sdk/keyvalue/value/common/ComponentIndexType;", "getIdealDimensionRatioString", "", "getLensType", "Ldji/sdk/keyvalue/value/common/CameraLensType;", "getProperVideoSource", "range", "", "exceptSource", "initView", "onAttachedToWindow", "onClick", "v", "Landroid/view/View;", "onDetachedFromWindow", "reactToModelChanges", "updateBtnText", "button", "updateBtnView", "updateCameraSource", "cameraIndex", "lensType", "ModelState", "android-sdk-v5-uxsdk_debug"})
public class LensControlWidget extends dji.v5.ux.core.base.widget.ConstraintLayoutWidget<dji.v5.ux.cameracore.widget.cameracontrols.lenscontrol.LensControlWidget.ModelState> implements android.view.View.OnClickListener, dji.v5.ux.core.base.ICameraIndex {
    private dji.sdk.keyvalue.value.camera.CameraVideoStreamSourceType firstBtnSource = dji.sdk.keyvalue.value.camera.CameraVideoStreamSourceType.ZOOM_CAMERA;
    private dji.sdk.keyvalue.value.camera.CameraVideoStreamSourceType secondBtnSource = dji.sdk.keyvalue.value.camera.CameraVideoStreamSourceType.WIDE_CAMERA;
    private android.widget.Button first_len_btn;
    private android.widget.Button second_len_btn;
    private final kotlin.Lazy widgetModel$delegate = null;
    
    @kotlin.jvm.JvmOverloads
    public LensControlWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public LensControlWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public LensControlWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    private final dji.v5.ux.cameracore.widget.cameracontrols.lenscontrol.LensControlModel getWidgetModel() {
        return null;
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
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String getIdealDimensionRatioString() {
        return null;
    }
    
    @java.lang.Override
    public void onClick(@org.jetbrains.annotations.Nullable
    android.view.View v) {
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
    
    private final void dealLensBtnClicked(dji.sdk.keyvalue.value.camera.CameraVideoStreamSourceType source) {
    }
    
    private final void updateBtnView() {
    }
    
    private final void updateBtnText(android.widget.Button button, dji.sdk.keyvalue.value.camera.CameraVideoStreamSourceType source) {
    }
    
    private final dji.sdk.keyvalue.value.camera.CameraVideoStreamSourceType getProperVideoSource(java.util.List<? extends dji.sdk.keyvalue.value.camera.CameraVideoStreamSourceType> range, dji.sdk.keyvalue.value.camera.CameraVideoStreamSourceType exceptSource) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/cameracore/widget/cameracontrols/lenscontrol/LensControlWidget$ModelState;", "", "()V", "android-sdk-v5-uxsdk_debug"})
    public static abstract class ModelState {
        
        private ModelState() {
            super();
        }
    }
}