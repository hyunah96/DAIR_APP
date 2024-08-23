package dji.v5.ux.core.panel.systemstatus;

import java.lang.System;

/**
 * [SmartListModel] to handheld what items should be shown for the [SystemStatusListPanelWidget].
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u0001\'B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\b\u0012\u00060\bj\u0002`\t\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u0015\u001a\u00020\u00162\n\u0010\u0017\u001a\u00060\bj\u0002`\tH\u0014J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0019H\u0014J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020 H\u0002J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020 H\u0014J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010&\u001a\u00020\u0019H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R%\u0010\u000b\u001a\f\u0012\b\u0012\u00060\bj\u0002`\t0\u00078VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR%\u0010\u0010\u001a\f\u0012\b\u0012\u00060\bj\u0002`\t0\u00118VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006("}, d2 = {"Ldji/v5/ux/core/panel/systemstatus/SystemStatusSmartListModel;", "Ldji/v5/ux/core/base/panel/SmartListModel;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "excludedItems", "", "", "Ldji/v5/ux/core/base/panel/WidgetID;", "(Landroid/content/Context;Landroid/util/AttributeSet;Ljava/util/Set;)V", "defaultActiveWidgetSet", "getDefaultActiveWidgetSet", "()Ljava/util/Set;", "defaultActiveWidgetSet$delegate", "Lkotlin/Lazy;", "registeredWidgetIDList", "", "getRegisteredWidgetIDList", "()Ljava/util/List;", "registeredWidgetIDList$delegate", "createWidget", "Landroid/view/View;", "widgetID", "inCleanUp", "", "inSetUp", "onAircraftModelChanged", "model", "Ldji/sdk/keyvalue/value/product/ProductType;", "onInternalStorageSupported", "supported", "", "onLandingGearUpdate", "movable", "onProductConnectionChanged", "isConnected", "onSSDSupported", "resetSystemStatusListToDefault", "SystemStatusListItem", "android-sdk-v5-uxsdk_debug"})
public class SystemStatusSmartListModel extends dji.v5.ux.core.base.panel.SmartListModel {
    private final android.util.AttributeSet attrs = null;
    
    /**
     * List of [WidgetID] of widgets that are allowed in this list.
     */
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy registeredWidgetIDList$delegate = null;
    
    /**
     * Default set of widgets that should be shown
     */
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy defaultActiveWidgetSet$delegate = null;
    
    @kotlin.jvm.JvmOverloads
    public SystemStatusSmartListModel(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, null);
    }
    
    @kotlin.jvm.JvmOverloads
    public SystemStatusSmartListModel(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, null);
    }
    
    @kotlin.jvm.JvmOverloads
    public SystemStatusSmartListModel(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, @org.jetbrains.annotations.Nullable
    java.util.Set<java.lang.String> excludedItems) {
        super(null, null, null);
    }
    
    /**
     * List of [WidgetID] of widgets that are allowed in this list.
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<java.lang.String> getRegisteredWidgetIDList() {
        return null;
    }
    
    /**
     * Default set of widgets that should be shown
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.Set<java.lang.String> getDefaultActiveWidgetSet() {
        return null;
    }
    
    @java.lang.Override
    protected void inSetUp() {
    }
    
    @java.lang.Override
    protected void inCleanUp() {
    }
    
    @java.lang.Override
    protected void onAircraftModelChanged(@org.jetbrains.annotations.NotNull
    dji.sdk.keyvalue.value.product.ProductType model) {
    }
    
    @java.lang.Override
    protected void onProductConnectionChanged(boolean isConnected) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected android.view.View createWidget(@org.jetbrains.annotations.NotNull
    java.lang.String widgetID) {
        return null;
    }
    
    private final void resetSystemStatusListToDefault() {
    }
    
    private final void onLandingGearUpdate(boolean movable) {
    }
    
    private final void onInternalStorageSupported(boolean supported) {
    }
    
    private final void onSSDSupported(boolean supported) {
    }
    
    /**
     * Default Widgets for the [SystemStatusListPanelWidget]
     * @property widgetID Identifier for the item
     * @property value Int value for excluding items
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001eB\u001b\b\u0002\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d\u00a8\u0006\u001f"}, d2 = {"Ldji/v5/ux/core/panel/systemstatus/SystemStatusSmartListModel$SystemStatusListItem;", "", "widgetID", "", "Ldji/v5/ux/core/base/panel/WidgetID;", "value", "", "(Ljava/lang/String;ILjava/lang/String;I)V", "getValue", "()I", "getWidgetID", "()Ljava/lang/String;", "isItemExcluded", "", "excludeItems", "FLIGHT_MODE", "RC_STICK_MODE", "RC_BATTERY", "AIRCRAFT_BATTERY_TEMPERATURE", "SD_CARD_STATUS", "EMMC_STATUS", "MAX_ALTITUDE", "MAX_FLIGHT_DISTANCE", "TRAVEL_MODE", "UNIT_MODE", "SSD_STATUS", "NOVICE_MODE", "OVERVIEW_STATUS", "RTH_ALTITUDE", "OBSTACLE_AVOIDANCE", "Companion", "android-sdk-v5-uxsdk_debug"})
    public static enum SystemStatusListItem {
        /*public static final*/ FLIGHT_MODE /* = new FLIGHT_MODE(null, 0) */,
        /*public static final*/ RC_STICK_MODE /* = new RC_STICK_MODE(null, 0) */,
        /*public static final*/ RC_BATTERY /* = new RC_BATTERY(null, 0) */,
        /*public static final*/ AIRCRAFT_BATTERY_TEMPERATURE /* = new AIRCRAFT_BATTERY_TEMPERATURE(null, 0) */,
        /*public static final*/ SD_CARD_STATUS /* = new SD_CARD_STATUS(null, 0) */,
        /*public static final*/ EMMC_STATUS /* = new EMMC_STATUS(null, 0) */,
        /*public static final*/ MAX_ALTITUDE /* = new MAX_ALTITUDE(null, 0) */,
        /*public static final*/ MAX_FLIGHT_DISTANCE /* = new MAX_FLIGHT_DISTANCE(null, 0) */,
        /*public static final*/ TRAVEL_MODE /* = new TRAVEL_MODE(null, 0) */,
        /*public static final*/ UNIT_MODE /* = new UNIT_MODE(null, 0) */,
        /*public static final*/ SSD_STATUS /* = new SSD_STATUS(null, 0) */,
        /*public static final*/ NOVICE_MODE /* = new NOVICE_MODE(null, 0) */,
        /*public static final*/ OVERVIEW_STATUS /* = new OVERVIEW_STATUS(null, 0) */,
        /*public static final*/ RTH_ALTITUDE /* = new RTH_ALTITUDE(null, 0) */,
        /*public static final*/ OBSTACLE_AVOIDANCE /* = new OBSTACLE_AVOIDANCE(null, 0) */;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String widgetID = null;
        private final int value = 0;
        @org.jetbrains.annotations.NotNull
        public static final dji.v5.ux.core.panel.systemstatus.SystemStatusSmartListModel.SystemStatusListItem.Companion Companion = null;
        @org.jetbrains.annotations.NotNull
        private static final dji.v5.ux.core.panel.systemstatus.SystemStatusSmartListModel.SystemStatusListItem[] values = null;
        
        SystemStatusListItem(java.lang.String widgetID, int value) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getWidgetID() {
            return null;
        }
        
        public final int getValue() {
            return 0;
        }
        
        /**
         * Checks if the item is excluded given the flag [excludeItems].
         */
        public final boolean isItemExcluded(int excludeItems) {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public static final dji.v5.ux.core.panel.systemstatus.SystemStatusSmartListModel.SystemStatusListItem[] getValues() {
            return null;
        }
        
        /**
         * Create a [SystemStatusListItem] from a [WidgetID].
         */
        @org.jetbrains.annotations.Nullable
        @kotlin.jvm.JvmStatic
        public static final dji.v5.ux.core.panel.systemstatus.SystemStatusSmartListModel.SystemStatusListItem from(@org.jetbrains.annotations.NotNull
        java.lang.String widgetID) {
            return null;
        }
        
        /**
         * Create a [SystemStatusListItem] from an int value.
         */
        @org.jetbrains.annotations.Nullable
        @kotlin.jvm.JvmStatic
        public static final dji.v5.ux.core.panel.systemstatus.SystemStatusSmartListModel.SystemStatusListItem from(int value) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u0004\u0018\u00010\u00052\n\u0010\u000b\u001a\u00060\fj\u0002`\rH\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\t\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0010"}, d2 = {"Ldji/v5/ux/core/panel/systemstatus/SystemStatusSmartListModel$SystemStatusListItem$Companion;", "", "()V", "values", "", "Ldji/v5/ux/core/panel/systemstatus/SystemStatusSmartListModel$SystemStatusListItem;", "getValues$annotations", "getValues", "()[Ldji/v5/ux/core/panel/systemstatus/SystemStatusSmartListModel$SystemStatusListItem;", "[Ldji/v5/ux/core/panel/systemstatus/SystemStatusSmartListModel$SystemStatusListItem;", "from", "widgetID", "", "Ldji/v5/ux/core/base/panel/WidgetID;", "value", "", "android-sdk-v5-uxsdk_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.systemstatus.SystemStatusSmartListModel.SystemStatusListItem[] getValues() {
                return null;
            }
            
            @kotlin.jvm.JvmStatic
            @java.lang.Deprecated
            public static void getValues$annotations() {
            }
            
            /**
             * Create a [SystemStatusListItem] from a [WidgetID].
             */
            @org.jetbrains.annotations.Nullable
            @kotlin.jvm.JvmStatic
            public final dji.v5.ux.core.panel.systemstatus.SystemStatusSmartListModel.SystemStatusListItem from(@org.jetbrains.annotations.NotNull
            java.lang.String widgetID) {
                return null;
            }
            
            /**
             * Create a [SystemStatusListItem] from an int value.
             */
            @org.jetbrains.annotations.Nullable
            @kotlin.jvm.JvmStatic
            public final dji.v5.ux.core.panel.systemstatus.SystemStatusSmartListModel.SystemStatusListItem from(int value) {
                return null;
            }
        }
    }
}