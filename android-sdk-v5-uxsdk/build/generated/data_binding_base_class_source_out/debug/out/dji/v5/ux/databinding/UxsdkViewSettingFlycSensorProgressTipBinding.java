// Generated by view binder compiler. Do not edit!
package dji.v5.ux.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import dji.v5.ux.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class UxsdkViewSettingFlycSensorProgressTipBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  private UxsdkViewSettingFlycSensorProgressTipBinding(@NonNull LinearLayout rootView) {
    this.rootView = rootView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static UxsdkViewSettingFlycSensorProgressTipBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static UxsdkViewSettingFlycSensorProgressTipBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.uxsdk_view_setting_flyc_sensor_progress_tip, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static UxsdkViewSettingFlycSensorProgressTipBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    return new UxsdkViewSettingFlycSensorProgressTipBinding((LinearLayout) rootView);
  }
}
