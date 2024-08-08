package dji.v5.ux.core.base.panel;

import java.lang.System;

/**
 * Base class for all PanelWidgets.
 * [S] is the type of objects the panel holds.
 * [T] is the type of Widget State Update, @see[getWidgetStateUpdate].
 * A PanelWidget is a collection of widgets that can be displayed in different ways:
 * - [BarPanelWidget]
 * - [ListPanelWidget]
 * The PanelWidget can be configured with a [PanelWidgetConfiguration], which allows the user
 * to set the [PanelWidgetType] and set up a toolbar if needed.
 * It also provides helpers for the children to know the bounds of the parent:
 * - [PanelWidget.getParentTopId]
 * - [PanelWidget.getParentBottomId]
 * - [PanelWidget.getParentStartId]
 * - [PanelWidget.getParentEndId]
 *
 * Widgets in the BarPanelWidget can be customized in terms of how they are placed, e.g., using ratio,
 * wrapping content. See [PanelItem] for configuration of individual widgets.
 *
 * @param panelWidgetConfiguration * The default [PanelWidgetConfiguration].
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u00042\u00020\u0005B-\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020\u0010H\u0016J\u001f\u0010j\u001a\u00020h2\b\b\u0001\u0010k\u001a\u00020\u000b2\u0006\u0010l\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010mJ\u001b\u0010n\u001a\u00020h2\f\u0010o\u001a\b\u0012\u0004\u0012\u00028\u00000pH&\u00a2\u0006\u0002\u0010qJ\f\u0010r\u001a\b\u0012\u0004\u0012\u00020)0sJ\f\u0010t\u001a\b\u0012\u0004\u0012\u00020)0sJ\u0010\u0010u\u001a\u00020h2\u0006\u0010v\u001a\u00020wH\u0002J\b\u0010x\u001a\u00020\u000bH\u0004J\b\u0010y\u001a\u00020\u000bH\u0004J\b\u0010z\u001a\u00020\u000bH\u0004J\b\u0010{\u001a\u00020\u000bH\u0004J\u0019\u0010|\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010k\u001a\u00020\u000bH&\u00a2\u0006\u0002\u0010}J\b\u0010~\u001a\u00020hH\u0002J\u0018\u0010\u007f\u001a\u00020h2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0003J.\u0010\u0080\u0001\u001a\u00020h2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010\rH$J#\u0010\u0082\u0001\u001a\u00020h2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014J\t\u0010\u0083\u0001\u001a\u00020hH\u0014J\t\u0010\u0084\u0001\u001a\u00020hH&J\u001a\u0010\u0085\u0001\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010k\u001a\u00020\u000bH&\u00a2\u0006\u0002\u0010}J\u0012\u0010\u0086\u0001\u001a\u00020h2\u0007\u0010\u0087\u0001\u001a\u00020)H\u0002J\u0012\u0010\u0088\u0001\u001a\u00020h2\u0007\u0010\u0087\u0001\u001a\u00020)H\u0002J\u0011\u0010\u0016\u001a\u00020h2\t\b\u0001\u0010\u0089\u0001\u001a\u00020\u000bJ\u0011\u0010\u001a\u001a\u00020h2\t\b\u0001\u0010\u0089\u0001\u001a\u00020\u000bJ\u0012\u0010\u008a\u0001\u001a\u00020h2\t\b\u0001\u0010\u008b\u0001\u001a\u00020\u000bJ\u0012\u0010\u008c\u0001\u001a\u00020h2\u0007\u0010\u0087\u0001\u001a\u00020)H\u0002J\u0011\u00102\u001a\u00020h2\t\b\u0001\u0010\u0089\u0001\u001a\u00020\u000bJ\u0011\u00105\u001a\u00020h2\t\b\u0001\u0010\u0089\u0001\u001a\u00020\u000bJ\u0010\u0010\u008d\u0001\u001a\u00020h2\u0007\u0010\u008e\u0001\u001a\u00020)J\u0012\u0010\u008f\u0001\u001a\u00020h2\u0007\u0010\u0087\u0001\u001a\u00020)H\u0016J\u0014\u0010\u0090\u0001\u001a\u00020h2\t\b\u0001\u0010\u0091\u0001\u001a\u00020\u000bH\u0007J\u0012\u0010\u0092\u0001\u001a\u00020h2\t\b\u0001\u0010\u008b\u0001\u001a\u00020\u000bJ\u0012\u0010\u0093\u0001\u001a\u00020h2\t\b\u0001\u0010\u0094\u0001\u001a\u00020\u000bJ\t\u0010\u0095\u0001\u001a\u00020hH\u0002J\t\u0010\u0096\u0001\u001a\u00020hH\u0002J\t\u0010\u0097\u0001\u001a\u00020\u000bH&J\t\u0010\u0098\u0001\u001a\u00020hH$J!\u0010\u0099\u0001\u001a\u00020h*\u00030\u009a\u00012\u0006\u0010i\u001a\u00020\u00102\t\b\u0002\u0010\u009b\u0001\u001a\u00020\u000bH\u0004J!\u0010\u009c\u0001\u001a\u00020h*\u00030\u009a\u00012\u0006\u0010i\u001a\u00020\u00102\t\b\u0002\u0010\u009b\u0001\u001a\u00020\u000bH\u0004J!\u0010\u009d\u0001\u001a\u00020h*\u00030\u009a\u00012\u0006\u0010i\u001a\u00020\u00102\t\b\u0002\u0010\u009b\u0001\u001a\u00020\u000bH\u0004J!\u0010\u009e\u0001\u001a\u00020h*\u00030\u009a\u00012\u0006\u0010i\u001a\u00020\u00102\t\b\u0002\u0010\u009b\u0001\u001a\u00020\u000bH\u0004R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0018\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R.\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u000b8G@FX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010\u0011\u001a\u0004\u0018\u00010!@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010\'\u001a\b\u0012\u0004\u0012\u00020)0(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020)0(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u00100\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0015\"\u0004\b2\u0010\u0017R(\u00103\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0015\"\u0004\b5\u0010\u0017R.\u00106\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u000b8G@FX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b7\u0010\u001d\"\u0004\b8\u0010\u001fR(\u00109\u001a\u0004\u0018\u00010!2\b\u0010\u0011\u001a\u0004\u0018\u00010!@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010$\"\u0004\b;\u0010&R\u000e\u0010<\u001a\u00020/X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u00010+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010>\u001a\u00020?X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u001c\u0010B\u001a\u0004\u0018\u00010CX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0014\u0010\f\u001a\u00020\rX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u000e\u0010J\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010N\u001a\u00020\u000b2\b\b\u0001\u0010\u0011\u001a\u00020\u000b8G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0010\u0010S\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010V\u001a\u0004\u0018\u00010U2\b\u0010T\u001a\u0004\u0018\u00010U8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR.\u0010[\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u000b8G@FX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\\\u0010\u001d\"\u0004\b]\u0010\u001fR(\u0010`\u001a\u0004\u0018\u00010_2\b\u0010^\u001a\u0004\u0018\u00010_8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u0010\u0010e\u001a\u0004\u0018\u00010fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u009f\u0001"}, d2 = {"Ldji/v5/ux/core/base/panel/PanelWidget;", "S", "T", "", "Ldji/v5/ux/core/base/widget/ConstraintLayoutWidget;", "Ldji/v5/ux/core/base/panel/Navigable;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "panelWidgetConfiguration", "Ldji/v5/ux/core/base/panel/PanelWidgetConfiguration;", "(Landroid/content/Context;Landroid/util/AttributeSet;ILdji/v5/ux/core/base/panel/PanelWidgetConfiguration;)V", "backBackgroundView", "Landroid/view/View;", "value", "Landroid/graphics/drawable/Drawable;", "backButtonIcon", "getBackButtonIcon", "()Landroid/graphics/drawable/Drawable;", "setBackButtonIcon", "(Landroid/graphics/drawable/Drawable;)V", "backButtonIconBackground", "getBackButtonIconBackground", "setBackButtonIconBackground", "backButtonIconColor", "getBackButtonIconColor", "()Ljava/lang/Integer;", "setBackButtonIconColor", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "Landroid/content/res/ColorStateList;", "backButtonIconColors", "getBackButtonIconColors", "()Landroid/content/res/ColorStateList;", "setBackButtonIconColors", "(Landroid/content/res/ColorStateList;)V", "backButtonPressedProcessor", "Lio/reactivex/rxjava3/processors/PublishProcessor;", "", "backImageView", "Landroid/widget/ImageView;", "closeBackgroundView", "closeBoxPressedProcessor", "closeButtonBackgroundOnClickListener", "Landroid/view/View$OnClickListener;", "closeButtonIcon", "getCloseButtonIcon", "setCloseButtonIcon", "closeButtonIconBackground", "getCloseButtonIconBackground", "setCloseButtonIconBackground", "closeButtonIconColor", "getCloseButtonIconColor", "setCloseButtonIconColor", "closeButtonIconColors", "getCloseButtonIconColors", "setCloseButtonIconColors", "closeButtonOnClickListener", "closeImageView", "defaultRatioString", "", "getDefaultRatioString", "()Ljava/lang/String;", "panelNavigator", "Ldji/v5/ux/core/base/panel/PanelNavigator;", "getPanelNavigator", "()Ldji/v5/ux/core/base/panel/PanelNavigator;", "setPanelNavigator", "(Ldji/v5/ux/core/base/panel/PanelNavigator;)V", "getPanelWidgetConfiguration", "()Ldji/v5/ux/core/base/panel/PanelWidgetConfiguration;", "parentBottomId", "parentEndId", "parentStartId", "parentTopId", "titleBarBackgroundColor", "getTitleBarBackgroundColor", "()I", "setTitleBarBackgroundColor", "(I)V", "titleBarContainer", "text", "", "titleText", "getTitleText", "()Ljava/lang/CharSequence;", "setTitleText", "(Ljava/lang/CharSequence;)V", "titleTextColor", "getTitleTextColor", "setTitleTextColor", "textSize", "", "titleTextSize", "getTitleTextSize", "()Ljava/lang/Float;", "setTitleTextSize", "(Ljava/lang/Float;)V", "titleTextView", "Landroid/widget/TextView;", "addView", "", "view", "addWidget", "index", "item", "(ILjava/lang/Object;)V", "addWidgets", "items", "", "([Ljava/lang/Object;)V", "backButtonPressed", "Lio/reactivex/rxjava3/core/Flowable;", "closeButtonPressed", "extractAttributes", "typedArray", "Landroid/content/res/TypedArray;", "getParentBottomId", "getParentEndId", "getParentStartId", "getParentTopId", "getWidget", "(I)Ljava/lang/Object;", "hideBackButton", "initAttributes", "initPanelWidget", "widgetConfiguration", "initView", "onAttachedToWindow", "removeAllWidgets", "removeWidget", "setBackButtonClickable", "enabled", "setBackButtonEnabled", "resourceId", "setBackButtonIconColorRes", "colorRes", "setCloseButtonEnabled", "setCloseButtonVisible", "visible", "setEnabled", "setStyle", "styleRes", "setTitleBarBackgroundColorRes", "setTitleTextAppearance", "textAppearanceResId", "setUpTitleBar", "showBackButton", "size", "updateUI", "constraintToParentBottom", "Landroidx/constraintlayout/widget/ConstraintSet;", "margin", "constraintToParentEnd", "constraintToParentStart", "constraintToParentTop", "android-sdk-v5-uxsdk_debug"})
public abstract class PanelWidget<S extends java.lang.Object, T extends java.lang.Object> extends dji.v5.ux.core.base.widget.ConstraintLayoutWidget<T> implements dji.v5.ux.core.base.panel.Navigable {
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.base.panel.PanelWidgetConfiguration panelWidgetConfiguration = null;
    
    /**
     * Background color for the title bar
     */
    private int titleBarBackgroundColor = 0;
    
    /**
     * The color for the back button icon
     */
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer backButtonIconColor;
    
    /**
     * The color state list for the back button icon
     */
    @org.jetbrains.annotations.Nullable
    private android.content.res.ColorStateList backButtonIconColors;
    
    /**
     * The drawable for the back button icon's background
     */
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable backButtonIconBackground;
    
    /**
     * The drawable for the close button icon
     */
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable closeButtonIcon;
    
    /**
     * The drawable for the close button icon's background
     */
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable closeButtonIconBackground;
    
    /**
     * The color for the close button icon
     */
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer closeButtonIconColor;
    
    /**
     * The color state list for the close button icon
     */
    @org.jetbrains.annotations.Nullable
    private android.content.res.ColorStateList closeButtonIconColors;
    
    /**
     * The color for the title
     */
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer titleTextColor;
    
    /**
     * Use for navigating between panels,
     */
    @org.jetbrains.annotations.Nullable
    private dji.v5.ux.core.base.panel.PanelNavigator panelNavigator;
    
    /**
     * The default ratio [String] for panel items.
     */
    @org.jetbrains.annotations.NotNull
    private final java.lang.String defaultRatioString = null;
    private final io.reactivex.rxjava3.processors.PublishProcessor<java.lang.Boolean> backButtonPressedProcessor = null;
    private final io.reactivex.rxjava3.processors.PublishProcessor<java.lang.Boolean> closeBoxPressedProcessor = null;
    private int parentTopId = androidx.constraintlayout.widget.ConstraintSet.PARENT_ID;
    private final int parentBottomId = androidx.constraintlayout.widget.ConstraintSet.PARENT_ID;
    private final int parentStartId = androidx.constraintlayout.widget.ConstraintSet.PARENT_ID;
    private final int parentEndId = androidx.constraintlayout.widget.ConstraintSet.PARENT_ID;
    private android.view.View titleBarContainer;
    private android.widget.ImageView backImageView;
    private android.view.View backBackgroundView;
    private android.widget.ImageView closeImageView;
    private android.view.View closeBackgroundView;
    private android.widget.TextView titleTextView;
    private final android.view.View.OnClickListener closeButtonBackgroundOnClickListener = null;
    private final android.view.View.OnClickListener closeButtonOnClickListener = null;
    
    @kotlin.jvm.JvmOverloads
    public PanelWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.PanelWidgetConfiguration panelWidgetConfiguration) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public PanelWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.PanelWidgetConfiguration panelWidgetConfiguration) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public PanelWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.PanelWidgetConfiguration panelWidgetConfiguration) {
        super(null, null, 0);
    }
    
    @org.jetbrains.annotations.NotNull
    protected final dji.v5.ux.core.base.panel.PanelWidgetConfiguration getPanelWidgetConfiguration() {
        return null;
    }
    
    @androidx.annotation.ColorInt
    public final int getTitleBarBackgroundColor() {
        return 0;
    }
    
    public final void setTitleBarBackgroundColor(@androidx.annotation.ColorInt
    int value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getBackButtonIcon() {
        return null;
    }
    
    public final void setBackButtonIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.annotation.ColorInt
    public final java.lang.Integer getBackButtonIconColor() {
        return null;
    }
    
    public final void setBackButtonIconColor(@org.jetbrains.annotations.Nullable
    @androidx.annotation.ColorInt
    java.lang.Integer value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.content.res.ColorStateList getBackButtonIconColors() {
        return null;
    }
    
    public final void setBackButtonIconColors(@org.jetbrains.annotations.Nullable
    android.content.res.ColorStateList value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getBackButtonIconBackground() {
        return null;
    }
    
    public final void setBackButtonIconBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getCloseButtonIcon() {
        return null;
    }
    
    public final void setCloseButtonIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getCloseButtonIconBackground() {
        return null;
    }
    
    public final void setCloseButtonIconBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.annotation.ColorInt
    public final java.lang.Integer getCloseButtonIconColor() {
        return null;
    }
    
    public final void setCloseButtonIconColor(@org.jetbrains.annotations.Nullable
    @androidx.annotation.ColorInt
    java.lang.Integer value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.content.res.ColorStateList getCloseButtonIconColors() {
        return null;
    }
    
    public final void setCloseButtonIconColors(@org.jetbrains.annotations.Nullable
    android.content.res.ColorStateList value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.CharSequence getTitleText() {
        return null;
    }
    
    public final void setTitleText(@org.jetbrains.annotations.Nullable
    java.lang.CharSequence text) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float getTitleTextSize() {
        return null;
    }
    
    public final void setTitleTextSize(@org.jetbrains.annotations.Nullable
    java.lang.Float textSize) {
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.annotation.ColorInt
    public final java.lang.Integer getTitleTextColor() {
        return null;
    }
    
    public final void setTitleTextColor(@org.jetbrains.annotations.Nullable
    @androidx.annotation.ColorInt
    java.lang.Integer value) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public dji.v5.ux.core.base.panel.PanelNavigator getPanelNavigator() {
        return null;
    }
    
    @java.lang.Override
    public void setPanelNavigator(@org.jetbrains.annotations.Nullable
    dji.v5.ux.core.base.panel.PanelNavigator p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    protected final java.lang.String getDefaultRatioString() {
        return null;
    }
    
    @java.lang.Override
    protected void initView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
    }
    
    /**
     * Invoked during the initialization of the class.
     * Inflate should be done here. For Kotlin, load attributes, findViewById should be done in
     * the init block.
     *
     * @param context      Context
     * @param attrs        Attribute set
     * @param defStyleAttr Style attribute
     */
    protected abstract void initPanelWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr, @org.jetbrains.annotations.Nullable
    dji.v5.ux.core.base.panel.PanelWidgetConfiguration widgetConfiguration);
    
    protected abstract void updateUI();
    
    private final void setUpTitleBar() {
    }
    
    @java.lang.Override
    protected void onAttachedToWindow() {
    }
    
    /**
     * [Flowable] to observe when the back button is pressed.
     */
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<java.lang.Boolean> backButtonPressed() {
        return null;
    }
    
    /**
     * [Flowable] to observe when the close button is pressed.
     */
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<java.lang.Boolean> closeButtonPressed() {
        return null;
    }
    
    /**
     * Get the [S] at index from to the current list of widgets.
     */
    @org.jetbrains.annotations.Nullable
    public abstract S getWidget(@androidx.annotation.IntRange(from = 0L)
    int index);
    
    /**
     * Add a new [List] of [S].
     */
    public abstract void addWidgets(@org.jetbrains.annotations.NotNull
    S[] items);
    
    /**
     * Total size of [S] in the current list of widgets.
     */
    public abstract int size();
    
    /**
     * Add a [S] at [index] to the current list of widgets.
     */
    public abstract void addWidget(@androidx.annotation.IntRange(from = 0L)
    int index, S item);
    
    /**
     * Remove a [S] at [index] to the current list of widgets.
     */
    @org.jetbrains.annotations.Nullable
    public abstract S removeWidget(@androidx.annotation.IntRange(from = 0L)
    int index);
    
    /**
     * Remove all [S]s.
     */
    public abstract void removeAllWidgets();
    
    /**
     * Enable/disable close and back button
     */
    @java.lang.Override
    public void setEnabled(boolean enabled) {
    }
    
    /**
     * Set the resource ID for the title background color
     *
     * @param colorRes Integer ID of the  resource
     */
    public final void setTitleBarBackgroundColorRes(@androidx.annotation.ColorRes
    int colorRes) {
    }
    
    /**
     * Set the resource ID for the back button icon
     *
     * @param resourceId Integer ID of the drawable resource
     */
    public final void setBackButtonIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the resource ID for the back button icon's background
     *
     * @param resourceId Integer ID of the icon's background resource
     */
    public final void setBackButtonIconBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the resource ID for the back button icon's color
     *
     * @param colorRes Integer ID of the icon's background resource
     */
    public final void setBackButtonIconColorRes(@androidx.annotation.ColorRes
    int colorRes) {
    }
    
    /**
     * Set the resource ID for the close button icon
     *
     * @param resourceId Integer ID of the drawable resource
     */
    public final void setCloseButtonIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the resource ID for the back button icon's background
     *
     * @param resourceId Integer ID of the icon's background resource
     */
    public final void setCloseButtonIconBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Change the visibility of the title bar's close button.
     */
    public final void setCloseButtonVisible(boolean visible) {
    }
    
    /**
     * Set text appearance of the title text view
     *
     * @param textAppearanceResId Style resource for text appearance
     */
    public final void setTitleTextAppearance(@androidx.annotation.StyleRes
    int textAppearanceResId) {
    }
    
    @android.annotation.SuppressLint(value = {"Recycle"})
    private final void initAttributes(android.content.Context context, android.util.AttributeSet attrs) {
    }
    
    /**
     * Override the style of the panel with the [styleRes].
     */
    @android.annotation.SuppressLint(value = {"Recycle"})
    public final void setStyle(@androidx.annotation.StyleRes
    int styleRes) {
    }
    
    private final void extractAttributes(android.content.res.TypedArray typedArray) {
    }
    
    /**
     * Constrain the [view] to the top of the panel, with an optional [margin].
     */
    protected final void constraintToParentTop(@org.jetbrains.annotations.NotNull
    androidx.constraintlayout.widget.ConstraintSet $this$constraintToParentTop, @org.jetbrains.annotations.NotNull
    android.view.View view, int margin) {
    }
    
    /**
     * Constrain the [view] to the bottom of the panel, with an optional [margin].
     */
    protected final void constraintToParentBottom(@org.jetbrains.annotations.NotNull
    androidx.constraintlayout.widget.ConstraintSet $this$constraintToParentBottom, @org.jetbrains.annotations.NotNull
    android.view.View view, int margin) {
    }
    
    /**
     * Constrain the [view] to the start of the panel, with an optional [margin].
     */
    protected final void constraintToParentStart(@org.jetbrains.annotations.NotNull
    androidx.constraintlayout.widget.ConstraintSet $this$constraintToParentStart, @org.jetbrains.annotations.NotNull
    android.view.View view, int margin) {
    }
    
    /**
     * Constrain the [view] to the end of the panel, with an optional [margin].
     */
    protected final void constraintToParentEnd(@org.jetbrains.annotations.NotNull
    androidx.constraintlayout.widget.ConstraintSet $this$constraintToParentEnd, @org.jetbrains.annotations.NotNull
    android.view.View view, int margin) {
    }
    
    /**
     * Get the current parent top view id to use for constraints.
     */
    protected final int getParentTopId() {
        return 0;
    }
    
    /**
     * Get the current parent bottom view id to use for constraints.
     */
    protected final int getParentBottomId() {
        return 0;
    }
    
    /**
     * Get the current parent start view id to use for constraints.
     */
    protected final int getParentStartId() {
        return 0;
    }
    
    /**
     * Get the current parent end view id to use for constraints.
     */
    protected final int getParentEndId() {
        return 0;
    }
    
    /**
     * Add view to the panel.
     */
    @java.lang.Override
    public void addView(@org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
    
    private final void showBackButton() {
    }
    
    private final void hideBackButton() {
    }
    
    private final void setBackButtonClickable(boolean enabled) {
    }
    
    private final void setBackButtonEnabled(boolean enabled) {
    }
    
    private final void setCloseButtonEnabled(boolean enabled) {
    }
}