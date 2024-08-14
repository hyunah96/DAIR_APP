package com.dji.dair.internal.models

import dji.v5.common.register.PackageProductCategory
import dji.v5.utils.inner.SDKConfig

/**
 * MSDK와 상호 작용하는 로직을 캡슐화하고
 * MSDK 정보와 관련된 정보를 읽는다
 */
class MSDKInfoModel {

    fun isDebug(): Boolean{
        return SDKConfig.getInstance().isDebug
    }

    fun getPackageProductCategory(): PackageProductCategory{
        return SDKConfig.getInstance().packageProductCategory
    }

    fun getSDKVersion(): String {
        return SDKConfig.getInstance().registrationSDKVersion
    }
    fun getBuildVersion(): String {
        return SDKConfig.getInstance().buildVersion
    }

    fun getCoreInfo(): SDKConfig.CoreInfo {
        return SDKConfig.getInstance().coreInfo
    }
}