package dji.v5.ux.core.widget.flightmode;

import java.lang.System;

/**
 * Shows the current flight mode next to a flight mode icon.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001LB%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u00109\u001a\u00020:H\u0002J\n\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u000e\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020>H\u0016J\u0018\u0010?\u001a\u00020:2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J\"\u0010@\u001a\u00020:2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010A\u001a\u00020:H\u0014J\b\u0010B\u001a\u00020:H\u0014J\b\u0010C\u001a\u00020:H\u0014J\u0018\u0010\u001f\u001a\u00020:2\b\u0010D\u001a\u0004\u0018\u00010\u001b2\u0006\u0010E\u001a\u00020<J\u0010\u0010\u001f\u001a\u00020:2\b\b\u0001\u0010F\u001a\u00020\bJ\u0018\u0010\u001f\u001a\u00020:2\b\b\u0001\u0010F\u001a\u00020\b2\u0006\u0010E\u001a\u00020<J\u0010\u0010#\u001a\u00020:2\b\b\u0001\u0010F\u001a\u00020\bJ\u0010\u0010G\u001a\u00020:2\b\b\u0001\u0010H\u001a\u00020\bJ\u0010\u0010(\u001a\u00020:2\b\b\u0001\u0010F\u001a\u00020\bJ\u0010\u0010I\u001a\u00020:2\u0006\u0010J\u001a\u00020KH\u0002R(\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR(\u0010\u0013\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR(\u0010\u0016\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\n\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010!\u001a\u0004\u0018\u00010\u001b2\b\u0010\n\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\u000e\u0010$\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010&\u001a\u0004\u0018\u00010\u001b2\b\u0010\n\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\'\u0010\u001e\"\u0004\b(\u0010 R&\u0010)\u001a\u00020*2\b\b\u0001\u0010)\u001a\u00020*8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001b\u0010/\u001a\u0002008BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b3\u00104\u001a\u0004\b1\u00102R\u0014\u00105\u001a\u000206X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108\u00a8\u0006M"}, d2 = {"Ldji/v5/ux/core/widget/flightmode/FlightModeWidget;", "Ldji/v5/ux/core/base/widget/ConstraintLayoutWidget;", "Ldji/v5/ux/core/widget/flightmode/FlightModeWidget$ModelState;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "connectedStateIconColor", "getConnectedStateIconColor", "()I", "setConnectedStateIconColor", "(I)V", "connectedStateTextColor", "getConnectedStateTextColor", "setConnectedStateTextColor", "disconnectedStateIconColor", "getDisconnectedStateIconColor", "setDisconnectedStateIconColor", "disconnectedStateTextColor", "getDisconnectedStateTextColor", "setDisconnectedStateTextColor", "flightModeTextView", "Landroid/widget/TextView;", "Landroid/graphics/drawable/Drawable;", "icon", "getIcon", "()Landroid/graphics/drawable/Drawable;", "setIcon", "(Landroid/graphics/drawable/Drawable;)V", "iconBackground", "getIconBackground", "setIconBackground", "iconImageView", "Landroid/widget/ImageView;", "textBackground", "getTextBackground", "setTextBackground", "textSize", "", "getTextSize", "()F", "setTextSize", "(F)V", "widgetModel", "Ldji/v5/ux/core/widget/flightmode/FlightModeWidgetModel;", "getWidgetModel", "()Ldji/v5/ux/core/widget/flightmode/FlightModeWidgetModel;", "widgetModel$delegate", "Lkotlin/Lazy;", "widgetSizeDescription", "Ldji/v5/ux/core/base/WidgetSizeDescription;", "getWidgetSizeDescription", "()Ldji/v5/ux/core/base/WidgetSizeDescription;", "checkAndUpdateUI", "", "getIdealDimensionRatioString", "", "getWidgetStateUpdate", "Lio/reactivex/rxjava3/core/Flowable;", "initAttributes", "initView", "onAttachedToWindow", "onDetachedFromWindow", "reactToModelChanges", "drawable", "dimensionRatio", "resourceId", "setTextAppearance", "textAppearanceResId", "updateUI", "flightModeState", "Ldji/v5/ux/core/widget/flightmode/FlightModeWidgetModel$FlightModeState;", "ModelState", "android-sdk-v5-uxsdk_debug"})
public class FlightModeWidget extends dji.v5.ux.core.base.widget.ConstraintLayoutWidget<dji.v5.ux.core.widget.flightmode.FlightModeWidget.ModelState> {
    private final android.widget.ImageView iconImageView = null;
    private final android.widget.TextView flightModeTextView = null;
    private final kotlin.Lazy widgetModel$delegate = null;
    
    /**
     * The color of the icon when the product is connected
     */
    private int connectedStateIconColor;
    
    /**
     * The color of the icon when the product is disconnected
     */
    private int disconnectedStateIconColor;
    
    /**
     * The color of the text when the product is connected
     */
    private int connectedStateTextColor;
    
    /**
     * The color of the text when the product is disconnected
     */
    private int disconnectedStateTextColor;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.base.WidgetSizeDescription widgetSizeDescription = null;
    
    @kotlin.jvm.JvmOverloads
    public FlightModeWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public FlightModeWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public FlightModeWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    private final dji.v5.ux.core.widget.flightmode.FlightModeWidgetModel getWidgetModel() {
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
    
    @androidx.annotation.ColorInt
    public final int getConnectedStateTextColor() {
        return 0;
    }
    
    public final void setConnectedStateTextColor(@androidx.annotation.ColorInt
    int value) {
    }
    
    @androidx.annotation.ColorInt
    public final int getDisconnectedStateTextColor() {
        return 0;
    }
    
    public final void setDisconnectedStateTextColor(@androidx.annotation.ColorInt
    int value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getTextBackground() {
        return null;
    }
    
    public final void setTextBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @androidx.annotation.Dimension
    public final float getTextSize() {
        return 0.0F;
    }
    
    public final void setTextSize(@androidx.annotation.Dimension
    float textSize) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getIcon() {
        return null;
    }
    
    public final void setIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getIconBackground() {
        return null;
    }
    
    public final void setIconBackground(@org.jetbrains.annotations.Nullable
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
    
    private final void updateUI(dji.v5.ux.core.widget.flightmode.FlightModeWidgetModel.FlightModeState flightModeState) {
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
     * Set text appearance of the flight mode text view
     *
     * @param textAppearanceResId Style resource for text appearance
     */
    public final void setTextAppearance(@androidx.annotation.StyleRes
    int textAppearanceResId) {
    }
    
    /**
     * Set the resource ID for the background of the flight mode text view
     *
     * @param resourceId Integer ID of the drawable resource for the background
     */
    public final void setTextBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the resource ID for the flight mode icon. If the ratio of the image is not the default
     * 1:1, use the [setIcon] method that takes a String ratio as well.
     *
     * @param resourceId Integer ID of the drawable resource
     */
    public final void setIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the flight mode icon with a custom ratio.
     *
     * @param drawable The drawable resource
     * @param dimensionRatio String indicating the ratio of the custom icon
     */
    public final void setIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable drawable, @org.jetbrains.annotations.NotNull
    java.lang.String dimensionRatio) {
    }
    
    /**
     * Set the resource ID for the flight mode icon with a custom ratio.
     *
     * @param resourceId Integer ID of the drawable resource
     * @param dimensionRatio String indicating the ratio of the custom icon
     */
    public final void setIcon(@androidx.annotation.DrawableRes
    int resourceId, @org.jetbrains.annotations.NotNull
    java.lang.String dimensionRatio) {
    }
    
    /**
     * Set the resource ID for the flight mode icon's background
     *
     * @param resourceId Integer ID of the background resource
     */
    public final void setIconBackground(@androidx.annotation.DrawableRes
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
    public io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.widget.flightmode.FlightModeWidget.ModelState> getWidgetStateUpdate() {
        return null;
    }
    
    /**
     * Class defines the widget state updates
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Ldji/v5/ux/core/widget/flightmode/FlightModeWidget$ModelState;", "", "()V", "FlightModeUpdated", "ProductConnected", "Ldji/v5/ux/core/widget/flightmode/FlightModeWidget$ModelState$FlightModeUpdated;", "Ldji/v5/ux/core/widget/flightmode/FlightModeWidget$ModelState$ProductConnected;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class ModelState {
        
        private ModelState() {
            super();
        }
        
        /**
         * Product connection update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/core/widget/flightmode/FlightModeWidget$ModelState$ProductConnected;", "Ldji/v5/ux/core/widget/flightmode/FlightModeWidget$ModelState;", "isConnected", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductConnected extends dji.v5.ux.core.widget.flightmode.FlightModeWidget.ModelState {
            private final boolean isConnected = false;
            
            /**
             * Product connection update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.flightmode.FlightModeWidget.ModelState.ProductConnected copy(boolean isConnected) {
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
         * Flight mode text update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Ldji/v5/ux/core/widget/flightmode/FlightModeWidget$ModelState$FlightModeUpdated;", "Ldji/v5/ux/core/widget/flightmode/FlightModeWidget$ModelState;", "flightModeText", "", "(Ljava/lang/String;)V", "getFlightModeText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "android-sdk-v5-uxsdk_debug"})
        public static final class FlightModeUpdated extends dji.v5.ux.core.widget.flightmode.FlightModeWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String flightModeText = null;
            
            /**
             * Flight mode text update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.flightmode.FlightModeWidget.ModelState.FlightModeUpdated copy(@org.jetbrains.annotations.NotNull
            java.lang.String flightModeText) {
                return null;
            }
            
            /**
             * Flight mode text update
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Flight mode text update
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Flight mode text update
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public FlightModeUpdated(@org.jetbrains.annotations.NotNull
            java.lang.String flightModeText) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getFlightModeText() {
                return null;
            }
        }
    }
}