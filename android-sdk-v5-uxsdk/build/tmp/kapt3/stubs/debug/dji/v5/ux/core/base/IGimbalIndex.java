package dji.v5.ux.core.base;

import java.lang.System;

/**
 * Class Description
 *
 * @author Hoker
 * @date 2021/12/9
 *
 * Copyright (c) 2021, DJI All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Ldji/v5/ux/core/base/IGimbalIndex;", "", "getGimbalIndex", "Ldji/v5/ux/core/util/SettingDefinitions$GimbalIndex;", "updateGimbalIndex", "", "gimbalIndex", "android-sdk-v5-uxsdk_debug"})
public abstract interface IGimbalIndex {
    
    /**
     * Get the gimbal index for which the model is reacting.
     *
     * @return current gimbal index.
     */
    @org.jetbrains.annotations.NotNull
    @androidx.annotation.Nullable
    public abstract dji.v5.ux.core.util.SettingDefinitions.GimbalIndex getGimbalIndex();
    
    /**
     * Set gimbal index to which the model should react.
     *
     * @param gimbalIndex index of the gimbal.
     */
    public abstract void updateGimbalIndex(@org.jetbrains.annotations.NotNull
    dji.v5.ux.core.util.SettingDefinitions.GimbalIndex gimbalIndex);
}