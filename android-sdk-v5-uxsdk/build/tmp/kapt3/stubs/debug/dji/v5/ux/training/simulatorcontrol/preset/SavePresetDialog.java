package dji.v5.ux.training.simulatorcontrol.preset;

import java.lang.System;

/**
 * Save Preset Dialog
 *
 * The values entered in [SimulatorControlWidget] can be saved for future simulation as preset.
 * This dialog provides a user interface to enter the name to be used for saving the preset.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0016J\u0012\u00100\u001a\u00020-2\b\u00101\u001a\u0004\u0018\u000102H\u0014J\u0010\u00103\u001a\u00020-2\u0006\u00104\u001a\u000205H\u0002J\u0010\u0010\u000f\u001a\u00020-2\b\b\u0001\u00106\u001a\u00020\u0011J\u0010\u00107\u001a\u00020-2\b\b\u0001\u00108\u001a\u00020\u0011J\u0010\u0010$\u001a\u00020-2\b\b\u0001\u00106\u001a\u00020\u0011J\u0010\u00109\u001a\u00020-2\b\b\u0001\u00108\u001a\u00020\u0011R$\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00118F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\n\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\"\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b#\u0010\u000e\"\u0004\b$\u0010\u0010R$\u0010%\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00118F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b&\u0010\u0014\"\u0004\b\'\u0010\u0016R(\u0010(\u001a\u0004\u0018\u00010\u00172\b\u0010\n\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010\u001cR\u000e\u0010+\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006:"}, d2 = {"Ldji/v5/ux/training/simulatorcontrol/preset/SavePresetDialog;", "Landroid/app/Dialog;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "cancelable", "", "simulatorPresetData", "Ldji/v5/ux/training/simulatorcontrol/preset/SimulatorPresetData;", "(Landroid/content/Context;ZLdji/v5/ux/training/simulatorcontrol/preset/SimulatorPresetData;)V", "value", "Landroid/graphics/drawable/Drawable;", "buttonBackground", "getButtonBackground", "()Landroid/graphics/drawable/Drawable;", "setButtonBackground", "(Landroid/graphics/drawable/Drawable;)V", "", "buttonTextColor", "getButtonTextColor", "()I", "setButtonTextColor", "(I)V", "Landroid/content/res/ColorStateList;", "buttonTextColors", "getButtonTextColors", "()Landroid/content/res/ColorStateList;", "setButtonTextColors", "(Landroid/content/res/ColorStateList;)V", "cancelTextView", "Landroid/widget/TextView;", "presetEditText", "Landroid/widget/EditText;", "saveTextView", "titleBackground", "getTitleBackground", "setTitleBackground", "titleTextColor", "getTitleTextColor", "setTitleTextColor", "titleTextColors", "getTitleTextColors", "setTitleTextColors", "titleTextView", "onClick", "", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "savePreset", "name", "", "resourceId", "setButtonTextAppearance", "textAppearance", "setTitleTextAppearance", "android-sdk-v5-uxsdk_debug"})
public final class SavePresetDialog extends android.app.Dialog implements android.view.View.OnClickListener {
    private final dji.v5.ux.training.simulatorcontrol.preset.SimulatorPresetData simulatorPresetData = null;
    private final android.widget.TextView titleTextView = null;
    private final android.widget.TextView saveTextView = null;
    private final android.widget.TextView cancelTextView = null;
    private final android.widget.EditText presetEditText = null;
    
    public SavePresetDialog(@org.jetbrains.annotations.NotNull
    android.content.Context context, boolean cancelable, @org.jetbrains.annotations.NotNull
    dji.v5.ux.training.simulatorcontrol.preset.SimulatorPresetData simulatorPresetData) {
        super(null);
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onClick(@org.jetbrains.annotations.NotNull
    android.view.View v) {
    }
    
    private final void savePreset(java.lang.String name) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.content.res.ColorStateList getTitleTextColors() {
        return null;
    }
    
    public final void setTitleTextColors(@org.jetbrains.annotations.Nullable
    android.content.res.ColorStateList value) {
    }
    
    public final int getTitleTextColor() {
        return 0;
    }
    
    public final void setTitleTextColor(int value) {
    }
    
    /**
     * Set text appearance of the widget title
     *
     * @param textAppearance Style resource for text appearance
     */
    public final void setTitleTextAppearance(@androidx.annotation.StyleRes
    int textAppearance) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getTitleBackground() {
        return null;
    }
    
    public final void setTitleBackground(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable value) {
    }
    
    /**
     * Set background to title text
     */
    public final void setTitleBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.graphics.drawable.Drawable getButtonBackground() {
        return null;
    }
    
    public final void setButtonBackground(@org.jetbrains.annotations.NotNull
    android.graphics.drawable.Drawable value) {
    }
    
    /**
     * Set background to button text
     */
    public final void setButtonBackground(@androidx.annotation.DrawableRes
    int resourceId) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.content.res.ColorStateList getButtonTextColors() {
        return null;
    }
    
    public final void setButtonTextColors(@org.jetbrains.annotations.Nullable
    android.content.res.ColorStateList value) {
    }
    
    public final int getButtonTextColor() {
        return 0;
    }
    
    public final void setButtonTextColor(int value) {
    }
    
    /**
     * Set text appearance of the button
     *
     * @param textAppearance Style resource for text appearance
     */
    public final void setButtonTextAppearance(@androidx.annotation.StyleRes
    int textAppearance) {
    }
}