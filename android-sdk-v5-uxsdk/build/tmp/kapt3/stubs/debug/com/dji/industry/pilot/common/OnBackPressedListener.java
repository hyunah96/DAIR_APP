package com.dji.industry.pilot.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004"}, d2 = {"Lcom/dji/industry/pilot/common/OnBackPressedListener;", "", "onBackPressed", "", "android-sdk-v5-uxsdk_debug"})
public abstract interface OnBackPressedListener {
    
    public abstract boolean onBackPressed();
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3)
    public final class DefaultImpls {
        
        public static boolean onBackPressed(@org.jetbrains.annotations.NotNull
        com.dji.industry.pilot.common.OnBackPressedListener $this) {
            return false;
        }
    }
}