package dji.v5.ux.core.widget.simulator;

import java.lang.System;

/**
 * Simulator Indicator Widget will display the current state of the simulator
 *
 * Simulator Indicator Widget has two states
 * Active - Green icon indicates currently simulator is running on the device
 * Inactive - White icon indicates simulator is currently turned off on the device
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002./B%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0014J\b\u0010\u001f\u001a\u00020 H\u0016J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\"H\u0016J\u0018\u0010#\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0003J\b\u0010$\u001a\u00020\u001dH\u0014J\b\u0010%\u001a\u00020\u001dH\u0014J\b\u0010&\u001a\u00020\u001dH\u0014J\b\u0010\'\u001a\u00020(H\u0002J\u0010\u0010\u0010\u001a\u00020\u001d2\b\b\u0001\u0010)\u001a\u00020\tJ\u0010\u0010\u0014\u001a\u00020\u001d2\b\b\u0001\u0010)\u001a\u00020\tJ\u0018\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,H\u0002R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u000e\u0010\u0015\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019\u00a8\u00060"}, d2 = {"Ldji/v5/ux/core/widget/simulator/SimulatorIndicatorWidget;", "Ldji/v5/ux/core/base/widget/IconButtonWidget;", "Ldji/v5/ux/core/widget/simulator/SimulatorIndicatorWidget$ModelState;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "Landroid/graphics/drawable/Drawable;", "simulatorActiveIcon", "getSimulatorActiveIcon", "()Landroid/graphics/drawable/Drawable;", "setSimulatorActiveIcon", "(Landroid/graphics/drawable/Drawable;)V", "simulatorInactiveIcon", "getSimulatorInactiveIcon", "setSimulatorInactiveIcon", "stateChangeResourceId", "widgetModel", "Ldji/v5/ux/core/widget/simulator/SimulatorIndicatorWidgetModel;", "getWidgetModel", "()Ldji/v5/ux/core/widget/simulator/SimulatorIndicatorWidgetModel;", "widgetModel$delegate", "Lkotlin/Lazy;", "checkAndUpdateIcon", "", "checkAndUpdateIconColor", "getIdealDimensionRatioString", "", "getWidgetStateUpdate", "Lio/reactivex/rxjava3/core/Flowable;", "initAttributes", "onAttachedToWindow", "onDetachedFromWindow", "reactToModelChanges", "reactToSimulatorStateChange", "Lio/reactivex/rxjava3/disposables/Disposable;", "resourceId", "updateUI", "isConnected", "", "isActive", "Companion", "ModelState", "android-sdk-v5-uxsdk_debug"})
public class SimulatorIndicatorWidget extends dji.v5.ux.core.base.widget.IconButtonWidget<dji.v5.ux.core.widget.simulator.SimulatorIndicatorWidget.ModelState> implements android.view.View.OnClickListener {
    private int stateChangeResourceId = -1;
    private final kotlin.Lazy widgetModel$delegate = null;
    
    /**
     * The drawable resource for the simulator active icon
     */
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable simulatorActiveIcon;
    
    /**
     * The drawable resource for the simulator inactive icon
     */
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable simulatorInactiveIcon;
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.core.widget.simulator.SimulatorIndicatorWidget.Companion Companion = null;
    private static final java.lang.String TAG = "SimulatorIndWidget";
    
    @kotlin.jvm.JvmOverloads
    public SimulatorIndicatorWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public SimulatorIndicatorWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public SimulatorIndicatorWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    private final dji.v5.ux.core.widget.simulator.SimulatorIndicatorWidgetModel getWidgetModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getSimulatorActiveIcon() {
        return null;
    }
    
    public final void setSimulatorActiveIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getSimulatorInactiveIcon() {
        return null;
    }
    
    public final void setSimulatorInactiveIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @java.lang.Override
    protected void reactToModelChanges() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getIdealDimensionRatioString() {
        return null;
    }
    
    @java.lang.Override
    protected void onAttachedToWindow() {
    }
    
    @java.lang.Override
    protected void onDetachedFromWindow() {
    }
    
    @java.lang.Override
    protected void checkAndUpdateIconColor() {
    }
    
    private final io.reactivex.rxjava3.disposables.Disposable reactToSimulatorStateChange() {
        return null;
    }
    
    private final void updateUI(boolean isConnected, boolean isActive) {
    }
    
    private final void checkAndUpdateIcon() {
    }
    
    @android.annotation.SuppressLint(value = {"Recycle"})
    private final void initAttributes(android.content.Context context, android.util.AttributeSet attrs) {
    }
    
    /**
     * Set the resource ID for the simulator active icon
     *
     * @param resourceId Integer ID of the drawable resource
     */
    public final void setSimulatorActiveIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the resource ID for the simulator inactive icon
     *
     * @param resourceId Integer ID of the drawable resource
     */
    public final void setSimulatorInactiveIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Get the [ModelState] updates
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.SuppressWarnings(value = {})
    @java.lang.Override
    public io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.widget.simulator.SimulatorIndicatorWidget.ModelState> getWidgetStateUpdate() {
        return null;
    }
    
    /**
     * Class defines the widget state updates
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Ldji/v5/ux/core/widget/simulator/SimulatorIndicatorWidget$ModelState;", "", "()V", "ProductConnected", "SimulatorStateUpdated", "Ldji/v5/ux/core/widget/simulator/SimulatorIndicatorWidget$ModelState$ProductConnected;", "Ldji/v5/ux/core/widget/simulator/SimulatorIndicatorWidget$ModelState$SimulatorStateUpdated;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class ModelState {
        
        private ModelState() {
            super();
        }
        
        /**
         * Product connection update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/core/widget/simulator/SimulatorIndicatorWidget$ModelState$ProductConnected;", "Ldji/v5/ux/core/widget/simulator/SimulatorIndicatorWidget$ModelState;", "isConnected", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductConnected extends dji.v5.ux.core.widget.simulator.SimulatorIndicatorWidget.ModelState {
            private final boolean isConnected = false;
            
            /**
             * Product connection update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.simulator.SimulatorIndicatorWidget.ModelState.ProductConnected copy(boolean isConnected) {
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
         * Simulator State update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/core/widget/simulator/SimulatorIndicatorWidget$ModelState$SimulatorStateUpdated;", "Ldji/v5/ux/core/widget/simulator/SimulatorIndicatorWidget$ModelState;", "isActive", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class SimulatorStateUpdated extends dji.v5.ux.core.widget.simulator.SimulatorIndicatorWidget.ModelState {
            private final boolean isActive = false;
            
            /**
             * Simulator State update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.simulator.SimulatorIndicatorWidget.ModelState.SimulatorStateUpdated copy(boolean isActive) {
                return null;
            }
            
            /**
             * Simulator State update
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Simulator State update
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Simulator State update
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public SimulatorStateUpdated(boolean isActive) {
                super();
            }
            
            public final boolean component1() {
                return false;
            }
            
            public final boolean isActive() {
                return false;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Ldji/v5/ux/core/widget/simulator/SimulatorIndicatorWidget$Companion;", "", "()V", "TAG", "", "android-sdk-v5-uxsdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}