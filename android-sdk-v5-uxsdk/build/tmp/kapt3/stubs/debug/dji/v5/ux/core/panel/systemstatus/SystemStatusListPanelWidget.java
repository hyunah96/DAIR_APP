package dji.v5.ux.core.panel.systemstatus;

import java.lang.System;

/**
 * To Allow the user to toggle hide and show this panel widget, use in conjunction
 * with [SystemStatusWidget].
 *
 * This panel widget shows the system status list that includes a list of items (like IMU, GPS, etc.).
 * The current version of this panel widget is a sample and more items are to come
 * in future releases.
 *
 * Customization:
 * Use the attribute "excludeItem" to permanently remove items from the list. This will prevent a
 * certain item from being created and shown throughout the lifecycle of the panel widget. Here are
 * all the flags: flight_mode, compass, vision_sensor, radio_quality, rc_stick_mode, rc_battery,
 * aircraft_battery_temperature, sd_card_status, emmc_status, max_altitude, max_flight_distance,
 * travel_mode.
 *
 * Note that multiple flags can be used simultaneously by logically OR'ing
 * them. For example, to hide sd card status and rc stick mode, it can be done by the
 * following two steps.
 * Define custom xmlns in its layout file:
 * xmlns:app="http://schemas.android.com/apk/res-auto"
 * Then, add following attribute to the SystemStatusListPanelWidget:
 * app:excludeItem="sd_card_status|rc_stick_mode".
 *
 * This panel widget also passes attributes to each of the child widgets created. See each
 * widget for individual customizations:
 * [OverviewListItemWidget],
 * [ReturnToHomeAltitudeListItemWidget],
 * [FlightModeListItemWidget],
 * [RCStickModeListItemWidget],
 * [RCBatteryListItemWidget],
 * [AircraftBatteryTemperatureListItemWidget],
 * [SDCardStatusListItemWidget],
 * [EMMCStatusListItemWidget],
 * [MaxAltitudeListItemWidget],
 * [MaxFlightDistanceListItemWidget],
 * [TravelModeListItemWidget].
 *
 * To customize the individual widgets, pass a theme in XML:
 * <code>android:theme="@style/UXSDKSystemStatusListTheme"</code
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ#\u0010\f\u001a\u000e\u0012\b\u0012\u00060\u000ej\u0002`\u000f\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0002\u00a2\u0006\u0002\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J,\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\u0016\u001a\u00020\u0014H\u0014J\b\u0010\u0017\u001a\u00020\u0014H\u0014\u00a8\u0006\u0018"}, d2 = {"Ldji/v5/ux/core/panel/systemstatus/SystemStatusListPanelWidget;", "Ldji/v5/ux/core/base/panel/ListPanelWidget;", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "configuration", "Ldji/v5/ux/core/base/panel/PanelWidgetConfiguration;", "(Landroid/content/Context;Landroid/util/AttributeSet;ILdji/v5/ux/core/base/panel/PanelWidgetConfiguration;)V", "getExcludedItems", "", "", "Ldji/v5/ux/core/base/panel/WidgetID;", "excludedItemsValue", "(Ljava/lang/Integer;)Ljava/util/Set;", "initAttributes", "initPanelWidget", "", "widgetConfiguration", "onSmartListModelCreated", "reactToModelChanges", "android-sdk-v5-uxsdk_debug"})
public final class SystemStatusListPanelWidget extends dji.v5.ux.core.base.panel.ListPanelWidget<java.lang.Object> {
    
    @kotlin.jvm.JvmOverloads
    public SystemStatusListPanelWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0, null);
    }
    
    @kotlin.jvm.JvmOverloads
    public SystemStatusListPanelWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0, null);
    }
    
    @kotlin.jvm.JvmOverloads
    public SystemStatusListPanelWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0, null);
    }
    
    @kotlin.jvm.JvmOverloads
    public SystemStatusListPanelWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.PanelWidgetConfiguration configuration) {
        super(null, null, 0, null);
    }
    
    @java.lang.Override
    protected void initPanelWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr, @org.jetbrains.annotations.Nullable
    dji.v5.ux.core.base.panel.PanelWidgetConfiguration widgetConfiguration) {
    }
    
    @java.lang.Override
    protected void onSmartListModelCreated() {
    }
    
    @java.lang.Override
    protected void reactToModelChanges() {
    }
    
    @android.annotation.SuppressLint(value = {"Recycle"})
    private final int initAttributes(android.content.Context context, android.util.AttributeSet attrs) {
        return 0;
    }
    
    private final java.util.Set<java.lang.String> getExcludedItems(java.lang.Integer excludedItemsValue) {
        return null;
    }
}