package dji.v5.ux.core.base.panel;

import java.lang.System;

/**
 * Make an object navigable.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Ldji/v5/ux/core/base/panel/Navigable;", "", "panelNavigator", "Ldji/v5/ux/core/base/panel/PanelNavigator;", "getPanelNavigator", "()Ldji/v5/ux/core/base/panel/PanelNavigator;", "setPanelNavigator", "(Ldji/v5/ux/core/base/panel/PanelNavigator;)V", "android-sdk-v5-uxsdk_debug"})
public abstract interface Navigable {
    
    /**
     * Use to navigate to another panel.
     */
    @org.jetbrains.annotations.Nullable
    public abstract dji.v5.ux.core.base.panel.PanelNavigator getPanelNavigator();
    
    /**
     * Use to navigate to another panel.
     */
    public abstract void setPanelNavigator(@org.jetbrains.annotations.Nullable
    dji.v5.ux.core.base.panel.PanelNavigator p0);
}