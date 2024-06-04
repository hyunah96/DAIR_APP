package dji.v5.ux.visualcamera.ndvi;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001&B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u001eH\u0016J\u0018\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001eH\u0016R\u001e\u0010\b\u001a\u0004\u0018\u00018\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\n \u0018*\u0004\u0018\u00010\u00170\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006\'"}, d2 = {"Ldji/v5/ux/visualcamera/ndvi/StreamAdapter;", "T", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ldji/v5/ux/visualcamera/ndvi/StreamAdapter$ViewHolder;", "onClickCallback", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "currentPosition", "getCurrentPosition", "()Ljava/lang/Object;", "setCurrentPosition", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "models", "", "getModels", "()Ljava/util/List;", "setModels", "(Ljava/util/List;)V", "getOnClickCallback", "()Lkotlin/jvm/functions/Function1;", "tag", "", "kotlin.jvm.PlatformType", "getTag", "()Ljava/lang/String;", "setTag", "(Ljava/lang/String;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "android-sdk-v5-uxsdk_debug"})
public final class StreamAdapter<T extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.Adapter<dji.v5.ux.visualcamera.ndvi.StreamAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<T, kotlin.Unit> onClickCallback = null;
    private java.lang.String tag;
    @org.jetbrains.annotations.NotNull
    private java.util.List<T> models;
    @org.jetbrains.annotations.Nullable
    private T currentPosition;
    
    public StreamAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onClickCallback) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<T, kotlin.Unit> getOnClickCallback() {
        return null;
    }
    
    public final java.lang.String getTag() {
        return null;
    }
    
    public final void setTag(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<T> getModels() {
        return null;
    }
    
    public final void setModels(@org.jetbrains.annotations.NotNull
    java.util.List<T> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final T getCurrentPosition() {
        return null;
    }
    
    public final void setCurrentPosition(@org.jetbrains.annotations.Nullable
    T p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dji.v5.ux.visualcamera.ndvi.StreamAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    dji.v5.ux.visualcamera.ndvi.StreamAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Ldji/v5/ux/visualcamera/ndvi/StreamAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "ivPreview", "Landroid/widget/ImageView;", "getIvPreview", "()Landroid/widget/ImageView;", "setIvPreview", "(Landroid/widget/ImageView;)V", "tvName", "Landroid/widget/TextView;", "getTvName", "()Landroid/widget/TextView;", "setTvName", "(Landroid/widget/TextView;)V", "android-sdk-v5-uxsdk_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private android.widget.ImageView ivPreview;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView tvName;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getIvPreview() {
            return null;
        }
        
        public final void setIvPreview(@org.jetbrains.annotations.NotNull
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getTvName() {
            return null;
        }
        
        public final void setTvName(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
    }
}