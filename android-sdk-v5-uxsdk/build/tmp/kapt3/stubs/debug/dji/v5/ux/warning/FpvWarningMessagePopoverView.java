package dji.v5.ux.warning;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0018\u0019\u001a\u001b\u001c\u001dB%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\"\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\u0014\u001a\u00020\u0013H\u0014J\b\u0010\u0015\u001a\u00020\u0013H\u0014J\b\u0010\u0016\u001a\u00020\u0013H\u0014J\b\u0010\u0017\u001a\u00020\u0013H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001e"}, d2 = {"Ldji/v5/ux/warning/FpvWarningMessagePopoverView;", "Ldji/v5/ux/core/base/widget/FrameLayoutWidget;", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "recycleView", "Landroidx/recyclerview/widget/RecyclerView;", "widgetModel", "Ldji/v5/ux/warning/DeviceHealthAndStatusWidgetModel;", "getWidgetModel", "()Ldji/v5/ux/warning/DeviceHealthAndStatusWidgetModel;", "widgetModel$delegate", "Lkotlin/Lazy;", "initView", "", "onAttachedToWindow", "onDetachedFromWindow", "reactToModelChanges", "updateData", "Adapter", "Companion", "NoWarning", "NoWarningItemViewHolder", "UnknownViewHolder", "WarningMessageViewHolder", "android-sdk-v5-uxsdk_debug"})
public final class FpvWarningMessagePopoverView extends dji.v5.ux.core.base.widget.FrameLayoutWidget<java.lang.Object> {
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.warning.FpvWarningMessagePopoverView.Companion Companion = null;
    public static final float ALPHA_SHOW = 1.0F;
    public static final float ALPHA_HIDE = 0.3F;
    private androidx.recyclerview.widget.RecyclerView recycleView;
    private final kotlin.Lazy widgetModel$delegate = null;
    
    @kotlin.jvm.JvmOverloads
    public FpvWarningMessagePopoverView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public FpvWarningMessagePopoverView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public FpvWarningMessagePopoverView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    private final dji.v5.ux.warning.DeviceHealthAndStatusWidgetModel getWidgetModel() {
        return null;
    }
    
    @java.lang.Override
    protected void initView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
    }
    
    @java.lang.Override
    protected void reactToModelChanges() {
    }
    
    private final void updateData() {
    }
    
    @java.lang.Override
    protected void onAttachedToWindow() {
    }
    
    @java.lang.Override
    protected void onDetachedFromWindow() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0011H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Ldji/v5/ux/warning/FpvWarningMessagePopoverView$WarningMessageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "vm", "Ldji/v5/ux/warning/DeviceHealthAndStatusWidgetModel;", "(Landroid/view/View;Ldji/v5/ux/warning/DeviceHealthAndStatusWidgetModel;)V", "ivArrow", "Landroid/widget/ImageView;", "levelView", "tvMessage", "Landroid/widget/TextView;", "tvMessageTime", "getVm", "()Ldji/v5/ux/warning/DeviceHealthAndStatusWidgetModel;", "wrapper", "bind", "", "item", "Ldji/v5/ux/warning/DeviceHealthAndStatusWidgetModel$DeviceMessage;", "alphaValue", "", "setClickListener", "android-sdk-v5-uxsdk_debug"})
    public static final class WarningMessageViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final dji.v5.ux.warning.DeviceHealthAndStatusWidgetModel vm = null;
        private final android.widget.TextView tvMessage = null;
        private final android.widget.TextView tvMessageTime = null;
        private final android.view.View wrapper = null;
        private final android.view.View levelView = null;
        private final android.widget.ImageView ivArrow = null;
        
        public WarningMessageViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView, @org.jetbrains.annotations.NotNull
        dji.v5.ux.warning.DeviceHealthAndStatusWidgetModel vm) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.warning.DeviceHealthAndStatusWidgetModel getVm() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        dji.v5.ux.warning.DeviceHealthAndStatusWidgetModel.DeviceMessage item, float alphaValue) {
        }
        
        private final void setClickListener() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\"\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00030\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Ldji/v5/ux/warning/FpvWarningMessagePopoverView$NoWarningItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "vm", "Ldji/v5/ux/warning/DeviceHealthAndStatusWidgetModel;", "(Landroid/view/View;Ldji/v5/ux/warning/DeviceHealthAndStatusWidgetModel;)V", "splitLine", "kotlin.jvm.PlatformType", "getSplitLine", "()Landroid/view/View;", "setSplitLine", "(Landroid/view/View;)V", "getVm", "()Ldji/v5/ux/warning/DeviceHealthAndStatusWidgetModel;", "bind", "", "item", "Ldji/v5/ux/warning/FpvWarningMessagePopoverView$NoWarning;", "android-sdk-v5-uxsdk_debug"})
    public static final class NoWarningItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final dji.v5.ux.warning.DeviceHealthAndStatusWidgetModel vm = null;
        private android.view.View splitLine;
        
        public NoWarningItemViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView, @org.jetbrains.annotations.NotNull
        dji.v5.ux.warning.DeviceHealthAndStatusWidgetModel vm) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.warning.DeviceHealthAndStatusWidgetModel getVm() {
            return null;
        }
        
        public final android.view.View getSplitLine() {
            return null;
        }
        
        public final void setSplitLine(android.view.View p0) {
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        dji.v5.ux.warning.FpvWarningMessagePopoverView.NoWarning item) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Ldji/v5/ux/warning/FpvWarningMessagePopoverView$UnknownViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "android-sdk-v5-uxsdk_debug"})
    public static final class UnknownViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public UnknownViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0011H\u0016J\u0014\u0010\u001b\u001a\u00020\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u001dJ\u0006\u0010\u001e\u001a\u00020\u0015J\u0006\u0010\u001f\u001a\u00020\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0005\u00a8\u0006!"}, d2 = {"Ldji/v5/ux/warning/FpvWarningMessagePopoverView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "vm", "Ldji/v5/ux/warning/DeviceHealthAndStatusWidgetModel;", "(Ldji/v5/ux/warning/DeviceHealthAndStatusWidgetModel;)V", "alphaValue", "", "flashListener", "Ldji/v5/ux/core/ui/hsi/FlashTimer$Listener;", "items", "", "", "getVm", "()Ldji/v5/ux/warning/DeviceHealthAndStatusWidgetModel;", "setVm", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setNewData", "newItems", "", "startFlash", "stopFlash", "Companion", "android-sdk-v5-uxsdk_debug"})
    public static final class Adapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
        @org.jetbrains.annotations.NotNull
        private dji.v5.ux.warning.DeviceHealthAndStatusWidgetModel vm;
        @org.jetbrains.annotations.NotNull
        public static final dji.v5.ux.warning.FpvWarningMessagePopoverView.Adapter.Companion Companion = null;
        public static final int VIEW_TYPE_UNKNOWN = -1;
        public static final int VIEW_TYPE_WARNING_MESSAGE = 1;
        public static final int VIEW_TYPE_NO_WARNING = 3;
        private java.util.List<java.lang.Object> items;
        private float alphaValue = 1.0F;
        private final dji.v5.ux.core.ui.hsi.FlashTimer.Listener flashListener = null;
        
        public Adapter(@org.jetbrains.annotations.NotNull
        dji.v5.ux.warning.DeviceHealthAndStatusWidgetModel vm) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.warning.DeviceHealthAndStatusWidgetModel getVm() {
            return null;
        }
        
        public final void setVm(@org.jetbrains.annotations.NotNull
        dji.v5.ux.warning.DeviceHealthAndStatusWidgetModel p0) {
        }
        
        public final void setNewData(@org.jetbrains.annotations.NotNull
        java.util.List<? extends java.lang.Object> newItems) {
        }
        
        @java.lang.Override
        public int getItemViewType(int position) {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull
        androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
        }
        
        @java.lang.Override
        public int getItemCount() {
            return 0;
        }
        
        public final void startFlash() {
        }
        
        public final void stopFlash() {
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Ldji/v5/ux/warning/FpvWarningMessagePopoverView$Adapter$Companion;", "", "()V", "VIEW_TYPE_NO_WARNING", "", "VIEW_TYPE_UNKNOWN", "VIEW_TYPE_WARNING_MESSAGE", "android-sdk-v5-uxsdk_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    /**
     * 没有告警时的对象
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/warning/FpvWarningMessagePopoverView$NoWarning;", "", "contentRes", "", "(I)V", "getContentRes", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "android-sdk-v5-uxsdk_debug"})
    public static final class NoWarning {
        private final int contentRes = 0;
        
        /**
         * 没有告警时的对象
         */
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.warning.FpvWarningMessagePopoverView.NoWarning copy(int contentRes) {
            return null;
        }
        
        /**
         * 没有告警时的对象
         */
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        /**
         * 没有告警时的对象
         */
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        /**
         * 没有告警时的对象
         */
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public NoWarning(int contentRes) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getContentRes() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Ldji/v5/ux/warning/FpvWarningMessagePopoverView$Companion;", "", "()V", "ALPHA_HIDE", "", "ALPHA_SHOW", "android-sdk-v5-uxsdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}