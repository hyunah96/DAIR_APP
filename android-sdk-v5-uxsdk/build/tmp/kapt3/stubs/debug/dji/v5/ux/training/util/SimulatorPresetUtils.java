package dji.v5.ux.training.util;

import java.lang.System;

/**
 * Simulator Widget Preferences
 * This shared preference file is dedicated for storing Simulator Presets.
 * It is essential to keep this segregation for getting all Preset entries even when
 * the keys dynamically change
 * Method to
 * 1. save a preset for simulator
 * 2. load the preset list
 * 3. delete a preset from the list
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u001eJ\u0006\u0010 \u001a\u00020\u001eJ\u0010\u0010!\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010\u0004J\u0016\u0010#\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010$\u001a\u00020%J.\u0010#\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\'2\u0006\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001b\u0010\u0017\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u00188F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Ldji/v5/ux/training/util/SimulatorPresetUtils;", "", "()V", "SIMULATOR_FREQUENCY", "", "SIMULATOR_LAT", "SIMULATOR_LNG", "SIMULATOR_SHARED_PREFERENCES", "value", "", "currentSimulatorFrequency", "getCurrentSimulatorFrequency", "()I", "setCurrentSimulatorFrequency", "(I)V", "currentSimulatorStartLat", "getCurrentSimulatorStartLat", "()Ljava/lang/String;", "setCurrentSimulatorStartLat", "(Ljava/lang/String;)V", "currentSimulatorStartLng", "getCurrentSimulatorStartLng", "setCurrentSimulatorStartLng", "presetList", "", "getPresetList", "()Ljava/util/Map;", "sharedPreferences", "Landroid/content/SharedPreferences;", "clearSimulatorFrequency", "", "clearSimulatorStartLat", "clearSimulatorStartLng", "deletePreset", "key", "savePreset", "simulatorPresetData", "Ldji/v5/ux/training/simulatorcontrol/preset/SimulatorPresetData;", "lat", "", "lng", "satelliteCount", "frequency", "android-sdk-v5-uxsdk_debug"})
public final class SimulatorPresetUtils {
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.training.util.SimulatorPresetUtils INSTANCE = null;
    private static final java.lang.String SIMULATOR_SHARED_PREFERENCES = "simulatorsharedpreferences";
    private static final java.lang.String SIMULATOR_FREQUENCY = "simulatorfrequency";
    private static final java.lang.String SIMULATOR_LAT = "simulatorLatitude";
    private static final java.lang.String SIMULATOR_LNG = "simulatorLongitude";
    private static final android.content.SharedPreferences sharedPreferences = null;
    
    private SimulatorPresetUtils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, ?> getPresetList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCurrentSimulatorStartLat() {
        return null;
    }
    
    public final void setCurrentSimulatorStartLat(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCurrentSimulatorStartLng() {
        return null;
    }
    
    public final void setCurrentSimulatorStartLng(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    public final int getCurrentSimulatorFrequency() {
        return 0;
    }
    
    public final void setCurrentSimulatorFrequency(int value) {
    }
    
    /**
     * Save preset to be used later.
     *
     * @param key - String value to be used as key and display name.
     * @param lat - Double value representing latitude.
     * @param lng - Double value representing longitude.
     * @param satelliteCount - Integer value representing satellite count.
     * @param frequency - Integer value representing data frequency.
     */
    public final void savePreset(@org.jetbrains.annotations.NotNull
    java.lang.String key, double lat, double lng, int satelliteCount, int frequency) {
    }
    
    /**
     * Save preset to be used later.
     *
     * @param key - String value to be used as key and display name.
     * @param simulatorPresetData - instance of [SimulatorPresetData].
     */
    public final void savePreset(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.NotNull
    dji.v5.ux.training.simulatorcontrol.preset.SimulatorPresetData simulatorPresetData) {
    }
    
    /**
     * Delete a preset.
     *
     * @param key - String key of the preset to be deleted.
     */
    public final void deletePreset(@org.jetbrains.annotations.Nullable
    java.lang.String key) {
    }
    
    /**
     * Clear cached frequency value.
     */
    public final void clearSimulatorFrequency() {
    }
    
    /**
     * Clear cached latitude value.
     */
    public final void clearSimulatorStartLat() {
    }
    
    /**
     * Clear cached longitude value.
     */
    public final void clearSimulatorStartLng() {
    }
}