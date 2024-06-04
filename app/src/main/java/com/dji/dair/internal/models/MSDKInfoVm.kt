package com.dji.dair.internal.models
import com.dji.dair.internal.data.DEFAULT_STR
import androidx.lifecycle.MutableLiveData
import com.dji.dair.internal.data.MSDKInfo
import com.dji.dair.internal.data.NO_NETWORK_STR
import com.dji.dair.internal.data.ONLINE_STR
import dji.sdk.keyvalue.key.FlightControllerKey
import dji.sdk.keyvalue.key.ProductKey
import dji.v5.et.create
import dji.v5.et.get
import dji.v5.et.listen
import dji.v5.manager.KeyManager
import dji.v5.utils.common.LogUtils
import java.util.concurrent.atomic.AtomicBoolean
import dji.v5.manager.areacode.AreaCodeChangeListener
import dji.v5.network.IDJINetworkStatusListener
import dji.v5.manager.ldm.LDMManager
import dji.v5.manager.SDKManager
import dji.v5.manager.areacode.AreaCode
import dji.v5.manager.areacode.AreaCodeManager
import dji.v5.network.DJINetworkManager

/**
 *SDK의 상태 변경을 실시간으로 감지하고
 * 앱의 UI와 연동하여 표시하는 클래스
 */

class MSDKInfoVm : DJIViewModel() {

    val tag : String = LogUtils.getTag(this)

    //MutableLiveData 변하는 데이터
    val msdkInfo = MutableLiveData<MSDKInfo>()
    val mainTitle = MutableLiveData<String>()

    private val isInited = AtomicBoolean(false)
    private val msdkInfoModel: MSDKInfoModel = MSDKInfoModel()
    private var areaCodeChangeListener: AreaCodeChangeListener
    private var netWorkStatusListener: IDJINetworkStatusListener

    init {
        msdkInfo.value = MSDKInfo((msdkInfoModel.getSDKVersion()))
        msdkInfo.value?.buildVer = msdkInfoModel.getBuildVersion()
        msdkInfo.value?.isDebug = msdkInfoModel.isDebug()
        msdkInfo.value?.packageProductCategory = msdkInfoModel.getPackageProductCategory()
        msdkInfo.value?.isLDMEnabled = LDMManager.getInstance().isLDMEnabled.toString()
        msdkInfo.value?.isLDMLicenseLoaded = LDMManager.getInstance().isLDMLicenseLoaded.toString()
        msdkInfo.value?.coreInfo = msdkInfoModel.getCoreInfo()

        areaCodeChangeListener = AreaCodeChangeListener { _, changed ->
            LogUtils.i(logTag, "areaCodeData", changed)
            msdkInfo.value?.countryCode = if (changed == null) DEFAULT_STR else changed.areaCode
            refreshMSDKInfo()
        }
        netWorkStatusListener = IDJINetworkStatusListener {
            LogUtils.i(logTag, "isNetworkAvailable", it)
            updateNetworkInfo(it)
            refreshMSDKInfo()
        }
        refreshMSDKInfo()
    }
        override fun onCleared() {
            removeListener()
        }


    fun refreshMSDKInfo() {
        msdkInfo.postValue(msdkInfo.value)

    }

    /**
     * 등록 성공 후 호출해야 합니다.
     */
    fun initListener() {
        if(!SDKManager.getInstance().isRegistered) {
            return
        }
        if(isInited.getAndSet(true)) {
            return
        }
        FlightControllerKey.KeyConnection.create().listen(this) {
            LogUtils.i(tag, "KeyConnection :$it")
            updateFirmwareVersion()
        }

        AreaCodeManager.getInstance().addAreaCodeChangeListener(areaCodeChangeListener)
        DJINetworkManager.getInstance().addNetworkStatusListener(netWorkStatusListener)
        ProductKey.KeyProductType.create().listen(this) {
            LogUtils.i(tag, "KeyProductType: $it")
            it?.let {
                msdkInfo.value?.productType = it
                refreshMSDKInfo()
            }
        }
    }

    private fun removeListener(){
        KeyManager.getInstance().cancelListen(this)
        AreaCodeManager.getInstance().removeAreaCodeChangeListener(areaCodeChangeListener)
        DJINetworkManager.getInstance().removeNetworkStatusListener(netWorkStatusListener)
    }

    fun updateNetworkInfo(isAvailable: Boolean) {
        msdkInfo.value?.networkInfo = if(isAvailable) ONLINE_STR else NO_NETWORK_STR
    }

    fun updateFirmwareVersion() {
        ProductKey.KeyFirmwareVersion.create().get({
            LogUtils.i(tag, "UpdateFirmwareVersion Success : $it")
            msdkInfo.value?.firmwareVer = it ?: DEFAULT_STR
        }){
            LogUtils.i(tag, "UpdateFirmwareVersion Failed : $it")
            refreshMSDKInfo()
        }
    }
    fun updateLDMStatus() {
        msdkInfo.value?.isLDMEnabled = LDMManager.getInstance().isLDMEnabled.toString()
        msdkInfo.value?.isLDMLicenseLoaded = LDMManager.getInstance().isLDMLicenseLoaded.toString()
        refreshMSDKInfo()
    }



    }