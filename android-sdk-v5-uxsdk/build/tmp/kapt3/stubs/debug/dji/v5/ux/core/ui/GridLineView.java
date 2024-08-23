package dji.v5.ux.core.ui;

import java.lang.System;

/**
 * Displays a grid centered in the view.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001*B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007J\u0010\u0010\'\u001a\u00020$2\u0006\u0010(\u001a\u00020)H\u0014R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00078G@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001e8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u0006+"}, d2 = {"Ldji/v5/ux/core/ui/GridLineView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gridHeight", "gridWidth", "color", "lineColor", "getLineColor", "()I", "setLineColor", "(I)V", "lineWidth", "", "getLineWidth", "()F", "setLineWidth", "(F)V", "numLines", "numberOfLines", "getNumberOfLines", "setNumberOfLines", "paint", "Landroid/graphics/Paint;", "type", "Ldji/v5/ux/core/ui/GridLineView$GridLineType;", "getType", "()Ldji/v5/ux/core/ui/GridLineView$GridLineType;", "setType", "(Ldji/v5/ux/core/ui/GridLineView$GridLineType;)V", "adjustDimensions", "", "width", "height", "onDraw", "canvas", "Landroid/graphics/Canvas;", "GridLineType", "android-sdk-v5-uxsdk_debug"})
public final class GridLineView extends android.view.View {
    private final android.graphics.Paint paint = null;
    private int gridWidth = 0;
    private int gridHeight = 0;
    
    /**
     * The color of the grid lines
     */
    private int lineColor;
    
    /**
     * The width of the grid lines
     *
     * @return The width of the grid lines
     */
    private float lineWidth = 1.0F;
    
    /**
     * The number of lines drawn both horizontally and vertically on the screen, including the
     * two border lines.
     */
    private int numberOfLines = 4;
    
    @kotlin.jvm.JvmOverloads
    public GridLineView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public GridLineView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public GridLineView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @androidx.annotation.ColorInt
    public final int getLineColor() {
        return 0;
    }
    
    public final void setLineColor(@androidx.annotation.ColorInt
    int color) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.GridLineView.GridLineType getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.ui.GridLineView.GridLineType type) {
    }
    
    public final float getLineWidth() {
        return 0.0F;
    }
    
    public final void setLineWidth(float lineWidth) {
    }
    
    public final int getNumberOfLines() {
        return 0;
    }
    
    public final void setNumberOfLines(int numLines) {
    }
    
    /**
     * Adjust the width and height of the grid lines. The grid will be centered within the view.
     *
     * @param width  The new width of the grid lines.
     * @param height The new height of the grid lines.
     */
    public final void adjustDimensions(int width, int height) {
    }
    
    @java.lang.Override
    protected void onDraw(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas) {
    }
    
    /**
     * Represents the types of grid lines that can be set.
     *
     * @property value Identifier for the item
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u00020\u00038\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\u000b"}, d2 = {"Ldji/v5/ux/core/ui/GridLineView$GridLineType;", "", "value", "", "(Ljava/lang/String;II)V", "()I", "NONE", "PARALLEL", "PARALLEL_DIAGONAL", "UNKNOWN", "Companion", "android-sdk-v5-uxsdk_debug"})
    public static enum GridLineType {
        /*public static final*/ NONE /* = new NONE(0) */,
        /*public static final*/ PARALLEL /* = new PARALLEL(0) */,
        /*public static final*/ PARALLEL_DIAGONAL /* = new PARALLEL_DIAGONAL(0) */,
        /*public static final*/ UNKNOWN /* = new UNKNOWN(0) */;
        private final int value = 0;
        @org.jetbrains.annotations.NotNull
        public static final dji.v5.ux.core.ui.GridLineView.GridLineType.Companion Companion = null;
        @org.jetbrains.annotations.NotNull
        private static final dji.v5.ux.core.ui.GridLineView.GridLineType[] values = null;
        
        GridLineType(int value) {
        }
        
        @kotlin.jvm.JvmName(name = "value")
        public final int value() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public static final dji.v5.ux.core.ui.GridLineView.GridLineType[] getValues() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @kotlin.jvm.JvmStatic
        public static final dji.v5.ux.core.ui.GridLineView.GridLineType find(int value) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0007R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\t\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Ldji/v5/ux/core/ui/GridLineView$GridLineType$Companion;", "", "()V", "values", "", "Ldji/v5/ux/core/ui/GridLineView$GridLineType;", "getValues$annotations", "getValues", "()[Ldji/v5/ux/core/ui/GridLineView$GridLineType;", "[Ldji/v5/ux/core/ui/GridLineView$GridLineType;", "find", "value", "", "android-sdk-v5-uxsdk_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.ui.GridLineView.GridLineType[] getValues() {
                return null;
            }
            
            @kotlin.jvm.JvmStatic
            @java.lang.Deprecated
            public static void getValues$annotations() {
            }
            
            @org.jetbrains.annotations.NotNull
            @kotlin.jvm.JvmStatic
            public final dji.v5.ux.core.ui.GridLineView.GridLineType find(int value) {
                return null;
            }
        }
    }
}