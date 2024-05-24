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

    }
}