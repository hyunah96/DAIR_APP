package dji.v5.ux.core.base.panel;

import java.lang.System;

/**
 * Base class for [BarPanelWidget]s. A BarPanelWidget is a collection of simple widgets that
 * can be grouped together in two orientations:
 * [BarPanelWidgetOrientation.VERTICAL] or [BarPanelWidgetOrientation.HORIZONTAL].
 * This type of [PanelWidget] is primarily used for the application's top bar or similarly sized
 * widgets.
 * The BarPanelWidget is split into two lists: left and right (in vertical orientation left is
 * equivalent to top and right to bottom.)
 * BarPanelWidgets don't have title bars or close bars.
 * To initialize the BarPanelWidget, pass a list of [PanelItem] using [BarPanelWidget.addLeftWidgets]
 * and/or [BarPanelWidget.addRightWidgets].
 *
 * Note that child widgets are not created dynamically, instead they are created when the
 * BarPanelWidget is created.
 *
 * @property orientation The current BarPanelWidget orientation.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001xB-\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u0018\u00109\u001a\u00020:2\b\b\u0001\u0010;\u001a\u00020\n2\u0006\u0010<\u001a\u00020\u0004J\u0019\u0010=\u001a\u00020:2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040?\u00a2\u0006\u0002\u0010@J)\u0010A\u001a\u00020:2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00040?2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00040-H\u0002\u00a2\u0006\u0002\u0010DJ\u0018\u0010E\u001a\u00020:2\b\b\u0001\u0010;\u001a\u00020\n2\u0006\u0010<\u001a\u00020\u0004J\u0019\u0010F\u001a\u00020:2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040?\u00a2\u0006\u0002\u0010@J\u001b\u0010G\u001a\u00020:2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040?H\u0004\u00a2\u0006\u0002\u0010@J\u001a\u0010H\u001a\u00020:2\b\b\u0001\u0010;\u001a\u00020\n2\u0006\u0010I\u001a\u00020\u0004H\u0016J\u001b\u0010J\u001a\u00020:2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040?H\u0016\u00a2\u0006\u0002\u0010@J0\u0010K\u001a\u00020:2\u0006\u0010L\u001a\u00020M2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040-2\b\b\u0001\u0010;\u001a\u00020\n2\u0006\u0010N\u001a\u00020OH\u0002J.\u0010P\u001a\u00020:2\u0006\u0010L\u001a\u00020M2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040-2\u0006\u0010Q\u001a\u00020\n2\u0006\u0010R\u001a\u00020OH\u0002J.\u0010S\u001a\u00020:2\u0006\u0010L\u001a\u00020M2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040-2\u0006\u0010Q\u001a\u00020\n2\u0006\u0010R\u001a\u00020OH\u0002J\u001e\u0010T\u001a\u00020\n2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040-2\u0006\u0010;\u001a\u00020\nH\u0002J\u0012\u0010U\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010;\u001a\u00020\nJ\"\u0010U\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010;\u001a\u00020\n2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040-H\u0002J\u0012\u0010V\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010;\u001a\u00020\nJ\u0010\u0010W\u001a\u00020\n2\u0006\u0010;\u001a\u00020\nH\u0002J\u0014\u0010X\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010;\u001a\u00020\nH\u0016J\u0010\u0010Y\u001a\u00020:2\u0006\u0010\u0007\u001a\u00020\bH\u0015J(\u0010Z\u001a\u00020:2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040-2\u0006\u0010<\u001a\u00020\u00042\b\b\u0001\u0010[\u001a\u00020\nH\u0002J\u0012\u0010\\\u001a\u00020O2\b\b\u0001\u0010;\u001a\u00020\nH\u0004J \u0010]\u001a\u00020O2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00040-2\b\b\u0001\u0010;\u001a\u00020\nH\u0004J\u0006\u0010_\u001a\u00020\nJ\u0006\u0010`\u001a\u00020:J\u0016\u0010a\u001a\u00020:2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040-H\u0002J\u0006\u0010b\u001a\u00020:J\b\u0010c\u001a\u00020:H\u0016J\u0012\u0010d\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010;\u001a\u00020\nJ\"\u0010e\u001a\u0004\u0018\u00010\u00042\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040-2\b\b\u0001\u0010[\u001a\u00020\nH\u0002J\u0012\u0010f\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010;\u001a\u00020\nJ\u0014\u0010g\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010;\u001a\u00020\nH\u0016J\u0006\u0010h\u001a\u00020\nJ&\u0010i\u001a\u00020:2\u0006\u0010L\u001a\u00020M2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040-2\u0006\u0010j\u001a\u00020\u000fH\u0002J\u001e\u0010i\u001a\u00020:2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040-2\u0006\u0010j\u001a\u00020\u000fH\u0002J&\u0010k\u001a\u00020:2\u0006\u0010L\u001a\u00020M2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040-2\u0006\u0010l\u001a\u00020\nH\u0002J\u001e\u0010k\u001a\u00020:2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040-2\u0006\u0010l\u001a\u00020\nH\u0002J\b\u0010m\u001a\u00020:H\u0002J\b\u0010n\u001a\u00020\nH\u0016J\b\u0010o\u001a\u00020:H\u0014J\f\u0010p\u001a\u00020\n*\u00020\u0004H\u0002J\f\u0010q\u001a\u00020\n*\u00020\u0004H\u0002J\f\u0010r\u001a\u00020\n*\u00020\u0004H\u0002J\f\u0010s\u001a\u00020\n*\u00020\u0004H\u0002J\f\u0010t\u001a\u00020O*\u00020uH\u0002J\f\u0010v\u001a\u00020\n*\u00020\nH\u0003J\f\u0010w\u001a\u00020O*\u00020uH\u0002R&\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8\u0006@FX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n8\u0006@FX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R&\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n8\u0006@FX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R&\u0010\u001d\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n8\u0006@FX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R&\u0010 \u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n8\u0006@FX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R&\u0010#\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n8\u0006@FX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R&\u0010&\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8\u0006@FX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0012\"\u0004\b(\u0010\u0014R&\u0010)\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n8\u0006@FX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010\u0019R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R&\u00102\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8\u0006@FX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0012\"\u0004\b4\u0010\u0014R&\u00105\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n8\u0006@FX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0017\"\u0004\b7\u0010\u0019R\u0014\u00108\u001a\b\u0012\u0004\u0012\u00020\u00040-X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006y"}, d2 = {"Ldji/v5/ux/core/base/panel/BarPanelWidget;", "T", "", "Ldji/v5/ux/core/base/panel/PanelWidget;", "Ldji/v5/ux/core/base/panel/PanelItem;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "orientation", "Ldji/v5/ux/core/base/panel/BarPanelWidget$BarPanelWidgetOrientation;", "(Landroid/content/Context;Landroid/util/AttributeSet;ILdji/v5/ux/core/base/panel/BarPanelWidget$BarPanelWidgetOrientation;)V", "value", "", "guidelinePercent", "getGuidelinePercent", "()F", "setGuidelinePercent", "(F)V", "itemSpacing", "getItemSpacing", "()I", "setItemSpacing", "(I)V", "itemsMarginBottom", "getItemsMarginBottom", "setItemsMarginBottom", "itemsMarginLeft", "getItemsMarginLeft", "setItemsMarginLeft", "itemsMarginRight", "getItemsMarginRight", "setItemsMarginRight", "itemsMarginTop", "getItemsMarginTop", "setItemsMarginTop", "leftBias", "getLeftBias", "setLeftBias", "leftChainStyle", "getLeftChainStyle", "setLeftChainStyle", "leftPanelItems", "", "midGuideline", "Landroidx/constraintlayout/widget/Guideline;", "getOrientation", "()Ldji/v5/ux/core/base/panel/BarPanelWidget$BarPanelWidgetOrientation;", "rightBias", "getRightBias", "setRightBias", "rightChainStyle", "getRightChainStyle", "setRightChainStyle", "rightPanelItems", "addLeftWidget", "", "index", "panelItem", "addLeftWidgets", "panelItems", "", "([Ldji/v5/ux/core/base/panel/PanelItem;)V", "addPanelItems", "fromPanelItems", "toPanelItems", "([Ldji/v5/ux/core/base/panel/PanelItem;Ljava/util/List;)V", "addRightWidget", "addRightWidgets", "addViews", "addWidget", "item", "addWidgets", "connectPanelItem", "constraintSet", "Landroidx/constraintlayout/widget/ConstraintSet;", "isLeftSide", "", "connectToNextView", "currentIndex", "isLeft", "connectToPreviousView", "getEndBottomMargin", "getLeftWidget", "getRightWidget", "getStartTopMargin", "getWidget", "initAttributes", "insertPanelItem", "atIndex", "isFirstItem", "isLastItem", "list", "leftWidgetsSize", "removeAllLeftWidgets", "removeAllPanelItem", "removeAllRightWidgets", "removeAllWidgets", "removeLeftWidget", "removePanelItem", "removeRightWidget", "removeWidget", "rightWidgetsSize", "setChainBias", "bias", "setChainStyle", "chainStyle", "setUpContainers", "size", "updateUI", "getDefaultItemMarginBottom", "getDefaultItemMarginLeft", "getDefaultItemMarginRight", "getDefaultItemMarginTop", "heightShouldWrap", "Ldji/v5/ux/core/base/WidgetSizeDescription;", "toChainStyle", "widthShouldWrap", "BarPanelWidgetOrientation", "android-sdk-v5-uxsdk_debug"})
public abstract class BarPanelWidget<T extends java.lang.Object> extends dji.v5.ux.core.base.panel.PanelWidget<dji.v5.ux.core.base.panel.PanelItem, T> {
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.base.panel.BarPanelWidget.BarPanelWidgetOrientation orientation = null;
    
    /**
     * Margin for the left side of the BarPanelWidget.
     */
    @androidx.annotation.IntRange(from = 0L)
    private int itemsMarginLeft = 0;
    
    /**
     * Margin for the top side of the BarPanelWidget.
     */
    @androidx.annotation.IntRange(from = 0L)
    private int itemsMarginTop = 0;
    
    /**
     * Margin for the right side of the BarPanelWidget.
     */
    @androidx.annotation.IntRange(from = 0L)
    private int itemsMarginRight = 0;
    
    /**
     * Margin for the bottom side of the BarPanelWidget.
     */
    @androidx.annotation.IntRange(from = 0L)
    private int itemsMarginBottom = 0;
    
    /**
     * The spacing between the [PanelItem]s inserted.
     */
    @androidx.annotation.IntRange(from = 0L)
    private int itemSpacing = 0;
    
    /**
     * The bias for the left section of the BarPanelWidget. 0 aligns items to the left/top.
     * Left items are aligned to the left (0) by default.
     */
    @androidx.annotation.FloatRange(from = 0.0, to = 1.0)
    private float leftBias = 0.0F;
    
    /**
     * The bias for the right section of the BarPanelWidget. 0 aligns items to the left/top.
     * Right items are aligned to the right (1) by default.
     */
    @androidx.annotation.FloatRange(from = 0.0, to = 1.0)
    private float rightBias = 1.0F;
    
    /**
     * The chain style for the left section of the BarPanelWidget.
     * [ConstraintSet.CHAIN_PACKED] is used by default.
     */
    @androidx.annotation.IntRange(from = 0L, to = 2L)
    private int leftChainStyle = androidx.constraintlayout.widget.ConstraintSet.CHAIN_PACKED;
    
    /**
     * The chain style for the right section of the BarPanelWidget.
     * [ConstraintSet.CHAIN_PACKED] is used by default.
     */
    @androidx.annotation.IntRange(from = 0L, to = 2L)
    private int rightChainStyle = androidx.constraintlayout.widget.ConstraintSet.CHAIN_PACKED;
    
    /**
     * The percentage between the left and the right.
     * 0.5 distributes both sides equally.
     */
    @androidx.annotation.FloatRange(from = 0.0, to = 1.0)
    private float guidelinePercent = 0.5F;
    private java.util.List<dji.v5.ux.core.base.panel.PanelItem> leftPanelItems;
    private java.util.List<dji.v5.ux.core.base.panel.PanelItem> rightPanelItems;
    private final androidx.constraintlayout.widget.Guideline midGuideline = null;
    
    @kotlin.jvm.JvmOverloads
    public BarPanelWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.BarPanelWidget.BarPanelWidgetOrientation orientation) {
        super(null, null, 0, null);
    }
    
    @kotlin.jvm.JvmOverloads
    public BarPanelWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.BarPanelWidget.BarPanelWidgetOrientation orientation) {
        super(null, null, 0, null);
    }
    
    @kotlin.jvm.JvmOverloads
    public BarPanelWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.BarPanelWidget.BarPanelWidgetOrientation orientation) {
        super(null, null, 0, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.base.panel.BarPanelWidget.BarPanelWidgetOrientation getOrientation() {
        return null;
    }
    
    public final int getItemsMarginLeft() {
        return 0;
    }
    
    public final void setItemsMarginLeft(int value) {
    }
    
    public final int getItemsMarginTop() {
        return 0;
    }
    
    public final void setItemsMarginTop(int value) {
    }
    
    public final int getItemsMarginRight() {
        return 0;
    }
    
    public final void setItemsMarginRight(int value) {
    }
    
    public final int getItemsMarginBottom() {
        return 0;
    }
    
    public final void setItemsMarginBottom(int value) {
    }
    
    public final int getItemSpacing() {
        return 0;
    }
    
    public final void setItemSpacing(int value) {
    }
    
    public final float getLeftBias() {
        return 0.0F;
    }
    
    public final void setLeftBias(float value) {
    }
    
    public final float getRightBias() {
        return 0.0F;
    }
    
    public final void setRightBias(float value) {
    }
    
    public final int getLeftChainStyle() {
        return 0;
    }
    
    public final void setLeftChainStyle(int value) {
    }
    
    public final int getRightChainStyle() {
        return 0;
    }
    
    public final void setRightChainStyle(int value) {
    }
    
    public final float getGuidelinePercent() {
        return 0.0F;
    }
    
    public final void setGuidelinePercent(float value) {
    }
    
    private final void setUpContainers() {
    }
    
    @android.annotation.SuppressLint(value = {"Recycle"})
    protected void initAttributes(@org.jetbrains.annotations.NotNull
    android.util.AttributeSet attrs) {
    }
    
    @java.lang.Override
    protected void updateUI() {
    }
    
    private final void connectPanelItem(androidx.constraintlayout.widget.ConstraintSet constraintSet, java.util.List<dji.v5.ux.core.base.panel.PanelItem> panelItems, @androidx.annotation.IntRange(from = 0L)
    int index, boolean isLeftSide) {
    }
    
    private final void connectToPreviousView(androidx.constraintlayout.widget.ConstraintSet constraintSet, java.util.List<dji.v5.ux.core.base.panel.PanelItem> panelItems, int currentIndex, boolean isLeft) {
    }
    
    private final void connectToNextView(androidx.constraintlayout.widget.ConstraintSet constraintSet, java.util.List<dji.v5.ux.core.base.panel.PanelItem> panelItems, int currentIndex, boolean isLeft) {
    }
    
    private final void setChainStyle(java.util.List<dji.v5.ux.core.base.panel.PanelItem> panelItems, int chainStyle) {
    }
    
    private final void setChainStyle(androidx.constraintlayout.widget.ConstraintSet constraintSet, java.util.List<dji.v5.ux.core.base.panel.PanelItem> panelItems, int chainStyle) {
    }
    
    private final void setChainBias(java.util.List<dji.v5.ux.core.base.panel.PanelItem> panelItems, float bias) {
    }
    
    private final void setChainBias(androidx.constraintlayout.widget.ConstraintSet constraintSet, java.util.List<dji.v5.ux.core.base.panel.PanelItem> panelItems, float bias) {
    }
    
    @org.jetbrains.annotations.Nullable
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.UnsupportedOperationException.class})
    @java.lang.Override
    public dji.v5.ux.core.base.panel.PanelItem getWidget(@androidx.annotation.IntRange(from = 0L)
    int index) throws java.lang.UnsupportedOperationException {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.UnsupportedOperationException.class})
    @java.lang.Override
    public void addWidgets(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.PanelItem[] panelItems) throws java.lang.UnsupportedOperationException {
    }
    
    /**
     * Total number of [PanelItem]s inside this [BarPanelWidget]. Includes left and right lists.
     */
    @java.lang.Override
    public int size() {
        return 0;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.UnsupportedOperationException.class})
    @java.lang.Override
    public void addWidget(@androidx.annotation.IntRange(from = 0L)
    int index, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.PanelItem item) throws java.lang.UnsupportedOperationException {
    }
    
    @org.jetbrains.annotations.Nullable
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.UnsupportedOperationException.class})
    @java.lang.Override
    public dji.v5.ux.core.base.panel.PanelItem removeWidget(@androidx.annotation.IntRange(from = 0L)
    int index) throws java.lang.UnsupportedOperationException {
        return null;
    }
    
    /**
     * Remove all [PanelItem]s from both left and right lists of this BarPanelWidget.
     */
    @java.lang.Override
    public void removeAllWidgets() {
    }
    
    /**
     * Get [PanelItem] from the left list of this BarPanelWidget.
     * [index] 0, is the first position of the left list.
     */
    @org.jetbrains.annotations.Nullable
    public final dji.v5.ux.core.base.panel.PanelItem getLeftWidget(@androidx.annotation.IntRange(from = 0L)
    int index) {
        return null;
    }
    
    /**
     * Append an array of [PanelItem]s to the left list of this BarPanelWidget.
     * The items should be unique and not be present in this BarPanelWidget already.
     */
    public final void addLeftWidgets(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.PanelItem[] panelItems) {
    }
    
    /**
     * Total number of [PanelItem]s inside the left list of this [BarPanelWidget].
     */
    public final int leftWidgetsSize() {
        return 0;
    }
    
    /**
     * Insert a [PanelItem] at the given index to the left list of this BarPanelWidget.
     * [index] 0, is the first position of the left list.
     */
    public final void addLeftWidget(@androidx.annotation.IntRange(from = 0L)
    int index, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.PanelItem panelItem) {
    }
    
    /**
     * Remove a [PanelItem] at the given index from the left list of this BarPanelWidget.
     * [index] 0, is the first position of the left list.
     */
    @org.jetbrains.annotations.Nullable
    public final dji.v5.ux.core.base.panel.PanelItem removeLeftWidget(@androidx.annotation.IntRange(from = 0L)
    int index) {
        return null;
    }
    
    /**
     * Remove all [PanelItem] from the left list of this BarPanelWidget.
     */
    public final void removeAllLeftWidgets() {
    }
    
    /**
     * Get [PanelItem] from the right list of this BarPanelWidget.
     * [index] 0, is the first position of the right list.
     */
    @org.jetbrains.annotations.Nullable
    public final dji.v5.ux.core.base.panel.PanelItem getRightWidget(@androidx.annotation.IntRange(from = 0L)
    int index) {
        return null;
    }
    
    /**
     * Appends an array of [PanelItem]s to the right list of this BarPanelWidget.
     * The items should be unique and not be present in this BarPanelWidget already.
     */
    public final void addRightWidgets(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.PanelItem[] panelItems) {
    }
    
    /**
     * Total number of [PanelItem]s inside the right list of this [BarPanelWidget].
     */
    public final int rightWidgetsSize() {
        return 0;
    }
    
    /**
     * Insert a [PanelItem] at the given index to the right list of this BarPanelWidget.
     * [index] 0, is the first position of the right list.
     */
    public final void addRightWidget(@androidx.annotation.IntRange(from = 0L)
    int index, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.PanelItem panelItem) {
    }
    
    /**
     * Remove a [PanelItem] at the given index from the right list of this BarPanelWidget.
     * [index] 0, is the first position of the right list.
     */
    @org.jetbrains.annotations.Nullable
    public final dji.v5.ux.core.base.panel.PanelItem removeRightWidget(@androidx.annotation.IntRange(from = 0L)
    int index) {
        return null;
    }
    
    /**
     * Remove all [PanelItem] from the right list of this BarPanelWidget.
     */
    public final void removeAllRightWidgets() {
    }
    
    private final dji.v5.ux.core.base.panel.PanelItem getLeftWidget(@androidx.annotation.IntRange(from = 0L)
    int index, java.util.List<dji.v5.ux.core.base.panel.PanelItem> panelItems) {
        return null;
    }
    
    private final void addPanelItems(dji.v5.ux.core.base.panel.PanelItem[] fromPanelItems, java.util.List<dji.v5.ux.core.base.panel.PanelItem> toPanelItems) {
    }
    
    private final void insertPanelItem(java.util.List<dji.v5.ux.core.base.panel.PanelItem> panelItems, dji.v5.ux.core.base.panel.PanelItem panelItem, @androidx.annotation.IntRange(from = 0L)
    int atIndex) {
    }
    
    private final dji.v5.ux.core.base.panel.PanelItem removePanelItem(java.util.List<dji.v5.ux.core.base.panel.PanelItem> panelItems, @androidx.annotation.IntRange(from = 0L)
    int atIndex) {
        return null;
    }
    
    private final void removeAllPanelItem(java.util.List<dji.v5.ux.core.base.panel.PanelItem> panelItems) {
    }
    
    /**
     * Checks if [index] is equivalent to the first position in a list.
     */
    protected final boolean isFirstItem(@androidx.annotation.IntRange(from = 0L)
    int index) {
        return false;
    }
    
    /**
     * Checks if item at [index] is at the last item of the [list].
     */
    protected final boolean isLastItem(@org.jetbrains.annotations.NotNull
    java.util.List<dji.v5.ux.core.base.panel.PanelItem> list, @androidx.annotation.IntRange(from = 0L)
    int index) {
        return false;
    }
    
    /**
     * Add views from each [PanelItem] into the parent ConstraintLayout.
     */
    protected final void addViews(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.PanelItem[] panelItems) {
    }
    
    private final int getDefaultItemMarginLeft(dji.v5.ux.core.base.panel.PanelItem $this$getDefaultItemMarginLeft) {
        return 0;
    }
    
    private final int getDefaultItemMarginTop(dji.v5.ux.core.base.panel.PanelItem $this$getDefaultItemMarginTop) {
        return 0;
    }
    
    private final int getDefaultItemMarginRight(dji.v5.ux.core.base.panel.PanelItem $this$getDefaultItemMarginRight) {
        return 0;
    }
    
    private final int getDefaultItemMarginBottom(dji.v5.ux.core.base.panel.PanelItem $this$getDefaultItemMarginBottom) {
        return 0;
    }
    
    private final boolean widthShouldWrap(dji.v5.ux.core.base.WidgetSizeDescription $this$widthShouldWrap) {
        return false;
    }
    
    private final boolean heightShouldWrap(dji.v5.ux.core.base.WidgetSizeDescription $this$heightShouldWrap) {
        return false;
    }
    
    private final int getStartTopMargin(int index) {
        return 0;
    }
    
    private final int getEndBottomMargin(java.util.List<dji.v5.ux.core.base.panel.PanelItem> panelItems, int index) {
        return 0;
    }
    
    @androidx.annotation.IntRange(from = 0L, to = 2L)
    private final int toChainStyle(int $this$toChainStyle) {
        return 0;
    }
    
    /**
     * Indicates the orientation of the BarPanelWidget.
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Ldji/v5/ux/core/base/panel/BarPanelWidget$BarPanelWidgetOrientation;", "", "(Ljava/lang/String;I)V", "toPanelWidgetType", "Ldji/v5/ux/core/base/panel/PanelWidgetType;", "VERTICAL", "HORIZONTAL", "android-sdk-v5-uxsdk_debug"})
    public static enum BarPanelWidgetOrientation {
        /*public static final*/ VERTICAL /* = new VERTICAL() */,
        /*public static final*/ HORIZONTAL /* = new HORIZONTAL() */;
        
        BarPanelWidgetOrientation() {
        }
        
        /**
         * Convert [BarPanelWidgetOrientation] into a [PanelWidgetType]
         */
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.core.base.panel.PanelWidgetType toPanelWidgetType() {
            return null;
        }
    }
}