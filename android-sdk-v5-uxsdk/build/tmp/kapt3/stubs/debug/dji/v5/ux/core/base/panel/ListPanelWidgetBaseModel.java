package dji.v5.ux.core.base.panel;

import java.lang.System;

/**
 * The base model for the [ListPanelWidget]
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006J\u0018\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0006J\u0014\u0010\u0010\u001a\u00020\f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0014\u001a\u00020\u000fR\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Ldji/v5/ux/core/base/panel/ListPanelWidgetBaseModel;", "", "()V", "widgetList", "Lio/reactivex/rxjava3/core/Flowable;", "", "Landroid/view/View;", "getWidgetList", "()Lio/reactivex/rxjava3/core/Flowable;", "widgetListProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "addWidget", "", "widget", "index", "", "addWidgets", "getWidget", "removeAllWidgets", "removeWidget", "size", "android-sdk-v5-uxsdk_debug"})
public final class ListPanelWidgetBaseModel {
    private final dji.v5.ux.core.util.DataProcessor<java.util.List<android.view.View>> widgetListProcessor = null;
    
    public ListPanelWidgetBaseModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<java.util.List<android.view.View>> getWidgetList() {
        return null;
    }
    
    /**
     * Add a new [List] of [View].
     */
    public final void addWidgets(@org.jetbrains.annotations.NotNull
    java.util.List<? extends android.view.View> widgetList) {
    }
    
    /**
     * Add a [View] to the current list of widgets.
     */
    public final void addWidget(@org.jetbrains.annotations.NotNull
    android.view.View widget) {
    }
    
    /**
     * Add a [View] at [index] to the current list of widgets.
     */
    public final void addWidget(@androidx.annotation.IntRange(from = 0L)
    int index, @org.jetbrains.annotations.NotNull
    android.view.View widget) {
    }
    
    /**
     * Remove a [View] at [index] from the current list of widgets.
     */
    @org.jetbrains.annotations.Nullable
    public final android.view.View removeWidget(@androidx.annotation.IntRange(from = 0L)
    int index) {
        return null;
    }
    
    /**
     * Remove all [View]s.
     */
    public final void removeAllWidgets() {
    }
    
    /**
     * Get the [View] at index from the current list of widgets.
     */
    @org.jetbrains.annotations.Nullable
    public final android.view.View getWidget(@androidx.annotation.IntRange(from = 0L)
    int index) {
        return null;
    }
    
    /**
     * Total size of the current list of widgets.
     */
    public final int size() {
        return 0;
    }
}