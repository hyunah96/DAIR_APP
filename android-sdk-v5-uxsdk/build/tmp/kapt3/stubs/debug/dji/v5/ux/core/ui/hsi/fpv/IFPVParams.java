package dji.v5.ux.core.ui.hsi.fpv;

import java.lang.System;

/**
 * FPV 能力参数
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Ldji/v5/ux/core/ui/hsi/fpv/IFPVParams;", "", "getCenterX", "", "getCenterY", "getFocusX", "getFocusY", "Companion", "android-sdk-v5-uxsdk_debug"})
public abstract interface IFPVParams {
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.core.ui.hsi.fpv.IFPVParams.Companion Companion = null;
    
    /**
     * 镜头焦距，以像素为单位
     */
    public abstract float getFocusX();
    
    /**
     * 镜头焦距，以像素为单位
     */
    public abstract float getFocusY();
    
    /**
     * 视频原始宽度的1/2
     */
    public abstract float getCenterX();
    
    /**
     * 视频原始高度的1/2
     */
    public abstract float getCenterY();
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Ldji/v5/ux/core/ui/hsi/fpv/IFPVParams$Companion;", "", "()V", "getCurrent", "Ldji/v5/ux/core/ui/hsi/fpv/IFPVParams;", "android-sdk-v5-uxsdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * 当前未考虑遥控器连接不同飞机，未观察连接飞机的变化，当出现遥控支持不同飞机时，需要观察飞机状态变化。
         */
        @org.jetbrains.annotations.NotNull
        public final dji.v5.ux.core.ui.hsi.fpv.IFPVParams getCurrent() {
            return null;
        }
    }
}