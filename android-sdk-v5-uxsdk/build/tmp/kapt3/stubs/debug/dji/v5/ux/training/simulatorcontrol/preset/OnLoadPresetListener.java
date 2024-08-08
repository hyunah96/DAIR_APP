package dji.v5.ux.training.simulatorcontrol.preset;

import java.lang.System;

/**
 * Interface to be implemented when [SimulatorPresetData]
 * is to be loaded
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Ldji/v5/ux/training/simulatorcontrol/preset/OnLoadPresetListener;", "", "onLoadPreset", "", "simulatorPresetData", "Ldji/v5/ux/training/simulatorcontrol/preset/SimulatorPresetData;", "android-sdk-v5-uxsdk_debug"})
public abstract interface OnLoadPresetListener {
    
    /**
     * On Preset load event
     *
     * @param simulatorPresetData instance of [SimulatorPresetData]
     */
    public abstract void onLoadPreset(@org.jetbrains.annotations.Nullable
    dji.v5.ux.training.simulatorcontrol.preset.SimulatorPresetData simulatorPresetData);
}