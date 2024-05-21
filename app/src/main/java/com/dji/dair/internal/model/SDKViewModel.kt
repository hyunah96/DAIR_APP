package com.dji.dair.internal.model
import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import com.dji.dair.internal.managers.SDKManager


class SDKViewModel: ViewModel() {

    val isConnected = MutableLiveData<Boolean>()

    fun updateSDKConnect(connect: Boolean){
        isConnected.value = connect
    }
}