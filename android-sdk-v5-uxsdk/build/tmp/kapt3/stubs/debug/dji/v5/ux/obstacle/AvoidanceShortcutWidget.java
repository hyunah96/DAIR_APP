package dji.v5.ux.obstacle;

import java.lang.System;

/**
 * Description : 用于快捷设置所有避障状态，一键刹停/关闭/绕行
 *
 *
 * @author: Byte.Cai
 * date : 2023/8/11
 *
 * Copyright (c) 2022, DJI All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u000278B\u001b\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0011H\u0002J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110 H\u0002J\n\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\"\u0010#\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010%\u001a\u00020\u0016H\u0014J\b\u0010&\u001a\u00020$H\u0014J\b\u0010\'\u001a\u00020$H\u0014J\u0012\u0010(\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010*\u001a\u00020$2\b\u0010+\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010,\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010-\u001a\u00020$H\u0014J\b\u0010.\u001a\u00020$H\u0002J\u0010\u0010/\u001a\u00020$2\u0006\u0010+\u001a\u00020\u0004H\u0002J\u0010\u00100\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020\u0011H\u0002J\u0010\u00101\u001a\u00020$2\u0006\u00102\u001a\u00020\"H\u0002J\u0010\u00103\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020\u0011H\u0002J\b\u00104\u001a\u00020$H\u0002J\b\u00105\u001a\u00020$H\u0002J\f\u00106\u001a\u00020\"*\u00020\u0013H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a\u00a8\u00069"}, d2 = {"Ldji/v5/ux/obstacle/AvoidanceShortcutWidget;", "Ldji/v5/ux/core/base/widget/ConstraintLayoutWidget;", "Ldji/v5/ux/obstacle/AvoidanceShortcutWidget$ModelState;", "Lcom/google/android/material/tabs/TabLayout$BaseOnTabSelectedListener;", "Lcom/google/android/material/tabs/TabLayout$Tab;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "apasDesc", "Landroid/widget/TextView;", "apasTab", "Lcom/google/android/material/tabs/TabLayout;", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "currentMode", "Ldji/v5/manager/aircraft/perception/data/ObstacleAvoidanceType;", "flightMode", "Ldji/sdk/keyvalue/value/flightcontroller/FCFlightMode;", "tabItemResMap", "", "", "widgetModel", "Ldji/v5/ux/obstacle/AvoidanceShortcutWidgetModel;", "getWidgetModel", "()Ldji/v5/ux/obstacle/AvoidanceShortcutWidgetModel;", "widgetModel$delegate", "Lkotlin/Lazy;", "generateTabItem", "type", "getAPASModeRange", "", "getIdealDimensionRatioString", "", "initView", "", "defStyleAttr", "onAttachedToWindow", "onDetachedFromWindow", "onTabReselected", "p0", "onTabSelected", "tab", "onTabUnselected", "reactToModelChanges", "revertObstacleAction", "selectTab", "setObstacleAction", "showToast", "msg", "updateSelectTab", "updateTabByMode", "updateTabItems", "getFlightModeString", "Companion", "ModelState", "android-sdk-v5-uxsdk_debug"})
public final class AvoidanceShortcutWidget extends dji.v5.ux.core.base.widget.ConstraintLayoutWidget<dji.v5.ux.obstacle.AvoidanceShortcutWidget.ModelState> implements com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener<com.google.android.material.tabs.TabLayout.Tab> {
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.obstacle.AvoidanceShortcutWidget.Companion Companion = null;
    private static final java.lang.String TAG = "AvoidanceShortcutWidget";
    private com.google.android.material.tabs.TabLayout apasTab;
    private android.widget.TextView apasDesc;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable = null;
    private dji.sdk.keyvalue.value.flightcontroller.FCFlightMode flightMode = dji.sdk.keyvalue.value.flightcontroller.FCFlightMode.UNKNOWN;
    private final java.util.Map<dji.v5.manager.aircraft.perception.data.ObstacleAvoidanceType, java.lang.Integer> tabItemResMap = null;
    private dji.v5.manager.aircraft.perception.data.ObstacleAvoidanceType currentMode = dji.v5.manager.aircraft.perception.data.ObstacleAvoidanceType.CLOSE;
    private final kotlin.Lazy widgetModel$delegate = null;
    
    @kotlin.jvm.JvmOverloads
    public AvoidanceShortcutWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public AvoidanceShortcutWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    private final dji.v5.ux.obstacle.AvoidanceShortcutWidgetModel getWidgetModel() {
        return null;
    }
    
    @java.lang.Override
    protected void onAttachedToWindow() {
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
    protected void onDetachedFromWindow() {
    }
    
    @java.lang.Override
    public void onTabSelected(@org.jetbrains.annotations.Nullable
    com.google.android.material.tabs.TabLayout.Tab tab) {
    }
    
    @java.lang.Override
    public void onTabUnselected(@org.jetbrains.annotations.Nullable
    com.google.android.material.tabs.TabLayout.Tab p0) {
    }
    
    @java.lang.Override
    public void onTabReselected(@org.jetbrains.annotations.Nullable
    com.google.android.material.tabs.TabLayout.Tab p0) {
    }
    
    private final void selectTab(com.google.android.material.tabs.TabLayout.Tab tab) {
    }
    
    private final void setObstacleAction(dji.v5.manager.aircraft.perception.data.ObstacleAvoidanceType type) {
    }
    
    private final void revertObstacleAction() {
    }
    
    private final void updateTabItems() {
    }
    
    private final void updateTabByMode() {
    }
    
    private final void updateSelectTab(dji.v5.manager.aircraft.perception.data.ObstacleAvoidanceType type) {
    }
    
    private final com.google.android.material.tabs.TabLayout.Tab generateTabItem(dji.v5.manager.aircraft.perception.data.ObstacleAvoidanceType type) {
        return null;
    }
    
    /**
     * 动态添加APAS子控件
     */
    private final java.util.List<dji.v5.manager.aircraft.perception.data.ObstacleAvoidanceType> getAPASModeRange() {
        return null;
    }
    
    private final java.lang.String getFlightModeString(dji.sdk.keyvalue.value.flightcontroller.FCFlightMode $this$getFlightModeString) {
        return null;
    }
    
    private final void showToast(java.lang.String msg) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String getIdealDimensionRatioString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/obstacle/AvoidanceShortcutWidget$ModelState;", "", "()V", "android-sdk-v5-uxsdk_debug"})
    public static abstract class ModelState {
        
        private ModelState() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Ldji/v5/ux/obstacle/AvoidanceShortcutWidget$Companion;", "", "()V", "TAG", "", "android-sdk-v5-uxsdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}