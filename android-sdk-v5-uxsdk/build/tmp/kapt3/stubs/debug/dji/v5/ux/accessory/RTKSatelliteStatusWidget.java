package dji.v5.ux.accessory;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u00b4\u0001\u00b5\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\n\u0010\u008d\u0001\u001a\u00030\u008e\u0001H\u0016J\u0012\u0010\u008f\u0001\u001a\u00020\b2\u0007\u0010\u0090\u0001\u001a\u00020\u001eH\u0007J\u001a\u0010\u0091\u0001\u001a\u00030\u0092\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J\n\u0010\u0093\u0001\u001a\u00030\u0092\u0001H\u0002J\n\u0010\u0094\u0001\u001a\u00030\u0092\u0001H\u0002J$\u0010\u0095\u0001\u001a\u00030\u0092\u00012\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J\n\u0010\u0096\u0001\u001a\u00030\u0092\u0001H\u0014J\n\u0010\u0097\u0001\u001a\u00030\u0092\u0001H\u0014J\n\u0010\u0098\u0001\u001a\u00030\u0092\u0001H\u0014J\u0010\u0010\u0099\u0001\u001a\u00030\u0092\u00012\u0006\u0010p\u001a\u00020qJ\u001b\u0010\u009a\u0001\u001a\u00030\u0092\u00012\u0007\u0010\u0090\u0001\u001a\u00020\u001e2\b\b\u0001\u0010Q\u001a\u00020\bJ\u0013\u0010\u009b\u0001\u001a\u00030\u0092\u00012\t\b\u0001\u0010\u009c\u0001\u001a\u00020\bJ\u0013\u0010\u009d\u0001\u001a\u00030\u0092\u00012\t\b\u0001\u0010\u009c\u0001\u001a\u00020\bJ\u0013\u0010\u009e\u0001\u001a\u00030\u0092\u00012\t\b\u0001\u0010\u009c\u0001\u001a\u00020\bJ\u0013\u0010\u009f\u0001\u001a\u00030\u0092\u00012\t\b\u0001\u0010\u009c\u0001\u001a\u00020\bJ\u0013\u0010\u00a0\u0001\u001a\u00030\u0092\u00012\u0007\u0010\u00a1\u0001\u001a\u00020\u001eH\u0002J\u0016\u0010\u00a2\u0001\u001a\u00030\u0092\u00012\n\u0010\u00a3\u0001\u001a\u0005\u0018\u00010\u00a4\u0001H\u0002J\n\u0010\u00a5\u0001\u001a\u00030\u0092\u0001H\u0002J\u0014\u0010\u00a6\u0001\u001a\u00030\u0092\u00012\b\u0010\u00a7\u0001\u001a\u00030\u00a8\u0001H\u0002J\u0016\u0010\u00a9\u0001\u001a\u00030\u0092\u00012\n\u0010\u00aa\u0001\u001a\u0005\u0018\u00010\u00ab\u0001H\u0002J\u0016\u0010\u00ac\u0001\u001a\u00030\u0092\u00012\n\u0010\u00ad\u0001\u001a\u0005\u0018\u00010\u00ae\u0001H\u0002J\u0014\u0010\u00af\u0001\u001a\u00030\u0092\u00012\b\u0010\u00b0\u0001\u001a\u00030\u00b1\u0001H\u0002J\u0013\u0010\u00b2\u0001\u001a\u00030\u0092\u00012\u0007\u0010\u00b3\u0001\u001a\u00020.H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020.@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00103\u001a\u00020.2\u0006\u0010-\u001a\u00020.@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00100\"\u0004\b4\u00102R$\u00105\u001a\u00020.2\u0006\u0010-\u001a\u00020.@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00100\"\u0004\b6\u00102R\u000e\u00107\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020>X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020>X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010B\u001a\u0004\u0018\u00010A2\b\u0010@\u001a\u0004\u0018\u00010A8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR&\u0010I\u001a\u00020H2\b\b\u0001\u0010G\u001a\u00020H8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR(\u0010N\u001a\u0004\u0018\u00010A2\b\u0010@\u001a\u0004\u0018\u00010A8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bO\u0010D\"\u0004\bP\u0010FR&\u0010R\u001a\u00020\b2\b\b\u0001\u0010Q\u001a\u00020\b8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR&\u0010W\u001a\u00020H2\b\b\u0001\u0010G\u001a\u00020H8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bX\u0010K\"\u0004\bY\u0010MR(\u0010Z\u001a\u0004\u0018\u00010A2\b\u0010@\u001a\u0004\u0018\u00010A8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b[\u0010D\"\u0004\b\\\u0010FR&\u0010]\u001a\u00020\b2\b\b\u0001\u0010Q\u001a\u00020\b8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b^\u0010T\"\u0004\b_\u0010VR(\u0010b\u001a\u0004\u0018\u00010a2\b\u0010`\u001a\u0004\u0018\u00010a8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR&\u0010g\u001a\u00020H2\b\b\u0001\u0010G\u001a\u00020H8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bh\u0010K\"\u0004\bi\u0010MR\u000e\u0010j\u001a\u00020>X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010k\u001a\u00020>X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020>X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010m\u001a\u00020\b2\b\b\u0001\u0010Q\u001a\u00020\b8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bn\u0010T\"\u0004\bo\u0010VR\u0010\u0010p\u001a\u0004\u0018\u00010qX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010s\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010t\u001a\u0004\u0018\u00010A2\b\u0010@\u001a\u0004\u0018\u00010A8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bu\u0010D\"\u0004\bv\u0010FR&\u0010w\u001a\u00020\b2\b\b\u0001\u0010Q\u001a\u00020\b8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bx\u0010T\"\u0004\by\u0010VR(\u0010z\u001a\u0004\u0018\u00010a2\b\u0010`\u001a\u0004\u0018\u00010a8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b{\u0010d\"\u0004\b|\u0010fR&\u0010}\u001a\u00020H2\b\b\u0001\u0010G\u001a\u00020H8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b~\u0010K\"\u0004\b\u007f\u0010MR\u000f\u0010\u0080\u0001\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0081\u0001\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R,\u0010\u0083\u0001\u001a\u0004\u0018\u00010A2\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010A8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0084\u0001\u0010D\"\u0005\b\u0085\u0001\u0010FR\u000f\u0010\u0086\u0001\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u0087\u0001\u001a\u00030\u0088\u00018BX\u0082\u0084\u0002\u00a2\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\u00a8\u0006\u00b6\u0001"}, d2 = {"Ldji/v5/ux/accessory/RTKSatelliteStatusWidget;", "Ldji/v5/ux/core/base/widget/ConstraintLayoutWidget;", "Ldji/v5/ux/accessory/RTKSatelliteStatusWidget$ModelState;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "aircraftAltitudeTextView", "Landroid/widget/TextView;", "aircraftCoordinatesTitleTextView", "aircraftLatitudeTextView", "aircraftLongitudeTextView", "altitudeTitleTextView", "antenna1TitleTextView", "antenna2TitleTextView", "baseStationAltitudeTextView", "baseStationConnectImageView", "Landroid/widget/ImageView;", "baseStationCoordinatesTitleTextView", "baseStationLatitudeTextView", "baseStationLongitudeTextView", "beiDouAntenna1TextView", "beiDouAntenna2TextView", "beiDouBaseStationTextView", "beiDouTitleTextView", "connectionStateTextColorMap", "", "Ldji/v5/ux/accessory/RTKSatelliteStatusWidgetModel$RTKBaseStationState;", "courseAngleTextView", "courseAngleTitleTextView", "galileoAntenna1TextView", "galileoAntenna2TextView", "galileoBaseStationTextView", "galileoTitleTextView", "glonassAntenna1TextView", "glonassAntenna2TextView", "glonassBaseStationTextView", "glonassTitleTextView", "gpsAntenna1TextView", "gpsAntenna2TextView", "gpsBaseStationTextView", "gpsTitleTextView", "isVisible", "", "isBeiDouSatelliteInfoVisible", "()Z", "setBeiDouSatelliteInfoVisible", "(Z)V", "isGLONASSSatelliteInfoVisible", "setGLONASSSatelliteInfoVisible", "isGalileoSatelliteInfoVisible", "setGalileoSatelliteInfoVisible", "latitudeTitleTextView", "longitudeTitleTextView", "orientationTextView", "orientationTitleTextView", "positioningTextView", "positioningTitleTextView", "rtkAircraftSeparator", "Landroid/view/View;", "rtkBaseStationSeparator", "drawable", "Landroid/graphics/drawable/Drawable;", "rtkConnectionStatusTextBackground", "getRTKConnectionStatusTextBackground", "()Landroid/graphics/drawable/Drawable;", "setRTKConnectionStatusTextBackground", "(Landroid/graphics/drawable/Drawable;)V", "textSize", "", "rtkConnectionStatusTextSize", "getRTKConnectionStatusTextSize", "()F", "setRTKConnectionStatusTextSize", "(F)V", "rtkConnectionStatusTitleTextBackground", "getRTKConnectionStatusTitleTextBackground", "setRTKConnectionStatusTitleTextBackground", "color", "rtkConnectionStatusTitleTextColor", "getRTKConnectionStatusTitleTextColor", "()I", "setRTKConnectionStatusTitleTextColor", "(I)V", "rtkConnectionStatusTitleTextSize", "getRTKConnectionStatusTitleTextSize", "setRTKConnectionStatusTitleTextSize", "rtkLabelsTextBackground", "getRTKLabelsTextBackground", "setRTKLabelsTextBackground", "rtkLabelsTextColor", "getRTKLabelsTextColor", "setRTKLabelsTextColor", "colorStateList", "Landroid/content/res/ColorStateList;", "rtkLabelsTextColors", "getRTKLabelsTextColors", "()Landroid/content/res/ColorStateList;", "setRTKLabelsTextColors", "(Landroid/content/res/ColorStateList;)V", "rtkLabelsTextSize", "getRTKLabelsTextSize", "setRTKLabelsTextSize", "rtkLocationSeparator", "rtkOrientationPositioningSeparator", "rtkSatelliteCountSeparator", "rtkSeparatorsColor", "getRTKSeparatorsColor", "setRTKSeparatorsColor", "rtkStationListener", "Ldji/v5/ux/accessory/RTKSatelliteStatusWidget$RTKStationListener;", "rtkStatusTextView", "rtkStatusTitleTextView", "rtkValuesTextBackground", "getRTKValuesTextBackground", "setRTKValuesTextBackground", "rtkValuesTextColor", "getRTKValuesTextColor", "setRTKValuesTextColor", "rtkValuesTextColors", "getRTKValuesTextColors", "setRTKValuesTextColors", "rtkValuesTextSize", "getRTKValuesTextSize", "setRTKValuesTextSize", "standardDeviationTextView", "standardDeviationTitleTextView", "value", "tableBackground", "getTableBackground", "setTableBackground", "tableBackgroundImageView", "widgetModel", "Ldji/v5/ux/accessory/RTKSatelliteStatusWidgetModel;", "getWidgetModel", "()Ldji/v5/ux/accessory/RTKSatelliteStatusWidgetModel;", "widgetModel$delegate", "Lkotlin/Lazy;", "getIdealDimensionRatioString", "", "getRTKConnectionStatusLabelTextColor", "state", "initAttributes", "", "initItemValues", "initListener", "initView", "onAttachedToWindow", "onDetachedFromWindow", "reactToModelChanges", "setRTKConnectListener", "setRTKConnectionStatusLabelTextColor", "setRTKConnectionStatusTextAppearance", "textAppearance", "setRTKConnectionStatusTitleTextAppearance", "setRTKLabelsTextAppearance", "setRTKValuesTextAppearance", "updateBaseStationStatus", "connectionState", "updateBaseStationUI", "stationSource", "Ldji/sdk/keyvalue/value/rtkbasestation/RTKReferenceStationSource;", "updateLabelView", "updateNetworkServiceStatus", "networkServiceState", "Ldji/v5/ux/accessory/RTKSatelliteStatusWidgetModel$RTKNetworkServiceState;", "updateRTKLocationInfo", "rtkLocationInfo", "Ldji/v5/manager/aircraft/rtk/RTKLocationInfo;", "updateRTKSystemState", "rtkSystemState", "Ldji/v5/manager/aircraft/rtk/RTKSystemState;", "updateStandardDeviation", "standardDeviation", "Ldji/v5/ux/accessory/RTKSatelliteStatusWidgetModel$StandardDeviation;", "updateUIForIsRTKConnected", "isRTKConnected", "ModelState", "RTKStationListener", "android-sdk-v5-uxsdk_debug"})
public class RTKSatelliteStatusWidget extends dji.v5.ux.core.base.widget.ConstraintLayoutWidget<dji.v5.ux.accessory.RTKSatelliteStatusWidget.ModelState> {
    private final android.widget.TextView rtkStatusTitleTextView = null;
    private final android.widget.TextView rtkStatusTextView = null;
    private final android.widget.ImageView baseStationConnectImageView = null;
    private final android.widget.ImageView tableBackgroundImageView = null;
    private final android.widget.TextView antenna1TitleTextView = null;
    private final android.widget.TextView antenna2TitleTextView = null;
    private final android.widget.TextView gpsTitleTextView = null;
    private final android.widget.TextView gpsAntenna1TextView = null;
    private final android.widget.TextView gpsAntenna2TextView = null;
    private final android.widget.TextView gpsBaseStationTextView = null;
    private final android.widget.TextView beiDouTitleTextView = null;
    private final android.widget.TextView beiDouAntenna1TextView = null;
    private final android.widget.TextView beiDouAntenna2TextView = null;
    private final android.widget.TextView beiDouBaseStationTextView = null;
    private final android.widget.TextView glonassTitleTextView = null;
    private final android.widget.TextView glonassAntenna1TextView = null;
    private final android.widget.TextView glonassAntenna2TextView = null;
    private final android.widget.TextView glonassBaseStationTextView = null;
    private final android.widget.TextView galileoTitleTextView = null;
    private final android.widget.TextView galileoAntenna1TextView = null;
    private final android.widget.TextView galileoAntenna2TextView = null;
    private final android.widget.TextView galileoBaseStationTextView = null;
    private final android.widget.TextView latitudeTitleTextView = null;
    private final android.widget.TextView longitudeTitleTextView = null;
    private final android.widget.TextView altitudeTitleTextView = null;
    private final android.widget.TextView aircraftCoordinatesTitleTextView = null;
    private final android.widget.TextView aircraftLatitudeTextView = null;
    private final android.widget.TextView aircraftLongitudeTextView = null;
    private final android.widget.TextView aircraftAltitudeTextView = null;
    private final android.widget.TextView baseStationCoordinatesTitleTextView = null;
    private final android.widget.TextView baseStationLatitudeTextView = null;
    private final android.widget.TextView baseStationLongitudeTextView = null;
    private final android.widget.TextView baseStationAltitudeTextView = null;
    private final android.widget.TextView courseAngleTitleTextView = null;
    private final android.widget.TextView courseAngleTextView = null;
    private final android.widget.TextView orientationTitleTextView = null;
    private final android.widget.TextView orientationTextView = null;
    private final android.widget.TextView positioningTitleTextView = null;
    private final android.widget.TextView positioningTextView = null;
    private final android.widget.TextView standardDeviationTitleTextView = null;
    private final android.widget.TextView standardDeviationTextView = null;
    private final android.view.View rtkAircraftSeparator = null;
    private final android.view.View rtkBaseStationSeparator = null;
    private final android.view.View rtkOrientationPositioningSeparator = null;
    private final android.view.View rtkLocationSeparator = null;
    private final android.view.View rtkSatelliteCountSeparator = null;
    private final java.util.Map<dji.v5.ux.accessory.RTKSatelliteStatusWidgetModel.RTKBaseStationState, java.lang.Integer> connectionStateTextColorMap = null;
    private final kotlin.Lazy widgetModel$delegate = null;
    
    /**
     * Shows or hides the BeiDou satellite information.
     */
    private boolean isBeiDouSatelliteInfoVisible = true;
    
    /**
     * Shows or hides the GLONASS satellite information.
     */
    private boolean isGLONASSSatelliteInfoVisible = true;
    
    /**
     * Shows or hides the Galileo satellite information.
     */
    private boolean isGalileoSatelliteInfoVisible = true;
    private dji.v5.ux.accessory.RTKSatelliteStatusWidget.RTKStationListener rtkStationListener;
    
    @kotlin.jvm.JvmOverloads
    public RTKSatelliteStatusWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public RTKSatelliteStatusWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public RTKSatelliteStatusWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    private final dji.v5.ux.accessory.RTKSatelliteStatusWidgetModel getWidgetModel() {
        return null;
    }
    
    @androidx.annotation.Dimension
    @kotlin.jvm.JvmName(name = "getRTKConnectionStatusTitleTextSize")
    public final float getRTKConnectionStatusTitleTextSize() {
        return 0.0F;
    }
    
    @kotlin.jvm.JvmName(name = "setRTKConnectionStatusTitleTextSize")
    public final void setRTKConnectionStatusTitleTextSize(@androidx.annotation.Dimension
    float textSize) {
    }
    
    @androidx.annotation.ColorInt
    @kotlin.jvm.JvmName(name = "getRTKConnectionStatusTitleTextColor")
    public final int getRTKConnectionStatusTitleTextColor() {
        return 0;
    }
    
    @kotlin.jvm.JvmName(name = "setRTKConnectionStatusTitleTextColor")
    public final void setRTKConnectionStatusTitleTextColor(@androidx.annotation.ColorInt
    int color) {
    }
    
    @org.jetbrains.annotations.Nullable
    @kotlin.jvm.JvmName(name = "getRTKConnectionStatusTitleTextBackground")
    public final android.graphics.drawable.Drawable getRTKConnectionStatusTitleTextBackground() {
        return null;
    }
    
    @kotlin.jvm.JvmName(name = "setRTKConnectionStatusTitleTextBackground")
    public final void setRTKConnectionStatusTitleTextBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable drawable) {
    }
    
    @androidx.annotation.Dimension
    @kotlin.jvm.JvmName(name = "getRTKConnectionStatusTextSize")
    public final float getRTKConnectionStatusTextSize() {
        return 0.0F;
    }
    
    @kotlin.jvm.JvmName(name = "setRTKConnectionStatusTextSize")
    public final void setRTKConnectionStatusTextSize(@androidx.annotation.Dimension
    float textSize) {
    }
    
    @org.jetbrains.annotations.Nullable
    @kotlin.jvm.JvmName(name = "getRTKConnectionStatusTextBackground")
    public final android.graphics.drawable.Drawable getRTKConnectionStatusTextBackground() {
        return null;
    }
    
    @kotlin.jvm.JvmName(name = "setRTKConnectionStatusTextBackground")
    public final void setRTKConnectionStatusTextBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable drawable) {
    }
    
    @org.jetbrains.annotations.Nullable
    @kotlin.jvm.JvmName(name = "getRTKLabelsTextColors")
    public final android.content.res.ColorStateList getRTKLabelsTextColors() {
        return null;
    }
    
    @kotlin.jvm.JvmName(name = "setRTKLabelsTextColors")
    public final void setRTKLabelsTextColors(@org.jetbrains.annotations.Nullable
    android.content.res.ColorStateList colorStateList) {
    }
    
    @androidx.annotation.ColorInt
    @kotlin.jvm.JvmName(name = "getRTKLabelsTextColor")
    public final int getRTKLabelsTextColor() {
        return 0;
    }
    
    @kotlin.jvm.JvmName(name = "setRTKLabelsTextColor")
    public final void setRTKLabelsTextColor(@androidx.annotation.ColorInt
    int color) {
    }
    
    @androidx.annotation.Dimension
    @kotlin.jvm.JvmName(name = "getRTKLabelsTextSize")
    public final float getRTKLabelsTextSize() {
        return 0.0F;
    }
    
    @kotlin.jvm.JvmName(name = "setRTKLabelsTextSize")
    public final void setRTKLabelsTextSize(@androidx.annotation.Dimension
    float textSize) {
    }
    
    @org.jetbrains.annotations.Nullable
    @kotlin.jvm.JvmName(name = "getRTKLabelsTextBackground")
    public final android.graphics.drawable.Drawable getRTKLabelsTextBackground() {
        return null;
    }
    
    @kotlin.jvm.JvmName(name = "setRTKLabelsTextBackground")
    public final void setRTKLabelsTextBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable drawable) {
    }
    
    @org.jetbrains.annotations.Nullable
    @kotlin.jvm.JvmName(name = "getRTKValuesTextColors")
    public final android.content.res.ColorStateList getRTKValuesTextColors() {
        return null;
    }
    
    @kotlin.jvm.JvmName(name = "setRTKValuesTextColors")
    public final void setRTKValuesTextColors(@org.jetbrains.annotations.Nullable
    android.content.res.ColorStateList colorStateList) {
    }
    
    @androidx.annotation.ColorInt
    @kotlin.jvm.JvmName(name = "getRTKValuesTextColor")
    public final int getRTKValuesTextColor() {
        return 0;
    }
    
    @kotlin.jvm.JvmName(name = "setRTKValuesTextColor")
    public final void setRTKValuesTextColor(@androidx.annotation.ColorInt
    int color) {
    }
    
    @androidx.annotation.Dimension
    @kotlin.jvm.JvmName(name = "getRTKValuesTextSize")
    public final float getRTKValuesTextSize() {
        return 0.0F;
    }
    
    @kotlin.jvm.JvmName(name = "setRTKValuesTextSize")
    public final void setRTKValuesTextSize(@androidx.annotation.Dimension
    float textSize) {
    }
    
    @org.jetbrains.annotations.Nullable
    @kotlin.jvm.JvmName(name = "getRTKValuesTextBackground")
    public final android.graphics.drawable.Drawable getRTKValuesTextBackground() {
        return null;
    }
    
    @kotlin.jvm.JvmName(name = "setRTKValuesTextBackground")
    public final void setRTKValuesTextBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable drawable) {
    }
    
    @androidx.annotation.ColorInt
    @kotlin.jvm.JvmName(name = "getRTKSeparatorsColor")
    public final int getRTKSeparatorsColor() {
        return 0;
    }
    
    @kotlin.jvm.JvmName(name = "setRTKSeparatorsColor")
    public final void setRTKSeparatorsColor(@androidx.annotation.ColorInt
    int color) {
    }
    
    public final boolean isBeiDouSatelliteInfoVisible() {
        return false;
    }
    
    public final void setBeiDouSatelliteInfoVisible(boolean isVisible) {
    }
    
    public final boolean isGLONASSSatelliteInfoVisible() {
        return false;
    }
    
    public final void setGLONASSSatelliteInfoVisible(boolean isVisible) {
    }
    
    public final boolean isGalileoSatelliteInfoVisible() {
        return false;
    }
    
    public final void setGalileoSatelliteInfoVisible(boolean isVisible) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getTableBackground() {
        return null;
    }
    
    public final void setTableBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    @java.lang.Override
    protected void initView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
    }
    
    private final void updateLabelView() {
    }
    
    private final void initListener() {
    }
    
    @java.lang.Override
    protected void onAttachedToWindow() {
    }
    
    @java.lang.Override
    protected void onDetachedFromWindow() {
    }
    
    @java.lang.Override
    protected void reactToModelChanges() {
    }
    
    private final void initItemValues() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getIdealDimensionRatioString() {
        return null;
    }
    
    /**
     * Set the text appearance of the RTK connection state title.
     *
     * @param textAppearance Style resource for text appearance
     */
    public final void setRTKConnectionStatusTitleTextAppearance(@androidx.annotation.StyleRes
    int textAppearance) {
    }
    
    /**
     * Set the text appearance of the RTK connection state.
     *
     * @param textAppearance Style resource for text appearance
     */
    public final void setRTKConnectionStatusTextAppearance(@androidx.annotation.StyleRes
    int textAppearance) {
    }
    
    /**
     * Set the text color of the RTK connection state when the RTKBaseStationState is the given
     * value.
     *
     * @param state The state for which to set the text color.
     * @param color The color of the text
     */
    public final void setRTKConnectionStatusLabelTextColor(@org.jetbrains.annotations.NotNull
    dji.v5.ux.accessory.RTKSatelliteStatusWidgetModel.RTKBaseStationState state, @androidx.annotation.ColorInt
    int color) {
    }
    
    /**
     * Get the text color of the RTK connection state when the RTKBaseStationState is the given
     * value.
     *
     * @param state The state for which to get the text color.
     * @return The color of the text
     */
    @androidx.annotation.ColorInt
    public final int getRTKConnectionStatusLabelTextColor(@org.jetbrains.annotations.NotNull
    dji.v5.ux.accessory.RTKSatelliteStatusWidgetModel.RTKBaseStationState state) {
        return 0;
    }
    
    /**
     * Set text appearance of the RTK labels text views
     *
     * @param textAppearance Style resource for text appearance
     */
    public final void setRTKLabelsTextAppearance(@androidx.annotation.StyleRes
    int textAppearance) {
    }
    
    /**
     * Set text appearance of the RTK values text views
     *
     * @param textAppearance Style resource for text appearance
     */
    public final void setRTKValuesTextAppearance(@androidx.annotation.StyleRes
    int textAppearance) {
    }
    
    @android.annotation.SuppressLint(value = {"Recycle"})
    private final void initAttributes(android.content.Context context, android.util.AttributeSet attrs) {
    }
    
    private final void updateBaseStationStatus(dji.v5.ux.accessory.RTKSatelliteStatusWidgetModel.RTKBaseStationState connectionState) {
    }
    
    private final void updateNetworkServiceStatus(dji.v5.ux.accessory.RTKSatelliteStatusWidgetModel.RTKNetworkServiceState networkServiceState) {
    }
    
    private final void updateUIForIsRTKConnected(boolean isRTKConnected) {
    }
    
    private final void updateRTKLocationInfo(dji.v5.manager.aircraft.rtk.RTKLocationInfo rtkLocationInfo) {
    }
    
    private final void updateStandardDeviation(dji.v5.ux.accessory.RTKSatelliteStatusWidgetModel.StandardDeviation standardDeviation) {
    }
    
    private final void updateRTKSystemState(dji.v5.manager.aircraft.rtk.RTKSystemState rtkSystemState) {
    }
    
    private final void updateBaseStationUI(dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource stationSource) {
    }
    
    public final void setRTKConnectListener(@org.jetbrains.annotations.NotNull
    dji.v5.ux.accessory.RTKSatelliteStatusWidget.RTKStationListener rtkStationListener) {
    }
    
    /**
     * Class defines the widget state updates
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Ldji/v5/ux/accessory/RTKSatelliteStatusWidget$ModelState;", "", "()V", "ProductConnected", "Ldji/v5/ux/accessory/RTKSatelliteStatusWidget$ModelState$ProductConnected;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class ModelState {
        
        private ModelState() {
            super();
        }
        
        /**
         * Product connection update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/accessory/RTKSatelliteStatusWidget$ModelState$ProductConnected;", "Ldji/v5/ux/accessory/RTKSatelliteStatusWidget$ModelState;", "isConnected", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class ProductConnected extends dji.v5.ux.accessory.RTKSatelliteStatusWidget.ModelState {
            private final boolean isConnected = false;
            
            /**
             * Product connection update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.accessory.RTKSatelliteStatusWidget.ModelState.ProductConnected copy(boolean isConnected) {
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
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Ldji/v5/ux/accessory/RTKSatelliteStatusWidget$RTKStationListener;", "", "showConnectView", "", "android-sdk-v5-uxsdk_debug"})
    public static abstract interface RTKStationListener {
        
        public abstract void showConnectView();
    }
}