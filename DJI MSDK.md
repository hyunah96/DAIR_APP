# DJI MSDK 

### V5 SDK가 제공하는 주요 기능

- **파라미터 획득 및 설정**: 페이로드 상태 모니터링, 페이로드 파라미터 설정, 드론 상태 모니터링, 드론 파라미터 설정
- **비행 제어**: 경로 자동 비행, 가상 조이스틱 비행, RTK 위치 설정, 트래킹 비행
- **응용 데이터 처리**: 실시간 스트리밍, MOP 데이터 채널, 미디어 파일 관리, 실시간 포인트 클라우드 데이터 획득
- **추가 기능**: 건강 관리, SD 카드 암호화, 업그레이드 알림, 비행 기록, 네트워크 제어, 백업 링크



------

**트래킹 비행(Tracking Flight)**
DJI 드론의 기능 중 하나로, 드론이 특정 목표물을 자동으로 추적하며 비행하는 기술을 의미한다. 
이 기능을 통해 사용자는 드론이 대상(예: 사람, 차량, 물체 등)을 인식하고, 자동으로 그 대상의 움직임에 맞춰 드론을 비행하도록 설정할 수 있다. 
이를 통해 사용자는 드론을 수동으로 조종하지 않아도 대상이 이동할 때 드론이 따라가며 촬영하거나 모니터링할 수 있다.

**MOP 데이터 채널(MOP Data Channel)** 
DJI SDK V5에서 제공하는 기능 중 하나로, 드론과 모바일 장치 간에 사용자 정의 데이터를 전송할 수 있는 통신 채널을 말한다. 
MOP는 **Mobile SDK OSDK Protocol**의 약자이며, 이 채널을 통해 개발자는 드론 시스템과 모바일 애플리케이션 간에 실시간 데이터를 주고받을 수 있다.

**건강관리(Health Management)** 
드론 및 관련 장비의 상태를 모니터링하고, 잠재적인 문제나 성능 저하를 조기에 감지하여 안전한 비행을 보장하는 시스템이다. 
이 기능은 드론의 하드웨어, 배터리, 센서 등의 주요 부품들의 상태를 실시간으로 추적하고, 사용자에게 경고나 알림을 제공하여 비행 중 발생할 수 있는 위험을 최소화하는 데 도움을 준다.

-----



## 계층 구조

모바일 애플리케이션은 일반적으로 다음과 같은 주요 클래스를 통해 DJI Mobile SDK에 접근한다.

![img](https://terra-1-g.djicdn.com/71a7d383e71a4fb8887a310eb746b47f/msdk/Documentation/V5.2/sdk-architecture-2.png)



1. **SDKManager**:
   - Mobile SDK의 진입점 클래스이며, SDK의 초기화, SDK 등록 및 DJI 하드웨어 제품 연결 이벤트를 관리한다.
2. **KeyTools / KeyManager**:
   - SDK V5 버전에서는 Key를 기반으로 한 파라미터 설정 및 조회 기능 인터페이스를 사용합니다. `KeyTools` 은 Key를 생성하는 진입점 클래스이고, `KeyManager`는 Key를 호출하거나 모니터링하는 진입점 클래스입니다. 대부분의 기능은 해당 Key를 통해 제어할 수 있다. 
     예를 들어 짐벌 회전 제어나 카메라 촬영 및 녹화를 할 수 있다.
3. **MediaDataCenter**:
   - 애플리케이션 데이터 수집 기능의 진입점 클래스이다. `MediaDataCenter`를 통해 원시 스트림 데이터(처리되지 않은 상태의 데이터)관리 클래스와 
     멀티미디어 파일 데이터 관리 클래스에 접근할 수 있다.
4. **WaypointMissionManager**:
   - 웨이포인트 임무 자동 비행의 진입점 클래스이다. 드론이 웨이포인트를 기반으로 자율 비행을 할 수 있도록 제어한다.
5. **VirtualStickManager**:
   - 가상 조이스틱 비행의 진입점 클래스이다. 이 클래스를 사용하면 드론이 가상 조이스틱 제어 모드에 진입하며, 
     해당 모드에서 실시간으로 명령을 전송하여 드론 비행을 제어할 수 있다.
6. **FlightLogManager**:
   - 비행 로그 관리 클래스이다. 모바일 장치에 저장된 로그 경로를 확인할 수 있다.
7. **DeviceHealthManager**:
   - 장치 건강 관리 모듈이다. 이 클래스를 통해 장치의 상태를 실시간으로 확인할 수 있으며, 드론 조종자에게 이를 알린다.

## 미션

스마트 미션을 통해 비행 자동화를 쉽게 구현할 수 있다. 웨이포인트와 웨이포인트 액션을 기반으로 한 **웨이포인트 비행 임무**(WaypointMission)는 
사용자가 미리 정의한 **웨이포인트(비행 경로)**를 따라 드론이 자동으로 비행한다. 이 과정에서 드론이 특정 위치에서 사진을 찍거나, 회전하는 등의 
**웨이포인트 동작**도 설정할 수 있다. 이러한 미션은 `WaypointMissionManager`를 통해 제어 가능하며, 
일반적으로 KMZ 파일을 사용해 비행 경로를 설정할 수 있다. 개발자는 자신만의 알고리즘을 기반으로 `VirtualStickManager`의 인터페이스를 호출하여 
드론을 자율적으로 비행시킬 수 있다.

## DJI Key<T>

```java
class DJIKey<T>
```

*Package : dji.sdk.keyvalue.key*

`DJIKey` 클래스는 DJI Mobile SDK(MSDK)에서 **Key-Value 구조**로 드론의 다양한 하드웨어 모듈(예: 카메라, 짐벌, 배터리 등)의 상태 및 설정 값을 관리하고 제어하는 데 사용되는 **기본 클래스**이다. 여러 하드웨어 모듈의 키 클래스들의 상위 클래스 역할을 한다.

### 주요 개념

- **DJIKey** 클래스는 제네릭 타입`DJIKey<T>`을 사용하여 특정 모듈의 값을 가져오거나 설정할 때 사용할 수 있는 키를 정의한다.
- 각 하드웨어 모듈(카메라, 비행 컨트롤러, 짐벌 등)은 이 키를 통해 그 상태와 설정 값을 읽거나 쓸 수 있다.

### 클래스 설명

- **`DJIKey<T>`**: 모든 모듈의 키 클래스들이 상속하는 기본 클래스이며, 각 모듈에 고유한 설정 값을 다루기 위한 키들이 이 클래스를 확장하여 구현된다.

### 지원 버전

- DJI Key<T> 클래스는 **MSDK 5.0.0** 버전부터 지원

### 관련 클래스

- **ProductKey**: DJI 하드웨어 제품의 정보를 가져오는데 사용되는 키
- **AirLinkKey**: 드론의 무선 연결 상태 및 설정에 대한 키
- **CameraKey**: 드론 카메라의 설정과 상태를 제어하는 키
- **GimbalKey**: 짐벌의 상태와 제어를 위한 키
- **FlightControllerKey**: 비행 컨트롤러의 상태 및 설정 값을 제어하는 키
- **RemoteControllerKey**: 리모트 컨트롤러의 상태 및 설정 값을 제어하는 키
- **BatteryKey**: 배터리의 상태 및 관리에 대한 키

-----

### ProductKey 

`ProductKey` 클래스는 **DJI 하드웨어 제품의 정보를 가져오는** 데 사용되는 클래스이다. 

```java
@Keep
 class ProductKey extends DJIProductKey
```

*Package: dji.sdk.keyvalue.key*

하드웨어 제품의 연결 상태, 제품 유형, 펌웨어 버전 등 **하드웨어 제품의 기본 정보**를 확인할 수 있는 여러 가지 메서드를 제공한다.

#### Class Members

- **KeyConnection**

```java
static final DJIKeyInfo<Boolean> KeyConnection = new DJIKeyInfo<>(componentType.value(),subComponentType.value(),"Connection", SingleValueConverter.BooleanConverter).canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false)
```

**Parameter:** `Boolean`

**`true`**: 하드웨어 제품(예: 드론, 카메라, 짐벌)이 **모바일 장치 또는 애플리케이션과 성공적으로 연결된 상태**를 나타낸다.

**`false`**: 하드웨어 제품이 **모바일 장치 또는 애플리케이션과 연결되지 않은 상태**를 의미한다.



- **KeyProductType**

```java
static final DJIKeyInfo<ProductType> KeyProductType = new DJIKeyInfo<>(componentType.value(),subComponentType.value(),"ProductType", new SingleValueConverter<>(ProductType.class,ProductTypeMsg.class)).canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false)
```

**Parameter:** `ProductType`

`KeyProductType`은 DJI 하드웨어 제품(예: 드론, 카메라 등)의 **타입 정보**를 반환한다.

ex) DJI_MAVIC_3_ENTERPRISE_SERIES, M30_SERIES, M300_RTK, M350_RTK



- **KeyFirmwareVersion**

```java
static final DJIKeyInfo<String> KeyFirmwareVersion = new DJIKeyInfo<>(componentType.value(),subComponentType.value(),"FirmwareVersion", SingleValueConverter.StringConverter).canGet(true).canSet(false).canListen(false).canPerformAction(false).setIsEvent(false)
```

**Parameter:** `String`

**현재 하드웨어의 펌웨어 버전**을 가져오는 데 사용된다. 



### AirLinkKey

```java
@Keep
 class AirLinkKey extends DJIAirlinkKey
```

*Package: dji.sdk.keyvalue.key*

**Airlink(무선 연결) 관련 설정** 및 **정보 조회**를 위한 다양한 메서드를 제공하며, 주로 드론과 조종기 간의 무선 통신을 제어하고 모니터링하는 데 사용된다. 
또한, **IMediaDataCenter**를 통해 **비디오 스트림** 및 **멀티미디어**와 관련된 기능은 별도로 처리한다.

#### Class Members

- **KeyConnection**

```java
static final DJIKeyInfo<Boolean> KeyConnection = new DJIKeyInfo<>(componentType.value(),subComponentType.value(),"Connection", SingleValueConverter.BooleanConverter).canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false)
```

**Parameter:** `Boolean`

**`true`**: 하드웨어 제품(예: 드론, 카메라, 짐벌)이 **모바일 장치 또는 애플리케이션과 성공적으로 연결된 상태**

**`false`**: 하드웨어 제품이 **모바일 장치 또는 애플리케이션과 연결되지 않은 상태**



- **KeyAirLinkType**

```java
static final DJIKeyInfo<AirLinkType> KeyAirLinkType = new DJIKeyInfo<>(componentType.value(),subComponentType.value(),"AirLinkType", new SingleValueConverter<>(AirLinkType.class,AirLinkTypeMsg.class)).canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false)
```

**Parameter:** `AirLinkType`

**Airlink(무선 연결)의 타입**을 가져온다.

ex) WIFI, LIGHT_BRIDGE, OCU_SYNC



- **KeySignalQuality**

```java
static final DJIKeyInfo<Integer> KeySignalQuality = new KeySignalQuality()
           .canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false)
```

**Parameter:** `Integer`

**Airlink(무선 연결)의 신호 품질**을 가져온다. 
단위: 퍼센트(%). 
신호 품질이 **40% 이하**일 경우, 신호 품질이 **나쁜 상태**를 의미 
신호 품질이 **40%에서 60% 사이**일 경우, 신호 품질이 **보통 상태**를 의미
신호 품질이 **60% 이상**일 경우, 신호 품질이 **좋은 상태**를 의미



- **KeyDynamicDataRate**

```java
static final DJIKeyInfo<Double> KeyDynamicDataRate = new DJIKeyInfo<>(componentType.value(),subComponentType.value(),"DynamicDataRate", SingleValueConverter.DoubleConverter).canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false)
```

**Parameter:** `Double`

**드론에서 조종기로 내려오는 데이터 링크의 동적 데이터 전송 속도**를 확인할 수 있다.  **Mbps**단위로 제공된다.



CameraKey

`CameraKey` 클래스는  드론의 카메라와 관련된 데이터를 가져오거나 설정하는 데 사용되는 클래스 
카메라의 ISO, 셔터 속도, 화이트 밸런스 등의 설정을 변경하거나 현재 값을 조회할 수 있다.



```java
@Keep
 class CameraKey extends DJICameraKey
```

##### Description:

`CameraKey`provides a set of methods to set and get the camera parameters including camera type, camera settings, etc. 

**Connected Status**  `KeyConnection`

###### final KeyConnection

```java
static final DJIKeyInfo<Boolean> KeyConnection = new DJIKeyInfo<>(componentType.value(),subComponentType.value(),"Connection", SingleValueConverter.BooleanConverter).canGet(true).canSet(false).canListen(true).canPerformAction(false).setIsEvent(false)
```

*Package : dji.sdk.keyvalue.key*

##### Description:

**Parameter:** Boolean

 `true` means that camera is connected. 

```
*Supported since MSDK 5.0.0*
```





FTP 기존 코드 (9.24)

```
package com.dji.dair.internal.repository;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Environment;
import android.os.Handler;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.common.error.IDJIError;
import dji.v5.manager.datacenter.media.MediaFileDownloadListener;
import dji.v5.manager.datacenter.media.MediaFileFilter;
import dji.v5.manager.datacenter.media.MediaFileListState;
import dji.v5.manager.datacenter.media.MediaFileListStateListener;
import dji.v5.manager.interfaces.IMediaManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import dji.v5.manager.datacenter.MediaDataCenter;
import dji.v5.manager.datacenter.media.MediaFile;
import dji.v5.manager.datacenter.media.PullMediaFileListParam;
import dji.v5.manager.datacenter.media.MediaFileListData;
import dji.v5.ux.visualcamera.storage.SDCardInsertedEvent;
import dji.v5.ux.cameracore.widget.cameracapture.shootphoto.ShootPhotoEvent;
import dji.v5.ux.visualcamera.storage.SDCardRemovedEvent;

import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FTPConnectionManager {

    private FTPClient ftpClient;
    private String server = "121.179.183.64";
    private int port = 300;
    private String user = "hakim";
    private String password = "kgb0563";
    private boolean ftp_connected = false;
    private boolean onUpdate = false;
    private FileOutputStream fos;
    private FileInputStream fis;
    private ExecutorService executorService;
//    private ChannelSftp sftpChannel;
//    private Session session;

    public FTPConnectionManager() {
        EventBus.getDefault().register(this);
        this.executorService = Executors.newSingleThreadExecutor();
    }

    //SD카드 삽입되면 이벤트 발생 감지하여 FTP 로그인
    public void connectFTP() throws IOException {


        if(!ftp_connected) {

//            try {
//                Log.d("test","connectFTP!!");
//                ftpClient = new FTPClient();
//                ftpClient.connect(server, port);
//                int reply = ftpClient.getReplyCode();
//                //230 로그인 성공
//                if(FTPReply.isPositiveCompletion(reply)){
//                    ftpClient.login(user,password);
//                    ftp_connected = true;
//                    Log.d("test","FTP 로그인 성공");
//                }
//                else {
//                    ftpClient.disconnect();
//                    ftp_connected = false;
//                    Log.d("test","FTP 로그인 실패 연결 코드 : "+ reply);
//                }
//            } catch (Exception e) {
//                if (ftpClient.isConnected()) {
//                    Log.e("test", "connectFTP catch : ", e);
//                    ftpClient.disconnect();
//                }
//                Log.e("test", "connectFTP Error : ", e);
//            }
        }
    }
    //촬영 이벤트 감지 메서드
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void shootPhotoEvent(ShootPhotoEvent shootPhotoEvent) {
        IMediaManager mediaManager = MediaDataCenter.getInstance().getMediaManager();
        //파일 목록 변경 감지
        mediaManager.addMediaFileListStateListener(new MediaFileListStateListener() {
            @Override
            public void onUpdate(MediaFileListState mediaFileListState) {
                Log.d("test", "onUpdate ");

                Log.d("test", "MediaFileListState.UP_TO_DATE ");
                pollForMediaFiles(mediaManager);
            }
        });
        MediaFileFilter mediaFileFilter = MediaFileFilter.PHOTO;
        PullMediaFileListParam param = new PullMediaFileListParam.Builder().filter(mediaFileFilter).build();
        //파일 목록 가져오기
        mediaManager.pullMediaFileListFromCamera(param, new CommonCallbacks.CompletionCallback() {
            @Override
            public void onSuccess() {
                Log.d("test", "onSuccess");
                onUpdate = true;
                pollForMediaFiles(mediaManager);
            }
            @Override
            public void onFailure(@NonNull IDJIError idjiError) {
                Log.d("test", "onFailure" + idjiError);
            }
        });
    }

    private void pollForMediaFiles(IMediaManager mediaManager){
        Log.d("test","pollForMediaFiles");
        MediaFileListData mediaFileListData = mediaManager.getMediaFileListData();
        List<MediaFile> files = mediaFileListData.getData();

        if(onUpdate) {
            if (!files.isEmpty()) {
                //Set<String> seenFileNames = new HashSet<>();
                Log.d("test", "파일 갯수 " + files.size());
                MediaFile mediaFile = files.get(0);
                handleFiles(mediaFile);
            } else {
                Log.d("test", "files is empty");
                new Handler().postDelayed(() -> pollForMediaFiles(mediaManager), 1000);
            }
        }
    }

    //외부저장소로 업데이트
    private void handleFiles(MediaFile latestFile){
        Log.d("test","handleFiles");
        var savePath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        File localfile = new File(savePath,latestFile.getFileName());
        try {
            fos = new FileOutputStream(localfile,true);
        } catch (Exception e){
            Log.d("test","file Exception : "+ e);
        }
        latestFile.pullOriginalMediaFileFromCamera(0, new MediaFileDownloadListener() {
            @Override
            public void onStart() {
                Log.d(" test","onStart");
            }
            @Override
            public void onProgress(long total, long current) {
                double num = (double) current/total * 100;
                Log.d("test","파일명 : " + latestFile.getFileName() + " 다운로드 : " + num);
            }
            @Override
            public void onRealtimeDataUpdate(byte[] data, long position) {
                try {
                    fos.write(data);
                    fos.flush();
                } catch (IOException e) {
                    Log.d("test","onRealtimeDataUpdate error : "+ e);
                }
            }
            @Override
            public void onFinish() {
                Log.d("test","onFinish");
                if(localfile.exists()) {
                    Log.d("test","onFinish localfile.exists()");
                    uploadFileToFTP(localfile,latestFile.getFileName());
                }
            }
            @Override
            public void onFailure(IDJIError error) {
            }
        });
    }

    public void uploadFileToFTP(File localfile, String fileName) {
        executorService.execute(() -> {
            try {
                ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
                ftpClient.enterLocalPassiveMode();
                //String serverFilePath = "/srv/ftp/" + fileName;
                String serverFilePath = "/home/hakim" + fileName;
                try {
                    fis = new FileInputStream(localfile);
                    boolean result = ftpClient.storeFile(serverFilePath,fis);
                    Log.d("test","result : "+ result);
                    if (!result) {
                        Log.d("test", "FTP Upload Failed. Reply Code: " + ftpClient.getReplyCode() + " Reply String: " + ftpClient.getReplyString());
                    }
                }
                catch(FileNotFoundException e){
                    Log.d("test","FileNotFoundException");
                }
            }
            catch (Exception e){
                Log.d("test","uploadFileToFTP catch :"+e);
            }
        });
    }

    //    public boolean checkNetwork() {
//        ConnectivityManager connectivityManager = (ConnectivityManager)
//                conte
//    }
    @Subscribe
    public void onSDCardInserted(SDCardInsertedEvent event) throws IOException {
        connectFTP();
    }

    @Subscribe
    public void onSDCardRemoved(SDCardRemovedEvent event) throws IOException {
        Log.d("test", "FTP 연결 해제");
        Log.d("test","ftpClient??? "+ ftp_connected);
        if(ftpClient.isConnected() && ftp_connected) {
            try {
                Log.d("test", "trytrytrytry");
                ftpClient.logout();
                //ftpClient.disconnect();
                ftp_connected = false;
            } catch (IOException e) {
                Log.d("test", "FTP 연결 해제 도중 문제 발생 " + e);
            }
        } else {
            Log.d("test","ftpClient.isConnected() " + ftpClient.isConnected());
            Log.d("test", "ftp_connected " + ftp_connected);
            Log.d("test","문제있다");
        }


    }

    public void unregister() {
        EventBus.getDefault().unregister(this);
    }

    @Override
    protected void finalize() throws Throwable {
        unregister();
        super.finalize();
    }
}

```

