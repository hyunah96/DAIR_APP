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
import dji.v5.ux.core.ui.component.MaxHeightScrollView;
import dji.v5.ux.core.ui.component.UXRecyclerView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class UxsdkUxNdviStreamSelectionPanelBinding implements ViewBinding {
  @NonNull
  private final View rootView;

  @NonNull
  public final UXRecyclerView narrowBandList;

  @NonNull
  public final TextView narrowBandTv;

  @NonNull
  public final MaxHeightScrollView scrollView;

  @NonNull
  public final TextView streamVegetationIndexTv;

  @NonNull
  public final UXRecyclerView vegetationIndexList;

  private UxsdkUxNdviStreamSelectionPanelBinding(@NonNull View rootView,
      @NonNull UXRecyclerView narrowBandList, @NonNull TextView narrowBandTv,
      @NonNull MaxHeightScrollView scrollView, @NonNull TextView streamVegetationIndexTv,
      @NonNull UXRecyclerView vegetationIndexList) {
    this.rootView = rootView;
    this.narrowBandList = narrowBandList;
    this.narrowBandTv = narrowBandTv;
    this.scrollView = scrollView;
    this.streamVegetationIndexTv = streamVegetationIndexTv;
    this.vegetationIndexList = vegetationIndexList;
  }

  @Override
  @NonNull
  public View getRoot() {
    return rootView;
  }

  @NonNull
  public static UxsdkUxNdviStreamSelectionPanelBinding inflate(@NonNull LayoutInflater inflater,
      @NonNull ViewGroup parent) {
    if (parent == null) {
      throw new NullPointerException("parent");
    }
    inflater.inflate(R.layout.uxsdk_ux_ndvi_stream_selection_panel, parent);
    return bind(parent);
  }

  @NonNull
  public static UxsdkUxNdviStreamSelectionPanelBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.narrow_band_list;
      UXRecyclerView narrowBandList = ViewBindings.findChildViewById(rootView, id);
      if (narrowBandList == null) {
        break missingId;
      }

      id = R.id.narrow_band_tv;
      TextView narrowBandTv = ViewBindings.findChildViewById(rootView, id);
      if (narrowBandTv == null) {
        break missingId;
      }

      id = R.id.scroll_view;
      MaxHeightScrollView scrollView = ViewBindings.findChildViewById(rootView, id);
      if (scrollView == null) {
        break missingId;
      }

      id = R.id.stream_vegetation_index_tv;
      TextView streamVegetationIndexTv = ViewBindings.findChildViewById(rootView, id);
      if (streamVegetationIndexTv == null) {
        break missingId;
      }

      id = R.id.vegetation_index_list;
      UXRecyclerView vegetationIndexList = ViewBindings.findChildViewById(rootView, id);
      if (vegetationIndexList == null) {
        break missingId;
      }

      return new UxsdkUxNdviStreamSelectionPanelBinding(rootView, narrowBandList, narrowBandTv,
          scrollView, streamVegetationIndexTv, vegetationIndexList);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}