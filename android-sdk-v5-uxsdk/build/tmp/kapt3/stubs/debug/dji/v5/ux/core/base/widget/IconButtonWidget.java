package dji.v5.ux.core.base.widget;

import java.lang.System;

/**
 * Abstract class that represents a widget with a single Image View.
 * The class provides functionality and customizations for widgets to reuse
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004:\u00010B%\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010$\u001a\u00020%H$J\b\u0010&\u001a\u00020\'H\u0016J\f\u0010(\u001a\b\u0012\u0004\u0012\u00020!0)J\u0018\u0010*\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0003J\"\u0010+\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0015J\u0012\u0010,\u001a\u00020%2\b\u0010-\u001a\u0004\u0018\u00010.H\u0017J\u0010\u0010\u001d\u001a\u00020%2\b\b\u0001\u0010/\u001a\u00020\nR(\u0010\r\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\n8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0012\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\n8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u0016X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R(\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\f\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#\u00a8\u00061"}, d2 = {"Ldji/v5/ux/core/base/widget/IconButtonWidget;", "T", "", "Ldji/v5/ux/core/base/widget/ConstraintLayoutWidget;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "connectedStateIconColor", "getConnectedStateIconColor", "()I", "setConnectedStateIconColor", "(I)V", "disconnectedStateIconColor", "getDisconnectedStateIconColor", "setDisconnectedStateIconColor", "foregroundImageView", "Landroid/widget/ImageView;", "getForegroundImageView", "()Landroid/widget/ImageView;", "Landroid/graphics/drawable/Drawable;", "iconBackground", "getIconBackground", "()Landroid/graphics/drawable/Drawable;", "setIconBackground", "(Landroid/graphics/drawable/Drawable;)V", "uiUpdateStateProcessor", "Lio/reactivex/rxjava3/processors/PublishProcessor;", "Ldji/v5/ux/core/base/widget/IconButtonWidget$UIState;", "getUiUpdateStateProcessor", "()Lio/reactivex/rxjava3/processors/PublishProcessor;", "checkAndUpdateIconColor", "", "getIdealDimensionRatioString", "", "getUIStateUpdates", "Lio/reactivex/rxjava3/core/Flowable;", "initAttributes", "initView", "onClick", "view", "Landroid/view/View;", "resourceId", "UIState", "android-sdk-v5-uxsdk_debug"})
public abstract class IconButtonWidget<T extends java.lang.Object> extends dji.v5.ux.core.base.widget.ConstraintLayoutWidget<T> implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull
    private final android.widget.ImageView foregroundImageView = null;
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.rxjava3.processors.PublishProcessor<dji.v5.ux.core.base.widget.IconButtonWidget.UIState> uiUpdateStateProcessor = null;
    
    /**
     * The color of the icon when the product is connected
     */
    private int connectedStateIconColor;
    
    /**
     * The color of the icon when the product is disconnected
     */
    private int disconnectedStateIconColor;
    
    @kotlin.jvm.JvmOverloads
    public IconButtonWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public IconButtonWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public IconButtonWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    @org.jetbrains.annotations.NotNull
    protected final android.widget.ImageView getForegroundImageView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final io.reactivex.rxjava3.processors.PublishProcessor<dji.v5.ux.core.base.widget.IconButtonWidget.UIState> getUiUpdateStateProcessor() {
        return null;
    }
    
    @androidx.annotation.ColorInt
    public final int getConnectedStateIconColor() {
        return 0;
    }
    
    public final void setConnectedStateIconColor(@androidx.annotation.ColorInt
    int value) {
    }
    
    @androidx.annotation.ColorInt
    public final int getDisconnectedStateIconColor() {
        return 0;
    }
    
    public final void setDisconnectedStateIconColor(@androidx.annotation.ColorInt
    int value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getIconBackground() {
        return null;
    }
    
    public final void setIconBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @androidx.annotation.CallSuper
    @java.lang.Override
    protected void initView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
    }
    
    protected abstract void checkAndUpdateIconColor();
    
    @android.annotation.SuppressLint(value = {"Recycle"})
    private final void initAttributes(android.content.Context context, android.util.AttributeSet attrs) {
    }
    
    @androidx.annotation.CallSuper
    @java.lang.Override
    public void onClick(@org.jetbrains.annotations.Nullable
    android.view.View view) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getIdealDimensionRatioString() {
        return null;
    }
    
    /**
     * Set background to foregroundImageView
     *
     * @param resourceId Integer ID of the background resource
     */
    public final void setIconBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Get the [UIState] updates
     */
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.base.widget.IconButtonWidget.UIState> getUIStateUpdates() {
        return null;
    }
    
    /**
     * Widget UI update State
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/core/base/widget/IconButtonWidget$UIState;", "", "()V", "DialogActionCancelled", "DialogActionConfirmed", "DialogCheckboxCheckChanged", "DialogDismissed", "DialogDisplayed", "WidgetClicked", "Ldji/v5/ux/core/base/widget/IconButtonWidget$UIState$DialogActionCancelled;", "Ldji/v5/ux/core/base/widget/IconButtonWidget$UIState$DialogActionConfirmed;", "Ldji/v5/ux/core/base/widget/IconButtonWidget$UIState$DialogCheckboxCheckChanged;", "Ldji/v5/ux/core/base/widget/IconButtonWidget$UIState$DialogDismissed;", "Ldji/v5/ux/core/base/widget/IconButtonWidget$UIState$DialogDisplayed;", "Ldji/v5/ux/core/base/widget/IconButtonWidget$UIState$WidgetClicked;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class UIState {
        
        private UIState() {
            super();
        }
        
        /**
         * Widget click update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/base/widget/IconButtonWidget$UIState$WidgetClicked;", "Ldji/v5/ux/core/base/widget/IconButtonWidget$UIState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class WidgetClicked extends dji.v5.ux.core.base.widget.IconButtonWidget.UIState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.base.widget.IconButtonWidget.UIState.WidgetClicked INSTANCE = null;
            
            private WidgetClicked() {
                super();
            }
        }
        
        /**
         * Dialog shown update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Ldji/v5/ux/core/base/widget/IconButtonWidget$UIState$DialogDisplayed;", "Ldji/v5/ux/core/base/widget/IconButtonWidget$UIState;", "info", "", "(Ljava/lang/Object;)V", "getInfo", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class DialogDisplayed extends dji.v5.ux.core.base.widget.IconButtonWidget.UIState {
            @org.jetbrains.annotations.Nullable
            private final java.lang.Object info = null;
            
            /**
             * Dialog shown update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.base.widget.IconButtonWidget.UIState.DialogDisplayed copy(@org.jetbrains.annotations.Nullable
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
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Ldji/v5/ux/core/base/widget/IconButtonWidget$UIState$DialogActionConfirmed;", "Ldji/v5/ux/core/base/widget/IconButtonWidget$UIState;", "info", "", "(Ljava/lang/Object;)V", "getInfo", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class DialogActionConfirmed extends dji.v5.ux.core.base.widget.IconButtonWidget.UIState {
            @org.jetbrains.annotations.Nullable
            private final java.lang.Object info = null;
            
            /**
             * Dialog action confirm
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.base.widget.IconButtonWidget.UIState.DialogActionConfirmed copy(@org.jetbrains.annotations.Nullable
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
         * Dialog action dismiss
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Ldji/v5/ux/core/base/widget/IconButtonWidget$UIState$DialogDismissed;", "Ldji/v5/ux/core/base/widget/IconButtonWidget$UIState;", "info", "", "(Ljava/lang/Object;)V", "getInfo", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class DialogDismissed extends dji.v5.ux.core.base.widget.IconButtonWidget.UIState {
            @org.jetbrains.annotations.Nullable
            private final java.lang.Object info = null;
            
            /**
             * Dialog action dismiss
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.base.widget.IconButtonWidget.UIState.DialogDismissed copy(@org.jetbrains.annotations.Nullable
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
        
        /**
         * Dialog action dismiss
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Ldji/v5/ux/core/base/widget/IconButtonWidget$UIState$DialogActionCancelled;", "Ldji/v5/ux/core/base/widget/IconButtonWidget$UIState;", "info", "", "(Ljava/lang/Object;)V", "getInfo", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class DialogActionCancelled extends dji.v5.ux.core.base.widget.IconButtonWidget.UIState {
            @org.jetbrains.annotations.Nullable
            private final java.lang.Object info = null;
            
            /**
             * Dialog action dismiss
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.base.widget.IconButtonWidget.UIState.DialogActionCancelled copy(@org.jetbrains.annotations.Nullable
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
            
            public DialogActionCancelled(@org.jetbrains.annotations.Nullable
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
         * Dialog checkbox interaction
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Ldji/v5/ux/core/base/widget/IconButtonWidget$UIState$DialogCheckboxCheckChanged;", "Ldji/v5/ux/core/base/widget/IconButtonWidget$UIState;", "info", "", "(Ljava/lang/Object;)V", "getInfo", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class DialogCheckboxCheckChanged extends dji.v5.ux.core.base.widget.IconButtonWidget.UIState {
            @org.jetbrains.annotations.Nullable
            private final java.lang.Object info = null;
            
            /**
             * Dialog checkbox interaction
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.base.widget.IconButtonWidget.UIState.DialogCheckboxCheckChanged copy(@org.jetbrains.annotations.Nullable
            java.lang.Object info) {
                return null;
            }
            
            /**
             * Dialog checkbox interaction
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Dialog checkbox interaction
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Dialog checkbox interaction
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public DialogCheckboxCheckChanged(@org.jetbrains.annotations.Nullable
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