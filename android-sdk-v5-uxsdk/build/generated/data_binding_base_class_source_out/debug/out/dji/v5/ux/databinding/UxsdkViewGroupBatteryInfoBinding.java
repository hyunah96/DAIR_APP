// Generated by view binder compiler. Do not edit!
package dji.v5.ux.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import dji.v5.ux.R;
import dji.v5.ux.core.widget.battery.BatteryGroupWidget;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class UxsdkViewGroupBatteryInfoBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final TextView settingMenuBatteryChargeRemain;

  @NonNull
  public final TextView settingMenuBatteryFlyTime;

  @NonNull
  public final TextView settingMenuBatteryFlyTimeTv;

  @NonNull
  public final BatteryGroupWidget settingMenuBatteryGroupView;

  @NonNull
  public final Button settingMenuBatteryInfoDetailView;

  @NonNull
  public final Guideline settingMenuBatteryTotalGl;

  @NonNull
  public final TextView settingMenuBatteryTotalTv;

  @NonNull
  public final Guideline settingMenuFlyTimeGl;

  @NonNull
  public final View settingMenuTotalDivider;

  private UxsdkViewGroupBatteryInfoBinding(@NonNull View rootView,
      @NonNull TextView settingMenuBatteryChargeRemain, @NonNull TextView settingMenuBatteryFlyTime,
      @NonNull TextView settingMenuBatteryFlyTimeTv,
      @NonNull BatteryGroupWidget settingMenuBatteryGroupView,
      @NonNull Button settingMenuBatteryInfoDetailView,
      @NonNull Guideline settingMenuBatteryTotalGl, @NonNull TextView settingMenuBatteryTotalTv,
      @NonNull Guideline settingMenuFlyTimeGl, @NonNull View settingMenuTotalDivider) {
    this.rootView = rootView;
    this.settingMenuBatteryChargeRemain = settingMenuBatteryChargeRemain;
    this.settingMenuBatteryFlyTime = settingMenuBatteryFlyTime;
    this.settingMenuBatteryFlyTimeTv = settingMenuBatteryFlyTimeTv;
    this.settingMenuBatteryGroupView = settingMenuBatteryGroupView;
    this.settingMenuBatteryInfoDetailView = settingMenuBatteryInfoDetailView;
    this.settingMenuBatteryTotalGl = settingMenuBatteryTotalGl;
    this.settingMenuBatteryTotalTv = settingMenuBatteryTotalTv;
    this.settingMenuFlyTimeGl = settingMenuFlyTimeGl;
    this.settingMenuTotalDivider = settingMenuTotalDivider;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static UxsdkViewGroupBatteryInfoBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.uxsdk_view_group_battery_info, parent);
    return bind(parent);
  }

  @NonNull
  public static UxsdkViewGroupBatteryInfoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.setting_menu_battery_charge_remain;
      TextView settingMenuBatteryChargeRemain = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuBatteryChargeRemain == null) {
        break missingId;
      }

      id = R.id.setting_menu_battery_fly_time;
      TextView settingMenuBatteryFlyTime = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuBatteryFlyTime == null) {
        break missingId;
      }

      id = R.id.setting_menu_battery_fly_time_tv;
      TextView settingMenuBatteryFlyTimeTv = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuBatteryFlyTimeTv == null) {
        break missingId;
      }

      id = R.id.setting_menu_battery_group_view;
      BatteryGroupWidget settingMenuBatteryGroupView = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuBatteryGroupView == null) {
        break missingId;
      }

      id = R.id.setting_menu_battery_info_detail_view;
      Button settingMenuBatteryInfoDetailView = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuBatteryInfoDetailView == null) {
        break missingId;
      }

      id = R.id.setting_menu_battery_total_gl;
      Guideline settingMenuBatteryTotalGl = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuBatteryTotalGl == null) {
        break missingId;
      }

      id = R.id.setting_menu_battery_total_tv;
      TextView settingMenuBatteryTotalTv = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuBatteryTotalTv == null) {
        break missingId;
      }

      id = R.id.setting_menu_fly_time_gl;
      Guideline settingMenuFlyTimeGl = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuFlyTimeGl == null) {
        break missingId;
      }

      id = R.id.setting_menu_total_divider;
      View settingMenuTotalDivider = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuTotalDivider == null) {
        break missingId;
      }

      return new UxsdkViewGroupBatteryInfoBinding(rootView, settingMenuBatteryChargeRemain,
          settingMenuBatteryFlyTime, settingMenuBatteryFlyTimeTv, settingMenuBatteryGroupView,
          settingMenuBatteryInfoDetailView, settingMenuBatteryTotalGl, settingMenuBatteryTotalTv,
          settingMenuFlyTimeGl, settingMenuTotalDivider);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}