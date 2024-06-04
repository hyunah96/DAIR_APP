package dji.v5.ux.core.extension;

import java.lang.System;

@kotlin.jvm.JvmName(name = "TypedArrayExtensions")
@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\u001a<\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H\b0\u000eH\u0086\b\u00f8\u0001\u0000\u001a4\u0010\u000f\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\b0\u000eH\u0086\b\u00f8\u0001\u0000\u001a4\u0010\u0010\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u0002H\b0\u000eH\u0086\b\u00f8\u0001\u0000\u001a4\u0010\u0012\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\b0\u000eH\u0086\b\u00f8\u0001\u0000\u001a4\u0010\u0013\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u0002H\b0\u000eH\u0086\b\u00f8\u0001\u0000\u001a<\u0010\u0015\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u00032\u001a\u0010\r\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0016\u0012\u0004\u0012\u0002H\b0\u000eH\u0086\b\u00f8\u0001\u0000\u001a4\u0010\u0017\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\b0\u000eH\u0086\b\u00f8\u0001\u0000\u001a4\u0010\u0018\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\b0\u000eH\u0086\b\u00f8\u0001\u0000\u001a4\u0010\u0019\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\b0\u000eH\u0086\b\u00f8\u0001\u0000\u001a4\u0010\u001a\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\b0\u000eH\u0086\b\u00f8\u0001\u0000\u001a\u001c\u0010\u001b\u001a\u00020\u0005*\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0005\u001a4\u0010\u001d\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\b0\u000eH\u0086\b\u00f8\u0001\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u001e"}, d2 = {"INVALID_DIMENSION", "", "INVALID_RESOURCE", "", "INVALID_STRING", "", "getBooleanAndUse", "", "R", "Landroid/content/res/TypedArray;", "index", "defaultValue", "", "block", "Lkotlin/Function1;", "getColorAndUse", "getColorStateListAndUse", "Landroid/content/res/ColorStateList;", "getDimensionAndUse", "getDrawableAndUse", "Landroid/graphics/drawable/Drawable;", "getDrawableArrayAndUse", "", "getFloatAndUse", "getIntAndUse", "getIntegerAndUse", "getResourceIdAndUse", "getString", "defValue", "getStringAndUse", "android-sdk-v5-uxsdk_debug"})
public final class TypedArrayExtensions {
    public static final int INVALID_RESOURCE = -1;
    public static final float INVALID_DIMENSION = -1.0F;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String INVALID_STRING = "";
    
    /**
     * Retrieve the string value for the attribute at [index].
     * Returns the found value or [defValue] if not found.
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getString(@org.jetbrains.annotations.NotNull
    android.content.res.TypedArray $this$getString, @androidx.annotation.StyleableRes
    int index, @org.jetbrains.annotations.NotNull
    java.lang.String defValue) {
        return null;
    }
    
    /**
     * Retrieve the string value for the attribute at [index] and executes the given [block]
     * function with the retrieved resource.
     *
     * @see TypedArray.getString
     */
    public static final <R extends java.lang.Object>void getStringAndUse(@org.jetbrains.annotations.NotNull
    android.content.res.TypedArray $this$getStringAndUse, @androidx.annotation.StyleableRes
    int index, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, ? extends R> block) {
    }
    
    /**
     * Retrieve the color value for the attribute at [index] and executes the given [block]
     * function with the retrieved resource.
     *
     * @see TypedArray.getColor
     */
    public static final <R extends java.lang.Object>void getColorAndUse(@org.jetbrains.annotations.NotNull
    android.content.res.TypedArray $this$getColorAndUse, @androidx.annotation.StyleableRes
    int index, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends R> block) {
    }
    
    /**
     * Retrieve the color state list value for the attribute at [index] and executes the given [block]
     * function with the retrieved resource.
     *
     * @see TypedArray.getColorStateList
     */
    public static final <R extends java.lang.Object>void getColorStateListAndUse(@org.jetbrains.annotations.NotNull
    android.content.res.TypedArray $this$getColorStateListAndUse, @androidx.annotation.StyleableRes
    int index, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super android.content.res.ColorStateList, ? extends R> block) {
    }
    
    /**
     * Retrieve the dimension value for the attribute at [index] and executes the given [block]
     * function with the retrieved resource.
     *
     * @see TypedArray.getDimension
     */
    public static final <R extends java.lang.Object>void getDimensionAndUse(@org.jetbrains.annotations.NotNull
    android.content.res.TypedArray $this$getDimensionAndUse, @androidx.annotation.StyleableRes
    int index, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Float, ? extends R> block) {
    }
    
    /**
     * Retrieve the drawable for the attribute at [index] and executes the given [block]
     * function with the retrieved resource.
     *
     * @see TypedArray.getDrawable
     */
    public static final <R extends java.lang.Object>void getDrawableAndUse(@org.jetbrains.annotations.NotNull
    android.content.res.TypedArray $this$getDrawableAndUse, @androidx.annotation.StyleableRes
    int index, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super android.graphics.drawable.Drawable, ? extends R> block) {
    }
    
    /**
     * Retrieve the int value for the attribute at [index] and executes the given [block]
     * function with the retrieved resource.
     *
     * @see TypedArray.getDrawable
     */
    public static final <R extends java.lang.Object>void getIntAndUse(@org.jetbrains.annotations.NotNull
    android.content.res.TypedArray $this$getIntAndUse, @androidx.annotation.StyleableRes
    int index, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends R> block) {
    }
    
    /**
     * Retrieve the resource identifier for the attribute at [index] and executes the given [block]
     * function with the retrieved resource.
     *
     * @see TypedArray.getResourceId
     */
    public static final <R extends java.lang.Object>void getResourceIdAndUse(@org.jetbrains.annotations.NotNull
    android.content.res.TypedArray $this$getResourceIdAndUse, @androidx.annotation.StyleableRes
    int index, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends R> block) {
    }
    
    /**
     * Retrieve the float value for the attribute at [index] and executes the given [block]
     * function with the retrieved resource.
     *
     * @see TypedArray.getResourceId
     */
    public static final <R extends java.lang.Object>void getFloatAndUse(@org.jetbrains.annotations.NotNull
    android.content.res.TypedArray $this$getFloatAndUse, @androidx.annotation.StyleableRes
    int index, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Float, ? extends R> block) {
    }
    
    /**
     * Retrieve the integer value for the attribute at [index] and executes the given [block]
     * function with the retrieved resource.
     *
     * @see TypedArray.getResourceId
     */
    public static final <R extends java.lang.Object>void getIntegerAndUse(@org.jetbrains.annotations.NotNull
    android.content.res.TypedArray $this$getIntegerAndUse, @androidx.annotation.StyleableRes
    int index, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends R> block) {
    }
    
    /**
     * Retrieve the integer value for the attribute at [index] and executes the given [block]
     * function with the retrieved resource or the [defaultValue].
     *
     * @see TypedArray.getResourceId
     */
    public static final <R extends java.lang.Object>void getBooleanAndUse(@org.jetbrains.annotations.NotNull
    android.content.res.TypedArray $this$getBooleanAndUse, @androidx.annotation.StyleableRes
    int index, boolean defaultValue, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, ? extends R> block) {
    }
    
    /**
     * Retrieve the drawable array value for the attribute at [index] and executes the given [block]
     * function with the retrieved resource.
     */
    public static final <R extends java.lang.Object>void getDrawableArrayAndUse(@org.jetbrains.annotations.NotNull
    android.content.res.TypedArray $this$getDrawableArrayAndUse, @androidx.annotation.StyleableRes
    int index, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super android.graphics.drawable.Drawable[], ? extends R> block) {
    }
}