package dji.v5.ux.core.base.panel.listitem;

import java.lang.System;

/**
 * This is the base class to be used for
 * switch type list item.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004:\u00012B-\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0002\u0010\fJ\b\u0010 \u001a\u00020!H\u0002J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0#H\u0016J\u001a\u0010$\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0003J\b\u0010%\u001a\u00020!H\u0002J\u001a\u0010&\u001a\u00020!2\b\u0010\'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020!H\u0016J\u0010\u0010,\u001a\u00020!2\u0006\u0010)\u001a\u00020*H&J\u0010\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020*H\u0004J\u0010\u0010/\u001a\u00020!2\u0006\u00100\u001a\u00020*H\u0016J\u0010\u0010\u0013\u001a\u00020!2\b\b\u0001\u00101\u001a\u00020\nJ\u0010\u0010\u0017\u001a\u00020!2\b\b\u0001\u00101\u001a\u00020\nJ\u0010\u0010\u001a\u001a\u00020!2\b\b\u0001\u00101\u001a\u00020\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u00a8\u00063"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemSwitchWidget;", "T", "", "Ldji/v5/ux/core/base/panel/listitem/ListItemTitleWidget;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defaultStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "listItemSwitch", "Landroid/widget/Switch;", "switchBackground", "Landroid/graphics/drawable/Drawable;", "getSwitchBackground", "()Landroid/graphics/drawable/Drawable;", "setSwitchBackground", "(Landroid/graphics/drawable/Drawable;)V", "switchThumbIcon", "getSwitchThumbIcon", "setSwitchThumbIcon", "switchTrackIcon", "getSwitchTrackIcon", "setSwitchTrackIcon", "uiUpdateStateProcessor", "Lio/reactivex/rxjava3/processors/PublishProcessor;", "Ldji/v5/ux/core/base/panel/listitem/ListItemSwitchWidget$UIState;", "getUiUpdateStateProcessor", "()Lio/reactivex/rxjava3/processors/PublishProcessor;", "configureSwitchWidget", "", "getUIStateUpdates", "Lio/reactivex/rxjava3/core/Flowable;", "initAttributes", "initSwitch", "onCheckedChanged", "buttonView", "Landroid/widget/CompoundButton;", "isChecked", "", "onListItemClick", "onSwitchToggle", "setChecked", "isSwitchChecked", "setEnabled", "enabled", "resourceId", "UIState", "android-sdk-v5-uxsdk_debug"})
public abstract class ListItemSwitchWidget<T extends java.lang.Object> extends dji.v5.ux.core.base.panel.listitem.ListItemTitleWidget<T> implements android.widget.CompoundButton.OnCheckedChangeListener {
    private final android.widget.Switch listItemSwitch = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.rxjava3.processors.PublishProcessor<dji.v5.ux.core.base.panel.listitem.ListItemSwitchWidget.UIState> uiUpdateStateProcessor = null;
    
    /**
     * The icon used for thumb for list item switch
     */
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable switchThumbIcon;
    
    /**
     * The icon used for track for list item switch
     */
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable switchTrackIcon;
    
    /**
     * The background of the list item switch
     */
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable switchBackground;
    
    @kotlin.jvm.JvmOverloads
    public ListItemSwitchWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, int defaultStyle) {
        super(null, null, 0, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public ListItemSwitchWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defaultStyle) {
        super(null, null, 0, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public ListItemSwitchWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr, int defaultStyle) {
        super(null, null, 0, 0);
    }
    
    @org.jetbrains.annotations.NotNull
    protected final io.reactivex.rxjava3.processors.PublishProcessor<dji.v5.ux.core.base.panel.listitem.ListItemSwitchWidget.UIState> getUiUpdateStateProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getSwitchThumbIcon() {
        return null;
    }
    
    public final void setSwitchThumbIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getSwitchTrackIcon() {
        return null;
    }
    
    public final void setSwitchTrackIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getSwitchBackground() {
        return null;
    }
    
    public final void setSwitchBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable p0) {
    }
    
    @android.annotation.SuppressLint(value = {"Recycle"})
    private final void initAttributes(android.content.Context context, android.util.AttributeSet attrs) {
    }
    
    private final void configureSwitchWidget() {
    }
    
    private final void initSwitch() {
    }
    
    @java.lang.Override
    public void onCheckedChanged(@org.jetbrains.annotations.Nullable
    android.widget.CompoundButton buttonView, boolean isChecked) {
    }
    
    @java.lang.Override
    public void onListItemClick() {
    }
    
    @java.lang.Override
    public void setEnabled(boolean enabled) {
    }
    
    public abstract void onSwitchToggle(boolean isChecked);
    
    protected final void setChecked(boolean isSwitchChecked) {
    }
    
    /**
     * Set the resource ID for the list item switch thumb icon
     *
     * @param resourceId Integer ID of the drawable resource
     */
    public final void setSwitchThumbIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the resource ID for the list item switch track icon
     *
     * @param resourceId Integer ID of the drawable resource
     */
    public final void setSwitchTrackIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the resource ID for the list item switch background
     *
     * @param resourceId Integer ID of the drawable resource
     */
    public final void setSwitchBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Get the [UIState] updates
     */
    @org.jetbrains.annotations.NotNull
    public io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.base.panel.listitem.ListItemSwitchWidget.UIState> getUIStateUpdates() {
        return null;
    }
    
    /**
     * Widget UI update State
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemSwitchWidget$UIState;", "", "()V", "DialogActionCanceled", "DialogActionConfirmed", "DialogDismissed", "DialogDisplayed", "ListItemClicked", "SwitchChanged", "Ldji/v5/ux/core/base/panel/listitem/ListItemSwitchWidget$UIState$DialogActionCanceled;", "Ldji/v5/ux/core/base/panel/listitem/ListItemSwitchWidget$UIState$DialogActionConfirmed;", "Ldji/v5/ux/core/base/panel/listitem/ListItemSwitchWidget$UIState$DialogDismissed;", "Ldji/v5/ux/core/base/panel/listitem/ListItemSwitchWidget$UIState$DialogDisplayed;", "Ldji/v5/ux/core/base/panel/listitem/ListItemSwitchWidget$UIState$ListItemClicked;", "Ldji/v5/ux/core/base/panel/listitem/ListItemSwitchWidget$UIState$SwitchChanged;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class UIState {
        
        private UIState() {
            super();
        }
        
        /**
         * List Item click update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemSwitchWidget$UIState$ListItemClicked;", "Ldji/v5/ux/core/base/panel/listitem/ListItemSwitchWidget$UIState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class ListItemClicked extends dji.v5.ux.core.base.panel.listitem.ListItemSwitchWidget.UIState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.base.panel.listitem.ListItemSwitchWidget.UIState.ListItemClicked INSTANCE = null;
            
            private ListItemClicked() {
                super();
            }
        }
        
        /**
         * Button click update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemSwitchWidget$UIState$SwitchChanged;", "Ldji/v5/ux/core/base/panel/listitem/ListItemSwitchWidget$UIState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class SwitchChanged extends dji.v5.ux.core.base.panel.listitem.ListItemSwitchWidget.UIState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.base.panel.listitem.ListItemSwitchWidget.UIState.SwitchChanged INSTANCE = null;
            
            private SwitchChanged() {
                super();
            }
        }
        
        /**
         * Dialog shown update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemSwitchWidget$UIState$DialogDisplayed;", "Ldji/v5/ux/core/base/panel/listitem/ListItemSwitchWidget$UIState;", "info", "", "(Ljava/lang/Object;)V", "getInfo", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class DialogDisplayed extends dji.v5.ux.core.base.panel.listitem.ListItemSwitchWidget.UIState {
            @org.jetbrains.annotations.Nullable
            private final java.lang.Object info = null;
            
            /**
             * Dialog shown update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.base.panel.listitem.ListItemSwitchWidget.UIState.DialogDisplayed copy(@org.jetbrains.annotations.Nullable
            java.lang.Object info) {
                return null;
            }
            
            /**
             * Dialog shown update
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Dialog shown update
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Dialog shown update
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public DialogDisplayed(@org.jetbrains.annotations.Nullable
            java.lang.Object info) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object getInfo() {
                return null;
            }
        }
        
        /**
         * Dialog action confirm
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemSwitchWidget$UIState$DialogActionConfirmed;", "Ldji/v5/ux/core/base/panel/listitem/ListItemSwitchWidget$UIState;", "info", "", "(Ljava/lang/Object;)V", "getInfo", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class DialogActionConfirmed extends dji.v5.ux.core.base.panel.listitem.ListItemSwitchWidget.UIState {
            @org.jetbrains.annotations.Nullable
            private final java.lang.Object info = null;
            
            /**
             * Dialog action confirm
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.base.panel.listitem.ListItemSwitchWidget.UIState.DialogActionConfirmed copy(@org.jetbrains.annotations.Nullable
            java.lang.Object info) {
                return null;
            }
            
            /**
             * Dialog action confirm
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Dialog action confirm
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Dialog action confirm
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public DialogActionConfirmed(@org.jetbrains.annotations.Nullable
            java.lang.Object info) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object getInfo() {
                return null;
            }
        }
        
        /**
         * Dialog action cancel
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemSwitchWidget$UIState$DialogActionCanceled;", "Ldji/v5/ux/core/base/panel/listitem/ListItemSwitchWidget$UIState;", "info", "", "(Ljava/lang/Object;)V", "getInfo", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class DialogActionCanceled extends dji.v5.ux.core.base.panel.listitem.ListItemSwitchWidget.UIState {
            @org.jetbrains.annotations.Nullable
            private final java.lang.Object info = null;
            
            /**
             * Dialog action cancel
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.base.panel.listitem.ListItemSwitchWidget.UIState.DialogActionCanceled copy(@org.jetbrains.annotations.Nullable
            java.lang.Object info) {
                return null;
            }
            
            /**
             * Dialog action cancel
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Dialog action cancel
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Dialog action cancel
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public DialogActionCanceled(@org.jetbrains.annotations.Nullable
            java.lang.Object info) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object getInfo() {
                return null;
            }
        }
        
        /**
         * Dialog action dismiss
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemSwitchWidget$UIState$DialogDismissed;", "Ldji/v5/ux/core/base/panel/listitem/ListItemSwitchWidget$UIState;", "info", "", "(Ljava/lang/Object;)V", "getInfo", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class DialogDismissed extends dji.v5.ux.core.base.panel.listitem.ListItemSwitchWidget.UIState {
            @org.jetbrains.annotations.Nullable
            private final java.lang.Object info = null;
            
            /**
             * Dialog action dismiss
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.base.panel.listitem.ListItemSwitchWidget.UIState.DialogDismissed copy(@org.jetbrains.annotations.Nullable
            java.lang.Object info) {
                return null;
            }
            
            /**
             * Dialog action dismiss
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Dialog action dismiss
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Dialog action dismiss
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public DialogDismissed(@org.jetbrains.annotations.Nullable
            java.lang.Object info) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object getInfo() {
                return null;
            }
        }
    }
}