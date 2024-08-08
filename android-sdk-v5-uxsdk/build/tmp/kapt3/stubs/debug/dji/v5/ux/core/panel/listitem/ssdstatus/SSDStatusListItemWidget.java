package dji.v5.ux.core.panel.listitem.ssdstatus;

import java.lang.System;

/**
 * SSD status list item
 *
 * It displays the remaining capacity of the SSD along with
 * any warnings / errors related to the SSD.
 * It provides a button to format SSD.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002<=B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010%\u001a\u00020&H\u0002J\u0010\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002J\n\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0018\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020*2\u0006\u0010.\u001a\u00020\bH\u0002J\u0010\u0010/\u001a\u00020\b2\u0006\u0010)\u001a\u00020*H\u0002J\u000e\u00100\u001a\b\u0012\u0004\u0012\u00020201H\u0016J\u000e\u00103\u001a\b\u0012\u0004\u0012\u00020\u000201H\u0016J\u001a\u00104\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0003J\b\u00105\u001a\u00020&H\u0014J\b\u00106\u001a\u00020&H\u0016J\b\u00107\u001a\u00020&H\u0014J\b\u00108\u001a\u00020&H\u0014J\u0010\u00109\u001a\u00020&2\u0006\u0010)\u001a\u00020:H\u0002J\u0010\u0010;\u001a\u00020&2\u0006\u0010)\u001a\u00020:H\u0002R\u001e\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\"X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$\u00a8\u0006>"}, d2 = {"Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidget;", "Ldji/v5/ux/core/base/panel/listitem/ListItemLabelButtonWidget;", "Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidget$ModelState;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dialogTheme", "getDialogTheme", "()I", "setDialogTheme", "(I)V", "formatConfirmationDialogIcon", "Landroid/graphics/drawable/Drawable;", "getFormatConfirmationDialogIcon", "()Landroid/graphics/drawable/Drawable;", "setFormatConfirmationDialogIcon", "(Landroid/graphics/drawable/Drawable;)V", "formatErrorDialogIcon", "getFormatErrorDialogIcon", "setFormatErrorDialogIcon", "formatSuccessDialogIcon", "getFormatSuccessDialogIcon", "setFormatSuccessDialogIcon", "widgetModel", "Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidgetModel;", "getWidgetModel", "()Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidgetModel;", "widgetModel$delegate", "Lkotlin/Lazy;", "widgetSizeDescription", "Ldji/v5/ux/core/base/WidgetSizeDescription;", "getWidgetSizeDescription", "()Ldji/v5/ux/core/base/WidgetSizeDescription;", "formatSSD", "", "getFormatButtonVisibility", "", "ssdState", "Ldji/sdk/keyvalue/value/camera/SSDOperationState;", "getIdealDimensionRatioString", "", "getSSDMessage", "remainingSpace", "getSSDMessageColor", "getUIStateUpdates", "Lio/reactivex/rxjava3/core/Flowable;", "Ldji/v5/ux/core/base/panel/listitem/ListItemLabelButtonWidget$UIState;", "getWidgetStateUpdate", "initAttributes", "onAttachedToWindow", "onButtonClick", "onDetachedFromWindow", "reactToModelChanges", "updateDisabledState", "Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidgetModel$SSDState;", "updateUI", "DialogType", "ModelState", "android-sdk-v5-uxsdk_debug"})
public class SSDStatusListItemWidget extends dji.v5.ux.core.base.panel.listitem.ListItemLabelButtonWidget<dji.v5.ux.core.panel.listitem.ssdstatus.SSDStatusListItemWidget.ModelState> {
    
    /**
     * Theme for the dialogs shown for format
     */
    @androidx.annotation.StyleRes
    private int dialogTheme;
    
    /**
     * Icon for the dialog which shows format confirmation message
     */
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable formatConfirmationDialogIcon;
    
    /**
     * Icon for the dialog which shows format success message
     */
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable formatSuccessDialogIcon;
    
    /**
     * Icon for the dialog which shows format error message
     */
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable formatErrorDialogIcon;
    private final kotlin.Lazy widgetModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.base.WidgetSizeDescription widgetSizeDescription = null;
    
    @kotlin.jvm.JvmOverloads
    public SSDStatusListItemWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public SSDStatusListItemWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public SSDStatusListItemWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0, null, 0);
    }
    
    public final int getDialogTheme() {
        return 0;
    }
    
    public final void setDialogTheme(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getFormatConfirmationDialogIcon() {
        return null;
    }
    
    public final void setFormatConfirmationDialogIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getFormatSuccessDialogIcon() {
        return null;
    }
    
    public final void setFormatSuccessDialogIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getFormatErrorDialogIcon() {
        return null;
    }
    
    public final void setFormatErrorDialogIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable p0) {
    }
    
    private final dji.v5.ux.core.panel.listitem.ssdstatus.SSDStatusListItemWidgetModel getWidgetModel() {
        return null;
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
    
    private final void updateUI(dji.v5.ux.core.panel.listitem.ssdstatus.SSDStatusListItemWidgetModel.SSDState ssdState) {
    }
    
    private final java.lang.String getSSDMessage(dji.sdk.keyvalue.value.camera.SSDOperationState ssdState, int remainingSpace) {
        return null;
    }
    
    private final int getSSDMessageColor(dji.sdk.keyvalue.value.camera.SSDOperationState ssdState) {
        return 0;
    }
    
    private final boolean getFormatButtonVisibility(dji.sdk.keyvalue.value.camera.SSDOperationState ssdState) {
        return false;
    }
    
    private final void updateDisabledState(dji.v5.ux.core.panel.listitem.ssdstatus.SSDStatusListItemWidgetModel.SSDState ssdState) {
    }
    
    private final void formatSSD() {
    }
    
    @android.annotation.SuppressLint(value = {"Recycle"})
    private final void initAttributes(android.content.Context context, android.util.AttributeSet attrs) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dji.v5.ux.core.base.WidgetSizeDescription getWidgetSizeDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String getIdealDimensionRatioString() {
        return null;
    }
    
    /**
     * Get the [ListItemLabelButtonWidget.UIState] updates
     * The info parameter is instance of [DialogType]
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.base.panel.listitem.ListItemLabelButtonWidget.UIState> getUIStateUpdates() {
        return null;
    }
    
    /**
     * Get the [ModelState] updates
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.SuppressWarnings(value = {})
    @java.lang.Override
    public io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.panel.listitem.ssdstatus.SSDStatusListItemWidget.ModelState> getWidgetStateUpdate() {
        return null;
    }
    
    /**
     * SSD List Item Dialog Identifiers
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidget$DialogType;", "", "()V", "FormatConfirmation", "FormatError", "FormatSuccess", "Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidget$DialogType$FormatConfirmation;", "Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidget$DialogType$FormatError;", "Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidget$DialogType$FormatSuccess;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class DialogType {
        
        private DialogType() {
            super();
        }
        
        /**
         * Dialog shown for format confirmation
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidget$DialogType$FormatConfirmation;", "Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidget$DialogType;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class FormatConfirmation extends dji.v5.ux.core.panel.listitem.ssdstatus.SSDStatusListItemWidget.DialogType {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.panel.listitem.ssdstatus.SSDStatusListItemWidget.DialogType.FormatConfirmation INSTANCE = null;
            
            private FormatConfirmation() {
                super();
            }
        }
        
        /**
         * Dialog shown for format success
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidget$DialogType$FormatSuccess;", "Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidget$DialogType;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class FormatSuccess extends dji.v5.ux.core.panel.listitem.ssdstatus.SSDStatusListItemWidget.DialogType {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.panel.listitem.ssdstatus.SSDStatusListItemWidget.DialogType.FormatSuccess INSTANCE = null;
            
            private FormatSuccess() {
                super();
            }
        }
        
        /**
         * Dialog shown for format fail
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidget$DialogType$FormatError;", "Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidget$DialogType;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class FormatError extends dji.v5.ux.core.panel.listitem.ssdstatus.SSDStatusListItemWidget.DialogType {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.panel.listitem.ssdstatus.SSDStatusListItemWidget.DialogType.FormatError INSTANCE = null;
            
            private FormatError() {
                super();
            }
        }
    }
    
    /**
     * Class defines widget state updates
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidget$ModelState;", "", "()V", "ProductConnected", "SSDStateUpdated", "Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidget$ModelState$ProductConnected;", "Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidget$ModelState$SSDStateUpdated;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class ModelState {
        
        private ModelState() {
            super();
        }
        
        /**
         * Product connection update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidget$ModelState$ProductConnected;", "Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidget$ModelState;", "isConnected", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductConnected extends dji.v5.ux.core.panel.listitem.ssdstatus.SSDStatusListItemWidget.ModelState {
            private final boolean isConnected = false;
            
            /**
             * Product connection update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.ssdstatus.SSDStatusListItemWidget.ModelState.ProductConnected copy(boolean isConnected) {
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
         * Current SSD List Item State
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidget$ModelState$SSDStateUpdated;", "Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidget$ModelState;", "ssdState", "Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidgetModel$SSDState;", "(Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidgetModel$SSDState;)V", "getSsdState", "()Ldji/v5/ux/core/panel/listitem/ssdstatus/SSDStatusListItemWidgetModel$SSDState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class SSDStateUpdated extends dji.v5.ux.core.panel.listitem.ssdstatus.SSDStatusListItemWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.panel.listitem.ssdstatus.SSDStatusListItemWidgetModel.SSDState ssdState = null;
            
            /**
             * Current SSD List Item State
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.ssdstatus.SSDStatusListItemWidget.ModelState.SSDStateUpdated copy(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.panel.listitem.ssdstatus.SSDStatusListItemWidgetModel.SSDState ssdState) {
                return null;
            }
            
            /**
             * Current SSD List Item State
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Current SSD List Item State
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Current SSD List Item State
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public SSDStateUpdated(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.panel.listitem.ssdstatus.SSDStatusListItemWidgetModel.SSDState ssdState) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.ssdstatus.SSDStatusListItemWidgetModel.SSDState component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.ssdstatus.SSDStatusListItemWidgetModel.SSDState getSsdState() {
                return null;
            }
        }
    }
}