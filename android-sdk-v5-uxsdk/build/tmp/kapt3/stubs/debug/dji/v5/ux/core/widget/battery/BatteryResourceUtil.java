package dji.v5.ux.core.widget.battery;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\n\u0010\u0007\u001a\u00020\u0004*\u00020\b\u00a8\u0006\t"}, d2 = {"Ldji/v5/ux/core/widget/battery/BatteryResourceUtil;", "", "()V", "getBatteryTitle", "", "index", "", "productName", "Ldji/sdk/keyvalue/value/battery/IndustryBatteryType;", "android-sdk-v5-uxsdk_debug"})
public final class BatteryResourceUtil {
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.core.widget.battery.BatteryResourceUtil INSTANCE = null;
    
    private BatteryResourceUtil() {
        super();
    }
    
    /**
     * 获取电池的标题
     * 如果是一个电池的飞机，返回`电池`
     * 如果是两个电池的飞机，返回的是`左电池`或者`右电池`
     * 否则返回电池1、电池2、电池3
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBatteryTitle(int index) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String productName(@org.jetbrains.annotations.NotNull
    dji.sdk.keyvalue.value.battery.IndustryBatteryType $this$productName) {
        return null;
    }
}