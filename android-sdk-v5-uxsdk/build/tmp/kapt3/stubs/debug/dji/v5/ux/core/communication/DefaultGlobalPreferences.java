package dji.v5.ux.core.communication;

import java.lang.System;

/**
 * Default implementation of the GlobalPreferencesInterface using SharedPreferences.
 * These settings will persist across app restarts.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 =2\u00020\u0001:\u0001=B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010:\u001a\u00020;H\u0016J\b\u0010<\u001a\u00020;H\u0016R*\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068W@WX\u0096\u000e\u00a2\u0006\u0012\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\u000f8W@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u00020!2\u0006\u0010 \u001a\u00020!8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010\'\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\'\u0010\u000b\"\u0004\b(\u0010\rR$\u0010)\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b)\u0010\u000b\"\u0004\b*\u0010\rR\u000e\u0010+\u001a\u00020,X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020.8V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00104\u001a\u0002052\u0006\u00104\u001a\u0002058V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109\u00a8\u0006>"}, d2 = {"Ldji/v5/ux/core/communication/DefaultGlobalPreferences;", "Ldji/v5/ux/core/communication/GlobalPreferencesInterface;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "enabled", "", "afcEnabled", "getAFCEnabled$annotations", "()V", "getAFCEnabled", "()Z", "setAFCEnabled", "(Z)V", "centerPointColor", "", "getCenterPointColor", "()I", "setCenterPointColor", "(I)V", "centerPointType", "Ldji/v5/ux/core/ui/CenterPointView$CenterPointType;", "getCenterPointType", "()Ldji/v5/ux/core/ui/CenterPointView$CenterPointType;", "setCenterPointType", "(Ldji/v5/ux/core/ui/CenterPointView$CenterPointType;)V", "controlMode", "Ldji/v5/ux/core/util/SettingDefinitions$ControlMode;", "getControlMode", "()Ldji/v5/ux/core/util/SettingDefinitions$ControlMode;", "setControlMode", "(Ldji/v5/ux/core/util/SettingDefinitions$ControlMode;)V", "gridLineType", "Ldji/v5/ux/core/ui/GridLineView$GridLineType;", "getGridLineType", "()Ldji/v5/ux/core/ui/GridLineView$GridLineType;", "setGridLineType", "(Ldji/v5/ux/core/ui/GridLineView$GridLineType;)V", "neverShown", "isAirSenseTermsNeverShown", "setAirSenseTermsNeverShown", "isUnitModeDialogNeverShown", "setUnitModeDialogNeverShown", "sharedPreferences", "Landroid/content/SharedPreferences;", "temperatureUnit", "Ldji/v5/ux/core/util/UnitConversionUtil$TemperatureUnitType;", "temperatureUnitType", "getTemperatureUnitType", "()Ldji/v5/ux/core/util/UnitConversionUtil$TemperatureUnitType;", "setTemperatureUnitType", "(Ldji/v5/ux/core/util/UnitConversionUtil$TemperatureUnitType;)V", "unitType", "Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "getUnitType", "()Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "setUnitType", "(Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;)V", "cleanup", "", "setUpListener", "Companion", "android-sdk-v5-uxsdk_debug"})
public final class DefaultGlobalPreferences implements dji.v5.ux.core.communication.GlobalPreferencesInterface {
    private final android.content.SharedPreferences sharedPreferences = null;
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.core.communication.DefaultGlobalPreferences.Companion Companion = null;
    private static final java.lang.String PREF_IS_AFC_ENABLED = "afcEnabled";
    private static final java.lang.String PREF_GLOBAL_UNIT_TYPE = "globalUnitType";
    private static final java.lang.String PREF_TEMPERATURE_UNIT_TYPE = "temperatureUnitType";
    private static final java.lang.String PREF_AIR_SENSE_TERMS_NEVER_SHOWN = "airSenseTerms";
    private static final java.lang.String PREF_GRID_LINE_TYPE = "gridLineType";
    private static final java.lang.String PREF_CENTER_POINT_TYPE = "centerPointType";
    private static final java.lang.String PREF_CENTER_POINT_COLOR = "centerPointColor";
    private static final java.lang.String PREF_CONTROL_MODE = "controlMode";
    private static final java.lang.String PREF_UNIT_MODE_DIALOG_NEVER_SHOWN = "unitMode";
    
    public DefaultGlobalPreferences(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @java.lang.Override
    public void setUpListener() {
    }
    
    @java.lang.Override
    public void cleanup() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dji.v5.ux.core.util.UnitConversionUtil.UnitType getUnitType() {
        return null;
    }
    
    @java.lang.Override
    public void setUnitType(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.util.UnitConversionUtil.UnitType unitType) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dji.v5.ux.core.util.UnitConversionUtil.TemperatureUnitType getTemperatureUnitType() {
        return null;
    }
    
    @java.lang.Override
    public void setTemperatureUnitType(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.util.UnitConversionUtil.TemperatureUnitType temperatureUnit) {
    }
    
    @kotlin.Suppress(names = {"INAPPLICABLE_JVM_NAME"})
    @java.lang.Override
    @java.lang.Deprecated
    public static void getAFCEnabled$annotations() {
    }
    
    @kotlin.jvm.JvmName(name = "getAFCEnabled")
    @java.lang.Override
    public boolean getAFCEnabled() {
        return false;
    }
    
    @kotlin.jvm.JvmName(name = "setAFCEnabled")
    @java.lang.Override
    public void setAFCEnabled(boolean enabled) {
    }
    
    @java.lang.Override
    public boolean isAirSenseTermsNeverShown() {
        return false;
    }
    
    @java.lang.Override
    public void setAirSenseTermsNeverShown(boolean neverShown) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dji.v5.ux.core.ui.GridLineView.GridLineType getGridLineType() {
        return null;
    }
    
    @java.lang.Override
    public void setGridLineType(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.ui.GridLineView.GridLineType gridLineType) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dji.v5.ux.core.ui.CenterPointView.CenterPointType getCenterPointType() {
        return null;
    }
    
    @java.lang.Override
    public void setCenterPointType(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.ui.CenterPointView.CenterPointType centerPointType) {
    }
    
    @androidx.annotation.ColorInt
    @java.lang.Override
    public int getCenterPointColor() {
        return 0;
    }
    
    @java.lang.Override
    public void setCenterPointColor(@androidx.annotation.ColorInt
    int centerPointColor) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dji.v5.ux.core.util.SettingDefinitions.ControlMode getControlMode() {
        return null;
    }
    
    @java.lang.Override
    public void setControlMode(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.util.SettingDefinitions.ControlMode controlMode) {
    }
    
    @java.lang.Override
    public boolean isUnitModeDialogNeverShown() {
        return false;
    }
    
    @java.lang.Override
    public void setUnitModeDialogNeverShown(boolean neverShown) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/core/communication/DefaultGlobalPreferences$Companion;", "", "()V", "PREF_AIR_SENSE_TERMS_NEVER_SHOWN", "", "PREF_CENTER_POINT_COLOR", "PREF_CENTER_POINT_TYPE", "PREF_CONTROL_MODE", "PREF_GLOBAL_UNIT_TYPE", "PREF_GRID_LINE_TYPE", "PREF_IS_AFC_ENABLED", "PREF_TEMPERATURE_UNIT_TYPE", "PREF_UNIT_MODE_DIALOG_NEVER_SHOWN", "getSharedPreferences", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "android-sdk-v5-uxsdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final android.content.SharedPreferences getSharedPreferences(android.content.Context context) {
            return null;
        }
    }
}