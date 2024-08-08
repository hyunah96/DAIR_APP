package dji.v5.ux.core.widget.videosignal;

import java.lang.System;

/**
 * This widget shows the strength of the video signal between the
 * aircraft and the app through the RC.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 Z2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002Z[B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010@\u001a\u00020AH\u0002J\u0010\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\bH\u0002J\b\u0010E\u001a\u00020CH\u0016J\u000e\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00020GH\u0016J\u0018\u0010H\u001a\u00020A2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J\"\u0010I\u001a\u00020A2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010J\u001a\u00020AH\u0014J\b\u0010K\u001a\u00020AH\u0014J\b\u0010L\u001a\u00020AH\u0014J\b\u0010M\u001a\u00020NH\u0002J\u0010\u0010O\u001a\u00020A2\b\b\u0001\u0010P\u001a\u00020\bJ\u0010\u0010-\u001a\u00020A2\b\b\u0001\u0010Q\u001a\u00020\bJ\u0010\u00100\u001a\u00020A2\b\b\u0001\u0010Q\u001a\u00020\bJ\u0010\u00105\u001a\u00020A2\b\b\u0001\u0010Q\u001a\u00020\bJ\u0010\u00108\u001a\u00020A2\b\b\u0001\u0010Q\u001a\u00020\bJ\u0010\u0010R\u001a\u00020A2\u0006\u0010S\u001a\u00020TH\u0002J\u0012\u0010U\u001a\u00020A2\b\b\u0001\u0010V\u001a\u00020\bH\u0002J\u0010\u0010W\u001a\u00020A2\u0006\u0010X\u001a\u00020YH\u0002R(\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR&\u0010\u001c\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR(\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\n\u001a\u0004\u0018\u00010\u001f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R&\u0010%\u001a\u00020&2\b\b\u0001\u0010%\u001a\u00020&8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R(\u0010+\u001a\u0004\u0018\u00010\u00162\b\u0010\n\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010\u001bR(\u0010.\u001a\u0004\u0018\u00010\u00162\b\u0010\n\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b/\u0010\u0019\"\u0004\b0\u0010\u001bR\u000e\u00101\u001a\u000202X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u00103\u001a\u0004\u0018\u00010\u00162\b\u0010\n\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b4\u0010\u0019\"\u0004\b5\u0010\u001bR(\u00106\u001a\u0004\u0018\u00010\u00162\b\u0010\n\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b7\u0010\u0019\"\u0004\b8\u0010\u001bR\u000e\u00109\u001a\u000202X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010:\u001a\u00020;8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b<\u0010=\u00a8\u0006\\"}, d2 = {"Ldji/v5/ux/core/widget/videosignal/VideoSignalWidget;", "Ldji/v5/ux/core/base/widget/ConstraintLayoutWidget;", "Ldji/v5/ux/core/widget/videosignal/VideoSignalWidget$ModelState;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "connectedStateIconColor", "getConnectedStateIconColor", "()I", "setConnectedStateIconColor", "(I)V", "disconnectedStateIconColor", "getDisconnectedStateIconColor", "setDisconnectedStateIconColor", "frequencyBandTextView", "Landroid/widget/TextView;", "drawable", "Landroid/graphics/drawable/Drawable;", "textBackground", "getTextBackground", "()Landroid/graphics/drawable/Drawable;", "setTextBackground", "(Landroid/graphics/drawable/Drawable;)V", "textColor", "getTextColor", "setTextColor", "Landroid/content/res/ColorStateList;", "textColors", "getTextColors", "()Landroid/content/res/ColorStateList;", "setTextColors", "(Landroid/content/res/ColorStateList;)V", "textSize", "", "getTextSize", "()F", "setTextSize", "(F)V", "videoIcon", "getVideoIcon", "setVideoIcon", "videoIconBackground", "getVideoIconBackground", "setVideoIconBackground", "videoIconImageView", "Landroid/widget/ImageView;", "videoSignalIcon", "getVideoSignalIcon", "setVideoSignalIcon", "videoSignalIconBackground", "getVideoSignalIconBackground", "setVideoSignalIconBackground", "videoSignalImageView", "widgetModel", "Ldji/v5/ux/core/widget/videosignal/VideoSignalWidgetModel;", "getWidgetModel", "()Ldji/v5/ux/core/widget/videosignal/VideoSignalWidgetModel;", "widgetModel$delegate", "Lkotlin/Lazy;", "checkAndUpdateIconColor", "", "getAutoFrequencyBandStr", "", "ocuFrequencyPoint", "getIdealDimensionRatioString", "getWidgetStateUpdate", "Lio/reactivex/rxjava3/core/Flowable;", "initAttributes", "initView", "onAttachedToWindow", "onDetachedFromWindow", "reactToModelChanges", "reactToOcuSyncFrequencyStateChange", "Lio/reactivex/rxjava3/disposables/Disposable;", "setTextAppearance", "textAppearance", "resourceId", "updateIconColor", "isConnected", "", "updateVideoSignal", "videoSignalQuality", "updateWifiFrequencyBandText", "frequencyBandType", "Ldji/sdk/keyvalue/value/airlink/FrequencyBand;", "Companion", "ModelState", "android-sdk-v5-uxsdk_debug"})
public class VideoSignalWidget extends dji.v5.ux.core.base.widget.ConstraintLayoutWidget<dji.v5.ux.core.widget.videosignal.VideoSignalWidget.ModelState> {
    private final android.widget.ImageView videoIconImageView = null;
    private final android.widget.ImageView videoSignalImageView = null;
    private final android.widget.TextView frequencyBandTextView = null;
    private final kotlin.Lazy widgetModel$delegate = null;
    
    /**
     * The color of the video display icon when the product is connected
     */
    private int connectedStateIconColor;
    
    /**
     * The color of the video display icon when the product is disconnected
     */
    private int disconnectedStateIconColor;
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.core.widget.videosignal.VideoSignalWidget.Companion Companion = null;
    private static final java.lang.String TAG = "VideoSignalWidget";
    private static final java.lang.String FREQUENCY_BAND_2_DOT_4_GHZ = "2.4G";
    private static final java.lang.String FREQUENCY_BAND_5_GHZ = "5G";
    private static final java.lang.String FREQUENCY_BAND_5_DOT_7_GHZ = "5.7G";
    private static final java.lang.String FREQUENCY_BAND_5_DOT_8_GHZ = "5.8G";
    
    @kotlin.jvm.JvmOverloads
    public VideoSignalWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public VideoSignalWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public VideoSignalWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    private final dji.v5.ux.core.widget.videosignal.VideoSignalWidgetModel getWidgetModel() {
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
    public final android.graphics.drawable.Drawable getVideoIcon() {
        return null;
    }
    
    public final void setVideoIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getVideoIconBackground() {
        return null;
    }
    
    public final void setVideoIconBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getVideoSignalIcon() {
        return null;
    }
    
    public final void setVideoSignalIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getVideoSignalIconBackground() {
        return null;
    }
    
    public final void setVideoSignalIconBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.content.res.ColorStateList getTextColors() {
        return null;
    }
    
    public final void setTextColors(@org.jetbrains.annotations.Nullable
    android.content.res.ColorStateList value) {
    }
    
    @androidx.annotation.ColorInt
    public final int getTextColor() {
        return 0;
    }
    
    public final void setTextColor(@androidx.annotation.ColorInt
    int value) {
    }
    
    @androidx.annotation.Dimension
    public final float getTextSize() {
        return 0.0F;
    }
    
    public final void setTextSize(@androidx.annotation.Dimension
    float textSize) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getTextBackground() {
        return null;
    }
    
    public final void setTextBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable drawable) {
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
    
    private final void updateVideoSignal(@androidx.annotation.IntRange(from = 0L, to = 100L)
    int videoSignalQuality) {
    }
    
    private final void updateIconColor(boolean isConnected) {
    }
    
    private final void checkAndUpdateIconColor() {
    }
    
    private final void updateWifiFrequencyBandText(dji.sdk.keyvalue.value.airlink.FrequencyBand frequencyBandType) {
    }
    
    private final io.reactivex.rxjava3.disposables.Disposable reactToOcuSyncFrequencyStateChange() {
        return null;
    }
    
    private final java.lang.String getAutoFrequencyBandStr(int ocuFrequencyPoint) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getIdealDimensionRatioString() {
        return null;
    }
    
    /**
     * Set the resource ID for the video display icon
     *
     * @param resourceId Integer ID of the drawable resource
     */
    public final void setVideoIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the resource ID for the video display icon's background
     *
     * @param resourceId Integer ID of the background resource
     */
    public final void setVideoIconBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the resource ID for the video signal icon
     *
     * @param resourceId Integer ID of the drawable resource
     */
    public final void setVideoSignalIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the resource ID for the video signal icon's background
     *
     * @param resourceId Integer ID of the background resource
     */
    public final void setVideoSignalIconBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set text appearance of the frequency band text view
     *
     * @param textAppearance Style resource for text appearance
     */
    public final void setTextAppearance(@androidx.annotation.StyleRes
    int textAppearance) {
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
    public io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.widget.videosignal.VideoSignalWidget.ModelState> getWidgetStateUpdate() {
        return null;
    }
    
    /**
     * Class defines the widget state updates
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Ldji/v5/ux/core/widget/videosignal/VideoSignalWidget$ModelState;", "", "()V", "AirlinkFrequencyBandUpdated", "ProductConnected", "VideoSignalQualityUpdated", "Ldji/v5/ux/core/widget/videosignal/VideoSignalWidget$ModelState$AirlinkFrequencyBandUpdated;", "Ldji/v5/ux/core/widget/videosignal/VideoSignalWidget$ModelState$ProductConnected;", "Ldji/v5/ux/core/widget/videosignal/VideoSignalWidget$ModelState$VideoSignalQualityUpdated;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class ModelState {
        
        private ModelState() {
            super();
        }
        
        /**
         * Product connection update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/core/widget/videosignal/VideoSignalWidget$ModelState$ProductConnected;", "Ldji/v5/ux/core/widget/videosignal/VideoSignalWidget$ModelState;", "isConnected", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductConnected extends dji.v5.ux.core.widget.videosignal.VideoSignalWidget.ModelState {
            private final boolean isConnected = false;
            
            /**
             * Product connection update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.videosignal.VideoSignalWidget.ModelState.ProductConnected copy(boolean isConnected) {
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
         * Video signal quality / strength update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Ldji/v5/ux/core/widget/videosignal/VideoSignalWidget$ModelState$VideoSignalQualityUpdated;", "Ldji/v5/ux/core/widget/videosignal/VideoSignalWidget$ModelState;", "signalQuality", "", "(I)V", "getSignalQuality", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class VideoSignalQualityUpdated extends dji.v5.ux.core.widget.videosignal.VideoSignalWidget.ModelState {
            private final int signalQuality = 0;
            
            /**
             * Video signal quality / strength update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.videosignal.VideoSignalWidget.ModelState.VideoSignalQualityUpdated copy(int signalQuality) {
                return null;
            }
            
            /**
             * Video signal quality / strength update
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Video signal quality / strength update
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Video signal quality / strength update
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public VideoSignalQualityUpdated(int signalQuality) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            public final int getSignalQuality() {
                return 0;
            }
        }
        
        /**
         * WiFi frequency band update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/core/widget/videosignal/VideoSignalWidget$ModelState$AirlinkFrequencyBandUpdated;", "Ldji/v5/ux/core/widget/videosignal/VideoSignalWidget$ModelState;", "frequencyBandType", "Ldji/sdk/keyvalue/value/airlink/FrequencyBand;", "(Ldji/sdk/keyvalue/value/airlink/FrequencyBand;)V", "getFrequencyBandType", "()Ldji/sdk/keyvalue/value/airlink/FrequencyBand;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class AirlinkFrequencyBandUpdated extends dji.v5.ux.core.widget.videosignal.VideoSignalWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            private final dji.sdk.keyvalue.value.airlink.FrequencyBand frequencyBandType = null;
            
            /**
             * WiFi frequency band update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.videosignal.VideoSignalWidget.ModelState.AirlinkFrequencyBandUpdated copy(@org.jetbrains.annotations.NotNull
            dji.sdk.keyvalue.value.airlink.FrequencyBand frequencyBandType) {
                return null;
            }
            
            /**
             * WiFi frequency band update
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * WiFi frequency band update
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * WiFi frequency band update
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public AirlinkFrequencyBandUpdated(@org.jetbrains.annotations.NotNull
            dji.sdk.keyvalue.value.airlink.FrequencyBand frequencyBandType) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.sdk.keyvalue.value.airlink.FrequencyBand component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.sdk.keyvalue.value.airlink.FrequencyBand getFrequencyBandType() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Ldji/v5/ux/core/widget/videosignal/VideoSignalWidget$Companion;", "", "()V", "FREQUENCY_BAND_2_DOT_4_GHZ", "", "FREQUENCY_BAND_5_DOT_7_GHZ", "FREQUENCY_BAND_5_DOT_8_GHZ", "FREQUENCY_BAND_5_GHZ", "TAG", "android-sdk-v5-uxsdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}