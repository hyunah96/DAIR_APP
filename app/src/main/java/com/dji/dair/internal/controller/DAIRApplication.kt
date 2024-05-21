package com.dji.dair.internal.controller
import android.app.Application
import android.content.Context
import android.util.Log
import android.widget.Toast
import com.squareup.otto.Bus
import com.squareup.otto.ThreadEnforcer
import androidx.multidex.MultiDex
import dji.common.error.DJIError
import dji.common.error.DJISDKError
import dji.sdk.base.BaseComponent
import dji.sdk.base.BaseProduct
import dji.sdk.products.Aircraft
import dji.sdk.products.HandHeld
import dji.sdk.sdkmanager.BluetoothProductConnector
import dji.sdk.sdkmanager.DJISDKInitEvent
import dji.sdk.sdkmanager.DJISDKManager


class DAIRApplication : Application() {


        //DJI SDK 초기화
        private val mDJISDKManagerCallback = object : DJISDKManager.SDKManagerCallback {
            override fun onRegister(error: DJIError) {
                Toast.makeText(applicationContext,"DAIRApplication 입니다 ",Toast.LENGTH_LONG).show()
                Log.d("test","[1] DAIRApplication 입니다 ")

                if(error == DJISDKError.REGISTRATION_SUCCESS) {
                    DJISDKManager.getInstance().startConnectionToProduct()
                    Log.d("test","SDK 연결 성공 ")
                }
                else {
                    Log.d("test","SDK 연결 실패")
                }
            }

            override fun onProductDisconnect() {
                TODO("Not yet implemented")
            }

            override fun onProductConnect(baseProduct: BaseProduct) {
                Toast.makeText(applicationContext,"[2] 연결되었습니다", Toast.LENGTH_LONG).show()
                Log.d("test","[2] $baseProduct 연결되었습니다  ")
            }

            override fun onComponentChange(
                p0: BaseProduct.ComponentKey?,
                p1: BaseComponent?,
                p2: BaseComponent?
            ) {
                TODO("Not yet implemented")
            }

            override fun onDatabaseDownloadProgress(p0: Long, p1: Long) {
                TODO("Not yet implemented")
            }

            override fun onInitProcess(p0: DJISDKInitEvent?, p1: Int) {
                TODO("Not yet implemented")
            }

            override fun onProductChanged(p0: BaseProduct?) {
                TODO("Not yet implemented")
            }
        }




    val TAG: String = DAIRApplication::class.java.name
    private var product: BaseProduct? = null
    private var bluetoothConnector: BluetoothProductConnector? = null
    private var bus = Bus(ThreadEnforcer.ANY)
    private var app: Application? = null


    //연결된 드론의 인스턴스 가져오기
    @Synchronized
    fun getProductInstance(): BaseProduct? {
        product = DJISDKManager.getInstance().product
        return product
    }

    companion object {
        @get:Synchronized
        lateinit var instance: DAIRApplication
            private set
    }

    //블루투스 연결
    @Synchronized
    fun getBluetoothProductConnector(): BluetoothProductConnector? {
        bluetoothConnector = DJISDKManager.getInstance().bluetoothProductConnector
        return bluetoothConnector
    }

    //항공기인지 확인
    //is 키워드를 사용하면 null 인경우 false를 반환하기 때문에 != null  을 명시적으로 체크할 필요 x
    fun isAircraftConnected(): Boolean {
        return getProductInstance() is Aircraft
    }
    //핸드헬드인지 확인
    fun isHandHeldConnected(): Boolean {
        return getProductInstance() is HandHeld
    }
    //제품 유형별 인스턴스 반환
    @Synchronized
    fun getAircraftInstance(): Aircraft? {
        return if (isAircraftConnected()) getProductInstance() as Aircraft else null
    }


    @Synchronized
    fun getHandHeldInstance(): HandHeld? {
        return if (isHandHeldConnected()) getProductInstance() as HandHeld else null
    }

    //애플리케이션 인스턴스 반환
    fun getInstance(): Application? {
        return app
    }

    //이벤트 버스 반환
    fun getEventBus(): Bus {
        return bus
    }

    override fun attachBaseContext(base : Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
        com.secneo.sdk.Helper.install(this)
        app = this
    }
}