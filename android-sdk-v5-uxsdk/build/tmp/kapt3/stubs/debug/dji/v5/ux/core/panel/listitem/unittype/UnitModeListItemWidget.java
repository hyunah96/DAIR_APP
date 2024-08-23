package dji.v5.ux.core.panel.listitem.unittype;

import java.lang.System;

/**
 * Widget shows the current [UnitType] being used.
 * It also provides an option to switch between them.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001GB%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\n\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00103\u001a\u000204H\u0002J\u000e\u00105\u001a\b\u0012\u0004\u0012\u00020\u000206H\u0016J\u001a\u00107\u001a\u0002082\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0003J\b\u00109\u001a\u000208H\u0014J\b\u0010:\u001a\u000208H\u0014J\u0018\u0010;\u001a\u0002082\u0006\u0010<\u001a\u00020\b2\u0006\u0010=\u001a\u000202H\u0016J\b\u0010>\u001a\u000208H\u0014J\b\u0010?\u001a\u000208H\u0002J\u0010\u0010@\u001a\u0002082\b\b\u0001\u0010A\u001a\u00020\bJ\u0010\u0010\u001a\u001a\u0002082\b\b\u0001\u0010B\u001a\u00020\bJ\b\u0010C\u001a\u000208H\u0003J\u0010\u0010D\u001a\u0002082\u0006\u0010E\u001a\u00020FH\u0002R(\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\n\u001a\u00020\u001c8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000fR\u000e\u0010%\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\'\u001a\u00020(8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020.X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100\u00a8\u0006H"}, d2 = {"Ldji/v5/ux/core/panel/listitem/unittype/UnitModeListItemWidget;", "Ldji/v5/ux/core/base/panel/listitem/ListItemRadioButtonWidget;", "Ldji/v5/ux/core/panel/listitem/unittype/UnitModeListItemWidget$ModelState;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "checkBoxTextAppearance", "getCheckBoxTextAppearance", "()I", "setCheckBoxTextAppearance", "(I)V", "checkBoxTextBackground", "Landroid/graphics/drawable/Drawable;", "getCheckBoxTextBackground", "()Landroid/graphics/drawable/Drawable;", "setCheckBoxTextBackground", "(Landroid/graphics/drawable/Drawable;)V", "checkBoxTextColor", "Landroid/content/res/ColorStateList;", "getCheckBoxTextColor", "()Landroid/content/res/ColorStateList;", "setCheckBoxTextColor", "(Landroid/content/res/ColorStateList;)V", "", "checkBoxTextSize", "getCheckBoxTextSize", "()F", "setCheckBoxTextSize", "(F)V", "dialogTheme", "getDialogTheme", "setDialogTheme", "imperialItemIndex", "metricItemIndex", "widgetModel", "Ldji/v5/ux/core/panel/listitem/unittype/UnitModeListItemWidgetModel;", "getWidgetModel", "()Ldji/v5/ux/core/panel/listitem/unittype/UnitModeListItemWidgetModel;", "widgetModel$delegate", "Lkotlin/Lazy;", "widgetSizeDescription", "Ldji/v5/ux/core/base/WidgetSizeDescription;", "getWidgetSizeDescription", "()Ldji/v5/ux/core/base/WidgetSizeDescription;", "getIdealDimensionRatioString", "", "getSpannableString", "Landroid/text/SpannableStringBuilder;", "getWidgetStateUpdate", "Lio/reactivex/rxjava3/core/Flowable;", "initAttributes", "", "onAttachedToWindow", "onDetachedFromWindow", "onOptionTapped", "optionIndex", "optionLabel", "reactToModelChanges", "resetUI", "setCheckBoxBackground", "resourceId", "color", "showWarningDialog", "updateUI", "unitTypeState", "Ldji/v5/ux/core/panel/listitem/unittype/UnitModeListItemWidgetModel$UnitTypeState;", "ModelState", "android-sdk-v5-uxsdk_debug"})
public class UnitModeListItemWidget extends dji.v5.ux.core.base.panel.listitem.ListItemRadioButtonWidget<dji.v5.ux.core.panel.listitem.unittype.UnitModeListItemWidget.ModelState> {
    private final kotlin.Lazy widgetModel$delegate = null;
    private int imperialItemIndex = -1;
    private int metricItemIndex = -1;
    
    /**
     * Theme for the dialogs shown for format
     */
    @androidx.annotation.StyleRes
    private int dialogTheme;
    
    /**
     * The text appearance of the check box label
     */
    private int checkBoxTextAppearance = 0;
    
    /**
     * The text color state list of the check box label
     */
    @org.jetbrains.annotations.Nullable
    private android.content.res.ColorStateList checkBoxTextColor;
    
    /**
     * The background of the check box
     */
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable checkBoxTextBackground;
    
    /**
     * The text size of the check box label
     */
    private float checkBoxTextSize = 0.0F;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.base.WidgetSizeDescription widgetSizeDescription = null;
    
    @kotlin.jvm.JvmOverloads
    public UnitModeListItemWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public UnitModeListItemWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public UnitModeListItemWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0, 0);
    }
    
    private final dji.v5.ux.core.panel.listitem.unittype.UnitModeListItemWidgetModel getWidgetModel() {
        return null;
    }
    
    public final int getDialogTheme() {
        return 0;
    }
    
    public final void setDialogTheme(int p0) {
    }
    
    @androidx.annotation.StyleRes
    public final int getCheckBoxTextAppearance() {
        return 0;
    }
    
    public final void setCheckBoxTextAppearance(@androidx.annotation.StyleRes
    int p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.content.res.ColorStateList getCheckBoxTextColor() {
        return null;
    }
    
    public final void setCheckBoxTextColor(@org.jetbrains.annotations.Nullable
    android.content.res.ColorStateList p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getCheckBoxTextBackground() {
        return null;
    }
    
    public final void setCheckBoxTextBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable p0) {
    }
    
    @androidx.annotation.Dimension
    public final float getCheckBoxTextSize() {
        return 0.0F;
    }
    
    public final void setCheckBoxTextSize(@androidx.annotation.Dimension
    float p0) {
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
    
    private final void updateUI(dji.v5.ux.core.panel.listitem.unittype.UnitModeListItemWidgetModel.UnitTypeState unitTypeState) {
    }
    
    @android.annotation.SuppressLint(value = {"InflateParams"})
    private final void showWarningDialog() {
    }
    
    private final void resetUI() {
    }
    
    private final android.text.SpannableStringBuilder getSpannableString() {
        return null;
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
     * Set the text color for the check box label
     *
     * @param color color integer resource
     */
    public final void setCheckBoxTextColor(@androidx.annotation.ColorInt
    int color) {
    }
    
    /**
     * Set the resource ID for the background of the check box
     *
     * @param resourceId Integer ID of the text view's background resource
     */
    public final void setCheckBoxBackground(@androidx.annotation.DrawableRes
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
    public io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.panel.listitem.unittype.UnitModeListItemWidget.ModelState> getWidgetStateUpdate() {
        return null;
    }
    
    /**
     * Class defines widget state updates
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Ldji/v5/ux/core/panel/listitem/unittype/UnitModeListItemWidget$ModelState;", "", "()V", "ProductConnected", "SetUnitTypeFailed", "SetUnitTypeSucceeded", "UnitTypeUpdated", "Ldji/v5/ux/core/panel/listitem/unittype/UnitModeListItemWidget$ModelState$ProductConnected;", "Ldji/v5/ux/core/panel/listitem/unittype/UnitModeListItemWidget$ModelState$SetUnitTypeFailed;", "Ldji/v5/ux/core/panel/listitem/unittype/UnitModeListItemWidget$ModelState$SetUnitTypeSucceeded;", "Ldji/v5/ux/core/panel/listitem/unittype/UnitModeListItemWidget$ModelState$UnitTypeUpdated;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class ModelState {
        
        private ModelState() {
            super();
        }
        
        /**
         * Product connection update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/core/panel/listitem/unittype/UnitModeListItemWidget$ModelState$ProductConnected;", "Ldji/v5/ux/core/panel/listitem/unittype/UnitModeListItemWidget$ModelState;", "isConnected", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductConnected extends dji.v5.ux.core.panel.listitem.unittype.UnitModeListItemWidget.ModelState {
            private final boolean isConnected = false;
            
            /**
             * Product connection update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.unittype.UnitModeListItemWidget.ModelState.ProductConnected copy(boolean isConnected) {
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
         * Set unit type success
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/panel/listitem/unittype/UnitModeListItemWidget$ModelState$SetUnitTypeSucceeded;", "Ldji/v5/ux/core/panel/listitem/unittype/UnitModeListItemWidget$ModelState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class SetUnitTypeSucceeded extends dji.v5.ux.core.panel.listitem.unittype.UnitModeListItemWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.panel.listitem.unittype.UnitModeListItemWidget.ModelState.SetUnitTypeSucceeded INSTANCE = null;
            
            private SetUnitTypeSucceeded() {
                super();
            }
        }
        
        /**
         * Set unit type failed
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/core/panel/listitem/unittype/UnitModeListItemWidget$ModelState$SetUnitTypeFailed;", "Ldji/v5/ux/core/panel/listitem/unittype/UnitModeListItemWidget$ModelState;", "error", "Ldji/v5/ux/core/base/UXSDKError;", "(Ldji/v5/ux/core/base/UXSDKError;)V", "getError", "()Ldji/v5/ux/core/base/UXSDKError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class SetUnitTypeFailed extends dji.v5.ux.core.panel.listitem.unittype.UnitModeListItemWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.base.UXSDKError error = null;
            
            /**
             * Set unit type failed
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.unittype.UnitModeListItemWidget.ModelState.SetUnitTypeFailed copy(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.base.UXSDKError error) {
                return null;
            }
            
            /**
             * Set unit type failed
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Set unit type failed
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Set unit type failed
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public SetUnitTypeFailed(@org.jetbrains.annotations.NotNull
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
         * Unit type updated
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/core/panel/listitem/unittype/UnitModeListItemWidget$ModelState$UnitTypeUpdated;", "Ldji/v5/ux/core/panel/listitem/unittype/UnitModeListItemWidget$ModelState;", "unitTypeState", "Ldji/v5/ux/core/panel/listitem/unittype/UnitModeListItemWidgetModel$UnitTypeState;", "(Ldji/v5/ux/core/panel/listitem/unittype/UnitModeListItemWidgetModel$UnitTypeState;)V", "getUnitTypeState", "()Ldji/v5/ux/core/panel/listitem/unittype/UnitModeListItemWidgetModel$UnitTypeState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class UnitTypeUpdated extends dji.v5.ux.core.panel.listitem.unittype.UnitModeListItemWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.panel.listitem.unittype.UnitModeListItemWidgetModel.UnitTypeState unitTypeState = null;
            
            /**
             * Unit type updated
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.unittype.UnitModeListItemWidget.ModelState.UnitTypeUpdated copy(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.panel.listitem.unittype.UnitModeListItemWidgetModel.UnitTypeState unitTypeState) {
                return null;
            }
            
            /**
             * Unit type updated
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Unit type updated
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Unit type updated
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public UnitTypeUpdated(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.panel.listitem.unittype.UnitModeListItemWidgetModel.UnitTypeState unitTypeState) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.unittype.UnitModeListItemWidgetModel.UnitTypeState component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.listitem.unittype.UnitModeListItemWidgetModel.UnitTypeState getUnitTypeState() {
                return null;
            }
        }
    }
}