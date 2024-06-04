package dji.v5.ux.core.panel.listitem.rcstickmode;

import java.lang.System;

/**
 * Widget shows the various options for RC Stick mode.
 * The current mode is shown selected. Tapping on another mode will
 * change the mode.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001dH\u0014J\u0018\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0019H\u0016J\b\u0010\"\u001a\u00020\u001dH\u0014J\u0010\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%H\u0002R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\'"}, d2 = {"Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidget;", "Ldji/v5/ux/core/base/panel/listitem/ListItemRadioButtonWidget;", "Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidget$ModelState;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mode1ItemIndex", "mode2ItemIndex", "mode3ItemIndex", "modeCustomItemIndex", "widgetModel", "Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidgetModel;", "getWidgetModel", "()Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidgetModel;", "widgetModel$delegate", "Lkotlin/Lazy;", "widgetSizeDescription", "Ldji/v5/ux/core/base/WidgetSizeDescription;", "getWidgetSizeDescription", "()Ldji/v5/ux/core/base/WidgetSizeDescription;", "getIdealDimensionRatioString", "", "getWidgetStateUpdate", "Lio/reactivex/rxjava3/core/Flowable;", "onAttachedToWindow", "", "onDetachedFromWindow", "onOptionTapped", "optionIndex", "optionLabel", "reactToModelChanges", "updateUI", "rcStickModeState", "Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidgetModel$RCStickModeState;", "ModelState", "android-sdk-v5-uxsdk_debug"})
public class RCStickModeListItemWidget extends dji.v5.ux.core.base.panel.listitem.ListItemRadioButtonWidget<dji.v5.ux.core.panel.listitem.rcstickmode.RCStickModeListItemWidget.ModelState> {
    private final kotlin.Lazy widgetModel$delegate = null;
    private int mode1ItemIndex = -1;
    private int mode2ItemIndex = -1;
    private int mode3ItemIndex = -1;
    private int modeCustomItemIndex = -1;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.base.WidgetSizeDescription widgetSizeDescription = null;
    
    @kotlin.jvm.JvmOverloads
    public RCStickModeListItemWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public RCStickModeListItemWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public RCStickModeListItemWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0, 0);
    }
    
    private final dji.v5.ux.core.panel.listitem.rcstickmode.RCStickModeListItemWidgetModel getWidgetModel() {
        return null;
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
    public void onOptionTapped(int optionIndex, @org.jetbrains.annotations.NotNull
    java.lang.String optionLabel) {
    }
    
    private final void updateUI(dji.v5.ux.core.panel.listitem.rcstickmode.RCStickModeListItemWidgetModel.RCStickModeState rcStickModeState) {
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
    public io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.panel.listitem.rcstickmode.RCStickModeListItemWidget.ModelState> getWidgetStateUpdate() {
        return null;
    }
    
    /**
     * Class defines widget state updates
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidget$ModelState;", "", "()V", "ProductConnected", "RCStickModeUpdated", "SetRCStickModeFailed", "SetRCStickModeSucceeded", "Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidget$ModelState$ProductConnected;", "Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidget$ModelState$RCStickModeUpdated;", "Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidget$ModelState$SetRCStickModeFailed;", "Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidget$ModelState$SetRCStickModeSucceeded;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class ModelState {
        
        private ModelState() {
            super();
        }
        
        /**
         * Product connection update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidget$ModelState$ProductConnected;", "Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidget$ModelState;", "isConnected", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductConnected extends dji.v5.ux.core.panel.listitem.rcstickmode.RCStickModeListItemWidget.ModelState {
            private final boolean isConnected = false;
            
            /**
             * Product connection update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.rcstickmode.RCStickModeListItemWidget.ModelState.ProductConnected copy(boolean isConnected) {
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
         * Set RC stick mode success
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidget$ModelState$SetRCStickModeSucceeded;", "Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidget$ModelState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class SetRCStickModeSucceeded extends dji.v5.ux.core.panel.listitem.rcstickmode.RCStickModeListItemWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.panel.listitem.rcstickmode.RCStickModeListItemWidget.ModelState.SetRCStickModeSucceeded INSTANCE = null;
            
            private SetRCStickModeSucceeded() {
                super();
            }
        }
        
        /**
         * Set RC stick mode failed
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidget$ModelState$SetRCStickModeFailed;", "Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidget$ModelState;", "error", "Ldji/v5/ux/core/base/UXSDKError;", "(Ldji/v5/ux/core/base/UXSDKError;)V", "getError", "()Ldji/v5/ux/core/base/UXSDKError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class SetRCStickModeFailed extends dji.v5.ux.core.panel.listitem.rcstickmode.RCStickModeListItemWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.base.UXSDKError error = null;
            
            /**
             * Set RC stick mode failed
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.rcstickmode.RCStickModeListItemWidget.ModelState.SetRCStickModeFailed copy(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.base.UXSDKError error) {
                return null;
            }
            
            /**
             * Set RC stick mode failed
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Set RC stick mode failed
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Set RC stick mode failed
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public SetRCStickModeFailed(@org.jetbrains.annotations.NotNull
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
         * RC stick mode state updated
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidget$ModelState$RCStickModeUpdated;", "Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidget$ModelState;", "rcStickModeState", "Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidgetModel$RCStickModeState;", "(Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidgetModel$RCStickModeState;)V", "getRcStickModeState", "()Ldji/v5/ux/core/panel/listitem/rcstickmode/RCStickModeListItemWidgetModel$RCStickModeState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class RCStickModeUpdated extends dji.v5.ux.core.panel.listitem.rcstickmode.RCStickModeListItemWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.panel.listitem.rcstickmode.RCStickModeListItemWidgetModel.RCStickModeState rcStickModeState = null;
            
            /**
             * RC stick mode state updated
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.rcstickmode.RCStickModeListItemWidget.ModelState.RCStickModeUpdated copy(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.panel.listitem.rcstickmode.RCStickModeListItemWidgetModel.RCStickModeState rcStickModeState) {
                return null;
            }
            
            /**
             * RC stick mode state updated
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * RC stick mode state updated
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * RC stick mode state updated
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public RCStickModeUpdated(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.panel.listitem.rcstickmode.RCStickModeListItemWidgetModel.RCStickModeState rcStickModeState) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.rcstickmode.RCStickModeListItemWidgetModel.RCStickModeState component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.rcstickmode.RCStickModeListItemWidgetModel.RCStickModeState getRcStickModeState() {
                return null;
            }
        }
    }
}