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

public final class UxsdkRtkGuidanceStepImageLayoutBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  private UxsdkRtkGuidanceStepImageLayoutBinding(@NonNull LinearLayout rootView) {
    this.rootView = rootView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static UxsdkRtkGuidanceStepImageLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static UxsdkRtkGuidanceStepImageLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.uxsdk_rtk_guidance_step_image_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static UxsdkRtkGuidanceStepImageLayoutBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    return new UxsdkRtkGuidanceStepImageLayoutBinding((LinearLayout) rootView);
  }
}