package dji.v5.ux.core.widget.hsi;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001/B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\n\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001eH\u0002J\u0018\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"H\u0002J\"\u0010#\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u0010\u0010%\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020\u0004H\u0014J\b\u0010&\u001a\u00020$H\u0014J\b\u0010\'\u001a\u00020$H\u0014J\u0010\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020\bH\u0002J\b\u0010*\u001a\u00020$H\u0014J(\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020.2\u0006\u0010!\u001a\u00020\"H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u00020\b8\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Ldji/v5/ux/core/widget/hsi/SpeedDisplayWidget;", "Ldji/v5/ux/core/base/widget/ConstraintLayoutWidget;", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mCompositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "mIsAnimating", "mListener", "Ldji/v5/ux/core/ui/hsi/FlashTimer$Listener;", "mSpeedDashBoard", "Ldji/v5/ux/core/ui/hsi/dashboard/SpeedDashBoard;", "getMSpeedDashBoard", "()Ldji/v5/ux/core/ui/hsi/dashboard/SpeedDashBoard;", "setMSpeedDashBoard", "(Ldji/v5/ux/core/ui/hsi/dashboard/SpeedDashBoard;)V", "mTvWsValue", "Landroid/widget/TextView;", "mWindTextColor", "widgetModel", "Ldji/v5/ux/core/widget/hsi/SpeedDisplayModel;", "getIdealDimensionRatioString", "", "getWindDegree", "fcWindDirectionStatus", "Ldji/sdk/keyvalue/value/flightcontroller/WindDirection;", "getWindDirectionText", "windDirection", "aircraftDegree", "", "initView", "", "loadLayout", "onAttachedToWindow", "onDetachedFromWindow", "postTvWsVisibility", "visible", "reactToModelChanges", "updateWindStatus", "windSpeed", "fcWindWarning", "Ldji/sdk/keyvalue/value/flightcontroller/WindWarning;", "Companion", "android-sdk-v5-uxsdk_debug"})
public class SpeedDisplayWidget extends dji.v5.ux.core.base.widget.ConstraintLayoutWidget<java.lang.Boolean> {
    @android.view.ViewDebug.ExportedProperty(category = "dji", formatToHexString = true)
    private final int mWindTextColor = 0;
    private android.widget.TextView mTvWsValue;
    private boolean mIsAnimating = false;
    @org.jetbrains.annotations.Nullable
    private dji.v5.ux.core.ui.hsi.dashboard.SpeedDashBoard mSpeedDashBoard;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable mCompositeDisposable = null;
    private dji.v5.ux.core.ui.hsi.FlashTimer.Listener mListener;
    private final dji.v5.ux.core.widget.hsi.SpeedDisplayModel widgetModel = null;
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.core.widget.hsi.SpeedDisplayWidget.Companion Companion = null;
    private static final java.lang.String TAG = null;
    
    @kotlin.jvm.JvmOverloads
    public SpeedDisplayWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public SpeedDisplayWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public SpeedDisplayWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    @org.jetbrains.annotations.Nullable
    public final dji.v5.ux.core.ui.hsi.dashboard.SpeedDashBoard getMSpeedDashBoard() {
        return null;
    }
    
    public final void setMSpeedDashBoard(@org.jetbrains.annotations.Nullable
    dji.v5.ux.core.ui.hsi.dashboard.SpeedDashBoard p0) {
    }
    
    @java.lang.Override
    protected void initView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
    }
    
    protected void loadLayout(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
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
    
    private final void postTvWsVisibility(int visible) {
    }
    
    private final void updateWindStatus(float windSpeed, dji.sdk.keyvalue.value.flightcontroller.WindDirection fcWindDirectionStatus, dji.sdk.keyvalue.value.flightcontroller.WindWarning fcWindWarning, float aircraftDegree) {
    }
    
    private final java.lang.String getWindDirectionText(dji.sdk.keyvalue.value.flightcontroller.WindDirection fcWindDirectionStatus, float aircraftDegree) {
        return null;
    }
    
    private final java.lang.String getWindDirectionText(dji.sdk.keyvalue.value.flightcontroller.WindDirection windDirection) {
        return null;
    }
    
    private final int getWindDegree(dji.sdk.keyvalue.value.flightcontroller.WindDirection fcWindDirectionStatus) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Ldji/v5/ux/core/widget/hsi/SpeedDisplayWidget$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "android-sdk-v5-uxsdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}