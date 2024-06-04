package dji.v5.ux.core.widget.systemstatus;

import java.lang.System;

/**
 * This widget shows the system status of the aircraft.
 *
 * The WarningStatusItem received by this widget contains the message to be
 * displayed, the warning level and the urgency of the message.
 *
 * The color of the background changes depending on the severity of the
 * status as determined by the WarningLevel. The UI also reacts
 * to the urgency of the message by causing the background to blink.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003_`aB%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0002J\b\u0010:\u001a\u000207H\u0002J\u001a\u0010;\u001a\u0004\u0018\u00010<2\u0006\u0010=\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020?H\u0002J\n\u0010@\u001a\u0004\u0018\u00010<H\u0016J\u0010\u0010A\u001a\u0004\u0018\u00010\r2\u0006\u0010B\u001a\u00020\fJ\u0010\u0010C\u001a\u00020\b2\u0006\u0010B\u001a\u00020\fH\u0007J\f\u0010D\u001a\b\u0012\u0004\u0012\u00020*0EJ\u000e\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00020EH\u0016J\u0018\u0010G\u001a\u0002072\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J\"\u0010H\u001a\u0002072\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u0012\u0010I\u001a\u0002092\b\u0010J\u001a\u0004\u0018\u00010<H\u0002J\b\u0010K\u001a\u000207H\u0014J\b\u0010L\u001a\u000207H\u0014J\b\u0010M\u001a\u00020NH\u0002J\b\u0010O\u001a\u000207H\u0014J\u0010\u0010P\u001a\u0002072\b\u0010Q\u001a\u0004\u0018\u00010\rJ\u0018\u0010P\u001a\u0002072\u0006\u0010B\u001a\u00020\f2\b\u0010Q\u001a\u0004\u0018\u00010\rJ\u0010\u0010R\u001a\u0002072\b\b\u0001\u0010S\u001a\u00020\bJ\u0018\u0010T\u001a\u0002072\u0006\u0010B\u001a\u00020\f2\b\b\u0001\u0010U\u001a\u00020\bJ\u0010\u0010T\u001a\u0002072\b\b\u0001\u0010U\u001a\u00020\bJ\u0010\u0010V\u001a\u0002072\u0006\u0010W\u001a\u00020XH\u0002J\u0010\u0010Y\u001a\u0002072\u0006\u0010Z\u001a\u00020[H\u0002J\u0018\u0010\\\u001a\u0002072\u0006\u0010]\u001a\u00020[2\u0006\u0010^\u001a\u000209H\u0002R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u001a\u001a\u00020\u001b8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\'\u001a\u0004\b$\u0010%R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001b\u0010-\u001a\u00020.8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b1\u0010\'\u001a\u0004\b/\u00100R\u0014\u00102\u001a\u000203X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105\u00a8\u0006b"}, d2 = {"Ldji/v5/ux/core/widget/systemstatus/SystemStatusWidget;", "Ldji/v5/ux/core/base/widget/ConstraintLayoutWidget;", "Ldji/v5/ux/core/widget/systemstatus/SystemStatusWidget$ModelState;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "backgroundDrawableMap", "", "Ldji/v5/manager/diagnostic/WarningLevel;", "Landroid/graphics/drawable/Drawable;", "blinkAnimation", "Landroid/view/animation/Animation;", "value", "Ldji/v5/ux/core/widget/systemstatus/SystemStatusWidget$DefaultMode;", "defaultMode", "getDefaultMode", "()Ldji/v5/ux/core/widget/systemstatus/SystemStatusWidget$DefaultMode;", "setDefaultMode", "(Ldji/v5/ux/core/widget/systemstatus/SystemStatusWidget$DefaultMode;)V", "stateChangeResourceId", "systemStatusBackgroundImageView", "Landroid/widget/ImageView;", "textSize", "", "systemStatusMessageTextSize", "getSystemStatusMessageTextSize", "()F", "setSystemStatusMessageTextSize", "(F)V", "systemStatusTextView", "Landroid/widget/TextView;", "textColorMap", "getTextColorMap", "()Ljava/util/Map;", "textColorMap$delegate", "Lkotlin/Lazy;", "uiUpdateStateProcessor", "Lio/reactivex/rxjava3/processors/PublishProcessor;", "Ldji/v5/ux/core/widget/systemstatus/SystemStatusWidget$UIState;", "getUiUpdateStateProcessor", "()Lio/reactivex/rxjava3/processors/PublishProcessor;", "widgetModel", "Ldji/v5/ux/core/widget/systemstatus/SystemStatusWidgetModel;", "getWidgetModel", "()Ldji/v5/ux/core/widget/systemstatus/SystemStatusWidgetModel;", "widgetModel$delegate", "widgetSizeDescription", "Ldji/v5/ux/core/base/WidgetSizeDescription;", "getWidgetSizeDescription", "()Ldji/v5/ux/core/base/WidgetSizeDescription;", "blinkBackground", "", "isUrgentMessage", "", "checkAndUpdateUI", "formatMaxHeight", "", "maxHeight", "unitType", "Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "getIdealDimensionRatioString", "getSystemStatusBackgroundDrawable", "level", "getSystemStatusMessageTextColor", "getUIStateUpdates", "Lio/reactivex/rxjava3/core/Flowable;", "getWidgetStateUpdate", "initAttributes", "initView", "isMaxHeightMessage", "text", "onAttachedToWindow", "onDetachedFromWindow", "reactToCompassError", "Lio/reactivex/rxjava3/disposables/Disposable;", "reactToModelChanges", "setSystemStatusBackgroundDrawable", "background", "setSystemStatusMessageTextAppearance", "textAppearance", "setSystemStatusMessageTextColor", "color", "updateMessage", "messageData", "Ldji/v5/ux/core/widget/systemstatus/SystemStatusWidgetModel$WarningStatusMessageData;", "updateUI", "status", "Ldji/v5/manager/diagnostic/DJIDeviceStatus;", "updateVoiceNotification", "statusItem", "isMotorOn", "DefaultMode", "ModelState", "UIState", "android-sdk-v5-uxsdk_debug"})
public class SystemStatusWidget extends dji.v5.ux.core.base.widget.ConstraintLayoutWidget<dji.v5.ux.core.widget.systemstatus.SystemStatusWidget.ModelState> {
    private final android.widget.TextView systemStatusTextView = null;
    private final android.widget.ImageView systemStatusBackgroundImageView = null;
    private final android.view.animation.Animation blinkAnimation = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.rxjava3.processors.PublishProcessor<dji.v5.ux.core.widget.systemstatus.SystemStatusWidget.UIState> uiUpdateStateProcessor = null;
    private final kotlin.Lazy widgetModel$delegate = null;
    private final kotlin.Lazy textColorMap$delegate = null;
    private final java.util.Map<dji.v5.manager.diagnostic.WarningLevel, android.graphics.drawable.Drawable> backgroundDrawableMap = null;
    
    /**
     * The default mode determines the default text color and image background settings.
     */
    @org.jetbrains.annotations.NotNull
    private dji.v5.ux.core.widget.systemstatus.SystemStatusWidget.DefaultMode defaultMode = dji.v5.ux.core.widget.systemstatus.SystemStatusWidget.DefaultMode.COLOR;
    private int stateChangeResourceId = 0;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.base.WidgetSizeDescription widgetSizeDescription = null;
    
    @kotlin.jvm.JvmOverloads
    public SystemStatusWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public SystemStatusWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public SystemStatusWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    @org.jetbrains.annotations.NotNull
    protected final io.reactivex.rxjava3.processors.PublishProcessor<dji.v5.ux.core.widget.systemstatus.SystemStatusWidget.UIState> getUiUpdateStateProcessor() {
        return null;
    }
    
    private final dji.v5.ux.core.widget.systemstatus.SystemStatusWidgetModel getWidgetModel() {
        return null;
    }
    
    private final java.util.Map<dji.v5.manager.diagnostic.WarningLevel, java.lang.Integer> getTextColorMap() {
        return null;
    }
    
    @androidx.annotation.Dimension
    public final float getSystemStatusMessageTextSize() {
        return 0.0F;
    }
    
    public final void setSystemStatusMessageTextSize(@androidx.annotation.Dimension
    float textSize) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.widget.systemstatus.SystemStatusWidget.DefaultMode getDefaultMode() {
        return null;
    }
    
    public final void setDefaultMode(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.widget.systemstatus.SystemStatusWidget.DefaultMode value) {
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
    
    private final void updateUI(dji.v5.manager.diagnostic.DJIDeviceStatus status) {
    }
    
    private final void updateMessage(dji.v5.ux.core.widget.systemstatus.SystemStatusWidgetModel.WarningStatusMessageData messageData) {
    }
    
    private final boolean isMaxHeightMessage(java.lang.String text) {
        return false;
    }
    
    private final java.lang.String formatMaxHeight(float maxHeight, dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
        return null;
    }
    
    private final void blinkBackground(boolean isUrgentMessage) {
    }
    
    private final io.reactivex.rxjava3.disposables.Disposable reactToCompassError() {
        return null;
    }
    
    private final void updateVoiceNotification(dji.v5.manager.diagnostic.DJIDeviceStatus statusItem, boolean isMotorOn) {
    }
    
    private final void checkAndUpdateUI() {
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
     * Set text appearance of the system status message text view
     *
     * @param textAppearance Style resource for text appearance
     */
    public final void setSystemStatusMessageTextAppearance(@androidx.annotation.StyleRes
    int textAppearance) {
    }
    
    /**
     * Set the text color of the system status message for the given warning level.
     *
     * @param level The level for which to set the system status message text color.
     * @param color The color of the system status message text.
     */
    public final void setSystemStatusMessageTextColor(@org.jetbrains.annotations.NotNull
    dji.v5.manager.diagnostic.WarningLevel level, @androidx.annotation.ColorInt
    int color) {
    }
    
    /**
     * Set the text color of the system status message for all warning levels.
     *
     * @param color The color of the system status message text.
     */
    public final void setSystemStatusMessageTextColor(@androidx.annotation.ColorInt
    int color) {
    }
    
    /**
     * Get the text color of the system status message for the given warning level.
     *
     * @param level The level for which to get the system status message text color.
     * @return The color of the system status message text.
     */
    @androidx.annotation.ColorInt
    public final int getSystemStatusMessageTextColor(@org.jetbrains.annotations.NotNull
    dji.v5.manager.diagnostic.WarningLevel level) {
        return 0;
    }
    
    /**
     * Set the background drawable of the system status message for the given warning level.
     *
     * @param level The level for which to set the system status message background drawable.
     * @param background The background of the system status message.
     */
    public final void setSystemStatusBackgroundDrawable(@org.jetbrains.annotations.NotNull
    dji.v5.manager.diagnostic.WarningLevel level, @org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable background) {
    }
    
    /**
     * Set the background drawable of the system status message for all warning levels.
     *
     * @param background The background of the system status message.
     */
    public final void setSystemStatusBackgroundDrawable(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable background) {
    }
    
    /**
     * Get the background drawable of the system status message for the given warning level.
     *
     * @param level The level for which to get the system status message background drawable.
     * @return The background drawable of the system status message.
     */
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getSystemStatusBackgroundDrawable(@org.jetbrains.annotations.NotNull
    dji.v5.manager.diagnostic.WarningLevel level) {
        return null;
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
    public io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.widget.systemstatus.SystemStatusWidget.ModelState> getWidgetStateUpdate() {
        return null;
    }
    
    /**
     * Get the [UIState] updates
     */
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.widget.systemstatus.SystemStatusWidget.UIState> getUIStateUpdates() {
        return null;
    }
    
    /**
     * Class defines widget UI states
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Ldji/v5/ux/core/widget/systemstatus/SystemStatusWidget$UIState;", "", "()V", "WidgetClicked", "Ldji/v5/ux/core/widget/systemstatus/SystemStatusWidget$UIState$WidgetClicked;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class UIState {
        
        private UIState() {
            super();
        }
        
        /**
         * Widget click update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/widget/systemstatus/SystemStatusWidget$UIState$WidgetClicked;", "Ldji/v5/ux/core/widget/systemstatus/SystemStatusWidget$UIState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class WidgetClicked extends dji.v5.ux.core.widget.systemstatus.SystemStatusWidget.UIState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.widget.systemstatus.SystemStatusWidget.UIState.WidgetClicked INSTANCE = null;
            
            private WidgetClicked() {
                super();
            }
        }
    }
    
    /**
     * Class defines the widget state updates
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Ldji/v5/ux/core/widget/systemstatus/SystemStatusWidget$ModelState;", "", "()V", "ProductConnected", "SystemStatusUpdated", "Ldji/v5/ux/core/widget/systemstatus/SystemStatusWidget$ModelState$ProductConnected;", "Ldji/v5/ux/core/widget/systemstatus/SystemStatusWidget$ModelState$SystemStatusUpdated;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class ModelState {
        
        private ModelState() {
            super();
        }
        
        /**
         * Product connection update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/core/widget/systemstatus/SystemStatusWidget$ModelState$ProductConnected;", "Ldji/v5/ux/core/widget/systemstatus/SystemStatusWidget$ModelState;", "isConnected", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductConnected extends dji.v5.ux.core.widget.systemstatus.SystemStatusWidget.ModelState {
            private final boolean isConnected = false;
            
            /**
             * Product connection update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.systemstatus.SystemStatusWidget.ModelState.ProductConnected copy(boolean isConnected) {
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
         * System status update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/core/widget/systemstatus/SystemStatusWidget$ModelState$SystemStatusUpdated;", "Ldji/v5/ux/core/widget/systemstatus/SystemStatusWidget$ModelState;", "status", "Ldji/v5/manager/diagnostic/DJIDeviceStatus;", "(Ldji/v5/manager/diagnostic/DJIDeviceStatus;)V", "getStatus", "()Ldji/v5/manager/diagnostic/DJIDeviceStatus;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class SystemStatusUpdated extends dji.v5.ux.core.widget.systemstatus.SystemStatusWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            private final dji.v5.manager.diagnostic.DJIDeviceStatus status = null;
            
            /**
             * System status update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.systemstatus.SystemStatusWidget.ModelState.SystemStatusUpdated copy(@org.jetbrains.annotations.NotNull
            dji.v5.manager.diagnostic.DJIDeviceStatus status) {
                return null;
            }
            
            /**
             * System status update
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * System status update
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * System status update
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public SystemStatusUpdated(@org.jetbrains.annotations.NotNull
            dji.v5.manager.diagnostic.DJIDeviceStatus status) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.manager.diagnostic.DJIDeviceStatus component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.manager.diagnostic.DJIDeviceStatus getStatus() {
                return null;
            }
        }
    }
    
    /**
     * Sets the mode for the default image backgrounds and text colors.
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u00020\u00038\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\t"}, d2 = {"Ldji/v5/ux/core/widget/systemstatus/SystemStatusWidget$DefaultMode;", "", "value", "", "(Ljava/lang/String;II)V", "()I", "COLOR", "GRADIENT", "Companion", "android-sdk-v5-uxsdk_debug"})
    public static enum DefaultMode {
        /*public static final*/ COLOR /* = new COLOR(0) */,
        /*public static final*/ GRADIENT /* = new GRADIENT(0) */;
        private final int value = 0;
        @org.jetbrains.annotations.NotNull
        public static final dji.v5.ux.core.widget.systemstatus.SystemStatusWidget.DefaultMode.Companion Companion = null;
        @org.jetbrains.annotations.NotNull
        private static final dji.v5.ux.core.widget.systemstatus.SystemStatusWidget.DefaultMode[] values = null;
        
        DefaultMode(int value) {
        }
        
        @kotlin.jvm.JvmName(name = "value")
        public final int value() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public static final dji.v5.ux.core.widget.systemstatus.SystemStatusWidget.DefaultMode[] getValues() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @kotlin.jvm.JvmStatic
        public static final dji.v5.ux.core.widget.systemstatus.SystemStatusWidget.DefaultMode find(int value) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0007R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\t\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Ldji/v5/ux/core/widget/systemstatus/SystemStatusWidget$DefaultMode$Companion;", "", "()V", "values", "", "Ldji/v5/ux/core/widget/systemstatus/SystemStatusWidget$DefaultMode;", "getValues$annotations", "getValues", "()[Ldji/v5/ux/core/widget/systemstatus/SystemStatusWidget$DefaultMode;", "[Ldji/v5/ux/core/widget/systemstatus/SystemStatusWidget$DefaultMode;", "find", "value", "", "android-sdk-v5-uxsdk_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.systemstatus.SystemStatusWidget.DefaultMode[] getValues() {
                return null;
            }
            
            @kotlin.jvm.JvmStatic
            @java.lang.Deprecated
            public static void getValues$annotations() {
            }
            
            @org.jetbrains.annotations.NotNull
            @kotlin.jvm.JvmStatic
            public final dji.v5.ux.core.widget.systemstatus.SystemStatusWidget.DefaultMode find(int value) {
                return null;
            }
        }
    }
}