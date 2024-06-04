package dji.v5.ux.core.panel.topbar;

import java.lang.System;

/**
 * Container for the top bar widgets. This [BarPanelWidget] is divided into two parts.
 * The left list contains:
 * - [SystemStatusWidget]
 * The right list contains
 * - [FlightModeWidget]
 * - [SimulatorIndicatorWidget]
 * - [AirSenseWidget]
 * - [GPSSignalWidget]
 * - [PerceptionStateWidget]
 * - [RemoteControllerSignalWidget]
 * - [VideoSignalWidget]
 * - [BatteryWidget]
 * - [ConnectionWidget]
 *
 * * Customization:
 * Use the attribute "excludeItem" to permanently remove items from the list. This will prevent a
 * certain item from being created and shown throughout the lifecycle of the bar panel widget. Here are
 * all the flags: system_status, flight_mode, simulator_indicator, air_sense, gps_signal,
 * vision, rc_signal, video_signal, battery, connection.
 *
 * Note that multiple flags can be used simultaneously by logically OR'ing
 * them. For example, to hide flight_mode and vision, it can be done by the
 * following two steps.
 * Define custom xmlns in its layout file:
 * xmlns:app="http://schemas.android.com/apk/res-auto"
 * Then, add following attribute to the [TopBarPanelWidget]:
 * app:excludeItem="flight_mode|vision".
 *
 * This panel widget also passes attributes to each of the child widgets created. See each
 * individual's widget documentation for more customization options.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001EB/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\n\u0010=\u001a\u0004\u0018\u00010>H\u0016J\u0010\u0010?\u001a\u00020@2\u0006\u0010\u0005\u001a\u00020\u0006H\u0015J,\u0010A\u001a\u00020@2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010B\u001a\u0004\u0018\u00010CH\u0014J\b\u0010D\u001a\u00020@H\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010!\u001a\u0004\u0018\u00010\"\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010%\u001a\u0004\u0018\u00010&\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0013\u0010)\u001a\u0004\u0018\u00010*\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010-\u001a\u0004\u0018\u00010.\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u00101\u001a\u0004\u0018\u000102\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u00105\u001a\u0004\u0018\u000106\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0014\u00109\u001a\u00020:X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010<\u00a8\u0006F"}, d2 = {"Ldji/v5/ux/core/panel/topbar/TopBarPanelWidget;", "Ldji/v5/ux/core/base/panel/BarPanelWidget;", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "barPanelWidgetOrientation", "Ldji/v5/ux/core/base/panel/BarPanelWidget$BarPanelWidgetOrientation;", "(Landroid/content/Context;Landroid/util/AttributeSet;ILdji/v5/ux/core/base/panel/BarPanelWidget$BarPanelWidgetOrientation;)V", "airSenseWidget", "Ldji/v5/ux/core/widget/airsense/AirSenseWidget;", "getAirSenseWidget", "()Ldji/v5/ux/core/widget/airsense/AirSenseWidget;", "batteryWidget", "Ldji/v5/ux/core/widget/battery/BatteryWidget;", "getBatteryWidget", "()Ldji/v5/ux/core/widget/battery/BatteryWidget;", "deviceHealthAndStatusWidget", "Ldji/v5/ux/warning/DeviceHealthAndStatusWidget;", "getDeviceHealthAndStatusWidget", "()Ldji/v5/ux/warning/DeviceHealthAndStatusWidget;", "excludedItemsValue", "flightModeWidget", "Ldji/v5/ux/core/widget/flightmode/FlightModeWidget;", "getFlightModeWidget", "()Ldji/v5/ux/core/widget/flightmode/FlightModeWidget;", "gpsSignalWidget", "Ldji/v5/ux/core/widget/gpssignal/GpsSignalWidget;", "getGpsSignalWidget", "()Ldji/v5/ux/core/widget/gpssignal/GpsSignalWidget;", "remoteControllerSignalWidget", "Ldji/v5/ux/core/widget/remotecontrollersignal/RemoteControllerSignalWidget;", "getRemoteControllerSignalWidget", "()Ldji/v5/ux/core/widget/remotecontrollersignal/RemoteControllerSignalWidget;", "settingWidget", "Ldji/v5/ux/core/widget/setting/SettingWidget;", "getSettingWidget", "()Ldji/v5/ux/core/widget/setting/SettingWidget;", "simulatorIndicatorWidget", "Ldji/v5/ux/core/widget/simulator/SimulatorIndicatorWidget;", "getSimulatorIndicatorWidget", "()Ldji/v5/ux/core/widget/simulator/SimulatorIndicatorWidget;", "systemStatusWidget", "Ldji/v5/ux/core/widget/systemstatus/SystemStatusWidget;", "getSystemStatusWidget", "()Ldji/v5/ux/core/widget/systemstatus/SystemStatusWidget;", "videoSignalWidget", "Ldji/v5/ux/core/widget/videosignal/VideoSignalWidget;", "getVideoSignalWidget", "()Ldji/v5/ux/core/widget/videosignal/VideoSignalWidget;", "visionWidget", "Ldji/v5/ux/core/widget/perception/PerceptionStateWidget;", "getVisionWidget", "()Ldji/v5/ux/core/widget/perception/PerceptionStateWidget;", "widgetSizeDescription", "Ldji/v5/ux/core/base/WidgetSizeDescription;", "getWidgetSizeDescription", "()Ldji/v5/ux/core/base/WidgetSizeDescription;", "getIdealDimensionRatioString", "", "initAttributes", "", "initPanelWidget", "widgetConfiguration", "Ldji/v5/ux/core/base/panel/PanelWidgetConfiguration;", "reactToModelChanges", "WidgetValue", "android-sdk-v5-uxsdk_debug"})
public class TopBarPanelWidget extends dji.v5.ux.core.base.panel.BarPanelWidget<java.lang.Object> {
    @org.jetbrains.annotations.Nullable
    private final dji.v5.ux.warning.DeviceHealthAndStatusWidget deviceHealthAndStatusWidget = null;
    
    /**
     * Getter for [SystemStatusWidget]. Null when excluded from the bar panel.
     */
    @org.jetbrains.annotations.Nullable
    private final dji.v5.ux.core.widget.systemstatus.SystemStatusWidget systemStatusWidget = null;
    
    /**
     * Getter for [FlightModeWidget]. Null when excluded from the bar panel.
     */
    @org.jetbrains.annotations.Nullable
    private final dji.v5.ux.core.widget.flightmode.FlightModeWidget flightModeWidget = null;
    
    /**
     * Getter for [SimulatorIndicatorWidget]. Null when excluded from the bar panel.
     */
    @org.jetbrains.annotations.Nullable
    private final dji.v5.ux.core.widget.simulator.SimulatorIndicatorWidget simulatorIndicatorWidget = null;
    
    /**
     * Getter for [AirSenseWidget]. Null when excluded from the bar panel.
     */
    @org.jetbrains.annotations.Nullable
    private final dji.v5.ux.core.widget.airsense.AirSenseWidget airSenseWidget = null;
    
    /**
     * Getter for [GPSSignalWidget]. Null when excluded from the bar panel.
     */
    @org.jetbrains.annotations.Nullable
    private final dji.v5.ux.core.widget.gpssignal.GpsSignalWidget gpsSignalWidget = null;
    
    /**
     * Getter for [PerceptionStateWidget]. Null when excluded from the bar panel.
     */
    @org.jetbrains.annotations.Nullable
    private final dji.v5.ux.core.widget.perception.PerceptionStateWidget visionWidget = null;
    
    /**
     * Getter for [RemoteControllerSignalWidget]. Null when excluded from the bar panel.
     */
    @org.jetbrains.annotations.Nullable
    private final dji.v5.ux.core.widget.remotecontrollersignal.RemoteControllerSignalWidget remoteControllerSignalWidget = null;
    
    /**
     * Getter for [VideoSignalWidget]. Null when excluded from the bar panel.
     */
    @org.jetbrains.annotations.Nullable
    private final dji.v5.ux.core.widget.videosignal.VideoSignalWidget videoSignalWidget = null;
    
    /**
     * Getter for [BatteryWidget]. Null when excluded from the bar panel.
     */
    @org.jetbrains.annotations.Nullable
    private final dji.v5.ux.core.widget.battery.BatteryWidget batteryWidget = null;
    
    /**
     * Getter for [SettingWidget]. Null when excluded from the bar panel.
     */
    @org.jetbrains.annotations.Nullable
    private final dji.v5.ux.core.widget.setting.SettingWidget settingWidget = null;
    
    /**
     * Getter for [ConnectionWidget]. Null when excluded from the bar panel.
     */
    private int excludedItemsValue = 0;
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.base.WidgetSizeDescription widgetSizeDescription = null;
    
    @kotlin.jvm.JvmOverloads
    public TopBarPanelWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0, null);
    }
    
    @kotlin.jvm.JvmOverloads
    public TopBarPanelWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0, null);
    }
    
    @kotlin.jvm.JvmOverloads
    public TopBarPanelWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0, null);
    }
    
    @kotlin.jvm.JvmOverloads
    public TopBarPanelWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.BarPanelWidget.BarPanelWidgetOrientation barPanelWidgetOrientation) {
        super(null, null, 0, null);
    }
    
    @org.jetbrains.annotations.Nullable
    public final dji.v5.ux.warning.DeviceHealthAndStatusWidget getDeviceHealthAndStatusWidget() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final dji.v5.ux.core.widget.systemstatus.SystemStatusWidget getSystemStatusWidget() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final dji.v5.ux.core.widget.flightmode.FlightModeWidget getFlightModeWidget() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final dji.v5.ux.core.widget.simulator.SimulatorIndicatorWidget getSimulatorIndicatorWidget() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final dji.v5.ux.core.widget.airsense.AirSenseWidget getAirSenseWidget() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final dji.v5.ux.core.widget.gpssignal.GpsSignalWidget getGpsSignalWidget() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final dji.v5.ux.core.widget.perception.PerceptionStateWidget getVisionWidget() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final dji.v5.ux.core.widget.remotecontrollersignal.RemoteControllerSignalWidget getRemoteControllerSignalWidget() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final dji.v5.ux.core.widget.videosignal.VideoSignalWidget getVideoSignalWidget() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final dji.v5.ux.core.widget.battery.BatteryWidget getBatteryWidget() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final dji.v5.ux.core.widget.setting.SettingWidget getSettingWidget() {
        return null;
    }
    
    @java.lang.Override
    protected void initPanelWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr, @org.jetbrains.annotations.Nullable
    dji.v5.ux.core.base.panel.PanelWidgetConfiguration widgetConfiguration) {
    }
    
    @android.annotation.SuppressLint(value = {"Recycle"})
    @java.lang.Override
    protected void initAttributes(@org.jetbrains.annotations.NotNull
    android.util.AttributeSet attrs) {
    }
    
    @java.lang.Override
    protected void reactToModelChanges() {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String getIdealDimensionRatioString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dji.v5.ux.core.base.WidgetSizeDescription getWidgetSizeDescription() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015\u00a8\u0006\u0016"}, d2 = {"Ldji/v5/ux/core/panel/topbar/TopBarPanelWidget$WidgetValue;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "isItemExcluded", "", "excludeItems", "SYSTEM_STATUS", "DEVICE_HEALTH", "FLIGHT_MODE", "SIMULATOR_INDICATOR", "AIR_SENSE", "GPS_SIGNAL", "VISION", "RC_SIGNAL", "VIDEO_SIGNAL", "BATTERY", "SETTING", "CONNECTION", "android-sdk-v5-uxsdk_debug"})
    static enum WidgetValue {
        /*public static final*/ SYSTEM_STATUS /* = new SYSTEM_STATUS(0) */,
        /*public static final*/ DEVICE_HEALTH /* = new DEVICE_HEALTH(0) */,
        /*public static final*/ FLIGHT_MODE /* = new FLIGHT_MODE(0) */,
        /*public static final*/ SIMULATOR_INDICATOR /* = new SIMULATOR_INDICATOR(0) */,
        /*public static final*/ AIR_SENSE /* = new AIR_SENSE(0) */,
        /*public static final*/ GPS_SIGNAL /* = new GPS_SIGNAL(0) */,
        /*public static final*/ VISION /* = new VISION(0) */,
        /*public static final*/ RC_SIGNAL /* = new RC_SIGNAL(0) */,
        /*public static final*/ VIDEO_SIGNAL /* = new VIDEO_SIGNAL(0) */,
        /*public static final*/ BATTERY /* = new BATTERY(0) */,
        /*public static final*/ SETTING /* = new SETTING(0) */,
        /*public static final*/ CONNECTION /* = new CONNECTION(0) */;
        private final int value = 0;
        
        WidgetValue(int value) {
        }
        
        public final int getValue() {
            return 0;
        }
        
        public final boolean isItemExcluded(int excludeItems) {
            return false;
        }
    }
}