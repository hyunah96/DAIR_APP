package dji.v5.ux.accessory.item;

import java.lang.System;

/**
 * Description :垂直显示标题和值的控件
 *
 * @author: Byte.Cai
 * date : 2022/9/7
 *
 * Copyright (c) 2022, DJI All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0007J\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0007R(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"Ldji/v5/ux/accessory/item/TitleValueCell;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "", "title", "getTitle", "()Ljava/lang/CharSequence;", "setTitle", "(Ljava/lang/CharSequence;)V", "tvTitle", "Landroid/widget/TextView;", "tvValue", "getValue", "setValue", "setTitleTextColor", "", "color", "setValueTextColor", "android-sdk-v5-uxsdk_debug"})
public final class TitleValueCell extends android.widget.FrameLayout {
    private android.widget.TextView tvTitle;
    private android.widget.TextView tvValue;
    
    @kotlin.jvm.JvmOverloads
    public TitleValueCell(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public TitleValueCell(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public TitleValueCell(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.CharSequence getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable
    java.lang.CharSequence value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.CharSequence getValue() {
        return null;
    }
    
    public final void setValue(@org.jetbrains.annotations.Nullable
    java.lang.CharSequence value) {
    }
    
    public final void setValueTextColor(int color) {
    }
    
    public final void setTitleTextColor(int color) {
    }
}