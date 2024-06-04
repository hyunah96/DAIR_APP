package dji.v5.ux.training.simulatorcontrol.preset;

import java.lang.System;

/**
 * Preset List Dialog
 *
 * Dialog shows a list of saved presets.
 * Tapping on the preset name will load the values saved in the [SimulatorControlWidget]
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0003J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\b\u0010\u001f\u001a\u00020\u0015H\u0002J\b\u0010 \u001a\u00020\u0015H\u0002J\u0012\u0010!\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u0011H\u0002J\u0010\u0010#\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0011H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Ldji/v5/ux/training/simulatorcontrol/preset/PresetListDialog;", "Landroid/app/Dialog;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "loadPresetListener", "Ldji/v5/ux/training/simulatorcontrol/preset/OnLoadPresetListener;", "dialogHeight", "", "(Landroid/content/Context;Ldji/v5/ux/training/simulatorcontrol/preset/OnLoadPresetListener;I)V", "cancelDialogTextView", "Landroid/widget/TextView;", "confirmDeleteTextView", "deletePresetNoTextView", "deletePresetYesTextView", "emptyPresetListTextView", "keyToDelete", "", "presetListContainerLinearLayout", "Landroid/widget/LinearLayout;", "deletePreset", "", "insertView", "key", "value", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "populatePresetList", "resetListUI", "sendPresetEvent", "data", "showDeleteConfirmation", "android-sdk-v5-uxsdk_debug"})
public final class PresetListDialog extends android.app.Dialog implements android.view.View.OnClickListener {
    private final dji.v5.ux.training.simulatorcontrol.preset.OnLoadPresetListener loadPresetListener = null;
    private final int dialogHeight = 0;
    private final android.widget.LinearLayout presetListContainerLinearLayout = null;
    private final android.widget.TextView emptyPresetListTextView = null;
    private final android.widget.TextView confirmDeleteTextView = null;
    private final android.widget.TextView cancelDialogTextView = null;
    private final android.widget.TextView deletePresetYesTextView = null;
    private final android.widget.TextView deletePresetNoTextView = null;
    private java.lang.String keyToDelete;
    
    @kotlin.jvm.JvmOverloads
    public PresetListDialog(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dji.v5.ux.training.simulatorcontrol.preset.OnLoadPresetListener loadPresetListener) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public PresetListDialog(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    dji.v5.ux.training.simulatorcontrol.preset.OnLoadPresetListener loadPresetListener, int dialogHeight) {
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
    
    private final void populatePresetList() {
    }
    
    private final void resetListUI() {
    }
    
    private final void deletePreset() {
    }
    
    private final void showDeleteConfirmation(java.lang.String key) {
    }
    
    private final void sendPresetEvent(java.lang.String data) {
    }
    
    @android.annotation.SuppressLint(value = {"InflateParams"})
    private final void insertView(java.lang.String key, java.lang.String value) {
    }
}