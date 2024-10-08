// Generated by view binder compiler. Do not edit!
package dji.v5.ux.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import dji.v5.ux.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class UxsdkDialogFlyZoneBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final CheckBox all;

  @NonNull
  public final CheckBox auth;

  @NonNull
  public final Button authColor;

  @NonNull
  public final Button customUnlockColor;

  @NonNull
  public final View customUnlockSeparator;

  @NonNull
  public final Switch customUnlockSwitch;

  @NonNull
  public final Button customUnlockSync;

  @NonNull
  public final CheckBox enhancedWarning;

  @NonNull
  public final Button enhancedWarningColor;

  @NonNull
  public final TextView maxHeight;

  @NonNull
  public final Button maxHeightColor;

  @NonNull
  public final CheckBox restricted;

  @NonNull
  public final Button restrictedColor;

  @NonNull
  public final Button selfUnlockColor;

  @NonNull
  public final TextView selfUnlocked;

  @NonNull
  public final CheckBox warning;

  @NonNull
  public final Button warningColor;

  private UxsdkDialogFlyZoneBinding(@NonNull View rootView, @NonNull CheckBox all,
      @NonNull CheckBox auth, @NonNull Button authColor, @NonNull Button customUnlockColor,
      @NonNull View customUnlockSeparator, @NonNull Switch customUnlockSwitch,
      @NonNull Button customUnlockSync, @NonNull CheckBox enhancedWarning,
      @NonNull Button enhancedWarningColor, @NonNull TextView maxHeight,
      @NonNull Button maxHeightColor, @NonNull CheckBox restricted, @NonNull Button restrictedColor,
      @NonNull Button selfUnlockColor, @NonNull TextView selfUnlocked, @NonNull CheckBox warning,
      @NonNull Button warningColor) {
    this.rootView = rootView;
    this.all = all;
    this.auth = auth;
    this.authColor = authColor;
    this.customUnlockColor = customUnlockColor;
    this.customUnlockSeparator = customUnlockSeparator;
    this.customUnlockSwitch = customUnlockSwitch;
    this.customUnlockSync = customUnlockSync;
    this.enhancedWarning = enhancedWarning;
    this.enhancedWarningColor = enhancedWarningColor;
    this.maxHeight = maxHeight;
    this.maxHeightColor = maxHeightColor;
    this.restricted = restricted;
    this.restrictedColor = restrictedColor;
    this.selfUnlockColor = selfUnlockColor;
    this.selfUnlocked = selfUnlocked;
    this.warning = warning;
    this.warningColor = warningColor;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static UxsdkDialogFlyZoneBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.uxsdk_dialog_fly_zone, parent);
    return bind(parent);
  }

  @NonNull
  public static UxsdkDialogFlyZoneBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.all;
      CheckBox all = ViewBindings.findChildViewById(rootView, id);
      if (all == null) {
        break missingId;
      }

      id = R.id.auth;
      CheckBox auth = ViewBindings.findChildViewById(rootView, id);
      if (auth == null) {
        break missingId;
      }

      id = R.id.auth_color;
      Button authColor = ViewBindings.findChildViewById(rootView, id);
      if (authColor == null) {
        break missingId;
      }

      id = R.id.custom_unlock_color;
      Button customUnlockColor = ViewBindings.findChildViewById(rootView, id);
      if (customUnlockColor == null) {
        break missingId;
      }

      id = R.id.custom_unlock_separator;
      View customUnlockSeparator = ViewBindings.findChildViewById(rootView, id);
      if (customUnlockSeparator == null) {
        break missingId;
      }

      id = R.id.custom_unlock_switch;
      Switch customUnlockSwitch = ViewBindings.findChildViewById(rootView, id);
      if (customUnlockSwitch == null) {
        break missingId;
      }

      id = R.id.custom_unlock_sync;
      Button customUnlockSync = ViewBindings.findChildViewById(rootView, id);
      if (customUnlockSync == null) {
        break missingId;
      }

      id = R.id.enhanced_warning;
      CheckBox enhancedWarning = ViewBindings.findChildViewById(rootView, id);
      if (enhancedWarning == null) {
        break missingId;
      }

      id = R.id.enhanced_warning_color;
      Button enhancedWarningColor = ViewBindings.findChildViewById(rootView, id);
      if (enhancedWarningColor == null) {
        break missingId;
      }

      id = R.id.max_height;
      TextView maxHeight = ViewBindings.findChildViewById(rootView, id);
      if (maxHeight == null) {
        break missingId;
      }

      id = R.id.max_height_color;
      Button maxHeightColor = ViewBindings.findChildViewById(rootView, id);
      if (maxHeightColor == null) {
        break missingId;
      }

      id = R.id.restricted;
      CheckBox restricted = ViewBindings.findChildViewById(rootView, id);
      if (restricted == null) {
        break missingId;
      }

      id = R.id.restricted_color;
      Button restrictedColor = ViewBindings.findChildViewById(rootView, id);
      if (restrictedColor == null) {
        break missingId;
      }

      id = R.id.self_unlock_color;
      Button selfUnlockColor = ViewBindings.findChildViewById(rootView, id);
      if (selfUnlockColor == null) {
        break missingId;
      }

      id = R.id.self_unlocked;
      TextView selfUnlocked = ViewBindings.findChildViewById(rootView, id);
      if (selfUnlocked == null) {
        break missingId;
      }

      id = R.id.warning;
      CheckBox warning = ViewBindings.findChildViewById(rootView, id);
      if (warning == null) {
        break missingId;
      }

      id = R.id.warning_color;
      Button warningColor = ViewBindings.findChildViewById(rootView, id);
      if (warningColor == null) {
        break missingId;
      }

      return new UxsdkDialogFlyZoneBinding(rootView, all, auth, authColor, customUnlockColor,
          customUnlockSeparator, customUnlockSwitch, customUnlockSync, enhancedWarning,
          enhancedWarningColor, maxHeight, maxHeightColor, restricted, restrictedColor,
          selfUnlockColor, selfUnlocked, warning, warningColor);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
