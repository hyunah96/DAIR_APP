// Generated by view binder compiler. Do not edit!
package dji.v5.ux.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
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

public final class UxsdkDialogSimulatorSavePresetBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText editTextPresetName;

  @NonNull
  public final TextView textviewCancelSimulatorDialog;

  @NonNull
  public final TextView textviewSavePreset;

  @NonNull
  public final TextView textviewSavePresetHeader;

  @NonNull
  public final View viewHeaderSeparator;

  private UxsdkDialogSimulatorSavePresetBinding(@NonNull ConstraintLayout rootView,
      @NonNull EditText editTextPresetName, @NonNull TextView textviewCancelSimulatorDialog,
      @NonNull TextView textviewSavePreset, @NonNull TextView textviewSavePresetHeader,
      @NonNull View viewHeaderSeparator) {
    this.rootView = rootView;
    this.editTextPresetName = editTextPresetName;
    this.textviewCancelSimulatorDialog = textviewCancelSimulatorDialog;
    this.textviewSavePreset = textviewSavePreset;
    this.textviewSavePresetHeader = textviewSavePresetHeader;
    this.viewHeaderSeparator = viewHeaderSeparator;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static UxsdkDialogSimulatorSavePresetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static UxsdkDialogSimulatorSavePresetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.uxsdk_dialog_simulator_save_preset, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static UxsdkDialogSimulatorSavePresetBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.edit_text_preset_name;
      EditText editTextPresetName = ViewBindings.findChildViewById(rootView, id);
      if (editTextPresetName == null) {
        break missingId;
      }

      id = R.id.textview_cancel_simulator_dialog;
      TextView textviewCancelSimulatorDialog = ViewBindings.findChildViewById(rootView, id);
      if (textviewCancelSimulatorDialog == null) {
        break missingId;
      }

      id = R.id.textview_save_preset;
      TextView textviewSavePreset = ViewBindings.findChildViewById(rootView, id);
      if (textviewSavePreset == null) {
        break missingId;
      }

      id = R.id.textview_save_preset_header;
      TextView textviewSavePresetHeader = ViewBindings.findChildViewById(rootView, id);
      if (textviewSavePresetHeader == null) {
        break missingId;
      }

      id = R.id.view_header_separator;
      View viewHeaderSeparator = ViewBindings.findChildViewById(rootView, id);
      if (viewHeaderSeparator == null) {
        break missingId;
      }

      return new UxsdkDialogSimulatorSavePresetBinding((ConstraintLayout) rootView,
          editTextPresetName, textviewCancelSimulatorDialog, textviewSavePreset,
          textviewSavePresetHeader, viewHeaderSeparator);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}