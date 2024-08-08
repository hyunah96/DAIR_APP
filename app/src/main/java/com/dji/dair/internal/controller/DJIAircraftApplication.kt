package com.dji.dair.internal.controller

import android.content.Context
import android.util.Log



class DJIAircraftApplication : DAIRApplication() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        com.secneo.sdk.Helper.install(this)
        Log.d("test","DJIAircraftApplication")

    }
}