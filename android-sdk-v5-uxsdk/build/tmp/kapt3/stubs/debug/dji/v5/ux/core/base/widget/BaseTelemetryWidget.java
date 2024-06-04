package dji.v5.ux.core.base.widget;

import java.lang.System;

/**
 * Base class for telemetry widgets
 * @property widgetType - The [WidgetType] for the widget.
 * @property widgetTheme - Resource id for styling the widget.
 * @property defaultStyle - Resource id for style used for defining the default setup
 * of the widget.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\bC\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0002\u00a7\u0001BA\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0001\u0010\r\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000eJ\n\u0010\u008d\u0001\u001a\u00030\u008e\u0001H\u0002J\n\u0010\u008f\u0001\u001a\u00030\u008e\u0001H\u0002J\u0013\u0010\u0090\u0001\u001a\u00020*2\b\u0010\u0091\u0001\u001a\u00030\u0092\u0001H\u0004J\u001c\u0010\u0093\u0001\u001a\u00030\u008e\u00012\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0003J\u0014\u0010\u0094\u0001\u001a\u00030\u008e\u00012\b\u0010\u0095\u0001\u001a\u00030\u0096\u0001H\u0002J\u0012\u0010\u0097\u0001\u001a\u00030\u008e\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0003J$\u0010\u0098\u0001\u001a\u00030\u008e\u00012\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0014J,\u0010\u0099\u0001\u001a\u00030\u008e\u00012\u0007\u0010\u009a\u0001\u001a\u00020\t2\u0007\u0010\u009b\u0001\u001a\u00020\t2\u0007\u0010\u009c\u0001\u001a\u00020\t2\u0007\u0010\u009d\u0001\u001a\u00020\tJ\u0013\u0010\u009e\u0001\u001a\u00030\u008e\u00012\t\b\u0001\u0010\u009f\u0001\u001a\u00020\tJ\u0013\u0010\u00a0\u0001\u001a\u00030\u008e\u00012\t\b\u0001\u0010\u009f\u0001\u001a\u00020\tJ\u0012\u00101\u001a\u00030\u008e\u00012\t\b\u0001\u0010\u009f\u0001\u001a\u00020\tJ\u0013\u0010\u00a1\u0001\u001a\u00030\u008e\u00012\t\b\u0001\u0010\u00a2\u0001\u001a\u00020\tJ\u0012\u0010W\u001a\u00030\u008e\u00012\t\b\u0001\u0010\u009f\u0001\u001a\u00020\tJ\u0013\u0010\u00a3\u0001\u001a\u00030\u008e\u00012\t\b\u0001\u0010\u00a2\u0001\u001a\u00020\tJ\u0012\u0010j\u001a\u00030\u008e\u00012\t\b\u0001\u0010\u009f\u0001\u001a\u00020\tJ\u0013\u0010\u00a4\u0001\u001a\u00030\u008e\u00012\t\b\u0001\u0010\u00a2\u0001\u001a\u00020\tJ\u0013\u0010\u00a5\u0001\u001a\u00030\u008e\u00012\u0007\u0010\u00a6\u0001\u001a\u000203H\u0004R$\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R$\u0010\u0018\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R$\u0010\u001b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u0014\u0010\r\u001a\u00020\tX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012R\u001e\u0010\u001f\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\u0014R\u000e\u0010\"\u001a\u00020#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010)\u001a\u00020*X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b+\u0010,R(\u0010.\u001a\u0004\u0018\u00010-2\b\u0010\u000f\u001a\u0004\u0018\u00010-8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R(\u00104\u001a\u0004\u0018\u0001032\b\u0010\u000f\u001a\u0004\u0018\u0001038G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R&\u00109\u001a\u00020\t2\b\b\u0001\u0010\u000f\u001a\u00020\t8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b:\u0010\u0012\"\u0004\b;\u0010\u0014R(\u0010=\u001a\u0004\u0018\u00010<2\b\u0010\u000f\u001a\u0004\u0018\u00010<8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR&\u0010C\u001a\u00020B2\b\b\u0001\u0010\u000f\u001a\u00020B8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u000e\u0010H\u001a\u00020IX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010K\u001a\u00020J2\u0006\u0010\u000f\u001a\u00020J8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0012\u0010P\u001a\u00020*X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\bQ\u0010,R\u001e\u0010R\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u0012\"\u0004\bT\u0010\u0014R(\u0010U\u001a\u0004\u0018\u00010-2\b\u0010\u000f\u001a\u0004\u0018\u00010-8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bV\u00100\"\u0004\bW\u00102R(\u0010X\u001a\u0004\u0018\u0001032\b\u0010\u000f\u001a\u0004\u0018\u0001038G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bY\u00106\"\u0004\bZ\u00108R&\u0010[\u001a\u00020\t2\b\b\u0001\u0010\u000f\u001a\u00020\t8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\\\u0010\u0012\"\u0004\b]\u0010\u0014R(\u0010^\u001a\u0004\u0018\u00010<2\b\u0010\u000f\u001a\u0004\u0018\u00010<8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b_\u0010?\"\u0004\b`\u0010AR&\u0010a\u001a\u00020B2\b\b\u0001\u0010\u000f\u001a\u00020B8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bb\u0010E\"\u0004\bc\u0010GR\u000e\u0010d\u001a\u00020IX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010e\u001a\u00020J2\u0006\u0010\u000f\u001a\u00020J8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bf\u0010M\"\u0004\bg\u0010OR(\u0010h\u001a\u0004\u0018\u00010-2\b\u0010\u000f\u001a\u0004\u0018\u00010-8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bi\u00100\"\u0004\bj\u00102R(\u0010k\u001a\u0004\u0018\u0001032\b\u0010\u000f\u001a\u0004\u0018\u0001038G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bl\u00106\"\u0004\bm\u00108R&\u0010n\u001a\u00020\t2\b\b\u0001\u0010\u000f\u001a\u00020\t8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bo\u0010\u0012\"\u0004\bp\u0010\u0014R(\u0010q\u001a\u0004\u0018\u00010<2\b\u0010\u000f\u001a\u0004\u0018\u00010<8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\br\u0010?\"\u0004\bs\u0010AR$\u0010t\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bu\u0010\u0012\"\u0004\bv\u0010\u0014R&\u0010w\u001a\u00020B2\b\b\u0001\u0010\u000f\u001a\u00020B8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bx\u0010E\"\u0004\by\u0010GR\u000e\u0010z\u001a\u00020IX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010{\u001a\u00020J2\u0006\u0010\u000f\u001a\u00020J8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b|\u0010M\"\u0004\b}\u0010OR+\u0010~\u001a\u0004\u0018\u00010-2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010-8F@FX\u0086\u000e\u00a2\u0006\r\u001a\u0004\b\u007f\u00100\"\u0005\b\u0080\u0001\u00102R-\u0010\u0081\u0001\u001a\u0004\u0018\u00010-2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010-8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0082\u0001\u00100\"\u0005\b\u0083\u0001\u00102R+\u0010\u0084\u0001\u001a\u00020\t2\b\b\u0001\u0010\u000f\u001a\u00020\t8G@FX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010\u0012\"\u0005\b\u0086\u0001\u0010\u0014R\'\u0010\u0087\u0001\u001a\u00020J2\u0006\u0010\u000f\u001a\u00020J8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0088\u0001\u0010M\"\u0005\b\u0089\u0001\u0010OR\u0015\u0010\f\u001a\u00020\tX\u0084\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008a\u0001\u0010\u0012R\u0013\u0010\n\u001a\u00020\u000b\u00a2\u0006\n\n\u0000\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\u00a8\u0006\u00a8\u0001"}, d2 = {"Ldji/v5/ux/core/base/widget/BaseTelemetryWidget;", "T", "", "Ldji/v5/ux/core/base/widget/ConstraintLayoutWidget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "widgetType", "Ldji/v5/ux/core/base/widget/BaseTelemetryWidget$WidgetType;", "widgetTheme", "defaultStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;ILdji/v5/ux/core/base/widget/BaseTelemetryWidget$WidgetType;II)V", "value", "contentPaddingBottom", "getContentPaddingBottom", "()I", "setContentPaddingBottom", "(I)V", "contentPaddingLeft", "getContentPaddingLeft", "setContentPaddingLeft", "contentPaddingRight", "getContentPaddingRight", "setContentPaddingRight", "contentPaddingTop", "getContentPaddingTop", "setContentPaddingTop", "getDefaultStyle", "errorValueColor", "getErrorValueColor", "setErrorValueColor", "guidelineBottom", "Landroidx/constraintlayout/widget/Guideline;", "guidelineLeft", "guidelineRight", "guidelineTop", "imageView", "Landroid/widget/ImageView;", "imperialDecimalFormat", "Ljava/text/DecimalFormat;", "getImperialDecimalFormat", "()Ljava/text/DecimalFormat;", "Landroid/graphics/drawable/Drawable;", "labelBackground", "getLabelBackground", "()Landroid/graphics/drawable/Drawable;", "setLabelBackground", "(Landroid/graphics/drawable/Drawable;)V", "", "labelString", "getLabelString", "()Ljava/lang/String;", "setLabelString", "(Ljava/lang/String;)V", "labelTextColor", "getLabelTextColor", "setLabelTextColor", "Landroid/content/res/ColorStateList;", "labelTextColors", "getLabelTextColors", "()Landroid/content/res/ColorStateList;", "setLabelTextColors", "(Landroid/content/res/ColorStateList;)V", "", "labelTextSize", "getLabelTextSize", "()F", "setLabelTextSize", "(F)V", "labelTextView", "Landroid/widget/TextView;", "", "labelVisibility", "getLabelVisibility", "()Z", "setLabelVisibility", "(Z)V", "metricDecimalFormat", "getMetricDecimalFormat", "normalValueColor", "getNormalValueColor", "setNormalValueColor", "unitBackground", "getUnitBackground", "setUnitBackground", "unitString", "getUnitString", "setUnitString", "unitTextColor", "getUnitTextColor", "setUnitTextColor", "unitTextColors", "getUnitTextColors", "setUnitTextColors", "unitTextSize", "getUnitTextSize", "setUnitTextSize", "unitTextView", "unitVisibility", "getUnitVisibility", "setUnitVisibility", "valueBackground", "getValueBackground", "setValueBackground", "valueString", "getValueString", "setValueString", "valueTextColor", "getValueTextColor", "setValueTextColor", "valueTextColors", "getValueTextColors", "setValueTextColors", "valueTextGravity", "getValueTextGravity", "setValueTextGravity", "valueTextSize", "getValueTextSize", "setValueTextSize", "valueTextView", "valueVisibility", "getValueVisibility", "setValueVisibility", "widgetIcon", "getWidgetIcon", "setWidgetIcon", "widgetIconBackground", "getWidgetIconBackground", "setWidgetIconBackground", "widgetIconColor", "getWidgetIconColor", "setWidgetIconColor", "widgetIconVisibility", "getWidgetIconVisibility", "setWidgetIconVisibility", "getWidgetTheme", "getWidgetType", "()Ldji/v5/ux/core/base/widget/BaseTelemetryWidget$WidgetType;", "configureLeftImageTypeWidget", "", "configureRightImageTypeWidget", "getDecimalFormat", "unitType", "Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "initAttributes", "initAttributesByTypedArray", "typedArray", "Landroid/content/res/TypedArray;", "initBaseTelemetryAttributes", "initView", "setContentPadding", "left", "top", "right", "bottom", "setIcon", "resourceId", "setIconBackground", "setLabelTextAppearance", "textAppearanceResId", "setUnitTextAppearance", "setValueTextAppearance", "setValueTextViewMinWidthByText", "maxText", "WidgetType", "android-sdk-v5-uxsdk_debug"})
public abstract class BaseTelemetryWidget<T extends java.lang.Object> extends dji.v5.ux.core.base.widget.ConstraintLayoutWidget<T> {
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.base.widget.BaseTelemetryWidget.WidgetType widgetType = null;
    private final int widgetTheme = 0;
    private final int defaultStyle = 0;
    private final androidx.constraintlayout.widget.Guideline guidelineLeft = null;
    private final androidx.constraintlayout.widget.Guideline guidelineTop = null;
    private final androidx.constraintlayout.widget.Guideline guidelineRight = null;
    private final androidx.constraintlayout.widget.Guideline guidelineBottom = null;
    private final android.widget.TextView labelTextView = null;
    private final android.widget.TextView valueTextView = null;
    private final android.widget.TextView unitTextView = null;
    private final android.widget.ImageView imageView = null;
    
    /**
     * Color of the value is in error state
     */
    @androidx.annotation.ColorInt
    private int errorValueColor;
    
    /**
     * Color of the value is in normal state
     */
    @androidx.annotation.ColorInt
    private int normalValueColor;
    
    /**
     * Left padding of the list item content
     */
    private int contentPaddingLeft;
    
    /**
     * Top padding of the list item content
     */
    private int contentPaddingTop;
    
    /**
     * Right padding of the list item content
     */
    private int contentPaddingRight;
    
    /**
     * Bottom padding of the list item content
     */
    private int contentPaddingBottom;
    
    /**
     * The color of the icon
     */
    private int widgetIconColor;
    
    @kotlin.jvm.JvmOverloads
    public BaseTelemetryWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.widget.BaseTelemetryWidget.WidgetType widgetType, @androidx.annotation.StyleRes
    int defaultStyle) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public BaseTelemetryWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.widget.BaseTelemetryWidget.WidgetType widgetType, int widgetTheme, @androidx.annotation.StyleRes
    int defaultStyle) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public BaseTelemetryWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.widget.BaseTelemetryWidget.WidgetType widgetType, @androidx.annotation.StyleRes
    int defaultStyle) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public BaseTelemetryWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.widget.BaseTelemetryWidget.WidgetType widgetType, @androidx.annotation.StyleRes
    int defaultStyle) {
        super(null, null, 0);
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.base.widget.BaseTelemetryWidget.WidgetType getWidgetType() {
        return null;
    }
    
    protected final int getWidgetTheme() {
        return 0;
    }
    
    protected final int getDefaultStyle() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    protected abstract java.text.DecimalFormat getMetricDecimalFormat();
    
    @org.jetbrains.annotations.NotNull
    protected abstract java.text.DecimalFormat getImperialDecimalFormat();
    
    public final int getErrorValueColor() {
        return 0;
    }
    
    public final void setErrorValueColor(int p0) {
    }
    
    public final int getNormalValueColor() {
        return 0;
    }
    
    public final void setNormalValueColor(int p0) {
    }
    
    public final int getContentPaddingLeft() {
        return 0;
    }
    
    public final void setContentPaddingLeft(int value) {
    }
    
    public final int getContentPaddingTop() {
        return 0;
    }
    
    public final void setContentPaddingTop(int value) {
    }
    
    public final int getContentPaddingRight() {
        return 0;
    }
    
    public final void setContentPaddingRight(int value) {
    }
    
    public final int getContentPaddingBottom() {
        return 0;
    }
    
    public final void setContentPaddingBottom(int value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getWidgetIcon() {
        return null;
    }
    
    public final void setWidgetIcon(@org.jetbrains.annotations.Nullable
    @androidx.annotation.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @androidx.annotation.ColorInt
    public final int getWidgetIconColor() {
        return 0;
    }
    
    public final void setWidgetIconColor(@androidx.annotation.ColorInt
    int value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getWidgetIconBackground() {
        return null;
    }
    
    public final void setWidgetIconBackground(@org.jetbrains.annotations.Nullable
    @androidx.annotation.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    public final boolean getWidgetIconVisibility() {
        return false;
    }
    
    public final void setWidgetIconVisibility(boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.annotation.Nullable
    public final java.lang.String getLabelString() {
        return null;
    }
    
    public final void setLabelString(@org.jetbrains.annotations.Nullable
    java.lang.String value) {
    }
    
    @androidx.annotation.Dimension
    public final float getLabelTextSize() {
        return 0.0F;
    }
    
    public final void setLabelTextSize(@androidx.annotation.Dimension
    float value) {
    }
    
    @androidx.annotation.ColorInt
    public final int getLabelTextColor() {
        return 0;
    }
    
    public final void setLabelTextColor(@androidx.annotation.ColorInt
    int value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.content.res.ColorStateList getLabelTextColors() {
        return null;
    }
    
    public final void setLabelTextColors(@org.jetbrains.annotations.Nullable
    android.content.res.ColorStateList value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getLabelBackground() {
        return null;
    }
    
    public final void setLabelBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    public final boolean getLabelVisibility() {
        return false;
    }
    
    public final void setLabelVisibility(boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.annotation.Nullable
    public final java.lang.String getValueString() {
        return null;
    }
    
    public final void setValueString(@org.jetbrains.annotations.Nullable
    java.lang.String value) {
    }
    
    @androidx.annotation.Dimension
    public final float getValueTextSize() {
        return 0.0F;
    }
    
    public final void setValueTextSize(@androidx.annotation.Dimension
    float value) {
    }
    
    @androidx.annotation.ColorInt
    public final int getValueTextColor() {
        return 0;
    }
    
    public final void setValueTextColor(@androidx.annotation.ColorInt
    int value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.content.res.ColorStateList getValueTextColors() {
        return null;
    }
    
    public final void setValueTextColors(@org.jetbrains.annotations.Nullable
    android.content.res.ColorStateList value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getValueBackground() {
        return null;
    }
    
    public final void setValueBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    public final boolean getValueVisibility() {
        return false;
    }
    
    public final void setValueVisibility(boolean value) {
    }
    
    public final int getValueTextGravity() {
        return 0;
    }
    
    public final void setValueTextGravity(int value) {
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.annotation.Nullable
    public final java.lang.String getUnitString() {
        return null;
    }
    
    public final void setUnitString(@org.jetbrains.annotations.Nullable
    java.lang.String value) {
    }
    
    @androidx.annotation.Dimension
    public final float getUnitTextSize() {
        return 0.0F;
    }
    
    public final void setUnitTextSize(@androidx.annotation.Dimension
    float value) {
    }
    
    @androidx.annotation.ColorInt
    public final int getUnitTextColor() {
        return 0;
    }
    
    public final void setUnitTextColor(@androidx.annotation.ColorInt
    int value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.content.res.ColorStateList getUnitTextColors() {
        return null;
    }
    
    public final void setUnitTextColors(@org.jetbrains.annotations.Nullable
    android.content.res.ColorStateList value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getUnitBackground() {
        return null;
    }
    
    public final void setUnitBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    public final boolean getUnitVisibility() {
        return false;
    }
    
    public final void setUnitVisibility(boolean value) {
    }
    
    @java.lang.Override
    protected void initView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
    }
    
    @android.annotation.SuppressLint(value = {"Recycle"})
    private final void initBaseTelemetryAttributes(android.content.Context context) {
    }
    
    @android.annotation.SuppressLint(value = {"Recycle"})
    private final void initAttributes(android.content.Context context, android.util.AttributeSet attrs) {
    }
    
    private final void initAttributesByTypedArray(android.content.res.TypedArray typedArray) {
    }
    
    private final void configureLeftImageTypeWidget() {
    }
    
    private final void configureRightImageTypeWidget() {
    }
    
    protected final void setValueTextViewMinWidthByText(@org.jetbrains.annotations.NotNull
    java.lang.String maxText) {
    }
    
    @org.jetbrains.annotations.NotNull
    protected final java.text.DecimalFormat getDecimalFormat(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
        return null;
    }
    
    /**
     * Set the icon
     *
     * @param resourceId Integer ID of the background resource
     */
    public final void setIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the background of the icon
     *
     * @param resourceId Integer ID of the background resource
     */
    public final void setIconBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the background of the label
     *
     * @param resourceId Integer ID of the background resource
     */
    public final void setLabelBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the text appearance of the label
     *
     * @param textAppearanceResId Style resource for text appearance
     */
    public final void setLabelTextAppearance(@androidx.annotation.StyleRes
    int textAppearanceResId) {
    }
    
    /**
     * Set the background of the value
     *
     * @param resourceId Integer ID of the background resource
     */
    public final void setValueBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the text appearance of the value
     *
     * @param textAppearanceResId Style resource for text appearance
     */
    public final void setValueTextAppearance(@androidx.annotation.StyleRes
    int textAppearanceResId) {
    }
    
    /**
     * Set the background of the unit
     *
     * @param resourceId Integer ID of the background resource
     */
    public final void setUnitBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the text appearance of the unit
     *
     * @param textAppearanceResId Style resource for text appearance
     */
    public final void setUnitTextAppearance(@androidx.annotation.StyleRes
    int textAppearanceResId) {
    }
    
    /**
     * Set padding to the content of the  item
     */
    public final void setContentPadding(int left, int top, int right, int bottom) {
    }
    
    /**
     * Defines the type of widget
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Ldji/v5/ux/core/base/widget/BaseTelemetryWidget$WidgetType;", "", "(Ljava/lang/String;I)V", "TEXT", "TEXT_IMAGE_LEFT", "TEXT_IMAGE_RIGHT", "android-sdk-v5-uxsdk_debug"})
    public static enum WidgetType {
        /*public static final*/ TEXT /* = new TEXT() */,
        /*public static final*/ TEXT_IMAGE_LEFT /* = new TEXT_IMAGE_LEFT() */,
        /*public static final*/ TEXT_IMAGE_RIGHT /* = new TEXT_IMAGE_RIGHT() */;
        
        WidgetType() {
        }
    }
}