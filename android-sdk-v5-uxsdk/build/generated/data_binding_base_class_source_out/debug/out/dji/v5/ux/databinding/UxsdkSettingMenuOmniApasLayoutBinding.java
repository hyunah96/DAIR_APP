// Generated by view binder compiler. Do not edit!
package dji.v5.ux.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import dji.v5.ux.R;
import dji.v5.ux.obstacle.view.FixedEnableTabLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class UxsdkSettingMenuOmniApasLayoutBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final TextView omniApasDesc;

  @NonNull
  public final FixedEnableTabLayout omniApasTab;

  @NonNull
  public final TextView omniApasTitle;

  private UxsdkSettingMenuOmniApasLayoutBinding(@NonNull View rootView,
      @NonNull TextView omniApasDesc, @NonNull FixedEnableTabLayout omniApasTab,
      @NonNull TextView omniApasTitle) {
    this.rootView = rootView;
    this.omniApasDesc = omniApasDesc;
    this.omniApasTab = omniApasTab;
    this.omniApasTitle = omniApasTitle;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static UxsdkSettingMenuOmniApasLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.uxsdk_setting_menu_omni_apas_layout, parent);
    return bind(parent);
  }

  @NonNull
  public static UxsdkSettingMenuOmniApasLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.omni_apas_desc;
      TextView omniApasDesc = ViewBindings.findChildViewById(rootView, id);
      if (omniApasDesc == null) {
        break missingId;
      }

      id = R.id.omni_apas_tab;
      FixedEnableTabLayout omniApasTab = ViewBindings.findChildViewById(rootView, id);
      if (omniApasTab == null) {
        break missingId;
      }

      id = R.id.omni_apas_title;
      TextView omniApasTitle = ViewBindings.findChildViewById(rootView, id);
      if (omniApasTitle == null) {
        break missingId;
      }

      return new UxsdkSettingMenuOmniApasLayoutBinding(rootView, omniApasDesc, omniApasTab,
          omniApasTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}