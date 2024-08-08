package dji.v5.ux.core.widget.remainingflighttime;

import java.lang.System;

/**
 * Remaining Flight Time Widget
 *
 * Widget shows the remaining flight time graphically. Data displayed includes
 *
 * 1. Battery charge remaining in percentage
 * 2. Battery required for the aircraft to return home
 * 3. Battery required for the aircraft to land
 * 4. Remaining flight time
 * 5. Serious low battery threshold level
 * 6. Low battery threshold level
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002abB%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ \u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\u00142\u0006\u0010K\u001a\u00020\u0014H\u0002J\u0010\u0010L\u001a\u00020\"2\u0006\u0010M\u001a\u00020\bH\u0002J\b\u0010N\u001a\u00020\"H\u0016J\u000e\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00020PH\u0016J\u0018\u0010Q\u001a\u00020G2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J\b\u0010R\u001a\u00020GH\u0002J\"\u0010S\u001a\u00020G2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010T\u001a\u00020GH\u0014J\b\u0010U\u001a\u00020GH\u0014J\u0010\u0010V\u001a\u00020G2\u0006\u0010H\u001a\u00020IH\u0014J\u0018\u0010W\u001a\u00020G2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[H\u0002J\b\u0010\\\u001a\u00020GH\u0014J\b\u0010]\u001a\u00020^H\u0002J\u0010\u0010_\u001a\u00020G2\u0006\u0010`\u001a\u00020YH\u0002R$\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0015\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u000e\u0010\u0018\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u001a\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000fR$\u0010\u001d\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000fR\u000e\u0010 \u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010%\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b&\u0010\r\"\u0004\b\'\u0010\u000fR\u000e\u0010(\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010)\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b*\u0010\r\"\u0004\b+\u0010\u000fR\u000e\u0010,\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010-\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b.\u0010\r\"\u0004\b/\u0010\u000fR\u000e\u00100\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u00103\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b4\u0010\r\"\u0004\b5\u0010\u000fR\u000e\u00106\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u00109\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b:\u0010\r\"\u0004\b;\u0010\u000fR\u000e\u0010<\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010@\u001a\u00020A8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bB\u0010C\u00a8\u0006c"}, d2 = {"Ldji/v5/ux/core/widget/remainingflighttime/RemainingFlightTimeWidget;", "Ldji/v5/ux/core/base/widget/FrameLayoutWidget;", "Ldji/v5/ux/core/widget/remainingflighttime/RemainingFlightTimeWidget$ModelState;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "color", "batteryChargeRemainingColor", "getBatteryChargeRemainingColor", "()I", "setBatteryChargeRemainingColor", "(I)V", "batteryChargeRemainingPaint", "Landroid/graphics/Paint;", "batteryRequiredToGoHomePaint", "batteryRequiredToGoHomePercentage", "", "batteryRequiredToLandColor", "getBatteryRequiredToLandColor", "setBatteryRequiredToLandColor", "batteryRequiredToLandPaint", "batteryRequiredToLandPercentage", "batteryToReturnHomeColor", "getBatteryToReturnHomeColor", "setBatteryToReturnHomeColor", "flightTimeBackgroundColor", "getFlightTimeBackgroundColor", "setFlightTimeBackgroundColor", "flightTimeRoundedBackgroundPaint", "flightTimeText", "", "flightTimeTextBounds", "Landroid/graphics/Rect;", "flightTimeTextColor", "getFlightTimeTextColor", "setFlightTimeTextColor", "flightTimeTextPaint", "homeLetterBackgroundColor", "getHomeLetterBackgroundColor", "setHomeLetterBackgroundColor", "homeLetterBounds", "homeLetterColor", "getHomeLetterColor", "setHomeLetterColor", "homeLetterPaint", "homeLetterWidth", "homePointBackgroundPaint", "lowBatteryThresholdDotColor", "getLowBatteryThresholdDotColor", "setLowBatteryThresholdDotColor", "lowBatteryThresholdDotPaint", "lowBatteryThresholdPercentage", "remainingBatteryChargePercentage", "seriousLowBatteryThresholdDotColor", "getSeriousLowBatteryThresholdDotColor", "setSeriousLowBatteryThresholdDotColor", "seriousLowBatteryThresholdDotPaint", "seriousLowBatteryThresholdPercentage", "usableViewWidth", "viewHeight", "widgetModel", "Ldji/v5/ux/core/widget/remainingflighttime/RemainingFlightTimeWidgetModel;", "getWidgetModel", "()Ldji/v5/ux/core/widget/remainingflighttime/RemainingFlightTimeWidgetModel;", "widgetModel$delegate", "Lkotlin/Lazy;", "drawFlightText", "", "canvas", "Landroid/graphics/Canvas;", "roundedBgWidth", "textWidth", "getFormattedString", "flightTime", "getIdealDimensionRatioString", "getWidgetStateUpdate", "Lio/reactivex/rxjava3/core/Flowable;", "initAttributes", "initDefaults", "initView", "onAttachedToWindow", "onDetachedFromWindow", "onDraw", "onRemainingFlightTimeChange", "isAircraftFlying", "", "remainingFlightTimeData", "Ldji/v5/ux/core/widget/remainingflighttime/RemainingFlightTimeWidgetModel$RemainingFlightTimeData;", "reactToModelChanges", "reactToRemainingFlightTimeChange", "Lio/reactivex/rxjava3/disposables/Disposable;", "updateVisibility", "isProductConnected", "Companion", "ModelState", "android-sdk-v5-uxsdk_debug"})
public class RemainingFlightTimeWidget extends dji.v5.ux.core.base.widget.FrameLayoutWidget<dji.v5.ux.core.widget.remainingflighttime.RemainingFlightTimeWidget.ModelState> {
    private final kotlin.Lazy widgetModel$delegate = null;
    private final android.graphics.Paint batteryRequiredToLandPaint = null;
    private final android.graphics.Paint batteryChargeRemainingPaint = null;
    private final android.graphics.Paint batteryRequiredToGoHomePaint = null;
    private final android.graphics.Paint flightTimeRoundedBackgroundPaint = null;
    private final android.graphics.Paint flightTimeTextPaint = null;
    private final android.graphics.Paint lowBatteryThresholdDotPaint = null;
    private final android.graphics.Paint seriousLowBatteryThresholdDotPaint = null;
    private final android.graphics.Paint homePointBackgroundPaint = null;
    private final android.graphics.Paint homeLetterPaint = null;
    private java.lang.String flightTimeText = "--:--";
    private final android.graphics.Rect flightTimeTextBounds = null;
    private final android.graphics.Rect homeLetterBounds = null;
    private float batteryRequiredToLandPercentage = 0.0F;
    private float remainingBatteryChargePercentage = 0.0F;
    private float batteryRequiredToGoHomePercentage = 0.0F;
    private float seriousLowBatteryThresholdPercentage = 0.0F;
    private float lowBatteryThresholdPercentage = 0.0F;
    private float viewHeight = 0.0F;
    private float usableViewWidth = 0.0F;
    private float homeLetterWidth = 0.0F;
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.core.widget.remainingflighttime.RemainingFlightTimeWidget.Companion Companion = null;
    private static final java.lang.String TAG = "FlightTimeWidget";
    private static final java.lang.String DISCONNECTED_STRING = "--:--";
    private static final java.lang.String MINUTE_FLIGHT_TIME_FORMAT_STRING = "%02d:%02d";
    private static final java.lang.String HOUR_FLIGHT_TIME_FORMAT_STRING = "%01d:%02d:%02d";
    private static final int MINUTE_CONVERSION_CONSTANT = 60;
    private static final int HOUR_CONVERSION_CONSTANT = 3600;
    
    @kotlin.jvm.JvmOverloads
    public RemainingFlightTimeWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public RemainingFlightTimeWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public RemainingFlightTimeWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    private final dji.v5.ux.core.widget.remainingflighttime.RemainingFlightTimeWidgetModel getWidgetModel() {
        return null;
    }
    
    public final int getBatteryChargeRemainingColor() {
        return 0;
    }
    
    public final void setBatteryChargeRemainingColor(int color) {
    }
    
    public final int getBatteryToReturnHomeColor() {
        return 0;
    }
    
    public final void setBatteryToReturnHomeColor(int color) {
    }
    
    public final int getBatteryRequiredToLandColor() {
        return 0;
    }
    
    public final void setBatteryRequiredToLandColor(int color) {
    }
    
    public final int getSeriousLowBatteryThresholdDotColor() {
        return 0;
    }
    
    public final void setSeriousLowBatteryThresholdDotColor(int color) {
    }
    
    public final int getLowBatteryThresholdDotColor() {
        return 0;
    }
    
    public final void setLowBatteryThresholdDotColor(int color) {
    }
    
    public final int getFlightTimeTextColor() {
        return 0;
    }
    
    public final void setFlightTimeTextColor(int color) {
    }
    
    public final int getFlightTimeBackgroundColor() {
        return 0;
    }
    
    public final void setFlightTimeBackgroundColor(int color) {
    }
    
    public final int getHomeLetterColor() {
        return 0;
    }
    
    public final void setHomeLetterColor(int color) {
    }
    
    public final int getHomeLetterBackgroundColor() {
        return 0;
    }
    
    public final void setHomeLetterBackgroundColor(int color) {
    }
    
    @java.lang.Override
    protected void initView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
    }
    
    @java.lang.Override
    protected void onDraw(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas) {
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
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getIdealDimensionRatioString() {
        return null;
    }
    
    private final void updateVisibility(boolean isProductConnected) {
    }
    
    private final void drawFlightText(android.graphics.Canvas canvas, float roundedBgWidth, float textWidth) {
    }
    
    private final io.reactivex.rxjava3.disposables.Disposable reactToRemainingFlightTimeChange() {
        return null;
    }
    
    private final void onRemainingFlightTimeChange(boolean isAircraftFlying, dji.v5.ux.core.widget.remainingflighttime.RemainingFlightTimeWidgetModel.RemainingFlightTimeData remainingFlightTimeData) {
    }
    
    private final java.lang.String getFormattedString(int flightTime) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"Recycle"})
    private final void initAttributes(android.content.Context context, android.util.AttributeSet attrs) {
    }
    
    private final void initDefaults() {
    }
    
    /**
     * Get the [ModelState] updates
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.SuppressWarnings(value = {})
    @java.lang.Override
    public io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.widget.remainingflighttime.RemainingFlightTimeWidget.ModelState> getWidgetStateUpdate() {
        return null;
    }
    
    /**
     * Class defines the widget state updates
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Ldji/v5/ux/core/widget/remainingflighttime/RemainingFlightTimeWidget$ModelState;", "", "()V", "AircraftFlyingUpdated", "FlightTimeDataUpdated", "ProductConnected", "Ldji/v5/ux/core/widget/remainingflighttime/RemainingFlightTimeWidget$ModelState$AircraftFlyingUpdated;", "Ldji/v5/ux/core/widget/remainingflighttime/RemainingFlightTimeWidget$ModelState$FlightTimeDataUpdated;", "Ldji/v5/ux/core/widget/remainingflighttime/RemainingFlightTimeWidget$ModelState$ProductConnected;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class ModelState {
        
        private ModelState() {
            super();
        }
        
        /**
         * Product connection update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/core/widget/remainingflighttime/RemainingFlightTimeWidget$ModelState$ProductConnected;", "Ldji/v5/ux/core/widget/remainingflighttime/RemainingFlightTimeWidget$ModelState;", "isConnected", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductConnected extends dji.v5.ux.core.widget.remainingflighttime.RemainingFlightTimeWidget.ModelState {
            private final boolean isConnected = false;
            
            /**
             * Product connection update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.remainingflighttime.RemainingFlightTimeWidget.ModelState.ProductConnected copy(boolean isConnected) {
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
         * Aircraft flying status change update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/core/widget/remainingflighttime/RemainingFlightTimeWidget$ModelState$AircraftFlyingUpdated;", "Ldji/v5/ux/core/widget/remainingflighttime/RemainingFlightTimeWidget$ModelState;", "isAircraftFlying", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class AircraftFlyingUpdated extends dji.v5.ux.core.widget.remainingflighttime.RemainingFlightTimeWidget.ModelState {
            private final boolean isAircraftFlying = false;
            
            /**
             * Aircraft flying status change update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.remainingflighttime.RemainingFlightTimeWidget.ModelState.AircraftFlyingUpdated copy(boolean isAircraftFlying) {
                return null;
            }
            
            /**
             * Aircraft flying status change update
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Aircraft flying status change update
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Aircraft flying status change update
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public AircraftFlyingUpdated(boolean isAircraftFlying) {
                super();
            }
            
            public final boolean component1() {
                return false;
            }
            
            public final boolean isAircraftFlying() {
                return false;
            }
        }
        
        /**
         * Remaining flight time data update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/core/widget/remainingflighttime/RemainingFlightTimeWidget$ModelState$FlightTimeDataUpdated;", "Ldji/v5/ux/core/widget/remainingflighttime/RemainingFlightTimeWidget$ModelState;", "remainingFlightTimeData", "Ldji/v5/ux/core/widget/remainingflighttime/RemainingFlightTimeWidgetModel$RemainingFlightTimeData;", "(Ldji/v5/ux/core/widget/remainingflighttime/RemainingFlightTimeWidgetModel$RemainingFlightTimeData;)V", "getRemainingFlightTimeData", "()Ldji/v5/ux/core/widget/remainingflighttime/RemainingFlightTimeWidgetModel$RemainingFlightTimeData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class FlightTimeDataUpdated extends dji.v5.ux.core.widget.remainingflighttime.RemainingFlightTimeWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.widget.remainingflighttime.RemainingFlightTimeWidgetModel.RemainingFlightTimeData remainingFlightTimeData = null;
            
            /**
             * Remaining flight time data update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.remainingflighttime.RemainingFlightTimeWidget.ModelState.FlightTimeDataUpdated copy(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.widget.remainingflighttime.RemainingFlightTimeWidgetModel.RemainingFlightTimeData remainingFlightTimeData) {
                return null;
            }
            
            /**
             * Remaining flight time data update
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Remaining flight time data update
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Remaining flight time data update
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public FlightTimeDataUpdated(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.widget.remainingflighttime.RemainingFlightTimeWidgetModel.RemainingFlightTimeData remainingFlightTimeData) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.remainingflighttime.RemainingFlightTimeWidgetModel.RemainingFlightTimeData component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.remainingflighttime.RemainingFlightTimeWidgetModel.RemainingFlightTimeData getRemainingFlightTimeData() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Ldji/v5/ux/core/widget/remainingflighttime/RemainingFlightTimeWidget$Companion;", "", "()V", "DISCONNECTED_STRING", "", "HOUR_CONVERSION_CONSTANT", "", "HOUR_FLIGHT_TIME_FORMAT_STRING", "MINUTE_CONVERSION_CONSTANT", "MINUTE_FLIGHT_TIME_FORMAT_STRING", "TAG", "android-sdk-v5-uxsdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}