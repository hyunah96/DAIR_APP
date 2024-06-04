package dji.v5.ux.core.widget.gpssignal;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\n\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\"\u0010)\u001a\u00020*2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0014J\u0010\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020\t2\u0006\u0010,\u001a\u00020-H\u0002J\b\u0010/\u001a\u00020*H\u0014J\u001a\u00100\u001a\u00020*2\b\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u00020\u0002H\u0016J\b\u00104\u001a\u00020*H\u0014J\b\u00105\u001a\u00020*H\u0014J\u0010\u00106\u001a\u00020*2\u0006\u00103\u001a\u00020\u0002H\u0002J\u0010\u00107\u001a\u00020*2\u0006\u00108\u001a\u00020\tH\u0002J\u0010\u00109\u001a\u00020*2\u0006\u00108\u001a\u00020\tH\u0002J\u0010\u0010:\u001a\u00020*2\u0006\u0010;\u001a\u00020\u001fH\u0002J\u0010\u0010<\u001a\u00020*2\u0006\u0010,\u001a\u00020-H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006="}, d2 = {"Ldji/v5/ux/core/widget/gpssignal/GpsSignalPopoverView;", "Ldji/v5/ux/core/base/widget/FrameLayoutWidget;", "", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gpsContentWrapper", "Landroid/widget/LinearLayout;", "gpsSignalWidgetModel", "Ldji/v5/ux/core/widget/gpssignal/GpsSignalWidgetModel;", "getGpsSignalWidgetModel", "()Ldji/v5/ux/core/widget/gpssignal/GpsSignalWidgetModel;", "gpsSignalWidgetModel$delegate", "Lkotlin/Lazy;", "gpsTitleWrapper", "Landroid/widget/FrameLayout;", "maxWidth", "rtkContentWrapper", "rtkEnabledSwitch", "Landroid/widget/Switch;", "rtkEnabledWidgetModel", "Ldji/v5/ux/accessory/RTKEnabledWidgetModel;", "getRtkEnabledWidgetModel", "()Ldji/v5/ux/accessory/RTKEnabledWidgetModel;", "rtkEnabledWidgetModel$delegate", "rtkOverview", "Ldji/v5/ux/core/widget/gpssignal/GpsSignalWidgetModel$RtkOverview;", "rtkTitleWrapper", "tvGpsSatelliteCount", "Ldji/v5/ux/accessory/item/TitleValueCell;", "tvGpsSignal", "tvRtkSatelliteCount", "tvRtkSignal", "tvRtkState", "getIdealDimensionRatioString", "", "initView", "", "mapSignalLevelToColorRes", "level", "Ldji/v5/ux/core/widget/gpssignal/GpsSignalWidgetModel$SignalLevel;", "mapSignalLevelToStringRes", "onAttachedToWindow", "onCheckedChanged", "buttonView", "Landroid/widget/CompoundButton;", "isChecked", "onDetachedFromWindow", "reactToModelChanges", "setRTKSwitch", "updateGpsSatelliteCount", "count", "updateRtKSatelliteCount", "updateRtkState", "overview", "updateSignalLevel", "android-sdk-v5-uxsdk_debug"})
public final class GpsSignalPopoverView extends dji.v5.ux.core.base.widget.FrameLayoutWidget<java.lang.Boolean> implements android.widget.CompoundButton.OnCheckedChangeListener {
    private android.widget.FrameLayout rtkTitleWrapper;
    private android.widget.LinearLayout rtkContentWrapper;
    private android.widget.FrameLayout gpsTitleWrapper;
    private android.widget.LinearLayout gpsContentWrapper;
    private dji.v5.ux.accessory.item.TitleValueCell tvGpsSignal;
    private dji.v5.ux.accessory.item.TitleValueCell tvGpsSatelliteCount;
    private android.widget.Switch rtkEnabledSwitch;
    private dji.v5.ux.accessory.item.TitleValueCell tvRtkState;
    private dji.v5.ux.accessory.item.TitleValueCell tvRtkSatelliteCount;
    private dji.v5.ux.accessory.item.TitleValueCell tvRtkSignal;
    private int maxWidth = 0;
    private dji.v5.ux.core.widget.gpssignal.GpsSignalWidgetModel.RtkOverview rtkOverview;
    private final kotlin.Lazy rtkEnabledWidgetModel$delegate = null;
    private final kotlin.Lazy gpsSignalWidgetModel$delegate = null;
    
    @kotlin.jvm.JvmOverloads
    public GpsSignalPopoverView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public GpsSignalPopoverView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public GpsSignalPopoverView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    private final dji.v5.ux.accessory.RTKEnabledWidgetModel getRtkEnabledWidgetModel() {
        return null;
    }
    
    private final dji.v5.ux.core.widget.gpssignal.GpsSignalWidgetModel getGpsSignalWidgetModel() {
        return null;
    }
    
    @java.lang.Override
    protected void onAttachedToWindow() {
    }
    
    @java.lang.Override
    protected void onDetachedFromWindow() {
    }
    
    private final void updateRtkState(dji.v5.ux.core.widget.gpssignal.GpsSignalWidgetModel.RtkOverview overview) {
    }
    
    private final void updateRtKSatelliteCount(int count) {
    }
    
    private final void setRTKSwitch(boolean isChecked) {
    }
    
    private final void updateGpsSatelliteCount(int count) {
    }
    
    private final void updateSignalLevel(dji.v5.ux.core.widget.gpssignal.GpsSignalWidgetModel.SignalLevel level) {
    }
    
    private final int mapSignalLevelToStringRes(dji.v5.ux.core.widget.gpssignal.GpsSignalWidgetModel.SignalLevel level) {
        return 0;
    }
    
    private final int mapSignalLevelToColorRes(dji.v5.ux.core.widget.gpssignal.GpsSignalWidgetModel.SignalLevel level) {
        return 0;
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
    
    @java.lang.Override
    public void onCheckedChanged(@org.jetbrains.annotations.Nullable
    android.widget.CompoundButton buttonView, boolean isChecked) {
    }
}