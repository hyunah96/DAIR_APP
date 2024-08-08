package dji.v5.ux.core.widget.fpv;

import java.lang.System;

/**
 * Class Description
 *
 * @author Hoker
 * @date 2022/3/19
 *
 * Copyright (c) 2022, DJI All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Ldji/v5/ux/core/widget/fpv/FPVStreamSourceListener;", "", "onStreamSourceUpdated", "", "devicePosition", "Ldji/v5/common/video/stream/PhysicalDevicePosition;", "lensType", "Ldji/sdk/keyvalue/value/common/CameraLensType;", "android-sdk-v5-uxsdk_debug"})
public abstract interface FPVStreamSourceListener {
    
    public abstract void onStreamSourceUpdated(@org.jetbrains.annotations.NotNull
    dji.v5.common.video.stream.PhysicalDevicePosition devicePosition, @org.jetbrains.annotations.NotNull
    dji.sdk.keyvalue.value.common.CameraLensType lensType);
}