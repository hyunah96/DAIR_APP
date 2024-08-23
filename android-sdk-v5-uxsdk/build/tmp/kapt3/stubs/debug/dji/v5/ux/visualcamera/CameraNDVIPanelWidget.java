package dji.v5.ux.visualcamera;

import java.lang.System;

/**
 * Class Description
 *
 * @author Hoker
 * @date 2022/12/1
 *
 * Copyright (c) 2022, DJI All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0019\u001a\u00020\u000eH\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0016J\"\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0014J\b\u0010\u001f\u001a\u00020\u001eH\u0014J\u0018\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0014H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006#"}, d2 = {"Ldji/v5/ux/visualcamera/CameraNDVIPanelWidget;", "Ldji/v5/ux/core/base/widget/ConstraintLayoutWidget;", "", "Ldji/v5/ux/core/base/ICameraIndex;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Ldji/v5/ux/databinding/UxsdkPanelNdvlBinding;", "mCameraIndex", "Ldji/sdk/keyvalue/value/common/ComponentIndexType;", "getMCameraIndex", "()Ldji/sdk/keyvalue/value/common/ComponentIndexType;", "setMCameraIndex", "(Ldji/sdk/keyvalue/value/common/ComponentIndexType;)V", "mLensType", "Ldji/sdk/keyvalue/value/common/CameraLensType;", "getMLensType", "()Ldji/sdk/keyvalue/value/common/CameraLensType;", "setMLensType", "(Ldji/sdk/keyvalue/value/common/CameraLensType;)V", "getCameraIndex", "getIdealDimensionRatioString", "", "getLensType", "initView", "", "reactToModelChanges", "updateCameraSource", "cameraIndex", "lensType", "android-sdk-v5-uxsdk_debug"})
public class CameraNDVIPanelWidget extends dji.v5.ux.core.base.widget.ConstraintLayoutWidget<java.lang.Object> implements dji.v5.ux.core.base.ICameraIndex {
    private dji.v5.ux.databinding.UxsdkPanelNdvlBinding binding;
    @org.jetbrains.annotations.NotNull
    private dji.sdk.keyvalue.value.common.ComponentIndexType mCameraIndex = dji.sdk.keyvalue.value.common.ComponentIndexType.LEFT_OR_MAIN;
    @org.jetbrains.annotations.NotNull
    private dji.sdk.keyvalue.value.common.CameraLensType mLensType = dji.sdk.keyvalue.value.common.CameraLensType.CAMERA_LENS_ZOOM;
    
    @kotlin.jvm.JvmOverloads
    public CameraNDVIPanelWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public CameraNDVIPanelWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public CameraNDVIPanelWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.sdk.keyvalue.value.common.ComponentIndexType getMCameraIndex() {
        return null;
    }
    
    public final void setMCameraIndex(@org.jetbrains.annotations.NotNull
    dji.sdk.keyvalue.value.common.ComponentIndexType p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.sdk.keyvalue.value.common.CameraLensType getMLensType() {
        return null;
    }
    
    public final void setMLensType(@org.jetbrains.annotations.NotNull
    dji.sdk.keyvalue.value.common.CameraLensType p0) {
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
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String getIdealDimensionRatioString() {
        return null;
    }
}