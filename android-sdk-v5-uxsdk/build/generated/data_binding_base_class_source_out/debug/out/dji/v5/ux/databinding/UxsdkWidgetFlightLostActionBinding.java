// Generated by view binder compiler. Do not edit!
package dji.v5.ux.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import dji.v5.ux.R;
import dji.v5.ux.accessory.DescSpinnerCell;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class UxsdkWidgetFlightLostActionBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final DescSpinnerCell settingMenuAircraftFailSafe;

  private UxsdkWidgetFlightLostActionBinding(@NonNull View rootView,
      @NonNull DescSpinnerCell settingMenuAircraftFailSafe) {
    this.rootView = rootView;
    this.settingMenuAircraftFailSafe = settingMenuAircraftFailSafe;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static UxsdkWidgetFlightLostActionBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.uxsdk_widget_flight_lost_action, parent);
    return bind(parent);
  }

  @NonNull
  public static UxsdkWidgetFlightLostActionBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.setting_menu_aircraft_failSafe;
      DescSpinnerCell settingMenuAircraftFailSafe = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuAircraftFailSafe == null) {
        break missingId;
      }

      return new UxsdkWidgetFlightLostActionBinding(rootView, settingMenuAircraftFailSafe);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}