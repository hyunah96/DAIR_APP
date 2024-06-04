package dji.v5.ux.core.panel.listitem.returntohomealtitude;

import java.lang.System;

/**
 * Widget shows the current return to home altitude.
 * The widget enables the user to modify this value. Tap on the limit and enter
 * the new value to modify the return home altitude.
 * The return to home altitude cannot exceed the maximum flight altitude.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002FGB%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\n\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+H\u0016J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020+H\u0016J\u001a\u0010.\u001a\u00020/2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0003J\b\u00100\u001a\u00020/H\u0014J\b\u00101\u001a\u00020/H\u0016J\b\u00102\u001a\u00020/H\u0014J\u0012\u00103\u001a\u00020/2\b\u00104\u001a\u0004\u0018\u00010)H\u0016J\b\u00105\u001a\u00020/H\u0016J\b\u00106\u001a\u00020/H\u0014J\b\u00107\u001a\u00020/H\u0002J\u0010\u00108\u001a\u00020/2\u0006\u00109\u001a\u00020\bH\u0002J\u0012\u0010:\u001a\u00020/2\b\u0010;\u001a\u0004\u0018\u00010)H\u0002J\u0010\u0010<\u001a\u00020/2\u0006\u0010=\u001a\u00020>H\u0002J\b\u0010?\u001a\u00020/H\u0002J\u0010\u0010@\u001a\u00020/2\u0006\u0010A\u001a\u00020BH\u0002J\u0010\u0010C\u001a\u00020/2\u0006\u0010D\u001a\u00020EH\u0002R\u001e\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020%X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'\u00a8\u0006H"}, d2 = {"Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidget;", "Ldji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget;", "Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidget$ModelState;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleArr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dialogTheme", "getDialogTheme", "()I", "setDialogTheme", "(I)V", "errorDialogIcon", "Landroid/graphics/drawable/Drawable;", "getErrorDialogIcon", "()Landroid/graphics/drawable/Drawable;", "setErrorDialogIcon", "(Landroid/graphics/drawable/Drawable;)V", "successDialogIcon", "getSuccessDialogIcon", "setSuccessDialogIcon", "toastMessagesEnabled", "", "getToastMessagesEnabled", "()Z", "setToastMessagesEnabled", "(Z)V", "widgetModel", "Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidgetModel;", "getWidgetModel", "()Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidgetModel;", "widgetModel$delegate", "Lkotlin/Lazy;", "widgetSizeDescription", "Ldji/v5/ux/core/base/WidgetSizeDescription;", "getWidgetSizeDescription", "()Ldji/v5/ux/core/base/WidgetSizeDescription;", "getIdealDimensionRatioString", "", "getUIStateUpdates", "Lio/reactivex/rxjava3/core/Flowable;", "Ldji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget$UIState;", "getWidgetStateUpdate", "initAttributes", "", "onAttachedToWindow", "onButtonClick", "onDetachedFromWindow", "onEditorTextChanged", "currentText", "onKeyboardDoneAction", "reactToModelChanges", "resetToDefaultValue", "setReturnToHomeAltitude", "currentValue", "showToast", "message", "updateNoviceMode", "unitType", "Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "updateProductDisconnectedState", "updateReturnToHomeValue", "returnToHomeAltitudeListItemState", "Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidgetModel$ReturnToHomeAltitudeState$ReturnToHomeAltitudeValue;", "updateUI", "returnToHomeAltitudeState", "Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidgetModel$ReturnToHomeAltitudeState;", "DialogType", "ModelState", "android-sdk-v5-uxsdk_debug"})
public class ReturnToHomeAltitudeListItemWidget extends dji.v5.ux.core.base.panel.listitem.ListItemEditTextButtonWidget<dji.v5.ux.core.panel.listitem.returntohomealtitude.ReturnToHomeAltitudeListItemWidget.ModelState> {
    
    /**
     * Enable/Disable toast messages in the widget
     */
    private boolean toastMessagesEnabled = true;
    
    /**
     * Theme for the dialogs shown in the widget
     */
    @androidx.annotation.StyleRes
    private int dialogTheme;
    
    /**
     * Icon for error dialog
     */
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable errorDialogIcon;
    
    /**
     * Icon for success dialog
     */
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable successDialogIcon;
    private final kotlin.Lazy widgetModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.base.WidgetSizeDescription widgetSizeDescription = null;
    
    @kotlin.jvm.JvmOverloads
    public ReturnToHomeAltitudeListItemWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public ReturnToHomeAltitudeListItemWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public ReturnToHomeAltitudeListItemWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleArr) {
        super(null, null, 0, null, 0);
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
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getErrorDialogIcon() {
        return null;
    }
    
    public final void setErrorDialogIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getSuccessDialogIcon() {
        return null;
    }
    
    public final void setSuccessDialogIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable p0) {
    }
    
    private final dji.v5.ux.core.panel.listitem.returntohomealtitude.ReturnToHomeAltitudeListItemWidgetModel getWidgetModel() {
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
    public void onKeyboardDoneAction() {
    }
    
    @java.lang.Override
    public void onEditorTextChanged(@org.jetbrains.annotations.Nullable
    java.lang.String currentText) {
    }
    
    private final void updateUI(dji.v5.ux.core.panel.listitem.returntohomealtitude.ReturnToHomeAltitudeListItemWidgetModel.ReturnToHomeAltitudeState returnToHomeAltitudeState) {
    }
    
    private final void updateReturnToHomeValue(dji.v5.ux.core.panel.listitem.returntohomealtitude.ReturnToHomeAltitudeListItemWidgetModel.ReturnToHomeAltitudeState.ReturnToHomeAltitudeValue returnToHomeAltitudeListItemState) {
    }
    
    private final void updateProductDisconnectedState() {
    }
    
    private final void updateNoviceMode(dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
    }
    
    private final void showToast(java.lang.String message) {
    }
    
    private final void setReturnToHomeAltitude(int currentValue) {
    }
    
    private final void resetToDefaultValue() {
    }
    
    @android.annotation.SuppressLint(value = {"Recycle"})
    private final void initAttributes(android.content.Context context, android.util.AttributeSet attrs) {
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
    public io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.panel.listitem.returntohomealtitude.ReturnToHomeAltitudeListItemWidget.ModelState> getWidgetStateUpdate() {
        return null;
    }
    
    /**
     * Return to home list item dialog identifiers
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidget$DialogType;", "", "()V", "MaxAltitudeExceeded", "ReturnHomeAltitudeChangeConfirmation", "Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidget$DialogType$MaxAltitudeExceeded;", "Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidget$DialogType$ReturnHomeAltitudeChangeConfirmation;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class DialogType {
        
        private DialogType() {
            super();
        }
        
        /**
         * Dialog shown when return to home altitude
         * exceeds max altitude limit
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidget$DialogType$MaxAltitudeExceeded;", "Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidget$DialogType;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class MaxAltitudeExceeded extends dji.v5.ux.core.panel.listitem.returntohomealtitude.ReturnToHomeAltitudeListItemWidget.DialogType {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.panel.listitem.returntohomealtitude.ReturnToHomeAltitudeListItemWidget.DialogType.MaxAltitudeExceeded INSTANCE = null;
            
            private MaxAltitudeExceeded() {
                super();
            }
        }
        
        /**
         * Dialog shown to warn user when return to home altitude is
         * updated successfully
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidget$DialogType$ReturnHomeAltitudeChangeConfirmation;", "Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidget$DialogType;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class ReturnHomeAltitudeChangeConfirmation extends dji.v5.ux.core.panel.listitem.returntohomealtitude.ReturnToHomeAltitudeListItemWidget.DialogType {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.panel.listitem.returntohomealtitude.ReturnToHomeAltitudeListItemWidget.DialogType.ReturnHomeAltitudeChangeConfirmation INSTANCE = null;
            
            private ReturnHomeAltitudeChangeConfirmation() {
                super();
            }
        }
    }
    
    /**
     * Class defines widget state updates
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidget$ModelState;", "", "()V", "ProductConnected", "ReturnToHomeAltitudeStateUpdated", "SetReturnToHomeAltitudeFailed", "SetReturnToHomeAltitudeSucceeded", "Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidget$ModelState$ProductConnected;", "Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidget$ModelState$ReturnToHomeAltitudeStateUpdated;", "Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidget$ModelState$SetReturnToHomeAltitudeFailed;", "Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidget$ModelState$SetReturnToHomeAltitudeSucceeded;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class ModelState {
        
        private ModelState() {
            super();
        }
        
        /**
         * Product connection update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidget$ModelState$ProductConnected;", "Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidget$ModelState;", "isConnected", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductConnected extends dji.v5.ux.core.panel.listitem.returntohomealtitude.ReturnToHomeAltitudeListItemWidget.ModelState {
            private final boolean isConnected = false;
            
            /**
             * Product connection update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.returntohomealtitude.ReturnToHomeAltitudeListItemWidget.ModelState.ProductConnected copy(boolean isConnected) {
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
         * Return to home altitude set action successful
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidget$ModelState$SetReturnToHomeAltitudeSucceeded;", "Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidget$ModelState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class SetReturnToHomeAltitudeSucceeded extends dji.v5.ux.core.panel.listitem.returntohomealtitude.ReturnToHomeAltitudeListItemWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.panel.listitem.returntohomealtitude.ReturnToHomeAltitudeListItemWidget.ModelState.SetReturnToHomeAltitudeSucceeded INSTANCE = null;
            
            private SetReturnToHomeAltitudeSucceeded() {
                super();
            }
        }
        
        /**
         * Return to home altitude set action failed
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidget$ModelState$SetReturnToHomeAltitudeFailed;", "Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidget$ModelState;", "error", "Ldji/v5/ux/core/base/UXSDKError;", "(Ldji/v5/ux/core/base/UXSDKError;)V", "getError", "()Ldji/v5/ux/core/base/UXSDKError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class SetReturnToHomeAltitudeFailed extends dji.v5.ux.core.panel.listitem.returntohomealtitude.ReturnToHomeAltitudeListItemWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.base.UXSDKError error = null;
            
            /**
             * Return to home altitude set action failed
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.returntohomealtitude.ReturnToHomeAltitudeListItemWidget.ModelState.SetReturnToHomeAltitudeFailed copy(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.base.UXSDKError error) {
                return null;
            }
            
            /**
             * Return to home altitude set action failed
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Return to home altitude set action failed
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Return to home altitude set action failed
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public SetReturnToHomeAltitudeFailed(@org.jetbrains.annotations.NotNull
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
         * Return to home altitude state updated
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidget$ModelState$ReturnToHomeAltitudeStateUpdated;", "Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidget$ModelState;", "maxAltitudeState", "Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidgetModel$ReturnToHomeAltitudeState;", "(Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidgetModel$ReturnToHomeAltitudeState;)V", "getMaxAltitudeState", "()Ldji/v5/ux/core/panel/listitem/returntohomealtitude/ReturnToHomeAltitudeListItemWidgetModel$ReturnToHomeAltitudeState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class ReturnToHomeAltitudeStateUpdated extends dji.v5.ux.core.panel.listitem.returntohomealtitude.ReturnToHomeAltitudeListItemWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.panel.listitem.returntohomealtitude.ReturnToHomeAltitudeListItemWidgetModel.ReturnToHomeAltitudeState maxAltitudeState = null;
            
            /**
             * Return to home altitude state updated
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.returntohomealtitude.ReturnToHomeAltitudeListItemWidget.ModelState.ReturnToHomeAltitudeStateUpdated copy(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.panel.listitem.returntohomealtitude.ReturnToHomeAltitudeListItemWidgetModel.ReturnToHomeAltitudeState maxAltitudeState) {
                return null;
            }
            
            /**
             * Return to home altitude state updated
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Return to home altitude state updated
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Return to home altitude state updated
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public ReturnToHomeAltitudeStateUpdated(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.panel.listitem.returntohomealtitude.ReturnToHomeAltitudeListItemWidgetModel.ReturnToHomeAltitudeState maxAltitudeState) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.returntohomealtitude.ReturnToHomeAltitudeListItemWidgetModel.ReturnToHomeAltitudeState component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.returntohomealtitude.ReturnToHomeAltitudeListItemWidgetModel.ReturnToHomeAltitudeState getMaxAltitudeState() {
                return null;
            }
        }
    }
}