package dji.v5.ux.core.widget.hsi;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\'\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\n\u0010*\u001a\u0004\u0018\u00010+H\u0016J\"\u0010,\u001a\u00020-2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u0010\u0010.\u001a\u00020-2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010/\u001a\u00020-H\u0014J\b\u00100\u001a\u00020-H\u0014J\b\u00101\u001a\u00020-H\u0014J\b\u00102\u001a\u00020-H\u0002J\b\u00103\u001a\u00020-H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\u001c\u0010\"\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\u001c\u0010%\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001c\"\u0004\b\'\u0010\u001eR\u000e\u0010(\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Ldji/v5/ux/core/widget/hsi/AttitudeDisplayWidget;", "Ldji/v5/ux/core/base/widget/ConstraintLayoutWidget;", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mAltitude", "", "mAttitudeDashBoard", "Ldji/v5/ux/core/ui/hsi/dashboard/AttitudeDashBoard;", "getMAttitudeDashBoard", "()Ldji/v5/ux/core/ui/hsi/dashboard/AttitudeDashBoard;", "setMAttitudeDashBoard", "(Ldji/v5/ux/core/ui/hsi/dashboard/AttitudeDashBoard;)V", "mCompositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "mDroneLocation", "Ldji/sdk/keyvalue/value/common/LocationCoordinate2D;", "mHomePointAltitude", "mSpeedZ", "", "mTvAslText", "Landroid/widget/TextView;", "getMTvAslText", "()Landroid/widget/TextView;", "setMTvAslText", "(Landroid/widget/TextView;)V", "mTvAslValue", "getMTvAslValue", "setMTvAslValue", "mTvVsText", "getMTvVsText", "setMTvVsText", "mTvVsValue", "getMTvVsValue", "setMTvVsValue", "widgetModel", "Ldji/v5/ux/core/widget/hsi/AttitudeDisplayModel;", "getIdealDimensionRatioString", "", "initView", "", "loadLayout", "onAttachedToWindow", "onDetachedFromWindow", "reactToModelChanges", "updateAltitude", "updateSpeed", "android-sdk-v5-uxsdk_debug"})
public class AttitudeDisplayWidget extends dji.v5.ux.core.base.widget.ConstraintLayoutWidget<java.lang.Boolean> {
    @org.jetbrains.annotations.Nullable
    private dji.v5.ux.core.ui.hsi.dashboard.AttitudeDashBoard mAttitudeDashBoard;
    @org.jetbrains.annotations.Nullable
    private android.widget.TextView mTvAslText;
    @org.jetbrains.annotations.Nullable
    private android.widget.TextView mTvAslValue;
    @org.jetbrains.annotations.Nullable
    private android.widget.TextView mTvVsText;
    @org.jetbrains.annotations.Nullable
    private android.widget.TextView mTvVsValue;
    
    /**
     * 飞行器相对home点的高度
     */
    private double mAltitude = 0.0;
    
    /**
     * home点的高度
     */
    private double mHomePointAltitude = 0.0;
    
    /**
     * 飞行器垂直速度
     */
    private float mSpeedZ = 0.0F;
    
    /**
     * 飞行器二维坐标
     */
    private dji.sdk.keyvalue.value.common.LocationCoordinate2D mDroneLocation;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable mCompositeDisposable = null;
    private final dji.v5.ux.core.widget.hsi.AttitudeDisplayModel widgetModel = null;
    
    @kotlin.jvm.JvmOverloads
    public AttitudeDisplayWidget(@org.jetbrains.annotations.Nullable
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public AttitudeDisplayWidget(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public AttitudeDisplayWidget(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    @org.jetbrains.annotations.Nullable
    public final dji.v5.ux.core.ui.hsi.dashboard.AttitudeDashBoard getMAttitudeDashBoard() {
        return null;
    }
    
    public final void setMAttitudeDashBoard(@org.jetbrains.annotations.Nullable
    dji.v5.ux.core.ui.hsi.dashboard.AttitudeDashBoard p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.widget.TextView getMTvAslText() {
        return null;
    }
    
    public final void setMTvAslText(@org.jetbrains.annotations.Nullable
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.widget.TextView getMTvAslValue() {
        return null;
    }
    
    public final void setMTvAslValue(@org.jetbrains.annotations.Nullable
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.widget.TextView getMTvVsText() {
        return null;
    }
    
    public final void setMTvVsText(@org.jetbrains.annotations.Nullable
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.widget.TextView getMTvVsValue() {
        return null;
    }
    
    public final void setMTvVsValue(@org.jetbrains.annotations.Nullable
    android.widget.TextView p0) {
    }
    
    @java.lang.Override
    protected void onAttachedToWindow() {
    }
    
    @java.lang.Override
    protected void onDetachedFromWindow() {
    }
    
    private final void updateAltitude() {
    }
    
    private final void updateSpeed() {
    }
    
    @java.lang.Override
    protected void initView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
    }
    
    public void loadLayout(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
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