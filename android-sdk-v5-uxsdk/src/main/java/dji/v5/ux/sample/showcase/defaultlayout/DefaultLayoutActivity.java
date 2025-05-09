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

package dji.v5.ux.sample.showcase.defaultlayout;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.security.Key;
import java.util.List;
import java.util.concurrent.TimeUnit;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import dji.sdk.keyvalue.converter.DJIValueConverter;
import dji.sdk.keyvalue.converter.SingleValueConverter;
import dji.sdk.keyvalue.key.CameraKey;
import dji.sdk.keyvalue.key.DJIKey;
import dji.sdk.keyvalue.key.DJIKeyInfo;
import dji.sdk.keyvalue.key.FlightControllerKey;
import dji.sdk.keyvalue.key.KeyTools;
import dji.sdk.keyvalue.msdkkeyinfo.KeyCameraModeRange;
import dji.sdk.keyvalue.value.camera.CameraMode;
import dji.sdk.keyvalue.value.camera.LaserMeasureInformation;
import dji.sdk.keyvalue.value.camera.LaserWorkMode;
import dji.sdk.keyvalue.value.camera.LaserWorkModeMsg;
import dji.sdk.keyvalue.value.common.CameraLensType;
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.sdk.keyvalue.value.flightcontroller.ControlChannelMapping;
import dji.sdk.keyvalue.value.gimbal.GimbalMode;
import dji.sdk.keyvalue.value.gimbal.GimbalModeMsg;
import dji.sdk.kmz.value.base.DJIValue;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.common.error.IDJIError;
import dji.v5.common.video.channel.VideoChannelState;
import dji.v5.common.video.channel.VideoChannelType;
import dji.v5.common.video.interfaces.IVideoChannel;
import dji.v5.common.video.interfaces.VideoChannelStateChangeListener;
import dji.v5.common.video.stream.PhysicalDevicePosition;
import dji.v5.common.video.stream.StreamSource;
import dji.sdk.keyvalue.key.ComponentType;
import dji.v5.manager.KeyManager;
import dji.v5.manager.datacenter.MediaDataCenter;
import dji.v5.network.DJINetworkManager;
import dji.v5.network.IDJINetworkStatusListener;
import dji.v5.utils.common.AndUtil;
import dji.v5.utils.common.JsonUtil;
import dji.v5.utils.common.LogUtils;
import dji.v5.ux.R;
import dji.v5.ux.accessory.RTKStartServiceHelper;
import dji.v5.ux.cameracore.util.CameraActionSound;
import dji.v5.ux.cameracore.widget.autoexposurelock.AutoExposureLockWidget;
import dji.v5.ux.cameracore.widget.cameracapture.shootphoto.ShootPhotoEvent;
import dji.v5.ux.cameracore.widget.cameracontrols.CameraControlsWidget;
import dji.v5.ux.cameracore.widget.cameracontrols.lenscontrol.LensControlWidget;
import dji.v5.ux.cameracore.widget.focusexposureswitch.FocusExposureSwitchWidget;
import dji.v5.ux.cameracore.widget.focusmode.FocusModeWidget;
import dji.v5.ux.cameracore.widget.fpvinteraction.FPVInteractionWidget;
import dji.v5.ux.core.base.DJISDKModel;
import dji.v5.ux.core.base.SchedulerProvider;
import dji.v5.ux.core.communication.BroadcastValues;
import dji.v5.ux.core.communication.GlobalPreferenceKeys;
import dji.v5.ux.core.communication.ObservableInMemoryKeyedStore;
import dji.v5.ux.core.communication.UXKeys;
import dji.v5.ux.core.extension.ViewExtensions;
import dji.v5.ux.core.panel.systemstatus.SystemStatusListPanelWidget;
import dji.v5.ux.core.panel.topbar.TopBarPanelWidget;
import dji.v5.ux.core.util.CameraUtil;
import dji.v5.ux.core.util.CommonUtils;
import dji.v5.ux.core.util.DataProcessor;
import dji.v5.ux.core.util.RxUtil;
import dji.v5.ux.core.util.ViewUtil;
import dji.v5.ux.core.widget.fpv.FPVWidget;
import dji.v5.ux.core.widget.hsi.HorizontalSituationIndicatorWidget;
import dji.v5.ux.core.widget.hsi.PrimaryFlightDisplayWidget;
import dji.v5.ux.core.widget.setting.SettingWidget;
import dji.v5.ux.core.widget.simulator.SimulatorIndicatorWidget;
import dji.v5.ux.core.widget.systemstatus.SystemStatusWidget;
import dji.v5.ux.flight.flightparam.DistanceLimitWidgetModel;
import dji.v5.ux.flight.flightparam.FpaView;
import dji.v5.ux.gimbal.GimbalFineTuneWidget;
import dji.v5.ux.map.MapWidget;
import dji.v5.ux.training.simulatorcontrol.SimulatorControlWidget;
import dji.v5.ux.visualcamera.CameraNDVIPanelWidget;
import dji.v5.ux.visualcamera.CameraVisiblePanelWidget;
import dji.v5.ux.visualcamera.zoom.FocalZoomWidget;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import dji.v5.ux.visualcamera.storage.CameraConfigStorageWidgetModel;
import androidx.annotation.NonNull;

import com.airbnb.lottie.L;

import org.greenrobot.eventbus.EventBus;

/**
 * 메인 레이아웃
 */
public class DefaultLayoutActivity extends AppCompatActivity {

    //region Fields
    private final String TAG = LogUtils.getTag(this);


    protected FPVWidget primaryFpvWidget;
    protected FPVInteractionWidget fpvInteractionWidget;
    protected FPVWidget secondaryFPVWidget;
    protected SystemStatusListPanelWidget systemStatusListPanelWidget;
    protected SimulatorControlWidget simulatorControlWidget;
    protected LensControlWidget lensControlWidget;
    protected AutoExposureLockWidget autoExposureLockWidget;
    protected FocusModeWidget focusModeWidget;
    protected FocusExposureSwitchWidget focusExposureSwitchWidget;
    protected CameraControlsWidget cameraControlsWidget;
    protected HorizontalSituationIndicatorWidget horizontalSituationIndicatorWidget;
    protected PrimaryFlightDisplayWidget pfvFlightDisplayWidget;
    protected CameraNDVIPanelWidget ndviCameraPanel;
    protected CameraVisiblePanelWidget visualCameraPanel;
    protected FocalZoomWidget focalZoomWidget;
    protected SettingWidget settingWidget;
    protected MapWidget mapWidget;
    //상단바(기체 모드, 시스템 상태, 시뮬레이션 , 배터리 , 신호 등)
    protected TopBarPanelWidget topBarPanel;
    protected ConstraintLayout fpvParentView;
    private DrawerLayout mDrawerLayout;
    private TextView gimbalAdjustDone;
    //private TextView laserDistance;
    private GimbalFineTuneWidget gimbalFineTuneWidget;
    private PhysicalDevicePosition lastDevicePosition = PhysicalDevicePosition.UNKNOWN;
    private CameraLensType lastLensType = CameraLensType.UNKNOWN;

    private CameraConfigStorageWidgetModel storageWidgetModel;
    //private DistanceLimitWidgetModel widgetModel = new DistanceLimitWidgetModel(DJISDKModel.getInstance(), ObservableInMemoryKeyedStore.getInstance());
    //KeyManager.getInstance().listen(KeyTools.createKey(CameraKey.KeyLaserMeasureInformation), this, (oldValue, newValue) ->


    private DJISDKModel djisdkModel;
    private ObservableInMemoryKeyedStore keyedStore;

    private boolean isConnected = false;

//    static final ComponentType componentType = ComponentType.GIMBAL;
//    static final ComponentType subComponentType = ComponentType.PRODUCT;

//    final DJIKeyInfo<LaserMeasureInformation> KeyLaserMeasureInformation =
//            new DJIKeyInfo<>(componentType.value(),subComponentType.value(),"LaserMeasureInformation", new DJIValueConverter<>(LaserMeasureInformation.class))
//                    .canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);
//

//    static final DJIKeyInfo<LaserWorkMode> KeyLaserWorkMode =
//            new DJIKeyInfo<>(componentType.value(),subComponentType.value(),"LaserWorkMode", new SingleValueConverter<>(LaserWorkMode.class,LaserWorkModeMsg.class))
//                    .canGet(true).canSet(true).canListen(true).canPerformAction(false).setIsEvent(false);

    private CompositeDisposable compositeDisposable;
    private final DataProcessor<CameraSource> cameraSourceProcessor = DataProcessor.create(new CameraSource(PhysicalDevicePosition.UNKNOWN,
            CameraLensType.UNKNOWN));
    private VideoChannelStateChangeListener primaryChannelStateListener = null;
    private VideoChannelStateChangeListener secondaryChannelStateListener = null;
    private final IDJINetworkStatusListener networkStatusListener = isNetworkAvailable -> {
        if (isNetworkAvailable) {
            LogUtils.d(TAG, "isNetworkAvailable=" + true);
            RTKStartServiceHelper.INSTANCE.startRtkService(false);
        }
    };

    //private CheckNetworkState

    //endregion

    //region Lifecycle
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("test","DefaultLayoutActivity onCreate11");

        setContentView(R.layout.uxsdk_activity_default_layout);
        fpvParentView = findViewById(R.id.fpv_holder);
        mDrawerLayout = findViewById(R.id.root_view);
        topBarPanel = findViewById(R.id.panel_top_bar);
        settingWidget = topBarPanel.getSettingWidget();
        primaryFpvWidget = findViewById(R.id.widget_primary_fpv);
        fpvInteractionWidget = findViewById(R.id.widget_fpv_interaction);
        secondaryFPVWidget = findViewById(R.id.widget_secondary_fpv);
        systemStatusListPanelWidget = findViewById(R.id.widget_panel_system_status_list);
        simulatorControlWidget = findViewById(R.id.widget_simulator_control);
        lensControlWidget = findViewById(R.id.widget_lens_control);
        ndviCameraPanel = findViewById(R.id.panel_ndvi_camera);
        //visualCameraPanel 지워야 할 항목
        visualCameraPanel = findViewById(R.id.panel_visual_camera);
        autoExposureLockWidget = findViewById(R.id.widget_auto_exposure_lock);
        focusModeWidget = findViewById(R.id.widget_focus_mode);
        //focusExposureSwitchWidget = findViewById(R.id.widget_focus_exposure_switch);
        pfvFlightDisplayWidget = findViewById(R.id.widget_fpv_flight_display_widget);
        focalZoomWidget = findViewById(R.id.widget_focal_zoom);
        cameraControlsWidget = findViewById(R.id.widget_camera_controls);
        horizontalSituationIndicatorWidget = findViewById(R.id.widget_horizontal_situation_indicator);
        gimbalAdjustDone = findViewById(R.id.fpv_gimbal_ok_btn);
        gimbalFineTuneWidget = findViewById(R.id.setting_menu_gimbal_fine_tune);
        //mapWidget = findViewById(R.id.widget_map);
        //laserDistance = findViewById(R.id.laserDistance);

        storageWidgetModel = new CameraConfigStorageWidgetModel(djisdkModel , keyedStore);

        djisdkModel = DJISDKModel.getInstance();
        keyedStore = ObservableInMemoryKeyedStore.getInstance();



        MediaDataCenter.getInstance().getVideoStreamManager().addStreamSourcesListener(
                sources -> {
                    try {
                        runOnUiThread(() -> updateFPVWidgetSource(sources));
                    } catch (Exception e) {
                        Log.e(TAG, "Error updating FPV widget source", e);
                    }
                });

        primaryFpvWidget.setOnFPVStreamSourceListener((devicePosition, lensType) -> {
            try {
                cameraSourceProcessor.onNext(new CameraSource(devicePosition, lensType));
            } catch (Exception e) {
                Log.e(TAG, "Error processing FPV stream source", e);
            }
        });

        initClickListener();
        //laserStateListener();


        //小surfaceView放置在顶部，避免被大的遮挡
        secondaryFPVWidget.setSurfaceViewZOrderOnTop(true);
        secondaryFPVWidget.setSurfaceViewZOrderMediaOverlay(true);

        //지도 부분 업로드
//        try{
//        mapWidget.initAMap(map -> {
//            // map.setOnMapClickListener(latLng -> onViewClick(mapWidget));
//            DJIUiSettings uiSetting = map.getUiSettings();
//            if (uiSetting != null) {
//                Log.d("test","initAMap is not null");
//                uiSetting.setZoomControlsEnabled(false);//hide zoom widget
//            }
//            });
//        }
//        catch (Exception e) {
//            Log.d("test", "error",e);
//        }
//        mapWidget.onCreate(savedInstanceState);
//        getWindow().setBackgroundDrawable(new ColorDrawable(Color.BLACK));




        //实现RTK监测网络，并自动重连机制
        DJINetworkManager.getInstance().addNetworkStatusListener(networkStatusListener);

    }

    private void checkNetwork() {
        if(isConnected){
            Toast.makeText(getApplicationContext(),"인터넷에 연결되어 있지 않으면 FTP서버에 사진을 저장할 수 없음 ",Toast.LENGTH_SHORT);
        }
    }

//    private void laserStateListener() {
//
//        try {
//            KeyManager.getInstance().setValue(KeyTools.createKey(CameraKey.KeyLaserWorkMode), LaserWorkMode.OPEN_ALWAYS, new CommonCallbacks.CompletionCallback() {
//                @Override
//                public void onSuccess() {
//                    Log.d("test", "onsuccess!!!!333");
//                    final DJIKeyInfo<LaserMeasureInformation> KeyLaserMeasureInformation =
//                            new DJIKeyInfo<>(componentType.value(), subComponentType.value(), "LaserMeasureInformation", new DJIValueConverter<>(LaserMeasureInformation.class))
//                                    .canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);
//
//                    var laserCameraKey = KeyManager.getInstance().getValue(KeyTools.createKey(CameraKey.KeyLaserMeasureInformation));
//                    Log.d("test", "laserCameraKey!!!!");
//
//                    //laserDistance.setText(String.valueOf(laserCameraKey.getDistance()));
//
//                    KeyManager.getInstance().listen(KeyTools.createKey(CameraKey.KeyLaserMeasureInformation), this, (oldValue, newValue) ->
//                    {
//                        //여기서 미터값 갱신 해오면서 촬영 이벤트 전달
//                        newValue = KeyManager.getInstance().getValue(KeyTools.createKey(CameraKey.KeyLaserMeasureInformation));
//                        if (newValue != null) {
//
//
//
//                            laserDistance.setText(String.format("%.1f", newValue.getDistance()) + "m");
//
//                            Log.d("test", "laserDistance.setText!!!!" + newValue.getDistance() + "m");
////                            if(newValue.getDistance() == 5.4){
////
////
////                            }
//                        }
//                    });
//                }
//
//
//                @Override
//                public void onFailure(@NonNull IDJIError error) {
//                    Log.d("test", "onFailure!!!!");
//                }
//            });
//        }catch (Exception e){
//            Log.d("test","원인 : "+ e);
//        }
//
//    }




    private void isGimableAdjustClicked(BroadcastValues broadcastValues) {
        if (mDrawerLayout.isDrawerOpen(GravityCompat.END)) {
            mDrawerLayout.closeDrawers();
        }
        horizontalSituationIndicatorWidget.setVisibility(View.GONE);
        if (gimbalFineTuneWidget != null) {
            gimbalFineTuneWidget.setVisibility(View.VISIBLE);
        }
    }

    private void initClickListener() {
        secondaryFPVWidget.setOnClickListener(v -> swapVideoSource());
        initChannelStateListener();

        if (settingWidget != null) {
            settingWidget.setOnClickListener(v -> toggleRightDrawer());
        }

        // Setup top bar state callbacks
        SystemStatusWidget systemStatusWidget = topBarPanel.getSystemStatusWidget();
        if (systemStatusWidget != null) {
            systemStatusWidget.setOnClickListener(v -> ViewExtensions.toggleVisibility(systemStatusListPanelWidget));
        }

        SimulatorIndicatorWidget simulatorIndicatorWidget = topBarPanel.getSimulatorIndicatorWidget();
        if (simulatorIndicatorWidget != null) {
            simulatorIndicatorWidget.setOnClickListener(v -> ViewExtensions.toggleVisibility(simulatorControlWidget));
        }
        gimbalAdjustDone.setOnClickListener(view -> {
            horizontalSituationIndicatorWidget.setVisibility(View.VISIBLE);
            if (gimbalFineTuneWidget != null) {
                gimbalFineTuneWidget.setVisibility(View.GONE);
            }

        });
    }




    private void toggleRightDrawer() {
        mDrawerLayout.openDrawer(GravityCompat.END);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        //mapWidget.onDestroy();
        MediaDataCenter.getInstance().getVideoStreamManager().clearAllStreamSourcesListeners();
        removeChannelStateListener();
        DJINetworkManager.getInstance().removeNetworkStatusListener(networkStatusListener);

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("test","DefaultLayoutActivity onResume");
        Toast.makeText(getApplicationContext(), "테스트입니다",Toast.LENGTH_SHORT).show();
        //mapWidget.onResume();
        compositeDisposable = new CompositeDisposable();
        compositeDisposable.add(systemStatusListPanelWidget.closeButtonPressed()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(pressed -> {
                            if (pressed) {
                                ViewExtensions.hide(systemStatusListPanelWidget);
                            }
                        },
                        throwable -> {
                            Log.d("test","test");
                        }
                ));
        compositeDisposable.add(simulatorControlWidget.getUIStateUpdates()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(simulatorControlWidgetState -> {
                            if (simulatorControlWidgetState instanceof SimulatorControlWidget.UIState.VisibilityUpdated) {
                                if (((SimulatorControlWidget.UIState.VisibilityUpdated) simulatorControlWidgetState).isVisible()) {
                                    hideOtherPanels(simulatorControlWidget);
                                }
                            }
                        },
                        error -> Log.d("test","simulatorControlWidgetState error")));
        compositeDisposable.add(cameraSourceProcessor.toFlowable()
                .observeOn(SchedulerProvider.io())
                .throttleLast(500, TimeUnit.MILLISECONDS)
                .subscribeOn(SchedulerProvider.io())
                .subscribe(result -> runOnUiThread(() -> onCameraSourceUpdated(result.devicePosition, result.lensType)),
                        error -> Log.d("test","camera source error"))
        );
        compositeDisposable.add(ObservableInMemoryKeyedStore.getInstance()
                .addObserver(UXKeys.create(GlobalPreferenceKeys.GIMBAL_ADJUST_CLICKED))
                .observeOn(SchedulerProvider.ui())
                .subscribe(this::isGimableAdjustClicked, RxUtil.logErrorConsumer("test","test")));
        ViewUtil.setKeepScreen(this, true);


    };

    @Override
    protected void onPause() {
        if (compositeDisposable != null) {
            compositeDisposable.dispose();
            compositeDisposable = null;
        }
        //mapWidget.onPause();
        super.onPause();
        ViewUtil.setKeepScreen(this, false);
    }
    //endregion

    private void hideOtherPanels(@Nullable View widget) {
        View[] panels = {
                simulatorControlWidget
        };

        for (View panel : panels) {
            if (widget != panel) {
                panel.setVisibility(View.GONE);
            }
        }
    }

    private void updateFPVWidgetSource(List<StreamSource> streamSources) {
        LogUtils.i(TAG, JsonUtil.toJson(streamSources));
        if (streamSources == null) {
            return;
        }

        //没有数据
        if (streamSources.isEmpty()) {
            secondaryFPVWidget.setVisibility(View.GONE);
            return;
        }

        //仅一路数据
        if (streamSources.size() == 1) {
            //여기서 위젯 표시 여부, 소스 및 채널이 위젯에 들어가기만 하면 됩니다.
            secondaryFPVWidget.setVisibility(View.GONE);
            return;
        }
        secondaryFPVWidget.setVisibility(View.VISIBLE);
    }

    private void initChannelStateListener() {
        IVideoChannel primaryChannel =
                MediaDataCenter.getInstance().getVideoStreamManager().getAvailableVideoChannel(VideoChannelType.PRIMARY_STREAM_CHANNEL);
        IVideoChannel secondaryChannel =
                MediaDataCenter.getInstance().getVideoStreamManager().getAvailableVideoChannel(VideoChannelType.SECONDARY_STREAM_CHANNEL);
        if (primaryChannel != null) {
            primaryChannelStateListener = (from, to) -> {
                StreamSource primaryStreamSource = primaryChannel.getStreamSource();
                if (VideoChannelState.ON == to && primaryStreamSource != null) {
                    runOnUiThread(() -> primaryFpvWidget.updateVideoSource(primaryStreamSource, VideoChannelType.PRIMARY_STREAM_CHANNEL));
                }
            };
            primaryChannel.addVideoChannelStateChangeListener(primaryChannelStateListener);
        }
        if (secondaryChannel != null) {
            secondaryChannelStateListener = (from, to) -> {
                StreamSource secondaryStreamSource = secondaryChannel.getStreamSource();
                if (VideoChannelState.ON == to && secondaryStreamSource != null) {
                    runOnUiThread(() -> secondaryFPVWidget.updateVideoSource(secondaryStreamSource, VideoChannelType.SECONDARY_STREAM_CHANNEL));
                }
            };
            secondaryChannel.addVideoChannelStateChangeListener(secondaryChannelStateListener);
        }
    }

    private void removeChannelStateListener() {
        IVideoChannel primaryChannel =
                MediaDataCenter.getInstance().getVideoStreamManager().getAvailableVideoChannel(VideoChannelType.PRIMARY_STREAM_CHANNEL);
        IVideoChannel secondaryChannel =
                MediaDataCenter.getInstance().getVideoStreamManager().getAvailableVideoChannel(VideoChannelType.SECONDARY_STREAM_CHANNEL);
        if (primaryChannel != null) {
            primaryChannel.removeVideoChannelStateChangeListener(primaryChannelStateListener);
        }
        if (secondaryChannel != null) {
            secondaryChannel.removeVideoChannelStateChangeListener(secondaryChannelStateListener);
        }
    }


    private void onCameraSourceUpdated(PhysicalDevicePosition devicePosition, CameraLensType lensType) {
        LogUtils.i(TAG, devicePosition, lensType);
        if (devicePosition == lastDevicePosition && lensType == lastLensType){
            return;
        }
        lastDevicePosition = devicePosition;
        lastLensType = lensType;
        ComponentIndexType cameraIndex = CameraUtil.getCameraIndex(devicePosition);
        updateViewVisibility(devicePosition, lensType);
        updateInteractionEnabled();
        //활성화하거나 표시할 필요가 없는 경우 전환할 필요가 없습니다.
        if (fpvInteractionWidget.isInteractionEnabled()) {
            fpvInteractionWidget.updateCameraSource(cameraIndex, lensType);
            fpvInteractionWidget.updateGimbalIndex(CommonUtils.getGimbalIndex(devicePosition));
        }
        if (lensControlWidget.getVisibility() == View.VISIBLE) {
            lensControlWidget.updateCameraSource(cameraIndex, lensType);
        }
        if (ndviCameraPanel.getVisibility() == View.VISIBLE) {
            ndviCameraPanel.updateCameraSource(cameraIndex, lensType);
        }
        if (visualCameraPanel.getVisibility() == View.VISIBLE) {
            visualCameraPanel.updateCameraSource(cameraIndex, lensType);
        }
        if (autoExposureLockWidget.getVisibility() == View.VISIBLE) {
            autoExposureLockWidget.updateCameraSource(cameraIndex, lensType);
        }
        if (focusModeWidget.getVisibility() == View.VISIBLE) {
            Log.d("test","wide");
            focusModeWidget.updateCameraSource(cameraIndex, lensType);
        }
//        if (focusExposureSwitchWidget.getVisibility() == View.VISIBLE) {
//            focusExposureSwitchWidget.updateCameraSource(cameraIndex, lensType);
//        }
        if (cameraControlsWidget.getVisibility() == View.VISIBLE) {
            cameraControlsWidget.updateCameraSource(cameraIndex, lensType);
        }
        //zoom
        if (focalZoomWidget.getVisibility() == View.VISIBLE) {
            Log.d("test","zoom");
            focalZoomWidget.updateCameraSource(cameraIndex, lensType);
        }
        //LRF
        //if()
        if (horizontalSituationIndicatorWidget.getVisibility() == View.VISIBLE) {
            horizontalSituationIndicatorWidget.updateCameraSource(cameraIndex, lensType);
        }
    }

    private void updateViewVisibility(PhysicalDevicePosition devicePosition, CameraLensType lensType) {
        //FPV에서만 표시됨
        pfvFlightDisplayWidget.setVisibility(devicePosition == PhysicalDevicePosition.NOSE ? View.VISIBLE : View.INVISIBLE);

        //아래에 표시되지 않음 fpv
        lensControlWidget.setVisibility(devicePosition == PhysicalDevicePosition.NOSE ? View.INVISIBLE : View.VISIBLE);
        ndviCameraPanel.setVisibility(devicePosition == PhysicalDevicePosition.NOSE ? View.INVISIBLE : View.VISIBLE);
        visualCameraPanel.setVisibility(devicePosition == PhysicalDevicePosition.NOSE ? View.INVISIBLE : View.VISIBLE);
        autoExposureLockWidget.setVisibility(devicePosition == PhysicalDevicePosition.NOSE ? View.INVISIBLE : View.VISIBLE);
        focusModeWidget.setVisibility(devicePosition == PhysicalDevicePosition.NOSE ? View.INVISIBLE : View.VISIBLE);
        //focusExposureSwitchWidget.setVisibility(devicePosition == PhysicalDevicePosition.NOSE ? View.INVISIBLE : View.VISIBLE);
        cameraControlsWidget.setVisibility(devicePosition == PhysicalDevicePosition.NOSE ? View.INVISIBLE : View.VISIBLE);
        focalZoomWidget.setVisibility(devicePosition == PhysicalDevicePosition.NOSE ? View.INVISIBLE : View.VISIBLE);
        horizontalSituationIndicatorWidget.setSimpleModeEnable(devicePosition != PhysicalDevicePosition.NOSE);

        //부분 렌즈로만 표시됨
        ndviCameraPanel.setVisibility(CameraUtil.isSupportForNDVI(lensType) ? View.VISIBLE : View.INVISIBLE);
    }

    /**
     * Swap the video sources of the FPV and secondary FPV widgets.
     */
    private void swapVideoSource() {
        VideoChannelType primaryVideoChannel = primaryFpvWidget.getVideoChannelType();
        StreamSource primaryStreamSource = primaryFpvWidget.getStreamSource();
        VideoChannelType secondaryVideoChannel = secondaryFPVWidget.getVideoChannelType();
        StreamSource secondaryStreamSource = secondaryFPVWidget.getStreamSource();
        //두 소스가 모두 있는 경우에만 전환합니다.
        if (secondaryStreamSource != null && primaryStreamSource != null) {
            primaryFpvWidget.updateVideoSource(secondaryStreamSource, secondaryVideoChannel);
            secondaryFPVWidget.updateVideoSource(primaryStreamSource, primaryVideoChannel);
        }
    }

    private void updateInteractionEnabled() {
        StreamSource newPrimaryStreamSource = primaryFpvWidget.getStreamSource();
        fpvInteractionWidget.setInteractionEnabled(false);
        if (newPrimaryStreamSource != null) {
            fpvInteractionWidget.setInteractionEnabled(newPrimaryStreamSource.getPhysicalDevicePosition() != PhysicalDevicePosition.NOSE);
        }
    }

    private static class CameraSource {
        PhysicalDevicePosition devicePosition;
        CameraLensType lensType;

        public CameraSource(PhysicalDevicePosition devicePosition, CameraLensType lensType) {
            this.devicePosition = devicePosition;
            this.lensType = lensType;
        }
    }

    @Override
    public void onBackPressed() {
        if (mDrawerLayout.isDrawerOpen(GravityCompat.END)) {
            mDrawerLayout.closeDrawers();
        } else {
            super.onBackPressed();
        }
    }
}