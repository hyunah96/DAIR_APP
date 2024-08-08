package dji.v5.ux.warning

import android.util.Log
import dji.sdk.keyvalue.key.FlightControllerKey
import dji.v5.et.create
import dji.v5.manager.diagnostic.*
import dji.v5.ux.core.base.DJISDKModel
import dji.v5.ux.core.base.WidgetModel
import dji.v5.ux.core.communication.ObservableInMemoryKeyedStore
import dji.v5.ux.core.util.DataProcessor

//드론 정보와 상태 변화를 모니터링하고 메시지를 업데이트하는 클래스
class DeviceHealthAndStatusWidgetModel constructor(
    djiSdkModel: DJISDKModel,
    keyedStore: ObservableInMemoryKeyedStore,
) : WidgetModel(djiSdkModel, keyedStore) {

    val deviceMessageProcessor: DataProcessor<ArrayList<DeviceMessage>> = DataProcessor.create(arrayListOf())
    val isConnectedProcessor: DataProcessor<Boolean> = DataProcessor.create(false)

    private val healthInfoChangeListener = DJIDeviceHealthInfoChangeListener {
        updateDeviceMessage()
    }

    private val deviceStatusChangeListener = DJIDeviceStatusChangeListener { _, _ ->
        updateDeviceMessage()
    }

    override fun inSetup() {
        //드론 건강 상태 정보 변화 감지 리스너
        DeviceHealthManager.getInstance().addDJIDeviceHealthInfoChangeListener(healthInfoChangeListener)
        //드론의 일반 상태 변화 감지 리스너
        DeviceStatusManager.getInstance().addDJIDeviceStatusChangeListener(deviceStatusChangeListener)
        bindDataProcessor(FlightControllerKey.KeyConnection.create(), isConnectedProcessor)
    }

    override fun inCleanup() {
        DeviceHealthManager.getInstance().removeDJIDeviceHealthInfoChangeListener(healthInfoChangeListener)
        DeviceStatusManager.getInstance().removeDJIDeviceStatusChangeListener(deviceStatusChangeListener)
    }

    //상태 정보 메시지 업데이트
    private fun updateDeviceMessage() {

        val messages = ArrayList<DeviceMessage>()
        for (health: DJIDeviceHealthInfo in DeviceHealthManager.getInstance().currentDJIDeviceHealthInfos) {
            messages.add(DeviceMessage(health.title(), health.description(), health.warningLevel(), health.informationCode()))
        }
//        val status = DeviceStatusManager.getInstance().currentDJIDeviceStatus
//        messages.add(DeviceMessage(status.description(), status.description(), status.warningLevel(), status.statusCode()))
        //만약 새로운 messages 값이 그대로라면 return
        if (messages == deviceMessageProcessor.value) {
            Log.d("test", "updateDeviceMessage messages : $messages")
            return
        }
        //경고 레벨이 낮은 내림차순으로 정렬
        messages.sortByDescending { msg -> msg.warningLevel }

        //연결된 다른 리스너들에게 변화를 통지
        deviceMessageProcessor.onNext(messages)
    }

    fun level3Count() = deviceMessageProcessor.value.count { it.warningLevel == WarningLevel.WARNING || it.warningLevel == WarningLevel.SERIOUS_WARNING }

    fun level2Count() = deviceMessageProcessor.value.count { it.warningLevel == WarningLevel.NOTICE || it.warningLevel == WarningLevel.CAUTION }

    data class DeviceMessage(val title: String, val description: String, val warningLevel: WarningLevel, val code: String) {

        override fun equals(other: Any?): Boolean {
            return if (other is DeviceMessage) {
                other.code == this.code
            } else false
        }

        override fun hashCode(): Int {
            var result = title.hashCode()
            result = 31 * result + description.hashCode()
            result = 31 * result + warningLevel.hashCode()
            result = 31 * result + code.hashCode()
            return result
        }

        //UI에 표시할 텍스트 생성
        fun validDescription(): String {
            description.ifEmpty {
                return code
            }
            return description
        }
    }
}