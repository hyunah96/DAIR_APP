package dji.v5.ux.core.communication;

import java.lang.System;

/**
 * Interface to be implemented for functions included under
 * global preferences. These settings will persist across app restarts.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u00103\u001a\u000204H&J\b\u00105\u001a\u000204H&R*\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX\u00a6\u000e\u00a2\u0006\u0012\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR&\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0002\u001a\u00020\u000b8g@fX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u00020\u0012X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u00020\u0018X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u00020\u001eX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0018\u0010#\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b#\u0010\b\"\u0004\b$\u0010\nR\u0018\u0010%\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b%\u0010\b\"\u0004\b&\u0010\nR\u0018\u0010\'\u001a\u00020(X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0018\u0010-\u001a\u00020.X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102\u00a8\u00066"}, d2 = {"Ldji/v5/ux/core/communication/GlobalPreferencesInterface;", "", "<set-?>", "", "afcEnabled", "getAFCEnabled$annotations", "()V", "getAFCEnabled", "()Z", "setAFCEnabled", "(Z)V", "", "centerPointColor", "getCenterPointColor", "()I", "setCenterPointColor", "(I)V", "centerPointType", "Ldji/v5/ux/core/ui/CenterPointView$CenterPointType;", "getCenterPointType", "()Ldji/v5/ux/core/ui/CenterPointView$CenterPointType;", "setCenterPointType", "(Ldji/v5/ux/core/ui/CenterPointView$CenterPointType;)V", "controlMode", "Ldji/v5/ux/core/util/SettingDefinitions$ControlMode;", "getControlMode", "()Ldji/v5/ux/core/util/SettingDefinitions$ControlMode;", "setControlMode", "(Ldji/v5/ux/core/util/SettingDefinitions$ControlMode;)V", "gridLineType", "Ldji/v5/ux/core/ui/GridLineView$GridLineType;", "getGridLineType", "()Ldji/v5/ux/core/ui/GridLineView$GridLineType;", "setGridLineType", "(Ldji/v5/ux/core/ui/GridLineView$GridLineType;)V", "isAirSenseTermsNeverShown", "setAirSenseTermsNeverShown", "isUnitModeDialogNeverShown", "setUnitModeDialogNeverShown", "temperatureUnitType", "Ldji/v5/ux/core/util/UnitConversionUtil$TemperatureUnitType;", "getTemperatureUnitType", "()Ldji/v5/ux/core/util/UnitConversionUtil$TemperatureUnitType;", "setTemperatureUnitType", "(Ldji/v5/ux/core/util/UnitConversionUtil$TemperatureUnitType;)V", "unitType", "Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "getUnitType", "()Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;", "setUnitType", "(Ldji/v5/ux/core/util/UnitConversionUtil$UnitType;)V", "cleanup", "", "setUpListener", "android-sdk-v5-uxsdk_debug"})
public abstract interface GlobalPreferencesInterface {
    
    /**
     * Set up the listeners for the global preferences interface
     */
    public abstract void setUpListener();
    
    /**
     * Clean up the listeners for the global preferences interface
     */
    public abstract void cleanup();
    
    /**
     * [UnitType] value saved.
     */
    @org.jetbrains.annotations.NotNull
    public abstract dji.v5.ux.core.util.UnitConversionUtil.UnitType getUnitType();
    
    /**
     * [UnitType] value saved.
     */
    public abstract void setUnitType(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.util.UnitConversionUtil.UnitType p0);
    
    /**
     * [TemperatureUnitType] value saved.
     */
    @org.jetbrains.annotations.NotNull
    public abstract dji.v5.ux.core.util.UnitConversionUtil.TemperatureUnitType getTemperatureUnitType();
    
    /**
     * [TemperatureUnitType] value saved.
     */
    public abstract void setTemperatureUnitType(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.util.UnitConversionUtil.TemperatureUnitType p0);
    
    /**
     * Boolean value indicating if AFC is enabled if saved.
     */
    @kotlin.jvm.JvmName(name = "getAFCEnabled")
    public abstract boolean getAFCEnabled();
    
    /**
     * Boolean value indicating if AFC is enabled if saved.
     */
    @kotlin.jvm.JvmName(name = "setAFCEnabled")
    public abstract void setAFCEnabled(boolean p0);
    
    /**
     * Boolean value indicating if the AirSense terms should never be shown.
     */
    public abstract boolean isAirSenseTermsNeverShown();
    
    /**
     * Boolean value indicating if the AirSense terms should never be shown.
     */
    public abstract void setAirSenseTermsNeverShown(boolean p0);
    
    /**
     * [GridLineType] for the grid line overlay.
     */
    @org.jetbrains.annotations.NotNull
    public abstract dji.v5.ux.core.ui.GridLineView.GridLineType getGridLineType();
    
    /**
     * [GridLineType] for the grid line overlay.
     */
    public abstract void setGridLineType(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.ui.GridLineView.GridLineType p0);
    
    /**
     * Center Point Type from [CenterPointType]
     */
    @org.jetbrains.annotations.NotNull
    public abstract dji.v5.ux.core.ui.CenterPointView.CenterPointType getCenterPointType();
    
    /**
     * Center Point Type from [CenterPointType]
     */
    public abstract void setCenterPointType(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.ui.CenterPointView.CenterPointType p0);
    
    /**
     * Center point color int
     */
    @androidx.annotation.ColorInt
    public abstract int getCenterPointColor();
    
    /**
     * Center point color int
     */
    public abstract void setCenterPointColor(@androidx.annotation.ColorInt
    int p0);
    
    /**
     * Control mode from [ControlMode]
     */
    @org.jetbrains.annotations.NotNull
    public abstract dji.v5.ux.core.util.SettingDefinitions.ControlMode getControlMode();
    
    /**
     * Control mode from [ControlMode]
     */
    public abstract void setControlMode(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.util.SettingDefinitions.ControlMode p0);
    
    /**
     * Boolean value indicating if the Unit Mode dialog should never be shown.
     */
    public abstract boolean isUnitModeDialogNeverShown();
    
    /**
     * Boolean value indicating if the Unit Mode dialog should never be shown.
     */
    public abstract void setUnitModeDialogNeverShown(boolean p0);
    
    /**
     * Interface to be implemented for functions included under
     * global preferences. These settings will persist across app restarts.
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3)
    public final class DefaultImpls {
        
        /**
         * Boolean value indicating if AFC is enabled if saved.
         */
        @kotlin.Suppress(names = {"INAPPLICABLE_JVM_NAME"})
        @java.lang.Deprecated
        public static void getAFCEnabled$annotations() {
        }
    }
}