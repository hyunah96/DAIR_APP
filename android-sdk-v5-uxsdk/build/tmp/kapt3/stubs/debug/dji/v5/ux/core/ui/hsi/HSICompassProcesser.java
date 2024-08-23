package dji.v5.ux.core.ui.hsi;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 *2\u00020\u0001:\u0005*+,-.B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0018\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\fJ\u0010\u0010$\u001a\u00020\u001f2\b\u0010%\u001a\u0004\u0018\u00010&J\u0006\u0010\'\u001a\u00020\u001fJ\u0006\u0010(\u001a\u00020\u001fJ\u0006\u0010)\u001a\u00020\u001fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Ldji/v5/ux/core/ui/hsi/HSICompassProcesser;", "", "context", "Landroid/content/Context;", "listener", "Ldji/v5/ux/core/ui/hsi/HSICompassProcesser$CompassListener;", "(Landroid/content/Context;Ldji/v5/ux/core/ui/hsi/HSICompassProcesser$CompassListener;)V", "lastUpdateTime", "", "mAccelerometerData", "", "mAccelerometerStatus", "", "mDefaultDisplay", "Landroid/view/Display;", "mListener", "getMListener", "()Ldji/v5/ux/core/ui/hsi/HSICompassProcesser$CompassListener;", "setMListener", "(Ldji/v5/ux/core/ui/hsi/HSICompassProcesser$CompassListener;)V", "mMagneticStatus", "mMagneticValues", "mRegisterManager", "Ldji/v5/ux/core/ui/hsi/HSICompassProcesser$RegisterManager;", "mSensorMgr", "Landroid/hardware/SensorManager;", "notifyDisposable", "Lio/reactivex/rxjava3/disposables/Disposable;", "sampleTimeInMs", "screenOrientation", "calcOrientation", "", "onAccuracyChanged", "sensor", "Landroid/hardware/Sensor;", "accuracy", "onSensorChanged", "event", "Landroid/hardware/SensorEvent;", "start", "stop", "updateScreenOrientation", "Companion", "CompassListener", "HSICompassSensorEventListener", "HSICompassSensorOrientationEventListener", "RegisterManager", "android-sdk-v5-uxsdk_debug"})
public final class HSICompassProcesser {
    private final android.hardware.SensorManager mSensorMgr = null;
    private int mAccelerometerStatus = android.hardware.SensorManager.SENSOR_STATUS_NO_CONTACT;
    private int mMagneticStatus = android.hardware.SensorManager.SENSOR_STATUS_NO_CONTACT;
    private final android.view.Display mDefaultDisplay = null;
    private final dji.v5.ux.core.ui.hsi.HSICompassProcesser.RegisterManager mRegisterManager = null;
    private float[] mAccelerometerData;
    private float[] mMagneticValues;
    @org.jetbrains.annotations.NotNull
    private dji.v5.ux.core.ui.hsi.HSICompassProcesser.CompassListener mListener;
    private final long sampleTimeInMs = 100L;
    private long lastUpdateTime = 0L;
    @kotlin.jvm.Volatile
    private volatile int screenOrientation = 0;
    private io.reactivex.rxjava3.disposables.Disposable notifyDisposable;
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.core.ui.hsi.HSICompassProcesser.Companion Companion = null;
    private static final int SAMPLING_PERIOD_US = android.hardware.SensorManager.SENSOR_DELAY_NORMAL;
    private static final java.lang.String TAG = "HSICompassProcesser";
    
    public HSICompassProcesser(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dji.v5.ux.core.ui.hsi.HSICompassProcesser.CompassListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.hsi.HSICompassProcesser.CompassListener getMListener() {
        return null;
    }
    
    public final void setMListener(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.ui.hsi.HSICompassProcesser.CompassListener p0) {
    }
    
    private final void calcOrientation() {
    }
    
    public final void start() {
    }
    
    public final void stop() {
    }
    
    public final void updateScreenOrientation() {
    }
    
    public final void onSensorChanged(@org.jetbrains.annotations.Nullable
    android.hardware.SensorEvent event) {
    }
    
    public final void onAccuracyChanged(@org.jetbrains.annotations.Nullable
    android.hardware.Sensor sensor, int accuracy) {
    }
    
    /**
     * 监测设备朝向
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Ldji/v5/ux/core/ui/hsi/HSICompassProcesser$CompassListener;", "", "onOrientationChange", "", "strength", "", "degree", "", "android-sdk-v5-uxsdk_debug"})
    public static abstract interface CompassListener {
        
        /**
         * @param strength 信号强度，one of SensorManager.SENSOR_STATUS_*
         * @param degree 朝向
         */
        public abstract void onOrientationChange(int strength, float degree);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/core/ui/hsi/HSICompassProcesser$RegisterManager;", "", "sensorManager", "Landroid/hardware/SensorManager;", "mAccelerometerSensor", "Landroid/hardware/Sensor;", "mMagneticSensor", "mRcOriListener", "Landroid/hardware/SensorEventListener;", "orientationEventListener", "Landroid/view/OrientationEventListener;", "(Landroid/hardware/SensorManager;Landroid/hardware/Sensor;Landroid/hardware/Sensor;Landroid/hardware/SensorEventListener;Landroid/view/OrientationEventListener;)V", "handler", "Landroid/os/Handler;", "registerSensorListener", "", "unRegisterSensorListener", "android-sdk-v5-uxsdk_debug"})
    static final class RegisterManager {
        private final android.hardware.SensorManager sensorManager = null;
        private final android.hardware.Sensor mAccelerometerSensor = null;
        private final android.hardware.Sensor mMagneticSensor = null;
        private final android.hardware.SensorEventListener mRcOriListener = null;
        private final android.view.OrientationEventListener orientationEventListener = null;
        private final android.os.Handler handler = null;
        
        public RegisterManager(@org.jetbrains.annotations.NotNull
        android.hardware.SensorManager sensorManager, @org.jetbrains.annotations.Nullable
        android.hardware.Sensor mAccelerometerSensor, @org.jetbrains.annotations.Nullable
        android.hardware.Sensor mMagneticSensor, @org.jetbrains.annotations.NotNull
        android.hardware.SensorEventListener mRcOriListener, @org.jetbrains.annotations.NotNull
        android.view.OrientationEventListener orientationEventListener) {
            super();
        }
        
        public final void registerSensorListener() {
        }
        
        public final void unRegisterSensorListener() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/core/ui/hsi/HSICompassProcesser$HSICompassSensorEventListener;", "Landroid/hardware/SensorEventListener;", "weakRefHSICompassProcesser", "Ljava/lang/ref/WeakReference;", "Ldji/v5/ux/core/ui/hsi/HSICompassProcesser;", "(Ljava/lang/ref/WeakReference;)V", "onAccuracyChanged", "", "sensor", "Landroid/hardware/Sensor;", "accuracy", "", "onSensorChanged", "event", "Landroid/hardware/SensorEvent;", "android-sdk-v5-uxsdk_debug"})
    static final class HSICompassSensorEventListener implements android.hardware.SensorEventListener {
        private final java.lang.ref.WeakReference<dji.v5.ux.core.ui.hsi.HSICompassProcesser> weakRefHSICompassProcesser = null;
        
        public HSICompassSensorEventListener(@org.jetbrains.annotations.NotNull
        java.lang.ref.WeakReference<dji.v5.ux.core.ui.hsi.HSICompassProcesser> weakRefHSICompassProcesser) {
            super();
        }
        
        @java.lang.Override
        public void onSensorChanged(@org.jetbrains.annotations.Nullable
        android.hardware.SensorEvent event) {
        }
        
        @java.lang.Override
        public void onAccuracyChanged(@org.jetbrains.annotations.Nullable
        android.hardware.Sensor sensor, int accuracy) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Ldji/v5/ux/core/ui/hsi/HSICompassProcesser$HSICompassSensorOrientationEventListener;", "Landroid/view/OrientationEventListener;", "weakRefHSICompassProcesser", "Ljava/lang/ref/WeakReference;", "Ldji/v5/ux/core/ui/hsi/HSICompassProcesser;", "context", "Landroid/content/Context;", "(Ljava/lang/ref/WeakReference;Landroid/content/Context;)V", "onOrientationChanged", "", "orientation", "", "android-sdk-v5-uxsdk_debug"})
    static final class HSICompassSensorOrientationEventListener extends android.view.OrientationEventListener {
        private final java.lang.ref.WeakReference<dji.v5.ux.core.ui.hsi.HSICompassProcesser> weakRefHSICompassProcesser = null;
        
        public HSICompassSensorOrientationEventListener(@org.jetbrains.annotations.NotNull
        java.lang.ref.WeakReference<dji.v5.ux.core.ui.hsi.HSICompassProcesser> weakRefHSICompassProcesser, @org.jetbrains.annotations.NotNull
        android.content.Context context) {
            super(null);
        }
        
        @java.lang.Override
        public void onOrientationChanged(int orientation) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Ldji/v5/ux/core/ui/hsi/HSICompassProcesser$Companion;", "", "()V", "SAMPLING_PERIOD_US", "", "TAG", "", "android-sdk-v5-uxsdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}