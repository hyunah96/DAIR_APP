// Generated by view binder compiler. Do not edit!
package dji.v5.ux.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import dji.v5.ux.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class UxsdkFpvTopBarWidgetGpsSignalBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView_;

  @NonNull
  public final ImageView ivRtkIcon;

  @NonNull
  public final ImageView ivSatelliteIcon;

  @NonNull
  public final ConstraintLayout rootView;

  @NonNull
  public final TextView tvSatelliteCount;

  private UxsdkFpvTopBarWidgetGpsSignalBinding(@NonNull ConstraintLayout rootView_,
      @NonNull ImageView ivRtkIcon, @NonNull ImageView ivSatelliteIcon,
      @NonNull ConstraintLayout rootView, @NonNull TextView tvSatelliteCount) {
    this.rootView_ = rootView_;
    this.ivRtkIcon = ivRtkIcon;
    this.ivSatelliteIcon = ivSatelliteIcon;
    this.rootView = rootView;
    this.tvSatelliteCount = tvSatelliteCount;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView_;
  }

  @NonNull
  public static UxsdkFpvTopBarWidgetGpsSignalBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static UxsdkFpvTopBarWidgetGpsSignalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.uxsdk_fpv_top_bar_widget_gps_signal, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static UxsdkFpvTopBarWidgetGpsSignalBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.iv_rtk_icon;
      ImageView ivRtkIcon = ViewBindings.findChildViewById(rootView, id);
      if (ivRtkIcon == null) {
        break missingId;
      }

      id = R.id.iv_satellite_icon;
      ImageView ivSatelliteIcon = ViewBindings.findChildViewById(rootView, id);
      if (ivSatelliteIcon == null) {
        break missingId;
      }

      ConstraintLayout rootView_ = (ConstraintLayout) rootView;

      id = R.id.tv_satellite_count;
      TextView tvSatelliteCount = ViewBindings.findChildViewById(rootView, id);
      if (tvSatelliteCount == null) {
        break missingId;
      }

      return new UxsdkFpvTopBarWidgetGpsSignalBinding((ConstraintLayout) rootView, ivRtkIcon,
          ivSatelliteIcon, rootView_, tvSatelliteCount);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}