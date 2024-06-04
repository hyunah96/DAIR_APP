package dji.v5.ux.accessory;

import java.lang.System;

/**
 * This widget displays a switch that will enable or disable RTK.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002]^B%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010B\u001a\u00020CH\u0016J\f\u0010D\u001a\b\u0012\u0004\u0012\u00020;0EJ\u000e\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00020EH\u0016J\u0018\u0010G\u001a\u00020H2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0003J\"\u0010I\u001a\u00020H2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0014J\b\u0010J\u001a\u00020HH\u0014J\u001a\u0010K\u001a\u00020H2\b\u0010L\u001a\u0004\u0018\u00010M2\u0006\u0010N\u001a\u00020OH\u0016J\b\u0010P\u001a\u00020HH\u0014J\b\u0010Q\u001a\u00020HH\u0014J\u0010\u0010R\u001a\u00020H2\b\b\u0001\u0010S\u001a\u00020\tJ\u0010\u0010T\u001a\u00020H2\u0006\u0010U\u001a\u00020OH\u0002J\u0010\u0010%\u001a\u00020H2\b\b\u0001\u0010V\u001a\u00020\tJ\u0010\u0010.\u001a\u00020H2\b\b\u0001\u0010V\u001a\u00020\tJ\u0010\u0010W\u001a\u00020H2\u0006\u0010N\u001a\u00020OH\u0002J\u0010\u0010X\u001a\u00020H2\b\b\u0001\u0010S\u001a\u00020\tJ\u0010\u0010Y\u001a\u00020Z2\u0006\u0010U\u001a\u00020OH\u0002J\u0010\u0010[\u001a\u00020H2\u0006\u0010\\\u001a\u00020OH\u0002R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R&\u0010\u0013\u001a\u00020\t2\b\b\u0001\u0010\u0012\u001a\u00020\t8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R&\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u0018\u001a\u00020\u00198G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010#\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b$\u0010\u000f\"\u0004\b%\u0010\u0011R(\u0010\'\u001a\u0004\u0018\u00010&2\b\u0010\u000b\u001a\u0004\u0018\u00010&8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010,\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b-\u0010\u000f\"\u0004\b.\u0010\u0011R\u000e\u0010/\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u00100\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b1\u0010\u000f\"\u0004\b2\u0010\u0011R&\u00103\u001a\u00020\t2\b\b\u0001\u0010\u0012\u001a\u00020\t8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b4\u0010\u0015\"\u0004\b5\u0010\u0017R&\u00106\u001a\u00020\u00192\b\b\u0001\u0010\u0018\u001a\u00020\u00198G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b7\u0010\u001c\"\u0004\b8\u0010\u001eR\u0014\u00109\u001a\b\u0012\u0004\u0012\u00020;0:X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010<\u001a\u00020=8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b>\u0010?\u00a8\u0006_"}, d2 = {"Ldji/v5/ux/accessory/RTKEnabledWidget;", "Ldji/v5/ux/core/base/widget/ConstraintLayoutWidget;", "Ldji/v5/ux/accessory/RTKEnabledWidget$ModelState;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "Landroid/graphics/drawable/Drawable;", "descriptionTextBackground", "getDescriptionTextBackground", "()Landroid/graphics/drawable/Drawable;", "setDescriptionTextBackground", "(Landroid/graphics/drawable/Drawable;)V", "textColor", "descriptionTextColor", "getDescriptionTextColor", "()I", "setDescriptionTextColor", "(I)V", "textSize", "", "descriptionTextSize", "getDescriptionTextSize", "()F", "setDescriptionTextSize", "(F)V", "rtkEnabledDescriptionTextView", "Landroid/widget/TextView;", "rtkEnabledSwitch", "Landroid/widget/Switch;", "rtkEnabledSwitchThumbIcon", "getRTKEnabledSwitchThumbIcon", "setRTKEnabledSwitchThumbIcon", "Landroid/content/res/ColorStateList;", "rtkEnabledSwitchTrackColor", "getRTKEnabledSwitchTrackColor", "()Landroid/content/res/ColorStateList;", "setRTKEnabledSwitchTrackColor", "(Landroid/content/res/ColorStateList;)V", "rtkEnabledSwitchTrackIcon", "getRTKEnabledSwitchTrackIcon", "setRTKEnabledSwitchTrackIcon", "rtkTitleTextView", "titleTextBackground", "getTitleTextBackground", "setTitleTextBackground", "titleTextColor", "getTitleTextColor", "setTitleTextColor", "titleTextSize", "getTitleTextSize", "setTitleTextSize", "uiUpdateStateProcessor", "Lio/reactivex/rxjava3/processors/PublishProcessor;", "Ldji/v5/ux/accessory/RTKEnabledWidget$UIState;", "widgetModel", "Ldji/v5/ux/accessory/RTKEnabledWidgetModel;", "getWidgetModel", "()Ldji/v5/ux/accessory/RTKEnabledWidgetModel;", "widgetModel$delegate", "Lkotlin/Lazy;", "getIdealDimensionRatioString", "", "getUIStateUpdates", "Lio/reactivex/rxjava3/core/Flowable;", "getWidgetStateUpdate", "initAttributes", "", "initView", "onAttachedToWindow", "onCheckedChanged", "buttonView", "Landroid/widget/CompoundButton;", "isChecked", "", "onDetachedFromWindow", "reactToModelChanges", "setDescriptionTextAppearance", "textAppearanceResId", "setRTKEnabled", "enabled", "resourceId", "setRTKSwitch", "setTitleTextAppearance", "toggleRTK", "Lio/reactivex/rxjava3/disposables/Disposable;", "updateUIForRTKEnabled", "rtkEnabled", "ModelState", "UIState", "android-sdk-v5-uxsdk_debug"})
public class RTKEnabledWidget extends dji.v5.ux.core.base.widget.ConstraintLayoutWidget<dji.v5.ux.accessory.RTKEnabledWidget.ModelState> implements android.widget.CompoundButton.OnCheckedChangeListener {
    private final android.widget.TextView rtkTitleTextView = null;
    private final android.widget.Switch rtkEnabledSwitch = null;
    private final android.widget.TextView rtkEnabledDescriptionTextView = null;
    private final io.reactivex.rxjava3.processors.PublishProcessor<dji.v5.ux.accessory.RTKEnabledWidget.UIState> uiUpdateStateProcessor = null;
    private final kotlin.Lazy widgetModel$delegate = null;
    
    @kotlin.jvm.JvmOverloads
    public RTKEnabledWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public RTKEnabledWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public RTKEnabledWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    private final dji.v5.ux.accessory.RTKEnabledWidgetModel getWidgetModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getTitleTextBackground() {
        return null;
    }
    
    public final void setTitleTextBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @androidx.annotation.Dimension
    public final float getTitleTextSize() {
        return 0.0F;
    }
    
    public final void setTitleTextSize(@androidx.annotation.Dimension
    float textSize) {
    }
    
    @androidx.annotation.ColorInt
    public final int getTitleTextColor() {
        return 0;
    }
    
    public final void setTitleTextColor(@androidx.annotation.ColorInt
    int textColor) {
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmName(name = "getRTKEnabledSwitchThumbIcon")
    public final android.graphics.drawable.Drawable getRTKEnabledSwitchThumbIcon() {
        return null;
    }
    
    @kotlin.jvm.JvmName(name = "setRTKEnabledSwitchThumbIcon")
    public final void setRTKEnabledSwitchThumbIcon(@org.jetbrains.annotations.NotNull
    android.graphics.drawable.Drawable value) {
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmName(name = "getRTKEnabledSwitchTrackIcon")
    public final android.graphics.drawable.Drawable getRTKEnabledSwitchTrackIcon() {
        return null;
    }
    
    @kotlin.jvm.JvmName(name = "setRTKEnabledSwitchTrackIcon")
    public final void setRTKEnabledSwitchTrackIcon(@org.jetbrains.annotations.NotNull
    android.graphics.drawable.Drawable value) {
    }
    
    @org.jetbrains.annotations.Nullable
    @kotlin.jvm.JvmName(name = "getRTKEnabledSwitchTrackColor")
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    public final android.content.res.ColorStateList getRTKEnabledSwitchTrackColor() {
        return null;
    }
    
    @kotlin.jvm.JvmName(name = "setRTKEnabledSwitchTrackColor")
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    public final void setRTKEnabledSwitchTrackColor(@org.jetbrains.annotations.Nullable
    android.content.res.ColorStateList value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getDescriptionTextBackground() {
        return null;
    }
    
    public final void setDescriptionTextBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @androidx.annotation.Dimension
    public final float getDescriptionTextSize() {
        return 0.0F;
    }
    
    public final void setDescriptionTextSize(@androidx.annotation.Dimension
    float textSize) {
    }
    
    @androidx.annotation.ColorInt
    public final int getDescriptionTextColor() {
        return 0;
    }
    
    public final void setDescriptionTextColor(@androidx.annotation.ColorInt
    int textColor) {
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
    public void onCheckedChanged(@org.jetbrains.annotations.Nullable
    android.widget.CompoundButton buttonView, boolean isChecked) {
    }
    
    @java.lang.Override
    protected void reactToModelChanges() {
    }
    
    private final void updateUIForRTKEnabled(boolean rtkEnabled) {
    }
    
    private final void setRTKEnabled(boolean enabled) {
    }
    
    private final io.reactivex.rxjava3.disposables.Disposable toggleRTK(boolean enabled) {
        return null;
    }
    
    private final void setRTKSwitch(boolean isChecked) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getIdealDimensionRatioString() {
        return null;
    }
    
    /**
     * Set text appearance of the title text
     *
     * @param textAppearanceResId Style resource for text appearance
     */
    public final void setTitleTextAppearance(@androidx.annotation.StyleRes
    int textAppearanceResId) {
    }
    
    /**
     * Set the resource ID for the RTK enabled switch's thumb
     *
     * @param resourceId Integer ID of the drawable resource
     */
    public final void setRTKEnabledSwitchThumbIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the resource ID for the RTK enabled switch's track
     *
     * @param resourceId Integer ID of the drawable resource
     */
    public final void setRTKEnabledSwitchTrackIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set text appearance of the description text
     *
     * @param textAppearanceResId Style resource for text appearance
     */
    public final void setDescriptionTextAppearance(@androidx.annotation.StyleRes
    int textAppearanceResId) {
    }
    
    @android.annotation.SuppressLint(value = {"Recycle"})
    private final void initAttributes(android.content.Context context, android.util.AttributeSet attrs) {
    }
    
    /**
     * Get the [UIState] updates
     */
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.ux.accessory.RTKEnabledWidget.UIState> getUIStateUpdates() {
        return null;
    }
    
    /**
     * Get the [ModelState] updates
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.SuppressWarnings(value = {})
    @java.lang.Override
    public io.reactivex.rxjava3.core.Flowable<dji.v5.ux.accessory.RTKEnabledWidget.ModelState> getWidgetStateUpdate() {
        return null;
    }
    
    /**
     * Widget UI update State
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Ldji/v5/ux/accessory/RTKEnabledWidget$UIState;", "", "()V", "SwitchChanged", "Ldji/v5/ux/accessory/RTKEnabledWidget$UIState$SwitchChanged;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class UIState {
        
        private UIState() {
            super();
        }
        
        /**
         * RTK enabled switch check changed update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/accessory/RTKEnabledWidget$UIState$SwitchChanged;", "Ldji/v5/ux/accessory/RTKEnabledWidget$UIState;", "isChecked", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class SwitchChanged extends dji.v5.ux.accessory.RTKEnabledWidget.UIState {
            private final boolean isChecked = false;
            
            /**
             * RTK enabled switch check changed update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.accessory.RTKEnabledWidget.UIState.SwitchChanged copy(boolean isChecked) {
                return null;
            }
            
            /**
             * RTK enabled switch check changed update
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * RTK enabled switch check changed update
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * RTK enabled switch check changed update
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public SwitchChanged(boolean isChecked) {
                super();
            }
            
            public final boolean component1() {
                return false;
            }
            
            public final boolean isChecked() {
                return false;
            }
        }
    }
    
    /**
     * Class defines the widget state updates
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Ldji/v5/ux/accessory/RTKEnabledWidget$ModelState;", "", "()V", "ProductConnected", "RTKEnabledUpdated", "Ldji/v5/ux/accessory/RTKEnabledWidget$ModelState$ProductConnected;", "Ldji/v5/ux/accessory/RTKEnabledWidget$ModelState$RTKEnabledUpdated;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class ModelState {
        
        private ModelState() {
            super();
        }
        
        /**
         * Product connection update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/accessory/RTKEnabledWidget$ModelState$ProductConnected;", "Ldji/v5/ux/accessory/RTKEnabledWidget$ModelState;", "isConnected", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductConnected extends dji.v5.ux.accessory.RTKEnabledWidget.ModelState {
            private final boolean isConnected = false;
            
            /**
             * Product connection update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.accessory.RTKEnabledWidget.ModelState.ProductConnected copy(boolean isConnected) {
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
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/accessory/RTKEnabledWidget$ModelState$RTKEnabledUpdated;", "Ldji/v5/ux/accessory/RTKEnabledWidget$ModelState;", "isRTKEnabled", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class RTKEnabledUpdated extends dji.v5.ux.accessory.RTKEnabledWidget.ModelState {
            private final boolean isRTKEnabled = false;
            
            /**
             * RTK enabled update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.accessory.RTKEnabledWidget.ModelState.RTKEnabledUpdated copy(boolean isRTKEnabled) {
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