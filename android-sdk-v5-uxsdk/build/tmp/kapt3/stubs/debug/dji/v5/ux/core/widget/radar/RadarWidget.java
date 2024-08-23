package dji.v5.ux.core.widget.radar;

import java.lang.System;

/**
 * Shows the current state of the radar sensors. The forward and backward sensors each have four
 * sectors represented by [ObstacleDetectionSector], and the left and right sensors each have
 * a single sector. Each sector displays an icon according to its
 * [ObstacleDetectionSectorWarning] level.
 *
 * Each radar section has its own distance indicator which uses the unit set in the UNIT_MODE
 * global preferences [GlobalPreferencesInterface.unitType] and the
 * [GlobalPreferenceKeys.UNIT_TYPE] UX Key and defaults to m if
 * nothing is set.
 *
 * Additionally, an icon appears in the center when the upwards sensor detects an obstacle.
 *
 * This widget has a fixed aspect ratio of 17:8.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\n\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016J\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\u0010\u001a\u00020\u000fH\u0014R\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Ldji/v5/ux/core/widget/radar/RadarWidget;", "Ldji/v5/ux/core/base/widget/ConstraintLayoutWidget;", "Ldji/v5/ux/core/widget/radar/RadarWidget$ModelState;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "tag", "", "kotlin.jvm.PlatformType", "getIdealDimensionRatioString", "initView", "", "reactToModelChanges", "ModelState", "android-sdk-v5-uxsdk_debug"})
public class RadarWidget extends dji.v5.ux.core.base.widget.ConstraintLayoutWidget<dji.v5.ux.core.widget.radar.RadarWidget.ModelState> {
    private final java.lang.String tag = null;
    
    @kotlin.jvm.JvmOverloads
    public RadarWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public RadarWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public RadarWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    @java.lang.Override
    protected void initView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
    }
    
    @java.lang.Override
    protected void reactToModelChanges() {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String getIdealDimensionRatioString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/widget/radar/RadarWidget$ModelState;", "", "()V", "android-sdk-v5-uxsdk_debug"})
    public static abstract class ModelState {
        
        private ModelState() {
            super();
        }
    }
}