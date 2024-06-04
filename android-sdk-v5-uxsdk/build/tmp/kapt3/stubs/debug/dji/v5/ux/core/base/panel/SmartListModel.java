package dji.v5.ux.core.base.panel;

import java.lang.System;

/**
 * The [SmartListModel] handles the creation and order of child views for a [ListPanelWidget] by holding
 * a reference to ListPanelWidget's [ListPanelWidgetBaseModel].
 *
 * The [SmartListModel] controls when the child view is created and it may encapsulate a WidgetModel to
 * handheld business logic for when to show/hide items.
 *
 * When creating a [SmartListModel], widgets are registered with [registeredWidgetIDList]. This
 * list defines all the [WidgetID]s that are allowed in this panel.
 * A widget is said to become active, when its [WidgetID] is passed in a set with [buildAndInstallWidgets].
 * Thus, An active widget is a widget that is currently being shown and its object has been created.
 * Once a widget is active at least once, the [SmartListModel] will hold a reference until the [SmartListModel]
 * is destroyed.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\b\u0012\u00060\bj\u0002`\t\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\nJ\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0004J\u001a\u00102\u001a\u00020/2\u0010\u00103\u001a\f\u0012\b\u0012\u00060\bj\u0002`\t0\u0007H\u0002J\u001a\u00104\u001a\u00020/2\u0010\u00103\u001a\f\u0012\b\u0012\u00060\bj\u0002`\t0\u0007H\u0004J\u0006\u00105\u001a\u00020/J\u0014\u00106\u001a\u00020\r2\n\u00107\u001a\u00060\bj\u0002`\tH$J\b\u00108\u001a\u00020/H\u0002J\u0014\u00109\u001a\u0004\u0018\u00010\r2\n\u00107\u001a\u00060\bj\u0002`\tJ\u0012\u00109\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010:\u001a\u00020\u0010J\u0014\u0010;\u001a\u0004\u0018\u00010\r2\n\u00107\u001a\u00060\bj\u0002`\tJ\u0018\u0010<\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\b\b\u0001\u0010:\u001a\u00020\u0010J\u0012\u0010=\u001a\u00020\u00102\n\u00107\u001a\u00060\bj\u0002`\tJ\b\u0010>\u001a\u00020/H$J\b\u0010?\u001a\u00020/H$J\u0010\u0010@\u001a\u00020/2\u0006\u0010A\u001a\u00020BH$J\u0010\u0010C\u001a\u00020/2\u0006\u0010D\u001a\u00020EH$J\b\u0010F\u001a\u00020/H\u0002J\u001c\u0010G\u001a\u00020/2\b\b\u0001\u0010:\u001a\u00020\u00102\n\u00107\u001a\u00060\bj\u0002`\tJ\u001a\u0010G\u001a\u00020/2\b\b\u0001\u0010H\u001a\u00020\u00102\b\b\u0001\u0010I\u001a\u00020\u0010J\u000e\u0010J\u001a\u00020/2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010K\u001a\u00020/J\b\u0010L\u001a\u00020/H\u0002J)\u0010M\u001a\u00020/2\u001a\u0010N\u001a\u000e\u0012\n\b\u0001\u0012\u00060\bj\u0002`\t0O\"\u00060\bj\u0002`\tH\u0004\u00a2\u0006\u0002\u0010PJ)\u0010Q\u001a\u00020/2\u001a\u0010R\u001a\u000e\u0012\n\b\u0001\u0012\u00060\bj\u0002`\t0O\"\u00060\bj\u0002`\tH\u0004\u00a2\u0006\u0002\u0010PJ\u0010\u0010S\u001a\u00020E*\u00060\bj\u0002`\tH\u0002R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u000e\u001a\f\u0012\b\u0012\u00060\bj\u0002`\t0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u0012\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\r0\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0019\u001a\f\u0012\b\u0012\u00060\bj\u0002`\t0\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\f\u0012\b\u0012\u00060\bj\u0002`\t0\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\u000e\u0012\b\u0012\u00060\bj\u0002`\t\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010 \u001a\f\u0012\b\u0012\u00060\bj\u0002`\t0\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b$\u0010\u0012R\'\u0010%\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\r0\'0&8F\u00a2\u0006\u0006\u001a\u0004\b(\u0010)R$\u0010*\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\r0\'0+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006T"}, d2 = {"Ldji/v5/ux/core/base/panel/SmartListModel;", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "excludedItems", "", "", "Ldji/v5/ux/core/base/panel/WidgetID;", "(Landroid/content/Context;Landroid/util/AttributeSet;Ljava/util/Set;)V", "activeWidgetList", "", "Landroid/view/View;", "activeWidgetSet", "activeWidgetSize", "", "getActiveWidgetSize", "()I", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "getContext", "()Landroid/content/Context;", "createdWidgetsMap", "", "currentOrderList", "", "defaultActiveWidgetSet", "getDefaultActiveWidgetSet", "()Ljava/util/Set;", "listPanelWidgetBaseModel", "Ldji/v5/ux/core/base/panel/ListPanelWidgetBaseModel;", "registeredWidgetIDList", "getRegisteredWidgetIDList", "()Ljava/util/List;", "totalWidgetSize", "getTotalWidgetSize", "widgetCreated", "Lio/reactivex/rxjava3/core/Flowable;", "Lkotlin/Pair;", "getWidgetCreated", "()Lio/reactivex/rxjava3/core/Flowable;", "widgetCreatedProcessor", "Lio/reactivex/rxjava3/processors/PublishProcessor;", "widgetModel", "Ldji/v5/ux/core/panel/systemstatus/SmartListInternalModel;", "addDisposable", "", "disposable", "Lio/reactivex/rxjava3/disposables/Disposable;", "buildActiveWidgetList", "newActiveWidgetIDs", "buildAndInstallWidgets", "cleanUp", "createWidget", "widgetID", "disposeAll", "getActiveWidget", "index", "getWidget", "getWidgetID", "getWidgetIndex", "inCleanUp", "inSetUp", "onAircraftModelChanged", "model", "Ldji/sdk/keyvalue/value/product/ProductType;", "onProductConnectionChanged", "isConnected", "", "reorderActiveWidgets", "setIndex", "fromIndex", "toIndex", "setListPanelWidgetHolder", "setUp", "updateHolder", "updateListMinus", "itemToRemove", "", "([Ljava/lang/String;)V", "updateListPlus", "itemToAdd", "isNotExcluded", "android-sdk-v5-uxsdk_debug"})
public abstract class SmartListModel {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    private final android.util.AttributeSet attrs = null;
    private final java.util.Set<java.lang.String> excludedItems = null;
    
    /**
     * Widget model to detect the connected product.
     */
    private dji.v5.ux.core.panel.systemstatus.SmartListInternalModel widgetModel;
    private java.util.List<java.lang.String> currentOrderList;
    private final java.util.Map<java.lang.String, android.view.View> createdWidgetsMap = null;
    private java.util.List<? extends android.view.View> activeWidgetList;
    private java.util.Set<java.lang.String> activeWidgetSet;
    private dji.v5.ux.core.base.panel.ListPanelWidgetBaseModel listPanelWidgetBaseModel;
    private io.reactivex.rxjava3.processors.PublishProcessor<kotlin.Pair<java.lang.String, android.view.View>> widgetCreatedProcessor;
    private io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable;
    
    @kotlin.jvm.JvmOverloads
    public SmartListModel(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public SmartListModel(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public SmartListModel(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, @org.jetbrains.annotations.Nullable
    java.util.Set<java.lang.String> excludedItems) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    protected final android.content.Context getContext() {
        return null;
    }
    
    /**
     * Defines what [WidgetID]s are allowed into this [SmartListModel].
     * This list also defines the order of all the items.
     * Override this to register more [WidgetID]s.
     */
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<java.lang.String> getRegisteredWidgetIDList();
    
    /**
     * The default active widgets that will be created and shown.
     */
    @org.jetbrains.annotations.NotNull
    public abstract java.util.Set<java.lang.String> getDefaultActiveWidgetSet();
    
    public final int getActiveWidgetSize() {
        return 0;
    }
    
    public final int getTotalWidgetSize() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<kotlin.Pair<java.lang.String, android.view.View>> getWidgetCreated() {
        return null;
    }
    
    /**
     * Set up the [SmartListModel] by initializing all the required resources.
     */
    public final void setUp() {
    }
    
    /**
     * Clean up the [SmartListModel] by destroying all the resources used.
     */
    public final void cleanUp() {
    }
    
    /**
     * Setup method for initialization that must be implemented
     */
    protected abstract void inSetUp();
    
    /**
     * Cleanup method for post-usage destruction that must be implemented
     */
    protected abstract void inCleanUp();
    
    /**
     * Setup the list based product connection
     */
    protected abstract void onProductConnectionChanged(boolean isConnected);
    
    /**
     * Setup the list based on the connected aircraft
     */
    protected abstract void onAircraftModelChanged(@org.jetbrains.annotations.NotNull
    dji.sdk.keyvalue.value.product.ProductType model);
    
    /**
     * Pass a new [Set] of active [WidgetID].
     * It will create widgets that have not been created and emit them to [ListPanelWidget].
     */
    protected final void buildAndInstallWidgets(@org.jetbrains.annotations.NotNull
    java.util.Set<java.lang.String> newActiveWidgetIDs) {
    }
    
    /**
     * Callback for when a [View] needs to be created for the given [WidgetID].
     */
    @org.jetbrains.annotations.NotNull
    protected abstract android.view.View createWidget(@org.jetbrains.annotations.NotNull
    java.lang.String widgetID);
    
    /**
     * Set a reference to a [ListPanelWidgetBaseModel].
     * Must be set to communicate changes to the [ListPanelWidget].
     */
    public final void setListPanelWidgetHolder(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.ListPanelWidgetBaseModel listPanelWidgetBaseModel) {
    }
    
    /**
     * Get [View] at [index] from the active widget list.
     */
    @org.jetbrains.annotations.Nullable
    public final android.view.View getActiveWidget(@androidx.annotation.IntRange(from = 0L)
    int index) {
        return null;
    }
    
    /**
     * Get [View] with [widgetID] from the active widget list.
     */
    @org.jetbrains.annotations.Nullable
    public final android.view.View getActiveWidget(@org.jetbrains.annotations.NotNull
    java.lang.String widgetID) {
        return null;
    }
    
    /**
     * Get the [WidgetID] at [index] from the current order list.
     * This is the order of all active and inactive widgets.
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getWidgetID(@androidx.annotation.IntRange(from = 0L)
    int index) {
        return null;
    }
    
    /**
     * Get the [View] for the [WidgetID]. Only available if the widget has become active at least once.
     */
    @org.jetbrains.annotations.Nullable
    public final android.view.View getWidget(@org.jetbrains.annotations.NotNull
    java.lang.String widgetID) {
        return null;
    }
    
    /**
     * Ge the index for the [WidgetID] from the current order list.
     * This is the order of all active and inactive widgets.
     */
    public final int getWidgetIndex(@org.jetbrains.annotations.NotNull
    java.lang.String widgetID) {
        return 0;
    }
    
    /**
     * Change the [index] for a [WidgetID], effectively changing its order in
     * the list of active and inactive widgets.
     */
    public final void setIndex(@androidx.annotation.IntRange(from = 0L)
    int index, @org.jetbrains.annotations.NotNull
    java.lang.String widgetID) {
    }
    
    /**
     * Change the order of a [WidgetID] from one index to another, effectively changing its order in
     * the list of active and inactive widgets.
     */
    public final void setIndex(@androidx.annotation.IntRange(from = 0L)
    int fromIndex, @androidx.annotation.IntRange(from = 0L)
    int toIndex) {
    }
    
    /**
     * Remove items from the current active list.
     */
    protected final void updateListMinus(@org.jetbrains.annotations.NotNull
    java.lang.String... itemToRemove) {
    }
    
    /**
     * Add items from the current active list.
     */
    protected final void updateListPlus(@org.jetbrains.annotations.NotNull
    java.lang.String... itemToAdd) {
    }
    
    /**
     * Add a disposable which is automatically disposed with the [SmartListModel]'s lifecycle.
     *
     * @param disposable the disposable to add
     */
    protected final void addDisposable(@org.jetbrains.annotations.NotNull
    io.reactivex.rxjava3.disposables.Disposable disposable) {
    }
    
    private final void disposeAll() {
    }
    
    private final void updateHolder() {
    }
    
    private final boolean isNotExcluded(java.lang.String $this$isNotExcluded) {
        return false;
    }
    
    private final void buildActiveWidgetList(java.util.Set<java.lang.String> newActiveWidgetIDs) {
    }
    
    private final void reorderActiveWidgets() {
    }
}