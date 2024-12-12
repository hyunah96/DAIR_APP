# LRF를 활용한 풍력발전기 촬영 



## 1. MSDK V5 (aircraft:5.8.0) & UX SDK

프로젝트에서 사용할 Matrice 300 RTK , Zenmuse H20/H20T 제품들을 SDK V5 에서 지원하여 해당 버전을 선택



### Supported product list and firmware version

| Product List                                                 | Firmware Version                                             |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| DJI Mavic 3 Enterprise Series DJI RC Pro                     | 05.01.02.03 02.00.02.10                                      |
| Matrice 30 Series DJI RC Plus                                | 05.01.00.00 01.02.03.38                                      |
| Matrice 300 RTK Matrice 300 RTK RC D-RTK 2 Mobile <br/>Station for Matrice Zenmuse H20/H20T Zenmuse<br/>H20N Zenmuse P1 Zenmuse L1 | 04.01.00.00 04.01.01.01 03.01.00.00<br />04.00.00.10 04.01.00.00 03.00.01.04<br />04.00.01.06 |



## 2. Versions

- Android : `Android 10(API Level 29)`
- Java Runtime : `17`
- Kotlin : `1.7.21`
- Gradle : `7.6.2`
- Android Gradle Plugin : `7.4.2`
- minSdkVersion ： `23`
- targetSdkVersion ： `34`



## 3. APP KEY 생성 및 KEY 등록

=================================

SDK Type : Mobile SDK
App Name : DAIR
Software Platform : Android
Package Name : com.dji.dair
App Key : { }
Category : Agricultural applications
Description : DAIR

=================================

```xml
<!--dji sdk key-->
    <meta-data
        android:name="com.dji.sdk.API_KEY"
        android:value="${API_KEY}"/>
<!--dji sdk key-->
```



## 4. 의존성 추가

`APP Manifest.xml`

```xml
<!-- SDK permission requirement -->
<uses-permission android:name="android.permission.BLUETOOTH" />
<uses-permission android:name="android.permission.BLUETOOTH_ADMIN" />
<uses-permission android:name="android.permission.VIBRATE" />
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
<uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION"/>
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
<uses-permission android:name="android.permission.CHANGE_WIFI_STATE" />
<uses-permission android:name="android.permission.RECORD_AUDIO" />
<uses-permission android:name="android.permission.KILL_BACKGROUND_PROCESSES"/>
<uses-permission android:name="android.permission.READ_MEDIA_IMAGES"/>
<uses-permission android:name="android.permission.READ_MEDIA_AUDIO"/>
<uses-permission android:name="android.permission.READ_MEDIA_VIDEO"/>
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
<uses-permission android:name="android.permission.READ_PHONE_STATE" />
```

`UX Manifest.xml`

```xml
<uses-permission android:name="android.permission.VIBRATE" />
<uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION"/>
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
```



## 5. DJI SDK 연동

```kotlin
fun initMobileSDK(appContext: Context) {
    SDKManager.getInstance().init(appContext, object : SDKManagerCallback {
        override fun onRegisterSuccess() {
            Log.d("TAG","onRegisterSuccess")
            lvRegisterState.postValue(Pair(true, null))
        }
        override fun onRegisterFailure(error: IDJIError?) {
            Log.d("TAG","onRegisterFailure")
            lvRegisterState.postValue(Pair(false,error))
        }
        override fun onInitProcess(event: DJISDKInitEvent, totalProcess: Int) {
            Log.d("TAG","onInitProcess")
            lvInitProcess.postValue(Pair(event,totalProcess))
            if(event == DJISDKInitEvent.INITIALIZE_COMPLETE) {
                Log.d("TAG","INITIALIZE_COMPLETE")
                SDKManager.getInstance().registerApp()
            }
        }
        override fun onProductChanged(productId: Int) {
            lvProductChange.postValue(productId)
            Log.d("TAG","onProductChanged")
        }
        override fun onProductConnect(productId: Int) {
            lvProductConnectionState.postValue(Pair(true,productId))
            Log.d("TAG","onProductConnect : $productId")
        }
        override fun onProductDisconnect(productId: Int) {
            lvProductConnectionState.postValue(Pair(false,productId))
            Log.d("TAG","onProductDisconnect")
        }
        override fun onDatabaseDownloadProgress(current: Long, total: Long) {
            lvDBDownloadProgress.postValue(Pair(current,total))
            Log.d("TAG","onDatabaseDownloadProgress")
        }
    })
}
```



## 6. 메인 화면

```java
public class DefaultLayoutActivity extends AppCompatActivity {

    private final String TAG = LogUtils.getTag(this);
    protected FPVWidget primaryFpvWidget;
    protected FPVInteractionWidget fpvInteractionWidget;
    protected FPVWidget secondaryFPVWidget;
    protected SystemStatusListPanelWidget systemStatusListPanelWidget;
  	...
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

      	...
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
```



### 6-1. 드론이 꺼져있을 때 

![image-20240912112929400](/home/hakim/.config/Typora/typora-user-images/image-20240912112929400.png)

### 6-2. 드론이 켜져있을 때 

![image-20240912113145212](/home/hakim/.config/Typora/typora-user-images/image-20240912113145212.png)

### 6-3. SD 카드 삽입 여부에 따른 촬영 활성화 / 비활성화

![image-20240912113201424](/home/hakim/.config/Typora/typora-user-images/image-20240912113201424.png)

```java
 private void updateCameraForegroundResource(@NonNull CameraPhotoState cameraPhotoState, @NonNull CameraPhotoStorageState cameraPhotoStorageState) {
        Drawable foregroundDrawable = updateCameraActionSound(cameraPhotoState);
        if (cameraPhotoStorageState instanceof CameraSDPhotoStorageState) {
            CameraSDPhotoStorageState sdStorageState = (CameraSDPhotoStorageState) cameraPhotoStorageState;
            if (cameraPhotoStorageState.getStorageLocation() == CameraStorageLocation.SDCARD) {
                foregroundDrawable = updateResourceWithStorageInSDCard(sdStorageState);
            } else if (cameraPhotoStorageState.getStorageLocation() == CameraStorageLocation.INTERNAL) {
                foregroundDrawable = updateResourceWithStorageInternal(sdStorageState);
            }
        } else if (cameraPhotoStorageState instanceof CameraSSDPhotoStorageState) {
            CameraSSDPhotoStorageState ssdStorageState = (CameraSSDPhotoStorageState) cameraPhotoStorageState;
            if (ssdStorageState.getStorageOperationState() == SSDOperationState.NOT_FOUND) {
                foregroundDrawable = getSSDStorageIcon(StorageIconState.NOT_INSERTED);
            } else if (ssdStorageState.getStorageOperationState() == SSDOperationState.FULL) {
                foregroundDrawable = getSSDStorageIcon(StorageIconState.FULL);
            }
        }
        storageStatusOverlayImageView.setImageDrawable(foregroundDrawable);
    }
```



## 7.FTP 서버 연결

### 7-1. 저장소 변경 감지  

```java
protected void inSetup() {
    Log.d("TAG","CameraConfigStorageWidgetModel setup");
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
        CameraStorageInfo sdcardInfo = 	cameraStorageInfos.getCameraStorageInfoByLocation(CameraStorageLocation.SDCARD);
        if (sdcardInfo != null) {
            //sd카드 상태
            sdCardState.onNext(sdcardInfo.getStorageState());
            //sd카드 남은 저장공간
            availableCapacity.onNext(sdcardInfo.getStorageLeftCapacity());
            //sd카드에 저장가능한 사진의 수
            sdAvailableCaptureCount.onNext(sdcardInfo.getAvailablePhotoCount());
            //sd카드에 저장가능한 비디오 녹화 시간
            sdCardRecordingTime.onNext(sdcardInfo.getAvailableVideoDuration());
            try {
                new Handler(Looper.getMainLooper()).postDelayed(() -> sdcardStateListener(), 3000);
            }catch (Exception e){
                Log.d("TAG","catch "+ e);
            }
        }
        else {
            Log.d("TAG","sdcardInfo is null");
        }
    });
}
```

### 7-1. SD 카드 장착 여부 확인 

```java
private void sdcardStateListener() {
    sdCardState.toFlowable()
            .distinctUntilChanged()
            .debounce(2000L,TimeUnit.MILLISECONDS)
            .subscribeOn(Schedulers.computation())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
            state -> {
                if (state == SDCardLoadState.INSERTED) {
                    if(!FTPlogin) {
                        Log.d("TAG", "sdcardStateListener : SDCardLoadState.INSERTED");
                        try {
                            new Thread(() -> {
                                EventBus.getDefault().post(new SDCardInsertedEvent());
                                FTPlogin = true;
                            }).start();
                        }catch (Exception e){
                            Log.d("TAG","Exception .." + e);
                        }
                    }
                }
                if (state == SDCardLoadState.NOT_INSERTED) {
                    Log.d("TAG","setupSDCardStateListener : SDCardLoadState.NOT_INSERTED");
                    if(FTPlogin){
                        EventBus.getDefault().post(new SDCardRemovedEvent());
                        FTPlogin = false;
                    }
                }
            },
            error -> Log.d("TAG", "Error in observing SD Card state: " + error)
    );
}
```

### 7-2. FTP 서버 연결 

```java
public void connectFTP() throws IOException {
    if(!ftp_connected) {
        try {
            ftpClient = new FTPClient();
            ftpClient.connect(server, port);
            int reply = ftpClient.getReplyCode();
            if(FTPReply.isPositiveCompletion(reply)){
                ftpClient.login(user,password);
                ftp_connected = true;
            }
            else {
                ftpClient.disconnect();
                ftp_connected = false;
                Log.d("TAG","FTP 로그인 실패 연결 코드 : "+ reply);
            }
        } catch (Exception e) {
            if (ftpClient.isConnected()) {
                Log.e("TAG", "connectFTP catch : ", e);
                ftpClient.disconnect();
            }
            Log.e("TAG", "connectFTP Error : ", e);
        }
    }
}
```

### 7-3. 특정 거리값 감지

```java
private void laserStateListener() {
    try {
        KeyManager.getInstance().setValue(KeyTools.createKey(CameraKey.KeyLaserWorkMode), LaserWorkMode.OPEN_ALWAYS, new CommonCallbacks.CompletionCallback() {
            @Override
            public void onSuccess() {
                final DJIKeyInfo<LaserMeasureInformation> KeyLaserMeasureInformation =
                        new DJIKeyInfo<>(componentType.value(), subComponentType.value(), "LaserMeasureInformation", new DJIValueConverter<>(LaserMeasureInformation.class))
                                .canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false);

                var laserCameraKey = KeyManager.getInstance().getValue(KeyTools.createKey(CameraKey.KeyLaserMeasureInformation));
                KeyManager.getInstance().listen(KeyTools.createKey(CameraKey.KeyLaserMeasureInformation), 
				this, (oldValue, newValue) -> {
                    newValue = 	KeyManager.getInstance().getValue
								(KeyTools.createKey(CameraKey.KeyLaserMeasureInformation));
                    if (newValue != null) {
                        BigDecimal bd = new BigDecimal(newValue.getDistance());
                        	laserDistance.setText(bd.setScale(1 , BigDecimal.ROUND_FLOOR) + "m");
                        double distance = Double.parseDouble
							(String.valueOf(bd.setScale(2, BigDecimal.ROUND_HALF_UP)));

                        if(distance == 5.4){
                            //촬영
                            actionOnShootingPhoto();
                        }
                    }
                });
            }
            @Override
            public void onFailure(@NonNull IDJIError error) {
                Log.d("TAG", "onFailure");
            }
        });
    }catch (Exception e){
        Log.d("TAG","LaserWorkMode CommonCallbacks.CompletionCallback() error : "+ e);
    }
}
```

### 7-4. 촬영 이벤트 감지

```java
@Subscribe(threadMode = ThreadMode.MAIN)
public void shootPhotoEvent(ShootPhotoEvent shootPhotoEvent) {
    IMediaManager mediaManager = MediaDataCenter.getInstance().getMediaManager();
    mediaManager.addMediaFileListStateListener(new MediaFileListStateListener() {
        @Override
        public void onUpdate(MediaFileListState mediaFileListState) {
            Log.d("TAG", "onUpdate ");
            pollForMediaFiles(mediaManager);
        }
    });
    MediaFileFilter mediaFileFilter = MediaFileFilter.PHOTO;
    PullMediaFileListParam param = new PullMediaFileListParam.Builder().filter(mediaFileFilter).build();
    mediaManager.pullMediaFileListFromCamera(param, new CommonCallbacks.CompletionCallback() {
        @Override
        public void onSuccess() {
            Log.d("TAG", "onSuccess");
            onUpdate = true;
            pollForMediaFiles(mediaManager);
        }
        @Override
        public void onFailure(@NonNull IDJIError idjiError) {
            Log.d("TAG", "onFailure" + idjiError);
        }
    });
}
```

### 7-5. FTP 서버로 파일 전송

```java
private void handleFiles(MediaFile latestFile){
    Log.d("TAG","handleFiles");
    var savePath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
    File localfile = new File(savePath,latestFile.getFileName());
    try {
        fos = new FileOutputStream(localfile,true);
    } catch (Exception e){
        Log.d("TAG","file Exception : "+ e);
    }
    latestFile.pullOriginalMediaFileFromCamera(0, new MediaFileDownloadListener() {
        @Override
        public void onStart() {
            Log.d(" TAG","onStart");
        }
        @Override
        public void onProgress(long total, long current) {
            double num = (double) current/total * 100;
            Log.d("TAG","파일명 : " + latestFile.getFileName() + " 다운로드 : " + num);
        }
        @Override
        public void onRealtimeDataUpdate(byte[] data, long position) {
            try {
                fos.write(data);
                fos.flush();
            } catch (IOException e) {
                Log.d("TAG","onRealtimeDataUpdate error : "+ e);
            }
        }
        @Override
        public void onFinish() {
            Log.d("TAG","onFinish");
            if(localfile.exists()) {
                Log.d("TAG","onFinish localfile.exists()");
                uploadFileToFTP(localfile,latestFile.getFileName());
            }
        }
        @Override
        public void onFailure(IDJIError error) {
        }
    });
}
```

### 7-6. FTP 클라이언트 FileZilla 활용

![image-20240912115915343](/home/hakim/.config/Typora/typora-user-images/image-20240912115915343.png)

### 7-7. 사진 촬영 후 서버에 파일이 전송된 모습

![image-20240912115953958](/home/hakim/.config/Typora/typora-user-images/image-20240912115953958.png)

### 7-8. 파일 다운로드

![image-20240912131830180](/home/hakim/.config/Typora/typora-user-images/image-20240912131830180.png)



## 8. 백수읍 풍력단지 9/10 1차 테스트

![KakaoTalk_20240912_132720805_05](/home/hakim/Downloads/KakaoTalk_20240912_132720805_05.jpg)

![KakaoTalk_20240912_132720805_02](/home/hakim/Downloads/KakaoTalk_20240912_132720805_02.jpg)



![KakaoTalk_20240912_132720805_09](/home/hakim/Downloads/KakaoTalk_20240912_132720805_09.jpg)

![KakaoTalk_20240912_132720805_07](/home/hakim/Downloads/KakaoTalk_20240912_132720805_07.jpg)

## 결과물

![DJI_20240910125107_0001_W](/media/hakim/SD_Card/DCIM/DJI_202409101245_001/DJI_20240910125107_0001_W.JPG)

![DJI_20240910125107_0001_Z](/media/hakim/SD_Card/DCIM/DJI_202409101245_001/DJI_20240910125107_0001_Z.JPG)

![DJI_20240910125116_0002_Z](/media/hakim/SD_Card/DCIM/DJI_202409101245_001/DJI_20240910125208_0006_W.JPG)

![DJI_20240910125331_0011_W](/media/hakim/SD_Card/DCIM/DJI_202409101245_001/DJI_20240910125331_0011_W.JPG)

![DJI_20240910125347_0012_Z](/home/hakim/Desktop/workspace/DAIR_APP/image/DJI_20240910125347_0012_Z.JPG)

![DJI_20240910125556_0031_W](/home/hakim/Desktop/workspace/DAIR_APP/image/DJI_20240910125556_0031_W.JPG)

![DJI_20240910125556_0031_Z](/home/hakim/Desktop/workspace/DAIR_APP/image/DJI_20240910125556_0031_Z.JPG)

![DJI_20240910130140_0032_W](/home/hakim/Desktop/workspace/DAIR_APP/image/DJI_20240910130140_0032_W.JPG)

![DJI_20240910130140_0032_Z](/home/hakim/Desktop/workspace/DAIR_APP/image/DJI_20240910130140_0032_Z.JPG)

![DJI_20240910130406_0041_W](/home/hakim/Desktop/workspace/DAIR_APP/image/DJI_20240910130406_0041_W.JPG)

![DJI_20240910130419_0043_Z](/home/hakim/Desktop/workspace/DAIR_APP/image/DJI_20240910130419_0043_Z.JPG)



### M30 레이저 모듈



| 파장                                | 905 nm                                              |
| ----------------------------------- | --------------------------------------------------- |
| 최대 레이저 출력                    | 3.5 mW                                              |
| 단일 펄스 폭                        | 6 ns                                                |
| 측정 정확도                         | ±(0.2 m + D×0.15%)<br />‘D’는 수직 표면까지의 거리. |
| 측정 범위                           | 3~1200 m (0.5 x 12 m 수직 표면 반사율 20%)          |
| 안전 규정 등급                      | Class 1M                                            |
| 노출 한계 (AEL)                     | 304.8 nJ                                            |
| 조리개 참조 값                      | 길이 18 mm, 너비 18 mm (원형 환산 시 지름 20.3 mm)  |
| 5ns 이내 최대 레이저 펄스 출력 파워 | 60.96 W                                             |





M30 LRF 센서의 설계상 3m 이하의 가까운 거리에서는 레이저가 정확하게 반사되지 않아 센서가 데이터를 처리하지 못한다.
DJI M30의 LRF는 주로 멀리 있는 물체의 거리를 측정하기 위해 설계되었기 때문에, 너무 가까운 거리는 측정 불가능할 수 있다.









































































