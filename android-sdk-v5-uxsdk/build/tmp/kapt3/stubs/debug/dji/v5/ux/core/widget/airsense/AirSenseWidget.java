package dji.v5.ux.core.widget.airsense;

import java.lang.System;

/**
 * Widget that displays an icon representing whether there are any aircraft nearby and how likely
 * a collision is. The icon is shown in different colors representing the current
 * [AirSenseWarningLevel]. The widget will be hidden on devices that do not have DJI AirSense
 * installed.
 *
 * When the warning level is at [AirSenseWarningLevel.LEVEL_0] or above, a warning dialog will
 * appear. This warning dialog contains a warning message, an option to never show the dialog
 * again, and a link to an additional dialog with AirSense Terms and Conditions for the user to
 * agree to.
 *
 * When the warning level is at [AirSenseWarningLevel.LEVEL_2] or above, a WarningMessage is sent
 * to suggest that the user should descend immediately. To react to all WarningMessages sent by all
 * widgets including the AirSenseWidget, listen to MessagingKeys.SEND_WARNING_MESSAGE.
 *
 * The icon is gray when no airplanes are nearby, and adds the text "N/A" when no product is
 * connected.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 m2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003mnoB%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010P\u001a\u00020QH\u0002J\b\u0010R\u001a\u00020SH\u0003J\u0010\u0010T\u001a\u00020\b2\u0006\u0010U\u001a\u000202H\u0007J\b\u0010V\u001a\u00020WH\u0016J\f\u0010X\u001a\b\u0012\u0004\u0012\u00020D0YJ\u000e\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00020YH\u0016J\u0018\u0010[\u001a\u00020Q2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J\"\u0010\\\u001a\u00020Q2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010]\u001a\u00020QH\u0014J\b\u0010^\u001a\u00020QH\u0014J\b\u0010_\u001a\u00020QH\u0002J\b\u0010`\u001a\u00020QH\u0002J\b\u0010a\u001a\u00020QH\u0014J\u0010\u0010\u000f\u001a\u00020Q2\b\b\u0001\u0010b\u001a\u00020\bJ\u0010\u0010\u0013\u001a\u00020Q2\b\b\u0001\u0010b\u001a\u00020\bJ\u0010\u0010\u0016\u001a\u00020Q2\b\b\u0001\u0010b\u001a\u00020\bJ\u0018\u0010c\u001a\u00020Q2\u0006\u0010U\u001a\u0002022\b\b\u0001\u0010d\u001a\u00020\bJ\u0010\u0010e\u001a\u00020Q2\b\b\u0001\u0010b\u001a\u00020\bJ\u0010\u0010(\u001a\u00020Q2\b\b\u0001\u0010d\u001a\u00020\bJ\u0010\u0010;\u001a\u00020Q2\b\b\u0001\u0010b\u001a\u00020\bJ\b\u0010f\u001a\u00020QH\u0002J\b\u0010g\u001a\u00020QH\u0002J\u0010\u0010h\u001a\u00020Q2\u0006\u0010i\u001a\u00020jH\u0002J\u0010\u0010k\u001a\u00020Q2\u0006\u0010U\u001a\u000202H\u0002J\u0010\u0010l\u001a\u00020Q2\u0006\u0010i\u001a\u00020jH\u0002R(\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R(\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u001c\u001a\u00020\b2\b\b\u0001\u0010\u001b\u001a\u00020\b8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000e\"\u0004\b#\u0010\u0010R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R(\u0010+\u001a\u00020*2\b\b\u0001\u0010\u001b\u001a\u00020*8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\b01X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u00103\u001a\u00020\b2\b\b\u0001\u0010\u001b\u001a\u00020\b8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001e\"\u0004\b5\u0010 R(\u00106\u001a\u00020\b2\b\b\u0001\u0010\u001b\u001a\u00020\b8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001e\"\u0004\b8\u0010 R\u001c\u00109\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u000e\"\u0004\b;\u0010\u0010R(\u0010<\u001a\u00020\b2\b\b\u0001\u0010\u001b\u001a\u00020\b8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001e\"\u0004\b>\u0010 R(\u0010?\u001a\u00020*2\b\b\u0001\u0010\u001b\u001a\u00020*8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010-\"\u0004\bA\u0010/R\u0014\u0010B\u001a\b\u0012\u0004\u0012\u00020D0CX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020FX\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010G\u001a\u00020\b2\b\b\u0001\u0010\u001b\u001a\u00020\b8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u001e\"\u0004\bI\u0010 R\u001b\u0010J\u001a\u00020K8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bL\u0010M\u00a8\u0006p"}, d2 = {"Ldji/v5/ux/core/widget/airsense/AirSenseWidget;", "Ldji/v5/ux/core/base/widget/ConstraintLayoutWidget;", "Ldji/v5/ux/core/widget/airsense/AirSenseWidget$ModelState;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "Landroid/graphics/drawable/Drawable;", "airSenseConnectedStateIcon", "getAirSenseConnectedStateIcon", "()Landroid/graphics/drawable/Drawable;", "setAirSenseConnectedStateIcon", "(Landroid/graphics/drawable/Drawable;)V", "airSenseDisconnectedStateIcon", "getAirSenseDisconnectedStateIcon", "setAirSenseDisconnectedStateIcon", "airSenseIconBackground", "getAirSenseIconBackground", "setAirSenseIconBackground", "airSenseImageView", "Landroid/widget/ImageView;", "blinkAnimation", "Landroid/view/animation/Animation;", "<set-?>", "checkBoxTextAppearance", "getCheckBoxTextAppearance", "()I", "setCheckBoxTextAppearance", "(I)V", "checkBoxTextBackground", "getCheckBoxTextBackground", "setCheckBoxTextBackground", "checkBoxTextColor", "Landroid/content/res/ColorStateList;", "getCheckBoxTextColor", "()Landroid/content/res/ColorStateList;", "setCheckBoxTextColor", "(Landroid/content/res/ColorStateList;)V", "", "checkBoxTextSize", "getCheckBoxTextSize", "()F", "setCheckBoxTextSize", "(F)V", "colorMap", "", "Ldji/v5/ux/core/widget/airsense/AirSenseWidgetModel$AirSenseState;", "termsDialogTheme", "getTermsDialogTheme", "setTermsDialogTheme", "termsLinkTextAppearance", "getTermsLinkTextAppearance", "setTermsLinkTextAppearance", "termsLinkTextBackground", "getTermsLinkTextBackground", "setTermsLinkTextBackground", "termsLinkTextColor", "getTermsLinkTextColor", "setTermsLinkTextColor", "termsLinkTextSize", "getTermsLinkTextSize", "setTermsLinkTextSize", "uiUpdateStateProcessor", "Lio/reactivex/rxjava3/processors/PublishProcessor;", "Ldji/v5/ux/core/widget/airsense/AirSenseWidget$UIState;", "warningDialogDisplayed", "", "warningDialogTheme", "getWarningDialogTheme", "setWarningDialogTheme", "widgetModel", "Ldji/v5/ux/core/widget/airsense/AirSenseWidgetModel;", "getWidgetModel", "()Ldji/v5/ux/core/widget/airsense/AirSenseWidgetModel;", "widgetModel$delegate", "Lkotlin/Lazy;", "checkAndUpdateIcon", "", "createTermsView", "Landroid/view/View;", "getAirSenseIconTintColor", "state", "getIdealDimensionRatioString", "", "getUIStateUpdates", "Lio/reactivex/rxjava3/core/Flowable;", "getWidgetStateUpdate", "initAttributes", "initView", "onAttachedToWindow", "onDetachedFromWindow", "onTermsDialogClosed", "onWarningDialogClosed", "reactToModelChanges", "resourceId", "setAirSenseIconTintColor", "color", "setCheckBoxBackground", "showTermsDialog", "showWarningDialog", "updateAirSenseWarningLevel", "warningLevel", "Ldji/sdk/keyvalue/value/flightcontroller/AirSenseWarningLevel;", "updateIcon", "updateWarningMessages", "Companion", "ModelState", "UIState", "android-sdk-v5-uxsdk_debug"})
public class AirSenseWidget extends dji.v5.ux.core.base.widget.ConstraintLayoutWidget<dji.v5.ux.core.widget.airsense.AirSenseWidget.ModelState> {
    private final android.widget.ImageView airSenseImageView = null;
    private final java.util.Map<dji.v5.ux.core.widget.airsense.AirSenseWidgetModel.AirSenseState, java.lang.Integer> colorMap = null;
    private final android.view.animation.Animation blinkAnimation = null;
    private boolean warningDialogDisplayed = false;
    private final io.reactivex.rxjava3.processors.PublishProcessor<dji.v5.ux.core.widget.airsense.AirSenseWidget.UIState> uiUpdateStateProcessor = null;
    private final kotlin.Lazy widgetModel$delegate = null;
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable airSenseDisconnectedStateIcon;
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable airSenseConnectedStateIcon;
    
    /**
     * The theme of the warning dialog
     */
    private int warningDialogTheme;
    
    /**
     * The theme of the terms dialog
     */
    private int termsDialogTheme = 0;
    
    /**
     * The text appearance of the terms link text view
     */
    private int termsLinkTextAppearance = 0;
    
    /**
     * The text color for the terms link text view
     */
    private int termsLinkTextColor;
    
    /**
     * The background of the terms link text view
     */
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable termsLinkTextBackground;
    
    /**
     * The text size of the terms link text view
     */
    private float termsLinkTextSize = 0.0F;
    
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
    public static final dji.v5.ux.core.widget.airsense.AirSenseWidget.Companion Companion = null;
    private static final java.lang.String AIR_SENSE_TERMS_URL = "file:///android_asset/htmls/air_sense_terms_of_use.html";
    private static final java.lang.String TAG = "AirSenseWidget";
    
    @kotlin.jvm.JvmOverloads
    public AirSenseWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public AirSenseWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public AirSenseWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    private final dji.v5.ux.core.widget.airsense.AirSenseWidgetModel getWidgetModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getAirSenseDisconnectedStateIcon() {
        return null;
    }
    
    public final void setAirSenseDisconnectedStateIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getAirSenseConnectedStateIcon() {
        return null;
    }
    
    public final void setAirSenseConnectedStateIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getAirSenseIconBackground() {
        return null;
    }
    
    public final void setAirSenseIconBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @androidx.annotation.StyleRes
    public final int getWarningDialogTheme() {
        return 0;
    }
    
    public final void setWarningDialogTheme(@androidx.annotation.StyleRes
    int p0) {
    }
    
    @androidx.annotation.StyleRes
    public final int getTermsDialogTheme() {
        return 0;
    }
    
    public final void setTermsDialogTheme(@androidx.annotation.StyleRes
    int p0) {
    }
    
    @androidx.annotation.StyleRes
    public final int getTermsLinkTextAppearance() {
        return 0;
    }
    
    public final void setTermsLinkTextAppearance(@androidx.annotation.StyleRes
    int p0) {
    }
    
    @androidx.annotation.ColorInt
    public final int getTermsLinkTextColor() {
        return 0;
    }
    
    public final void setTermsLinkTextColor(@androidx.annotation.ColorInt
    int p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getTermsLinkTextBackground() {
        return null;
    }
    
    public final void setTermsLinkTextBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable p0) {
    }
    
    @androidx.annotation.Dimension
    public final float getTermsLinkTextSize() {
        return 0.0F;
    }
    
    public final void setTermsLinkTextSize(@androidx.annotation.Dimension
    float p0) {
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
    
    private final void updateAirSenseWarningLevel(dji.sdk.keyvalue.value.flightcontroller.AirSenseWarningLevel warningLevel) {
    }
    
    private final void updateIcon(dji.v5.ux.core.widget.airsense.AirSenseWidgetModel.AirSenseState state) {
    }
    
    private final void updateWarningMessages(dji.sdk.keyvalue.value.flightcontroller.AirSenseWarningLevel warningLevel) {
    }
    
    private final void showWarningDialog() {
    }
    
    private final void onWarningDialogClosed() {
    }
    
    @android.annotation.SuppressLint(value = {"InflateParams"})
    private final android.view.View createTermsView() {
        return null;
    }
    
    private final void showTermsDialog() {
    }
    
    private final void onTermsDialogClosed() {
    }
    
    private final void checkAndUpdateIcon() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getIdealDimensionRatioString() {
        return null;
    }
    
    /**
     * Tints the AirSense icon to the given color when the AirSense state is the given value.
     *
     * @param state The state for which to tint the AirSense icon.
     * @param color The color to tint the AirSense icon.
     */
    public final void setAirSenseIconTintColor(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.widget.airsense.AirSenseWidgetModel.AirSenseState state, @androidx.annotation.ColorInt
    int color) {
    }
    
    /**
     * Returns the color that the AirSense icon will be tinted when the AirSense state is
     * the given value.
     *
     * @param state The state for which the AirSense icon will be tinted the returned
     * color.
     * @return The color the AirSense icon will be tinted.
     */
    @androidx.annotation.ColorInt
    public final int getAirSenseIconTintColor(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.widget.airsense.AirSenseWidgetModel.AirSenseState state) {
        return 0;
    }
    
    /**
     * Set the resource ID for the AirSense icon when there is no product connected
     *
     * @param resourceId Integer ID of the drawable resource
     */
    public final void setAirSenseDisconnectedStateIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the resource ID for the AirSense icon when a product is connected
     *
     * @param resourceId Integer ID of the drawable resource
     */
    public final void setAirSenseConnectedStateIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the resource ID for the AirSense icon's background
     *
     * @param resourceId Integer ID of the icon's background resource
     */
    public final void setAirSenseIconBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the resource ID for the background of the terms link text view
     *
     * @param resourceId Integer ID of the text view's background resource
     */
    public final void setTermsLinkTextBackground(@androidx.annotation.DrawableRes
    int resourceId) {
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
     * Get the [UIState] updates
     */
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.widget.airsense.AirSenseWidget.UIState> getUIStateUpdates() {
        return null;
    }
    
    /**
     * Get the [ModelState] updates
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.SuppressWarnings(value = {})
    @java.lang.Override
    public io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.widget.airsense.AirSenseWidget.ModelState> getWidgetStateUpdate() {
        return null;
    }
    
    /**
     * Widget UI update State
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Ldji/v5/ux/core/widget/airsense/AirSenseWidget$UIState;", "", "()V", "NeverShowAgainCheckChanged", "TermsDialogDismissed", "TermsLinkClicked", "WarningDialogDismissed", "Ldji/v5/ux/core/widget/airsense/AirSenseWidget$UIState$NeverShowAgainCheckChanged;", "Ldji/v5/ux/core/widget/airsense/AirSenseWidget$UIState$TermsDialogDismissed;", "Ldji/v5/ux/core/widget/airsense/AirSenseWidget$UIState$TermsLinkClicked;", "Ldji/v5/ux/core/widget/airsense/AirSenseWidget$UIState$WarningDialogDismissed;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class UIState {
        
        private UIState() {
            super();
        }
        
        /**
         * Update when warning dialog is dismissed
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/widget/airsense/AirSenseWidget$UIState$WarningDialogDismissed;", "Ldji/v5/ux/core/widget/airsense/AirSenseWidget$UIState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class WarningDialogDismissed extends dji.v5.ux.core.widget.airsense.AirSenseWidget.UIState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.widget.airsense.AirSenseWidget.UIState.WarningDialogDismissed INSTANCE = null;
            
            private WarningDialogDismissed() {
                super();
            }
        }
        
        /**
         * Update when terms link is tapped
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/widget/airsense/AirSenseWidget$UIState$TermsLinkClicked;", "Ldji/v5/ux/core/widget/airsense/AirSenseWidget$UIState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class TermsLinkClicked extends dji.v5.ux.core.widget.airsense.AirSenseWidget.UIState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.widget.airsense.AirSenseWidget.UIState.TermsLinkClicked INSTANCE = null;
            
            private TermsLinkClicked() {
                super();
            }
        }
        
        /**
         * Update when terms dialog is dismissed
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/widget/airsense/AirSenseWidget$UIState$TermsDialogDismissed;", "Ldji/v5/ux/core/widget/airsense/AirSenseWidget$UIState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class TermsDialogDismissed extends dji.v5.ux.core.widget.airsense.AirSenseWidget.UIState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.widget.airsense.AirSenseWidget.UIState.TermsDialogDismissed INSTANCE = null;
            
            private TermsDialogDismissed() {
                super();
            }
        }
        
        /**
         * Update when "Don't show again" checkbox is tapped
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/core/widget/airsense/AirSenseWidget$UIState$NeverShowAgainCheckChanged;", "Ldji/v5/ux/core/widget/airsense/AirSenseWidget$UIState;", "isChecked", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class NeverShowAgainCheckChanged extends dji.v5.ux.core.widget.airsense.AirSenseWidget.UIState {
            private final boolean isChecked = false;
            
            /**
             * Update when "Don't show again" checkbox is tapped
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.airsense.AirSenseWidget.UIState.NeverShowAgainCheckChanged copy(boolean isChecked) {
                return null;
            }
            
            /**
             * Update when "Don't show again" checkbox is tapped
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Update when "Don't show again" checkbox is tapped
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Update when "Don't show again" checkbox is tapped
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public NeverShowAgainCheckChanged(boolean isChecked) {
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
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Ldji/v5/ux/core/widget/airsense/AirSenseWidget$ModelState;", "", "()V", "AirSenseStateUpdated", "AirSenseWarningLevelUpdated", "ProductConnected", "Ldji/v5/ux/core/widget/airsense/AirSenseWidget$ModelState$AirSenseStateUpdated;", "Ldji/v5/ux/core/widget/airsense/AirSenseWidget$ModelState$AirSenseWarningLevelUpdated;", "Ldji/v5/ux/core/widget/airsense/AirSenseWidget$ModelState$ProductConnected;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class ModelState {
        
        private ModelState() {
            super();
        }
        
        /**
         * Product connection update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/core/widget/airsense/AirSenseWidget$ModelState$ProductConnected;", "Ldji/v5/ux/core/widget/airsense/AirSenseWidget$ModelState;", "isConnected", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductConnected extends dji.v5.ux.core.widget.airsense.AirSenseWidget.ModelState {
            private final boolean isConnected = false;
            
            /**
             * Product connection update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.airsense.AirSenseWidget.ModelState.ProductConnected copy(boolean isConnected) {
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
         * AirSense warning level update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/core/widget/airsense/AirSenseWidget$ModelState$AirSenseWarningLevelUpdated;", "Ldji/v5/ux/core/widget/airsense/AirSenseWidget$ModelState;", "airSenseWarningLevel", "Ldji/sdk/keyvalue/value/flightcontroller/AirSenseWarningLevel;", "(Ldji/sdk/keyvalue/value/flightcontroller/AirSenseWarningLevel;)V", "getAirSenseWarningLevel", "()Ldji/sdk/keyvalue/value/flightcontroller/AirSenseWarningLevel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class AirSenseWarningLevelUpdated extends dji.v5.ux.core.widget.airsense.AirSenseWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            private final dji.sdk.keyvalue.value.flightcontroller.AirSenseWarningLevel airSenseWarningLevel = null;
            
            /**
             * AirSense warning level update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.airsense.AirSenseWidget.ModelState.AirSenseWarningLevelUpdated copy(@org.jetbrains.annotations.NotNull
            dji.sdk.keyvalue.value.flightcontroller.AirSenseWarningLevel airSenseWarningLevel) {
                return null;
            }
            
            /**
             * AirSense warning level update
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * AirSense warning level update
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * AirSense warning level update
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public AirSenseWarningLevelUpdated(@org.jetbrains.annotations.NotNull
            dji.sdk.keyvalue.value.flightcontroller.AirSenseWarningLevel airSenseWarningLevel) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.sdk.keyvalue.value.flightcontroller.AirSenseWarningLevel component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.sdk.keyvalue.value.flightcontroller.AirSenseWarningLevel getAirSenseWarningLevel() {
                return null;
            }
        }
        
        /**
         * AirSense status update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/core/widget/airsense/AirSenseWidget$ModelState$AirSenseStateUpdated;", "Ldji/v5/ux/core/widget/airsense/AirSenseWidget$ModelState;", "airSenseState", "Ldji/v5/ux/core/widget/airsense/AirSenseWidgetModel$AirSenseState;", "(Ldji/v5/ux/core/widget/airsense/AirSenseWidgetModel$AirSenseState;)V", "getAirSenseState", "()Ldji/v5/ux/core/widget/airsense/AirSenseWidgetModel$AirSenseState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class AirSenseStateUpdated extends dji.v5.ux.core.widget.airsense.AirSenseWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.widget.airsense.AirSenseWidgetModel.AirSenseState airSenseState = null;
            
            /**
             * AirSense status update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.airsense.AirSenseWidget.ModelState.AirSenseStateUpdated copy(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.widget.airsense.AirSenseWidgetModel.AirSenseState airSenseState) {
                return null;
            }
            
            /**
             * AirSense status update
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * AirSense status update
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * AirSense status update
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public AirSenseStateUpdated(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.widget.airsense.AirSenseWidgetModel.AirSenseState airSenseState) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.airsense.AirSenseWidgetModel.AirSenseState component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.airsense.AirSenseWidgetModel.AirSenseState getAirSenseState() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Ldji/v5/ux/core/widget/airsense/AirSenseWidget$Companion;", "", "()V", "AIR_SENSE_TERMS_URL", "", "TAG", "android-sdk-v5-uxsdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}