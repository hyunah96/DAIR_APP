// Generated by view binder compiler. Do not edit!
package dji.v5.ux.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import dji.v5.ux.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class UxsdkWidgetExposureModeSettingBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final ImageView imageviewExposureAutomodeIcon;

  @NonNull
  public final FrameLayout layoutCameraModeA;

  @NonNull
  public final FrameLayout layoutCameraModeM;

  @NonNull
  public final ConstraintLayout layoutCameraModeP;

  @NonNull
  public final FrameLayout layoutCameraModeS;

  @NonNull
  public final TextView textviewCameraModeA;

  @NonNull
  public final TextView textviewCameraModeM;

  @NonNull
  public final TextView textviewCameraModeP;

  @NonNull
  public final TextView textviewCameraModeS;

  private UxsdkWidgetExposureModeSettingBinding(@NonNull View rootView,
      @NonNull ImageView imageviewExposureAutomodeIcon, @NonNull FrameLayout layoutCameraModeA,
      @NonNull FrameLayout layoutCameraModeM, @NonNull ConstraintLayout layoutCameraModeP,
      @NonNull FrameLayout layoutCameraModeS, @NonNull TextView textviewCameraModeA,
      @NonNull TextView textviewCameraModeM, @NonNull TextView textviewCameraModeP,
      @NonNull TextView textviewCameraModeS) {
    this.rootView = rootView;
    this.imageviewExposureAutomodeIcon = imageviewExposureAutomodeIcon;
    this.layoutCameraModeA = layoutCameraModeA;
    this.layoutCameraModeM = layoutCameraModeM;
    this.layoutCameraModeP = layoutCameraModeP;
    this.layoutCameraModeS = layoutCameraModeS;
    this.textviewCameraModeA = textviewCameraModeA;
    this.textviewCameraModeM = textviewCameraModeM;
    this.textviewCameraModeP = textviewCameraModeP;
    this.textviewCameraModeS = textviewCameraModeS;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static UxsdkWidgetExposureModeSettingBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.uxsdk_widget_exposure_mode_setting, parent);
    return bind(parent);
  }

  @NonNull
  public static UxsdkWidgetExposureModeSettingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageview_exposure_automode_icon;
      ImageView imageviewExposureAutomodeIcon = ViewBindings.findChildViewById(rootView, id);
      if (imageviewExposureAutomodeIcon == null) {
        break missingId;
      }

      id = R.id.layout_camera_mode_a;
      FrameLayout layoutCameraModeA = ViewBindings.findChildViewById(rootView, id);
      if (layoutCameraModeA == null) {
        break missingId;
      }

      id = R.id.layout_camera_mode_m;
      FrameLayout layoutCameraModeM = ViewBindings.findChildViewById(rootView, id);
      if (layoutCameraModeM == null) {
        break missingId;
      }

      id = R.id.layout_camera_mode_p;
      ConstraintLayout layoutCameraModeP = ViewBindings.findChildViewById(rootView, id);
      if (layoutCameraModeP == null) {
        break missingId;
      }

      id = R.id.layout_camera_mode_s;
      FrameLayout layoutCameraModeS = ViewBindings.findChildViewById(rootView, id);
      if (layoutCameraModeS == null) {
        break missingId;
      }

      id = R.id.textview_camera_mode_a;
      TextView textviewCameraModeA = ViewBindings.findChildViewById(rootView, id);
      if (textviewCameraModeA == null) {
        break missingId;
      }

      id = R.id.textview_camera_mode_m;
      TextView textviewCameraModeM = ViewBindings.findChildViewById(rootView, id);
      if (textviewCameraModeM == null) {
        break missingId;
      }

      id = R.id.textview_camera_mode_p;
      TextView textviewCameraModeP = ViewBindings.findChildViewById(rootView, id);
      if (textviewCameraModeP == null) {
        break missingId;
      }

      id = R.id.textview_camera_mode_s;
      TextView textviewCameraModeS = ViewBindings.findChildViewById(rootView, id);
      if (textviewCameraModeS == null) {
        break missingId;
      }

      return new UxsdkWidgetExposureModeSettingBinding(rootView, imageviewExposureAutomodeIcon,
          layoutCameraModeA, layoutCameraModeM, layoutCameraModeP, layoutCameraModeS,
          textviewCameraModeA, textviewCameraModeM, textviewCameraModeP, textviewCameraModeS);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}