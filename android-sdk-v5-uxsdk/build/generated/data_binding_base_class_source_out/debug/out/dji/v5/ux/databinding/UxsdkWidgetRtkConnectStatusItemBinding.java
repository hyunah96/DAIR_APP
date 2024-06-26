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

public final class UxsdkWidgetRtkConnectStatusItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView connectSignalIv;

  @NonNull
  public final TextView connectStatusBottomDivider;

  @NonNull
  public final ImageView connectStatusIv;

  @NonNull
  public final TextView stationNameTv;

  private UxsdkWidgetRtkConnectStatusItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView connectSignalIv, @NonNull TextView connectStatusBottomDivider,
      @NonNull ImageView connectStatusIv, @NonNull TextView stationNameTv) {
    this.rootView = rootView;
    this.connectSignalIv = connectSignalIv;
    this.connectStatusBottomDivider = connectStatusBottomDivider;
    this.connectStatusIv = connectStatusIv;
    this.stationNameTv = stationNameTv;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static UxsdkWidgetRtkConnectStatusItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static UxsdkWidgetRtkConnectStatusItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.uxsdk_widget_rtk_connect_status_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static UxsdkWidgetRtkConnectStatusItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.connect_signal_iv;
      ImageView connectSignalIv = ViewBindings.findChildViewById(rootView, id);
      if (connectSignalIv == null) {
        break missingId;
      }

      id = R.id.connect_status_bottom_divider;
      TextView connectStatusBottomDivider = ViewBindings.findChildViewById(rootView, id);
      if (connectStatusBottomDivider == null) {
        break missingId;
      }

      id = R.id.connect_status_iv;
      ImageView connectStatusIv = ViewBindings.findChildViewById(rootView, id);
      if (connectStatusIv == null) {
        break missingId;
      }

      id = R.id.station_name_tv;
      TextView stationNameTv = ViewBindings.findChildViewById(rootView, id);
      if (stationNameTv == null) {
        break missingId;
      }

      return new UxsdkWidgetRtkConnectStatusItemBinding((ConstraintLayout) rootView,
          connectSignalIv, connectStatusBottomDivider, connectStatusIv, stationNameTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
