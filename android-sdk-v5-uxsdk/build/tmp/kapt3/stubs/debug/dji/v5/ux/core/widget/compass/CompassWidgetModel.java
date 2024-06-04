package dji.v5.ux.core.widget.compass;

import java.lang.System;

/**
 * Widget Model for the [CompassWidget] used to define
 * the underlying logic and communication
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00b8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0005PQRSTB)\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\b\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u000201H\u0002J\b\u00103\u001a\u00020 H\u0002J\b\u00104\u001a\u0004\u0018\u000105J\b\u00106\u001a\u000201H\u0014J\b\u00107\u001a\u000201H\u0014J\u0018\u00108\u001a\u0002012\u0006\u00109\u001a\u00020,2\u0006\u0010:\u001a\u00020 H\u0016J\u0010\u0010;\u001a\u0002012\u0006\u0010<\u001a\u00020=H\u0016J\u0010\u0010>\u001a\u0002012\u0006\u0010?\u001a\u00020@H\u0016J\u0010\u0010A\u001a\u0002012\u0006\u0010?\u001a\u00020@H\u0016J\u0010\u0010B\u001a\u0002012\u0006\u0010C\u001a\u00020DH\u0016J \u0010E\u001a\u0002012\u0006\u0010?\u001a\u00020@2\u0006\u0010F\u001a\u00020 2\u0006\u0010G\u001a\u00020HH\u0016J\b\u0010I\u001a\u000201H\u0002J\u0010\u0010J\u001a\u0002012\b\u0010\u001f\u001a\u0004\u0018\u000105J\b\u0010K\u001a\u000201H\u0002J\b\u0010L\u001a\u000201H\u0002J\u0010\u0010M\u001a\u0002012\u0006\u0010N\u001a\u00020(H\u0002J\b\u0010O\u001a\u000201H\u0014R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010#\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\'\u001a\b\u0012\u0004\u0012\u00020(0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006U"}, d2 = {"Ldji/v5/ux/core/widget/compass/CompassWidgetModel;", "Ldji/v5/ux/core/base/WidgetModel;", "Landroid/hardware/SensorEventListener;", "Landroid/location/LocationListener;", "djiSdkModel", "Ldji/v5/ux/core/base/DJISDKModel;", "keyedStore", "Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;", "sensorManager", "Landroid/hardware/SensorManager;", "windowManager", "Landroid/view/WindowManager;", "(Ldji/v5/ux/core/base/DJISDKModel;Ldji/v5/ux/core/communication/ObservableInMemoryKeyedStore;Landroid/hardware/SensorManager;Landroid/view/WindowManager;)V", "aircraftAttitudeProcessor", "Ldji/v5/ux/core/util/DataProcessor;", "Ldji/sdk/keyvalue/value/common/Attitude;", "aircraftLocationProcessor", "Ldji/sdk/keyvalue/value/common/LocationCoordinate2D;", "kotlin.jvm.PlatformType", "aircraftStateProcessor", "Ldji/v5/ux/core/widget/compass/CompassWidgetModel$AircraftState;", "centerTypeProcessor", "Ldji/v5/ux/core/widget/compass/CompassWidgetModel$CenterType;", "compassWidgetState", "Lio/reactivex/rxjava3/core/Flowable;", "Ldji/v5/ux/core/widget/compass/CompassWidgetModel$CompassWidgetState;", "getCompassWidgetState", "()Lio/reactivex/rxjava3/core/Flowable;", "compassWidgetStateProcessor", "currentLocationStateProcessor", "Ldji/v5/ux/core/widget/compass/CompassWidgetModel$CurrentLocationState;", "gimbalIndex", "", "gimbalYawProcessor", "", "homeLocationProcessor", "latestSensorValue", "", "mobileDeviceAzimuthProcessor", "rcGPSDataProcessor", "Ldji/sdk/keyvalue/value/remotecontroller/RcGPSInfo;", "rcOrMobileLatitude", "rcOrMobileLongitude", "rotationVector", "Landroid/hardware/Sensor;", "rotations", "", "values", "calculateAircraftAngleAndDistanceFromCenterLocation", "", "calculateAngleAndDistanceBetweenRCAndHome", "getDisplayRotation", "getGimbalIndex", "Ldji/v5/ux/core/util/SettingDefinitions$GimbalIndex;", "inCleanup", "inSetup", "onAccuracyChanged", "sensor", "accuracy", "onLocationChanged", "location", "Landroid/location/Location;", "onProviderDisabled", "provider", "", "onProviderEnabled", "onSensorChanged", "event", "Landroid/hardware/SensorEvent;", "onStatusChanged", "status", "extras", "Landroid/os/Bundle;", "registerMobileDeviceSensorListener", "setGimbalIndex", "unregisterMobileDeviceSensorListener", "updateCalculations", "updateGPSData", "data", "updateStates", "AircraftAttitude", "AircraftState", "CenterType", "CompassWidgetState", "CurrentLocationState", "android-sdk-v5-uxsdk_debug"})
public final class CompassWidgetModel extends dji.v5.ux.core.base.WidgetModel implements android.hardware.SensorEventListener, android.location.LocationListener {
    private final android.hardware.SensorManager sensorManager = null;
    private final android.view.WindowManager windowManager = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.common.LocationCoordinate2D> homeLocationProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.common.LocationCoordinate2D> aircraftLocationProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.remotecontroller.RcGPSInfo> rcGPSDataProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Double> gimbalYawProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.widget.compass.CompassWidgetModel.CenterType> centerTypeProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<java.lang.Float> mobileDeviceAzimuthProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.sdk.keyvalue.value.common.Attitude> aircraftAttitudeProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.widget.compass.CompassWidgetModel.AircraftState> aircraftStateProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.widget.compass.CompassWidgetModel.CurrentLocationState> currentLocationStateProcessor = null;
    private final dji.v5.ux.core.util.DataProcessor<dji.v5.ux.core.widget.compass.CompassWidgetModel.CompassWidgetState> compassWidgetStateProcessor = null;
    private android.hardware.Sensor rotationVector;
    private double rcOrMobileLatitude = 0.0;
    private double rcOrMobileLongitude = 0.0;
    private float latestSensorValue = 0.0F;
    private int gimbalIndex;
    
    /**
     * values[0]: azimuth, rotation around the Z axis.
     * values[1]: pitch, rotation around the X axis.
     * values[2]: roll, rotation around the Y axis.
     */
    private final float[] values = null;
    private final float[] rotations = null;
    
    public CompassWidgetModel(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.base.DJISDKModel djiSdkModel, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.communication.ObservableInMemoryKeyedStore keyedStore, @org.jetbrains.annotations.Nullable
    android.hardware.SensorManager sensorManager, @org.jetbrains.annotations.Nullable
    android.view.WindowManager windowManager) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.widget.compass.CompassWidgetModel.CompassWidgetState> getCompassWidgetState() {
        return null;
    }
    
    @java.lang.Override
    protected void inSetup() {
    }
    
    @java.lang.Override
    protected void inCleanup() {
    }
    
    @java.lang.Override
    protected void updateStates() {
    }
    
    private final void registerMobileDeviceSensorListener() {
    }
    
    private final void unregisterMobileDeviceSensorListener() {
    }
    
    @java.lang.Override
    public void onSensorChanged(@org.jetbrains.annotations.NotNull
    android.hardware.SensorEvent event) {
    }
    
    @java.lang.Override
    public void onAccuracyChanged(@org.jetbrains.annotations.NotNull
    android.hardware.Sensor sensor, int accuracy) {
    }
    
    @java.lang.Override
    public void onLocationChanged(@org.jetbrains.annotations.NotNull
    android.location.Location location) {
    }
    
    @java.lang.Override
    public void onStatusChanged(@org.jetbrains.annotations.NotNull
    java.lang.String provider, int status, @org.jetbrains.annotations.NotNull
    android.os.Bundle extras) {
    }
    
    @java.lang.Override
    public void onProviderEnabled(@org.jetbrains.annotations.NotNull
    java.lang.String provider) {
    }
    
    @java.lang.Override
    public void onProviderDisabled(@org.jetbrains.annotations.NotNull
    java.lang.String provider) {
    }
    
    private final void updateGPSData(dji.sdk.keyvalue.value.remotecontroller.RcGPSInfo data) {
    }
    
    private final void updateCalculations() {
    }
    
    private final void calculateAircraftAngleAndDistanceFromCenterLocation() {
    }
    
    private final void calculateAngleAndDistanceBetweenRCAndHome() {
    }
    
    private final int getDisplayRotation() {
        return 0;
    }
    
    /**
     * Get the gimbal index for which the model is reacting.
     *
     * @return current gimbal index.
     */
    @org.jetbrains.annotations.Nullable
    public final dji.v5.ux.core.util.SettingDefinitions.GimbalIndex getGimbalIndex() {
        return null;
    }
    
    /**
     * Set gimbal index to which the model should react.
     *
     * @param gimbalIndex index of the gimbal.
     */
    public final void setGimbalIndex(@org.jetbrains.annotations.Nullable
    dji.v5.ux.core.util.SettingDefinitions.GimbalIndex gimbalIndex) {
    }
    
    /**
     * Enum for the center type used in the calculations
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Ldji/v5/ux/core/widget/compass/CompassWidgetModel$CenterType;", "", "(Ljava/lang/String;I)V", "RC_MOBILE_GPS", "HOME_GPS", "android-sdk-v5-uxsdk_debug"})
    public static enum CenterType {
        /*public static final*/ RC_MOBILE_GPS /* = new RC_MOBILE_GPS() */,
        /*public static final*/ HOME_GPS /* = new HOME_GPS() */;
        
        CenterType() {
        }
    }
    
    /**
     * Class that holds the aircraft's attitude with getters and setters
     * for the [roll], [pitch] and [yaw] of the aircraft
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n\u00a8\u0006\u001a"}, d2 = {"Ldji/v5/ux/core/widget/compass/CompassWidgetModel$AircraftAttitude;", "", "roll", "", "pitch", "yaw", "(DDD)V", "getPitch", "()D", "setPitch", "(D)V", "getRoll", "setRoll", "getYaw", "setYaw", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
    public static final class AircraftAttitude {
        private double roll;
        private double pitch;
        private double yaw;
        
        /**
         * Class that holds the aircraft's attitude with getters and setters
         * for the [roll], [pitch] and [yaw] of the aircraft
         */
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.core.widget.compass.CompassWidgetModel.AircraftAttitude copy(double roll, double pitch, double yaw) {
            return null;
        }
        
        /**
         * Class that holds the aircraft's attitude with getters and setters
         * for the [roll], [pitch] and [yaw] of the aircraft
         */
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Class that holds the aircraft's attitude with getters and setters
         * for the [roll], [pitch] and [yaw] of the aircraft
         */
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        /**
         * Class that holds the aircraft's attitude with getters and setters
         * for the [roll], [pitch] and [yaw] of the aircraft
         */
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public AircraftAttitude(double roll, double pitch, double yaw) {
            super();
        }
        
        public final double component1() {
            return 0.0;
        }
        
        public final double getRoll() {
            return 0.0;
        }
        
        public final void setRoll(double p0) {
        }
        
        public final double component2() {
            return 0.0;
        }
        
        public final double getPitch() {
            return 0.0;
        }
        
        public final void setPitch(double p0) {
        }
        
        public final double component3() {
            return 0.0;
        }
        
        public final double getYaw() {
            return 0.0;
        }
        
        public final void setYaw(double p0) {
        }
    }
    
    /**
     * Class that holds the [angle] and [distance] between the aircraft and the
     * home/RC/Mobile device's location.
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t\u00a8\u0006\u0016"}, d2 = {"Ldji/v5/ux/core/widget/compass/CompassWidgetModel$AircraftState;", "", "angle", "", "distance", "(FF)V", "getAngle", "()F", "setAngle", "(F)V", "getDistance", "setDistance", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
    public static final class AircraftState {
        private float angle;
        private float distance;
        
        /**
         * Class that holds the [angle] and [distance] between the aircraft and the
         * home/RC/Mobile device's location.
         */
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.core.widget.compass.CompassWidgetModel.AircraftState copy(float angle, float distance) {
            return null;
        }
        
        /**
         * Class that holds the [angle] and [distance] between the aircraft and the
         * home/RC/Mobile device's location.
         */
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Class that holds the [angle] and [distance] between the aircraft and the
         * home/RC/Mobile device's location.
         */
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        /**
         * Class that holds the [angle] and [distance] between the aircraft and the
         * home/RC/Mobile device's location.
         */
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public AircraftState(float angle, float distance) {
            super();
        }
        
        public final float component1() {
            return 0.0F;
        }
        
        public final float getAngle() {
            return 0.0F;
        }
        
        public final void setAngle(float p0) {
        }
        
        public final float component2() {
            return 0.0F;
        }
        
        public final float getDistance() {
            return 0.0F;
        }
        
        public final void setDistance(float p0) {
        }
    }
    
    /**
     * Class that holds the [angle] and [distance] between current home and RC/Mobile device
     * locations
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t\u00a8\u0006\u0016"}, d2 = {"Ldji/v5/ux/core/widget/compass/CompassWidgetModel$CurrentLocationState;", "", "angle", "", "distance", "(FF)V", "getAngle", "()F", "setAngle", "(F)V", "getDistance", "setDistance", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
    public static final class CurrentLocationState {
        private float angle;
        private float distance;
        
        /**
         * Class that holds the [angle] and [distance] between current home and RC/Mobile device
         * locations
         */
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.core.widget.compass.CompassWidgetModel.CurrentLocationState copy(float angle, float distance) {
            return null;
        }
        
        /**
         * Class that holds the [angle] and [distance] between current home and RC/Mobile device
         * locations
         */
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Class that holds the [angle] and [distance] between current home and RC/Mobile device
         * locations
         */
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        /**
         * Class that holds the [angle] and [distance] between current home and RC/Mobile device
         * locations
         */
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public CurrentLocationState(float angle, float distance) {
            super();
        }
        
        public final float component1() {
            return 0.0F;
        }
        
        public final float getAngle() {
            return 0.0F;
        }
        
        public final void setAngle(float p0) {
        }
        
        public final float component2() {
            return 0.0F;
        }
        
        public final float getDistance() {
            return 0.0F;
        }
        
        public final void setDistance(float p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\'\u001a\u00020\tH\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\fH\u00c6\u0003JE\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00c6\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010.\u001a\u00020/H\u00d6\u0001J\t\u00100\u001a\u000201H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!\u00a8\u00062"}, d2 = {"Ldji/v5/ux/core/widget/compass/CompassWidgetModel$CompassWidgetState;", "", "phoneAzimuth", "", "aircraftAttitude", "Ldji/sdk/keyvalue/value/common/Attitude;", "aircraftState", "Ldji/v5/ux/core/widget/compass/CompassWidgetModel$AircraftState;", "currentLocationState", "Ldji/v5/ux/core/widget/compass/CompassWidgetModel$CurrentLocationState;", "gimbalHeading", "centerType", "Ldji/v5/ux/core/widget/compass/CompassWidgetModel$CenterType;", "(FLdji/sdk/keyvalue/value/common/Attitude;Ldji/v5/ux/core/widget/compass/CompassWidgetModel$AircraftState;Ldji/v5/ux/core/widget/compass/CompassWidgetModel$CurrentLocationState;FLdji/v5/ux/core/widget/compass/CompassWidgetModel$CenterType;)V", "getAircraftAttitude", "()Ldji/sdk/keyvalue/value/common/Attitude;", "setAircraftAttitude", "(Ldji/sdk/keyvalue/value/common/Attitude;)V", "getAircraftState", "()Ldji/v5/ux/core/widget/compass/CompassWidgetModel$AircraftState;", "setAircraftState", "(Ldji/v5/ux/core/widget/compass/CompassWidgetModel$AircraftState;)V", "getCenterType", "()Ldji/v5/ux/core/widget/compass/CompassWidgetModel$CenterType;", "setCenterType", "(Ldji/v5/ux/core/widget/compass/CompassWidgetModel$CenterType;)V", "getCurrentLocationState", "()Ldji/v5/ux/core/widget/compass/CompassWidgetModel$CurrentLocationState;", "setCurrentLocationState", "(Ldji/v5/ux/core/widget/compass/CompassWidgetModel$CurrentLocationState;)V", "getGimbalHeading", "()F", "setGimbalHeading", "(F)V", "getPhoneAzimuth", "setPhoneAzimuth", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
    public static final class CompassWidgetState {
        private float phoneAzimuth;
        @org.jetbrains.annotations.NotNull
        private dji.sdk.keyvalue.value.common.Attitude aircraftAttitude;
        @org.jetbrains.annotations.NotNull
        private dji.v5.ux.core.widget.compass.CompassWidgetModel.AircraftState aircraftState;
        @org.jetbrains.annotations.NotNull
        private dji.v5.ux.core.widget.compass.CompassWidgetModel.CurrentLocationState currentLocationState;
        private float gimbalHeading;
        @org.jetbrains.annotations.NotNull
        private dji.v5.ux.core.widget.compass.CompassWidgetModel.CenterType centerType;
        
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.core.widget.compass.CompassWidgetModel.CompassWidgetState copy(float phoneAzimuth, @org.jetbrains.annotations.NotNull
        dji.sdk.keyvalue.value.common.Attitude aircraftAttitude, @org.jetbrains.annotations.NotNull
        dji.v5.ux.core.widget.compass.CompassWidgetModel.AircraftState aircraftState, @org.jetbrains.annotations.NotNull
        dji.v5.ux.core.widget.compass.CompassWidgetModel.CurrentLocationState currentLocationState, float gimbalHeading, @org.jetbrains.annotations.NotNull
        dji.v5.ux.core.widget.compass.CompassWidgetModel.CenterType centerType) {
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
        
        public CompassWidgetState(float phoneAzimuth, @org.jetbrains.annotations.NotNull
        dji.sdk.keyvalue.value.common.Attitude aircraftAttitude, @org.jetbrains.annotations.NotNull
        dji.v5.ux.core.widget.compass.CompassWidgetModel.AircraftState aircraftState, @org.jetbrains.annotations.NotNull
        dji.v5.ux.core.widget.compass.CompassWidgetModel.CurrentLocationState currentLocationState, float gimbalHeading, @org.jetbrains.annotations.NotNull
        dji.v5.ux.core.widget.compass.CompassWidgetModel.CenterType centerType) {
            super();
        }
        
        public final float component1() {
            return 0.0F;
        }
        
        public final float getPhoneAzimuth() {
            return 0.0F;
        }
        
        public final void setPhoneAzimuth(float p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final dji.sdk.keyvalue.value.common.Attitude component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final dji.sdk.keyvalue.value.common.Attitude getAircraftAttitude() {
            return null;
        }
        
        public final void setAircraftAttitude(@org.jetbrains.annotations.NotNull
        dji.sdk.keyvalue.value.common.Attitude p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.core.widget.compass.CompassWidgetModel.AircraftState component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.core.widget.compass.CompassWidgetModel.AircraftState getAircraftState() {
            return null;
        }
        
        public final void setAircraftState(@org.jetbrains.annotations.NotNull
        dji.v5.ux.core.widget.compass.CompassWidgetModel.AircraftState p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.core.widget.compass.CompassWidgetModel.CurrentLocationState component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.core.widget.compass.CompassWidgetModel.CurrentLocationState getCurrentLocationState() {
            return null;
        }
        
        public final void setCurrentLocationState(@org.jetbrains.annotations.NotNull
        dji.v5.ux.core.widget.compass.CompassWidgetModel.CurrentLocationState p0) {
        }
        
        public final float component5() {
            return 0.0F;
        }
        
        public final float getGimbalHeading() {
            return 0.0F;
        }
        
        public final void setGimbalHeading(float p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.core.widget.compass.CompassWidgetModel.CenterType component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.core.widget.compass.CompassWidgetModel.CenterType getCenterType() {
            return null;
        }
        
        public final void setCenterType(@org.jetbrains.annotations.NotNull
        dji.v5.ux.core.widget.compass.CompassWidgetModel.CenterType p0) {
        }
    }
}