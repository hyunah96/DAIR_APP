// Generated by view binder compiler. Do not edit!
package dji.v5.ux.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import dji.v5.ux.R;
import dji.v5.ux.core.ui.component.StrokeTextView;
import dji.v5.ux.core.ui.hsi.dashboard.SpeedDashBoard;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class UxsdkFpvPfdSpeedDisplayWidgetBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final SpeedDashBoard pfdSpeedDashBoard;

  @NonNull
  public final StrokeTextView pfdWsValue;

  private UxsdkFpvPfdSpeedDisplayWidgetBinding(@NonNull View rootView,
      @NonNull SpeedDashBoard pfdSpeedDashBoard, @NonNull StrokeTextView pfdWsValue) {
    this.rootView = rootView;
    this.pfdSpeedDashBoard = pfdSpeedDashBoard;
    this.pfdWsValue = pfdWsValue;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static UxsdkFpvPfdSpeedDisplayWidgetBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.uxsdk_fpv_pfd_speed_display_widget, parent);
    return bind(parent);
  }

  @NonNull
  public static UxsdkFpvPfdSpeedDisplayWidgetBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.pfd_speed_dash_board;
      SpeedDashBoard pfdSpeedDashBoard = ViewBindings.findChildViewById(rootView, id);
      if (pfdSpeedDashBoard == null) {
        break missingId;
      }

      id = R.id.pfd_ws_value;
      StrokeTextView pfdWsValue = ViewBindings.findChildViewById(rootView, id);
      if (pfdWsValue == null) {
        break missingId;
      }

      return new UxsdkFpvPfdSpeedDisplayWidgetBinding(rootView, pfdSpeedDashBoard, pfdWsValue);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
