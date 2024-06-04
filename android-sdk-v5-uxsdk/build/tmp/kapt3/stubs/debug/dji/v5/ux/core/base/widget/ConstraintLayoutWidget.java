package dji.v5.ux.core.base.widget;

import java.lang.System;

/**
 * This is a base class for widgets requiring ConstraintLayout.
 * T is the type of Widget State Update, @see[getWidgetStateUpdate].
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 **\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001*B%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0004J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001eH\u0004J\b\u0010!\u001a\u00020\u001cH\u0002J\n\u0010\"\u001a\u0004\u0018\u00010\u000eH\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0016J\"\u0010%\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH$J\b\u0010&\u001a\u00020\u001cH\u0014J\b\u0010\'\u001a\u00020\u001cH\u0014J\b\u0010(\u001a\u00020\u001cH$J\b\u0010)\u001a\u00020\u001cH\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006+"}, d2 = {"Ldji/v5/ux/core/base/widget/ConstraintLayoutWidget;", "T", "", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "logTag", "", "kotlin.jvm.PlatformType", "getLogTag", "()Ljava/lang/String;", "reactionDisposables", "widgetSizeDescription", "Ldji/v5/ux/core/base/WidgetSizeDescription;", "getWidgetSizeDescription", "()Ldji/v5/ux/core/base/WidgetSizeDescription;", "widgetStateDataProcessor", "Lio/reactivex/rxjava3/processors/PublishProcessor;", "getWidgetStateDataProcessor", "()Lio/reactivex/rxjava3/processors/PublishProcessor;", "addDisposable", "", "disposable", "Lio/reactivex/rxjava3/disposables/Disposable;", "addReaction", "reaction", "disposeAll", "getIdealDimensionRatioString", "getWidgetStateUpdate", "Lio/reactivex/rxjava3/core/Flowable;", "initView", "onAttachedToWindow", "onDetachedFromWindow", "reactToModelChanges", "unregisterReactions", "Companion", "android-sdk-v5-uxsdk_debug"})
public abstract class ConstraintLayoutWidget<T extends java.lang.Object> extends androidx.constraintlayout.widget.ConstraintLayout {
    private final java.lang.String logTag = null;
    private io.reactivex.rxjava3.disposables.CompositeDisposable reactionDisposables;
    private io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable;
    
    /**
     * Publish state data updates
     */
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.rxjava3.processors.PublishProcessor<T> widgetStateDataProcessor = null;
    
    /**
     * Ideal widget size.
     * By default the widget size is a ratio
     */
    @org.jetbrains.annotations.NotNull
    private final dji.v5.ux.core.base.WidgetSizeDescription widgetSizeDescription = null;
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.core.base.widget.ConstraintLayoutWidget.Companion Companion = null;
    private static final java.lang.String TAG = "ConstraintLayoutWidget";
    public static final int INVALID_RESOURCE = -1;
    public static final int INVALID_COLOR = 0;
    public static final float INVALID_DIMENSION = 0.0F;
    
    @kotlin.jvm.JvmOverloads
    public ConstraintLayoutWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public ConstraintLayoutWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public ConstraintLayoutWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    protected final java.lang.String getLogTag() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final io.reactivex.rxjava3.processors.PublishProcessor<T> getWidgetStateDataProcessor() {
        return null;
    }
    
    @java.lang.Override
    protected void onAttachedToWindow() {
    }
    
    @java.lang.Override
    protected void onDetachedFromWindow() {
    }
    
    /**
     * Invoked during the initialization of the class.
     * Inflate should be done here. For Kotlin, load attributes, findViewById should be done in
     * the init block.
     *
     * @param context      Context
     * @param attrs        Attribute set
     * @param defStyleAttr Style attribute
     */
    protected abstract void initView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr);
    
    /**
     * Call addReaction here to bind to the model.
     */
    protected abstract void reactToModelChanges();
    
    /**
     * Add a disposable which is automatically disposed with the view's lifecycle.
     *
     * @param disposable the disposable to add
     */
    protected final void addDisposable(@org.jetbrains.annotations.NotNull
    io.reactivex.rxjava3.disposables.Disposable disposable) {
    }
    
    /**
     * Ideal dimension ratio in the format width:height.
     *
     * @return dimension ratio string.
     */
    @org.jetbrains.annotations.Nullable
    public java.lang.String getIdealDimensionRatioString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public dji.v5.ux.core.base.WidgetSizeDescription getWidgetSizeDescription() {
        return null;
    }
    
    /**
     * Add a reaction which is automatically disposed with the view's lifecycle.
     *
     * @param reaction the reaction to add.
     */
    protected final void addReaction(@org.jetbrains.annotations.NotNull
    io.reactivex.rxjava3.disposables.Disposable reaction) {
    }
    
    private final void unregisterReactions() {
    }
    
    private final void disposeAll() {
    }
    
    /**
     * Get the update for the widget state
     *
     * @return update with widget state
     */
    @org.jetbrains.annotations.NotNull
    public io.reactivex.rxjava3.core.Flowable<T> getWidgetStateUpdate() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Ldji/v5/ux/core/base/widget/ConstraintLayoutWidget$Companion;", "", "()V", "INVALID_COLOR", "", "INVALID_DIMENSION", "", "INVALID_RESOURCE", "TAG", "", "android-sdk-v5-uxsdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}