package dji.v5.ux.core.panel.telemetry;

import java.lang.System;

/**
 * Compound widget that aggregates important physical state information
 * about the aircraft into a dashboard.
 * <p>
 * It includes the [AMSLAltitudeWidget], [AGLAltitudeWidget],
 * [DistanceHomeWidget], [DistanceRCWidget], [HorizontalVelocityWidget],
 * [VerticalVelocityWidget], [VPSWidget] and the [LocationWidget].
 * <p>
 * This widget can be customized to exclude any of these widgets
 * as required. A widget excluded will not be created.
 * Individual widgets can be accessed using the paneID of each widget
 * and the function [TelemetryPanelWidget.viewInPane].
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000212B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u00a2\u0006\u0002\u0010\fJ\b\u0010\"\u001a\u00020#H\u0002J!\u0010$\u001a\f\u0012\b\u0012\u00060\u0018j\u0002`\u00190\u00172\b\u0010%\u001a\u0004\u0018\u00010\bH\u0002\u00a2\u0006\u0002\u0010&J\n\u0010\'\u001a\u0004\u0018\u00010\u0018H\u0016J\u0018\u0010(\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J\b\u0010)\u001a\u00020#H\u0014J)\u0010*\u001a\u00020#\"\b\b\u0000\u0010+*\u00020,2\u0006\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002H+00H\u0082\bR\u0011\u0010\r\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0018\u0010\u0016\u001a\f\u0012\b\u0012\u00060\u0018j\u0002`\u00190\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001a\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000fR\u0011\u0010\u001c\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000fR\u0011\u0010\u001e\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u000fR\u0011\u0010 \u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u000fR\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Ldji/v5/ux/core/panel/telemetry/TelemetryPanelWidget;", "Ldji/v5/ux/core/base/panel/FreeFormPanelWidget;", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "configuration", "Ldji/v5/ux/core/base/panel/PanelWidgetConfiguration;", "widgetTheme", "(Landroid/content/Context;Landroid/util/AttributeSet;ILdji/v5/ux/core/base/panel/PanelWidgetConfiguration;I)V", "aglAltitudeWidgetPaneID", "getAglAltitudeWidgetPaneID", "()I", "amslAltitudeWidgetPaneID", "getAmslAltitudeWidgetPaneID", "distanceHomeWidgetPaneID", "getDistanceHomeWidgetPaneID", "distanceRCWidgetPaneID", "getDistanceRCWidgetPaneID", "excludedItemSet", "", "", "Ldji/v5/ux/core/panel/telemetry/WidgetID;", "horizontalVelocityWidgetPaneID", "getHorizontalVelocityWidgetPaneID", "locationWidgetPaneID", "getLocationWidgetPaneID", "verticalVelocityWidgetPaneID", "getVerticalVelocityWidgetPaneID", "vpsWidgetPaneID", "getVpsWidgetPaneID", "addWidgetsToPanel", "", "getExcludeListSet", "excludeListValue", "(Ljava/lang/Integer;)Ljava/util/Set;", "getIdealDimensionRatioString", "initAttributes", "reactToModelChanges", "setPane", "R", "Landroid/view/View;", "pane", "Ldji/v5/ux/core/panel/telemetry/TelemetryPanelWidget$Pane;", "createWidgetBlock", "Lkotlin/Function0;", "Pane", "TelemetryPanelItem", "android-sdk-v5-uxsdk_debug"})
public class TelemetryPanelWidget extends dji.v5.ux.core.base.panel.FreeFormPanelWidget<java.lang.Object> {
    private int widgetTheme;
    private java.util.Set<java.lang.String> excludedItemSet;
    
    /**
     * Pane ID of the [AMSLAltitudeWidget]
     */
    private final int amslAltitudeWidgetPaneID = 0;
    
    /**
     * Pane ID of the [AGLAltitudeWidget]
     */
    private final int aglAltitudeWidgetPaneID = 0;
    
    /**
     * Pane ID of the [HorizontalVelocityWidget]
     */
    private final int horizontalVelocityWidgetPaneID = 0;
    
    /**
     * Pane ID of the [DistanceRCWidget]
     */
    private final int distanceRCWidgetPaneID = 0;
    
    /**
     * Pane ID of the [DistanceHomeWidget]
     */
    private final int distanceHomeWidgetPaneID = 0;
    
    /**
     * Pane ID of the [VerticalVelocityWidget]
     */
    private final int verticalVelocityWidgetPaneID = 0;
    
    /**
     * Pane ID of the [VPSWidget]
     */
    private final int vpsWidgetPaneID = 0;
    
    /**
     * Pane ID of the [LocationWidget]
     */
    private final int locationWidgetPaneID = 0;
    
    @kotlin.jvm.JvmOverloads
    public TelemetryPanelWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0, null);
    }
    
    @kotlin.jvm.JvmOverloads
    public TelemetryPanelWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0, null);
    }
    
    @kotlin.jvm.JvmOverloads
    public TelemetryPanelWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0, null);
    }
    
    @kotlin.jvm.JvmOverloads
    public TelemetryPanelWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.PanelWidgetConfiguration configuration) {
        super(null, null, 0, null);
    }
    
    @kotlin.jvm.JvmOverloads
    public TelemetryPanelWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.panel.PanelWidgetConfiguration configuration, int widgetTheme) {
        super(null, null, 0, null);
    }
    
    public final int getAmslAltitudeWidgetPaneID() {
        return 0;
    }
    
    public final int getAglAltitudeWidgetPaneID() {
        return 0;
    }
    
    public final int getHorizontalVelocityWidgetPaneID() {
        return 0;
    }
    
    public final int getDistanceRCWidgetPaneID() {
        return 0;
    }
    
    public final int getDistanceHomeWidgetPaneID() {
        return 0;
    }
    
    public final int getVerticalVelocityWidgetPaneID() {
        return 0;
    }
    
    public final int getVpsWidgetPaneID() {
        return 0;
    }
    
    public final int getLocationWidgetPaneID() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"Recycle"})
    private final void initAttributes(android.content.Context context, android.util.AttributeSet attrs) {
    }
    
    private final java.util.Set<java.lang.String> getExcludeListSet(java.lang.Integer excludeListValue) {
        return null;
    }
    
    private final void addWidgetsToPanel() {
    }
    
    private final <R extends android.view.View>void setPane(dji.v5.ux.core.panel.telemetry.TelemetryPanelWidget.Pane pane, kotlin.jvm.functions.Function0<? extends R> createWidgetBlock) {
    }
    
    @java.lang.Override
    protected void reactToModelChanges() {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String getIdealDimensionRatioString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00d6\u0001J\t\u0010#\u001a\u00020$H\u00d6\u0001R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e\u00a8\u0006%"}, d2 = {"Ldji/v5/ux/core/panel/telemetry/TelemetryPanelWidget$Pane;", "", "panelItem", "Ldji/v5/ux/core/panel/telemetry/TelemetryPanelWidget$TelemetryPanelItem;", "paneID", "", "position", "Ldji/v5/ux/core/base/panel/FreeFormPanelWidget$ViewAlignment;", "leftMargin", "topMargin", "rightMargin", "bottomMargin", "(Ldji/v5/ux/core/panel/telemetry/TelemetryPanelWidget$TelemetryPanelItem;ILdji/v5/ux/core/base/panel/FreeFormPanelWidget$ViewAlignment;IIII)V", "getBottomMargin", "()I", "getLeftMargin", "getPaneID", "getPanelItem", "()Ldji/v5/ux/core/panel/telemetry/TelemetryPanelWidget$TelemetryPanelItem;", "getPosition", "()Ldji/v5/ux/core/base/panel/FreeFormPanelWidget$ViewAlignment;", "getRightMargin", "getTopMargin", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "android-sdk-v5-uxsdk_debug"})
    static final class Pane {
        @org.jetbrains.annotations.NotNull
        private final dji.v5.ux.core.panel.telemetry.TelemetryPanelWidget.TelemetryPanelItem panelItem = null;
        private final int paneID = 0;
        @org.jetbrains.annotations.NotNull
        private final dji.v5.ux.core.base.panel.FreeFormPanelWidget.ViewAlignment position = null;
        private final int leftMargin = 0;
        private final int topMargin = 0;
        private final int rightMargin = 0;
        private final int bottomMargin = 0;
        
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.core.panel.telemetry.TelemetryPanelWidget.Pane copy(@org.jetbrains.annotations.NotNull
        dji.v5.ux.core.panel.telemetry.TelemetryPanelWidget.TelemetryPanelItem panelItem, int paneID, @org.jetbrains.annotations.NotNull
        dji.v5.ux.core.base.panel.FreeFormPanelWidget.ViewAlignment position, int leftMargin, int topMargin, int rightMargin, int bottomMargin) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public Pane(@org.jetbrains.annotations.NotNull
        dji.v5.ux.core.panel.telemetry.TelemetryPanelWidget.TelemetryPanelItem panelItem, int paneID, @org.jetbrains.annotations.NotNull
        dji.v5.ux.core.base.panel.FreeFormPanelWidget.ViewAlignment position, int leftMargin, int topMargin, int rightMargin, int bottomMargin) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.core.panel.telemetry.TelemetryPanelWidget.TelemetryPanelItem component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.core.panel.telemetry.TelemetryPanelWidget.TelemetryPanelItem getPanelItem() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getPaneID() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.core.base.panel.FreeFormPanelWidget.ViewAlignment component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.core.base.panel.FreeFormPanelWidget.ViewAlignment getPosition() {
            return null;
        }
        
        public final int component4() {
            return 0;
        }
        
        public final int getLeftMargin() {
            return 0;
        }
        
        public final int component5() {
            return 0;
        }
        
        public final int getTopMargin() {
            return 0;
        }
        
        public final int component6() {
            return 0;
        }
        
        public final int getRightMargin() {
            return 0;
        }
        
        public final int component7() {
            return 0;
        }
        
        public final int getBottomMargin() {
            return 0;
        }
    }
    
    /**
     * Default Widgets for the [TelemetryPanelWidget]
     * @property widgetID Identifier for the item
     * @property value Int value for excluding items
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\u001b\b\u0002\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016\u00a8\u0006\u0018"}, d2 = {"Ldji/v5/ux/core/panel/telemetry/TelemetryPanelWidget$TelemetryPanelItem;", "", "widgetID", "", "Ldji/v5/ux/core/panel/telemetry/WidgetID;", "value", "", "(Ljava/lang/String;ILjava/lang/String;I)V", "getValue", "()I", "getWidgetID", "()Ljava/lang/String;", "isItemExcluded", "", "excludeItems", "AMSL_ALTITUDE", "AGL_ALTITUDE", "HORIZONTAL_VELOCITY", "DISTANCE_RC", "DISTANCE_HOME", "VERTICAL_VELOCITY", "VPS", "LOCATION", "Companion", "android-sdk-v5-uxsdk_debug"})
    public static enum TelemetryPanelItem {
        /*public static final*/ AMSL_ALTITUDE /* = new AMSL_ALTITUDE(null, 0) */,
        /*public static final*/ AGL_ALTITUDE /* = new AGL_ALTITUDE(null, 0) */,
        /*public static final*/ HORIZONTAL_VELOCITY /* = new HORIZONTAL_VELOCITY(null, 0) */,
        /*public static final*/ DISTANCE_RC /* = new DISTANCE_RC(null, 0) */,
        /*public static final*/ DISTANCE_HOME /* = new DISTANCE_HOME(null, 0) */,
        /*public static final*/ VERTICAL_VELOCITY /* = new VERTICAL_VELOCITY(null, 0) */,
        /*public static final*/ VPS /* = new VPS(null, 0) */,
        /*public static final*/ LOCATION /* = new LOCATION(null, 0) */;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String widgetID = null;
        private final int value = 0;
        @org.jetbrains.annotations.NotNull
        public static final dji.v5.ux.core.panel.telemetry.TelemetryPanelWidget.TelemetryPanelItem.Companion Companion = null;
        @org.jetbrains.annotations.NotNull
        private static final dji.v5.ux.core.panel.telemetry.TelemetryPanelWidget.TelemetryPanelItem[] values = null;
        
        TelemetryPanelItem(java.lang.String widgetID, int value) {
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
        public static final dji.v5.ux.core.panel.telemetry.TelemetryPanelWidget.TelemetryPanelItem[] getValues() {
            return null;
        }
        
        /**
         * Create a [TelemetryPanelItem] from a [WidgetID].
         */
        @org.jetbrains.annotations.Nullable
        @kotlin.jvm.JvmStatic
        public static final dji.v5.ux.core.panel.telemetry.TelemetryPanelWidget.TelemetryPanelItem from(@org.jetbrains.annotations.NotNull
        java.lang.String widgetID) {
            return null;
        }
        
        /**
         * Create a [TelemetryPanelItem] from an int value.
         */
        @org.jetbrains.annotations.Nullable
        @kotlin.jvm.JvmStatic
        public static final dji.v5.ux.core.panel.telemetry.TelemetryPanelWidget.TelemetryPanelItem from(int value) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u0004\u0018\u00010\u00052\n\u0010\u000b\u001a\u00060\fj\u0002`\rH\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\t\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0010"}, d2 = {"Ldji/v5/ux/core/panel/telemetry/TelemetryPanelWidget$TelemetryPanelItem$Companion;", "", "()V", "values", "", "Ldji/v5/ux/core/panel/telemetry/TelemetryPanelWidget$TelemetryPanelItem;", "getValues$annotations", "getValues", "()[Ldji/v5/ux/core/panel/telemetry/TelemetryPanelWidget$TelemetryPanelItem;", "[Ldji/v5/ux/core/panel/telemetry/TelemetryPanelWidget$TelemetryPanelItem;", "from", "widgetID", "", "Ldji/v5/ux/core/panel/telemetry/WidgetID;", "value", "", "android-sdk-v5-uxsdk_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.panel.telemetry.TelemetryPanelWidget.TelemetryPanelItem[] getValues() {
                return null;
            }
            
            @kotlin.jvm.JvmStatic
            @java.lang.Deprecated
            public static void getValues$annotations() {
            }
            
            /**
             * Create a [TelemetryPanelItem] from a [WidgetID].
             */
            @org.jetbrains.annotations.Nullable
            @kotlin.jvm.JvmStatic
            public final dji.v5.ux.core.panel.telemetry.TelemetryPanelWidget.TelemetryPanelItem from(@org.jetbrains.annotations.NotNull
            java.lang.String widgetID) {
                return null;
            }
            
            /**
             * Create a [TelemetryPanelItem] from an int value.
             */
            @org.jetbrains.annotations.Nullable
            @kotlin.jvm.JvmStatic
            public final dji.v5.ux.core.panel.telemetry.TelemetryPanelWidget.TelemetryPanelItem from(int value) {
                return null;
            }
        }
    }
}