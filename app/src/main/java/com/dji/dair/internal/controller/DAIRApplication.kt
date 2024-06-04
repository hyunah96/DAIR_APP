package com.dji.dair.internal.controller

import android.app.Application
import android.util.Log
import com.dji.dair.internal.models.MSDKManagerVM
import com.dji.dair.internal.models.globalViewModels
import io.reactivex.plugins.RxJavaPlugins

open class DAIRApplication: Application() {

    private val msdkManagerVM : MSDKManagerVM by globalViewModels()

    override fun onCreate() {
        super.onCreate()

        Log.d("test","DAIRApplication")

        msdkManagerVM.initMobileSDK(this)
    }

}

