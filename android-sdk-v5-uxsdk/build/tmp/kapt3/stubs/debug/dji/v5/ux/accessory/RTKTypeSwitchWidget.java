package dji.v5.ux.accessory;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00132\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\n\u00100\u001a\u0004\u0018\u00010.H\u0016J\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020.0\u00132\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013H\u0002J\u0010\u00102\u001a\u00020.2\u0006\u00103\u001a\u00020\tH\u0002J\b\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u000205H\u0002J\"\u00107\u001a\u0002052\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0014J\b\u00108\u001a\u000205H\u0016J\b\u00109\u001a\u000205H\u0014J\b\u0010:\u001a\u000205H\u0014J\b\u0010;\u001a\u000205H\u0014J\b\u0010<\u001a\u000205H\u0002J\u0010\u0010=\u001a\u0002052\u0006\u00103\u001a\u00020\tH\u0002J0\u0010>\u001a\u0002052\u0006\u0010?\u001a\u00020.2\u0006\u0010@\u001a\u00020\t2\u0006\u0010A\u001a\u00020.2\u0006\u0010B\u001a\u00020.2\u0006\u0010C\u001a\u00020.H\u0002J\b\u0010D\u001a\u000205H\u0002R\u000e\u0010\u000b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\'\u001a\u00020(8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b)\u0010*\u00a8\u0006E"}, d2 = {"Ldji/v5/ux/accessory/RTKTypeSwitchWidget;", "Ldji/v5/ux/core/base/widget/ConstraintLayoutWidget;", "", "Ldji/v5/ux/util/RtkSettingWatcher$OnEditTextEmptyChangedListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "INITIAL_INDEX", "btSaveRtkInfo", "Landroid/widget/Button;", "coordinateSelectListener", "Ldji/v5/ux/accessory/DescSpinnerCell$OnItemSelectedListener;", "coordinateSystemCell", "Ldji/v5/ux/accessory/DescSpinnerCell;", "coordinateSystemList", "", "Ldji/rtk/CoordinateSystem;", "currentRTKSource", "Ldji/sdk/keyvalue/value/rtkbasestation/RTKReferenceStationSource;", "customSetting", "Landroid/widget/LinearLayout;", "edHost", "Landroid/widget/TextView;", "edMountPoint", "edPassword", "edPort", "edUser", "isMotorsOn", "lastSelectedCoordinateSystemIndex", "lastSelectedRTKTypeIndex", "rtkSourceList", "rtkTypeCell", "rtkTypeSelectListener", "textWatcher", "Ldji/v5/ux/util/RtkSettingWatcher;", "widgetModel", "Ldji/v5/ux/accessory/RTKTypeSwitchWidgetModel;", "getWidgetModel", "()Ldji/v5/ux/accessory/RTKTypeSwitchWidgetModel;", "widgetModel$delegate", "Lkotlin/Lazy;", "getCoordinateSystemName", "", "list", "getIdealDimensionRatioString", "getReferenceStationSourceNames", "getTip", "position", "initDefaultCustomSetting", "", "initDefaultNetRtkUI", "initView", "isTextEmptyChanged", "onAttachedToWindow", "onDetachedFromWindow", "reactToModelChanges", "saveRtkCustomUserInfo", "setRTKType", "startRtkCustomNetwork", "host", "port", "user", "pw", "mountPint", "updateRTKView", "android-sdk-v5-uxsdk_debug"})
public class RTKTypeSwitchWidget extends dji.v5.ux.core.base.widget.ConstraintLayoutWidget<java.lang.Boolean> implements dji.v5.ux.util.RtkSettingWatcher.OnEditTextEmptyChangedListener {
    private final dji.v5.ux.accessory.DescSpinnerCell rtkTypeCell = null;
    private final dji.v5.ux.accessory.DescSpinnerCell coordinateSystemCell = null;
    private final android.widget.TextView edHost = null;
    private final android.widget.TextView edPort = null;
    private final android.widget.TextView edUser = null;
    private final android.widget.TextView edMountPoint = null;
    private final android.widget.TextView edPassword = null;
    private final android.widget.Button btSaveRtkInfo = null;
    private final android.widget.LinearLayout customSetting = null;
    private java.util.List<? extends dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource> rtkSourceList;
    private java.util.List<? extends dji.rtk.CoordinateSystem> coordinateSystemList;
    private boolean isMotorsOn = false;
    private dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource currentRTKSource = dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource.UNKNOWN;
    private final dji.v5.ux.util.RtkSettingWatcher textWatcher = null;
    private final int INITIAL_INDEX = -1;
    private int lastSelectedRTKTypeIndex;
    private int lastSelectedCoordinateSystemIndex;
    private final kotlin.Lazy widgetModel$delegate = null;
    private final dji.v5.ux.accessory.DescSpinnerCell.OnItemSelectedListener rtkTypeSelectListener = null;
    private final dji.v5.ux.accessory.DescSpinnerCell.OnItemSelectedListener coordinateSelectListener = null;
    
    @kotlin.jvm.JvmOverloads
    public RTKTypeSwitchWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public RTKTypeSwitchWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public RTKTypeSwitchWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    private final dji.v5.ux.accessory.RTKTypeSwitchWidgetModel getWidgetModel() {
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
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String getIdealDimensionRatioString() {
        return null;
    }
    
    private final void setRTKType(int position) {
    }
    
    private final void updateRTKView() {
    }
    
    private final java.util.List<java.lang.String> getReferenceStationSourceNames(java.util.List<? extends dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource> list) {
        return null;
    }
    
    private final java.util.List<java.lang.String> getCoordinateSystemName(java.util.List<? extends dji.rtk.CoordinateSystem> list) {
        return null;
    }
    
    private final java.lang.String getTip(int position) {
        return null;
    }
    
    @java.lang.Override
    public void isTextEmptyChanged() {
    }
    
    private final void saveRtkCustomUserInfo() {
    }
    
    private final void startRtkCustomNetwork(java.lang.String host, int port, java.lang.String user, java.lang.String pw, java.lang.String mountPint) {
    }
    
    /**
     * 初始化用户设置的自定义网络RTK设置的信息
     */
    private final void initDefaultCustomSetting() {
    }
    
    private final void initDefaultNetRtkUI() {
    }
}