// Generated by view binder compiler. Do not edit!
package dji.v5.ux.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import dji.v5.ux.R;
import dji.v5.ux.core.base.SwitcherCell;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class UxsdkWidgetVisionPositionWidgetLayoutBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final SwitcherCell omniCommonDownwardsSwitcherCell;

  private UxsdkWidgetVisionPositionWidgetLayoutBinding(@NonNull LinearLayout rootView,
      @NonNull SwitcherCell omniCommonDownwardsSwitcherCell) {
    this.rootView = rootView;
    this.omniCommonDownwardsSwitcherCell = omniCommonDownwardsSwitcherCell;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static UxsdkWidgetVisionPositionWidgetLayoutBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static UxsdkWidgetVisionPositionWidgetLayoutBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.uxsdk_widget_vision_position_widget_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static UxsdkWidgetVisionPositionWidgetLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.omni_common_downwards_switcher_cell;
      SwitcherCell omniCommonDownwardsSwitcherCell = ViewBindings.findChildViewById(rootView, id);
      if (omniCommonDownwardsSwitcherCell == null) {
        break missingId;
      }

      return new UxsdkWidgetVisionPositionWidgetLayoutBinding((LinearLayout) rootView,
          omniCommonDownwardsSwitcherCell);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
