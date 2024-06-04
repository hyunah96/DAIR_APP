package dji.v5.ux.accessory;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0001-B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013J\n\u0010\u001b\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u001c\u001a\u00020\u0007H\u0016J\u0006\u0010\u001d\u001a\u00020\u0019J\b\u0010\u001e\u001a\u00020\u0019H\u0002J\b\u0010\u001f\u001a\u00020\u0019H\u0002J\u000e\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u0007J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H\u0016J\u0018\u0010%\u001a\u00020\u00192\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\'H\u0016J\u0010\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u000fH\u0016J\u0010\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u0007H\u0016J\u0010\u0010*\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u000fH\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Ldji/v5/ux/accessory/DescSpinnerCell;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getAttrs", "()Landroid/util/AttributeSet;", "getDefStyleAttr", "()I", "mAdapter", "Landroid/widget/ArrayAdapter;", "", "mDesc", "Landroid/widget/TextView;", "mSelectedListener", "Ldji/v5/ux/accessory/DescSpinnerCell$OnItemSelectedListener;", "mSelectedPosition", "mSpinner", "Landroid/widget/Spinner;", "mSummary", "addOnItemSelectedListener", "", "listener", "getDescText", "getSelectPosition", "initAttrs", "initListener", "initView", "select", "position", "setEnabled", "enable", "", "setEntries", "entries", "", "setSDescText", "descText", "setSummaryText", "summaryTextId", "summaryText", "OnItemSelectedListener", "android-sdk-v5-uxsdk_debug"})
public class DescSpinnerCell extends android.widget.LinearLayout {
    @org.jetbrains.annotations.Nullable
    private final android.util.AttributeSet attrs = null;
    private final int defStyleAttr = 0;
    private android.widget.Spinner mSpinner;
    private android.widget.TextView mSummary;
    private android.widget.TextView mDesc;
    private android.widget.ArrayAdapter<java.lang.String> mAdapter;
    private int mSelectedPosition = 0;
    private dji.v5.ux.accessory.DescSpinnerCell.OnItemSelectedListener mSelectedListener;
    
    @kotlin.jvm.JvmOverloads
    public DescSpinnerCell(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public DescSpinnerCell(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public DescSpinnerCell(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.util.AttributeSet getAttrs() {
        return null;
    }
    
    public final int getDefStyleAttr() {
        return 0;
    }
    
    private final void initView() {
    }
    
    private final void initListener() {
    }
    
    public final void initAttrs() {
    }
    
    public final void addOnItemSelectedListener(@org.jetbrains.annotations.Nullable
    dji.v5.ux.accessory.DescSpinnerCell.OnItemSelectedListener listener) {
    }
    
    public void setSummaryText(@org.jetbrains.annotations.NotNull
    java.lang.String summaryText) {
    }
    
    public void setSummaryText(int summaryTextId) {
    }
    
    public void setSDescText(@org.jetbrains.annotations.NotNull
    java.lang.String descText) {
    }
    
    @org.jetbrains.annotations.Nullable
    public android.widget.TextView getDescText() {
        return null;
    }
    
    public int getSelectPosition() {
        return 0;
    }
    
    public void setEntries(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> entries) {
    }
    
    public final void select(int position) {
    }
    
    @java.lang.Override
    public void setEnabled(boolean enable) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Ldji/v5/ux/accessory/DescSpinnerCell$OnItemSelectedListener;", "", "onItemSelected", "", "position", "", "android-sdk-v5-uxsdk_debug"})
    public static abstract interface OnItemSelectedListener {
        
        public abstract void onItemSelected(int position);
    }
}