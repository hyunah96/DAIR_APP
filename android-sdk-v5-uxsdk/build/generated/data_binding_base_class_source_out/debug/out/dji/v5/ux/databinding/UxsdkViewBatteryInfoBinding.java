// Generated by view binder compiler. Do not edit!
package dji.v5.ux.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import dji.v5.ux.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class UxsdkViewBatteryInfoBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final Group groupHighVoltage;

  @NonNull
  public final ImageView iconHighVoltage;

  @NonNull
  public final RelativeLayout settingMenuBatteryBottomView;

  @NonNull
  public final LinearLayout settingMenuBatteryCellsViewStub;

  @NonNull
  public final TextView settingMenuBatteryChargeRemainTv;

  @NonNull
  public final TextView settingMenuBatteryChargeRemainValueTv;

  @NonNull
  public final TextView settingMenuBatteryCycleTimeTv;

  @NonNull
  public final TextView settingMenuBatteryCycleTimeValueTv;

  @NonNull
  public final View settingMenuBatteryDivider;

  @NonNull
  public final View settingMenuBatteryDividerBottom;

  @NonNull
  public final TextView settingMenuBatteryHighVoltageSaveTv;

  @NonNull
  public final TextView settingMenuBatteryHighVoltageSaveValueTv;

  @NonNull
  public final TextView settingMenuBatteryProductionDate;

  @NonNull
  public final TextView settingMenuBatterySn;

  @NonNull
  public final Guideline settingMenuBatteryStartGl;

  @NonNull
  public final TextView settingMenuBatteryStatus;

  @NonNull
  public final TextView settingMenuBatteryTemperatureTv;

  @NonNull
  public final TextView settingMenuBatteryTemperatureValueTv;

  @NonNull
  public final Barrier settingMenuBatteryTopBarrier;

  @NonNull
  public final TextView settingMenuBatteryTv;

  @NonNull
  public final TextView settingMenuBatteryVoltageTv;

  @NonNull
  public final TextView settingMenuBatteryVoltageValueTv;

  @NonNull
  public final Guideline settingMenuHighVoltageEndGl;

  private UxsdkViewBatteryInfoBinding(@NonNull View rootView, @NonNull Group groupHighVoltage,
      @NonNull ImageView iconHighVoltage, @NonNull RelativeLayout settingMenuBatteryBottomView,
      @NonNull LinearLayout settingMenuBatteryCellsViewStub,
      @NonNull TextView settingMenuBatteryChargeRemainTv,
      @NonNull TextView settingMenuBatteryChargeRemainValueTv,
      @NonNull TextView settingMenuBatteryCycleTimeTv,
      @NonNull TextView settingMenuBatteryCycleTimeValueTv, @NonNull View settingMenuBatteryDivider,
      @NonNull View settingMenuBatteryDividerBottom,
      @NonNull TextView settingMenuBatteryHighVoltageSaveTv,
      @NonNull TextView settingMenuBatteryHighVoltageSaveValueTv,
      @NonNull TextView settingMenuBatteryProductionDate, @NonNull TextView settingMenuBatterySn,
      @NonNull Guideline settingMenuBatteryStartGl, @NonNull TextView settingMenuBatteryStatus,
      @NonNull TextView settingMenuBatteryTemperatureTv,
      @NonNull TextView settingMenuBatteryTemperatureValueTv,
      @NonNull Barrier settingMenuBatteryTopBarrier, @NonNull TextView settingMenuBatteryTv,
      @NonNull TextView settingMenuBatteryVoltageTv,
      @NonNull TextView settingMenuBatteryVoltageValueTv,
      @NonNull Guideline settingMenuHighVoltageEndGl) {
    this.rootView = rootView;
    this.groupHighVoltage = groupHighVoltage;
    this.iconHighVoltage = iconHighVoltage;
    this.settingMenuBatteryBottomView = settingMenuBatteryBottomView;
    this.settingMenuBatteryCellsViewStub = settingMenuBatteryCellsViewStub;
    this.settingMenuBatteryChargeRemainTv = settingMenuBatteryChargeRemainTv;
    this.settingMenuBatteryChargeRemainValueTv = settingMenuBatteryChargeRemainValueTv;
    this.settingMenuBatteryCycleTimeTv = settingMenuBatteryCycleTimeTv;
    this.settingMenuBatteryCycleTimeValueTv = settingMenuBatteryCycleTimeValueTv;
    this.settingMenuBatteryDivider = settingMenuBatteryDivider;
    this.settingMenuBatteryDividerBottom = settingMenuBatteryDividerBottom;
    this.settingMenuBatteryHighVoltageSaveTv = settingMenuBatteryHighVoltageSaveTv;
    this.settingMenuBatteryHighVoltageSaveValueTv = settingMenuBatteryHighVoltageSaveValueTv;
    this.settingMenuBatteryProductionDate = settingMenuBatteryProductionDate;
    this.settingMenuBatterySn = settingMenuBatterySn;
    this.settingMenuBatteryStartGl = settingMenuBatteryStartGl;
    this.settingMenuBatteryStatus = settingMenuBatteryStatus;
    this.settingMenuBatteryTemperatureTv = settingMenuBatteryTemperatureTv;
    this.settingMenuBatteryTemperatureValueTv = settingMenuBatteryTemperatureValueTv;
    this.settingMenuBatteryTopBarrier = settingMenuBatteryTopBarrier;
    this.settingMenuBatteryTv = settingMenuBatteryTv;
    this.settingMenuBatteryVoltageTv = settingMenuBatteryVoltageTv;
    this.settingMenuBatteryVoltageValueTv = settingMenuBatteryVoltageValueTv;
    this.settingMenuHighVoltageEndGl = settingMenuHighVoltageEndGl;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static UxsdkViewBatteryInfoBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.uxsdk_view_battery_info, parent);
    return bind(parent);
  }

  @NonNull
  public static UxsdkViewBatteryInfoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.group_high_voltage;
      Group groupHighVoltage = ViewBindings.findChildViewById(rootView, id);
      if (groupHighVoltage == null) {
        break missingId;
      }

      id = R.id.icon_high_voltage;
      ImageView iconHighVoltage = ViewBindings.findChildViewById(rootView, id);
      if (iconHighVoltage == null) {
        break missingId;
      }

      id = R.id.setting_menu_battery_bottom_view;
      RelativeLayout settingMenuBatteryBottomView = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuBatteryBottomView == null) {
        break missingId;
      }

      id = R.id.setting_menu_battery_cells_view_stub;
      LinearLayout settingMenuBatteryCellsViewStub = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuBatteryCellsViewStub == null) {
        break missingId;
      }

      id = R.id.setting_menu_battery_charge_remain_tv;
      TextView settingMenuBatteryChargeRemainTv = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuBatteryChargeRemainTv == null) {
        break missingId;
      }

      id = R.id.setting_menu_battery_charge_remain_value_tv;
      TextView settingMenuBatteryChargeRemainValueTv = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuBatteryChargeRemainValueTv == null) {
        break missingId;
      }

      id = R.id.setting_menu_battery_cycle_time_tv;
      TextView settingMenuBatteryCycleTimeTv = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuBatteryCycleTimeTv == null) {
        break missingId;
      }

      id = R.id.setting_menu_battery_cycle_time_value_tv;
      TextView settingMenuBatteryCycleTimeValueTv = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuBatteryCycleTimeValueTv == null) {
        break missingId;
      }

      id = R.id.setting_menu_battery_divider;
      View settingMenuBatteryDivider = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuBatteryDivider == null) {
        break missingId;
      }

      id = R.id.setting_menu_battery_divider_bottom;
      View settingMenuBatteryDividerBottom = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuBatteryDividerBottom == null) {
        break missingId;
      }

      id = R.id.setting_menu_battery_high_voltage_save_tv;
      TextView settingMenuBatteryHighVoltageSaveTv = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuBatteryHighVoltageSaveTv == null) {
        break missingId;
      }

      id = R.id.setting_menu_battery_high_voltage_save_value_tv;
      TextView settingMenuBatteryHighVoltageSaveValueTv = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuBatteryHighVoltageSaveValueTv == null) {
        break missingId;
      }

      id = R.id.setting_menu_battery_production_date;
      TextView settingMenuBatteryProductionDate = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuBatteryProductionDate == null) {
        break missingId;
      }

      id = R.id.setting_menu_battery_sn;
      TextView settingMenuBatterySn = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuBatterySn == null) {
        break missingId;
      }

      id = R.id.setting_menu_battery_start_gl;
      Guideline settingMenuBatteryStartGl = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuBatteryStartGl == null) {
        break missingId;
      }

      id = R.id.setting_menu_battery_status;
      TextView settingMenuBatteryStatus = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuBatteryStatus == null) {
        break missingId;
      }

      id = R.id.setting_menu_battery_temperature_tv;
      TextView settingMenuBatteryTemperatureTv = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuBatteryTemperatureTv == null) {
        break missingId;
      }

      id = R.id.setting_menu_battery_temperature_value_tv;
      TextView settingMenuBatteryTemperatureValueTv = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuBatteryTemperatureValueTv == null) {
        break missingId;
      }

      id = R.id.setting_menu_battery_top_barrier;
      Barrier settingMenuBatteryTopBarrier = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuBatteryTopBarrier == null) {
        break missingId;
      }

      id = R.id.setting_menu_battery_tv;
      TextView settingMenuBatteryTv = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuBatteryTv == null) {
        break missingId;
      }

      id = R.id.setting_menu_battery_voltage_tv;
      TextView settingMenuBatteryVoltageTv = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuBatteryVoltageTv == null) {
        break missingId;
      }

      id = R.id.setting_menu_battery_voltage_value_tv;
      TextView settingMenuBatteryVoltageValueTv = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuBatteryVoltageValueTv == null) {
        break missingId;
      }

      id = R.id.setting_menu_high_voltage_end_gl;
      Guideline settingMenuHighVoltageEndGl = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuHighVoltageEndGl == null) {
        break missingId;
      }

      return new UxsdkViewBatteryInfoBinding(rootView, groupHighVoltage, iconHighVoltage,
          settingMenuBatteryBottomView, settingMenuBatteryCellsViewStub,
          settingMenuBatteryChargeRemainTv, settingMenuBatteryChargeRemainValueTv,
          settingMenuBatteryCycleTimeTv, settingMenuBatteryCycleTimeValueTv,
          settingMenuBatteryDivider, settingMenuBatteryDividerBottom,
          settingMenuBatteryHighVoltageSaveTv, settingMenuBatteryHighVoltageSaveValueTv,
          settingMenuBatteryProductionDate, settingMenuBatterySn, settingMenuBatteryStartGl,
          settingMenuBatteryStatus, settingMenuBatteryTemperatureTv,
          settingMenuBatteryTemperatureValueTv, settingMenuBatteryTopBarrier, settingMenuBatteryTv,
          settingMenuBatteryVoltageTv, settingMenuBatteryVoltageValueTv,
          settingMenuHighVoltageEndGl);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
