// Generated by view binder compiler. Do not edit!
package dji.v5.ux.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import dji.v5.ux.R;
import dji.v5.ux.core.base.DividerConstraintLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class UxsdkSettingMenuPerceptionVpsLayoutBinding implements ViewBinding {
  @NonNull
  private final DividerConstraintLayout rootView;

  @NonNull
  public final TextView settingMenuDescPerceptionDownwards;

  @NonNull
  public final ImageView settingMenuPerceptionPic1;

  private UxsdkSettingMenuPerceptionVpsLayoutBinding(@NonNull DividerConstraintLayout rootView,
      @NonNull TextView settingMenuDescPerceptionDownwards,
      @NonNull ImageView settingMenuPerceptionPic1) {
    this.rootView = rootView;
    this.settingMenuDescPerceptionDownwards = settingMenuDescPerceptionDownwards;
    this.settingMenuPerceptionPic1 = settingMenuPerceptionPic1;
  }

  @Override
  @NonNull
  public DividerConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static UxsdkSettingMenuPerceptionVpsLayoutBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static UxsdkSettingMenuPerceptionVpsLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.uxsdk_setting_menu_perception_vps_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static UxsdkSettingMenuPerceptionVpsLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.setting_menu_desc_perception_downwards;
      TextView settingMenuDescPerceptionDownwards = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuDescPerceptionDownwards == null) {
        break missingId;
      }

      id = R.id.setting_menu_perception_pic_1;
      ImageView settingMenuPerceptionPic1 = ViewBindings.findChildViewById(rootView, id);
      if (settingMenuPerceptionPic1 == null) {
        break missingId;
      }

      return new UxsdkSettingMenuPerceptionVpsLayoutBinding((DividerConstraintLayout) rootView,
          settingMenuDescPerceptionDownwards, settingMenuPerceptionPic1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}