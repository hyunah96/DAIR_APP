package dji.v5.ux.accessory.data;

import java.lang.System;

/**
 * Description :基站RTK的Adapter，展示扫码到的基站情况
 *
 * @author: Byte.Cai
 * date : 2022/3/6
 *
 * Copyright (c) 2022, DJI All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+,B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\nH\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\nH\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\nH\u0016J\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\nH\u0007J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\nH\u0016J\u0018\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\nH\u0016J\u0010\u0010&\u001a\u00020 2\b\u0010\'\u001a\u0004\u0018\u00010\u0015J\n\u0010(\u001a\u00020 *\u00020)J\n\u0010*\u001a\u00020 *\u00020)R\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082D\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Ldji/v5/ux/accessory/data/RtkStationScanAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ldji/v5/ux/accessory/data/RtkStationScanAdapter$RtkViewHolder;", "context", "Landroid/content/Context;", "list", "", "Ldji/v5/ux/accessory/data/DJIRTKBaseStationConnectInfo;", "(Landroid/content/Context;Ljava/util/List;)V", "LEVEL_0", "", "LEVEL_1", "LEVEL_2", "LEVEL_3", "LEVEL_4", "TAG", "", "baseStationInfoList", "getContext", "()Landroid/content/Context;", "mOnItemClickListener", "Ldji/v5/ux/accessory/data/RtkStationScanAdapter$OnItemClickListener;", "checkConnected", "", "position", "checkConnecting", "getItemCount", "getItemId", "", "getSignalLevelDrawable", "signalLevel", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "onItemClickListener", "gone", "Landroid/view/View;", "visible", "OnItemClickListener", "RtkViewHolder", "android-sdk-v5-uxsdk_debug"})
public final class RtkStationScanAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<dji.v5.ux.accessory.data.RtkStationScanAdapter.RtkViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    private final java.lang.String TAG = "RtkStationScanAdapter";
    private final int LEVEL_0 = 0;
    private final int LEVEL_1 = 1;
    private final int LEVEL_2 = 2;
    private final int LEVEL_3 = 3;
    private final int LEVEL_4 = 4;
    private java.util.List<dji.v5.ux.accessory.data.DJIRTKBaseStationConnectInfo> baseStationInfoList;
    private dji.v5.ux.accessory.data.RtkStationScanAdapter.OnItemClickListener mOnItemClickListener;
    
    public RtkStationScanAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    java.util.List<dji.v5.ux.accessory.data.DJIRTKBaseStationConnectInfo> list) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public dji.v5.ux.accessory.data.RtkStationScanAdapter.RtkViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    dji.v5.ux.accessory.data.RtkStationScanAdapter.RtkViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.Nullable
    dji.v5.ux.accessory.data.RtkStationScanAdapter.OnItemClickListener onItemClickListener) {
    }
    
    @androidx.annotation.DrawableRes
    public final int getSignalLevelDrawable(int signalLevel) {
        return 0;
    }
    
    public final void visible(@org.jetbrains.annotations.NotNull
    android.view.View $this$visible) {
    }
    
    public final void gone(@org.jetbrains.annotations.NotNull
    android.view.View $this$gone) {
    }
    
    private final boolean checkConnecting() {
        return false;
    }
    
    private final boolean checkConnected(int position) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Ldji/v5/ux/accessory/data/RtkStationScanAdapter$OnItemClickListener;", "", "onItemClick", "", "view", "Landroid/view/View;", "position", "", "android-sdk-v5-uxsdk_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.Nullable
        android.view.View view, int position);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0014"}, d2 = {"Ldji/v5/ux/accessory/data/RtkStationScanAdapter$RtkViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mConnectSignalIv", "Landroid/widget/ImageView;", "getMConnectSignalIv", "()Landroid/widget/ImageView;", "setMConnectSignalIv", "(Landroid/widget/ImageView;)V", "mConnectStatusIv", "getMConnectStatusIv", "setMConnectStatusIv", "mRtkStationNameTv", "Landroid/widget/TextView;", "getMRtkStationNameTv", "()Landroid/widget/TextView;", "setMRtkStationNameTv", "(Landroid/widget/TextView;)V", "android-sdk-v5-uxsdk_debug"})
    public static final class RtkViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private android.widget.ImageView mConnectStatusIv;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView mRtkStationNameTv;
        @org.jetbrains.annotations.NotNull
        private android.widget.ImageView mConnectSignalIv;
        
        public RtkViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getMConnectStatusIv() {
            return null;
        }
        
        public final void setMConnectStatusIv(@org.jetbrains.annotations.NotNull
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getMRtkStationNameTv() {
            return null;
        }
        
        public final void setMRtkStationNameTv(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getMConnectSignalIv() {
            return null;
        }
        
        public final void setMConnectSignalIv(@org.jetbrains.annotations.NotNull
        android.widget.ImageView p0) {
        }
    }
}