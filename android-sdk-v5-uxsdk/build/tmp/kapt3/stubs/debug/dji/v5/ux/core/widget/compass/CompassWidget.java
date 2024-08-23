package dji.v5.ux.core.widget.compass;

import java.lang.System;

/**
 * This widget aggregates the attitude and location data of the aircraft
 * into one widget. This includes -
 * - Position of the aircraft relative to the pilot
 * - Distance of the aircraft from the pilot
 * - Heading of the aircraft relative to the pilot
 * - True north relative to the pilot and the aircraft
 * - The aircraft's last recorded home location
 * - Attitude of the aircraft
 * - Yaw of the gimbal
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00aa\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u00ab\u0001\u00ac\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010x\u001a\u0002092\u0006\u0010y\u001a\u000209H\u0002J%\u0010z\u001a\u00060{R\u00020\u00002\u0006\u0010|\u001a\u0002092\u0006\u0010}\u001a\u00020~2\u0007\u0010\u007f\u001a\u00030\u0080\u0001H\u0002J\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0082\u0001J\n\u0010\u0083\u0001\u001a\u00030\u0084\u0001H\u0016J\u001a\u0010\u0085\u0001\u001a\u0002092\u0006\u0010}\u001a\u00020~2\u0007\u0010\u007f\u001a\u00030\u0080\u0001H\u0002J&\u0010\u0086\u0001\u001a\u00060{R\u00020\u00002\u0006\u0010|\u001a\u0002092\u0007\u0010\u007f\u001a\u00030\u0080\u00012\u0006\u0010}\u001a\u00020~H\u0002J\u0010\u0010\u0087\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020\u0088\u0001H\u0016J\u001a\u0010\u0089\u0001\u001a\u00030\u008a\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J$\u0010\u008b\u0001\u001a\u00030\u008a\u00012\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J\n\u0010\u008c\u0001\u001a\u00030\u008a\u0001H\u0014J\u0014\u0010\u008d\u0001\u001a\u00030\u008a\u00012\b\u0010\u008e\u0001\u001a\u00030\u008f\u0001H\u0002J\n\u0010\u0090\u0001\u001a\u00030\u008a\u0001H\u0014J8\u0010\u0091\u0001\u001a\u00030\u008a\u00012\b\u0010\u0092\u0001\u001a\u00030\u0093\u00012\u0007\u0010\u0094\u0001\u001a\u00020\b2\u0007\u0010\u0095\u0001\u001a\u00020\b2\u0007\u0010\u0096\u0001\u001a\u00020\b2\u0007\u0010\u0097\u0001\u001a\u00020\bH\u0014J\n\u0010\u0098\u0001\u001a\u00030\u008a\u0001H\u0014J\u0012\u0010\u0014\u001a\u00030\u008a\u00012\t\b\u0001\u0010\u0099\u0001\u001a\u00020\bJ\u0012\u0010\u0019\u001a\u00030\u008a\u00012\t\b\u0001\u0010\u0099\u0001\u001a\u00020\bJ\u0012\u0010\u001c\u001a\u00030\u008a\u00012\t\b\u0001\u0010\u0099\u0001\u001a\u00020\bJ\u0012\u0010!\u001a\u00030\u008a\u00012\t\b\u0001\u0010\u0099\u0001\u001a\u00020\bJ\u0012\u0010$\u001a\u00030\u008a\u00012\t\b\u0001\u0010\u0099\u0001\u001a\u00020\bJ\u0014\u0010\u009a\u0001\u001a\u00030\u008a\u00012\n\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0082\u0001J\u0012\u0010(\u001a\u00030\u008a\u00012\t\b\u0001\u0010\u0099\u0001\u001a\u00020\bJ\u0012\u0010+\u001a\u00030\u008a\u00012\t\b\u0001\u0010\u0099\u0001\u001a\u00020\bJ\u0012\u0010F\u001a\u00030\u008a\u00012\t\b\u0001\u0010\u0099\u0001\u001a\u00020\bJ\u0012\u0010I\u001a\u00030\u008a\u00012\t\b\u0001\u0010\u0099\u0001\u001a\u00020\bJ\u0012\u0010M\u001a\u00030\u008a\u00012\t\b\u0001\u0010\u0099\u0001\u001a\u00020\bJ\u0012\u0010P\u001a\u00030\u008a\u00012\t\b\u0001\u0010\u0099\u0001\u001a\u00020\bJ\u0012\u0010T\u001a\u00030\u008a\u00012\t\b\u0001\u0010\u0099\u0001\u001a\u00020\bJ\u0012\u0010W\u001a\u00030\u008a\u00012\t\b\u0001\u0010\u0099\u0001\u001a\u00020\bJ\u0012\u0010^\u001a\u00030\u008a\u00012\t\b\u0001\u0010\u0099\u0001\u001a\u00020\bJ\u0012\u0010a\u001a\u00030\u008a\u00012\t\b\u0001\u0010\u0099\u0001\u001a\u00020\bJ\u0014\u0010\u009c\u0001\u001a\u00030\u008a\u00012\b\u0010\u009d\u0001\u001a\u00030\u009e\u0001H\u0002J\u001c\u0010\u009f\u0001\u001a\u00030\u008a\u00012\u0006\u0010|\u001a\u0002092\b\u0010\u009d\u0001\u001a\u00030\u009e\u0001H\u0002J)\u0010\u00a0\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u00a1\u0001\u001a\u0002092\u0007\u0010\u00a2\u0001\u001a\u0002092\u000b\u0010\u00a3\u0001\u001a\u00060{R\u00020\u0000H\u0002J\u001c\u0010\u00a4\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u00a5\u0001\u001a\u0002092\u0007\u0010\u00a6\u0001\u001a\u000209H\u0002J\u0012\u0010\u00a7\u0001\u001a\u00030\u008a\u00012\u0006\u0010|\u001a\u000209H\u0002J!\u0010\u00a8\u0001\u001a\u00030\u008a\u00012\b\u0010\u00a9\u0001\u001a\u00030\u00aa\u00012\u000b\u0010\u00a3\u0001\u001a\u00060{R\u00020\u0000H\u0002R(\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R$\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b \u0010\u000e\"\u0004\b!\u0010\u0010R$\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b#\u0010\u000e\"\u0004\b$\u0010\u0010R\u000e\u0010%\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010&\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\'\u0010\u000e\"\u0004\b(\u0010\u0010R$\u0010)\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b*\u0010\u000e\"\u0004\b+\u0010\u0010R\u000e\u0010,\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u00100\u001a\u00020\b2\b\b\u0001\u0010/\u001a\u00020\b8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R&\u00105\u001a\u00020\b2\b\b\u0001\u0010/\u001a\u00020\b8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b6\u00102\"\u0004\b7\u00104R&\u0010:\u001a\u0002092\b\b\u0001\u00108\u001a\u0002098F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R&\u0010?\u001a\u00020\b2\b\b\u0001\u0010/\u001a\u00020\b8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b@\u00102\"\u0004\bA\u00104R\u000e\u0010B\u001a\u000209X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u000209X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010D\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bE\u0010\u000e\"\u0004\bF\u0010\u0010R$\u0010G\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bH\u0010\u000e\"\u0004\bI\u0010\u0010R\u000e\u0010J\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010K\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bL\u0010\u000e\"\u0004\bM\u0010\u0010R$\u0010N\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bO\u0010\u000e\"\u0004\bP\u0010\u0010R\u000e\u0010Q\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010R\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bS\u0010\u000e\"\u0004\bT\u0010\u0010R$\u0010U\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bV\u0010\u000e\"\u0004\bW\u0010\u0010R\u000e\u0010X\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u000209X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u000209X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\\\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b]\u0010\u000e\"\u0004\b^\u0010\u0010R$\u0010_\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b`\u0010\u000e\"\u0004\ba\u0010\u0010R\u000e\u0010b\u001a\u00020cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010d\u001a\u00020\b2\b\b\u0001\u0010/\u001a\u00020\b8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\be\u00102\"\u0004\bf\u00104R&\u0010h\u001a\u00020\b2\b\b\u0001\u0010g\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bi\u00102\"\u0004\bj\u00104R&\u0010l\u001a\u00020\b2\b\b\u0001\u0010k\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bm\u00102\"\u0004\bn\u00104R&\u0010o\u001a\u0002092\b\b\u0001\u00108\u001a\u0002098G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bp\u0010<\"\u0004\bq\u0010>R\u001b\u0010r\u001a\u00020s8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bt\u0010u\u00a8\u0006\u00ad\u0001"}, d2 = {"Ldji/v5/ux/core/widget/compass/CompassWidget;", "Ldji/v5/ux/core/base/widget/ConstraintLayoutWidget;", "Ldji/v5/ux/core/widget/compass/CompassWidget$ModelState;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "icon", "Landroid/graphics/drawable/Drawable;", "aircraftAttitudeIcon", "getAircraftAttitudeIcon", "()Landroid/graphics/drawable/Drawable;", "setAircraftAttitudeIcon", "(Landroid/graphics/drawable/Drawable;)V", "background", "aircraftAttitudeIconBackground", "getAircraftAttitudeIconBackground", "setAircraftAttitudeIconBackground", "aircraftAttitudeProgressBar", "Landroid/widget/ProgressBar;", "aircraftIcon", "getAircraftIcon", "setAircraftIcon", "aircraftIconBackground", "getAircraftIconBackground", "setAircraftIconBackground", "aircraftImageView", "Landroid/widget/ImageView;", "compassBackgroundIcon", "getCompassBackgroundIcon", "setCompassBackgroundIcon", "compassBackgroundIconBackground", "getCompassBackgroundIconBackground", "setCompassBackgroundIconBackground", "compassBackgroundImageView", "gimbalYawIcon", "getGimbalYawIcon", "setGimbalYawIcon", "gimbalYawIconBackground", "getGimbalYawIconBackground", "setGimbalYawIconBackground", "gimbalYawImageView", "gimbalYawView", "Ldji/v5/ux/core/widget/compass/GimbalYawView;", "color", "gimbalYawViewBlinkColor", "getGimbalYawViewBlinkColor", "()I", "setGimbalYawViewBlinkColor", "(I)V", "gimbalYawViewInvalidColor", "getGimbalYawViewInvalidColor", "setGimbalYawViewInvalidColor", "strokeWidth", "", "gimbalYawViewStrokeWidth", "getGimbalYawViewStrokeWidth", "()F", "setGimbalYawViewStrokeWidth", "(F)V", "gimbalYawViewYawColor", "getGimbalYawViewYawColor", "setGimbalYawViewYawColor", "halfAttitudeBallWidth", "halfNorthIconWidth", "homeIcon", "getHomeIcon", "setHomeIcon", "homeIconBackground", "getHomeIconBackground", "setHomeIconBackground", "homeImageView", "innerCirclesIcon", "getInnerCirclesIcon", "setInnerCirclesIcon", "innerCirclesIconBackground", "getInnerCirclesIconBackground", "setInnerCirclesIconBackground", "innerCirclesImageView", "northIcon", "getNorthIcon", "setNorthIcon", "northIconBackground", "getNorthIconBackground", "setNorthIconBackground", "northImageView", "paddingHeight", "paddingWidth", "rcImageView", "rcLocationIcon", "getRCLocationIcon", "setRCLocationIcon", "rcLocationIconBackground", "getRCLocationIconBackground", "setRCLocationIconBackground", "visualCompassView", "Ldji/v5/ux/core/widget/compass/VisualCompassView;", "visualCompassViewLineColor", "getVisualCompassViewLineColor", "setVisualCompassViewLineColor", "interval", "visualCompassViewLineInterval", "getVisualCompassViewLineInterval", "setVisualCompassViewLineInterval", "numberOfLines", "visualCompassViewNumberOfLines", "getVisualCompassViewNumberOfLines", "setVisualCompassViewNumberOfLines", "visualCompassViewStrokeWidth", "getVisualCompassViewStrokeWidth", "setVisualCompassViewStrokeWidth", "widgetModel", "Ldji/v5/ux/core/widget/compass/CompassWidgetModel;", "getWidgetModel", "()Ldji/v5/ux/core/widget/compass/CompassWidgetModel;", "widgetModel$delegate", "Lkotlin/Lazy;", "calculateScale", "distance", "getAircraftLocationCoordinates", "Ldji/v5/ux/core/widget/compass/CompassWidget$ViewCoordinates;", "phoneAzimuth", "aircraftState", "Ldji/v5/ux/core/widget/compass/CompassWidgetModel$AircraftState;", "state", "Ldji/v5/ux/core/widget/compass/CompassWidgetModel$CurrentLocationState;", "getGimbalIndex", "Ldji/v5/ux/core/util/SettingDefinitions$GimbalIndex;", "getIdealDimensionRatioString", "", "getMaxDistance", "getSecondGPSLocationCoordinates", "getWidgetStateUpdate", "Lio/reactivex/rxjava3/core/Flowable;", "initAttributes", "", "initView", "onAttachedToWindow", "onCompassStateUpdated", "compassWidgetState", "Ldji/v5/ux/core/widget/compass/CompassWidgetModel$CompassWidgetState;", "onDetachedFromWindow", "onLayout", "changed", "", "left", "top", "right", "bottom", "reactToModelChanges", "resourceId", "setGimbalIndex", "gimbalIndex", "updateAircraftAttitudeUI", "aircraftAttitude", "Ldji/sdk/keyvalue/value/common/Attitude;", "updateAircraftHeadingUI", "updateAircraftLocationUI", "maxDistance", "scale", "viewCoordinates", "updateGimbalHeadingUI", "gimbalHeading", "rotationOffset", "updateNorthHeadingUI", "updateSecondGPSLocationUI", "type", "Ldji/v5/ux/core/widget/compass/CompassWidgetModel$CenterType;", "ModelState", "ViewCoordinates", "android-sdk-v5-uxsdk_debug"})
public class CompassWidget extends dji.v5.ux.core.base.widget.ConstraintLayoutWidget<dji.v5.ux.core.widget.compass.CompassWidget.ModelState> {
    private float halfNorthIconWidth = 0.0F;
    private float halfAttitudeBallWidth = 0.0F;
    private float paddingWidth = 0.0F;
    private float paddingHeight = 0.0F;
    private final android.widget.ImageView homeImageView = null;
    private final android.widget.ImageView rcImageView = null;
    private final android.widget.ImageView aircraftImageView = null;
    private final android.widget.ImageView gimbalYawImageView = null;
    private final android.widget.ImageView innerCirclesImageView = null;
    private final android.widget.ImageView northImageView = null;
    private final android.widget.ImageView compassBackgroundImageView = null;
    private final android.widget.ProgressBar aircraftAttitudeProgressBar = null;
    private final dji.v5.ux.core.widget.compass.VisualCompassView visualCompassView = null;
    private final dji.v5.ux.core.widget.compass.GimbalYawView gimbalYawView = null;
    private final kotlin.Lazy widgetModel$delegate = null;
    
    @kotlin.jvm.JvmOverloads
    public CompassWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public CompassWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public CompassWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    private final dji.v5.ux.core.widget.compass.CompassWidgetModel getWidgetModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.graphics.drawable.Drawable getHomeIcon() {
        return null;
    }
    
    public final void setHomeIcon(@org.jetbrains.annotations.NotNull
    android.graphics.drawable.Drawable icon) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.graphics.drawable.Drawable getHomeIconBackground() {
        return null;
    }
    
    public final void setHomeIconBackground(@org.jetbrains.annotations.NotNull
    android.graphics.drawable.Drawable background) {
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmName(name = "getRCLocationIcon")
    public final android.graphics.drawable.Drawable getRCLocationIcon() {
        return null;
    }
    
    @kotlin.jvm.JvmName(name = "setRCLocationIcon")
    public final void setRCLocationIcon(@org.jetbrains.annotations.NotNull
    android.graphics.drawable.Drawable icon) {
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmName(name = "getRCLocationIconBackground")
    public final android.graphics.drawable.Drawable getRCLocationIconBackground() {
        return null;
    }
    
    @kotlin.jvm.JvmName(name = "setRCLocationIconBackground")
    public final void setRCLocationIconBackground(@org.jetbrains.annotations.NotNull
    android.graphics.drawable.Drawable background) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.graphics.drawable.Drawable getAircraftIcon() {
        return null;
    }
    
    public final void setAircraftIcon(@org.jetbrains.annotations.NotNull
    android.graphics.drawable.Drawable icon) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.graphics.drawable.Drawable getAircraftIconBackground() {
        return null;
    }
    
    public final void setAircraftIconBackground(@org.jetbrains.annotations.NotNull
    android.graphics.drawable.Drawable background) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.graphics.drawable.Drawable getGimbalYawIcon() {
        return null;
    }
    
    public final void setGimbalYawIcon(@org.jetbrains.annotations.NotNull
    android.graphics.drawable.Drawable icon) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.graphics.drawable.Drawable getGimbalYawIconBackground() {
        return null;
    }
    
    public final void setGimbalYawIconBackground(@org.jetbrains.annotations.NotNull
    android.graphics.drawable.Drawable background) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.graphics.drawable.Drawable getNorthIcon() {
        return null;
    }
    
    public final void setNorthIcon(@org.jetbrains.annotations.NotNull
    android.graphics.drawable.Drawable icon) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.graphics.drawable.Drawable getNorthIconBackground() {
        return null;
    }
    
    public final void setNorthIconBackground(@org.jetbrains.annotations.NotNull
    android.graphics.drawable.Drawable background) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.graphics.drawable.Drawable getInnerCirclesIcon() {
        return null;
    }
    
    public final void setInnerCirclesIcon(@org.jetbrains.annotations.NotNull
    android.graphics.drawable.Drawable icon) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.graphics.drawable.Drawable getInnerCirclesIconBackground() {
        return null;
    }
    
    public final void setInnerCirclesIconBackground(@org.jetbrains.annotations.NotNull
    android.graphics.drawable.Drawable background) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.graphics.drawable.Drawable getCompassBackgroundIcon() {
        return null;
    }
    
    public final void setCompassBackgroundIcon(@org.jetbrains.annotations.NotNull
    android.graphics.drawable.Drawable icon) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.graphics.drawable.Drawable getCompassBackgroundIconBackground() {
        return null;
    }
    
    public final void setCompassBackgroundIconBackground(@org.jetbrains.annotations.NotNull
    android.graphics.drawable.Drawable background) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getAircraftAttitudeIcon() {
        return null;
    }
    
    public final void setAircraftAttitudeIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable icon) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.graphics.drawable.Drawable getAircraftAttitudeIconBackground() {
        return null;
    }
    
    public final void setAircraftAttitudeIconBackground(@org.jetbrains.annotations.NotNull
    android.graphics.drawable.Drawable background) {
    }
    
    @androidx.annotation.FloatRange(from = 1.0, to = 4.0)
    public final float getVisualCompassViewStrokeWidth() {
        return 0.0F;
    }
    
    public final void setVisualCompassViewStrokeWidth(@androidx.annotation.FloatRange(from = 1.0, to = 4.0)
    float strokeWidth) {
    }
    
    @androidx.annotation.ColorInt
    public final int getVisualCompassViewLineColor() {
        return 0;
    }
    
    public final void setVisualCompassViewLineColor(@androidx.annotation.ColorInt
    int color) {
    }
    
    public final int getVisualCompassViewLineInterval() {
        return 0;
    }
    
    public final void setVisualCompassViewLineInterval(@androidx.annotation.IntRange(from = 1L)
    int interval) {
    }
    
    public final int getVisualCompassViewNumberOfLines() {
        return 0;
    }
    
    public final void setVisualCompassViewNumberOfLines(@androidx.annotation.IntRange(from = 3L)
    int numberOfLines) {
    }
    
    public final float getGimbalYawViewStrokeWidth() {
        return 0.0F;
    }
    
    public final void setGimbalYawViewStrokeWidth(@androidx.annotation.FloatRange(from = 1.0, to = 4.0)
    float strokeWidth) {
    }
    
    @androidx.annotation.ColorInt
    public final int getGimbalYawViewYawColor() {
        return 0;
    }
    
    public final void setGimbalYawViewYawColor(@androidx.annotation.ColorInt
    int color) {
    }
    
    @androidx.annotation.ColorInt
    public final int getGimbalYawViewInvalidColor() {
        return 0;
    }
    
    public final void setGimbalYawViewInvalidColor(@androidx.annotation.ColorInt
    int color) {
    }
    
    @androidx.annotation.ColorInt
    public final int getGimbalYawViewBlinkColor() {
        return 0;
    }
    
    public final void setGimbalYawViewBlinkColor(@androidx.annotation.ColorInt
    int color) {
    }
    
    @java.lang.Override
    protected void initView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
    }
    
    @java.lang.Override
    protected void onAttachedToWindow() {
    }
    
    @java.lang.Override
    protected void onDetachedFromWindow() {
    }
    
    @java.lang.Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
    }
    
    @java.lang.Override
    protected void reactToModelChanges() {
    }
    
    private final void onCompassStateUpdated(dji.v5.ux.core.widget.compass.CompassWidgetModel.CompassWidgetState compassWidgetState) {
    }
    
    private final dji.v5.ux.core.widget.compass.CompassWidget.ViewCoordinates getSecondGPSLocationCoordinates(float phoneAzimuth, dji.v5.ux.core.widget.compass.CompassWidgetModel.CurrentLocationState state, dji.v5.ux.core.widget.compass.CompassWidgetModel.AircraftState aircraftState) {
        return null;
    }
    
    private final float getMaxDistance(dji.v5.ux.core.widget.compass.CompassWidgetModel.AircraftState aircraftState, dji.v5.ux.core.widget.compass.CompassWidgetModel.CurrentLocationState state) {
        return 0.0F;
    }
    
    private final dji.v5.ux.core.widget.compass.CompassWidget.ViewCoordinates getAircraftLocationCoordinates(float phoneAzimuth, dji.v5.ux.core.widget.compass.CompassWidgetModel.AircraftState aircraftState, dji.v5.ux.core.widget.compass.CompassWidgetModel.CurrentLocationState state) {
        return null;
    }
    
    private final float calculateScale(float distance) {
        return 0.0F;
    }
    
    private final void updateNorthHeadingUI(float phoneAzimuth) {
    }
    
    private final void updateAircraftAttitudeUI(dji.sdk.keyvalue.value.common.Attitude aircraftAttitude) {
    }
    
    private final void updateAircraftHeadingUI(float phoneAzimuth, dji.sdk.keyvalue.value.common.Attitude aircraftAttitude) {
    }
    
    private final void updateAircraftLocationUI(float maxDistance, float scale, dji.v5.ux.core.widget.compass.CompassWidget.ViewCoordinates viewCoordinates) {
    }
    
    private final void updateGimbalHeadingUI(float gimbalHeading, float rotationOffset) {
    }
    
    private final void updateSecondGPSLocationUI(dji.v5.ux.core.widget.compass.CompassWidgetModel.CenterType type, dji.v5.ux.core.widget.compass.CompassWidget.ViewCoordinates viewCoordinates) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getIdealDimensionRatioString() {
        return null;
    }
    
    /**
     * Get the index of the gimbal to which the widget is reacting
     *
     * @return [GimbalIndex]
     */
    @org.jetbrains.annotations.Nullable
    public final dji.v5.ux.core.util.SettingDefinitions.GimbalIndex getGimbalIndex() {
        return null;
    }
    
    /**
     * Set the index of gimbal to which the widget should react
     *
     * @param gimbalIndex index of the gimbal.
     */
    public final void setGimbalIndex(@org.jetbrains.annotations.Nullable
    dji.v5.ux.core.util.SettingDefinitions.GimbalIndex gimbalIndex) {
    }
    
    /**
     * Set the resource ID for the home icon
     *
     * @param resourceId Integer ID of the drawable resource
     */
    public final void setHomeIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the resource ID for the home icon's background
     *
     * @param resourceId Integer ID of the icon's background resource
     */
    public final void setHomeIconBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the resource ID for the RC location icon
     *
     * @param resourceId Integer ID of the drawable resource
     */
    public final void setRCLocationIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the resource ID for the RC location icon's background
     *
     * @param resourceId Integer ID of the icon's background resource
     */
    public final void setRCLocationIconBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the resource ID for the aircraft icon
     *
     * @param resourceId Integer ID of the drawable resource
     */
    public final void setAircraftIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the resource ID for the aircraft icon's background
     *
     * @param resourceId Integer ID of the icon's background resource
     */
    public final void setAircraftIconBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the resource ID for the gimbal yaw icon
     *
     * @param resourceId Integer ID of the drawable resource
     */
    public final void setGimbalYawIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the resource ID for the gimbal yaw icon's background
     *
     * @param resourceId Integer ID of the icon's background resource
     */
    public final void setGimbalYawIconBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the resource ID for the north icon
     *
     * @param resourceId Integer ID of the drawable resource
     */
    public final void setNorthIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the resource ID for the north icon's background
     *
     * @param resourceId Integer ID of the icon's background resource
     */
    public final void setNorthIconBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the resource ID for the inner circles icon
     *
     * @param resourceId Integer ID of the drawable resource
     */
    public final void setInnerCirclesIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the resource ID for the inner circles icon's background
     *
     * @param resourceId Integer ID of the icon's background resource
     */
    public final void setInnerCirclesIconBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the resource ID for the compass background icon
     *
     * @param resourceId Integer ID of the drawable resource
     */
    public final void setCompassBackgroundIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the resource ID for the compass background icon's background
     *
     * @param resourceId Integer ID of the icon's background resource
     */
    public final void setCompassBackgroundIconBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the resource ID for the aircraft attitude icon's background
     *
     * @param resourceId Integer ID of the icon's background resource
     */
    public final void setAircraftAttitudeIconBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    @android.annotation.SuppressLint(value = {"Recycle"})
    private final void initAttributes(android.content.Context context, android.util.AttributeSet attrs) {
    }
    
    /**
     * Get the [ModelState] updates
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.SuppressWarnings(value = {})
    @java.lang.Override
    public io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.widget.compass.CompassWidget.ModelState> getWidgetStateUpdate() {
        return null;
    }
    
    /**
     * Wrapper that holds the x and y values of the view coordinates
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\t"}, d2 = {"Ldji/v5/ux/core/widget/compass/CompassWidget$ViewCoordinates;", "", "x", "", "y", "(Ldji/v5/ux/core/widget/compass/CompassWidget;FF)V", "getX", "()F", "getY", "android-sdk-v5-uxsdk_debug"})
    final class ViewCoordinates {
        private final float x = 0.0F;
        private final float y = 0.0F;
        
        public ViewCoordinates(float x, float y) {
            super();
        }
        
        public final float getX() {
            return 0.0F;
        }
        
        public final float getY() {
            return 0.0F;
        }
    }
    
    /**
     * Class defines the widget state updates
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Ldji/v5/ux/core/widget/compass/CompassWidget$ModelState;", "", "()V", "CompassStateUpdated", "ProductConnected", "Ldji/v5/ux/core/widget/compass/CompassWidget$ModelState$CompassStateUpdated;", "Ldji/v5/ux/core/widget/compass/CompassWidget$ModelState$ProductConnected;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class ModelState {
        
        private ModelState() {
            super();
        }
        
        /**
         * Product connection update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/core/widget/compass/CompassWidget$ModelState$ProductConnected;", "Ldji/v5/ux/core/widget/compass/CompassWidget$ModelState;", "isConnected", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductConnected extends dji.v5.ux.core.widget.compass.CompassWidget.ModelState {
            private final boolean isConnected = false;
            
            /**
             * Product connection update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.compass.CompassWidget.ModelState.ProductConnected copy(boolean isConnected) {
                return null;
            }
            
            /**
             * Product connection update
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Product connection update
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Product connection update
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public ProductConnected(boolean isConnected) {
                super();
            }
            
            public final boolean component1() {
                return false;
            }
            
            public final boolean isConnected() {
                return false;
            }
        }
        
        /**
         * Compass state update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/core/widget/compass/CompassWidget$ModelState$CompassStateUpdated;", "Ldji/v5/ux/core/widget/compass/CompassWidget$ModelState;", "compassWidgetState", "Ldji/v5/ux/core/widget/compass/CompassWidgetModel$CompassWidgetState;", "(Ldji/v5/ux/core/widget/compass/CompassWidgetModel$CompassWidgetState;)V", "getCompassWidgetState", "()Ldji/v5/ux/core/widget/compass/CompassWidgetModel$CompassWidgetState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class CompassStateUpdated extends dji.v5.ux.core.widget.compass.CompassWidget.ModelState {
            @org.jetbrains.annotations.NotNull
            private final dji.v5.ux.core.widget.compass.CompassWidgetModel.CompassWidgetState compassWidgetState = null;
            
            /**
             * Compass state update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.compass.CompassWidget.ModelState.CompassStateUpdated copy(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.widget.compass.CompassWidgetModel.CompassWidgetState compassWidgetState) {
                return null;
            }
            
            /**
             * Compass state update
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Compass state update
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Compass state update
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public CompassStateUpdated(@org.jetbrains.annotations.NotNull
            dji.v5.ux.core.widget.compass.CompassWidgetModel.CompassWidgetState compassWidgetState) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.compass.CompassWidgetModel.CompassWidgetState component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.widget.compass.CompassWidgetModel.CompassWidgetState getCompassWidgetState() {
                return null;
            }
        }
    }
}