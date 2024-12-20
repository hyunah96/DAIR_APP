/*
 * Copyright (c) 2018-2020 DJI
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package dji.v5.ux.cameracore.widget.cameracapture;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import java.util.HashMap;
import java.util.Map;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import dji.sdk.keyvalue.value.camera.CameraMode;
import dji.sdk.keyvalue.value.common.CameraLensType;
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.v5.ux.R;
import dji.v5.ux.cameracore.widget.cameracapture.recordvideo.RecordVideoWidget;
import dji.v5.ux.cameracore.widget.cameracapture.shootphoto.ShootPhotoWidget;
import dji.v5.ux.core.base.DJISDKModel;
import dji.v5.ux.core.base.ICameraIndex;
import dji.v5.ux.core.base.SchedulerProvider;
import dji.v5.ux.core.base.widget.ConstraintLayoutWidget;
import dji.v5.ux.core.communication.ObservableInMemoryKeyedStore;
import dji.v5.ux.core.util.RxUtil;
import dji.v5.ux.visualcamera.storage.CameraConfigStorageWidget;

/**
 * Camera Capture Widget
 * <p>
 * Widget can be used to shoot photo and record video. It reacts to change in {@link CameraMode}
 * It encloses {@link ShootPhotoWidget} and {@link RecordVideoWidget} for respective modes
 */
public class CameraCaptureWidget extends ConstraintLayoutWidget<Object> implements ICameraIndex {

    //region Fields
    private static final String TAG = "CameraCaptureWidget";
    private CameraCaptureWidgetModel widgetModel;
    private Map<CameraMode, View> widgetMap;
    //endregion

    //region Lifecycle
    public CameraCaptureWidget(Context context) {
        super(context);
    }

    public CameraCaptureWidget(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CameraCaptureWidget(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void initView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        Log.d("test","CameraCaptureWidget initView");
        widgetMap = new HashMap<>();
        //현재 편집 모드가 아니면
        if (!isInEditMode()) {
            addViewByMode(CameraMode.PHOTO_NORMAL, new ShootPhotoWidget(context));
            addViewByMode(CameraMode.VIDEO_NORMAL, new RecordVideoWidget(context));
            widgetModel = new CameraCaptureWidgetModel(DJISDKModel.getInstance(), ObservableInMemoryKeyedStore.getInstance());
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        //현재 편집 모드가 아니면
        if (!isInEditMode()) {
            Log.d("test","CameraCaptureWidget setup()");
            widgetModel.setup();
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        //현재 편집 모드가 아니면
        if (!isInEditMode()) {
            widgetModel.cleanup();
        }
        super.onDetachedFromWindow();
    }

    //카메라 모드가 변경되는지 감시하는 메서드\\
    //observeOn 메서드를 사용하여 widgetModel.getCameraMode() 부분을 감시하고
    //변경되면 SchedulerProvider.ui()을 통해
    //UI 스레드로 변경사항을 전달하고 onCameraModeChange를 호출
    @Override
    protected void reactToModelChanges() {
        Log.d("test","카메라 모드 변경 감지 CameraCaptureWidget reactToModelChanges");
        addReaction(
                widgetModel.getCameraMode()
                        .observeOn(SchedulerProvider.ui())
                        .subscribe(
                                this::onCameraModeChange,
                                RxUtil.logErrorConsumer(TAG, "카메라 모드 변경 감지 에러")));

    }

    @NonNull
    @Override
    public String getIdealDimensionRatioString() {
        return getResources().getString(R.string.uxsdk_widget_default_ratio);
    }
    //endregion

    @NonNull
    public ComponentIndexType getCameraIndex() {
        return widgetModel.getCameraIndex();
    }

    @NonNull
    @Override
    public CameraLensType getLensType() {
        return widgetModel.getLensType();
    }

    @Override
    public void updateCameraSource(@NonNull ComponentIndexType cameraIndex, @NonNull CameraLensType lensType) {
        widgetModel.updateCameraSource(cameraIndex, lensType);
        ShootPhotoWidget shootPhotoWidget = getShootPhotoWidget();
        if (shootPhotoWidget != null) {
            shootPhotoWidget.updateCameraSource(cameraIndex, lensType);
        }
        RecordVideoWidget recordVideoWidget = getRecordVideoWidget();
        if (recordVideoWidget != null) {
            recordVideoWidget.updateCameraSource(cameraIndex, lensType);
        }
    }

    //region private helpers
    private void onCameraModeChange(CameraMode cameraMode) {
        Log.d("test","onCameraModeChange");
        for (View view : widgetMap.values()) {
            //촬영 버튼 비활성화
            if (view != null) view.setVisibility(INVISIBLE);
            Log.d("test","촬영 버튼 비활성화");
        }
        View currentView = widgetMap.get(cameraMode);
        if (currentView != null) {
            //촬영 버튼 활성화
            widgetMap.get(cameraMode).setVisibility(VISIBLE);
            Log.d("test","촬영 버튼 활성화");
        }
    }
    //endregion

    //region customizations

    /**
     * Add view to be shown based on camera mode
     *
     * @param cameraMode instance of camera mode
     * @param view       the view to be shown for camera mode
     */
    public void addViewByMode(@NonNull CameraMode cameraMode, @NonNull View view) {
        if (widgetMap.get(cameraMode) != null) {
            removeView(widgetMap.get(cameraMode));
        }
        widgetMap.put(cameraMode, view);
        view.setVisibility(INVISIBLE);
        addView(view);
        ConstraintLayout.LayoutParams lp = new Constraints.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        view.setLayoutParams(lp);
    }

    /**
     * Remove the view based on camera mode
     *
     * @param cameraMode for which the view should be removed
     */
    public void removeViewByMode(@NonNull CameraMode cameraMode) {
        if (widgetMap.get(cameraMode) == null) return;
        removeView(widgetMap.get(cameraMode));
        widgetMap.remove(cameraMode);
    }

    /**
     * Get the view that will be shown based on camera mode
     *
     * @param cameraMode for which the view is shown
     * @return View for the mode
     */
    @Nullable
    public View getViewByMode(@NonNull CameraMode cameraMode) {
        return widgetMap.get(cameraMode);
    }

    /**
     * Get shoot photo widget
     *
     * @return instance of {@link ShootPhotoWidget}
     */
    @Nullable
    public ShootPhotoWidget getShootPhotoWidget() {
        if (widgetMap.get(CameraMode.PHOTO_NORMAL) == null || !(widgetMap.get(CameraMode.PHOTO_NORMAL) instanceof ShootPhotoWidget)) {
            return null;
        }
        return (ShootPhotoWidget) widgetMap.get(CameraMode.PHOTO_NORMAL);
    }

    /**
     * Get record video widget
     *
     * @return instance of {@link RecordVideoWidget}
     */
    @Nullable
    public RecordVideoWidget getRecordVideoWidget() {
        if (widgetMap.get(CameraMode.VIDEO_NORMAL) == null || !(widgetMap.get(CameraMode.VIDEO_NORMAL) instanceof RecordVideoWidget)) {
            return null;
        }
        return (RecordVideoWidget) widgetMap.get(CameraMode.VIDEO_NORMAL);
    }
    //endregion
}
