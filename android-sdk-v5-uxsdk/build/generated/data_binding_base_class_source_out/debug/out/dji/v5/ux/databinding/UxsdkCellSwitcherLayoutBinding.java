// Generated by view binder compiler. Do not edit!
package dji.v5.ux.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import dji.v5.ux.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class UxsdkCellSwitcherLayoutBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final TextView desc;

  @NonNull
  public final View disableHintView;

  @NonNull
  public final ImageView infoIcon;

  @NonNull
  public final TextView summary;

  @NonNull
  public final TextView title;

  @NonNull
  public final ToggleButton toggleSwitcher;

  private UxsdkCellSwitcherLayoutBinding(@NonNull View rootView, @NonNull TextView desc,
      @NonNull View disableHintView, @NonNull ImageView infoIcon, @NonNull TextView summary,
      @NonNull TextView title, @NonNull ToggleButton toggleSwitcher) {
    this.rootView = rootView;
    this.desc = desc;
    this.disableHintView = disableHintView;
    this.infoIcon = infoIcon;
    this.summary = summary;
    this.title = title;
    this.toggleSwitcher = toggleSwitcher;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static UxsdkCellSwitcherLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.uxsdk_cell_switcher_layout, parent);
    return bind(parent);
  }

  @NonNull
  public static UxsdkCellSwitcherLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.desc;
      TextView desc = ViewBindings.findChildViewById(rootView, id);
      if (desc == null) {
        break missingId;
      }

      id = R.id.disable_hint_view;
      View disableHintView = ViewBindings.findChildViewById(rootView, id);
      if (disableHintView == null) {
        break missingId;
      }

      id = R.id.info_icon;
      ImageView infoIcon = ViewBindings.findChildViewById(rootView, id);
      if (infoIcon == null) {
        break missingId;
      }

      id = R.id.summary;
      TextView summary = ViewBindings.findChildViewById(rootView, id);
      if (summary == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      id = R.id.toggle_switcher;
      ToggleButton toggleSwitcher = ViewBindings.findChildViewById(rootView, id);
      if (toggleSwitcher == null) {
        break missingId;
      }

      return new UxsdkCellSwitcherLayoutBinding(rootView, desc, disableHintView, infoIcon, summary,
          title, toggleSwitcher);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}