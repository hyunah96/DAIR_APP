package dji.v5.ux.accessory;

import java.lang.System;

/**
 * This widget contains multiple widgets to control and get information related to RTK.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010$\u001a\u00020%H\u0016J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020\'H\u0016J\u0018\u0010(\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J\"\u0010*\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010+\u001a\u00020)H\u0014J\b\u0010,\u001a\u00020)H\u0014J\b\u0010-\u001a\u00020)H\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\f\u001a\u00020\r8G\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u00020\u00118G\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R&\u0010\u0015\u001a\u00020\b2\b\b\u0001\u0010\u0014\u001a\u00020\b8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001a\u001a\u00020\u001b8G\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!\u00a8\u0006/"}, d2 = {"Ldji/v5/ux/accessory/RTKWidget;", "Ldji/v5/ux/core/base/widget/ConstraintLayoutWidget;", "Ldji/v5/ux/accessory/RTKWidget$ModelState;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "rtkDialogSeparator", "Landroid/view/View;", "rtkEnabledWidget", "Ldji/v5/ux/accessory/RTKEnabledWidget;", "getRTKEnabledWidget", "()Ldji/v5/ux/accessory/RTKEnabledWidget;", "rtkSatelliteStatusWidget", "Ldji/v5/ux/accessory/RTKSatelliteStatusWidget;", "getRTKSatelliteStatusWidget", "()Ldji/v5/ux/accessory/RTKSatelliteStatusWidget;", "color", "rtkSeparatorsColor", "getRTKSeparatorsColor", "()I", "setRTKSeparatorsColor", "(I)V", "rtkTypeSwitchWidget", "Ldji/v5/ux/accessory/RTKTypeSwitchWidget;", "getRTKTypeSwitchWidget", "()Ldji/v5/ux/accessory/RTKTypeSwitchWidget;", "widgetModel", "Ldji/v5/ux/accessory/RTKWidgetModel;", "getWidgetModel", "()Ldji/v5/ux/accessory/RTKWidgetModel;", "widgetModel$delegate", "Lkotlin/Lazy;", "getIdealDimensionRatioString", "", "getWidgetStateUpdate", "Lio/reactivex/rxjava3/core/Flowable;", "initAttributes", "", "initView", "onAttachedToWindow", "onDetachedFromWindow", "reactToModelChanges", "ModelState", "android-sdk-v5-uxsdk_debug"})
public class RTKWidget extends dji.v5.ux.core.base.widget.ConstraintLayoutWidget<dji.v5.ux.accessory.RTKWidget.ModelState> {
    private final android.view.View rtkDialogSeparator = null;
    private final kotlin.Lazy widgetModel$delegate = null;
    
    /**
     * Get the RTK Enabled Widget so it can be customized.
     */
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.accessory.RTKEnabledWidget rtkEnabledWidget = null;
    
    /**
     * Get the RTK Satellite Status Widget so it can be customized.
     */
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.accessory.RTKSatelliteStatusWidget rtkSatelliteStatusWidget = null;
    
    /**
     * Get the RTK Type Switch Widget so it can be customized.
     */
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.accessory.RTKTypeSwitchWidget rtkTypeSwitchWidget = null;
    
    @kotlin.jvm.JvmOverloads
    public RTKWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public RTKWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public RTKWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    private final dji.v5.ux.accessory.RTKWidgetModel getWidgetModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmName(name = "getRTKEnabledWidget")
    public final dji.v5.ux.accessory.RTKEnabledWidget getRTKEnabledWidget() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmName(name = "getRTKSatelliteStatusWidget")
    public final dji.v5.ux.accessory.RTKSatelliteStatusWidget getRTKSatelliteStatusWidget() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmName(name = "getRTKTypeSwitchWidget")
    public final dji.v5.ux.accessory.RTKTypeSwitchWidget getRTKTypeSwitchWidget() {
        return null;
    }
    
    @androidx.annotation.ColorInt
    @kotlin.jvm.JvmName(name = "getRTKSeparatorsColor")
    public final int getRTKSeparatorsColor() {
        return 0;
    }
    
    @kotlin.jvm.JvmName(name = "setRTKSeparatorsColor")
    public final void setRTKSeparatorsColor(@androidx.annotation.ColorInt
    int color) {
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
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getIdealDimensionRatioString() {
        return null;
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
    public io.reactivex.rxjava3.core.Flowable<dji.v5.ux.accessory.RTKWidget.ModelState> getWidgetStateUpdate() {
        return null;
    }
    
    /**
     * Class defines the widget state updates
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Ldji/v5/ux/accessory/RTKWidget$ModelState;", "", "()V", "ProductConnected", "RTKEnabledUpdated", "Ldji/v5/ux/accessory/RTKWidget$ModelState$ProductConnected;", "Ldji/v5/ux/accessory/RTKWidget$ModelState$RTKEnabledUpdated;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class ModelState {
        
        private ModelState() {
            super();
        }
        
        /**
         * Product connection update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/accessory/RTKWidget$ModelState$ProductConnected;", "Ldji/v5/ux/accessory/RTKWidget$ModelState;", "isConnected", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductConnected extends dji.v5.ux.accessory.RTKWidget.ModelState {
            private final boolean isConnected = false;
            
            /**
             * Product connection update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.accessory.RTKWidget.ModelState.ProductConnected copy(boolean isConnected) {
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
         * RTK enabled update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/accessory/RTKWidget$ModelState$RTKEnabledUpdated;", "Ldji/v5/ux/accessory/RTKWidget$ModelState;", "isRTKEnabled", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class RTKEnabledUpdated extends dji.v5.ux.accessory.RTKWidget.ModelState {
            private final boolean isRTKEnabled = false;
            
            /**
             * RTK enabled update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.accessory.RTKWidget.ModelState.RTKEnabledUpdated copy(boolean isRTKEnabled) {
                return null;
            }
            
            /**
             * RTK enabled update
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * RTK enabled update
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * RTK enabled update
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public RTKEnabledUpdated(boolean isRTKEnabled) {
                super();
            }
            
            public final boolean component1() {
                return false;
            }
            
            public final boolean isRTKEnabled() {
                return false;
            }
        }
    }
}