package dji.v5.ux.core.widget.battery;

import java.lang.System;

/**
 * Battery Widget
 * Widget represents the current state of the aircraft battery.
 * Defaults to showing the aggregate battery percentage for the aircraft unless a dual battery
 * is detected or the user overrides this configuration.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 o2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002opB%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010C\u001a\u00020DH\u0002J\b\u0010E\u001a\u00020DH\u0002J\u0010\u0010F\u001a\u0004\u0018\u00010\u00122\u0006\u0010G\u001a\u00020%J\n\u0010H\u001a\u0004\u0018\u00010\"H\u0016J\u000e\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00020JH\u0016J\u0018\u0010K\u001a\u00020D2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J\"\u0010L\u001a\u00020D2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010M\u001a\u00020DH\u0014J\b\u0010N\u001a\u00020DH\u0014J\b\u0010O\u001a\u00020DH\u0014J\u0010\u0010\u0016\u001a\u00020D2\b\b\u0001\u0010P\u001a\u00020\bJ\b\u0010Q\u001a\u00020DH\u0002J\u0018\u0010R\u001a\u00020D2\u0006\u0010G\u001a\u00020%2\b\u0010S\u001a\u0004\u0018\u00010\u0012J\u0018\u0010R\u001a\u00020D2\u0006\u0010G\u001a\u00020%2\b\b\u0001\u0010P\u001a\u00020\bJ\u0016\u0010T\u001a\u00020D2\u0006\u0010G\u001a\u00020%2\u0006\u0010S\u001a\u00020\u0012J\u001e\u0010T\u001a\u00020D2\u0006\u0010G\u001a\u00020%2\u0006\u0010S\u001a\u00020\u00122\u0006\u0010U\u001a\u00020\"J\u0018\u0010T\u001a\u00020D2\u0006\u0010G\u001a\u00020%2\b\b\u0001\u0010V\u001a\u00020\bJ \u0010T\u001a\u00020D2\u0006\u0010G\u001a\u00020%2\b\b\u0001\u0010V\u001a\u00020\b2\u0006\u0010U\u001a\u00020\"J\u0010\u0010W\u001a\u00020D2\b\b\u0001\u0010X\u001a\u00020\bJ\u0010\u0010Y\u001a\u00020D2\b\b\u0001\u0010X\u001a\u00020\bJ\u0016\u0010Z\u001a\u00020D2\u0006\u0010G\u001a\u00020%2\u0006\u0010[\u001a\u00020\'J\u0018\u0010Z\u001a\u00020D2\u0006\u0010G\u001a\u00020%2\b\b\u0001\u0010\\\u001a\u00020\bJ\u0018\u0010]\u001a\u00020D2\u0006\u0010^\u001a\u00020\r2\u0006\u0010G\u001a\u00020%H\u0002J\u0010\u0010*\u001a\u00020D2\b\b\u0001\u0010P\u001a\u00020\bJ\b\u0010_\u001a\u00020DH\u0002J\u0016\u0010`\u001a\u00020D2\u0006\u0010G\u001a\u00020%2\u0006\u0010S\u001a\u00020\u0012J\u001e\u0010`\u001a\u00020D2\u0006\u0010G\u001a\u00020%2\u0006\u0010S\u001a\u00020\u00122\u0006\u0010U\u001a\u00020\"J\u0018\u0010`\u001a\u00020D2\u0006\u0010G\u001a\u00020%2\b\b\u0001\u0010V\u001a\u00020\bJ \u0010`\u001a\u00020D2\u0006\u0010G\u001a\u00020%2\b\b\u0001\u0010V\u001a\u00020\b2\u0006\u0010U\u001a\u00020\"J\u0010\u0010a\u001a\u00020D2\b\b\u0001\u0010X\u001a\u00020\bJ\u0016\u0010b\u001a\u00020D2\u0006\u0010G\u001a\u00020%2\u0006\u0010[\u001a\u00020\'J\u0018\u0010b\u001a\u00020D2\u0006\u0010G\u001a\u00020%2\b\b\u0001\u0010\\\u001a\u00020\bJ\u0018\u0010c\u001a\u00020D2\u0006\u0010^\u001a\u00020\r2\u0006\u0010G\u001a\u00020%H\u0002J\u0010\u0010d\u001a\u00020D2\u0006\u0010e\u001a\u00020fH\u0002J\b\u0010g\u001a\u00020DH\u0002J\u0010\u0010h\u001a\u00020D2\u0006\u0010e\u001a\u00020iH\u0002J\u0010\u0010j\u001a\u00020D2\u0006\u0010e\u001a\u00020kH\u0002J\u0010\u0010l\u001a\u00020D2\u0006\u0010e\u001a\u00020mH\u0002J\u0010\u0010n\u001a\u00020D2\u0006\u0010e\u001a\u00020kH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R&\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0011\u001a\u00020\u00188F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR&\u0010\u001e\u001a\u00020\u00182\b\b\u0001\u0010\u0011\u001a\u00020\u00188F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u000e\u0010!\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00120$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\'0$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010(\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b)\u0010\u0015\"\u0004\b*\u0010\u0017R&\u0010+\u001a\u00020\u00182\b\b\u0001\u0010\u0011\u001a\u00020\u00188F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010\u001dR\u000e\u0010.\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u00100\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00120$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u00101\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0006\u0012\u0004\u0018\u00010\u00120$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u00102\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\'0$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u00104\u001a\u0002032\u0006\u0010\u0011\u001a\u000203@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001b\u00109\u001a\u00020:8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020@X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010B\u00a8\u0006q"}, d2 = {"Ldji/v5/ux/core/widget/battery/BatteryWidget;", "Ldji/v5/ux/core/base/widget/ConstraintLayoutWidget;", "Ldji/v5/ux/core/widget/battery/BatteryWidget$ModelState;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "batteryIconImageView", "Landroid/widget/ImageView;", "dualBattery1ValueTextView", "Landroid/widget/TextView;", "dualBattery1VoltageTextView", "dualBattery2ValueTextView", "dualBattery2VoltageTextView", "value", "Landroid/graphics/drawable/Drawable;", "dualBatteryPercentageBackground", "getDualBatteryPercentageBackground", "()Landroid/graphics/drawable/Drawable;", "setDualBatteryPercentageBackground", "(Landroid/graphics/drawable/Drawable;)V", "", "dualBatteryPercentageTextSize", "getDualBatteryPercentageTextSize", "()F", "setDualBatteryPercentageTextSize", "(F)V", "dualBatteryVoltageTextSize", "getDualBatteryVoltageTextSize", "setDualBatteryVoltageTextSize", "dualIconDimensionRatio", "", "dualIconStates", "", "Ldji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryStatus;", "percentColorStates", "Landroid/content/res/ColorStateList;", "singleBatteryPercentageBackground", "getSingleBatteryPercentageBackground", "setSingleBatteryPercentageBackground", "singleBatteryPercentageTextSize", "getSingleBatteryPercentageTextSize", "setSingleBatteryPercentageTextSize", "singleBatteryValueTextView", "singleIconDimensionRatio", "singleIconStates", "voltageBackgroundStates", "voltageColorStates", "", "voltageVisibility", "getVoltageVisibility", "()Z", "setVoltageVisibility", "(Z)V", "widgetModel", "Ldji/v5/ux/core/widget/battery/BatteryWidgetModel;", "getWidgetModel", "()Ldji/v5/ux/core/widget/battery/BatteryWidgetModel;", "widgetModel$delegate", "Lkotlin/Lazy;", "widgetSizeDescription", "Ldji/v5/ux/core/base/WidgetSizeDescription;", "getWidgetSizeDescription", "()Ldji/v5/ux/core/base/WidgetSizeDescription;", "checkAndUpdateIconDimensionRatio", "", "checkAndUpdateUI", "getDualBatteryVoltageBackground", "batteryStatus", "getIdealDimensionRatioString", "getWidgetStateUpdate", "Lio/reactivex/rxjava3/core/Flowable;", "initAttributes", "initView", "onAttachedToWindow", "onDetachedFromWindow", "reactToModelChanges", "resourceId", "setDualBatteryUI", "setDualBatteryVoltageBackground", "drawable", "setDualIcon", "ratio", "resource", "setDualPercentTextAppearance", "textAppearance", "setDualVoltageTextAppearance", "setPercentTextColor", "colorStateList", "color", "setPercentageTextColorByState", "textView", "setSingleBatteryUI", "setSingleIcon", "setSinglePercentTextAppearance", "setVoltageTextColor", "setVoltageTextColorByState", "updateAggregateState", "batteryState", "Ldji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryState$AggregateBatteryState;", "updateDisconnectedUI", "updateDualBatteryValues", "Ldji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryState$DualBatteryState;", "updateIconRatio", "Ldji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryState;", "updateSingleBatteryValues", "Ldji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryState$SingleBatteryState;", "updateUI", "Companion", "ModelState", "android-sdk-v5-uxsdk_debug"})
public class BatteryWidget extends dji.v5.ux.core.base.widget.ConstraintLayoutWidget<dji.v5.ux.core.widget.battery.BatteryWidget.ModelState> {
    private final kotlin.Lazy widgetModel$delegate = null;
    private java.lang.String singleIconDimensionRatio;
    private java.lang.String dualIconDimensionRatio;
    private final android.widget.ImageView batteryIconImageView = null;
    private final android.widget.TextView singleBatteryValueTextView = null;
    private final android.widget.TextView dualBattery1ValueTextView = null;
    private final android.widget.TextView dualBattery2ValueTextView = null;
    private final android.widget.TextView dualBattery1VoltageTextView = null;
    private final android.widget.TextView dualBattery2VoltageTextView = null;
    private java.util.Map<dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus, android.content.res.ColorStateList> percentColorStates;
    private java.util.Map<dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus, android.content.res.ColorStateList> voltageColorStates;
    private java.util.Map<dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus, android.graphics.drawable.Drawable> voltageBackgroundStates;
    private java.util.Map<dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus, android.graphics.drawable.Drawable> singleIconStates;
    private java.util.Map<dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus, android.graphics.drawable.Drawable> dualIconStates;
    
    /**
     * Represents visibility of voltage text for dual battery
     */
    private boolean voltageVisibility = true;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.base.WidgetSizeDescription widgetSizeDescription = null;
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.core.widget.battery.BatteryWidget.Companion Companion = null;
    private static final java.lang.String TAG = "BatteryWidget";
    
    @kotlin.jvm.JvmOverloads
    public BatteryWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public BatteryWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public BatteryWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    private final dji.v5.ux.core.widget.battery.BatteryWidgetModel getWidgetModel() {
        return null;
    }
    
    public final boolean getVoltageVisibility() {
        return false;
    }
    
    public final void setVoltageVisibility(boolean value) {
    }
    
    public final float getSingleBatteryPercentageTextSize() {
        return 0.0F;
    }
    
    public final void setSingleBatteryPercentageTextSize(@androidx.annotation.Dimension
    float value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getSingleBatteryPercentageBackground() {
        return null;
    }
    
    public final void setSingleBatteryPercentageBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    public final float getDualBatteryPercentageTextSize() {
        return 0.0F;
    }
    
    public final void setDualBatteryPercentageTextSize(@androidx.annotation.Dimension
    float value) {
    }
    
    public final float getDualBatteryVoltageTextSize() {
        return 0.0F;
    }
    
    public final void setDualBatteryVoltageTextSize(@androidx.annotation.Dimension
    float value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getDualBatteryPercentageBackground() {
        return null;
    }
    
    public final void setDualBatteryPercentageBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
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
    
    private final void updateUI(dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryState batteryState) {
    }
    
    private final void updateDisconnectedUI() {
    }
    
    private final void updateAggregateState(dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryState.AggregateBatteryState batteryState) {
    }
    
    private final void updateSingleBatteryValues(dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryState.SingleBatteryState batteryState) {
    }
    
    private final void updateDualBatteryValues(dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryState.DualBatteryState batteryState) {
    }
    
    private final void setPercentageTextColorByState(android.widget.TextView textView, dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus batteryStatus) {
    }
    
    private final void setVoltageTextColorByState(android.widget.TextView textView, dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus batteryStatus) {
    }
    
    private final void setSingleBatteryUI() {
    }
    
    private final void setDualBatteryUI() {
    }
    
    private final void checkAndUpdateUI() {
    }
    
    private final void checkAndUpdateIconDimensionRatio() {
    }
    
    private final void updateIconRatio(dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryState batteryState) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String getIdealDimensionRatioString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dji.v5.ux.core.base.WidgetSizeDescription getWidgetSizeDescription() {
        return null;
    }
    
    /**
     * Set the single battery icon drawable for the given batteryStatus
     *
     * @param batteryStatus    batteryStatus to apply the change to
     * @param resource drawable resource for the icon
     */
    public final void setSingleIcon(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus batteryStatus, @androidx.annotation.DrawableRes
    int resource) {
    }
    
    /**
     * Set the single battery icon drawable for the given batteryStatus with the given dimension ratio
     *
     * @param batteryStatus    batteryStatus to apply the change to
     * @param resource drawable resource for the icon
     * @param ratio    A String containing the dimension ratio of the single battery icon.
     */
    public final void setSingleIcon(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus batteryStatus, @androidx.annotation.DrawableRes
    int resource, @org.jetbrains.annotations.NotNull
    java.lang.String ratio) {
    }
    
    /**
     * Set the single battery icon drawable for the given batteryStatus
     *
     * @param batteryStatus    batteryStatus to apply the change to
     * @param drawable drawable for the icon
     */
    public final void setSingleIcon(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus batteryStatus, @org.jetbrains.annotations.NotNull
    android.graphics.drawable.Drawable drawable) {
    }
    
    /**
     * Set the single battery icon drawable for the given batteryStatus with the given dimension ratio
     *
     * @param batteryStatus    batteryStatus to apply the change to
     * @param drawable drawable for the icon
     * @param ratio    A String containing the dimension ratio of the single battery icon.
     */
    public final void setSingleIcon(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus batteryStatus, @org.jetbrains.annotations.NotNull
    android.graphics.drawable.Drawable drawable, @org.jetbrains.annotations.NotNull
    java.lang.String ratio) {
    }
    
    /**
     * Set the dual battery icon drawable for the given batteryStatus
     *
     * @param batteryStatus    batteryStatus to apply the change to
     * @param resource drawable resource for the icon
     */
    public final void setDualIcon(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus batteryStatus, @androidx.annotation.DrawableRes
    int resource) {
    }
    
    /**
     * Set the dual battery icon drawable for the given batteryStatus with the given dimension ratio
     *
     * @param batteryStatus    batteryStatus to apply the change to
     * @param resource drawable resource for the icon
     * @param ratio    A String containing the dimension ratio of the dual battery icon.
     */
    public final void setDualIcon(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus batteryStatus, @androidx.annotation.DrawableRes
    int resource, @org.jetbrains.annotations.NotNull
    java.lang.String ratio) {
    }
    
    /**
     * Set the dual battery icon drawable for the given batteryStatus
     *
     * @param batteryStatus    batteryStatus to apply the change to
     * @param drawable drawable for the icon
     */
    public final void setDualIcon(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus batteryStatus, @org.jetbrains.annotations.NotNull
    android.graphics.drawable.Drawable drawable) {
    }
    
    /**
     * Set the dual battery icon drawable for the given batteryStatus with the given dimension ratio
     *
     * @param batteryStatus    batteryStatus to apply the change to
     * @param drawable drawable for the icon
     * @param ratio    A String containing the dimension ratio of the dual battery icon.
     */
    public final void setDualIcon(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus batteryStatus, @org.jetbrains.annotations.NotNull
    android.graphics.drawable.Drawable drawable, @org.jetbrains.annotations.NotNull
    java.lang.String ratio) {
    }
    
    /**
     * Set appearance of the percent text in single battery mode
     *
     * @param textAppearance appearance to apply
     */
    public final void setSinglePercentTextAppearance(@androidx.annotation.StyleRes
    int textAppearance) {
    }
    
    /**
     * Set appearance of the percent text in dual battery mode
     *
     * @param textAppearance appearance to apply
     */
    public final void setDualPercentTextAppearance(@androidx.annotation.StyleRes
    int textAppearance) {
    }
    
    /**
     * Set appearance of the voltage text in dual battery mode
     *
     * @param textAppearance appearance to apply
     */
    public final void setDualVoltageTextAppearance(@androidx.annotation.StyleRes
    int textAppearance) {
    }
    
    /**
     * Set the current color of the percent text view for the given state
     *
     * @param batteryStatus to apply the color to
     * @param color color integer resource to apply
     */
    public final void setPercentTextColor(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus batteryStatus, @androidx.annotation.ColorInt
    int color) {
    }
    
    /**
     * Set current color state list of the percent text view for the given state
     *
     * @param batteryStatus         state to apply the color to
     * @param colorStateList ColorStateList to apply
     */
    public final void setPercentTextColor(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus batteryStatus, @org.jetbrains.annotations.NotNull
    android.content.res.ColorStateList colorStateList) {
    }
    
    /**
     * Set current color of the voltage text view for the given state
     *
     * @param batteryStatus to apply the color to
     * @param color color integer resource to apply
     */
    public final void setVoltageTextColor(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus batteryStatus, @androidx.annotation.ColorInt
    int color) {
    }
    
    /**
     * Set current color state list of the voltage text view for the given state
     *
     * @param batteryStatus         state to apply the color to
     * @param colorStateList ColorStateList to apply
     */
    public final void setVoltageTextColor(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus batteryStatus, @org.jetbrains.annotations.NotNull
    android.content.res.ColorStateList colorStateList) {
    }
    
    /**
     * Set the background of the dual battery percentage text
     *
     * @param resourceId integer id of the resource
     */
    public final void setDualBatteryPercentageBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the background of the dual battery voltage text
     *
     * @param resourceId integer id of the resource
     */
    public final void setDualBatteryVoltageBackground(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus batteryStatus, @androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    public final void setDualBatteryVoltageBackground(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus batteryStatus, @org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable drawable) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getDualBatteryVoltageBackground(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryStatus batteryStatus) {
        return null;
    }
    
    /**
     * Set the background of the single battery percentage text
     *
     * @param resourceId integer id of the resource
     */
    public final void setSingleBatteryPercentageBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    @android.annotation.SuppressLint(value = {"Recycle"})
    private final void initAttributes(android.content.Context context, android.util.AttributeSet attrs) {
    }
    
    /**
     * Get the [ModelState] updates
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.SuppressWarnings(value = {})
    @java.lang.Override
    public io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.widget.battery.BatteryWidget.ModelState> getWidgetStateUpdate() {
        return null;
    }
    
    /**
     * Class defines widget state updates
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Ldji/v5/ux/core/widget/battery/BatteryWidget$ModelState;", "", "()V", "BatteryStateUpdated", "ProductConnected", "Ldji/v5/ux/core/widget/battery/BatteryWidget$ModelState$BatteryStateUpdated;", "Ldji/v5/ux/core/widget/battery/BatteryWidget$ModelState$ProductConnected;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class ModelState {
        
        private ModelState() {
            super();
        }
        
        /**
         * Product connection update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/core/widget/battery/BatteryWidget$ModelState$ProductConnected;", "Ldji/v5/ux/core/widget/battery/BatteryWidget$ModelState;", "isConnected", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductConnected extends dji.v5.ux.core.widget.battery.BatteryWidget.ModelState {
            private final boolean isConnected = false;
            
            /**
             * Product connection update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.battery.BatteryWidget.ModelState.ProductConnected copy(boolean isConnected) {
                return null;
            }
            
            /**
             * Product connection update
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Product connection update
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Product connection update
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public ProductConnected(boolean isConnected) {
                super();
            }
            
            public final boolean component1() {
                return false;
            }
            
            public final boolean isConnected() {
                return false;
            }
        }
        
        /**
         * Battery state update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/core/widget/battery/BatteryWidget$ModelState$BatteryStateUpdated;", "Ldji/v5/ux/core/widget/battery/BatteryWidget$ModelState;", "batteryState", "Ldji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryState;", "(Ldji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryState;)V", "getBatteryState", "()Ldji/v5/ux/core/widget/battery/BatteryWidgetModel$BatteryState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class BatteryStateUpdated extends dji.v5.ux.core.widget.battery.BatteryWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryState batteryState = null;
            
            /**
             * Battery state update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.battery.BatteryWidget.ModelState.BatteryStateUpdated copy(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryState batteryState) {
                return null;
            }
            
            /**
             * Battery state update
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Battery state update
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Battery state update
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public BatteryStateUpdated(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryState batteryState) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryState component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.battery.BatteryWidgetModel.BatteryState getBatteryState() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Ldji/v5/ux/core/widget/battery/BatteryWidget$Companion;", "", "()V", "TAG", "", "android-sdk-v5-uxsdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}