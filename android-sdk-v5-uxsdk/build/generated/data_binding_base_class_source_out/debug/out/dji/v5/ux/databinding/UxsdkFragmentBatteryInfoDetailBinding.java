// Generated by view binder compiler. Do not edit!
package dji.v5.ux.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import dji.v5.ux.R;
import dji.v5.ux.core.widget.battery.BatteryGroupWidget;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class UxsdkFragmentBatteryInfoDetailBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final BatteryGroupWidget settingMenuBattery;

  private UxsdkFragmentBatteryInfoDetailBinding(@NonNull ScrollView rootView,
      @NonNull BatteryGroupWidget settingMenuBattery) {
    this.rootView = rootView;
    this.settingMenuBattery = settingMenuBattery;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static UxsdkFragmentBatteryInfoDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static UxsdkFragmentBatteryInfoDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.uxsdk_fragment_battery_info_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static UxsdkFragmentBatteryInfoDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.setting_menu_battery;
      BatteryGroupWidget settingMenuBattery = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuBattery == null) {
        break missingId;
      }

      return new UxsdkFragmentBatteryInfoDetailBinding((ScrollView) rootView, settingMenuBattery);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
