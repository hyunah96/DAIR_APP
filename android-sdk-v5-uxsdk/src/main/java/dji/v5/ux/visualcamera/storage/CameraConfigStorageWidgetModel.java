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

package dji.v5.ux.visualcamera.storage;

import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

import org.greenrobot.eventbus.EventBus;

import dji.sdk.keyvalue.key.CameraKey;
import dji.sdk.keyvalue.key.KeyTools;
import dji.sdk.keyvalue.value.camera.CameraColor;
import dji.sdk.keyvalue.value.camera.CameraMode;
import dji.sdk.keyvalue.value.camera.CameraStorageInfo;
import dji.sdk.keyvalue.value.camera.CameraStorageInfos;
import dji.sdk.keyvalue.value.camera.CameraStorageLocation;
import dji.sdk.keyvalue.value.camera.CameraStorageState;
import dji.sdk.keyvalue.value.camera.PhotoFileFormat;
import dji.sdk.keyvalue.value.camera.SDCardLoadState;
import dji.sdk.keyvalue.value.camera.VideoFrameRate;
import dji.sdk.keyvalue.value.camera.VideoResolution;
import dji.sdk.keyvalue.value.camera.VideoResolutionFrameRate;
import dji.sdk.keyvalue.value.common.CameraLensType;
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.v5.manager.datacenter.media.MediaFileListData;
import dji.v5.manager.datacenter.media.MediaManager;
import dji.v5.manager.interfaces.IMediaManager;
import dji.v5.ux.core.base.DJISDKModel;
import dji.v5.ux.core.base.ICameraIndex;
import dji.v5.ux.core.base.WidgetModel;
import dji.v5.ux.core.communication.ObservableInMemoryKeyedStore;
import dji.v5.ux.core.module.FlatCameraModule;
import dji.v5.ux.core.util.DataProcessor;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.schedulers.Schedulers;

/**
 * Widget Model for the {@link CameraConfigStorageWidget} used to define
 * the underlying logic and communication
 */
public class CameraConfigStorageWidgetModel extends WidgetModel implements ICameraIndex {

    protected static final int INVALID_AVAILABLE_CAPACITY = -1;

    //region Internal Data
    private final DataProcessor<CameraStorageLocation> storageLocationProcessor;
    private final DataProcessor<CameraStorageInfos> storageInfosProcessor;
    private final DataProcessor<VideoResolutionFrameRate> resolutionAndFrameRateProcessor;
    private final DataProcessor<PhotoFileFormat> photoFileFormatProcessor;
    private final DataProcessor<SDCardLoadState> sdCardState;

    private final DataProcessor<SDCardLoadState> innerStorageState;
    private final DataProcessor<Integer> sdAvailableCaptureCount;
    private final DataProcessor<Integer> innerStorageAvailableCaptureCount;
    private final DataProcessor<Integer> sdCardRecordingTime;
    private final DataProcessor<Integer> innerStorageRecordingTime;
    private final DataProcessor<Integer> availableCapacity;
    private final DataProcessor<CameraColor> cameraColorProcessor;
    //region Public Data
    private final DataProcessor<ImageFormat> imageFormatProcessor;
    //endregion
    private final DataProcessor<CameraStorageState> cameraStorageState;
    private ComponentIndexType cameraIndex = ComponentIndexType.LEFT_OR_MAIN;
    private CameraLensType lensType = CameraLensType.CAMERA_LENS_ZOOM;
    private final FlatCameraModule flatCameraModule;
    private boolean FTPlogin = false;
    //endregion

    //region Constructor
    public CameraConfigStorageWidgetModel(@NonNull DJISDKModel djiSdkModel,
                                          @NonNull ObservableInMemoryKeyedStore keyedStore) {
        super(djiSdkModel, keyedStore);
        storageLocationProcessor = DataProcessor.create(CameraStorageLocation.UNKNOWN);
        resolutionAndFrameRateProcessor = DataProcessor.create(new VideoResolutionFrameRate());
        photoFileFormatProcessor = DataProcessor.create(PhotoFileFormat.UNKNOWN);
        innerStorageState = DataProcessor.create(SDCardLoadState.UNKNOWN);
        sdCardState = DataProcessor.create(SDCardLoadState.UNKNOWN);

        cameraColorProcessor = DataProcessor.create(CameraColor.UNKNOWN);
        availableCapacity = DataProcessor.create(INVALID_AVAILABLE_CAPACITY);
        sdAvailableCaptureCount = DataProcessor.create(INVALID_AVAILABLE_CAPACITY);
        innerStorageAvailableCaptureCount = DataProcessor.create(INVALID_AVAILABLE_CAPACITY);
        sdCardRecordingTime = DataProcessor.create(INVALID_AVAILABLE_CAPACITY);
        innerStorageRecordingTime = DataProcessor.create(INVALID_AVAILABLE_CAPACITY);
        imageFormatProcessor = DataProcessor.create(new ImageFormat(
                CameraMode.UNKNOWN, PhotoFileFormat.UNKNOWN,
                VideoResolution.UNKNOWN, VideoFrameRate.UNKNOWN));
        CameraStorageState cameraSSDStorageState = new CameraStorageState(
                CameraMode.UNKNOWN, CameraStorageLocation.UNKNOWN, SDCardLoadState.UNKNOWN,
                INVALID_AVAILABLE_CAPACITY, INVALID_AVAILABLE_CAPACITY, INVALID_AVAILABLE_CAPACITY);
        storageInfosProcessor = DataProcessor.create(new CameraStorageInfos(CameraStorageLocation.UNKNOWN, new ArrayList<>()));
        //cameraStorageState = DataProcessor.create(cameraSSDStorageState);
        //cameraStorageState = BehaviorSubject.createDefault(cameraSSDStorageState);
        cameraStorageState = DataProcessor.create(cameraSSDStorageState);
        flatCameraModule = new FlatCameraModule();
        addModule(flatCameraModule);
    }
    //endregion

    //region Data

    @NonNull
    public ComponentIndexType getCameraIndex() {
        return cameraIndex;
    }

    @NonNull
    public CameraLensType getLensType() {
        return lensType;
    }

    @Override
    public void updateCameraSource(@NonNull ComponentIndexType cameraIndex, @NonNull CameraLensType lensType) {
        this.cameraIndex = cameraIndex;
        this.lensType = lensType;
        restart();
    }

    /**
     * Get the current image format.
     *
     * @return Flowable for the DataProcessor that user should subscribe to.
     */
    public Flowable<ImageFormat> getImageFormat() {
        return imageFormatProcessor.toFlowable();
    }

    /**
     * 현재 카메라 사진 저장 위치를 가져옴
     *
     * 사용자가 구독해야 하는 데이터에 대한 toFlowable 반환
     */
    public Flowable<CameraStorageState> getCameraStorageState() {
        return cameraStorageState.toFlowable();
    }

    /**
     * Get the current camera color.
     *
     * @return Flowable for the DataProcessor that user should subscribe to.
     */
    public Flowable<CameraColor> getCameraColor() {
        return cameraColorProcessor.toFlowable();
    }
    //endregion


    //region LifeCycle
    @Override
    protected void inSetup() {
        Log.d("test","CameraConfigStorageWidgetModel setup");

        //저장소 변경 감지
        bindDataProcessor(KeyTools.createKey(CameraKey.KeyCameraStorageInfos, cameraIndex), storageInfosProcessor, cameraStorageInfos -> {
            storageLocationProcessor.onNext(cameraStorageInfos.getCurrentStorageType());

            CameraStorageInfo internalInfo = cameraStorageInfos.getCameraStorageInfoByLocation(CameraStorageLocation.INTERNAL);
            if (internalInfo != null) {
                innerStorageState.onNext(internalInfo.getStorageState());
                availableCapacity.onNext(internalInfo.getStorageLeftCapacity());
                innerStorageAvailableCaptureCount.onNext(internalInfo.getAvailablePhotoCount());
                innerStorageRecordingTime.onNext(internalInfo.getAvailableVideoDuration());
            }

            CameraStorageInfo sdcardInfo = cameraStorageInfos.getCameraStorageInfoByLocation(CameraStorageLocation.SDCARD);
            if (sdcardInfo != null) {
                //sd카드 상태
                sdCardState.onNext(sdcardInfo.getStorageState());

                Log.d("test", "sdCardState.getValue() : " + sdCardState.getValue());



                //sd카드 남은 저장공간
                availableCapacity.onNext(sdcardInfo.getStorageLeftCapacity());
                //sd카드에 저장가능한 사진의 수
                sdAvailableCaptureCount.onNext(sdcardInfo.getAvailablePhotoCount());
                //sd카드에 저장가능한 비디오 녹화 시간
                sdCardRecordingTime.onNext(sdcardInfo.getAvailableVideoDuration());
                try {
                    new Handler(Looper.getMainLooper()).postDelayed(() -> sdcardStateListener(), 3000);
                    Log.d("test", "sd카드 상태 : " + sdcardInfo.getStorageState() + " sd카드에 저장가능한 사진의 수 : " + sdcardInfo.getAvailablePhotoCount());
                }catch (Exception e){
                    Log.d("test","catch~ "+ e);
                }
            }
            else {
                Log.d("test","sdcardInfo is null");
            }
        });
        bindDataProcessor(KeyTools.createCameraKey(CameraKey.KeyVideoResolutionFrameRate, cameraIndex, lensType), resolutionAndFrameRateProcessor);
        bindDataProcessor(KeyTools.createCameraKey(CameraKey.KeyPhotoFileFormat, cameraIndex, lensType), photoFileFormatProcessor);
        bindDataProcessor(KeyTools.createKey(CameraKey.KeyCameraColor, cameraIndex), cameraColorProcessor);

    }


    private void sdcardStateListener() {
        sdCardState.toFlowable()
                .distinctUntilChanged()
                .debounce(2000L,TimeUnit.MILLISECONDS)
                .subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                state -> {
                    Log.d("test","state!!");
                    if (state == SDCardLoadState.INSERTED) {
                        if(!FTPlogin) {
                            Log.d("test", "sdcardStateListener : SDCardLoadState.INSERTED");
                            try {
                                new Thread(() -> {
                                    EventBus.getDefault().post(new SDCardInsertedEvent());
                                    FTPlogin = true;
                                }).start();
                            }catch (Exception e){
                                Log.d("test","error .." + e);
                            }
                        }
                    }
                    if (state == SDCardLoadState.NOT_INSERTED) {
                        Log.d("test","setupSDCardStateListener : SDCardLoadState.NOT_INSERTED");
                        if(FTPlogin){
                            EventBus.getDefault().post(new SDCardRemovedEvent());
                            Log.d("test","FTP서버 연결 끝");
                            FTPlogin = false;
                        }
                    }
                },
                error -> Log.d("CameraStorage", "Error in observing SD Card state: " + error)
        );
    }
    @Override
    protected void inCleanup() {
        // do nothing
    }

    @Override
    protected void updateStates() {
        imageFormatProcessor.onNext(new ImageFormat(flatCameraModule.getCameraModeDataProcessor().getValue(),
                photoFileFormatProcessor.getValue(),
                resolutionAndFrameRateProcessor.getValue().getResolution(),
                resolutionAndFrameRateProcessor.getValue().getFrameRate()));
        updateCameraStorageState();
    }
    //endregion

    //region Helpers
    //저장소 변경되는 부분 업데이트
    private void updateCameraStorageState() {
        CameraStorageLocation currentStorageLocation = storageLocationProcessor.getValue();
        if (CameraStorageLocation.UNKNOWN.equals(currentStorageLocation)) {
            return;
        }
        SDCardLoadState sdCardOperationState = null;
        switch (currentStorageLocation) {
            case SDCARD:
                if (!SDCardLoadState.UNKNOWN.equals(sdCardState.getValue())) {
                    Log.d("test","!SDCardLoadState " + sdCardState.getValue());

                    sdCardOperationState = sdCardState.getValue();
                }
                break;
            case INTERNAL:
                if (!SDCardLoadState.UNKNOWN.equals(innerStorageState.getValue())) {
                    sdCardOperationState = innerStorageState.getValue();
                }
                break;
            default:
                break;
        }
        if (sdCardOperationState != null) {
            cameraStorageState.onNext(new CameraStorageState(flatCameraModule.getCameraModeDataProcessor().getValue(),
                    currentStorageLocation,
                    sdCardOperationState,
                    availableCapacity.getValue(),
                    getAvailableCaptureCount(currentStorageLocation),
                    getAvailableRecordingTime(currentStorageLocation)
            ));
        }
    }

    private long getAvailableCaptureCount(CameraStorageLocation storageLocation) {
        switch (storageLocation) {
            case SDCARD:
                return sdAvailableCaptureCount.getValue();
            case INTERNAL:
                return innerStorageAvailableCaptureCount.getValue();
            case UNKNOWN:
            default:
                return INVALID_AVAILABLE_CAPACITY;
        }
    }

    private int getAvailableRecordingTime(CameraStorageLocation storageLocation) {
        switch (storageLocation) {
            case SDCARD:
                return sdCardRecordingTime.getValue();
            case INTERNAL:
                return innerStorageRecordingTime.getValue();
            case UNKNOWN:
            default:
                return INVALID_AVAILABLE_CAPACITY;
        }
    }
    //endregion

    //region States

    /**
     * The image format info
     */
    public static class ImageFormat {
        private final CameraMode cameraMode;
        private final PhotoFileFormat photoFileFormat;
        private final VideoResolution resolution;
        private final VideoFrameRate frameRate;

        protected ImageFormat(@Nullable CameraMode cameraMode,
                              @Nullable PhotoFileFormat photoFileFormat,
                              @Nullable VideoResolution resolution,
                              @Nullable VideoFrameRate frameRate) {
            this.cameraMode = cameraMode;
            this.photoFileFormat = photoFileFormat;
            this.resolution = resolution;
            this.frameRate = frameRate;
        }

        /**
         * Get the current camera mode.
         *
         * @return The current camera mode.
         */
        @Nullable
        public CameraMode getCameraMode() {
            return cameraMode;
        }

        /**
         * Get the current photo file format.
         *
         * @return The current photo file format.
         */
        @Nullable
        public PhotoFileFormat getPhotoFileFormat() {
            return photoFileFormat;
        }

        /**
         * Get the current video resolution.
         *
         * @return The current video resolution.
         */
        @Nullable
        public VideoResolution getResolution() {
            return resolution;
        }

        /**
         * Get the current video frame rate.
         *
         * @return The current video frame rate.
         */
        @Nullable
        public VideoFrameRate getFrameRate() {
            return frameRate;
        }
    }

    /**
     * The camera storage state info.
     */
    public static class CameraStorageState {
        private final CameraMode cameraMode;
        private final int availableCapacity;
        private final CameraStorageLocation storageLocation;
        private final SDCardLoadState storageOperationState;
        private final long availableCaptureCount;
        private final int availableRecordingTime;

        @VisibleForTesting
        protected CameraStorageState(@NonNull CameraMode cameraMode,
                                     @NonNull CameraStorageLocation storageLocation,
                                     @NonNull SDCardLoadState storageOperationState,
                                     int availableCapacity, long availableCaptureCount, int availableRecordingTime) {
            this.cameraMode = cameraMode;
            this.storageLocation = storageLocation;
            this.storageOperationState = storageOperationState;
            this.availableCapacity = availableCapacity;
            this.availableCaptureCount = availableCaptureCount;
            this.availableRecordingTime = availableRecordingTime;
        }

        /**
         * Get the current camera mode.
         *
         * @return The current camera mode.
         */
        @NonNull
        public CameraMode getCameraMode() {
            return cameraMode;
        }

        /**
         * 현재 저장소 위치를 가져옵니다.
         * 현재 저장소 위치를 반환합니다.
         */
        @NonNull
        public CameraStorageLocation getStorageLocation() {
            return storageLocation;
        }

        /**
         * 현재 스토리지 작동 상태를 가져옵니다.
         * 현재 스토리지 작업 상태를 반환합니다.
         */
        @NonNull
        public SDCardLoadState getStorageOperationState() {
            return storageOperationState;
        }

        /**
         * Get the available capacity in the current storage location.
         *
         * @return The available capacity in the current storage location.
         */
        public int getAvailableCapacity() {
            return availableCapacity;
        }

        public int getAvailableRecordingTime() {
            return availableRecordingTime;
        }

        public long getAvailableCaptureCount() {
            return availableCaptureCount;
        }
    }
    //endregion
}
