package dji.v5.ux.core.widget.fpv;

import java.lang.System;

/**
 * This widget shows the video feed from the camera.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00b4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u009d\u0001\u009e\u0001B%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ&\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020\t2\u0006\u0010f\u001a\u00020\t2\u0006\u0010g\u001a\u00020\t2\u0006\u0010h\u001a\u00020\tJ\b\u0010i\u001a\u00020dH\u0002J\b\u0010j\u001a\u00020dH\u0002J\b\u0010k\u001a\u00020dH\u0002J\b\u0010l\u001a\u00020dH\u0002J\b\u0010m\u001a\u00020nH\u0016J\b\u0010o\u001a\u0004\u0018\u00010pJ\u000e\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00020rH\u0016J\u0018\u0010s\u001a\u00020d2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0003J\"\u0010t\u001a\u00020d2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0014J\b\u0010u\u001a\u00020dH\u0002J\b\u0010v\u001a\u00020dH\u0014J\b\u0010w\u001a\u00020dH\u0014J0\u0010x\u001a\u00020d2\u0006\u0010y\u001a\u00020J2\u0006\u0010z\u001a\u00020\t2\u0006\u0010{\u001a\u00020\t2\u0006\u0010|\u001a\u00020\t2\u0006\u0010}\u001a\u00020\tH\u0014J\b\u0010~\u001a\u00020dH\u0014J\u0011\u0010\u007f\u001a\u00020d2\t\b\u0001\u0010\u0080\u0001\u001a\u00020\tJ\u0012\u0010\u0081\u0001\u001a\u00020d2\t\b\u0001\u0010\u0080\u0001\u001a\u00020\tJ\u0011\u0010\u0082\u0001\u001a\u00020d2\b\u0010\u0083\u0001\u001a\u00030\u0084\u0001J\u0010\u0010\u0085\u0001\u001a\u00020d2\u0007\u0010\u0086\u0001\u001a\u00020JJ\u0010\u0010\u0087\u0001\u001a\u00020d2\u0007\u0010\u0088\u0001\u001a\u00020JJ\t\u0010\u0089\u0001\u001a\u00020dH\u0002J\u0012\u0010\u008a\u0001\u001a\u00020d2\u0007\u0010\u008b\u0001\u001a\u00020\tH\u0016J,\u0010\u008c\u0001\u001a\u00020d2\b\u0010\u008d\u0001\u001a\u00030\u008e\u00012\u0007\u0010\u008f\u0001\u001a\u00020\t2\u0006\u0010e\u001a\u00020\t2\u0006\u0010f\u001a\u00020\tH\u0016J\u0013\u0010\u0090\u0001\u001a\u00020d2\b\u0010\u008d\u0001\u001a\u00030\u008e\u0001H\u0016J\u0013\u0010\u0091\u0001\u001a\u00020d2\b\u0010\u008d\u0001\u001a\u00030\u008e\u0001H\u0016J\u0012\u0010\u0092\u0001\u001a\u00020d2\u0007\u0010\u0093\u0001\u001a\u00020nH\u0002J\u0012\u0010\u0094\u0001\u001a\u00020d2\u0007\u0010\u0095\u0001\u001a\u00020nH\u0002J\t\u0010\u0096\u0001\u001a\u00020dH\u0002J%\u0010\u0097\u0001\u001a\u00020d2\n\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0099\u00012\u0006\u0010e\u001a\u00020\t2\u0006\u0010f\u001a\u00020\tH\u0002J\u0019\u0010\u009a\u0001\u001a\u00020d2\u0007\u0010\u009b\u0001\u001a\u00020p2\u0007\u0010\u009c\u0001\u001a\u00020WR&\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\f8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R&\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\f8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R(\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR&\u0010\u001d\u001a\u00020\t2\b\b\u0001\u0010\u001c\u001a\u00020\t8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\"\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R&\u0010*\u001a\u00020\f2\b\b\u0001\u0010)\u001a\u00020\f8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b+\u0010\u000f\"\u0004\b,\u0010\u0011R\u000e\u0010-\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010/\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b0\u0010\u0019\"\u0004\b1\u0010\u001bR&\u00102\u001a\u00020\t2\b\b\u0001\u0010\u001c\u001a\u00020\t8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b3\u0010\u001f\"\u0004\b4\u0010!R(\u00105\u001a\u0004\u0018\u00010#2\b\u0010\"\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b6\u0010&\"\u0004\b7\u0010(R&\u00108\u001a\u00020\f2\b\b\u0001\u0010)\u001a\u00020\f8G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b9\u0010\u000f\"\u0004\b:\u0010\u0011R\u000e\u0010;\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010<\u001a\u00020=\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u000e\u0010@\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020BX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010C\u001a\u00020D\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u000e\u0010G\u001a\u00020HX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010K\u001a\u00020J2\u0006\u0010I\u001a\u00020J@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010O\u001a\u00020J2\u0006\u0010I\u001a\u00020J@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010L\"\u0004\bP\u0010NR$\u0010Q\u001a\u00020J2\u0006\u0010Q\u001a\u00020J@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010L\"\u0004\bR\u0010NR$\u0010S\u001a\u00020J2\u0006\u0010S\u001a\u00020J@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010L\"\u0004\bT\u0010NR\u000e\u0010U\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020HX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010X\u001a\u00020W2\u0006\u0010I\u001a\u00020W@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0010\u0010]\u001a\u0004\u0018\u00010^X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u00020bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u009f\u0001"}, d2 = {"Ldji/v5/ux/core/widget/fpv/FPVWidget;", "Ldji/v5/ux/core/base/widget/ConstraintLayoutWidget;", "Ldji/v5/ux/core/widget/fpv/FPVWidget$ModelState;", "Landroid/view/SurfaceHolder$Callback;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "percent", "", "cameraDetailsHorizontalAlignment", "getCameraDetailsHorizontalAlignment", "()F", "setCameraDetailsHorizontalAlignment", "(F)V", "cameraDetailsVerticalAlignment", "getCameraDetailsVerticalAlignment", "setCameraDetailsVerticalAlignment", "drawable", "Landroid/graphics/drawable/Drawable;", "cameraNameTextBackground", "getCameraNameTextBackground", "()Landroid/graphics/drawable/Drawable;", "setCameraNameTextBackground", "(Landroid/graphics/drawable/Drawable;)V", "color", "cameraNameTextColor", "getCameraNameTextColor", "()I", "setCameraNameTextColor", "(I)V", "colorStateList", "Landroid/content/res/ColorStateList;", "cameraNameTextColors", "getCameraNameTextColors", "()Landroid/content/res/ColorStateList;", "setCameraNameTextColors", "(Landroid/content/res/ColorStateList;)V", "textSize", "cameraNameTextSize", "getCameraNameTextSize", "setCameraNameTextSize", "cameraNameTextView", "Landroid/widget/TextView;", "cameraSideTextBackground", "getCameraSideTextBackground", "setCameraSideTextBackground", "cameraSideTextColor", "getCameraSideTextColor", "setCameraSideTextColor", "cameraSideTextColors", "getCameraSideTextColors", "setCameraSideTextColors", "cameraSideTextSize", "getCameraSideTextSize", "setCameraSideTextSize", "cameraSideTextView", "centerPointView", "Ldji/v5/ux/core/ui/CenterPointView;", "getCenterPointView", "()Ldji/v5/ux/core/ui/CenterPointView;", "fpvStateChangeResourceId", "fpvSurfaceView", "Landroid/view/SurfaceView;", "gridLineView", "Ldji/v5/ux/core/ui/GridLineView;", "getGridLineView", "()Ldji/v5/ux/core/ui/GridLineView;", "horizontalOffset", "Landroidx/constraintlayout/widget/Guideline;", "value", "", "isCameraSourceNameVisible", "()Z", "setCameraSourceNameVisible", "(Z)V", "isCameraSourceSideVisible", "setCameraSourceSideVisible", "isCenterPointEnabled", "setCenterPointEnabled", "isGridLinesEnabled", "setGridLinesEnabled", "rotationAngle", "verticalOffset", "Ldji/v5/common/video/channel/VideoChannelType;", "videoChannelType", "getVideoChannelType", "()Ldji/v5/common/video/channel/VideoChannelType;", "setVideoChannelType", "(Ldji/v5/common/video/channel/VideoChannelType;)V", "videoDecoder", "Ldji/v5/common/video/interfaces/IVideoDecoder;", "viewHeight", "viewWidth", "widgetModel", "Ldji/v5/ux/core/widget/fpv/FPVWidgetModel;", "changeView", "", "width", "height", "relativeWidth", "relativeHeight", "checkAndUpdateCameraName", "checkAndUpdateCameraSide", "delayCalculator", "destroyListeners", "getIdealDimensionRatioString", "", "getStreamSource", "Ldji/v5/common/video/stream/StreamSource;", "getWidgetStateUpdate", "Lio/reactivex/rxjava3/core/Flowable;", "initAttributes", "initView", "initializeListeners", "onAttachedToWindow", "onDetachedFromWindow", "onLayout", "changed", "l", "t", "r", "b", "reactToModelChanges", "setCameraNameTextAppearance", "textAppearance", "setCameraSideTextAppearance", "setOnFPVStreamSourceListener", "listener", "Ldji/v5/ux/core/widget/fpv/FPVStreamSourceListener;", "setSurfaceViewZOrderMediaOverlay", "isMediaOverlay", "setSurfaceViewZOrderOnTop", "onTop", "setViewDimensions", "setVisibility", "visibility", "surfaceChanged", "holder", "Landroid/view/SurfaceHolder;", "format", "surfaceCreated", "surfaceDestroyed", "updateCameraName", "cameraName", "updateCameraSide", "cameraSide", "updateGridLineVisibility", "updateVideoDecoder", "surface", "Landroid/view/Surface;", "updateVideoSource", "source", "channelType", "FPVSize", "ModelState", "android-sdk-v5-uxsdk_debug"})
public class FPVWidget extends dji.v5.ux.core.base.widget.ConstraintLayoutWidget<dji.v5.ux.core.widget.fpv.FPVWidget.ModelState> implements android.view.SurfaceHolder.Callback {
    private int viewWidth = 0;
    private int viewHeight = 0;
    private int rotationAngle = 0;
    private final android.view.SurfaceView fpvSurfaceView = null;
    private final android.widget.TextView cameraNameTextView = null;
    private final android.widget.TextView cameraSideTextView = null;
    private final androidx.constraintlayout.widget.Guideline verticalOffset = null;
    private final androidx.constraintlayout.widget.Guideline horizontalOffset = null;
    private int fpvStateChangeResourceId = -1;
    private dji.v5.common.video.interfaces.IVideoDecoder videoDecoder;
    private final dji.v5.ux.core.widget.fpv.FPVWidgetModel widgetModel = null;
    @org.jetbrains.annotations.NotNull
    private dji.v5.common.video.channel.VideoChannelType videoChannelType = dji.v5.common.video.channel.VideoChannelType.PRIMARY_STREAM_CHANNEL;
    
    /**
     * Whether the video feed source's camera name is visible on the video feed.
     */
    private boolean isCameraSourceNameVisible = true;
    
    /**
     * Whether the video feed source's camera side is visible on the video feed.
     * Only shown on aircraft that support multiple gimbals.
     */
    private boolean isCameraSourceSideVisible = true;
    
    /**
     * Whether the grid lines are enabled.
     */
    private boolean isGridLinesEnabled = true;
    
    /**
     * Whether the center point is enabled.
     */
    private boolean isCenterPointEnabled = true;
    
    /**
     * The [GridLineView] shown in this widget
     */
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.ui.GridLineView gridLineView = null;
    
    /**
     * The [CenterPointView] shown in this widget
     */
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.ui.CenterPointView centerPointView = null;
    
    @kotlin.jvm.JvmOverloads
    public FPVWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public FPVWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public FPVWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.common.video.channel.VideoChannelType getVideoChannelType() {
        return null;
    }
    
    public final void setVideoChannelType(@org.jetbrains.annotations.NotNull
    dji.v5.common.video.channel.VideoChannelType value) {
    }
    
    public final boolean isCameraSourceNameVisible() {
        return false;
    }
    
    public final void setCameraSourceNameVisible(boolean value) {
    }
    
    public final boolean isCameraSourceSideVisible() {
        return false;
    }
    
    public final void setCameraSourceSideVisible(boolean value) {
    }
    
    public final boolean isGridLinesEnabled() {
        return false;
    }
    
    public final void setGridLinesEnabled(boolean isGridLinesEnabled) {
    }
    
    public final boolean isCenterPointEnabled() {
        return false;
    }
    
    public final void setCenterPointEnabled(boolean isCenterPointEnabled) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.content.res.ColorStateList getCameraNameTextColors() {
        return null;
    }
    
    public final void setCameraNameTextColors(@org.jetbrains.annotations.Nullable
    android.content.res.ColorStateList colorStateList) {
    }
    
    @androidx.annotation.ColorInt
    public final int getCameraNameTextColor() {
        return 0;
    }
    
    public final void setCameraNameTextColor(@androidx.annotation.ColorInt
    int color) {
    }
    
    @androidx.annotation.Dimension
    public final float getCameraNameTextSize() {
        return 0.0F;
    }
    
    public final void setCameraNameTextSize(@androidx.annotation.Dimension
    float textSize) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getCameraNameTextBackground() {
        return null;
    }
    
    public final void setCameraNameTextBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable drawable) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.content.res.ColorStateList getCameraSideTextColors() {
        return null;
    }
    
    public final void setCameraSideTextColors(@org.jetbrains.annotations.Nullable
    android.content.res.ColorStateList colorStateList) {
    }
    
    @androidx.annotation.ColorInt
    public final int getCameraSideTextColor() {
        return 0;
    }
    
    public final void setCameraSideTextColor(@androidx.annotation.ColorInt
    int color) {
    }
    
    @androidx.annotation.Dimension
    public final float getCameraSideTextSize() {
        return 0.0F;
    }
    
    public final void setCameraSideTextSize(@androidx.annotation.Dimension
    float textSize) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getCameraSideTextBackground() {
        return null;
    }
    
    public final void setCameraSideTextBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable drawable) {
    }
    
    @androidx.annotation.FloatRange(from = 0.0, to = 1.0)
    public final float getCameraDetailsVerticalAlignment() {
        return 0.0F;
    }
    
    public final void setCameraDetailsVerticalAlignment(@androidx.annotation.FloatRange(from = 0.0, to = 1.0)
    float percent) {
    }
    
    @androidx.annotation.FloatRange(from = 0.0, to = 1.0)
    public final float getCameraDetailsHorizontalAlignment() {
        return 0.0F;
    }
    
    public final void setCameraDetailsHorizontalAlignment(@androidx.annotation.FloatRange(from = 0.0, to = 1.0)
    float percent) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.GridLineView getGridLineView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.CenterPointView getCenterPointView() {
        return null;
    }
    
    @java.lang.Override
    protected void initView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
    }
    
    @java.lang.Override
    protected void onAttachedToWindow() {
    }
    
    private final void initializeListeners() {
    }
    
    @java.lang.Override
    public void setVisibility(int visibility) {
    }
    
    @java.lang.Override
    protected void onDetachedFromWindow() {
    }
    
    @java.lang.Override
    protected void reactToModelChanges() {
    }
    
    @java.lang.Override
    public void surfaceCreated(@org.jetbrains.annotations.NotNull
    android.view.SurfaceHolder holder) {
    }
    
    @java.lang.Override
    public void surfaceChanged(@org.jetbrains.annotations.NotNull
    android.view.SurfaceHolder holder, int format, int width, int height) {
    }
    
    @java.lang.Override
    public void surfaceDestroyed(@org.jetbrains.annotations.NotNull
    android.view.SurfaceHolder holder) {
    }
    
    private final void updateVideoDecoder(android.view.Surface surface, int width, int height) {
    }
    
    @java.lang.Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
    }
    
    private final void destroyListeners() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getIdealDimensionRatioString() {
        return null;
    }
    
    public final void updateVideoSource(@org.jetbrains.annotations.NotNull
    dji.v5.common.video.stream.StreamSource source, @org.jetbrains.annotations.NotNull
    dji.v5.common.video.channel.VideoChannelType channelType) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final dji.v5.common.video.stream.StreamSource getStreamSource() {
        return null;
    }
    
    public final void setOnFPVStreamSourceListener(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.widget.fpv.FPVStreamSourceListener listener) {
    }
    
    public final void setSurfaceViewZOrderOnTop(boolean onTop) {
    }
    
    public final void setSurfaceViewZOrderMediaOverlay(boolean isMediaOverlay) {
    }
    
    private final void setViewDimensions() {
    }
    
    /**
     * This method should not to be called until the size of `TextureView` is fixed.
     */
    public final void changeView(int width, int height, int relativeWidth, int relativeHeight) {
    }
    
    private final void delayCalculator() {
    }
    
    private final void updateCameraName(java.lang.String cameraName) {
    }
    
    private final void updateCameraSide(java.lang.String cameraSide) {
    }
    
    private final void checkAndUpdateCameraName() {
    }
    
    private final void checkAndUpdateCameraSide() {
    }
    
    private final void updateGridLineVisibility() {
    }
    
    /**
     * Set text appearance of the camera name text view
     *
     * @param textAppearance Style resource for text appearance
     */
    public final void setCameraNameTextAppearance(@androidx.annotation.StyleRes
    int textAppearance) {
    }
    
    /**
     * Set text appearance of the camera side text view
     *
     * @param textAppearance Style resource for text appearance
     */
    public final void setCameraSideTextAppearance(@androidx.annotation.StyleRes
    int textAppearance) {
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
    public io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.widget.fpv.FPVWidget.ModelState> getWidgetStateUpdate() {
        return null;
    }
    
    /**
     * The size of the video feed within this widget
     *
     * @property width The width of the video feed within this widget
     * @property height The height of the video feed within this widget
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Ldji/v5/ux/core/widget/fpv/FPVWidget$FPVSize;", "", "width", "", "height", "(II)V", "getHeight", "()I", "getWidth", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "android-sdk-v5-uxsdk_debug"})
    public static final class FPVSize {
        private final int width = 0;
        private final int height = 0;
        
        /**
         * The size of the video feed within this widget
         *
         * @property width The width of the video feed within this widget
         * @property height The height of the video feed within this widget
         */
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.core.widget.fpv.FPVWidget.FPVSize copy(int width, int height) {
            return null;
        }
        
        /**
         * The size of the video feed within this widget
         *
         * @property width The width of the video feed within this widget
         * @property height The height of the video feed within this widget
         */
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        /**
         * The size of the video feed within this widget
         *
         * @property width The width of the video feed within this widget
         * @property height The height of the video feed within this widget
         */
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        /**
         * The size of the video feed within this widget
         *
         * @property width The width of the video feed within this widget
         * @property height The height of the video feed within this widget
         */
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public FPVSize(int width, int height) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getWidth() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getHeight() {
            return 0;
        }
    }
    
    /**
     * Class defines the widget state updates
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/widget/fpv/FPVWidget$ModelState;", "", "()V", "android-sdk-v5-uxsdk_debug"})
    public static abstract class ModelState {
        
        private ModelState() {
            super();
        }
    }
}