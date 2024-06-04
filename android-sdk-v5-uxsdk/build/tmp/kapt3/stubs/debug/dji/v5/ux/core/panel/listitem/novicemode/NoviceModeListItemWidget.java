package dji.v5.ux.core.panel.listitem.novicemode;

import java.lang.System;

/**
 * Widget shows the current status of the Novice Mode, also known
 * as Beginner Mode.
 * It also provides an option to switch between ON/OFF state
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002:;B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\n\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%H\u0016J\u000e\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00020%H\u0016J\u001a\u0010(\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0003J\b\u0010*\u001a\u00020)H\u0014J\b\u0010+\u001a\u00020)H\u0014J\u0010\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020)H\u0014J\b\u00100\u001a\u00020)H\u0002J\b\u00101\u001a\u00020)H\u0002J\b\u00102\u001a\u00020)H\u0002J\u0010\u00103\u001a\u00020)2\u0006\u00104\u001a\u00020.H\u0002J\u0010\u00105\u001a\u00020)2\u0006\u00106\u001a\u00020.H\u0002J\u0010\u00107\u001a\u00020)2\u0006\u00108\u001a\u000209H\u0002R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!\u00a8\u0006<"}, d2 = {"Ldji/v5/ux/core/panel/listitem/novicemode/NoviceModeListItemWidget;", "Ldji/v5/ux/core/base/panel/listitem/ListItemSwitchWidget;", "Ldji/v5/ux/core/panel/listitem/novicemode/NoviceModeListItemWidget$ModelState;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleArr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "confirmationDialogIcon", "Landroid/graphics/drawable/Drawable;", "getConfirmationDialogIcon", "()Landroid/graphics/drawable/Drawable;", "setConfirmationDialogIcon", "(Landroid/graphics/drawable/Drawable;)V", "dialogTheme", "getDialogTheme", "()I", "setDialogTheme", "(I)V", "successDialogIcon", "getSuccessDialogIcon", "setSuccessDialogIcon", "widgetModel", "Ldji/v5/ux/core/panel/listitem/novicemode/NoviceModeListItemWidgetModel;", "getWidgetModel", "()Ldji/v5/ux/core/panel/listitem/novicemode/NoviceModeListItemWidgetModel;", "widgetModel$delegate", "Lkotlin/Lazy;", "widgetSizeDescription", "Ldji/v5/ux/core/base/WidgetSizeDescription;", "getWidgetSizeDescription", "()Ldji/v5/ux/core/base/WidgetSizeDescription;", "getIdealDimensionRatioString", "", "getUIStateUpdates", "Lio/reactivex/rxjava3/core/Flowable;", "Ldji/v5/ux/core/base/panel/listitem/ListItemSwitchWidget$UIState;", "getWidgetStateUpdate", "initAttributes", "", "onAttachedToWindow", "onDetachedFromWindow", "onSwitchToggle", "isChecked", "", "reactToModelChanges", "resetSwitchState", "showEnabledDialog", "showNoviceModeConfirmationDialog", "toggleNoviceMode", "checked", "updateState", "noviceModeEnabled", "updateUI", "noviceModeState", "Ldji/v5/ux/core/panel/listitem/novicemode/NoviceModeListItemWidgetModel$NoviceModeState;", "DialogType", "ModelState", "android-sdk-v5-uxsdk_debug"})
public class NoviceModeListItemWidget extends dji.v5.ux.core.base.panel.listitem.ListItemSwitchWidget<dji.v5.ux.core.panel.listitem.novicemode.NoviceModeListItemWidget.ModelState> {
    private final kotlin.Lazy widgetModel$delegate = null;
    
    /**
     * Icon for confirmation dialog
     */
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable confirmationDialogIcon;
    
    /**
     * Icon for success dialog
     */
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable successDialogIcon;
    
    /**
     * Theme for the dialogs shown in the widget
     */
    @androidx.annotation.StyleRes
    private int dialogTheme;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.base.WidgetSizeDescription widgetSizeDescription = null;
    
    @kotlin.jvm.JvmOverloads
    public NoviceModeListItemWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public NoviceModeListItemWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public NoviceModeListItemWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleArr) {
        super(null, null, 0, 0);
    }
    
    private final dji.v5.ux.core.panel.listitem.novicemode.NoviceModeListItemWidgetModel getWidgetModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getConfirmationDialogIcon() {
        return null;
    }
    
    public final void setConfirmationDialogIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getSuccessDialogIcon() {
        return null;
    }
    
    public final void setSuccessDialogIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable p0) {
    }
    
    public final int getDialogTheme() {
        return 0;
    }
    
    public final void setDialogTheme(int p0) {
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
    
    @java.lang.Override
    public void onSwitchToggle(boolean isChecked) {
    }
    
    private final void updateUI(dji.v5.ux.core.panel.listitem.novicemode.NoviceModeListItemWidgetModel.NoviceModeState noviceModeState) {
    }
    
    private final void updateState(boolean noviceModeEnabled) {
    }
    
    private final void toggleNoviceMode(boolean checked) {
    }
    
    private final void showNoviceModeConfirmationDialog() {
    }
    
    private final void showEnabledDialog() {
    }
    
    private final void resetSwitchState() {
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
     * Get the [ListItemSwitchWidget.UIState] updates
     * The info parameter is instance of [DialogType]
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.base.panel.listitem.ListItemSwitchWidget.UIState> getUIStateUpdates() {
        return null;
    }
    
    /**
     * Get the [ModelState] updates
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.SuppressWarnings(value = {})
    @java.lang.Override
    public io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.panel.listitem.novicemode.NoviceModeListItemWidget.ModelState> getWidgetStateUpdate() {
        return null;
    }
    
    /**
     * Novice mode dialog identifiers
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Ldji/v5/ux/core/panel/listitem/novicemode/NoviceModeListItemWidget$DialogType;", "", "()V", "NoviceModeDisableConfirmation", "NoviceModeEnabled", "Ldji/v5/ux/core/panel/listitem/novicemode/NoviceModeListItemWidget$DialogType$NoviceModeDisableConfirmation;", "Ldji/v5/ux/core/panel/listitem/novicemode/NoviceModeListItemWidget$DialogType$NoviceModeEnabled;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class DialogType {
        
        private DialogType() {
            super();
        }
        
        /**
         * Dialog shown when novice mode is enabled successfully
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/novicemode/NoviceModeListItemWidget$DialogType$NoviceModeEnabled;", "Ldji/v5/ux/core/panel/listitem/novicemode/NoviceModeListItemWidget$DialogType;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class NoviceModeEnabled extends dji.v5.ux.core.panel.listitem.novicemode.NoviceModeListItemWidget.DialogType {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.panel.listitem.novicemode.NoviceModeListItemWidget.DialogType.NoviceModeEnabled INSTANCE = null;
            
            private NoviceModeEnabled() {
                super();
            }
        }
        
        /**
         * Dialog shown when switching from enabled to disabled
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/novicemode/NoviceModeListItemWidget$DialogType$NoviceModeDisableConfirmation;", "Ldji/v5/ux/core/panel/listitem/novicemode/NoviceModeListItemWidget$DialogType;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class NoviceModeDisableConfirmation extends dji.v5.ux.core.panel.listitem.novicemode.NoviceModeListItemWidget.DialogType {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.panel.listitem.novicemode.NoviceModeListItemWidget.DialogType.NoviceModeDisableConfirmation INSTANCE = null;
            
            private NoviceModeDisableConfirmation() {
                super();
            }
        }
    }
    
    /**
     * Class defines widget state updates
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Ldji/v5/ux/core/panel/listitem/novicemode/NoviceModeListItemWidget$ModelState;", "", "()V", "NoviceModeStateUpdated", "ProductConnected", "Ldji/v5/ux/core/panel/listitem/novicemode/NoviceModeListItemWidget$ModelState$NoviceModeStateUpdated;", "Ldji/v5/ux/core/panel/listitem/novicemode/NoviceModeListItemWidget$ModelState$ProductConnected;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class ModelState {
        
        private ModelState() {
            super();
        }
        
        /**
         * Product connection update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/core/panel/listitem/novicemode/NoviceModeListItemWidget$ModelState$ProductConnected;", "Ldji/v5/ux/core/panel/listitem/novicemode/NoviceModeListItemWidget$ModelState;", "isConnected", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductConnected extends dji.v5.ux.core.panel.listitem.novicemode.NoviceModeListItemWidget.ModelState {
            private final boolean isConnected = false;
            
            /**
             * Product connection update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.novicemode.NoviceModeListItemWidget.ModelState.ProductConnected copy(boolean isConnected) {
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
         * Current novice mode state
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/core/panel/listitem/novicemode/NoviceModeListItemWidget$ModelState$NoviceModeStateUpdated;", "Ldji/v5/ux/core/panel/listitem/novicemode/NoviceModeListItemWidget$ModelState;", "noviceModeState", "Ldji/v5/ux/core/panel/listitem/novicemode/NoviceModeListItemWidgetModel$NoviceModeState;", "(Ldji/v5/ux/core/panel/listitem/novicemode/NoviceModeListItemWidgetModel$NoviceModeState;)V", "getNoviceModeState", "()Ldji/v5/ux/core/panel/listitem/novicemode/NoviceModeListItemWidgetModel$NoviceModeState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class NoviceModeStateUpdated extends dji.v5.ux.core.panel.listitem.novicemode.NoviceModeListItemWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.panel.listitem.novicemode.NoviceModeListItemWidgetModel.NoviceModeState noviceModeState = null;
            
            /**
             * Current novice mode state
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.novicemode.NoviceModeListItemWidget.ModelState.NoviceModeStateUpdated copy(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.panel.listitem.novicemode.NoviceModeListItemWidgetModel.NoviceModeState noviceModeState) {
                return null;
            }
            
            /**
             * Current novice mode state
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Current novice mode state
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Current novice mode state
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public NoviceModeStateUpdated(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.panel.listitem.novicemode.NoviceModeListItemWidgetModel.NoviceModeState noviceModeState) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.novicemode.NoviceModeListItemWidgetModel.NoviceModeState component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.novicemode.NoviceModeListItemWidgetModel.NoviceModeState getNoviceModeState() {
                return null;
            }
        }
    }
}