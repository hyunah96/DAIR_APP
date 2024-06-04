package com.dji.dair.internal.data

import dji.sdk.keyvalue.value.product.ProductType
import dji.v5.utils.inner.SDKConfig
import dji.v5.common.register.PackageProductCategory
data class MSDKInfo(val SDKVersion: String = DEFAULT_STR){

/**
 * DJI SDK 관련 여러 정보를 저장하기 위한 데이터 컨테이너
 *
 */
    var buildVer: String = DEFAULT_STR
    var isDebug: Boolean = false
    var packageProductCategory: PackageProductCategory? = null
    var productType: ProductType = ProductType.UNKNOWN
    var networkInfo: String = DEFAULT_STR
    var countryCode: String = DEFAULT_STR
    var firmwareVer: String = DEFAULT_STR
    var isLDMLicenseLoaded: String = DEFAULT_STR
    var isLDMEnabled: String = DEFAULT_STR
    var coreInfo: SDKConfig.CoreInfo? = null



}