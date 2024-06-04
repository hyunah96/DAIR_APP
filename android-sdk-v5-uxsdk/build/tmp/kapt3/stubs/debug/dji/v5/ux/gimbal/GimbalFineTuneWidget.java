package dji.v5.ux.gimbal;

import java.lang.System;

/**
 * This widget is used to manually fine-tune the gimbal
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u00016B%\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010(\u001a\u00020)H\u0016J\"\u0010*\u001a\u00020+2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0014J\b\u0010,\u001a\u00020+H\u0014J\u0010\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020+H\u0014J\b\u00101\u001a\u00020+H\u0014J\u0010\u00102\u001a\u00020+2\u0006\u00103\u001a\u00020)H\u0016J\u0010\u00104\u001a\u00020+2\u0006\u00105\u001a\u00020\rH\u0002R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010\u001aR\u000e\u0010 \u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u000e\u0010\'\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2 = {"Ldji/v5/ux/gimbal/GimbalFineTuneWidget;", "Ldji/v5/ux/core/base/widget/ConstraintLayoutWidget;", "", "Landroid/view/View$OnClickListener;", "Ldji/v5/ux/core/base/IGimbalIndex;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "currentAxis", "Ldji/sdk/keyvalue/value/gimbal/PostureFineTuneAxis;", "getCurrentAxis", "()Ldji/sdk/keyvalue/value/gimbal/PostureFineTuneAxis;", "setCurrentAxis", "(Ldji/sdk/keyvalue/value/gimbal/PostureFineTuneAxis;)V", "imgMinus", "Landroid/widget/ImageView;", "imgPlus", "pitchDegree", "", "getPitchDegree", "()D", "setPitchDegree", "(D)V", "pitchTv", "Landroid/widget/TextView;", "rollDegree", "getRollDegree", "setRollDegree", "rollTv", "tvValue", "widgetModel", "Ldji/v5/ux/gimbal/GimbalFineTuneWidgetModel;", "yawDegree", "getYawDegree", "setYawDegree", "yawTv", "getGimbalIndex", "Ldji/v5/ux/core/util/SettingDefinitions$GimbalIndex;", "initView", "", "onAttachedToWindow", "onClick", "v", "Landroid/view/View;", "onDetachedFromWindow", "reactToModelChanges", "updateGimbalIndex", "gimbalIndex", "updateViewForType", "type", "Companion", "android-sdk-v5-uxsdk_debug"})
public class GimbalFineTuneWidget extends dji.v5.ux.core.base.widget.ConstraintLayoutWidget<java.lang.Object> implements android.view.View.OnClickListener, dji.v5.ux.core.base.IGimbalIndex {
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.gimbal.GimbalFineTuneWidget.Companion Companion = null;
    private static final java.lang.String TAG = "GimbalFineTuneWidget";
    private static final dji.sdk.keyvalue.value.gimbal.PostureFineTuneAxis GIMBAL_PITCH_FINE_TUNE = dji.sdk.keyvalue.value.gimbal.PostureFineTuneAxis.PITCH_AXIS;
    private static final dji.sdk.keyvalue.value.gimbal.PostureFineTuneAxis GIMBAL_ROLL_FINE_TUNE = dji.sdk.keyvalue.value.gimbal.PostureFineTuneAxis.ROLL_AXIS;
    private static final dji.sdk.keyvalue.value.gimbal.PostureFineTuneAxis GIMBAL_YAW_FINE_TUNE = dji.sdk.keyvalue.value.gimbal.PostureFineTuneAxis.YAW_AXIS;
    private final dji.v5.ux.gimbal.GimbalFineTuneWidgetModel widgetModel = null;
    private final android.widget.TextView pitchTv = null;
    private final android.widget.TextView rollTv = null;
    private final android.widget.TextView yawTv = null;
    private final android.widget.ImageView imgMinus = null;
    private final android.widget.TextView tvValue = null;
    private final android.widget.ImageView imgPlus = null;
    private double rollDegree = 0.0;
    private double pitchDegree = 0.0;
    private double yawDegree = 0.0;
    @org.jetbrains.annotations.NotNull
    private dji.sdk.keyvalue.value.gimbal.PostureFineTuneAxis currentAxis = dji.sdk.keyvalue.value.gimbal.PostureFineTuneAxis.PITCH_AXIS;
    
    @kotlin.jvm.JvmOverloads
    public GimbalFineTuneWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public GimbalFineTuneWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public GimbalFineTuneWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    public final double getRollDegree() {
        return 0.0;
    }
    
    public final void setRollDegree(double p0) {
    }
    
    public final double getPitchDegree() {
        return 0.0;
    }
    
    public final void setPitchDegree(double p0) {
    }
    
    public final double getYawDegree() {
        return 0.0;
    }
    
    public final void setYawDegree(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.sdk.keyvalue.value.gimbal.PostureFineTuneAxis getCurrentAxis() {
        return null;
    }
    
    public final void setCurrentAxis(@org.jetbrains.annotations.NotNull
    dji.sdk.keyvalue.value.gimbal.PostureFineTuneAxis p0) {
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
    
    @java.lang.Override
    public void onClick(@org.jetbrains.annotations.NotNull
    android.view.View v) {
    }
    
    private final void updateViewForType(dji.sdk.keyvalue.value.gimbal.PostureFineTuneAxis type) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dji.v5.ux.core.util.SettingDefinitions.GimbalIndex getGimbalIndex() {
        return null;
    }
    
    @java.lang.Override
    public void updateGimbalIndex(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.util.SettingDefinitions.GimbalIndex gimbalIndex) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Ldji/v5/ux/gimbal/GimbalFineTuneWidget$Companion;", "", "()V", "GIMBAL_PITCH_FINE_TUNE", "Ldji/sdk/keyvalue/value/gimbal/PostureFineTuneAxis;", "GIMBAL_ROLL_FINE_TUNE", "GIMBAL_YAW_FINE_TUNE", "TAG", "", "android-sdk-v5-uxsdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}