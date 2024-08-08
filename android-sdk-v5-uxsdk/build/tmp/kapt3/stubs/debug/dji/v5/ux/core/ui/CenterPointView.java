package dji.v5.ux.core.ui;

import java.lang.System;

/**
 * Displays an icon based on the given [CenterPointType].
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0014\u001a\u00020\u0015H\u0002R&\u0010\t\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u00078G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0018"}, d2 = {"Ldji/v5/ux/core/ui/CenterPointView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "color", "getColor", "()I", "setColor", "(I)V", "type", "Ldji/v5/ux/core/ui/CenterPointView$CenterPointType;", "getType", "()Ldji/v5/ux/core/ui/CenterPointView$CenterPointType;", "setType", "(Ldji/v5/ux/core/ui/CenterPointView$CenterPointType;)V", "initView", "", "CenterPointType", "Companion", "android-sdk-v5-uxsdk_debug"})
public final class CenterPointView extends androidx.appcompat.widget.AppCompatImageView {
    @org.jetbrains.annotations.NotNull
    public static final dji.v5.ux.core.ui.CenterPointView.Companion Companion = null;
    
    @kotlin.jvm.JvmOverloads
    public CenterPointView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public CenterPointView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public CenterPointView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @androidx.annotation.ColorInt
    public final int getColor() {
        return 0;
    }
    
    public final void setColor(@androidx.annotation.ColorInt
    int color) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final dji.v5.ux.core.ui.CenterPointView.CenterPointType getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.ui.CenterPointView.CenterPointType type) {
    }
    
    private final void initView() {
    }
    
    /**
     * Sets a new drawable to display when the center point is set to the given type.
     *
     * @param type       The type of center point
     * @param drawableId The drawable that will be displayed
     */
    @kotlin.jvm.JvmStatic
    public static final void setImageForType(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.ui.CenterPointView.CenterPointType type, @androidx.annotation.DrawableRes
    int drawableId) {
    }
    
    /**
     * Represents the types of center points that can be set.
     *
     * @property value Identifier for the item
     * @property drawableId ID of the drawable resource
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u00020\u00038\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012\u00a8\u0006\u0014"}, d2 = {"Ldji/v5/ux/core/ui/CenterPointView$CenterPointType;", "", "value", "", "drawableId", "(Ljava/lang/String;III)V", "getDrawableId", "()I", "setDrawableId", "(I)V", "NONE", "STANDARD", "CROSS", "NARROW_CROSS", "FRAME", "FRAME_AND_CROSS", "SQUARE", "SQUARE_AND_CROSS", "UNKNOWN", "Companion", "android-sdk-v5-uxsdk_debug"})
    public static enum CenterPointType {
        /*public static final*/ NONE /* = new NONE(0, 0) */,
        /*public static final*/ STANDARD /* = new STANDARD(0, 0) */,
        /*public static final*/ CROSS /* = new CROSS(0, 0) */,
        /*public static final*/ NARROW_CROSS /* = new NARROW_CROSS(0, 0) */,
        /*public static final*/ FRAME /* = new FRAME(0, 0) */,
        /*public static final*/ FRAME_AND_CROSS /* = new FRAME_AND_CROSS(0, 0) */,
        /*public static final*/ SQUARE /* = new SQUARE(0, 0) */,
        /*public static final*/ SQUARE_AND_CROSS /* = new SQUARE_AND_CROSS(0, 0) */,
        /*public static final*/ UNKNOWN /* = new UNKNOWN(0, 0) */;
        private final int value = 0;
        private int drawableId;
        @org.jetbrains.annotations.NotNull
        public static final dji.v5.ux.core.ui.CenterPointView.CenterPointType.Companion Companion = null;
        @org.jetbrains.annotations.NotNull
        private static final dji.v5.ux.core.ui.CenterPointView.CenterPointType[] values = null;
        
        CenterPointType(int value, @androidx.annotation.DrawableRes
        int drawableId) {
        }
        
        @kotlin.jvm.JvmName(name = "value")
        public final int value() {
            return 0;
        }
        
        public final int getDrawableId() {
            return 0;
        }
        
        public final void setDrawableId(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public static final dji.v5.ux.core.ui.CenterPointView.CenterPointType[] getValues() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @kotlin.jvm.JvmStatic
        public static final dji.v5.ux.core.ui.CenterPointView.CenterPointType find(int value) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0007R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\t\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Ldji/v5/ux/core/ui/CenterPointView$CenterPointType$Companion;", "", "()V", "values", "", "Ldji/v5/ux/core/ui/CenterPointView$CenterPointType;", "getValues$annotations", "getValues", "()[Ldji/v5/ux/core/ui/CenterPointView$CenterPointType;", "[Ldji/v5/ux/core/ui/CenterPointView$CenterPointType;", "find", "value", "", "android-sdk-v5-uxsdk_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.ui.CenterPointView.CenterPointType[] getValues() {
                return null;
            }
            
            @kotlin.jvm.JvmStatic
            @java.lang.Deprecated
            public static void getValues$annotations() {
            }
            
            @org.jetbrains.annotations.NotNull
            @kotlin.jvm.JvmStatic
            public final dji.v5.ux.core.ui.CenterPointView.CenterPointType find(int value) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Ldji/v5/ux/core/ui/CenterPointView$Companion;", "", "()V", "setImageForType", "", "type", "Ldji/v5/ux/core/ui/CenterPointView$CenterPointType;", "drawableId", "", "android-sdk-v5-uxsdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Sets a new drawable to display when the center point is set to the given type.
         *
         * @param type       The type of center point
         * @param drawableId The drawable that will be displayed
         */
        @kotlin.jvm.JvmStatic
        public final void setImageForType(@org.jetbrains.annotations.NotNull
        dji.v5.ux.core.ui.CenterPointView.CenterPointType type, @androidx.annotation.DrawableRes
        int drawableId) {
        }
    }
}