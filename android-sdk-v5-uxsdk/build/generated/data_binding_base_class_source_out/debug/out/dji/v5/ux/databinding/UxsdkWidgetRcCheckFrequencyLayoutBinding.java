// Generated by view binder compiler. Do not edit!
package dji.v5.ux.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import dji.v5.ux.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class UxsdkWidgetRcCheckFrequencyLayoutBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button settingMenuRcCheckFrequency;

  @NonNull
  public final View settingMenuRcCheckFrequencyDivider;

  private UxsdkWidgetRcCheckFrequencyLayoutBinding(@NonNull LinearLayout rootView,
      @NonNull Button settingMenuRcCheckFrequency,
      @NonNull View settingMenuRcCheckFrequencyDivider) {
    this.rootView = rootView;
    this.settingMenuRcCheckFrequency = settingMenuRcCheckFrequency;
    this.settingMenuRcCheckFrequencyDivider = settingMenuRcCheckFrequencyDivider;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static UxsdkWidgetRcCheckFrequencyLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static UxsdkWidgetRcCheckFrequencyLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.uxsdk_widget_rc_check_frequency_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static UxsdkWidgetRcCheckFrequencyLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.setting_menu_rc_check_frequency;
      Button settingMenuRcCheckFrequency = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuRcCheckFrequency == null) {
        break missingId;
      }

      id = R.id.setting_menu_rc_check_frequency_divider;
      View settingMenuRcCheckFrequencyDivider = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuRcCheckFrequencyDivider == null) {
        break missingId;
      }

      return new UxsdkWidgetRcCheckFrequencyLayoutBinding((LinearLayout) rootView,
          settingMenuRcCheckFrequency, settingMenuRcCheckFrequencyDivider);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
