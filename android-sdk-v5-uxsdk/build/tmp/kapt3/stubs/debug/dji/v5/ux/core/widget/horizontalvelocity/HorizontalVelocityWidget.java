package dji.v5.ux.core.widget.horizontalvelocity;

import java.lang.System;

/**
 * Widget displays the horizontal velocity of the aircraft.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nJ\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0014J\b\u0010!\u001a\u00020 H\u0014J\b\u0010\"\u001a\u00020 H\u0014J\u0010\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%H\u0002R\u0014\u0010\u000b\u001a\u00020\fX\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\fX\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006\'"}, d2 = {"Ldji/v5/ux/core/widget/horizontalvelocity/HorizontalVelocityWidget;", "Ldji/v5/ux/core/base/widget/BaseTelemetryWidget;", "Ldji/v5/ux/core/widget/horizontalvelocity/HorizontalVelocityWidget$ModelState;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "widgetTheme", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "imperialDecimalFormat", "Ljava/text/DecimalFormat;", "getImperialDecimalFormat", "()Ljava/text/DecimalFormat;", "metricDecimalFormat", "getMetricDecimalFormat", "widgetModel", "Ldji/v5/ux/core/widget/horizontalvelocity/HorizontalVelocityWidgetModel;", "getWidgetModel", "()Ldji/v5/ux/core/widget/horizontalvelocity/HorizontalVelocityWidgetModel;", "widgetModel$delegate", "Lkotlin/Lazy;", "widgetSizeDescription", "Ldji/v5/ux/core/base/WidgetSizeDescription;", "getWidgetSizeDescription", "()Ldji/v5/ux/core/base/WidgetSizeDescription;", "getIdealDimensionRatioString", "", "getWidgetStateUpdate", "Lio/reactivex/rxjava3/core/Flowable;", "onAttachedToWindow", "", "onDetachedFromWindow", "reactToModelChanges", "updateUI", "horizontalVelocityState", "Ldji/v5/ux/core/widget/horizontalvelocity/HorizontalVelocityWidgetModel$HorizontalVelocityState;", "ModelState", "android-sdk-v5-uxsdk_debug"})
public class HorizontalVelocityWidget extends dji.v5.ux.core.base.widget.BaseTelemetryWidget<dji.v5.ux.core.widget.horizontalvelocity.HorizontalVelocityWidget.ModelState> {
    @org.jetbrains.annotations.NotNull
    private final java.text.DecimalFormat metricDecimalFormat = null;
    @org.jetbrains.annotations.NotNull
    private final java.text.DecimalFormat imperialDecimalFormat = null;
    private final kotlin.Lazy widgetModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.base.WidgetSizeDescription widgetSizeDescription = null;
    
    @kotlin.jvm.JvmOverloads
    public HorizontalVelocityWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0, null, 0, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public HorizontalVelocityWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0, null, 0, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public HorizontalVelocityWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0, null, 0, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public HorizontalVelocityWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr, int widgetTheme) {
        super(null, null, 0, null, 0, 0);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected java.text.DecimalFormat getMetricDecimalFormat() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected java.text.DecimalFormat getImperialDecimalFormat() {
        return null;
    }
    
    private final dji.v5.ux.core.widget.horizontalvelocity.HorizontalVelocityWidgetModel getWidgetModel() {
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
    
    private final void updateUI(dji.v5.ux.core.widget.horizontalvelocity.HorizontalVelocityWidgetModel.HorizontalVelocityState horizontalVelocityState) {
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
    public io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.widget.horizontalvelocity.HorizontalVelocityWidget.ModelState> getWidgetStateUpdate() {
        return null;
    }
    
    /**
     * Class defines widget state updates
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Ldji/v5/ux/core/widget/horizontalvelocity/HorizontalVelocityWidget$ModelState;", "", "()V", "HorizontalVelocityStateUpdated", "ProductConnected", "Ldji/v5/ux/core/widget/horizontalvelocity/HorizontalVelocityWidget$ModelState$HorizontalVelocityStateUpdated;", "Ldji/v5/ux/core/widget/horizontalvelocity/HorizontalVelocityWidget$ModelState$ProductConnected;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class ModelState {
        
        private ModelState() {
            super();
        }
        
        /**
         * Product connection update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Ldji/v5/ux/core/widget/horizontalvelocity/HorizontalVelocityWidget$ModelState$ProductConnected;", "Ldji/v5/ux/core/widget/horizontalvelocity/HorizontalVelocityWidget$ModelState;", "boolean", "", "(Z)V", "getBoolean", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductConnected extends dji.v5.ux.core.widget.horizontalvelocity.HorizontalVelocityWidget.ModelState {
            
            /**
             * Product connection update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.horizontalvelocity.HorizontalVelocityWidget.ModelState.ProductConnected copy(boolean p0_32355860) {
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
            
            public ProductConnected(boolean p0_32355860) {
                super();
            }
            
            public final boolean component1() {
                return false;
            }
            
            public final boolean getBoolean() {
                return false;
            }
        }
        
        /**
         * Horizontal velocity state update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/core/widget/horizontalvelocity/HorizontalVelocityWidget$ModelState$HorizontalVelocityStateUpdated;", "Ldji/v5/ux/core/widget/horizontalvelocity/HorizontalVelocityWidget$ModelState;", "horizontalVelocityState", "Ldji/v5/ux/core/widget/horizontalvelocity/HorizontalVelocityWidgetModel$HorizontalVelocityState;", "(Ldji/v5/ux/core/widget/horizontalvelocity/HorizontalVelocityWidgetModel$HorizontalVelocityState;)V", "getHorizontalVelocityState", "()Ldji/v5/ux/core/widget/horizontalvelocity/HorizontalVelocityWidgetModel$HorizontalVelocityState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class HorizontalVelocityStateUpdated extends dji.v5.ux.core.widget.horizontalvelocity.HorizontalVelocityWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.widget.horizontalvelocity.HorizontalVelocityWidgetModel.HorizontalVelocityState horizontalVelocityState = null;
            
            /**
             * Horizontal velocity state update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.horizontalvelocity.HorizontalVelocityWidget.ModelState.HorizontalVelocityStateUpdated copy(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.widget.horizontalvelocity.HorizontalVelocityWidgetModel.HorizontalVelocityState horizontalVelocityState) {
                return null;
            }
            
            /**
             * Horizontal velocity state update
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Horizontal velocity state update
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Horizontal velocity state update
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public HorizontalVelocityStateUpdated(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.widget.horizontalvelocity.HorizontalVelocityWidgetModel.HorizontalVelocityState horizontalVelocityState) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.horizontalvelocity.HorizontalVelocityWidgetModel.HorizontalVelocityState component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.horizontalvelocity.HorizontalVelocityWidgetModel.HorizontalVelocityState getHorizontalVelocityState() {
                return null;
            }
        }
    }
}