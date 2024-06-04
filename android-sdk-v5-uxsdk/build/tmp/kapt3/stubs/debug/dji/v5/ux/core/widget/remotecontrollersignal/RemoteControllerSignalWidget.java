package dji.v5.ux.core.widget.remotecontrollersignal;

import java.lang.System;

/**
 * This widget shows the strength of the signal between the RC and the aircraft.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0016\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002<=B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020.H\u0016J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000200H\u0016J\u0018\u00101\u001a\u00020,2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J\"\u00102\u001a\u00020,2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J\b\u00103\u001a\u00020,H\u0014J\b\u00104\u001a\u00020,H\u0014J\b\u00105\u001a\u00020,H\u0014J\u0010\u0010\u0017\u001a\u00020,2\b\b\u0001\u00106\u001a\u00020\bJ\u0010\u0010\u001b\u001a\u00020,2\b\b\u0001\u00106\u001a\u00020\bJ\u0010\u0010 \u001a\u00020,2\b\b\u0001\u00106\u001a\u00020\bJ\u0010\u0010#\u001a\u00020,2\b\b\u0001\u00106\u001a\u00020\bJ\u0010\u00107\u001a\u00020,2\u0006\u00108\u001a\u000209H\u0002J\u0012\u0010:\u001a\u00020,2\b\b\u0001\u0010;\u001a\u00020\bH\u0002R(\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR(\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\n\u001a\u0004\u0018\u00010\u00138G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u0019\u001a\u0004\u0018\u00010\u00132\b\u0010\n\u001a\u0004\u0018\u00010\u00138G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u001e\u001a\u0004\u0018\u00010\u00132\b\u0010\n\u001a\u0004\u0018\u00010\u00138G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R(\u0010!\u001a\u0004\u0018\u00010\u00132\b\u0010\n\u001a\u0004\u0018\u00010\u00138G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\"\u0010\u0016\"\u0004\b#\u0010\u0018R\u000e\u0010$\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\'\u0010(\u00a8\u0006>"}, d2 = {"Ldji/v5/ux/core/widget/remotecontrollersignal/RemoteControllerSignalWidget;", "Ldji/v5/ux/core/base/widget/ConstraintLayoutWidget;", "Ldji/v5/ux/core/widget/remotecontrollersignal/RemoteControllerSignalWidget$ModelState;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "connectedStateIconColor", "getConnectedStateIconColor", "()I", "setConnectedStateIconColor", "(I)V", "disconnectedStateIconColor", "getDisconnectedStateIconColor", "setDisconnectedStateIconColor", "Landroid/graphics/drawable/Drawable;", "rcIcon", "getRCIcon", "()Landroid/graphics/drawable/Drawable;", "setRCIcon", "(Landroid/graphics/drawable/Drawable;)V", "rcIconBackground", "getRCIconBackground", "setRCIconBackground", "rcIconImageView", "Landroid/widget/ImageView;", "rcSignalIcon", "getRCSignalIcon", "setRCSignalIcon", "rcSignalIconBackground", "getRCSignalIconBackground", "setRCSignalIconBackground", "rcSignalImageView", "widgetModel", "Ldji/v5/ux/core/widget/remotecontrollersignal/RemoteControllerSignalWidgetModel;", "getWidgetModel", "()Ldji/v5/ux/core/widget/remotecontrollersignal/RemoteControllerSignalWidgetModel;", "widgetModel$delegate", "Lkotlin/Lazy;", "checkAndUpdateIconColor", "", "getIdealDimensionRatioString", "", "getWidgetStateUpdate", "Lio/reactivex/rxjava3/core/Flowable;", "initAttributes", "initView", "onAttachedToWindow", "onDetachedFromWindow", "reactToModelChanges", "resourceId", "updateIconColor", "isConnected", "", "updateRCSignal", "rcSignalQuality", "Companion", "ModelState", "android-sdk-v5-uxsdk_debug"})
public class RemoteControllerSignalWidget extends dji.v5.ux.core.base.widget.ConstraintLayoutWidget<dji.v5.ux.core.widget.remotecontrollersignal.RemoteControllerSignalWidget.ModelState> {
    private final android.widget.ImageView rcIconImageView = null;
    private final android.widget.ImageView rcSignalImageView = null;
    private final kotlin.Lazy widgetModel$delegate = null;
    
    /**
     * The color of the RC icon when the product is connected
     */
    private int connectedStateIconColor;
    
    /**
     * The color of the RC icon when the product is disconnected
     */
    private int disconnectedStateIconColor;
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.core.widget.remotecontrollersignal.RemoteControllerSignalWidget.Companion Companion = null;
    private static final java.lang.String TAG = "RCSignalWidget";
    
    @kotlin.jvm.JvmOverloads
    public RemoteControllerSignalWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public RemoteControllerSignalWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public RemoteControllerSignalWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    private final dji.v5.ux.core.widget.remotecontrollersignal.RemoteControllerSignalWidgetModel getWidgetModel() {
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
    @kotlin.jvm.JvmName(name = "getRCIcon")
    public final android.graphics.drawable.Drawable getRCIcon() {
        return null;
    }
    
    @kotlin.jvm.JvmName(name = "setRCIcon")
    public final void setRCIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @org.jetbrains.annotations.Nullable
    @kotlin.jvm.JvmName(name = "getRCIconBackground")
    public final android.graphics.drawable.Drawable getRCIconBackground() {
        return null;
    }
    
    @kotlin.jvm.JvmName(name = "setRCIconBackground")
    public final void setRCIconBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @org.jetbrains.annotations.Nullable
    @kotlin.jvm.JvmName(name = "getRCSignalIcon")
    public final android.graphics.drawable.Drawable getRCSignalIcon() {
        return null;
    }
    
    @kotlin.jvm.JvmName(name = "setRCSignalIcon")
    public final void setRCSignalIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @org.jetbrains.annotations.Nullable
    @kotlin.jvm.JvmName(name = "getRCSignalIconBackground")
    public final android.graphics.drawable.Drawable getRCSignalIconBackground() {
        return null;
    }
    
    @kotlin.jvm.JvmName(name = "setRCSignalIconBackground")
    public final void setRCSignalIconBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
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
    
    private final void updateRCSignal(@androidx.annotation.IntRange(from = 0L, to = 100L)
    int rcSignalQuality) {
    }
    
    private final void updateIconColor(boolean isConnected) {
    }
    
    private final void checkAndUpdateIconColor() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getIdealDimensionRatioString() {
        return null;
    }
    
    /**
     * Set the [resourceId] for the RC icon
     *
     * @param resourceId Integer ID of the drawable resource
     */
    public final void setRCIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the [resourceId] for the RC icon's background
     *
     * @param resourceId Integer ID of the background resource
     */
    public final void setRCIconBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the [resourceId] for the RC signal icon
     *
     * @param resourceId Integer ID of the drawable resource
     */
    public final void setRCSignalIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the [resourceId] for the RC signal icon's background
     *
     * @param resourceId Integer ID of the background resource
     */
    public final void setRCSignalIconBackground(@androidx.annotation.DrawableRes
    int resourceId) {
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
    public io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.widget.remotecontrollersignal.RemoteControllerSignalWidget.ModelState> getWidgetStateUpdate() {
        return null;
    }
    
    /**
     * Class defines the widget state updates
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Ldji/v5/ux/core/widget/remotecontrollersignal/RemoteControllerSignalWidget$ModelState;", "", "()V", "ProductConnected", "SignalQualityUpdated", "Ldji/v5/ux/core/widget/remotecontrollersignal/RemoteControllerSignalWidget$ModelState$ProductConnected;", "Ldji/v5/ux/core/widget/remotecontrollersignal/RemoteControllerSignalWidget$ModelState$SignalQualityUpdated;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class ModelState {
        
        private ModelState() {
            super();
        }
        
        /**
         * Product connection update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/core/widget/remotecontrollersignal/RemoteControllerSignalWidget$ModelState$ProductConnected;", "Ldji/v5/ux/core/widget/remotecontrollersignal/RemoteControllerSignalWidget$ModelState;", "isConnected", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductConnected extends dji.v5.ux.core.widget.remotecontrollersignal.RemoteControllerSignalWidget.ModelState {
            private final boolean isConnected = false;
            
            /**
             * Product connection update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.remotecontrollersignal.RemoteControllerSignalWidget.ModelState.ProductConnected copy(boolean isConnected) {
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
         * Signal quality update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Ldji/v5/ux/core/widget/remotecontrollersignal/RemoteControllerSignalWidget$ModelState$SignalQualityUpdated;", "Ldji/v5/ux/core/widget/remotecontrollersignal/RemoteControllerSignalWidget$ModelState;", "signalValue", "", "(I)V", "getSignalValue", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class SignalQualityUpdated extends dji.v5.ux.core.widget.remotecontrollersignal.RemoteControllerSignalWidget.ModelState {
            private final int signalValue = 0;
            
            /**
             * Signal quality update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.remotecontrollersignal.RemoteControllerSignalWidget.ModelState.SignalQualityUpdated copy(int signalValue) {
                return null;
            }
            
            /**
             * Signal quality update
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Signal quality update
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Signal quality update
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public SignalQualityUpdated(int signalValue) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            public final int getSignalValue() {
                return 0;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Ldji/v5/ux/core/widget/remotecontrollersignal/RemoteControllerSignalWidget$Companion;", "", "()V", "TAG", "", "android-sdk-v5-uxsdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}