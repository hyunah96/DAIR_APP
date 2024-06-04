package dji.v5.ux.core.widget.radar;

import java.lang.System;

/**
 * Represents a section of the obstacle detection radar : forward, backward, left, or right.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010-\u001a\u00020.H&J\u001a\u0010/\u001a\u00020.2\u0006\u0010\u0007\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0010\u0010\u0010\u001a\u00020.2\b\b\u0001\u00103\u001a\u00020\u0019J\u0010\u0010\u0014\u001a\u00020.2\b\b\u0001\u00103\u001a\u00020\u0019J\u001a\u00104\u001a\u00020.2\b\u00105\u001a\u0004\u0018\u0001062\b\b\u0001\u00107\u001a\u00020\u0019J\u0010\u0010\u0017\u001a\u00020.2\b\b\u0001\u00103\u001a\u00020\u0019J\u001d\u00108\u001a\u00020.2\u000e\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0:H&\u00a2\u0006\u0002\u0010;R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R(\u0010\u0015\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00198G@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u001f\u001a\u0004\u0018\u00010 8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010(\u001a\u00020\'2\u0006\u0010&\u001a\u00020\'8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\u00a8\u0006<"}, d2 = {"Ldji/v5/ux/core/widget/radar/RadarSectionViewHolder;", "", "()V", "arrow", "Landroid/widget/ImageView;", "getArrow", "()Landroid/widget/ImageView;", "distance", "Landroid/widget/TextView;", "getDistance", "()Landroid/widget/TextView;", "icon", "Landroid/graphics/drawable/Drawable;", "distanceArrowIcon", "getDistanceArrowIcon", "()Landroid/graphics/drawable/Drawable;", "setDistanceArrowIcon", "(Landroid/graphics/drawable/Drawable;)V", "distanceArrowIconBackground", "getDistanceArrowIconBackground", "setDistanceArrowIconBackground", "distanceTextBackground", "getDistanceTextBackground", "setDistanceTextBackground", "color", "", "distanceTextColor", "getDistanceTextColor", "()I", "setDistanceTextColor", "(I)V", "colorStateList", "Landroid/content/res/ColorStateList;", "distanceTextColors", "getDistanceTextColors", "()Landroid/content/res/ColorStateList;", "setDistanceTextColors", "(Landroid/content/res/ColorStateList;)V", "textSize", "", "distanceTextSize", "getDistanceTextSize", "()F", "setDistanceTextSize", "(F)V", "hide", "", "setDistance", "", "unitStr", "", "resourceId", "setDistanceTextAppearance", "context", "Landroid/content/Context;", "textAppearanceResId", "setImages", "images", "", "([Landroid/graphics/drawable/Drawable;)V", "android-sdk-v5-uxsdk_debug"})
public abstract class RadarSectionViewHolder {
    
    public RadarSectionViewHolder() {
        super();
    }
    
    /**
     * The [TextView] representing the distance between the obstacle and the aircraft
     */
    @org.jetbrains.annotations.NotNull
    public abstract android.widget.TextView getDistance();
    
    /**
     * The [ImageView] representing the direction of the obstacle
     */
    @org.jetbrains.annotations.NotNull
    public abstract android.widget.ImageView getArrow();
    
    @androidx.annotation.ColorInt
    public final int getDistanceTextColor() {
        return 0;
    }
    
    public final void setDistanceTextColor(int color) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.content.res.ColorStateList getDistanceTextColors() {
        return null;
    }
    
    public final void setDistanceTextColors(@org.jetbrains.annotations.Nullable
    android.content.res.ColorStateList colorStateList) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getDistanceTextBackground() {
        return null;
    }
    
    public final void setDistanceTextBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable icon) {
    }
    
    public final float getDistanceTextSize() {
        return 0.0F;
    }
    
    public final void setDistanceTextSize(float textSize) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getDistanceArrowIcon() {
        return null;
    }
    
    public final void setDistanceArrowIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable icon) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getDistanceArrowIconBackground() {
        return null;
    }
    
    public final void setDistanceArrowIconBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable icon) {
    }
    
    /**
     * Set the distance of the detected obstacle.
     *
     * @param distance The distance of the detected obstacle.
     * @param unitStr  A string representing the units for the distance measurement.
     */
    public void setDistance(double distance, @org.jetbrains.annotations.Nullable
    java.lang.String unitStr) {
    }
    
    /**
     * Set the images for this radar section. For single-angle radar sections, only the first
     * image in the array is used. For multi-angle radar sections, the images will be
     * overlapped to form the sections of the radar.
     *
     * @param images An array of level-list [Drawable] objects with levels from 0-5 for multi-angle
     * radar sections or 0-1 for single-angle radar sections.
     */
    public abstract void setImages(@org.jetbrains.annotations.NotNull
    android.graphics.drawable.Drawable[] images);
    
    /**
     * Hide this radar section. May be shown again if [setSectors] or [setDistance] is called
     * afterwards.
     */
    public abstract void hide();
    
    /**
     * Set text appearance of the distance text view
     *
     * @param context A context object
     * @param textAppearanceResId Style resource for text appearance
     */
    public final void setDistanceTextAppearance(@org.jetbrains.annotations.Nullable
    android.content.Context context, @androidx.annotation.StyleRes
    int textAppearanceResId) {
    }
    
    /**
     * Set the resource ID for the background of the distance text view
     *
     * @param resourceId Integer ID of the text view's background resource
     */
    public final void setDistanceTextBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the resource ID for the arrow icon. The given icon should be pointed up, and each
     * radar direction's icon will be rotated to point the corresponding direction.
     *
     * @param resourceId Integer ID of the drawable resource
     */
    public final void setDistanceArrowIcon(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    /**
     * Set the resource ID for the arrow icon's background
     *
     * @param resourceId Integer ID of the icon's background resource
     */
    public final void setDistanceArrowIconBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
}