// Generated by view binder compiler. Do not edit!
package dji.v5.ux.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import dji.v5.ux.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class UxsdkWidgetFocusModeSwitchBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final AppCompatTextView textViewCameraControlAf;

  private UxsdkWidgetFocusModeSwitchBinding(@NonNull View rootView,
      @NonNull AppCompatTextView textViewCameraControlAf) {
    this.rootView = rootView;
    this.textViewCameraControlAf = textViewCameraControlAf;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static UxsdkWidgetFocusModeSwitchBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.uxsdk_widget_focus_mode_switch, parent);
    return bind(parent);
  }

  @NonNull
  public static UxsdkWidgetFocusModeSwitchBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.text_view_camera_control_af;
      AppCompatTextView textViewCameraControlAf = ViewBindings.findChildViewById(rootView, id);
      if (textViewCameraControlAf == null) {
        break missingId;
      }

      return new UxsdkWidgetFocusModeSwitchBinding(rootView, textViewCameraControlAf);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}