package dji.v5.ux.core.ui.hsi.dashboard;

import java.lang.System;

/**
 * Pilot UI 2.0 在 FPV 绘制中，需要添加描边
 * 描边不同级别属性在此类中统一配置，方便统一修改
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0002\u0010\fR\u0011\u0010\r\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f\u00a8\u0006\u0015"}, d2 = {"Ldji/v5/ux/core/ui/hsi/dashboard/FpvStrokeConfig;", "", "context", "Landroid/content/Context;", "boldWidth", "", "thinWidth", "(Landroid/content/Context;FF)V", "(Landroid/content/Context;)V", "strokeDeepColor", "", "strokeShallowColor", "(Landroid/content/Context;FFII)V", "strokeBoldWidth", "getStrokeBoldWidth", "()F", "getStrokeDeepColor", "()I", "getStrokeShallowColor", "strokeThinWidth", "getStrokeThinWidth", "android-sdk-v5-uxsdk_debug"})
public final class FpvStrokeConfig {
    private final int strokeDeepColor = 0;
    private final int strokeShallowColor = 0;
    private final float strokeBoldWidth = 0.0F;
    private final float strokeThinWidth = 0.0F;
    
    public FpvStrokeConfig(@org.jetbrains.annotations.NotNull
    android.content.Context context, float boldWidth, float thinWidth, int strokeDeepColor, int strokeShallowColor) {
        super();
    }
    
    public final int getStrokeDeepColor() {
        return 0;
    }
    
    public final int getStrokeShallowColor() {
        return 0;
    }
    
    public FpvStrokeConfig(@org.jetbrains.annotations.NotNull
    android.content.Context context, float boldWidth, float thinWidth) {
        super();
    }
    
    public FpvStrokeConfig(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    public final float getStrokeBoldWidth() {
        return 0.0F;
    }
    
    public final float getStrokeThinWidth() {
        return 0.0F;
    }
}