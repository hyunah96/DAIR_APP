// Generated by view binder compiler. Do not edit!
package dji.v5.ux.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import dji.v5.ux.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class UxsdkWidgetRadarBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final ImageView imageviewBackwardArrow;

  @NonNull
  public final ImageView imageviewForwardArrow;

  @NonNull
  public final ImageView imageviewLeftArrow;

  @NonNull
  public final ImageView imageviewRadarBackward0;

  @NonNull
  public final ImageView imageviewRadarBackward1;

  @NonNull
  public final ImageView imageviewRadarBackward2;

  @NonNull
  public final ImageView imageviewRadarBackward3;

  @NonNull
  public final ImageView imageviewRadarForward0;

  @NonNull
  public final ImageView imageviewRadarForward1;

  @NonNull
  public final ImageView imageviewRadarForward2;

  @NonNull
  public final ImageView imageviewRadarForward3;

  @NonNull
  public final ImageView imageviewRadarLeft;

  @NonNull
  public final ImageView imageviewRadarRight;

  @NonNull
  public final ImageView imageviewRightArrow;

  @NonNull
  public final ImageView imageviewUpwardObstacle;

  @NonNull
  public final TextView textviewBackwardDistance;

  @NonNull
  public final TextView textviewForwardDistance;

  @NonNull
  public final TextView textviewLeftDistance;

  @NonNull
  public final TextView textviewRightDistance;

  private UxsdkWidgetRadarBinding(@NonNull View rootView, @NonNull ImageView imageviewBackwardArrow,
      @NonNull ImageView imageviewForwardArrow, @NonNull ImageView imageviewLeftArrow,
      @NonNull ImageView imageviewRadarBackward0, @NonNull ImageView imageviewRadarBackward1,
      @NonNull ImageView imageviewRadarBackward2, @NonNull ImageView imageviewRadarBackward3,
      @NonNull ImageView imageviewRadarForward0, @NonNull ImageView imageviewRadarForward1,
      @NonNull ImageView imageviewRadarForward2, @NonNull ImageView imageviewRadarForward3,
      @NonNull ImageView imageviewRadarLeft, @NonNull ImageView imageviewRadarRight,
      @NonNull ImageView imageviewRightArrow, @NonNull ImageView imageviewUpwardObstacle,
      @NonNull TextView textviewBackwardDistance, @NonNull TextView textviewForwardDistance,
      @NonNull TextView textviewLeftDistance, @NonNull TextView textviewRightDistance) {
    this.rootView = rootView;
    this.imageviewBackwardArrow = imageviewBackwardArrow;
    this.imageviewForwardArrow = imageviewForwardArrow;
    this.imageviewLeftArrow = imageviewLeftArrow;
    this.imageviewRadarBackward0 = imageviewRadarBackward0;
    this.imageviewRadarBackward1 = imageviewRadarBackward1;
    this.imageviewRadarBackward2 = imageviewRadarBackward2;
    this.imageviewRadarBackward3 = imageviewRadarBackward3;
    this.imageviewRadarForward0 = imageviewRadarForward0;
    this.imageviewRadarForward1 = imageviewRadarForward1;
    this.imageviewRadarForward2 = imageviewRadarForward2;
    this.imageviewRadarForward3 = imageviewRadarForward3;
    this.imageviewRadarLeft = imageviewRadarLeft;
    this.imageviewRadarRight = imageviewRadarRight;
    this.imageviewRightArrow = imageviewRightArrow;
    this.imageviewUpwardObstacle = imageviewUpwardObstacle;
    this.textviewBackwardDistance = textviewBackwardDistance;
    this.textviewForwardDistance = textviewForwardDistance;
    this.textviewLeftDistance = textviewLeftDistance;
    this.textviewRightDistance = textviewRightDistance;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static UxsdkWidgetRadarBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.uxsdk_widget_radar, parent);
    return bind(parent);
  }

  @NonNull
  public static UxsdkWidgetRadarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageview_backward_arrow;
      ImageView imageviewBackwardArrow = ViewBindings.findChildViewById(rootView, id);
      if (imageviewBackwardArrow == null) {
        break missingId;
      }

      id = R.id.imageview_forward_arrow;
      ImageView imageviewForwardArrow = ViewBindings.findChildViewById(rootView, id);
      if (imageviewForwardArrow == null) {
        break missingId;
      }

      id = R.id.imageview_left_arrow;
      ImageView imageviewLeftArrow = ViewBindings.findChildViewById(rootView, id);
      if (imageviewLeftArrow == null) {
        break missingId;
      }

      id = R.id.imageview_radar_backward_0;
      ImageView imageviewRadarBackward0 = ViewBindings.findChildViewById(rootView, id);
      if (imageviewRadarBackward0 == null) {
        break missingId;
      }

      id = R.id.imageview_radar_backward_1;
      ImageView imageviewRadarBackward1 = ViewBindings.findChildViewById(rootView, id);
      if (imageviewRadarBackward1 == null) {
        break missingId;
      }

      id = R.id.imageview_radar_backward_2;
      ImageView imageviewRadarBackward2 = ViewBindings.findChildViewById(rootView, id);
      if (imageviewRadarBackward2 == null) {
        break missingId;
      }

      id = R.id.imageview_radar_backward_3;
      ImageView imageviewRadarBackward3 = ViewBindings.findChildViewById(rootView, id);
      if (imageviewRadarBackward3 == null) {
        break missingId;
      }

      id = R.id.imageview_radar_forward_0;
      ImageView imageviewRadarForward0 = ViewBindings.findChildViewById(rootView, id);
      if (imageviewRadarForward0 == null) {
        break missingId;
      }

      id = R.id.imageview_radar_forward_1;
      ImageView imageviewRadarForward1 = ViewBindings.findChildViewById(rootView, id);
      if (imageviewRadarForward1 == null) {
        break missingId;
      }

      id = R.id.imageview_radar_forward_2;
      ImageView imageviewRadarForward2 = ViewBindings.findChildViewById(rootView, id);
      if (imageviewRadarForward2 == null) {
        break missingId;
      }

      id = R.id.imageview_radar_forward_3;
      ImageView imageviewRadarForward3 = ViewBindings.findChildViewById(rootView, id);
      if (imageviewRadarForward3 == null) {
        break missingId;
      }

      id = R.id.imageview_radar_left;
      ImageView imageviewRadarLeft = ViewBindings.findChildViewById(rootView, id);
      if (imageviewRadarLeft == null) {
        break missingId;
      }

      id = R.id.imageview_radar_right;
      ImageView imageviewRadarRight = ViewBindings.findChildViewById(rootView, id);
      if (imageviewRadarRight == null) {
        break missingId;
      }

      id = R.id.imageview_right_arrow;
      ImageView imageviewRightArrow = ViewBindings.findChildViewById(rootView, id);
      if (imageviewRightArrow == null) {
        break missingId;
      }

      id = R.id.imageview_upward_obstacle;
      ImageView imageviewUpwardObstacle = ViewBindings.findChildViewById(rootView, id);
      if (imageviewUpwardObstacle == null) {
        break missingId;
      }

      id = R.id.textview_backward_distance;
      TextView textviewBackwardDistance = ViewBindings.findChildViewById(rootView, id);
      if (textviewBackwardDistance == null) {
        break missingId;
      }

      id = R.id.textview_forward_distance;
      TextView textviewForwardDistance = ViewBindings.findChildViewById(rootView, id);
      if (textviewForwardDistance == null) {
        break missingId;
      }

      id = R.id.textview_left_distance;
      TextView textviewLeftDistance = ViewBindings.findChildViewById(rootView, id);
      if (textviewLeftDistance == null) {
        break missingId;
      }

      id = R.id.textview_right_distance;
      TextView textviewRightDistance = ViewBindings.findChildViewById(rootView, id);
      if (textviewRightDistance == null) {
        break missingId;
      }

      return new UxsdkWidgetRadarBinding(rootView, imageviewBackwardArrow, imageviewForwardArrow,
          imageviewLeftArrow, imageviewRadarBackward0, imageviewRadarBackward1,
          imageviewRadarBackward2, imageviewRadarBackward3, imageviewRadarForward0,
          imageviewRadarForward1, imageviewRadarForward2, imageviewRadarForward3,
          imageviewRadarLeft, imageviewRadarRight, imageviewRightArrow, imageviewUpwardObstacle,
          textviewBackwardDistance, textviewForwardDistance, textviewLeftDistance,
          textviewRightDistance);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
