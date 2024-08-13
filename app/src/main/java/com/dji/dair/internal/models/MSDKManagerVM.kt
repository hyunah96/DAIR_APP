package com.dji.dair.internal.models

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import android.util.Log
import dji.v5.common.error.IDJIError
import dji.v5.common.register.DJISDKInitEvent
import dji.v5.manager.SDKManager
import dji.v5.manager.interfaces.SDKManagerCallback

class MSDKManagerVM: ViewModel() {

    //SDK 연결 상태
    val lvRegisterState = MutableLiveData<Pair<Boolean, IDJIError?>>()
    //제품 연결 상태
    val lvProductConnectionState = MutableLiveData<Pair<Boolean,Int>>()
    //제품 변경 상태
    val lvProductChange = MutableLiveData<Int>()
    //초기화중에 일어나는 이벤트
    val lvInitProcess = MutableLiveData<Pair<DJISDKInitEvent,Int>>()
    //데이터베이스
    val lvDBDownloadProgress = MutableLiveData<Pair<Long,Long>>()

    //SDK 연결 로직 앱을 맨 처음 설치할 때 무조건 인터넷 연결이 되어야함
    fun initMobileSDK(appContext: Context) {
        SDKManager.getInstance().init(appContext, object : SDKManagerCallback {
            //SDK 연결 성공
            override fun onRegisterSuccess() {
                Log.d("test","onRegisterSuccess")
                lvRegisterState.postValue(Pair(true, null))

            }
            //SDK 연결 실패
            override fun onRegisterFailure(error: IDJIError?) {
                Log.d("test","onRegisterFailure")
                lvRegisterState.postValue(Pair(false,error))
            }
            //SDK 초기화 중에 일어나는 이벤트
            override fun onInitProcess(event: DJISDKInitEvent, totalProcess: Int) {
                Log.d("test","onInitProcess")
                lvInitProcess.postValue(Pair(event,totalProcess))
                if(event == DJISDKInitEvent.INITIALIZE_COMPLETE) {
                    Log.d("test","INITIALIZE_COMPLETE")
                    SDKManager.getInstance().registerApp()
                }
            }
            //연결된 제품이 변경되었을 때
            override fun onProductChanged(productId: Int) {
                lvProductChange.postValue(productId)
                Log.d("test","onProductChanged")
            }
            //SDK를 통해 제어하는 제품(드론)이 연결될 때
            override fun onProductConnect(productId: Int) {
                lvProductConnectionState.postValue(Pair(true,productId))
                Log.d("test","onProductConnect : $productId")
            }
            //연결된 제품이 해제될 때
            override fun onProductDisconnect(productId: Int) {
                lvProductConnectionState.postValue(Pair(false,productId))
                Log.d("test","onProductDisconnect")
            }

            //필요한 데이터베이스를 다운로드 하는 과정에서 진행 상황 (?)
            override fun onDatabaseDownloadProgress(current: Long, total: Long) {
                lvDBDownloadProgress.postValue(Pair(current,total))
                Log.d("test","onDatabaseDownloadProgress")
            }
        })
    }

}



