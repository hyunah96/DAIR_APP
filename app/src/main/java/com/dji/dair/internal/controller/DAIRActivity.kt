package com.dji.dair
import android.os.Bundle

import android.util.Log
import androidx.activity.ComponentActivity
import android.content.Context
import com.dji.dair.internal.controller.DAIRApplication

class DAIRActivity: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("test","DAIRActivity")
        setContentView(R.layout.acitivity_default_widgets)

        val btr = DAIRApplication.BATTERY_SERVICE.length
        Log.d("test"," 배터리 상태는 $btr")
    }
}