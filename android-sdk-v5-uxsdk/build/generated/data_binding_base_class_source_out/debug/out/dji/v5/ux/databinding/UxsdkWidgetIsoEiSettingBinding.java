// Generated by view binder compiler. Do not edit!
package dji.v5.ux.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import dji.v5.ux.R;
import dji.v5.ux.core.ui.HorizontalSeekBar;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class UxsdkWidgetIsoEiSettingBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final ImageView buttonIsoAuto;

  @NonNull
  public final FrameLayout seekBarView;

  @NonNull
  public final HorizontalSeekBar seekbarEi;

  @NonNull
  public final HorizontalSeekBar seekbarIso;

  @NonNull
  public final LinearLayout seekbarIsoLayout;

  @NonNull
  public final TextView textviewIsoTitle;

  private UxsdkWidgetIsoEiSettingBinding(@NonNull View rootView, @NonNull ImageView buttonIsoAuto,
      @NonNull FrameLayout seekBarView, @NonNull HorizontalSeekBar seekbarEi,
      @NonNull HorizontalSeekBar seekbarIso, @NonNull LinearLayout seekbarIsoLayout,
      @NonNull TextView textviewIsoTitle) {
    this.rootView = rootView;
    this.buttonIsoAuto = buttonIsoAuto;
    this.seekBarView = seekBarView;
    this.seekbarEi = seekbarEi;
    this.seekbarIso = seekbarIso;
    this.seekbarIsoLayout = seekbarIsoLayout;
    this.textviewIsoTitle = textviewIsoTitle;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static UxsdkWidgetIsoEiSettingBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.uxsdk_widget_iso_ei_setting, parent);
    return bind(parent);
  }

  @NonNull
  public static UxsdkWidgetIsoEiSettingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_iso_auto;
      ImageView buttonIsoAuto = ViewBindings.findChildViewById(rootView, id);
      if (buttonIsoAuto == null) {
        break missingId;
      }

      id = R.id.seek_bar_view;
      FrameLayout seekBarView = ViewBindings.findChildViewById(rootView, id);
      if (seekBarView == null) {
        break missingId;
      }

      id = R.id.seekbar_ei;
      HorizontalSeekBar seekbarEi = ViewBindings.findChildViewById(rootView, id);
      if (seekbarEi == null) {
        break missingId;
      }

      id = R.id.seekbar_iso;
      HorizontalSeekBar seekbarIso = ViewBindings.findChildViewById(rootView, id);
      if (seekbarIso == null) {
        break missingId;
      }

      id = R.id.seekbar_iso_layout;
      LinearLayout seekbarIsoLayout = ViewBindings.findChildViewById(rootView, id);
      if (seekbarIsoLayout == null) {
        break missingId;
      }

      id = R.id.textview_iso_title;
      TextView textviewIsoTitle = ViewBindings.findChildViewById(rootView, id);
      if (textviewIsoTitle == null) {
        break missingId;
      }

      return new UxsdkWidgetIsoEiSettingBinding(rootView, buttonIsoAuto, seekBarView, seekbarEi,
          seekbarIso, seekbarIsoLayout, textviewIsoTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
