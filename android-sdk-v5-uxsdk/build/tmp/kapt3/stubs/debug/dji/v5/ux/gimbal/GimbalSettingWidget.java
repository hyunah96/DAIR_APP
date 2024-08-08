package dji.v5.ux.gimbal;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001\u001eB%\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\"\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u0016\u001a\u00020\u0015H\u0014J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0015H\u0014J\b\u0010\u001b\u001a\u00020\u0015H\u0014J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0013H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Ldji/v5/ux/gimbal/GimbalSettingWidget;", "Ldji/v5/ux/core/base/widget/ConstraintLayoutWidget;", "", "Landroid/view/View$OnClickListener;", "Ldji/v5/ux/core/base/IGimbalIndex;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "areMotors", "", "loadingDialog", "Ldji/v5/ux/core/ui/setting/dialog/CommonLoadingDialog;", "widgetModel", "Ldji/v5/ux/gimbal/GimbalSettingWidgetModel;", "getGimbalIndex", "Ldji/v5/ux/core/util/SettingDefinitions$GimbalIndex;", "initView", "", "onAttachedToWindow", "onClick", "v", "Landroid/view/View;", "onDetachedFromWindow", "reactToModelChanges", "updateGimbalIndex", "gimbalIndex", "Companion", "android-sdk-v5-uxsdk_debug"})
public class GimbalSettingWidget extends dji.v5.ux.core.base.widget.ConstraintLayoutWidget<java.lang.Object> implements android.view.View.OnClickListener, dji.v5.ux.core.base.IGimbalIndex {
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.gimbal.GimbalSettingWidget.Companion Companion = null;
    private static final java.lang.String TAG = "GimbalSettingWidget";
    private final dji.v5.ux.core.ui.setting.dialog.CommonLoadingDialog loadingDialog = null;
    private boolean areMotors = false;
    private final dji.v5.ux.gimbal.GimbalSettingWidgetModel widgetModel = null;
    
    @kotlin.jvm.JvmOverloads
    public GimbalSettingWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public GimbalSettingWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public GimbalSettingWidget(@org.jetbrains.annotations.NotNull
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
    
    @java.lang.Override
    protected void onAttachedToWindow() {
    }
    
    @java.lang.Override
    protected void onDetachedFromWindow() {
    }
    
    @java.lang.Override
    public void onClick(@org.jetbrains.annotations.NotNull
    android.view.View v) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dji.v5.ux.core.util.SettingDefinitions.GimbalIndex getGimbalIndex() {
        return null;
    }
    
    @java.lang.Override
    public void updateGimbalIndex(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.util.SettingDefinitions.GimbalIndex gimbalIndex) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Ldji/v5/ux/gimbal/GimbalSettingWidget$Companion;", "", "()V", "TAG", "", "android-sdk-v5-uxsdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}