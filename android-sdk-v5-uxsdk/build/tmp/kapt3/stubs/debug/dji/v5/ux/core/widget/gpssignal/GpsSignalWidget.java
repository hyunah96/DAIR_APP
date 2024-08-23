package dji.v5.ux.core.widget.gpssignal;

import java.lang.System;

/**
 * Description :
 *
 * @author: Byte.Cai
 * date : 2022/9/12
 *
 * Copyright (c) 2022, DJI All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020%H\u0002J\"\u0010&\u001a\u00020\'2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010(\u001a\u00020\'H\u0014J\b\u0010)\u001a\u00020\'H\u0014J\b\u0010*\u001a\u00020\'H\u0014J\u0010\u0010+\u001a\u00020\'2\u0006\u0010,\u001a\u00020 H\u0002R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Ldji/v5/ux/core/widget/gpssignal/GpsSignalWidget;", "Ldji/v5/ux/core/base/widget/ConstraintLayoutWidget;", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gpsSignalWidgetModel", "Ldji/v5/ux/core/widget/gpssignal/GpsSignalWidgetModel;", "getGpsSignalWidgetModel", "()Ldji/v5/ux/core/widget/gpssignal/GpsSignalWidgetModel;", "gpsSignalWidgetModel$delegate", "Lkotlin/Lazy;", "ivRtkIcon", "Landroid/widget/ImageView;", "ivSatelliteIcon", "popover", "Ldji/v5/ux/core/popover/Popover;", "getPopover", "()Ldji/v5/ux/core/popover/Popover;", "popover$delegate", "rootView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "rtkEnabledWidgetModel", "Ldji/v5/ux/accessory/RTKEnabledWidgetModel;", "getRtkEnabledWidgetModel", "()Ldji/v5/ux/accessory/RTKEnabledWidgetModel;", "rtkEnabledWidgetModel$delegate", "rtkOverView", "Ldji/v5/ux/core/widget/gpssignal/GpsSignalWidgetModel$RtkOverview;", "tvSatelliteCount", "Landroid/widget/TextView;", "getTintColor", "level", "Ldji/v5/ux/core/widget/gpssignal/GpsSignalWidgetModel$SignalLevel;", "initView", "", "onAttachedToWindow", "onDetachedFromWindow", "reactToModelChanges", "updateRtkIcon", "overview", "android-sdk-v5-uxsdk_debug"})
public final class GpsSignalWidget extends dji.v5.ux.core.base.widget.ConstraintLayoutWidget<java.lang.Boolean> {
    private final android.widget.ImageView ivRtkIcon = null;
    private final android.widget.ImageView ivSatelliteIcon = null;
    private final android.widget.TextView tvSatelliteCount = null;
    private dji.v5.ux.core.widget.gpssignal.GpsSignalWidgetModel.RtkOverview rtkOverView;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView = null;
    private final kotlin.Lazy rtkEnabledWidgetModel$delegate = null;
    private final kotlin.Lazy popover$delegate = null;
    private final kotlin.Lazy gpsSignalWidgetModel$delegate = null;
    
    @kotlin.jvm.JvmOverloads
    public GpsSignalWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public GpsSignalWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public GpsSignalWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    private final dji.v5.ux.accessory.RTKEnabledWidgetModel getRtkEnabledWidgetModel() {
        return null;
    }
    
    private final dji.v5.ux.core.popover.Popover getPopover() {
        return null;
    }
    
    private final dji.v5.ux.core.widget.gpssignal.GpsSignalWidgetModel getGpsSignalWidgetModel() {
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
    
    @java.lang.Override
    protected void reactToModelChanges() {
    }
    
    private final void updateRtkIcon(dji.v5.ux.core.widget.gpssignal.GpsSignalWidgetModel.RtkOverview overview) {
    }
    
    private final int getTintColor(dji.v5.ux.core.widget.gpssignal.GpsSignalWidgetModel.SignalLevel level) {
        return 0;
    }
}