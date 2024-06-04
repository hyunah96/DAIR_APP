package dji.v5.ux.core.panel.listitem.maxflightdistance;

import java.lang.System;

/**
 * Widget shows the current flight distance limit.
 * Based on the product connected and the mode that it currently is in,
 * the widget will allow the user to update the flight distance limit.
 * Tap on the limit and enter the new value to modify the flight distance  limit.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001>B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\n\u0010#\u001a\u0004\u0018\u00010\u000bH\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020%H\u0016J\u001a\u0010&\u001a\u00020\'2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0003J\b\u0010(\u001a\u00020\'H\u0014J\b\u0010)\u001a\u00020\'H\u0016J\b\u0010*\u001a\u00020\'H\u0014J\u0012\u0010+\u001a\u00020\'2\b\u0010,\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010-\u001a\u00020\'H\u0016J\b\u0010.\u001a\u00020\'H\u0014J\b\u0010/\u001a\u00020\'H\u0002J\u0010\u00100\u001a\u00020\'2\u0006\u00101\u001a\u00020\bH\u0002J\u0012\u00102\u001a\u00020\'2\b\u00103\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u00104\u001a\u00020\'H\u0002J\u0010\u00105\u001a\u00020\'2\u0006\u00106\u001a\u000207H\u0002J\u0010\u00108\u001a\u00020\'2\u0006\u00109\u001a\u00020:H\u0002J\b\u0010;\u001a\u00020\'H\u0002J\u0010\u0010<\u001a\u00020\'2\u0006\u00106\u001a\u00020=H\u0002R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020 X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"\u00a8\u0006?"}, d2 = {"Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidget;", "Ldji/v5/ux/core/base/panel/listitem/ListItemEditTextButtonWidget;", "Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidget$ModelState;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleArr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "disableActionButtonString", "", "getDisableActionButtonString", "()Ljava/lang/String;", "setDisableActionButtonString", "(Ljava/lang/String;)V", "enableActionButtonString", "getEnableActionButtonString", "setEnableActionButtonString", "toastMessagesEnabled", "", "getToastMessagesEnabled", "()Z", "setToastMessagesEnabled", "(Z)V", "widgetModel", "Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidgetModel;", "getWidgetModel", "()Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidgetModel;", "widgetModel$delegate", "Lkotlin/Lazy;", "widgetSizeDescription", "Ldji/v5/ux/core/base/WidgetSizeDescription;", "getWidgetSizeDescription", "()Ldji/v5/ux/core/base/WidgetSizeDescription;", "getIdealDimensionRatioString", "getWidgetStateUpdate", "Lio/reactivex/rxjava3/core/Flowable;", "initAttributes", "", "onAttachedToWindow", "onButtonClick", "onDetachedFromWindow", "onEditorTextChanged", "currentText", "onKeyboardDoneAction", "reactToModelChanges", "resetToDefaultValue", "setMaxFlightDistance", "maxFlightDistance", "showToast", "message", "updateDisabledState", "updateMaxFlightDistance", "maxFlightDistanceState", "Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidgetModel$MaxFlightDistanceState$MaxFlightDistanceValue;", "updateNoviceMode", "unitType", "Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "updateProductDisconnectedState", "updateUI", "Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidgetModel$MaxFlightDistanceState;", "ModelState", "android-sdk-v5-uxsdk_debug"})
public class MaxFlightDistanceListItemWidget extends dji.v5.ux.core.base.panel.listitem.ListItemEditTextButtonWidget<dji.v5.ux.core.panel.listitem.maxflightdistance.MaxFlightDistanceListItemWidget.ModelState> {
    private final kotlin.Lazy widgetModel$delegate = null;
    
    /**
     * String for enable action button
     */
    @org.jetbrains.annotations.NotNull
    private java.lang.String enableActionButtonString;
    
    /**
     * String for disable action button
     */
    @org.jetbrains.annotations.NotNull
    private java.lang.String disableActionButtonString;
    
    /**
     * Enable/Disable toast messages in the widget
     */
    private boolean toastMessagesEnabled = true;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.base.WidgetSizeDescription widgetSizeDescription = null;
    
    @kotlin.jvm.JvmOverloads
    public MaxFlightDistanceListItemWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public MaxFlightDistanceListItemWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public MaxFlightDistanceListItemWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleArr) {
        super(null, null, 0, null, 0);
    }
    
    private final dji.v5.ux.core.panel.listitem.maxflightdistance.MaxFlightDistanceListItemWidgetModel getWidgetModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEnableActionButtonString() {
        return null;
    }
    
    public final void setEnableActionButtonString(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDisableActionButtonString() {
        return null;
    }
    
    public final void setDisableActionButtonString(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final boolean getToastMessagesEnabled() {
        return false;
    }
    
    public final void setToastMessagesEnabled(boolean p0) {
    }
    
    @java.lang.Override
    protected void onAttachedToWindow() {
    }
    
    @java.lang.Override
    protected void onDetachedFromWindow() {
    }
    
    @java.lang.Override
    public void onButtonClick() {
    }
    
    @java.lang.Override
    protected void reactToModelChanges() {
    }
    
    @java.lang.Override
    public void onKeyboardDoneAction() {
    }
    
    @java.lang.Override
    public void onEditorTextChanged(@org.jetbrains.annotations.Nullable
    java.lang.String currentText) {
    }
    
    private final void updateUI(dji.v5.ux.core.panel.listitem.maxflightdistance.MaxFlightDistanceListItemWidgetModel.MaxFlightDistanceState maxFlightDistanceState) {
    }
    
    private final void updateMaxFlightDistance(dji.v5.ux.core.panel.listitem.maxflightdistance.MaxFlightDistanceListItemWidgetModel.MaxFlightDistanceState.MaxFlightDistanceValue maxFlightDistanceState) {
    }
    
    private final void updateNoviceMode(dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
    }
    
    private final void updateDisabledState() {
    }
    
    private final void updateProductDisconnectedState() {
    }
    
    private final void showToast(java.lang.String message) {
    }
    
    private final void resetToDefaultValue() {
    }
    
    private final void setMaxFlightDistance(int maxFlightDistance) {
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
     * Get the [ModelState] updates
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.SuppressWarnings(value = {})
    @java.lang.Override
    public io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.panel.listitem.maxflightdistance.MaxFlightDistanceListItemWidget.ModelState> getWidgetStateUpdate() {
        return null;
    }
    
    /**
     * Class defines widget state updates
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidget$ModelState;", "", "()V", "MaxFlightDistanceStateUpdated", "ProductConnected", "SetMaxFlightDistanceFailed", "SetMaxFlightDistanceSucceeded", "Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidget$ModelState$MaxFlightDistanceStateUpdated;", "Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidget$ModelState$ProductConnected;", "Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidget$ModelState$SetMaxFlightDistanceFailed;", "Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidget$ModelState$SetMaxFlightDistanceSucceeded;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class ModelState {
        
        private ModelState() {
            super();
        }
        
        /**
         * Product connection update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidget$ModelState$ProductConnected;", "Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidget$ModelState;", "isConnected", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductConnected extends dji.v5.ux.core.panel.listitem.maxflightdistance.MaxFlightDistanceListItemWidget.ModelState {
            private final boolean isConnected = false;
            
            /**
             * Product connection update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.maxflightdistance.MaxFlightDistanceListItemWidget.ModelState.ProductConnected copy(boolean isConnected) {
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
         * Max flight distance set action successful
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidget$ModelState$SetMaxFlightDistanceSucceeded;", "Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidget$ModelState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class SetMaxFlightDistanceSucceeded extends dji.v5.ux.core.panel.listitem.maxflightdistance.MaxFlightDistanceListItemWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.panel.listitem.maxflightdistance.MaxFlightDistanceListItemWidget.ModelState.SetMaxFlightDistanceSucceeded INSTANCE = null;
            
            private SetMaxFlightDistanceSucceeded() {
                super();
            }
        }
        
        /**
         * Max flight distance set action failed
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidget$ModelState$SetMaxFlightDistanceFailed;", "Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidget$ModelState;", "error", "Ldji/v5/ux/core/base/UXSDKError;", "(Ldji/v5/ux/core/base/UXSDKError;)V", "getError", "()Ldji/v5/ux/core/base/UXSDKError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class SetMaxFlightDistanceFailed extends dji.v5.ux.core.panel.listitem.maxflightdistance.MaxFlightDistanceListItemWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.base.UXSDKError error = null;
            
            /**
             * Max flight distance set action failed
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.maxflightdistance.MaxFlightDistanceListItemWidget.ModelState.SetMaxFlightDistanceFailed copy(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.base.UXSDKError error) {
                return null;
            }
            
            /**
             * Max flight distance set action failed
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Max flight distance set action failed
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Max flight distance set action failed
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public SetMaxFlightDistanceFailed(@org.jetbrains.annotations.NotNull
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
         * Max flight distance state updated
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidget$ModelState$MaxFlightDistanceStateUpdated;", "Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidget$ModelState;", "maxFlightDistanceState", "Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidgetModel$MaxFlightDistanceState;", "(Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidgetModel$MaxFlightDistanceState;)V", "getMaxFlightDistanceState", "()Ldji/v5/ux/core/panel/listitem/maxflightdistance/MaxFlightDistanceListItemWidgetModel$MaxFlightDistanceState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class MaxFlightDistanceStateUpdated extends dji.v5.ux.core.panel.listitem.maxflightdistance.MaxFlightDistanceListItemWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.panel.listitem.maxflightdistance.MaxFlightDistanceListItemWidgetModel.MaxFlightDistanceState maxFlightDistanceState = null;
            
            /**
             * Max flight distance state updated
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.maxflightdistance.MaxFlightDistanceListItemWidget.ModelState.MaxFlightDistanceStateUpdated copy(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.panel.listitem.maxflightdistance.MaxFlightDistanceListItemWidgetModel.MaxFlightDistanceState maxFlightDistanceState) {
                return null;
            }
            
            /**
             * Max flight distance state updated
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Max flight distance state updated
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Max flight distance state updated
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public MaxFlightDistanceStateUpdated(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.panel.listitem.maxflightdistance.MaxFlightDistanceListItemWidgetModel.MaxFlightDistanceState maxFlightDistanceState) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.maxflightdistance.MaxFlightDistanceListItemWidgetModel.MaxFlightDistanceState component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.maxflightdistance.MaxFlightDistanceListItemWidgetModel.MaxFlightDistanceState getMaxFlightDistanceState() {
                return null;
            }
        }
    }
}