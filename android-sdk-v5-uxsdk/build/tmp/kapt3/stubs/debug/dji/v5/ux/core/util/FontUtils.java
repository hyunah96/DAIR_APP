package dji.v5.ux.core.util;

import java.lang.System;

/**
 * 在 FPV 页面绘制过程中，使用的字体计算问题高度时部分场景异常，相关计算由此类完成
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Ldji/v5/ux/core/util/FontUtils;", "", "()V", "Companion", "android-sdk-v5-uxsdk_debug"})
public final class FontUtils {
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.core.util.FontUtils.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static java.lang.ThreadLocal<android.graphics.Rect> calcCache;
    private static final java.lang.String DIGITAL_TEXT = "1.234567890";
    
    public FontUtils() {
        super();
    }
    
    /**
     * 获取文字绘制高度
     * 使用的字体在上下分别有 FontMetrics.bottom 高的空白
     */
    @kotlin.jvm.JvmOverloads
    @kotlin.jvm.JvmStatic
    public static final float getDigitalTextDrawHeight(@org.jetbrains.annotations.NotNull
    android.graphics.Paint paint) {
        return 0.0F;
    }
    
    /**
     * 获取文字绘制高度
     * 使用的字体在上下分别有 FontMetrics.bottom 高的空白
     */
    @kotlin.jvm.JvmOverloads
    @kotlin.jvm.JvmStatic
    public static final float getDigitalTextDrawHeight(@org.jetbrains.annotations.NotNull
    android.graphics.Paint paint, @org.jetbrains.annotations.NotNull
    java.lang.String text) {
        return 0.0F;
    }
    
    @kotlin.jvm.JvmOverloads
    @kotlin.jvm.JvmStatic
    public static final float getDigitalBaselineFromTop(@org.jetbrains.annotations.NotNull
    android.graphics.Paint paint, float top) {
        return 0.0F;
    }
    
    @kotlin.jvm.JvmOverloads
    @kotlin.jvm.JvmStatic
    public static final float getDigitalBaselineFromTop(@org.jetbrains.annotations.NotNull
    android.graphics.Paint paint, float top, @org.jetbrains.annotations.NotNull
    java.lang.String text) {
        return 0.0F;
    }
    
    @kotlin.jvm.JvmOverloads
    @kotlin.jvm.JvmStatic
    public static final float getDigitalBaselineFromCenter(@org.jetbrains.annotations.NotNull
    android.graphics.Paint paint, float center) {
        return 0.0F;
    }
    
    @kotlin.jvm.JvmOverloads
    @kotlin.jvm.JvmStatic
    public static final float getDigitalBaselineFromCenter(@org.jetbrains.annotations.NotNull
    android.graphics.Paint paint, float center, @org.jetbrains.annotations.NotNull
    java.lang.String text) {
        return 0.0F;
    }
    
    @kotlin.jvm.JvmOverloads
    @kotlin.jvm.JvmStatic
    public static final float getDigitalBaselineFromBottom(@org.jetbrains.annotations.NotNull
    android.graphics.Paint paint, float bottom) {
        return 0.0F;
    }
    
    @kotlin.jvm.JvmOverloads
    @kotlin.jvm.JvmStatic
    public static final float getDigitalBaselineFromBottom(@org.jetbrains.annotations.NotNull
    android.graphics.Paint paint, float bottom, @org.jetbrains.annotations.NotNull
    java.lang.String text) {
        return 0.0F;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\u0007H\u0002J\"\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0004H\u0007J\"\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0004H\u0007J\"\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0004H\u0007J\u001a\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Ldji/v5/ux/core/util/FontUtils$Companion;", "", "()V", "DIGITAL_TEXT", "", "calcCache", "Ljava/lang/ThreadLocal;", "Landroid/graphics/Rect;", "getCalcCache", "()Ljava/lang/ThreadLocal;", "setCalcCache", "(Ljava/lang/ThreadLocal;)V", "getCachedRect", "getDigitalBaselineFromBottom", "", "paint", "Landroid/graphics/Paint;", "bottom", "text", "getDigitalBaselineFromCenter", "center", "getDigitalBaselineFromTop", "top", "getDigitalTextDrawHeight", "android-sdk-v5-uxsdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.ThreadLocal<android.graphics.Rect> getCalcCache() {
            return null;
        }
        
        public final void setCalcCache(@org.jetbrains.annotations.NotNull
        java.lang.ThreadLocal<android.graphics.Rect> p0) {
        }
        
        /**
         * 获取文字绘制高度
         * 使用的字体在上下分别有 FontMetrics.bottom 高的空白
         */
        @kotlin.jvm.JvmOverloads
        @kotlin.jvm.JvmStatic
        public final float getDigitalTextDrawHeight(@org.jetbrains.annotations.NotNull
        android.graphics.Paint paint) {
            return 0.0F;
        }
        
        /**
         * 获取文字绘制高度
         * 使用的字体在上下分别有 FontMetrics.bottom 高的空白
         */
        @kotlin.jvm.JvmOverloads
        @kotlin.jvm.JvmStatic
        public final float getDigitalTextDrawHeight(@org.jetbrains.annotations.NotNull
        android.graphics.Paint paint, @org.jetbrains.annotations.NotNull
        java.lang.String text) {
            return 0.0F;
        }
        
        @kotlin.jvm.JvmOverloads
        @kotlin.jvm.JvmStatic
        public final float getDigitalBaselineFromTop(@org.jetbrains.annotations.NotNull
        android.graphics.Paint paint, float top) {
            return 0.0F;
        }
        
        @kotlin.jvm.JvmOverloads
        @kotlin.jvm.JvmStatic
        public final float getDigitalBaselineFromTop(@org.jetbrains.annotations.NotNull
        android.graphics.Paint paint, float top, @org.jetbrains.annotations.NotNull
        java.lang.String text) {
            return 0.0F;
        }
        
        @kotlin.jvm.JvmOverloads
        @kotlin.jvm.JvmStatic
        public final float getDigitalBaselineFromCenter(@org.jetbrains.annotations.NotNull
        android.graphics.Paint paint, float center) {
            return 0.0F;
        }
        
        @kotlin.jvm.JvmOverloads
        @kotlin.jvm.JvmStatic
        public final float getDigitalBaselineFromCenter(@org.jetbrains.annotations.NotNull
        android.graphics.Paint paint, float center, @org.jetbrains.annotations.NotNull
        java.lang.String text) {
            return 0.0F;
        }
        
        @kotlin.jvm.JvmOverloads
        @kotlin.jvm.JvmStatic
        public final float getDigitalBaselineFromBottom(@org.jetbrains.annotations.NotNull
        android.graphics.Paint paint, float bottom) {
            return 0.0F;
        }
        
        @kotlin.jvm.JvmOverloads
        @kotlin.jvm.JvmStatic
        public final float getDigitalBaselineFromBottom(@org.jetbrains.annotations.NotNull
        android.graphics.Paint paint, float bottom, @org.jetbrains.annotations.NotNull
        java.lang.String text) {
            return 0.0F;
        }
        
        private final android.graphics.Rect getCachedRect() {
            return null;
        }
    }
}