package dji.v5.ux.core.widget.radar;

import java.lang.System;

/**
 * Represents a section of the obstacle detection radar that has a single segment.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001d\u0010\u0014\u001a\u00020\u00132\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016H\u0016\u00a2\u0006\u0002\u0010\u0018R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Ldji/v5/ux/core/widget/radar/SingleAngleRadarSectionViewHolder;", "Ldji/v5/ux/core/widget/radar/RadarSectionViewHolder;", "imageId", "", "distanceId", "arrowId", "parent", "Landroid/view/View;", "(IIILandroid/view/View;)V", "arrow", "Landroid/widget/ImageView;", "getArrow", "()Landroid/widget/ImageView;", "distance", "Landroid/widget/TextView;", "getDistance", "()Landroid/widget/TextView;", "radarImage", "hide", "", "setImages", "images", "", "Landroid/graphics/drawable/Drawable;", "([Landroid/graphics/drawable/Drawable;)V", "android-sdk-v5-uxsdk_debug"})
public final class SingleAngleRadarSectionViewHolder extends dji.v5.ux.core.widget.radar.RadarSectionViewHolder {
    @org.jetbrains.annotations.NotNull
    private final android.widget.TextView distance = null;
    @org.jetbrains.annotations.NotNull
    private final android.widget.ImageView arrow = null;
    private final android.widget.ImageView radarImage = null;
    
    public SingleAngleRadarSectionViewHolder(@androidx.annotation.IdRes
    int imageId, @androidx.annotation.IdRes
    int distanceId, @androidx.annotation.IdRes
    int arrowId, @org.jetbrains.annotations.NotNull
    android.view.View parent) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.widget.TextView getDistance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.widget.ImageView getArrow() {
        return null;
    }
    
    @java.lang.Override
    public void hide() {
    }
    
    @java.lang.Override
    public void setImages(@org.jetbrains.annotations.NotNull
    android.graphics.drawable.Drawable[] images) {
    }
}