package com.dji.dair.internal.source

import com.dji.dair.internal.util.DJIToastUtil

/**
 * 모델 지향 실행 결과 래퍼 클래스로
 * 외부 Toast에서 필요한 정보를 간단히 캡슐화합니다.
 */
class DJIToastResult(var isSuccess: Boolean, var msg: String? = null){
    companion object {
        fun success(msg: String? = null): DJIToastResult {
            return DJIToastResult(true, "success ${msg ?:""}")
        }
        fun failed(msg: String): DJIToastResult {
            return DJIToastResult(false , msg)
        }
    }
}