package dji.v5.ux.core.base.panel;

import java.lang.System;

/**
 * Base class for [FreeFormPanelWidget].
 * A [FreeFormPanelWidget] is a panel containing splittable panes.
 * Out of the box the panel contains only one pane.
 * Based on the requirement, a pane can be split into rows or columns with proportion of choice.
 * Each pane can hold one view or widget and can be split only once. If a pane containing a view or
 * a widget is split, the view/widget will be removed permanently before splitting the pane.
 * Use [FreeFormPanelWidget.splitPane] to split a pane.
 * A pane which has been split can be unified by merging its children. If any child of the pane to
 * be merged contains a view or a widget, the view/widget will be removed permanently.
 * Use [FreeFormPanelWidget.mergeChildren] to merge the children of a pane.
 * Use [FreeFormPanelWidget.mergeSiblings] to merge the siblings of a pane.
 *
 * The class provides helper methods to add, remove and get view/widget in a pane.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003:\u0003^_`B-\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u001c\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u00172\b\b\u0002\u0010&\u001a\u00020\u0017H\u0002JH\u0010\'\u001a\u00020$2\u0006\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020\n2\b\b\u0002\u0010.\u001a\u00020\n2\b\b\u0002\u0010/\u001a\u00020\n2\b\b\u0002\u00100\u001a\u00020\nJ\u0018\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\n2\u0006\u00104\u001a\u00020\u0004H\u0016J\u001b\u00105\u001a\u0002022\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000407H\u0016\u00a2\u0006\u0002\u00108J,\u00109\u001a\u00020$2\u0006\u0010:\u001a\u00020\u00172\b\b\u0002\u0010;\u001a\u00020\u00172\b\b\u0003\u0010<\u001a\u00020\n2\b\b\u0003\u0010=\u001a\u00020\nJ\u000e\u0010>\u001a\u00020\n2\u0006\u0010?\u001a\u00020*J\u0014\u0010@\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\u0006\u0010(\u001a\u00020\nJ\u0010\u0010A\u001a\u0004\u0018\u00010,2\u0006\u0010(\u001a\u00020\nJ\u000e\u0010B\u001a\u00020\n2\u0006\u0010(\u001a\u00020\nJ\u0014\u0010C\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\u0006\u0010(\u001a\u00020\nJ\u0012\u0010D\u001a\u0004\u0018\u00010\u00042\u0006\u00103\u001a\u00020\nH\u0016J,\u0010E\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010F\u001a\u0004\u0018\u00010\fH\u0014J\"\u0010G\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0014J\u000e\u0010H\u001a\u00020$2\u0006\u0010(\u001a\u00020\nJ\u0010\u0010I\u001a\u00020$2\u0006\u0010(\u001a\u00020\nH\u0002J\u000e\u0010J\u001a\u00020$2\u0006\u0010(\u001a\u00020\nJ\b\u0010K\u001a\u00020$H\u0016J\b\u0010L\u001a\u00020$H\u0002J\u000e\u0010M\u001a\u00020$2\u0006\u0010(\u001a\u00020\nJ\u0012\u0010N\u001a\u0004\u0018\u00010\u00042\u0006\u00103\u001a\u00020\nH\u0016J\u0018\u0010O\u001a\u00020$2\u0006\u0010(\u001a\u00020\n2\b\b\u0001\u0010P\u001a\u00020\nJ>\u0010Q\u001a\u00020$2\u0006\u0010(\u001a\u00020\n2\u0006\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020\n2\b\b\u0002\u0010.\u001a\u00020\n2\b\b\u0002\u0010/\u001a\u00020\n2\b\b\u0002\u00100\u001a\u00020\nJ\u0016\u0010R\u001a\u00020$2\u0006\u0010(\u001a\u00020\n2\u0006\u0010S\u001a\u00020\u0017J@\u0010T\u001a\u00020$2\u0006\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\n2\u0006\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u00020\nH\u0002J\b\u0010U\u001a\u00020\nH\u0016J/\u0010V\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\u0006\u0010(\u001a\u00020\n2\u0006\u0010W\u001a\u00020X2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020Z07\u00a2\u0006\u0002\u0010[J\b\u0010\\\u001a\u000202H\u0014J\u0010\u0010]\u001a\u0004\u0018\u00010*2\u0006\u0010(\u001a\u00020\nR\u001a\u0010\u000e\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u001a8F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR*\u0010\u001d\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001f0\u001ej\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001f` X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010!\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0010\u00a8\u0006a"}, d2 = {"Ldji/v5/ux/core/base/panel/FreeFormPanelWidget;", "T", "", "Ldji/v5/ux/core/base/panel/PanelWidget;", "Ldji/v5/ux/core/base/panel/PanelItem;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "configuration", "Ldji/v5/ux/core/base/panel/PanelWidgetConfiguration;", "(Landroid/content/Context;Landroid/util/AttributeSet;ILdji/v5/ux/core/base/panel/PanelWidgetConfiguration;)V", "debugTextBackgroundColor", "getDebugTextBackgroundColor", "()I", "setDebugTextBackgroundColor", "(I)V", "debugTextColor", "getDebugTextColor", "setDebugTextColor", "isBackgroundAssistEnabled", "", "isLabelAssistEnabled", "listOfViewIds", "", "getListOfViewIds", "()Ljava/util/List;", "paneMap", "Ljava/util/HashMap;", "Ldji/v5/ux/core/base/panel/FreeFormPanelWidget$Pane;", "Lkotlin/collections/HashMap;", "rootID", "getRootID", "addDebugViews", "", "isLabelAssist", "isBackgroundAssist", "addView", "paneId", "widgetView", "Landroid/view/View;", "position", "Ldji/v5/ux/core/base/panel/FreeFormPanelWidget$ViewAlignment;", "leftMargin", "topMargin", "rightMargin", "bottomMargin", "addWidget", "", "index", "item", "addWidgets", "items", "", "([Ldji/v5/ux/core/base/panel/PanelItem;)Ljava/lang/Void;", "enablePaneDebug", "enableLabelAssist", "enableBackgroundAssist", "textColor", "textBackgroundColor", "findViewPane", "view", "getChildrenList", "getPanePositioning", "getParentId", "getSiblingList", "getWidget", "initPanelWidget", "widgetConfiguration", "initView", "mergeChildren", "mergePaneChildren", "mergeSiblings", "removeAllWidgets", "removeDebugViews", "removeView", "removeWidget", "setPaneBackgroundColor", "color", "setPanePosition", "setPaneVisibility", "isVisible", "setViewAlignment", "size", "splitPane", "splitType", "Ldji/v5/ux/core/base/panel/FreeFormPanelWidget$SplitType;", "proportions", "", "(ILdji/v5/ux/core/base/panel/FreeFormPanelWidget$SplitType;[Ljava/lang/Float;)Ljava/util/List;", "updateUI", "viewInPane", "Pane", "SplitType", "ViewAlignment", "android-sdk-v5-uxsdk_debug"})
public abstract class FreeFormPanelWidget<T extends java.lang.Object> extends dji.v5.ux.core.base.panel.PanelWidget<dji.v5.ux.core.base.panel.PanelItem, T> {
    private final java.util.HashMap<java.lang.Integer, dji.v5.ux.core.base.panel.FreeFormPanelWidget.Pane> paneMap = null;
    private boolean isLabelAssistEnabled = false;
    private boolean isBackgroundAssistEnabled = false;
    
    /**
     * Color of the text for in debug labels.
     */
    private int debugTextColor;
    
    /**
     * Color of the background of debug labels.
     */
    private int debugTextBackgroundColor;
    
    /**
     * ID of root pane.
     */
    private final int rootID = 0;
    
    @kotlin.jvm.JvmOverloads
    public FreeFormPanelWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.PanelWidgetConfiguration configuration) {
        super(null, null, 0, null);
    }
    
    @kotlin.jvm.JvmOverloads
    public FreeFormPanelWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.PanelWidgetConfiguration configuration) {
        super(null, null, 0, null);
    }
    
    @kotlin.jvm.JvmOverloads
    public FreeFormPanelWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.PanelWidgetConfiguration configuration) {
        super(null, null, 0, null);
    }
    
    public final int getDebugTextColor() {
        return 0;
    }
    
    public final void setDebugTextColor(int p0) {
    }
    
    public final int getDebugTextBackgroundColor() {
        return 0;
    }
    
    public final void setDebugTextBackgroundColor(int p0) {
    }
    
    public final int getRootID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Integer> getListOfViewIds() {
        return null;
    }
    
    @java.lang.Override
    protected void initView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
    }
    
    @java.lang.Override
    protected void initPanelWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr, @org.jetbrains.annotations.Nullable
    dji.v5.ux.core.base.panel.PanelWidgetConfiguration widgetConfiguration) {
    }
    
    @org.jetbrains.annotations.Nullable
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.UnsupportedOperationException.class})
    @java.lang.Override
    public dji.v5.ux.core.base.panel.PanelItem getWidget(int index) throws java.lang.UnsupportedOperationException {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.UnsupportedOperationException.class})
    @java.lang.Override
    public java.lang.Void addWidgets(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.PanelItem[] items) throws java.lang.UnsupportedOperationException {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.UnsupportedOperationException.class})
    @java.lang.Override
    public int size() throws java.lang.UnsupportedOperationException {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.UnsupportedOperationException.class})
    @java.lang.Override
    public java.lang.Void addWidget(int index, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.PanelItem item) throws java.lang.UnsupportedOperationException {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.UnsupportedOperationException.class})
    @java.lang.Override
    public dji.v5.ux.core.base.panel.PanelItem removeWidget(int index) throws java.lang.UnsupportedOperationException {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.UnsupportedOperationException.class})
    @java.lang.Override
    protected java.lang.Void updateUI() throws java.lang.UnsupportedOperationException {
        return null;
    }
    
    @java.lang.Override
    public void removeAllWidgets() {
    }
    
    /**
     * Split pane into multiple panes.
     *
     * @param paneId - the ID of the pane that needs to be split.
     * @param splitType - instance of [SplitType] representing the axis to use for the splits.
     * @param proportions - float array representing the proportions in which the pane should be.
     *                     split. The sum of the proportions should not exceed 1. If the sum is less
     *                     than 1 the balance will be added to the last pane.
     * @return List of integer IDs of the newly created panes.
     */
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Integer> splitPane(int paneId, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.FreeFormPanelWidget.SplitType splitType, @org.jetbrains.annotations.NotNull
    java.lang.Float[] proportions) {
        return null;
    }
    
    /**
     * The method addView installs a descendant of [View] into the designated pane,
     * removing the existing view already there.
     *
     * @param paneId - the ID of the pane to which view should be added.
     * @param widgetView - the instance of widget or view to be added to the pane.
     * @param position - instance of [ViewAlignment] representing the position of the view in the pane.
     * @param leftMargin - Optional left margin for the widget or view. Defaults to 0.
     * @param topMargin - Optional top margin for the widget or view. Defaults to 0.
     * @param rightMargin - Optional right margin for the widget or view. Defaults to 0.
     * @param bottomMargin - Optional bottom margin for the widget or view. Defaults to 0.
     */
    public final void addView(int paneId, @org.jetbrains.annotations.NotNull
    android.view.View widgetView, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.FreeFormPanelWidget.ViewAlignment position, int leftMargin, int topMargin, int rightMargin, int bottomMargin) {
    }
    
    /**
     * Remove the view in a pane.
     *
     * @param - ID of the pane from which the view should be removed.
     */
    public final void removeView(int paneId) {
    }
    
    /**
     * The method returns the integer ID of the pane in which the given view in
     * installed or -1.
     */
    public final int findViewPane(@org.jetbrains.annotations.NotNull
    android.view.View view) {
        return 0;
    }
    
    /**
     * The method returns the view installed in the given pane ID.
     */
    @org.jetbrains.annotations.Nullable
    public final android.view.View viewInPane(int paneId) {
        return null;
    }
    
    /**
     * Get the list of siblings of a pane.
     */
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Integer> getSiblingList(int paneId) {
        return null;
    }
    
    /**
     * Get the list of children of a pane.
     */
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Integer> getChildrenList(int paneId) {
        return null;
    }
    
    /**
     * Get the parent id of a pane.
     */
    public final int getParentId(int paneId) {
        return 0;
    }
    
    /**
     * The method enablePaneDebug activates or deactivates some visual debugging tools
     * for the Freeform panel. These tools can help you quickly debug how your panes are
     * appearing and where, and how large they are.
     *
     *
     * @param enableLabelAssist - Turns debugging PaneIDs on or off in each pane.
     * @param enableBackgroundAssist - This optional boolean sets the background color of panes
     *                                using a rotating list of colors to help visualize where
     *                                each pane displays. Defaults to off.
     * @param textColor - This optional parameter sets the UIColor of the text label for each pane
     *                   created after the assist is turned on. Defaults to white.
     * @param textBackgroundColor - This optional parameter sets the UIColor to use as the
     *                             background color of the text label. Defaults to black.
     */
    public final void enablePaneDebug(boolean enableLabelAssist, boolean enableBackgroundAssist, @androidx.annotation.ColorInt
    int textColor, @androidx.annotation.ColorInt
    int textBackgroundColor) {
    }
    
    /**
     * Call method mergeChildren to merge all the children of a pane back to form the original pane.
     * This deletes all the children and re-exposes the parent pane.
     *
     * @param paneId - The paneID to be revealed after removing the child panes.
     */
    public final void mergeChildren(int paneId) {
    }
    
    /**
     * Call method mergeSiblings to merge all the siblings of a pane back to form the parent pane.
     * This deletes all the siblings and re-exposes the parent pane.
     *
     * @param paneId - The paneID to be deleted along with its siblings.
     */
    public final void mergeSiblings(int paneId) {
    }
    
    /**
     * Get the [ViewAlignment] used by the pane to align its content.
     */
    @org.jetbrains.annotations.Nullable
    public final dji.v5.ux.core.base.panel.FreeFormPanelWidget.ViewAlignment getPanePositioning(int paneId) {
        return null;
    }
    
    /**
     * Set the [ViewAlignment] to a pane to align its content.
     *
     * @param paneId - the ID of the pane to which the position should be set.
     * @param position - instance of [ViewAlignment] representing the position of the view in the pane.
     * @param leftMargin - Optional left margin for the widget or view. Defaults to 0.
     * @param topMargin - Optional top margin for the widget or view. Defaults to 0.
     * @param rightMargin - Optional right margin for the widget or view. Defaults to 0.
     * @param bottomMargin
     */
    public final void setPanePosition(int paneId, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.FreeFormPanelWidget.ViewAlignment position, int leftMargin, int topMargin, int rightMargin, int bottomMargin) {
    }
    
    /**
     * Set the background color of the pane.
     */
    public final void setPaneBackgroundColor(int paneId, @androidx.annotation.ColorInt
    int color) {
    }
    
    /**
     * Set the background color of the pane.
     */
    public final void setPaneVisibility(int paneId, boolean isVisible) {
    }
    
    private final void setViewAlignment(int paneId, android.view.View widgetView, dji.v5.ux.core.base.panel.FreeFormPanelWidget.ViewAlignment position, int leftMargin, int topMargin, int rightMargin, int bottomMargin) {
    }
    
    private final void mergePaneChildren(int paneId) {
    }
    
    private final void addDebugViews(boolean isLabelAssist, boolean isBackgroundAssist) {
    }
    
    private final void removeDebugViews() {
    }
    
    /**
     * View placement positions in a pane.
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b\u00a8\u0006\f"}, d2 = {"Ldji/v5/ux/core/base/panel/FreeFormPanelWidget$ViewAlignment;", "", "(Ljava/lang/String;I)V", "CENTER", "TOP", "BOTTOM", "LEFT", "RIGHT", "LEFT_TOP", "LEFT_BOTTOM", "RIGHT_TOP", "RIGHT_BOTTOM", "android-sdk-v5-uxsdk_debug"})
    public static enum ViewAlignment {
        /*public static final*/ CENTER /* = new CENTER() */,
        /*public static final*/ TOP /* = new TOP() */,
        /*public static final*/ BOTTOM /* = new BOTTOM() */,
        /*public static final*/ LEFT /* = new LEFT() */,
        /*public static final*/ RIGHT /* = new RIGHT() */,
        /*public static final*/ LEFT_TOP /* = new LEFT_TOP() */,
        /*public static final*/ LEFT_BOTTOM /* = new LEFT_BOTTOM() */,
        /*public static final*/ RIGHT_TOP /* = new RIGHT_TOP() */,
        /*public static final*/ RIGHT_BOTTOM /* = new RIGHT_BOTTOM() */;
        
        ViewAlignment() {
        }
    }
    
    /**
     * Pane class for caching pane data.
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u0010\u0012J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0006H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\tH\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u00c6\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u00c6\u0003J\u007f\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00c6\u0001J\u0013\u0010:\u001a\u00020\t2\b\u0010;\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010<\u001a\u00020\u0003H\u00d6\u0001J\t\u0010=\u001a\u00020>H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\"\"\u0004\b#\u0010$R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001a\"\u0004\b+\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0014\"\u0004\b-\u0010.\u00a8\u0006?"}, d2 = {"Ldji/v5/ux/core/base/panel/FreeFormPanelWidget$Pane;", "", "id", "", "parentId", "background", "Landroid/view/View;", "backgroundColor", "isSplit", "", "view", "position", "Ldji/v5/ux/core/base/panel/FreeFormPanelWidget$ViewAlignment;", "childrenIdList", "", "siblingIdList", "debugTextView", "Landroid/widget/TextView;", "(IILandroid/view/View;IZLandroid/view/View;Ldji/v5/ux/core/base/panel/FreeFormPanelWidget$ViewAlignment;Ljava/util/List;Ljava/util/List;Landroid/widget/TextView;)V", "getBackground", "()Landroid/view/View;", "getBackgroundColor", "()I", "setBackgroundColor", "(I)V", "getChildrenIdList", "()Ljava/util/List;", "setChildrenIdList", "(Ljava/util/List;)V", "getDebugTextView", "()Landroid/widget/TextView;", "setDebugTextView", "(Landroid/widget/TextView;)V", "getId", "()Z", "setSplit", "(Z)V", "getParentId", "getPosition", "()Ldji/v5/ux/core/base/panel/FreeFormPanelWidget$ViewAlignment;", "setPosition", "(Ldji/v5/ux/core/base/panel/FreeFormPanelWidget$ViewAlignment;)V", "getSiblingIdList", "setSiblingIdList", "getView", "setView", "(Landroid/view/View;)V", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "android-sdk-v5-uxsdk_debug"})
    static final class Pane {
        private final int id = 0;
        private final int parentId = 0;
        @org.jetbrains.annotations.NotNull
        private final android.view.View background = null;
        private int backgroundColor;
        private boolean isSplit;
        @org.jetbrains.annotations.Nullable
        private android.view.View view;
        @org.jetbrains.annotations.Nullable
        private dji.v5.ux.core.base.panel.FreeFormPanelWidget.ViewAlignment position;
        @org.jetbrains.annotations.NotNull
        private java.util.List<java.lang.Integer> childrenIdList;
        @org.jetbrains.annotations.NotNull
        private java.util.List<java.lang.Integer> siblingIdList;
        @org.jetbrains.annotations.Nullable
        private android.widget.TextView debugTextView;
        
        /**
         * Pane class for caching pane data.
         */
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.core.base.panel.FreeFormPanelWidget.Pane copy(int id, int parentId, @org.jetbrains.annotations.NotNull
        android.view.View background, int backgroundColor, boolean isSplit, @org.jetbrains.annotations.Nullable
        android.view.View view, @org.jetbrains.annotations.Nullable
        dji.v5.ux.core.base.panel.FreeFormPanelWidget.ViewAlignment position, @org.jetbrains.annotations.NotNull
        java.util.List<java.lang.Integer> childrenIdList, @org.jetbrains.annotations.NotNull
        java.util.List<java.lang.Integer> siblingIdList, @org.jetbrains.annotations.Nullable
        android.widget.TextView debugTextView) {
            return null;
        }
        
        /**
         * Pane class for caching pane data.
         */
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Pane class for caching pane data.
         */
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        /**
         * Pane class for caching pane data.
         */
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public Pane(int id, int parentId, @org.jetbrains.annotations.NotNull
        android.view.View background, int backgroundColor, boolean isSplit, @org.jetbrains.annotations.Nullable
        android.view.View view, @org.jetbrains.annotations.Nullable
        dji.v5.ux.core.base.panel.FreeFormPanelWidget.ViewAlignment position, @org.jetbrains.annotations.NotNull
        java.util.List<java.lang.Integer> childrenIdList, @org.jetbrains.annotations.NotNull
        java.util.List<java.lang.Integer> siblingIdList, @org.jetbrains.annotations.Nullable
        android.widget.TextView debugTextView) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getId() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getParentId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.view.View component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.view.View getBackground() {
            return null;
        }
        
        public final int component4() {
            return 0;
        }
        
        public final int getBackgroundColor() {
            return 0;
        }
        
        public final void setBackgroundColor(int p0) {
        }
        
        public final boolean component5() {
            return false;
        }
        
        public final boolean isSplit() {
            return false;
        }
        
        public final void setSplit(boolean p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final android.view.View component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final android.view.View getView() {
            return null;
        }
        
        public final void setView(@org.jetbrains.annotations.Nullable
        android.view.View p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final dji.v5.ux.core.base.panel.FreeFormPanelWidget.ViewAlignment component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final dji.v5.ux.core.base.panel.FreeFormPanelWidget.ViewAlignment getPosition() {
            return null;
        }
        
        public final void setPosition(@org.jetbrains.annotations.Nullable
        dji.v5.ux.core.base.panel.FreeFormPanelWidget.ViewAlignment p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.Integer> component8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.Integer> getChildrenIdList() {
            return null;
        }
        
        public final void setChildrenIdList(@org.jetbrains.annotations.NotNull
        java.util.List<java.lang.Integer> p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.Integer> component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.Integer> getSiblingIdList() {
            return null;
        }
        
        public final void setSiblingIdList(@org.jetbrains.annotations.NotNull
        java.util.List<java.lang.Integer> p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final android.widget.TextView component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final android.widget.TextView getDebugTextView() {
            return null;
        }
        
        public final void setDebugTextView(@org.jetbrains.annotations.Nullable
        android.widget.TextView p0) {
        }
    }
    
    /**
     * Enum to define types of split.
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Ldji/v5/ux/core/base/panel/FreeFormPanelWidget$SplitType;", "", "(Ljava/lang/String;I)V", "HORIZONTAL", "VERTICAL", "android-sdk-v5-uxsdk_debug"})
    public static enum SplitType {
        /*public static final*/ HORIZONTAL /* = new HORIZONTAL() */,
        /*public static final*/ VERTICAL /* = new VERTICAL() */;
        
        SplitType() {
        }
    }
}