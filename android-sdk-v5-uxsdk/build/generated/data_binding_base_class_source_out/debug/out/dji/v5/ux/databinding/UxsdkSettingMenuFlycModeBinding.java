// Generated by view binder compiler. Do not edit!
package dji.v5.ux.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import dji.v5.ux.R;
import dji.v5.ux.core.base.SwitcherCell;
import dji.v5.ux.core.base.TabSelectCell;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class UxsdkSettingMenuFlycModeBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final TextView settingUiFlycMode;

  @NonNull
  public final View settingUiFlycModeDivider;

  @NonNull
  public final SwitcherCell settingUiFlycModeSwitch;

  @NonNull
  public final TabSelectCell settingUiFlycModeTab;

  private UxsdkSettingMenuFlycModeBinding(@NonNull View rootView,
      @NonNull TextView settingUiFlycMode, @NonNull View settingUiFlycModeDivider,
      @NonNull SwitcherCell settingUiFlycModeSwitch, @NonNull TabSelectCell settingUiFlycModeTab) {
    this.rootView = rootView;
    this.settingUiFlycMode = settingUiFlycMode;
    this.settingUiFlycModeDivider = settingUiFlycModeDivider;
    this.settingUiFlycModeSwitch = settingUiFlycModeSwitch;
    this.settingUiFlycModeTab = settingUiFlycModeTab;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static UxsdkSettingMenuFlycModeBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.uxsdk_setting_menu_flyc_mode, parent);
    return bind(parent);
  }

  @NonNull
  public static UxsdkSettingMenuFlycModeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.setting_ui_flyc_mode;
      TextView settingUiFlycMode = ViewBindings.findChildViewById(rootView, id);
      if (settingUiFlycMode == null) {
        break missingId;
      }

      id = R.id.setting_ui_flyc_mode_divider;
      View settingUiFlycModeDivider = ViewBindings.findChildViewById(rootView, id);
      if (settingUiFlycModeDivider == null) {
        break missingId;
      }

      id = R.id.setting_ui_flyc_mode_switch;
      SwitcherCell settingUiFlycModeSwitch = ViewBindings.findChildViewById(rootView, id);
      if (settingUiFlycModeSwitch == null) {
        break missingId;
      }

      id = R.id.setting_ui_flyc_mode_tab;
      TabSelectCell settingUiFlycModeTab = ViewBindings.findChildViewById(rootView, id);
      if (settingUiFlycModeTab == null) {
        break missingId;
      }

      return new UxsdkSettingMenuFlycModeBinding(rootView, settingUiFlycMode,
          settingUiFlycModeDivider, settingUiFlycModeSwitch, settingUiFlycModeTab);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}