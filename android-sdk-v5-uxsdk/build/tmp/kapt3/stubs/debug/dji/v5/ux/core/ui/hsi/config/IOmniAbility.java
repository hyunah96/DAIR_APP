package dji.v5.ux.core.ui.hsi.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\b\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\u0006H&J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u000b\u001a\u00020\u0006H&\u00a8\u0006\r"}, d2 = {"Ldji/v5/ux/core/ui/hsi/config/IOmniAbility;", "", "getDownAvoidanceDistanceRange", "Lkotlin/Pair;", "", "getDownDetectionCapability", "", "getHorizontalAvoidanceDistanceRange", "getHorizontalDetectionCapability", "getPerceptionBlindAreaAngle", "getUpAvoidanceDistanceRange", "getUpDetectionCapability", "Companion", "android-sdk-v5-uxsdk_debug"})
public abstract interface IOmniAbility {
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.core.ui.hsi.config.IOmniAbility.Companion Companion = null;
    
    /**
     * 视觉避障-上方探测距离
     */
    public abstract int getUpDetectionCapability();
    
    /**
     * 上方避障刹停距离设置范围
     */
    @org.jetbrains.annotations.NotNull
    public abstract kotlin.Pair<java.lang.Float, java.lang.Float> getUpAvoidanceDistanceRange();
    
    /**
     * 视觉避障-下方探测距离
     */
    public abstract int getDownDetectionCapability();
    
    /**
     * 下方避障刹停距离设置范围
     */
    @org.jetbrains.annotations.NotNull
    public abstract kotlin.Pair<java.lang.Float, java.lang.Float> getDownAvoidanceDistanceRange();
    
    /**
     * 视觉避障-水平探测距离
     */
    public abstract int getHorizontalDetectionCapability();
    
    /**
     * 水平避障刹停距离设置范围
     */
    @org.jetbrains.annotations.NotNull
    public abstract kotlin.Pair<java.lang.Float, java.lang.Float> getHorizontalAvoidanceDistanceRange();
    
    /**
     * 视觉避障-每方向盲区大小
     */
    public abstract int getPerceptionBlindAreaAngle();
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Ldji/v5/ux/core/ui/hsi/config/IOmniAbility$Companion;", "", "()V", "getCurrent", "Ldji/v5/ux/core/ui/hsi/config/IOmniAbility;", "android-sdk-v5-uxsdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * 当前未考虑遥控器连接不同飞机，未观察连接飞机的变化，当出现遥控支持不同飞机时，需要观察飞机状态变化。
         */
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.core.ui.hsi.config.IOmniAbility getCurrent() {
            return null;
        }
    }
}