package dji.v5.ux.core.widget.battery;

import java.lang.System;

/**
 * 电池配置
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Ldji/v5/ux/core/widget/battery/BatteryConfig;", "", "()V", "HIGH_VOLTAGE_SAVE_DAYS_DANGER", "", "HIGH_VOLTAGE_SAVE_DAYS_WARN", "SECONDS_IN_DAY", "android-sdk-v5-uxsdk_debug"})
public final class BatteryConfig {
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.core.widget.battery.BatteryConfig INSTANCE = null;
    
    /**
     * 高电位存储红色显示
     */
    public static final int HIGH_VOLTAGE_SAVE_DAYS_DANGER = 120;
    
    /**
     * 高电位存储黄色显示
     */
    public static final int HIGH_VOLTAGE_SAVE_DAYS_WARN = 60;
    
    /**
     * 高电位存储接口: 秒->天
     */
    public static final int SECONDS_IN_DAY = 86400;
    
    private BatteryConfig() {
        super();
    }
}