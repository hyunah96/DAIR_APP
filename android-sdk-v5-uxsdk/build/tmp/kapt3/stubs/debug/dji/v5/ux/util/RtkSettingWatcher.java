package dji.v5.ux.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J(\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Ldji/v5/ux/util/RtkSettingWatcher;", "Landroid/text/TextWatcher;", "mListener", "Ldji/v5/ux/util/RtkSettingWatcher$OnEditTextEmptyChangedListener;", "(Ldji/v5/ux/util/RtkSettingWatcher$OnEditTextEmptyChangedListener;)V", "mIsBeforeTextEmpty", "", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "OnEditTextEmptyChangedListener", "android-sdk-v5-uxsdk_debug"})
public final class RtkSettingWatcher implements android.text.TextWatcher {
    private final dji.v5.ux.util.RtkSettingWatcher.OnEditTextEmptyChangedListener mListener = null;
    private boolean mIsBeforeTextEmpty = false;
    
    public RtkSettingWatcher(@org.jetbrains.annotations.Nullable
    dji.v5.ux.util.RtkSettingWatcher.OnEditTextEmptyChangedListener mListener) {
        super();
    }
    
    @java.lang.Override
    public void beforeTextChanged(@org.jetbrains.annotations.NotNull
    java.lang.CharSequence s, int start, int count, int after) {
    }
    
    @java.lang.Override
    public void onTextChanged(@org.jetbrains.annotations.NotNull
    java.lang.CharSequence s, int start, int before, int count) {
    }
    
    @java.lang.Override
    public void afterTextChanged(@org.jetbrains.annotations.NotNull
    android.text.Editable s) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Ldji/v5/ux/util/RtkSettingWatcher$OnEditTextEmptyChangedListener;", "", "isTextEmptyChanged", "", "android-sdk-v5-uxsdk_debug"})
    public static abstract interface OnEditTextEmptyChangedListener {
        
        public abstract void isTextEmptyChanged();
    }
}