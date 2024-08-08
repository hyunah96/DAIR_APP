package dji.v5.ux.core.panel.listitem.maxaltitude;

import java.lang.System;

/**
 * Widget shows the current flight height limit.
 * Based on the product connected and the mode that it currently is in,
 * the widget will allow the user to update the flight height limit.
 * Tap on the limit and enter the new value to modify the flight height limit.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002KLB%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\n\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+H\u0016J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020+H\u0016J\u001a\u0010.\u001a\u00020/2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0003J\u0018\u00100\u001a\u00020\u00192\u0006\u00101\u001a\u00020\b2\u0006\u00102\u001a\u000203H\u0002J\b\u00104\u001a\u00020/H\u0014J\b\u00105\u001a\u00020/H\u0016J\b\u00106\u001a\u00020/H\u0014J\u0012\u00107\u001a\u00020/2\b\u00108\u001a\u0004\u0018\u00010)H\u0016J\b\u00109\u001a\u00020/H\u0016J\b\u0010:\u001a\u00020/H\u0014J\b\u0010;\u001a\u00020/H\u0002J\u0010\u0010<\u001a\u00020/2\u0006\u0010=\u001a\u00020\bH\u0002J \u0010>\u001a\u00020/2\u0006\u0010=\u001a\u00020\b2\u0006\u0010?\u001a\u00020\b2\u0006\u00102\u001a\u000203H\u0002J\u0012\u0010@\u001a\u00020/2\b\u0010A\u001a\u0004\u0018\u00010)H\u0002J\u0010\u0010B\u001a\u00020/2\u0006\u0010C\u001a\u00020DH\u0002J\u0010\u0010E\u001a\u00020/2\u0006\u00102\u001a\u000203H\u0002J\b\u0010F\u001a\u00020/H\u0002J\u0010\u0010G\u001a\u00020/2\u0006\u0010H\u001a\u00020IH\u0002J \u0010J\u001a\u00020/2\u0006\u0010=\u001a\u00020\b2\u0006\u0010?\u001a\u00020\b2\u0006\u00102\u001a\u000203H\u0002R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020%X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'\u00a8\u0006M"}, d2 = {"Ldji/v5/ux/core/panel/listitem/maxaltitude/MaxAltitudeListItemWidget;", "Ldji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget;", "Ldji/v5/ux/core/panel/listitem/maxaltitude/MaxAltitudeListItemWidget$ModelState;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleArr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "confirmationDialogIcon", "Landroid/graphics/drawable/Drawable;", "getConfirmationDialogIcon", "()Landroid/graphics/drawable/Drawable;", "setConfirmationDialogIcon", "(Landroid/graphics/drawable/Drawable;)V", "dialogTheme", "getDialogTheme", "()I", "setDialogTheme", "(I)V", "errorDialogIcon", "getErrorDialogIcon", "setErrorDialogIcon", "toastMessagesEnabled", "", "getToastMessagesEnabled", "()Z", "setToastMessagesEnabled", "(Z)V", "widgetModel", "Ldji/v5/ux/core/panel/listitem/maxaltitude/MaxAltitudeListItemWidgetModel;", "getWidgetModel", "()Ldji/v5/ux/core/panel/listitem/maxaltitude/MaxAltitudeListItemWidgetModel;", "widgetModel$delegate", "Lkotlin/Lazy;", "widgetSizeDescription", "Ldji/v5/ux/core/base/WidgetSizeDescription;", "getWidgetSizeDescription", "()Ldji/v5/ux/core/base/WidgetSizeDescription;", "getIdealDimensionRatioString", "", "getUIStateUpdates", "Lio/reactivex/rxjava3/core/Flowable;", "Ldji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget$UIState;", "getWidgetStateUpdate", "initAttributes", "", "isOverAlarmLimit", "currentVal", "unitType", "Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "onAttachedToWindow", "onButtonClick", "onDetachedFromWindow", "onEditorTextChanged", "currentText", "onKeyboardDoneAction", "reactToModelChanges", "resetToDefaultValue", "setMaxAltitudeValue", "currentValue", "showOverAlarmLimitDialog", "currentReturnToHomeValue", "showToast", "message", "updateMaxAltitudeValue", "maxAltitudeListItemState", "Ldji/v5/ux/core/panel/listitem/maxaltitude/MaxAltitudeListItemWidgetModel$MaxAltitudeState$MaxAltitudeValue;", "updateNoviceMode", "updateProductDisconnectedState", "updateUI", "maxAltitudeState", "Ldji/v5/ux/core/panel/listitem/maxaltitude/MaxAltitudeListItemWidgetModel$MaxAltitudeState;", "verifyReturnHomeAltitudeValue", "DialogType", "ModelState", "android-sdk-v5-uxsdk_debug"})
public class MaxAltitudeListItemWidget extends dji.v5.ux.core.base.panel.listitem.ListItemEditTextButtonWidget<dji.v5.ux.core.panel.listitem.maxaltitude.MaxAltitudeListItemWidget.ModelState> {
    
    /**
     * Icon for confirmation dialog
     */
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable confirmationDialogIcon;
    
    /**
     * Icon for error dialog
     */
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable errorDialogIcon;
    
    /**
     * Enable/Disable toast messages in the widget
     */
    private boolean toastMessagesEnabled = true;
    
    /**
     * Theme for the dialogs shown in the widget
     */
    @androidx.annotation.StyleRes
    private int dialogTheme;
    private final kotlin.Lazy widgetModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.base.WidgetSizeDescription widgetSizeDescription = null;
    
    @kotlin.jvm.JvmOverloads
    public MaxAltitudeListItemWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public MaxAltitudeListItemWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public MaxAltitudeListItemWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleArr) {
        super(null, null, 0, null, 0);
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getConfirmationDialogIcon() {
        return null;
    }
    
    public final void setConfirmationDialogIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getErrorDialogIcon() {
        return null;
    }
    
    public final void setErrorDialogIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable p0) {
    }
    
    public final boolean getToastMessagesEnabled() {
        return false;
    }
    
    public final void setToastMessagesEnabled(boolean p0) {
    }
    
    public final int getDialogTheme() {
        return 0;
    }
    
    public final void setDialogTheme(int p0) {
    }
    
    private final dji.v5.ux.core.panel.listitem.maxaltitude.MaxAltitudeListItemWidgetModel getWidgetModel() {
        return null;
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
    public void onButtonClick() {
    }
    
    @java.lang.Override
    public void onEditorTextChanged(@org.jetbrains.annotations.Nullable
    java.lang.String currentText) {
    }
    
    @java.lang.Override
    public void onKeyboardDoneAction() {
    }
    
    private final void updateUI(dji.v5.ux.core.panel.listitem.maxaltitude.MaxAltitudeListItemWidgetModel.MaxAltitudeState maxAltitudeState) {
    }
    
    private final void updateMaxAltitudeValue(dji.v5.ux.core.panel.listitem.maxaltitude.MaxAltitudeListItemWidgetModel.MaxAltitudeState.MaxAltitudeValue maxAltitudeListItemState) {
    }
    
    private final void updateNoviceMode(dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
    }
    
    private final void updateProductDisconnectedState() {
    }
    
    private final void showToast(java.lang.String message) {
    }
    
    private final void showOverAlarmLimitDialog(int currentValue, int currentReturnToHomeValue, dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
    }
    
    private final boolean isOverAlarmLimit(int currentVal, dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
        return false;
    }
    
    private final void verifyReturnHomeAltitudeValue(int currentValue, int currentReturnToHomeValue, dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
    }
    
    private final void setMaxAltitudeValue(int currentValue) {
    }
    
    private final void resetToDefaultValue() {
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
    
    @android.annotation.SuppressLint(value = {"Recycle"})
    private final void initAttributes(android.content.Context context, android.util.AttributeSet attrs) {
    }
    
    /**
     * Get the [ListItemEditTextButtonWidget.UIState] updates
     * The info parameter is instance of [DialogType]
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.base.panel.listitem.ListItemEditTextButtonWidget.UIState> getUIStateUpdates() {
        return null;
    }
    
    /**
     * Get the [ModelState] updates
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.SuppressWarnings(value = {})
    @java.lang.Override
    public io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.panel.listitem.maxaltitude.MaxAltitudeListItemWidget.ModelState> getWidgetStateUpdate() {
        return null;
    }
    
    /**
     * Max altitude List Item Dialog Identifiers
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Ldji/v5/ux/core/panel/listitem/maxaltitude/MaxAltitudeListItemWidget$DialogType;", "", "()V", "FlightLimitNeededError", "MaxAltitudeOverAlarmConfirmation", "ReturnHomeAltitudeUpdate", "Ldji/v5/ux/core/panel/listitem/maxaltitude/MaxAltitudeListItemWidget$DialogType$FlightLimitNeededError;", "Ldji/v5/ux/core/panel/listitem/maxaltitude/MaxAltitudeListItemWidget$DialogType$MaxAltitudeOverAlarmConfirmation;", "Ldji/v5/ux/core/panel/listitem/maxaltitude/MaxAltitudeListItemWidget$DialogType$ReturnHomeAltitudeUpdate;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class DialogType {
        
        private DialogType() {
            super();
        }
        
        /**
         * Dialog shown when max altitude is over alarm
         * levels.
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/maxaltitude/MaxAltitudeListItemWidget$DialogType$MaxAltitudeOverAlarmConfirmation;", "Ldji/v5/ux/core/panel/listitem/maxaltitude/MaxAltitudeListItemWidget$DialogType;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class MaxAltitudeOverAlarmConfirmation extends dji.v5.ux.core.panel.listitem.maxaltitude.MaxAltitudeListItemWidget.DialogType {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.panel.listitem.maxaltitude.MaxAltitudeListItemWidget.DialogType.MaxAltitudeOverAlarmConfirmation INSTANCE = null;
            
            private MaxAltitudeOverAlarmConfirmation() {
                super();
            }
        }
        
        /**
         * Dialog shown when flight limit is restricted and the user
         * tries to set a higher value
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/maxaltitude/MaxAltitudeListItemWidget$DialogType$FlightLimitNeededError;", "Ldji/v5/ux/core/panel/listitem/maxaltitude/MaxAltitudeListItemWidget$DialogType;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class FlightLimitNeededError extends dji.v5.ux.core.panel.listitem.maxaltitude.MaxAltitudeListItemWidget.DialogType {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.panel.listitem.maxaltitude.MaxAltitudeListItemWidget.DialogType.FlightLimitNeededError INSTANCE = null;
            
            private FlightLimitNeededError() {
                super();
            }
        }
        
        /**
         * Dialog shown to confirm that the user will have to update return home
         * altitude along with max flight limit
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/maxaltitude/MaxAltitudeListItemWidget$DialogType$ReturnHomeAltitudeUpdate;", "Ldji/v5/ux/core/panel/listitem/maxaltitude/MaxAltitudeListItemWidget$DialogType;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class ReturnHomeAltitudeUpdate extends dji.v5.ux.core.panel.listitem.maxaltitude.MaxAltitudeListItemWidget.DialogType {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.panel.listitem.maxaltitude.MaxAltitudeListItemWidget.DialogType.ReturnHomeAltitudeUpdate INSTANCE = null;
            
            private ReturnHomeAltitudeUpdate() {
                super();
            }
        }
    }
    
    /**
     * Class defines widget state updates
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Ldji/v5/ux/core/panel/listitem/maxaltitude/MaxAltitudeListItemWidget$ModelState;", "", "()V", "MaxAltitudeStateUpdated", "ProductConnected", "SetMaxAltitudeFailed", "SetMaxAltitudeSucceeded", "Ldji/v5/ux/core/panel/listitem/maxaltitude/MaxAltitudeListItemWidget$ModelState$MaxAltitudeStateUpdated;", "Ldji/v5/ux/core/panel/listitem/maxaltitude/MaxAltitudeListItemWidget$ModelState$ProductConnected;", "Ldji/v5/ux/core/panel/listitem/maxaltitude/MaxAltitudeListItemWidget$ModelState$SetMaxAltitudeFailed;", "Ldji/v5/ux/core/panel/listitem/maxaltitude/MaxAltitudeListItemWidget$ModelState$SetMaxAltitudeSucceeded;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class ModelState {
        
        private ModelState() {
            super();
        }
        
        /**
         * Product connection update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/core/panel/listitem/maxaltitude/MaxAltitudeListItemWidget$ModelState$ProductConnected;", "Ldji/v5/ux/core/panel/listitem/maxaltitude/MaxAltitudeListItemWidget$ModelState;", "isConnected", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductConnected extends dji.v5.ux.core.panel.listitem.maxaltitude.MaxAltitudeListItemWidget.ModelState {
            private final boolean isConnected = false;
            
            /**
             * Product connection update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.maxaltitude.MaxAltitudeListItemWidget.ModelState.ProductConnected copy(boolean isConnected) {
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
         * Max altitude set action successful
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/maxaltitude/MaxAltitudeListItemWidget$ModelState$SetMaxAltitudeSucceeded;", "Ldji/v5/ux/core/panel/listitem/maxaltitude/MaxAltitudeListItemWidget$ModelState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class SetMaxAltitudeSucceeded extends dji.v5.ux.core.panel.listitem.maxaltitude.MaxAltitudeListItemWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.panel.listitem.maxaltitude.MaxAltitudeListItemWidget.ModelState.SetMaxAltitudeSucceeded INSTANCE = null;
            
            private SetMaxAltitudeSucceeded() {
                super();
            }
        }
        
        /**
         * Max altitude set action failed
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/core/panel/listitem/maxaltitude/MaxAltitudeListItemWidget$ModelState$SetMaxAltitudeFailed;", "Ldji/v5/ux/core/panel/listitem/maxaltitude/MaxAltitudeListItemWidget$ModelState;", "error", "Ldji/v5/ux/core/base/UXSDKError;", "(Ldji/v5/ux/core/base/UXSDKError;)V", "getError", "()Ldji/v5/ux/core/base/UXSDKError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class SetMaxAltitudeFailed extends dji.v5.ux.core.panel.listitem.maxaltitude.MaxAltitudeListItemWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.base.UXSDKError error = null;
            
            /**
             * Max altitude set action failed
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.maxaltitude.MaxAltitudeListItemWidget.ModelState.SetMaxAltitudeFailed copy(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.base.UXSDKError error) {
                return null;
            }
            
            /**
             * Max altitude set action failed
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Max altitude set action failed
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Max altitude set action failed
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public SetMaxAltitudeFailed(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.base.UXSDKError error) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.base.UXSDKError component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.base.UXSDKError getError() {
                return null;
            }
        }
        
        /**
         * Max altitude state update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/core/panel/listitem/maxaltitude/MaxAltitudeListItemWidget$ModelState$MaxAltitudeStateUpdated;", "Ldji/v5/ux/core/panel/listitem/maxaltitude/MaxAltitudeListItemWidget$ModelState;", "maxAltitudeState", "Ldji/v5/ux/core/panel/listitem/maxaltitude/MaxAltitudeListItemWidgetModel$MaxAltitudeState;", "(Ldji/v5/ux/core/panel/listitem/maxaltitude/MaxAltitudeListItemWidgetModel$MaxAltitudeState;)V", "getMaxAltitudeState", "()Ldji/v5/ux/core/panel/listitem/maxaltitude/MaxAltitudeListItemWidgetModel$MaxAltitudeState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class MaxAltitudeStateUpdated extends dji.v5.ux.core.panel.listitem.maxaltitude.MaxAltitudeListItemWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.panel.listitem.maxaltitude.MaxAltitudeListItemWidgetModel.MaxAltitudeState maxAltitudeState = null;
            
            /**
             * Max altitude state update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.maxaltitude.MaxAltitudeListItemWidget.ModelState.MaxAltitudeStateUpdated copy(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.panel.listitem.maxaltitude.MaxAltitudeListItemWidgetModel.MaxAltitudeState maxAltitudeState) {
                return null;
            }
            
            /**
             * Max altitude state update
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Max altitude state update
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Max altitude state update
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public MaxAltitudeStateUpdated(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.panel.listitem.maxaltitude.MaxAltitudeListItemWidgetModel.MaxAltitudeState maxAltitudeState) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.maxaltitude.MaxAltitudeListItemWidgetModel.MaxAltitudeState component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.maxaltitude.MaxAltitudeListItemWidgetModel.MaxAltitudeState getMaxAltitudeState() {
                return null;
            }
        }
    }
}