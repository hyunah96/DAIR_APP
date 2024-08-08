package dji.v5.ux.core.base.panel;

import java.lang.System;

/**
 * Base class for [ListPanelWidget]s. A [ListPanelWidget] is a vertical collection of widgets.
 * The child widgets of a [ListPanelWidget], unlike those of a [BarPanelWidget],
 * are created dynamically and the list can change based on changes at the MSDK level.
 *
 * This list is not meant to be used as an infinite list, but rather for a limited number of widgets.
 * For infinite lists, prefer to use a RecyclerView.
 *
 * Widgets in this list are placed with the following properties:
 * - Width: MATCH_PARENT
 * - Height: WRAP_CONTENT
 *
 * The ListPanelWidget may contain a default [SmartListModel], which injects views into this
 * ListPanelWidget. The [SmartListModel] can also be overwritten by setting [smartListModel], allowing
 * the user to change the behavior of the list.
 *
 * Customization:
 * The [ListPanelWidget] uses a ListView internally. To customize the dividers, user can use the
 * ListView's attributes:
 * android:divider="#FFCCFF"
 * android:dividerHeight="4dp"
 * User can also remove the dividers:
 * android:divider="@null"
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001.B-\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0004H\u0016J\u001b\u0010\u001f\u001a\u00020\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040!H\u0016\u00a2\u0006\u0002\u0010\"J\n\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001d\u001a\u00020\nH\u0016J\b\u0010&\u001a\u00020\u001cH\u0014J\b\u0010\'\u001a\u00020\u001cH\u0014J\b\u0010(\u001a\u00020\u001cH$J\b\u0010)\u001a\u00020\u001cH\u0016J\u0012\u0010*\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001d\u001a\u00020\nH\u0016J\u0012\u0010+\u001a\u00020\u001c2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010,\u001a\u00020\nH\u0016J\b\u0010-\u001a\u00020\u001cH\u0014R\u0018\u0010\u000e\u001a\f0\u000fR\b\u0012\u0004\u0012\u00028\u00000\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006/"}, d2 = {"Ldji/v5/ux/core/base/panel/ListPanelWidget;", "T", "", "Ldji/v5/ux/core/base/panel/PanelWidget;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "configuration", "Ldji/v5/ux/core/base/panel/PanelWidgetConfiguration;", "(Landroid/content/Context;Landroid/util/AttributeSet;ILdji/v5/ux/core/base/panel/PanelWidgetConfiguration;)V", "adapter", "Ldji/v5/ux/core/base/panel/ListPanelWidget$Adapter;", "listPanelWidgetBaseModel", "Ldji/v5/ux/core/base/panel/ListPanelWidgetBaseModel;", "getListPanelWidgetBaseModel", "()Ldji/v5/ux/core/base/panel/ListPanelWidgetBaseModel;", "value", "Ldji/v5/ux/core/base/panel/SmartListModel;", "smartListModel", "getSmartListModel", "()Ldji/v5/ux/core/base/panel/SmartListModel;", "setSmartListModel", "(Ldji/v5/ux/core/base/panel/SmartListModel;)V", "addWidget", "", "index", "view", "addWidgets", "items", "", "([Landroid/view/View;)V", "getIdealDimensionRatioString", "", "getWidget", "onAttachedToWindow", "onDetachedFromWindow", "onSmartListModelCreated", "removeAllWidgets", "removeWidget", "setUpListView", "size", "updateUI", "Adapter", "android-sdk-v5-uxsdk_debug"})
public abstract class ListPanelWidget<T extends java.lang.Object> extends dji.v5.ux.core.base.panel.PanelWidget<android.view.View, T> {
    
    /**
     * Optional [SmartListModel].
     * Setting a new instance refreshes the whole list.
     */
    @org.jetbrains.annotations.Nullable
    private dji.v5.ux.core.base.panel.SmartListModel smartListModel;
    
    /**
     * Default [ListPanelWidgetBaseModel], can be overwritten.
     */
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.base.panel.ListPanelWidgetBaseModel listPanelWidgetBaseModel = null;
    private final dji.v5.ux.core.base.panel.ListPanelWidget<T>.Adapter adapter = null;
    
    @kotlin.jvm.JvmOverloads
    public ListPanelWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.PanelWidgetConfiguration configuration) {
        super(null, null, 0, null);
    }
    
    @kotlin.jvm.JvmOverloads
    public ListPanelWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.PanelWidgetConfiguration configuration) {
        super(null, null, 0, null);
    }
    
    @kotlin.jvm.JvmOverloads
    public ListPanelWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.PanelWidgetConfiguration configuration) {
        super(null, null, 0, null);
    }
    
    @org.jetbrains.annotations.Nullable
    public final dji.v5.ux.core.base.panel.SmartListModel getSmartListModel() {
        return null;
    }
    
    public final void setSmartListModel(@org.jetbrains.annotations.Nullable
    dji.v5.ux.core.base.panel.SmartListModel value) {
    }
    
    @org.jetbrains.annotations.NotNull
    protected dji.v5.ux.core.base.panel.ListPanelWidgetBaseModel getListPanelWidgetBaseModel() {
        return null;
    }
    
    private final void setUpListView(android.util.AttributeSet attrs) {
    }
    
    @java.lang.Override
    protected void onAttachedToWindow() {
    }
    
    @java.lang.Override
    protected void onDetachedFromWindow() {
    }
    
    /**
     * Call to refresh the list.
     */
    @java.lang.Override
    protected void updateUI() {
    }
    
    /**
     * Callback for when a new [SmartListModel] is created.
     */
    protected abstract void onSmartListModelCreated();
    
    /**
     * Get the [View] at index from the current list of widgets.
     */
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View getWidget(int index) {
        return null;
    }
    
    /**
     * Add a new [List] of [View].
     */
    @java.lang.Override
    public void addWidgets(@org.jetbrains.annotations.NotNull
    android.view.View[] items) {
    }
    
    /**
     * Total size of [View] in the current list of widgets.
     */
    @java.lang.Override
    public int size() {
        return 0;
    }
    
    /**
     * Add a [View] at [index] to the current list of widgets.
     */
    @java.lang.Override
    public void addWidget(int index, @org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
    
    /**
     * Remove a [View] at [index] from the current list of widgets.
     */
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View removeWidget(int index) {
        return null;
    }
    
    /**
     * Remove all [View]s.
     */
    @java.lang.Override
    public void removeAllWidgets() {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String getIdealDimensionRatioString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/core/base/panel/ListPanelWidget$Adapter;", "Landroid/widget/BaseAdapter;", "(Ldji/v5/ux/core/base/panel/ListPanelWidget;)V", "getCount", "", "getItem", "", "position", "getItemId", "", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "android-sdk-v5-uxsdk_debug"})
    final class Adapter extends android.widget.BaseAdapter {
        
        public Adapter() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public android.view.View getView(int position, @org.jetbrains.annotations.Nullable
        android.view.View convertView, @org.jetbrains.annotations.Nullable
        android.view.ViewGroup parent) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.Object getItem(int position) {
            return null;
        }
        
        @java.lang.Override
        public long getItemId(int position) {
            return 0L;
        }
        
        @java.lang.Override
        public int getCount() {
            return 0;
        }
    }
}