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
import dji.v5.ux.core.ui.hsi.dashboard.AttitudeDashBoard;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class UxsdkLiveviewPfdAttitudeDisplayWidgetBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final StrokeTextView pfdAslText;

  @NonNull
  public final StrokeTextView pfdAslValue;

  @NonNull
  public final AttitudeDashBoard pfdAttitudeDashBoard;

  @NonNull
  public final StrokeTextView pfdVsText;

  @NonNull
  public final StrokeTextView pfdVsValue;

  private UxsdkLiveviewPfdAttitudeDisplayWidgetBinding(@NonNull View rootView,
      @NonNull StrokeTextView pfdAslText, @NonNull StrokeTextView pfdAslValue,
      @NonNull AttitudeDashBoard pfdAttitudeDashBoard, @NonNull StrokeTextView pfdVsText,
      @NonNull StrokeTextView pfdVsValue) {
    this.rootView = rootView;
    this.pfdAslText = pfdAslText;
    this.pfdAslValue = pfdAslValue;
    this.pfdAttitudeDashBoard = pfdAttitudeDashBoard;
    this.pfdVsText = pfdVsText;
    this.pfdVsValue = pfdVsValue;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static UxsdkLiveviewPfdAttitudeDisplayWidgetBinding inflate(
      @NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.uxsdk_liveview_pfd_attitude_display_widget, parent);
    return bind(parent);
  }

  @NonNull
  public static UxsdkLiveviewPfdAttitudeDisplayWidgetBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.pfd_asl_text;
      StrokeTextView pfdAslText = ViewBindings.findChildViewById(rootView, id);
      if (pfdAslText == null) {
        break missingId;
      }

      id = R.id.pfd_asl_value;
      StrokeTextView pfdAslValue = ViewBindings.findChildViewById(rootView, id);
      if (pfdAslValue == null) {
        break missingId;
      }

      id = R.id.pfd_attitude_dash_board;
      AttitudeDashBoard pfdAttitudeDashBoard = ViewBindings.findChildViewById(rootView, id);
      if (pfdAttitudeDashBoard == null) {
        break missingId;
      }

      id = R.id.pfd_vs_text;
      StrokeTextView pfdVsText = ViewBindings.findChildViewById(rootView, id);
      if (pfdVsText == null) {
        break missingId;
      }

      id = R.id.pfd_vs_value;
      StrokeTextView pfdVsValue = ViewBindings.findChildViewById(rootView, id);
      if (pfdVsValue == null) {
        break missingId;
      }

      return new UxsdkLiveviewPfdAttitudeDisplayWidgetBinding(rootView, pfdAslText, pfdAslValue,
          pfdAttitudeDashBoard, pfdVsText, pfdVsValue);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
