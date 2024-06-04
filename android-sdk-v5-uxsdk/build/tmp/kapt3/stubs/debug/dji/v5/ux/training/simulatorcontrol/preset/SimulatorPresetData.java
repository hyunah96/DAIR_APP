package dji.v5.ux.training.simulatorcontrol.preset;

import java.lang.System;

/**
 * Simulator Preset Data
 *
 * The class represents the instance of values which
 * can be used to run the simulator
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r\u00a8\u0006\u001a"}, d2 = {"Ldji/v5/ux/training/simulatorcontrol/preset/SimulatorPresetData;", "", "latitude", "", "longitude", "satelliteCount", "", "updateFrequency", "(DDII)V", "getLatitude", "()D", "getLongitude", "getSatelliteCount", "()I", "getUpdateFrequency", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "android-sdk-v5-uxsdk_debug"})
public final class SimulatorPresetData {
    
    /**
     * Latitude value of simulated location
     */
    private final double latitude = 0.0;
    
    /**
     * Longitude value of simulated location
     */
    private final double longitude = 0.0;
    
    /**
     * Satellite count of simulated location
     */
    private final int satelliteCount = 0;
    
    /**
     * The frequency at which the aircraft should send data
     */
    private final int updateFrequency = 0;
    
    /**
     * Simulator Preset Data
     *
     * The class represents the instance of values which
     * can be used to run the simulator
     */
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.training.simulatorcontrol.preset.SimulatorPresetData copy(double latitude, double longitude, int satelliteCount, int updateFrequency) {
        return null;
    }
    
    /**
     * Simulator Preset Data
     *
     * The class represents the instance of values which
     * can be used to run the simulator
     */
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Simulator Preset Data
     *
     * The class represents the instance of values which
     * can be used to run the simulator
     */
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    /**
     * Simulator Preset Data
     *
     * The class represents the instance of values which
     * can be used to run the simulator
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public SimulatorPresetData(double latitude, double longitude, int satelliteCount, int updateFrequency) {
        super();
    }
    
    /**
     * Latitude value of simulated location
     */
    public final double component1() {
        return 0.0;
    }
    
    /**
     * Latitude value of simulated location
     */
    public final double getLatitude() {
        return 0.0;
    }
    
    /**
     * Longitude value of simulated location
     */
    public final double component2() {
        return 0.0;
    }
    
    /**
     * Longitude value of simulated location
     */
    public final double getLongitude() {
        return 0.0;
    }
    
    /**
     * Satellite count of simulated location
     */
    public final int component3() {
        return 0;
    }
    
    /**
     * Satellite count of simulated location
     */
    public final int getSatelliteCount() {
        return 0;
    }
    
    /**
     * The frequency at which the aircraft should send data
     */
    public final int component4() {
        return 0;
    }
    
    /**
     * The frequency at which the aircraft should send data
     */
    public final int getUpdateFrequency() {
        return 0;
    }
}