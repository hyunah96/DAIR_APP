package dji.v5.ux.flight.takeoff;

import java.lang.System;

/**
 * A button that performs actions related to takeoff and landing. There are three possible states
 * for the widget: ready to take off, ready to land, and landing in progress. Clicking the
 * button in each of these states will open a dialog to confirm take off, landing, and landing
 * cancellation, respectively.
 *
 * Additionally, this widget will show a dialog if landing is in progress, but it is currently
 * unsafe to land. The dialog will prompt the user whether or not they want to cancel landing.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b=\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u00b5\u0001\u00b6\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\n\u0010\u0088\u0001\u001a\u00030\u0089\u0001H\u0014J\n\u0010\u008a\u0001\u001a\u00030\u0089\u0001H\u0002J\u0014\u0010\u008b\u0001\u001a\u00030\u008c\u00012\b\u0010\u008d\u0001\u001a\u00030\u008e\u0001H\u0002J\u0010\u0010\u008f\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020\u0090\u0001H\u0016J\u001a\u0010\u0091\u0001\u001a\u00030\u0089\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J\n\u0010\u0092\u0001\u001a\u00030\u0089\u0001H\u0002J\n\u0010\u0093\u0001\u001a\u00030\u0089\u0001H\u0014J\u0016\u0010\u0094\u0001\u001a\u00030\u0089\u00012\n\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0096\u0001H\u0016J\n\u0010\u0097\u0001\u001a\u00030\u0089\u0001H\u0014J\n\u0010\u0098\u0001\u001a\u00030\u0099\u0001H\u0002J\n\u0010\u009a\u0001\u001a\u00030\u0099\u0001H\u0002J\n\u0010\u009b\u0001\u001a\u00030\u0099\u0001H\u0002J\u0014\u0010\u009c\u0001\u001a\u00030\u0089\u00012\b\u0010\u009d\u0001\u001a\u00030\u009e\u0001H\u0002J\n\u0010\u009f\u0001\u001a\u00030\u0099\u0001H\u0002J\n\u0010\u00a0\u0001\u001a\u00030\u0099\u0001H\u0002J\n\u0010\u00a1\u0001\u001a\u00030\u0089\u0001H\u0014J\u0012\u0010\u000f\u001a\u00030\u0089\u00012\t\b\u0001\u0010\u00a2\u0001\u001a\u00020\bJ\u0013\u0010\u00a3\u0001\u001a\u00030\u0089\u00012\t\b\u0001\u0010\u00a4\u0001\u001a\u00020\bJ\u0013\u0010\u00a5\u0001\u001a\u00030\u0089\u00012\t\b\u0001\u0010\u00a4\u0001\u001a\u00020\bJ\u0013\u0010\u00a6\u0001\u001a\u00030\u0089\u00012\t\b\u0001\u0010\u00a4\u0001\u001a\u00020\bJ\u0013\u0010\u00a7\u0001\u001a\u00030\u0089\u00012\t\b\u0001\u0010\u00a4\u0001\u001a\u00020\bJ\u0013\u0010\u00a8\u0001\u001a\u00030\u0089\u00012\t\b\u0001\u0010\u00a4\u0001\u001a\u00020\bJ\u0012\u0010p\u001a\u00030\u0089\u00012\t\b\u0001\u0010\u00a2\u0001\u001a\u00020\bJ\u0012\u0010s\u001a\u00030\u0089\u00012\t\b\u0001\u0010\u00a2\u0001\u001a\u00020\bJ\u0012\u0010v\u001a\u00030\u0089\u00012\t\b\u0001\u0010\u00a2\u0001\u001a\u00020\bJ\u0012\u0010{\u001a\u00030\u0089\u00012\t\b\u0001\u0010\u00a2\u0001\u001a\u00020\bJ\u0012\u0010~\u001a\u00030\u0089\u00012\t\b\u0001\u0010\u00a2\u0001\u001a\u00020\bJ\u0013\u0010\u0081\u0001\u001a\u00030\u0089\u00012\t\b\u0001\u0010\u00a2\u0001\u001a\u00020\bJ\n\u0010\u00a9\u0001\u001a\u00030\u0089\u0001H\u0002J\n\u0010\u00aa\u0001\u001a\u00030\u0089\u0001H\u0002J\n\u0010\u00ab\u0001\u001a\u00030\u0089\u0001H\u0002J\n\u0010\u00ac\u0001\u001a\u00030\u0089\u0001H\u0002J\n\u0010\u00ad\u0001\u001a\u00030\u0089\u0001H\u0002J\n\u0010\u00ae\u0001\u001a\u00030\u0089\u0001H\u0002J\n\u0010\u00af\u0001\u001a\u00030\u0089\u0001H\u0002J\n\u0010\u00b0\u0001\u001a\u00030\u0089\u0001H\u0002J\n\u0010\u00b1\u0001\u001a\u00030\u0089\u0001H\u0002J\u0014\u0010\u00b2\u0001\u001a\u00030\u0089\u00012\b\u0010\u00b3\u0001\u001a\u00030\u00b4\u0001H\u0002R(\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R(\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R&\u0010\u001c\u001a\u00020\b2\b\b\u0001\u0010\u001b\u001a\u00020\b8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010!\u001a\u0004\u0018\u00010\"8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R&\u0010*\u001a\u00020)2\b\b\u0001\u0010(\u001a\u00020)8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R(\u0010/\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b0\u0010\u000e\"\u0004\b1\u0010\u0010R&\u00102\u001a\u00020\b2\b\b\u0001\u0010\u001b\u001a\u00020\b8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b3\u0010\u001e\"\u0004\b4\u0010 R&\u00105\u001a\u00020)2\b\b\u0001\u0010(\u001a\u00020)8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b6\u0010,\"\u0004\b7\u0010.R(\u00108\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b9\u0010\u000e\"\u0004\b:\u0010\u0010R&\u0010;\u001a\u00020\b2\b\b\u0001\u0010\u001b\u001a\u00020\b8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b<\u0010\u001e\"\u0004\b=\u0010 R\u001a\u0010>\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010,\"\u0004\b@\u0010.R\u001a\u0010A\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010,\"\u0004\bC\u0010.R&\u0010D\u001a\u00020\b2\b\b\u0001\u0010\u001b\u001a\u00020\b8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bE\u0010\u001e\"\u0004\bF\u0010 R(\u0010H\u001a\u0004\u0018\u00010\u000b2\b\u0010G\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bI\u0010\u000e\"\u0004\bJ\u0010\u0010R(\u0010K\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bL\u0010\u000e\"\u0004\bM\u0010\u0010R&\u0010N\u001a\u00020\b2\b\b\u0001\u0010\u001b\u001a\u00020\b8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bO\u0010\u001e\"\u0004\bP\u0010 R&\u0010Q\u001a\u00020)2\b\b\u0001\u0010(\u001a\u00020)8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bR\u0010,\"\u0004\bS\u0010.R&\u0010T\u001a\u00020\b2\b\b\u0001\u0010\u001b\u001a\u00020\b8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bU\u0010\u001e\"\u0004\bV\u0010 R&\u0010W\u001a\u00020\b2\b\b\u0001\u0010\u001b\u001a\u00020\b8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bX\u0010\u001e\"\u0004\bY\u0010 R(\u0010Z\u001a\u00020\b2\b\b\u0001\u0010\u0017\u001a\u00020\b8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u001e\"\u0004\b\\\u0010 R(\u0010]\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b^\u0010\u000e\"\u0004\b_\u0010\u0010R\u001e\u0010`\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u001e\"\u0004\bb\u0010 R&\u0010c\u001a\u00020)2\b\b\u0001\u0010(\u001a\u00020)8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bd\u0010,\"\u0004\be\u0010.R\u0010\u0010f\u001a\u0004\u0018\u00010gX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010h\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bi\u0010,\"\u0004\bj\u0010.R\u001a\u0010k\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bl\u0010,\"\u0004\bm\u0010.R(\u0010n\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bo\u0010\u000e\"\u0004\bp\u0010\u0010R\u001c\u0010q\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\br\u0010\u000e\"\u0004\bs\u0010\u0010R\u001c\u0010t\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bu\u0010\u000e\"\u0004\bv\u0010\u0010R\u0010\u0010w\u001a\u0004\u0018\u00010xX\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010y\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bz\u0010\u000e\"\u0004\b{\u0010\u0010R\u001c\u0010|\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b}\u0010\u000e\"\u0004\b~\u0010\u0010R\u001e\u0010\u007f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010\u000e\"\u0005\b\u0081\u0001\u0010\u0010R!\u0010\u0082\u0001\u001a\u00030\u0083\u00018BX\u0082\u0084\u0002\u00a2\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\u00a8\u0006\u00b7\u0001"}, d2 = {"Ldji/v5/ux/flight/takeoff/TakeOffWidget;", "Ldji/v5/ux/core/base/widget/IconButtonWidget;", "Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "drawable", "Landroid/graphics/drawable/Drawable;", "cancelLandActionIcon", "getCancelLandActionIcon", "()Landroid/graphics/drawable/Drawable;", "setCancelLandActionIcon", "(Landroid/graphics/drawable/Drawable;)V", "decimalFormat", "Ljava/text/DecimalFormat;", "background", "dialogBackground", "getDialogBackground", "setDialogBackground", "value", "dialogCancelBackground", "getDialogCancelBackground", "setDialogCancelBackground", "color", "dialogCancelTextColor", "getDialogCancelTextColor", "()I", "setDialogCancelTextColor", "(I)V", "colors", "Landroid/content/res/ColorStateList;", "dialogCancelTextColors", "getDialogCancelTextColors", "()Landroid/content/res/ColorStateList;", "setDialogCancelTextColors", "(Landroid/content/res/ColorStateList;)V", "textSize", "", "dialogCancelTextSize", "getDialogCancelTextSize", "()F", "setDialogCancelTextSize", "(F)V", "dialogCheckBoxMessageBackground", "getDialogCheckBoxMessageBackground", "setDialogCheckBoxMessageBackground", "dialogCheckBoxMessageTextColor", "getDialogCheckBoxMessageTextColor", "setDialogCheckBoxMessageTextColor", "dialogCheckBoxMessageTextSize", "getDialogCheckBoxMessageTextSize", "setDialogCheckBoxMessageTextSize", "dialogMessageBackground", "getDialogMessageBackground", "setDialogMessageBackground", "dialogMessageTextColor", "getDialogMessageTextColor", "setDialogMessageTextColor", "dialogMessageTextSize", "getDialogMessageTextSize", "setDialogMessageTextSize", "dialogPrecisionMessageTextSize", "getDialogPrecisionMessageTextSize", "setDialogPrecisionMessageTextSize", "dialogSliderFillColor", "getDialogSliderFillColor", "setDialogSliderFillColor", "icon", "dialogSliderIcon", "getDialogSliderIcon", "setDialogSliderIcon", "dialogSliderMessageBackground", "getDialogSliderMessageBackground", "setDialogSliderMessageBackground", "dialogSliderMessageTextColor", "getDialogSliderMessageTextColor", "setDialogSliderMessageTextColor", "dialogSliderMessageTextSize", "getDialogSliderMessageTextSize", "setDialogSliderMessageTextSize", "dialogSliderThumbColor", "getDialogSliderThumbColor", "setDialogSliderThumbColor", "dialogSliderThumbSelectedColor", "getDialogSliderThumbSelectedColor", "setDialogSliderThumbSelectedColor", "dialogTheme", "getDialogTheme", "setDialogTheme", "dialogTitleBackground", "getDialogTitleBackground", "setDialogTitleBackground", "dialogTitleTextColor", "getDialogTitleTextColor", "setDialogTitleTextColor", "dialogTitleTextSize", "getDialogTitleTextSize", "setDialogTitleTextSize", "dialogType", "Ldji/v5/ux/flight/takeoff/TakeOffWidget$DialogType;", "disabledAlpha", "getDisabledAlpha", "setDisabledAlpha", "enabledAlpha", "getEnabledAlpha", "setEnabledAlpha", "landActionIcon", "getLandActionIcon", "setLandActionIcon", "landingConfirmationDialogIcon", "getLandingConfirmationDialogIcon", "setLandingConfirmationDialogIcon", "landingDialogIcon", "getLandingDialogIcon", "setLandingDialogIcon", "slidingDialog", "Ldji/v5/ux/core/ui/SlidingDialog;", "takeOffActionIcon", "getTakeOffActionIcon", "setTakeOffActionIcon", "takeOffDialogIcon", "getTakeOffDialogIcon", "setTakeOffDialogIcon", "unsafeToLandDialogIcon", "getUnsafeToLandDialogIcon", "setUnsafeToLandDialogIcon", "widgetModel", "Ldji/v5/ux/flight/takeoff/TakeOffWidgetModel;", "getWidgetModel", "()Ldji/v5/ux/flight/takeoff/TakeOffWidgetModel;", "widgetModel$delegate", "Lkotlin/Lazy;", "checkAndUpdateIconColor", "", "checkAndUpdateTakeOffLandingState", "getHeightString", "", "height", "Ldji/v5/ux/flight/takeoff/TakeOffWidgetModel$Height;", "getWidgetStateUpdate", "Lio/reactivex/rxjava3/core/Flowable;", "initAttributes", "initDialog", "onAttachedToWindow", "onClick", "view", "Landroid/view/View;", "onDetachedFromWindow", "performCancelLandAction", "Lio/reactivex/rxjava3/disposables/Disposable;", "performLandingAction", "performLandingConfirmationAction", "performOnSlideChecked", "checkBoxChecked", "", "performPrecisionTakeOffAction", "performTakeOffAction", "reactToModelChanges", "resourceId", "setDialogCancelTextAppearance", "textAppearance", "setDialogCheckBoxMessageTextAppearance", "setDialogMessageTextAppearance", "setDialogSliderMessageTextAppearance", "setDialogTitleTextAppearance", "showDialog", "showLandingConfirmationDialog", "showLandingDialog", "showTakeOffDialog", "showUnsafeToLandDialog", "updateCheckBoxVisibility", "updateImageAlpha", "updateLandingConfirmationDialogMessage", "updateTakeOffDialogMessage", "updateTakeOffStatus", "takeOffLandingState", "Ldji/v5/ux/flight/takeoff/TakeOffWidgetModel$TakeOffLandingState;", "DialogType", "ModelState", "android-sdk-v5-uxsdk_debug"})
public class TakeOffWidget extends dji.v5.ux.core.base.widget.IconButtonWidget<dji.v5.ux.flight.takeoff.TakeOffWidget.ModelState> {
    private dji.v5.ux.core.ui.SlidingDialog slidingDialog;
    private final java.text.DecimalFormat decimalFormat = null;
    private dji.v5.ux.flight.takeoff.TakeOffWidget.DialogType dialogType;
    private final kotlin.Lazy widgetModel$delegate = null;
    
    /**
     * The alpha of the image when the widget is disabled or pressed
     */
    private float disabledAlpha = 0.38F;
    
    /**
     * The alpha of the image when the widget is enabled
     */
    private float enabledAlpha = 1.0F;
    
    /**
     * The theme of the dialogs
     */
    private int dialogTheme;
    
    /**
     * Takeoff icon drawable
     */
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable takeOffActionIcon;
    
    /**
     * Land action icon
     */
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable landActionIcon;
    
    /**
     * Cancel land action icon drawable
     */
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable cancelLandActionIcon;
    
    /**
     * Takeoff dialog icon drawable
     */
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable takeOffDialogIcon;
    
    /**
     * Landing dialog icon drawable
     */
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable landingDialogIcon;
    
    /**
     * Landing Confirmation dialog icon drawable
     */
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable landingConfirmationDialogIcon;
    
    /**
     * Unsafe To Land dialog icon drawable
     */
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable unsafeToLandDialogIcon;
    
    /**
     * The color of the title for all the dialogs shown by this widget
     */
    @androidx.annotation.ColorInt
    private int dialogTitleTextColor;
    
    /**
     * The text size of the message for all the dialogs shown by this widget
     */
    private float dialogMessageTextSize;
    
    /**
     * The text size of the precision takeoff message for the takeoff dialog
     */
    private float dialogPrecisionMessageTextSize;
    
    @kotlin.jvm.JvmOverloads
    public TakeOffWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public TakeOffWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public TakeOffWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    private final dji.v5.ux.flight.takeoff.TakeOffWidgetModel getWidgetModel() {
        return null;
    }
    
    public final float getDisabledAlpha() {
        return 0.0F;
    }
    
    public final void setDisabledAlpha(float p0) {
    }
    
    public final float getEnabledAlpha() {
        return 0.0F;
    }
    
    public final void setEnabledAlpha(float p0) {
    }
    
    @androidx.annotation.StyleRes
    public final int getDialogTheme() {
        return 0;
    }
    
    public final void setDialogTheme(@androidx.annotation.StyleRes
    int value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getTakeOffActionIcon() {
        return null;
    }
    
    public final void setTakeOffActionIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable drawable) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getLandActionIcon() {
        return null;
    }
    
    public final void setLandActionIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable drawable) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getCancelLandActionIcon() {
        return null;
    }
    
    public final void setCancelLandActionIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable drawable) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getTakeOffDialogIcon() {
        return null;
    }
    
    public final void setTakeOffDialogIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getLandingDialogIcon() {
        return null;
    }
    
    public final void setLandingDialogIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getLandingConfirmationDialogIcon() {
        return null;
    }
    
    public final void setLandingConfirmationDialogIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getUnsafeToLandDialogIcon() {
        return null;
    }
    
    public final void setUnsafeToLandDialogIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable p0) {
    }
    
    @androidx.annotation.Dimension
    public final float getDialogTitleTextSize() {
        return 0.0F;
    }
    
    public final void setDialogTitleTextSize(@androidx.annotation.Dimension
    float textSize) {
    }
    
    public final int getDialogTitleTextColor() {
        return 0;
    }
    
    public final void setDialogTitleTextColor(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getDialogTitleBackground() {
        return null;
    }
    
    public final void setDialogTitleBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    public final float getDialogMessageTextSize() {
        return 0.0F;
    }
    
    public final void setDialogMessageTextSize(float p0) {
    }
    
    public final float getDialogPrecisionMessageTextSize() {
        return 0.0F;
    }
    
    public final void setDialogPrecisionMessageTextSize(float p0) {
    }
    
    @androidx.annotation.ColorInt
    public final int getDialogMessageTextColor() {
        return 0;
    }
    
    public final void setDialogMessageTextColor(@androidx.annotation.ColorInt
    int color) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getDialogMessageBackground() {
        return null;
    }
    
    public final void setDialogMessageBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @androidx.annotation.Dimension
    public final float getDialogCheckBoxMessageTextSize() {
        return 0.0F;
    }
    
    public final void setDialogCheckBoxMessageTextSize(@androidx.annotation.Dimension
    float textSize) {
    }
    
    @androidx.annotation.ColorInt
    public final int getDialogCheckBoxMessageTextColor() {
        return 0;
    }
    
    public final void setDialogCheckBoxMessageTextColor(@androidx.annotation.ColorInt
    int color) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getDialogCheckBoxMessageBackground() {
        return null;
    }
    
    public final void setDialogCheckBoxMessageBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @androidx.annotation.Dimension
    public final float getDialogCancelTextSize() {
        return 0.0F;
    }
    
    public final void setDialogCancelTextSize(@androidx.annotation.Dimension
    float textSize) {
    }
    
    @androidx.annotation.ColorInt
    public final int getDialogCancelTextColor() {
        return 0;
    }
    
    public final void setDialogCancelTextColor(@androidx.annotation.ColorInt
    int color) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.content.res.ColorStateList getDialogCancelTextColors() {
        return null;
    }
    
    public final void setDialogCancelTextColors(@org.jetbrains.annotations.Nullable
    android.content.res.ColorStateList colors) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getDialogCancelBackground() {
        return null;
    }
    
    public final void setDialogCancelBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @androidx.annotation.Dimension
    public final float getDialogSliderMessageTextSize() {
        return 0.0F;
    }
    
    public final void setDialogSliderMessageTextSize(@androidx.annotation.Dimension
    float textSize) {
    }
    
    @androidx.annotation.ColorInt
    public final int getDialogSliderMessageTextColor() {
        return 0;
    }
    
    public final void setDialogSliderMessageTextColor(@androidx.annotation.ColorInt
    int color) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getDialogSliderMessageBackground() {
        return null;
    }
    
    public final void setDialogSliderMessageBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getDialogSliderIcon() {
        return null;
    }
    
    public final void setDialogSliderIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable icon) {
    }
    
    @androidx.annotation.ColorInt
    public final int getDialogSliderThumbColor() {
        return 0;
    }
    
    public final void setDialogSliderThumbColor(@androidx.annotation.ColorInt
    int color) {
    }
    
    @androidx.annotation.ColorInt
    public final int getDialogSliderThumbSelectedColor() {
        return 0;
    }
    
    public final void setDialogSliderThumbSelectedColor(@androidx.annotation.ColorInt
    int color) {
    }
    
    @androidx.annotation.ColorInt
    public final int getDialogSliderFillColor() {
        return 0;
    }
    
    public final void setDialogSliderFillColor(@androidx.annotation.ColorInt
    int color) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getDialogBackground() {
        return null;
    }
    
    public final void setDialogBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable background) {
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
    
    @java.lang.Override
    public void onClick(@org.jetbrains.annotations.Nullable
    android.view.View view) {
    }
    
    private final void initDialog() {
    }
    
    private final void performOnSlideChecked(boolean checkBoxChecked) {
    }
    
    private final io.reactivex.rxjava3.disposables.Disposable performTakeOffAction() {
        return null;
    }
    
    private final io.reactivex.rxjava3.disposables.Disposable performPrecisionTakeOffAction() {
        return null;
    }
    
    private final io.reactivex.rxjava3.disposables.Disposable performLandingAction() {
        return null;
    }
    
    private final io.reactivex.rxjava3.disposables.Disposable performLandingConfirmationAction() {
        return null;
    }
    
    private final io.reactivex.rxjava3.disposables.Disposable performCancelLandAction() {
        return null;
    }
    
    private final void showDialog() {
    }
    
    private final void showTakeOffDialog() {
    }
    
    private final void updateCheckBoxVisibility() {
    }
    
    private final void updateTakeOffDialogMessage() {
    }
    
    private final java.lang.String getHeightString(dji.v5.ux.flight.takeoff.TakeOffWidgetModel.Height height) {
        return null;
    }
    
    private final void showLandingDialog() {
    }
    
    private final void showLandingConfirmationDialog() {
    }
    
    private final void updateLandingConfirmationDialogMessage() {
    }
    
    private final void showUnsafeToLandDialog() {
    }
    
    private final void updateTakeOffStatus(dji.v5.ux.flight.takeoff.TakeOffWidgetModel.TakeOffLandingState takeOffLandingState) {
    }
    
    private final void updateImageAlpha() {
    }
    
    private final void checkAndUpdateTakeOffLandingState() {
    }
    
    @java.lang.Override
    protected void checkAndUpdateIconColor() {
    }
    
    @android.annotation.SuppressLint(value = {"Recycle"})
    private final void initAttributes(android.content.Context context, android.util.AttributeSet attrs) {
    }
    
    /**
     * Set takeoff icon drawable
     *
     * @param resourceId resource id of takeoff icon
     */
    public final void setTakeOffActionIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set land action icon drawable
     *
     * @param resourceId resource id of land action icon
     */
    public final void setLandActionIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set cancel land action icon drawable
     *
     * @param resourceId resource id of cancel land action
     */
    public final void setCancelLandActionIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set takeoff dialog icon drawable
     *
     * @param resourceId resource id of takeoff dialog icon
     */
    public final void setTakeOffDialogIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set landing dialog icon drawable
     *
     * @param resourceId resource id of landing dialog icon
     */
    public final void setLandingDialogIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set landing confirmation dialog icon drawable
     *
     * @param resourceId resource id of landing confirmation dialog icon
     */
    public final void setLandingConfirmationDialogIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set unsafe to land dialog icon drawable
     *
     * @param resourceId resource id of unsafe to land dialog icon
     */
    public final void setUnsafeToLandDialogIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the text appearance of the title for all the dialogs shown by this widget
     *
     * @param textAppearance Style resource for text appearance
     */
    public final void setDialogTitleTextAppearance(@androidx.annotation.StyleRes
    int textAppearance) {
    }
    
    /**
     * Set the text appearance of the message for all the dialogs shown by this widget
     *
     * @param textAppearance Style resource for text appearance
     */
    public final void setDialogMessageTextAppearance(@androidx.annotation.StyleRes
    int textAppearance) {
    }
    
    /**
     * Set the text appearance of the precision checkbox message for the takeoff dialog
     *
     * @param textAppearance Style resource for text appearance
     */
    public final void setDialogCheckBoxMessageTextAppearance(@androidx.annotation.StyleRes
    int textAppearance) {
    }
    
    /**
     * Set the text appearance of the cancel button for all the dialogs shown by this widget
     *
     * @param textAppearance Style resource for text appearance
     */
    public final void setDialogCancelTextAppearance(@androidx.annotation.StyleRes
    int textAppearance) {
    }
    
    /**
     * Set the text appearance of the slider message for all the dialogs shown by this widget
     *
     * @param textAppearance Style resource for text appearance
     */
    public final void setDialogSliderMessageTextAppearance(@androidx.annotation.StyleRes
    int textAppearance) {
    }
    
    /**
     * Get the [ModelState] updates
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.SuppressWarnings(value = {})
    @java.lang.Override
    public io.reactivex.rxjava3.core.Flowable<dji.v5.ux.flight.takeoff.TakeOffWidget.ModelState> getWidgetStateUpdate() {
        return null;
    }
    
    /**
     * Class defines the widget state updates
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\f\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u00a8\u0006\u001b"}, d2 = {"Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState;", "", "()V", "LandingCancelFailed", "LandingCancelSucceeded", "LandingConfirmFailed", "LandingConfirmSucceeded", "LandingStartFailed", "LandingStartSucceeded", "PrecisionTakeOffStartFailed", "PrecisionTakeOffStartSucceeded", "ProductConnected", "TakeOffLandingStateUpdated", "TakeOffStartFailed", "TakeOffStartSucceeded", "Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState$LandingCancelFailed;", "Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState$LandingCancelSucceeded;", "Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState$LandingConfirmFailed;", "Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState$LandingConfirmSucceeded;", "Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState$LandingStartFailed;", "Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState$LandingStartSucceeded;", "Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState$PrecisionTakeOffStartFailed;", "Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState$PrecisionTakeOffStartSucceeded;", "Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState$ProductConnected;", "Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState$TakeOffLandingStateUpdated;", "Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState$TakeOffStartFailed;", "Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState$TakeOffStartSucceeded;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class ModelState {
        
        private ModelState() {
            super();
        }
        
        /**
         * Product connection update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState$ProductConnected;", "Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState;", "isConnected", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductConnected extends dji.v5.ux.flight.takeoff.TakeOffWidget.ModelState {
            private final boolean isConnected = false;
            
            /**
             * Product connection update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.flight.takeoff.TakeOffWidget.ModelState.ProductConnected copy(boolean isConnected) {
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
         * Takeoff Landing State update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState$TakeOffLandingStateUpdated;", "Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState;", "state", "Ldji/v5/ux/flight/takeoff/TakeOffWidgetModel$TakeOffLandingState;", "(Ldji/v5/ux/flight/takeoff/TakeOffWidgetModel$TakeOffLandingState;)V", "getState", "()Ldji/v5/ux/flight/takeoff/TakeOffWidgetModel$TakeOffLandingState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class TakeOffLandingStateUpdated extends dji.v5.ux.flight.takeoff.TakeOffWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.flight.takeoff.TakeOffWidgetModel.TakeOffLandingState state = null;
            
            /**
             * Takeoff Landing State update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.flight.takeoff.TakeOffWidget.ModelState.TakeOffLandingStateUpdated copy(@org.jetbrains.annotations.NotNull
            dji.v5.ux.flight.takeoff.TakeOffWidgetModel.TakeOffLandingState state) {
                return null;
            }
            
            /**
             * Takeoff Landing State update
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Takeoff Landing State update
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Takeoff Landing State update
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public TakeOffLandingStateUpdated(@org.jetbrains.annotations.NotNull
            dji.v5.ux.flight.takeoff.TakeOffWidgetModel.TakeOffLandingState state) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.flight.takeoff.TakeOffWidgetModel.TakeOffLandingState component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.flight.takeoff.TakeOffWidgetModel.TakeOffLandingState getState() {
                return null;
            }
        }
        
        /**
         * Takeoff started successfully
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState$TakeOffStartSucceeded;", "Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class TakeOffStartSucceeded extends dji.v5.ux.flight.takeoff.TakeOffWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.flight.takeoff.TakeOffWidget.ModelState.TakeOffStartSucceeded INSTANCE = null;
            
            private TakeOffStartSucceeded() {
                super();
            }
        }
        
        /**
         * Takeoff not started due to error
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState$TakeOffStartFailed;", "Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState;", "error", "Ldji/v5/ux/core/base/UXSDKError;", "(Ldji/v5/ux/core/base/UXSDKError;)V", "getError", "()Ldji/v5/ux/core/base/UXSDKError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class TakeOffStartFailed extends dji.v5.ux.flight.takeoff.TakeOffWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.base.UXSDKError error = null;
            
            /**
             * Takeoff not started due to error
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.flight.takeoff.TakeOffWidget.ModelState.TakeOffStartFailed copy(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.base.UXSDKError error) {
                return null;
            }
            
            /**
             * Takeoff not started due to error
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Takeoff not started due to error
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Takeoff not started due to error
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public TakeOffStartFailed(@org.jetbrains.annotations.NotNull
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
         * Precision Takeoff started successfully
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState$PrecisionTakeOffStartSucceeded;", "Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class PrecisionTakeOffStartSucceeded extends dji.v5.ux.flight.takeoff.TakeOffWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.flight.takeoff.TakeOffWidget.ModelState.PrecisionTakeOffStartSucceeded INSTANCE = null;
            
            private PrecisionTakeOffStartSucceeded() {
                super();
            }
        }
        
        /**
         * Precision Takeoff not started due to error
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState$PrecisionTakeOffStartFailed;", "Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState;", "error", "Ldji/v5/ux/core/base/UXSDKError;", "(Ldji/v5/ux/core/base/UXSDKError;)V", "getError", "()Ldji/v5/ux/core/base/UXSDKError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class PrecisionTakeOffStartFailed extends dji.v5.ux.flight.takeoff.TakeOffWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.base.UXSDKError error = null;
            
            /**
             * Precision Takeoff not started due to error
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.flight.takeoff.TakeOffWidget.ModelState.PrecisionTakeOffStartFailed copy(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.base.UXSDKError error) {
                return null;
            }
            
            /**
             * Precision Takeoff not started due to error
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Precision Takeoff not started due to error
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Precision Takeoff not started due to error
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public PrecisionTakeOffStartFailed(@org.jetbrains.annotations.NotNull
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
         * Landing started successfully
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState$LandingStartSucceeded;", "Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class LandingStartSucceeded extends dji.v5.ux.flight.takeoff.TakeOffWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.flight.takeoff.TakeOffWidget.ModelState.LandingStartSucceeded INSTANCE = null;
            
            private LandingStartSucceeded() {
                super();
            }
        }
        
        /**
         * Landing not started due to error
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState$LandingStartFailed;", "Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState;", "error", "Ldji/v5/ux/core/base/UXSDKError;", "(Ldji/v5/ux/core/base/UXSDKError;)V", "getError", "()Ldji/v5/ux/core/base/UXSDKError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class LandingStartFailed extends dji.v5.ux.flight.takeoff.TakeOffWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.base.UXSDKError error = null;
            
            /**
             * Landing not started due to error
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.flight.takeoff.TakeOffWidget.ModelState.LandingStartFailed copy(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.base.UXSDKError error) {
                return null;
            }
            
            /**
             * Landing not started due to error
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Landing not started due to error
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Landing not started due to error
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public LandingStartFailed(@org.jetbrains.annotations.NotNull
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
         * Landing confirmed successfully
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState$LandingConfirmSucceeded;", "Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class LandingConfirmSucceeded extends dji.v5.ux.flight.takeoff.TakeOffWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.flight.takeoff.TakeOffWidget.ModelState.LandingConfirmSucceeded INSTANCE = null;
            
            private LandingConfirmSucceeded() {
                super();
            }
        }
        
        /**
         * Landing not confirmed due to error
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState$LandingConfirmFailed;", "Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState;", "error", "Ldji/v5/ux/core/base/UXSDKError;", "(Ldji/v5/ux/core/base/UXSDKError;)V", "getError", "()Ldji/v5/ux/core/base/UXSDKError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class LandingConfirmFailed extends dji.v5.ux.flight.takeoff.TakeOffWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.base.UXSDKError error = null;
            
            /**
             * Landing not confirmed due to error
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.flight.takeoff.TakeOffWidget.ModelState.LandingConfirmFailed copy(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.base.UXSDKError error) {
                return null;
            }
            
            /**
             * Landing not confirmed due to error
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Landing not confirmed due to error
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Landing not confirmed due to error
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public LandingConfirmFailed(@org.jetbrains.annotations.NotNull
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
         * Landing canceled successfully
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState$LandingCancelSucceeded;", "Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class LandingCancelSucceeded extends dji.v5.ux.flight.takeoff.TakeOffWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.flight.takeoff.TakeOffWidget.ModelState.LandingCancelSucceeded INSTANCE = null;
            
            private LandingCancelSucceeded() {
                super();
            }
        }
        
        /**
         * Landing not canceled due to error
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState$LandingCancelFailed;", "Ldji/v5/ux/flight/takeoff/TakeOffWidget$ModelState;", "error", "Ldji/v5/ux/core/base/UXSDKError;", "(Ldji/v5/ux/core/base/UXSDKError;)V", "getError", "()Ldji/v5/ux/core/base/UXSDKError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class LandingCancelFailed extends dji.v5.ux.flight.takeoff.TakeOffWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.base.UXSDKError error = null;
            
            /**
             * Landing not canceled due to error
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.flight.takeoff.TakeOffWidget.ModelState.LandingCancelFailed copy(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.base.UXSDKError error) {
                return null;
            }
            
            /**
             * Landing not canceled due to error
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Landing not canceled due to error
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Landing not canceled due to error
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public LandingCancelFailed(@org.jetbrains.annotations.NotNull
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
    }
    
    /**
     * The type of dialog shown
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Ldji/v5/ux/flight/takeoff/TakeOffWidget$DialogType;", "", "()V", "Landing", "LandingConfirmation", "TakeOff", "UnsafeToLand", "Ldji/v5/ux/flight/takeoff/TakeOffWidget$DialogType$Landing;", "Ldji/v5/ux/flight/takeoff/TakeOffWidget$DialogType$LandingConfirmation;", "Ldji/v5/ux/flight/takeoff/TakeOffWidget$DialogType$TakeOff;", "Ldji/v5/ux/flight/takeoff/TakeOffWidget$DialogType$UnsafeToLand;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class DialogType {
        
        private DialogType() {
            super();
        }
        
        /**
         * The takeoff dialog, which is shown when the widget is clicked and the aircraft is ready
         * to take off.
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/flight/takeoff/TakeOffWidget$DialogType$TakeOff;", "Ldji/v5/ux/flight/takeoff/TakeOffWidget$DialogType;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class TakeOff extends dji.v5.ux.flight.takeoff.TakeOffWidget.DialogType {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.flight.takeoff.TakeOffWidget.DialogType.TakeOff INSTANCE = null;
            
            private TakeOff() {
                super();
            }
        }
        
        /**
         * The landing dialog, which is shown when the widget is clicked and the aircraft is ready
         * to land.
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/flight/takeoff/TakeOffWidget$DialogType$Landing;", "Ldji/v5/ux/flight/takeoff/TakeOffWidget$DialogType;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class Landing extends dji.v5.ux.flight.takeoff.TakeOffWidget.DialogType {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.flight.takeoff.TakeOffWidget.DialogType.Landing INSTANCE = null;
            
            private Landing() {
                super();
            }
        }
        
        /**
         * The landing confirmation dialog, which is shown when the aircraft has paused
         * auto-landing and is waiting for confirmation before continuing.
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/flight/takeoff/TakeOffWidget$DialogType$LandingConfirmation;", "Ldji/v5/ux/flight/takeoff/TakeOffWidget$DialogType;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class LandingConfirmation extends dji.v5.ux.flight.takeoff.TakeOffWidget.DialogType {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.flight.takeoff.TakeOffWidget.DialogType.LandingConfirmation INSTANCE = null;
            
            private LandingConfirmation() {
                super();
            }
        }
        
        /**
         * The unsafe to land dialog, which is shown when the aircraft is auto-landing and has
         * determined it is unsafe to land.
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/flight/takeoff/TakeOffWidget$DialogType$UnsafeToLand;", "Ldji/v5/ux/flight/takeoff/TakeOffWidget$DialogType;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class UnsafeToLand extends dji.v5.ux.flight.takeoff.TakeOffWidget.DialogType {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.flight.takeoff.TakeOffWidget.DialogType.UnsafeToLand INSTANCE = null;
            
            private UnsafeToLand() {
                super();
            }
        }
    }
}