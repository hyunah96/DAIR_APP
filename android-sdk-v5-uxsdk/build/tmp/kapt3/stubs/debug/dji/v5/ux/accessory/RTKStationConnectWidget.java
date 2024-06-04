package dji.v5.ux.accessory;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B%\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010-\u001a\u00020\u00022\u000e\u0010.\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/H\u0002J\u0012\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0019H\u0002J\n\u00104\u001a\u0004\u0018\u000105H\u0016J\u0012\u00106\u001a\u0002022\b\u00107\u001a\u0004\u0018\u000108H\u0002J\u0018\u00109\u001a\u0002022\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010/H\u0002J\b\u0010:\u001a\u000202H\u0002J\"\u0010;\u001a\u0002022\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0014J\b\u0010<\u001a\u00020\u0002H\u0002J\b\u0010=\u001a\u000202H\u0014J\u0012\u0010>\u001a\u0002022\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\b\u0010A\u001a\u000202H\u0014J\u001a\u0010B\u001a\u0002022\b\u0010C\u001a\u0004\u0018\u00010@2\u0006\u0010D\u001a\u00020\nH\u0016J\b\u0010E\u001a\u000202H\u0014J\b\u0010F\u001a\u000202H\u0002J\u0010\u0010G\u001a\u0002022\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010H\u001a\u000202H\u0002J\u0012\u0010I\u001a\u0002022\b\u0010J\u001a\u0004\u0018\u00010\u0011H\u0002J\u0010\u0010K\u001a\u0002022\u0006\u0010L\u001a\u00020\u0002H\u0002J\u0016\u0010M\u001a\u000202*\u00020\u001f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\'\u001a\u00020(8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b)\u0010*\u00a8\u0006N"}, d2 = {"Ldji/v5/ux/accessory/RTKStationConnectWidget;", "Ldji/v5/ux/core/base/widget/ConstraintLayoutWidget;", "", "Ldji/v5/ux/accessory/data/RtkStationScanAdapter$OnItemClickListener;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "SCAN_TIME_OUT", "", "checkReasonTv", "Landroid/widget/TextView;", "connectState", "Ldji/sdk/keyvalue/value/rtkbasestation/RTKStationConnetState;", "firstEnter", "isMotorOn", "rtkStationScanAdapter", "Ldji/v5/ux/accessory/data/RtkStationScanAdapter;", "scanHandler", "Landroid/os/Handler;", "scanTimeOutDisposable", "Lio/reactivex/rxjava3/disposables/Disposable;", "searchBt", "Landroid/widget/Button;", "searchIv", "Landroid/widget/ImageView;", "selectedRTKStationConnectInfo", "Ldji/v5/ux/accessory/data/DJIRTKBaseStationConnectInfo;", "stationHasNotFoundView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "stationList", "Ljava/util/ArrayList;", "stationListView", "Landroidx/recyclerview/widget/RecyclerView;", "stationScanningView", "widgetModel", "Ldji/v5/ux/accessory/RTKStationConnectWidgetModel;", "getWidgetModel", "()Ldji/v5/ux/accessory/RTKStationConnectWidgetModel;", "widgetModel$delegate", "Lkotlin/Lazy;", "checkNeedUpdateUI", "list", "", "Ldji/sdk/keyvalue/value/rtkbasestation/RTKStationInfo;", "disposeTimeout", "", "timeOutDisposable", "getIdealDimensionRatioString", "", "handleReconnectedStationInfo", "infoConnected", "Ldji/v5/manager/aircraft/rtk/station/ConnectedRTKStationInfo;", "handleStationRTKList", "initCheckReasonContent", "initView", "isHasFoundRTK", "onAttachedToWindow", "onClick", "v", "Landroid/view/View;", "onDetachedFromWindow", "onItemClick", "view", "position", "reactToModelChanges", "scanTimeOut", "startConnectStation", "startScanning", "updateConnectStatus", "rtkBaseStationConnectState", "updateRefreshUI", "boolean", "refresh", "android-sdk-v5-uxsdk_debug"})
public final class RTKStationConnectWidget extends dji.v5.ux.core.base.widget.ConstraintLayoutWidget<java.lang.Boolean> implements dji.v5.ux.accessory.data.RtkStationScanAdapter.OnItemClickListener, android.view.View.OnClickListener {
    private dji.v5.ux.accessory.data.RtkStationScanAdapter rtkStationScanAdapter;
    private final java.util.ArrayList<dji.v5.ux.accessory.data.DJIRTKBaseStationConnectInfo> stationList = null;
    private final android.widget.Button searchBt = null;
    private final android.widget.TextView checkReasonTv = null;
    private final android.widget.ImageView searchIv = null;
    private final androidx.recyclerview.widget.RecyclerView stationListView = null;
    private final androidx.constraintlayout.widget.ConstraintLayout stationScanningView = null;
    private final androidx.constraintlayout.widget.ConstraintLayout stationHasNotFoundView = null;
    private dji.sdk.keyvalue.value.rtkbasestation.RTKStationConnetState connectState = dji.sdk.keyvalue.value.rtkbasestation.RTKStationConnetState.UNKNOWN;
    private final android.os.Handler scanHandler = null;
    private io.reactivex.rxjava3.disposables.Disposable scanTimeOutDisposable;
    private boolean isMotorOn = false;
    private boolean firstEnter = false;
    private final double SCAN_TIME_OUT = 5.0;
    private final kotlin.Lazy widgetModel$delegate = null;
    
    /**
     * 选中某个基站,注意这里selectedRTKStationConnectInfo不能初始化为null
     */
    private dji.v5.ux.accessory.data.DJIRTKBaseStationConnectInfo selectedRTKStationConnectInfo;
    
    @kotlin.jvm.JvmOverloads
    public RTKStationConnectWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public RTKStationConnectWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public RTKStationConnectWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    private final dji.v5.ux.accessory.RTKStationConnectWidgetModel getWidgetModel() {
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
    
    /**
     * 初始化CheckReason View的属性
     */
    private final void initCheckReasonContent() {
    }
    
    @java.lang.Override
    protected void onDetachedFromWindow() {
    }
    
    @java.lang.Override
    public void onClick(@org.jetbrains.annotations.Nullable
    android.view.View v) {
    }
    
    @java.lang.Override
    protected void reactToModelChanges() {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String getIdealDimensionRatioString() {
        return null;
    }
    
    private final void updateRefreshUI(boolean p0_32355860) {
    }
    
    private final void handleStationRTKList(java.util.List<dji.v5.ux.accessory.data.DJIRTKBaseStationConnectInfo> list) {
    }
    
    private final void updateConnectStatus(dji.sdk.keyvalue.value.rtkbasestation.RTKStationConnetState rtkBaseStationConnectState) {
    }
    
    private final boolean checkNeedUpdateUI(java.util.List<? extends dji.sdk.keyvalue.value.rtkbasestation.RTKStationInfo> list) {
        return false;
    }
    
    @java.lang.Override
    public void onItemClick(@org.jetbrains.annotations.Nullable
    android.view.View view, int position) {
    }
    
    private final void refresh(dji.v5.ux.accessory.data.DJIRTKBaseStationConnectInfo $this$refresh, dji.sdk.keyvalue.value.rtkbasestation.RTKStationConnetState connectState) {
    }
    
    private final void startConnectStation(dji.v5.ux.accessory.data.DJIRTKBaseStationConnectInfo selectedRTKStationConnectInfo) {
    }
    
    private final void startScanning() {
    }
    
    private final void scanTimeOut() {
    }
    
    private final boolean isHasFoundRTK() {
        return false;
    }
    
    /**
     * 关闭计时器
     */
    private final void disposeTimeout(io.reactivex.rxjava3.disposables.Disposable timeOutDisposable) {
    }
    
    private final void handleReconnectedStationInfo(dji.v5.manager.aircraft.rtk.station.ConnectedRTKStationInfo infoConnected) {
    }
}