// Generated by view binder compiler. Do not edit!
package dji.v5.ux.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import dji.v5.ux.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class UxsdkSettingMenuHdChannelSelectBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ScrollView scrollView;

  private UxsdkSettingMenuHdChannelSelectBinding(@NonNull ScrollView rootView,
      @NonNull ScrollView scrollView) {
    this.rootView = rootView;
    this.scrollView = scrollView;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static UxsdkSettingMenuHdChannelSelectBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static UxsdkSettingMenuHdChannelSelectBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.uxsdk_setting_menu_hd_channel_select, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static UxsdkSettingMenuHdChannelSelectBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    ScrollView scrollView = (ScrollView) rootView;

    return new UxsdkSettingMenuHdChannelSelectBinding((ScrollView) rootView, scrollView);
  }
}
