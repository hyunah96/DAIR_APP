package com.dji.dair.internal.util
import androidx.lifecycle.MutableLiveData
import com.dji.dair.internal.source.DJIToastResult


/**
 * 다른 뷰모델에 djiToastLD를 제공하는 데 사용되는
 * djiToastLD의 저장 및 프로비저닝 도구 클래스입니다.
 */
object DJIToastUtil {
    var dJIToastLD: MutableLiveData<DJIToastResult>? = null
}