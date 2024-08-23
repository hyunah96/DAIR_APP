package dji.v5.ux.obstacle;

import java.lang.System;

/**
 * Description :
 *
 * @author: Byte.Cai
 * date : 2023/9/19
 *
 * Copyright (c) 2022, DJI All Rights Reserved.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Ldji/v5/ux/obstacle/SwitchStateListener;", "", "onUpdate", "", "check", "", "android-sdk-v5-uxsdk_debug"})
public abstract interface SwitchStateListener {
    
    public abstract void onUpdate(boolean check);
}