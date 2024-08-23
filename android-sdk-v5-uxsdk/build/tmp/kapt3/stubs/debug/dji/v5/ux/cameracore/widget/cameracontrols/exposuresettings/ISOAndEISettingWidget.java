package dji.v5.ux.cameracore.widget.cameracontrols.exposuresettings;

import java.lang.System;

/**
 * Class Description
 *
 * @author Hoker
 * @date 2021/11/2
 *
 * Copyright (c) 2021, DJI All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0001UB%\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u001d\u0010\"\u001a\u00020\u00122\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019H\u0002\u00a2\u0006\u0002\u0010$J\b\u0010%\u001a\u00020&H\u0016J%\u0010\'\u001a\u00020\u000b2\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00192\u0006\u0010(\u001a\u00020\u000bH\u0002\u00a2\u0006\u0002\u0010)J\n\u0010*\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010+\u001a\u00020,H\u0016J\"\u0010-\u001a\u00020.2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010/\u001a\u00020.H\u0014J\u0012\u00100\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00103\u001a\u00020.H\u0014J\u0010\u00104\u001a\u00020.2\u0006\u00105\u001a\u000206H\u0002J\u0010\u00107\u001a\u00020.2\u0006\u00108\u001a\u00020\u001aH\u0002J\u0010\u00109\u001a\u00020.2\u0006\u0010:\u001a\u00020;H\u0016J\u0010\u0010<\u001a\u00020.2\u0006\u0010:\u001a\u00020;H\u0016J \u0010=\u001a\u00020.2\u0006\u0010:\u001a\u00020;2\u0006\u0010>\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020\u0012H\u0016J\u0018\u0010@\u001a\u00020.2\u0006\u0010:\u001a\u00020;2\u0006\u0010>\u001a\u00020\u000bH\u0016J\u0018\u0010A\u001a\u00020.2\u0006\u0010:\u001a\u00020;2\u0006\u0010>\u001a\u00020\u000bH\u0016J\b\u0010B\u001a\u00020.H\u0014J\u0010\u0010C\u001a\u00020.2\u0006\u0010D\u001a\u00020\u0012H\u0002J\b\u0010E\u001a\u00020.H\u0002J\u0018\u0010F\u001a\u00020.2\u0006\u0010G\u001a\u00020&2\u0006\u0010H\u001a\u00020,H\u0016J\u0010\u0010I\u001a\u00020.2\u0006\u0010J\u001a\u00020\u000bH\u0002J\b\u0010K\u001a\u00020.H\u0002J\b\u0010L\u001a\u00020.H\u0002J\b\u0010M\u001a\u00020.H\u0002J\u001d\u0010N\u001a\u00020.2\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019H\u0002\u00a2\u0006\u0002\u0010OJ\u0010\u0010P\u001a\u00020.2\u0006\u00108\u001a\u00020\u001aH\u0002J%\u0010Q\u001a\u00020.2\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00192\u0006\u0010R\u001a\u00020\u000bH\u0002\u00a2\u0006\u0002\u0010SJ\b\u0010T\u001a\u00020.H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006V"}, d2 = {"Ldji/v5/ux/cameracore/widget/cameracontrols/exposuresettings/ISOAndEISettingWidget;", "Ldji/v5/ux/core/base/widget/ConstraintLayoutWidget;", "Ldji/v5/ux/cameracore/widget/cameracontrols/exposuresettings/ISOAndEISettingWidget$ModelState;", "Landroid/view/View$OnClickListener;", "Ldji/v5/ux/core/ui/HorizontalSeekBar$OnSeekBarChangeListener;", "Ldji/v5/ux/core/base/ICameraIndex;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "LOCKED_ISO_VALUE", "", "eiValueArray", "", "isISOAutoSelected", "", "isISOAutoSupported", "isISOLocked", "isISOSeekBarEnabled", "isSeekBarTracking", "uiCameraISO", "uiIsoValueArray", "", "Ldji/sdk/keyvalue/value/camera/CameraISO;", "[Ldji/sdk/keyvalue/value/camera/CameraISO;", "widgetModel", "Ldji/v5/ux/cameracore/widget/cameracontrols/exposuresettings/ISOAndEISettingModel;", "getWidgetModel", "()Ldji/v5/ux/cameracore/widget/cameracontrols/exposuresettings/ISOAndEISettingModel;", "widgetModel$delegate", "Lkotlin/Lazy;", "checkAutoISO", "array", "([Ldji/sdk/keyvalue/value/camera/CameraISO;)Z", "getCameraIndex", "Ldji/sdk/keyvalue/value/common/ComponentIndexType;", "getISOIndex", "isoValue", "([Ldji/sdk/keyvalue/value/camera/CameraISO;I)I", "getIdealDimensionRatioString", "getLensType", "Ldji/sdk/keyvalue/value/common/CameraLensType;", "initView", "", "onAttachedToWindow", "onClick", "v", "Landroid/view/View;", "onDetachedFromWindow", "onExposureModeUpdated", "exposureMode", "Ldji/sdk/keyvalue/value/camera/CameraExposureMode;", "onISOUpdated", "iso", "onMinusClicked", "view", "Ldji/v5/ux/core/ui/HorizontalSeekBar;", "onPlusClicked", "onProgressChanged", "progress", "isFromUI", "onStartTrackingTouch", "onStopTrackingTouch", "reactToModelChanges", "setAutoISO", "isAuto", "updateAutoISOButton", "updateCameraSource", "cameraIndex", "lensType", "updateEIToCamera", "ei", "updateISOEnableStatus", "updateISOLocked", "updateISORangeUI", "updateISORangeValue", "([Ldji/sdk/keyvalue/value/camera/CameraISO;)V", "updateISOToCamera", "updateISOValue", "value", "([Ldji/sdk/keyvalue/value/camera/CameraISO;I)V", "updateWidgetUI", "ModelState", "android-sdk-v5-uxsdk_debug"})
public class ISOAndEISettingWidget extends dji.v5.ux.core.base.widget.ConstraintLayoutWidget<dji.v5.ux.cameracore.widget.cameracontrols.exposuresettings.ISOAndEISettingWidget.ModelState> implements android.view.View.OnClickListener, dji.v5.ux.core.ui.HorizontalSeekBar.OnSeekBarChangeListener, dji.v5.ux.core.base.ICameraIndex {
    private final java.lang.String LOCKED_ISO_VALUE = "500";
    private boolean isISOAutoSelected = false;
    private boolean isISOAutoSupported = false;
    private boolean isISOSeekBarEnabled = false;
    private final boolean isISOLocked = false;
    private boolean isSeekBarTracking = false;
    private int uiCameraISO = 0;
    private dji.sdk.keyvalue.value.camera.CameraISO[] uiIsoValueArray = {};
    private int[] eiValueArray = {};
    private final kotlin.Lazy widgetModel$delegate = null;
    
    @kotlin.jvm.JvmOverloads
    public ISOAndEISettingWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public ISOAndEISettingWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public ISOAndEISettingWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    private final dji.v5.ux.cameracore.widget.cameracontrols.exposuresettings.ISOAndEISettingModel getWidgetModel() {
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
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String getIdealDimensionRatioString() {
        return null;
    }
    
    @java.lang.Override
    public void onProgressChanged(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.ui.HorizontalSeekBar view, int progress, boolean isFromUI) {
    }
    
    @java.lang.Override
    public void onStartTrackingTouch(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.ui.HorizontalSeekBar view, int progress) {
    }
    
    @java.lang.Override
    public void onStopTrackingTouch(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.ui.HorizontalSeekBar view, int progress) {
    }
    
    @java.lang.Override
    public void onPlusClicked(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.ui.HorizontalSeekBar view) {
    }
    
    @java.lang.Override
    public void onMinusClicked(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.ui.HorizontalSeekBar view) {
    }
    
    @java.lang.Override
    public void onClick(@org.jetbrains.annotations.Nullable
    android.view.View v) {
    }
    
    private final void updateWidgetUI() {
    }
    
    private final void onISOUpdated(dji.sdk.keyvalue.value.camera.CameraISO iso) {
    }
    
    private final void onExposureModeUpdated(dji.sdk.keyvalue.value.camera.CameraExposureMode exposureMode) {
    }
    
    private final void updateISORangeValue(dji.sdk.keyvalue.value.camera.CameraISO[] array) {
    }
    
    private final void updateISORangeUI() {
    }
    
    private final void updateISOEnableStatus() {
    }
    
    private final boolean checkAutoISO(dji.sdk.keyvalue.value.camera.CameraISO[] array) {
        return false;
    }
    
    private final void updateISOValue(dji.sdk.keyvalue.value.camera.CameraISO[] array, int value) {
    }
    
    private final void updateAutoISOButton() {
    }
    
    private final int getISOIndex(dji.sdk.keyvalue.value.camera.CameraISO[] array, int isoValue) {
        return 0;
    }
    
    private final void setAutoISO(boolean isAuto) {
    }
    
    private final void updateISOToCamera(dji.sdk.keyvalue.value.camera.CameraISO iso) {
    }
    
    private final void updateEIToCamera(int ei) {
    }
    
    private final void updateISOLocked() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/cameracore/widget/cameracontrols/exposuresettings/ISOAndEISettingWidget$ModelState;", "", "()V", "android-sdk-v5-uxsdk_debug"})
    public static abstract class ModelState {
        
        private ModelState() {
            super();
        }
    }
}