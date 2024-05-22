package com.dji.dair
import android.Manifest
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import dji.common.error.DJIError
import dji.common.error.DJISDKError
import dji.sdk.base.BaseComponent
import dji.sdk.base.BaseProduct
import dji.sdk.sdkmanager.DJISDKInitEvent
import dji.sdk.sdkmanager.DJISDKManager
import android.content.Context
import java.lang.Exception

class MainActivity : ComponentActivity() {

    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        loginButton = findViewById(R.id.login_btn)

        checkPermissionAndRequest()


    }

    private fun checkPermissionAndRequest() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            Log.d("test", "버전은 : ${Build.VERSION.SDK_INT}")
            checkAndRequestPermissions()

        } else {
            Log.d("test", "checkPermissionAndRequest else")
            initializeSDK()
        }

    }

    private fun checkAndRequestPermissions() {
        Log.d("test","checkAndRequestPermissions")
        val permissions = arrayOf(
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.READ_PHONE_STATE
        )

        val permissionsNeeded = permissions.filter {
            ContextCompat.checkSelfPermission(this, it) != PackageManager.PERMISSION_GRANTED
        }
        //비어있지 않으면 (권한 안받은게 있으면)
        if (permissionsNeeded.isNotEmpty()) {
            Log.d("test","permissionsNeeded.isNotEmpty")
            ActivityCompat.requestPermissions(this, permissionsNeeded.toTypedArray(), 1)
        } else {
            //이미 권한이 부여되어 있을 때
            Log.d("test"," 권한 있음 안받은 권한 : $permissionsNeeded")
            initializeSDK()
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 1) {
            if (grantResults.isNotEmpty() && grantResults.all { it == PackageManager.PERMISSION_GRANTED }) {
                Log.d("test","onRequestPermissionsResult")
                // 모든 권한이 부여된 경우 SDK를 초기화
                initializeSDK()
            } else {
                Toast.makeText(this, "권한이 필요합니다", Toast.LENGTH_LONG).show()
                Log.d("test","권한이 필요합니다")
            }
        }
        else {
            Log.d("test","1번이 아님")
        }
    }

    private fun initializeSDK() {
        Log.d("test", "initializeSDK")
        Log.d("test", "탔다1 ")
        val mDJISDKManagerCallback = object : DJISDKManager.SDKManagerCallback {
            override fun onRegister(error: DJIError) {
                Toast.makeText(applicationContext, "onRegister 입니다 ", Toast.LENGTH_LONG)
                    .show()
                Log.d("test", "[1] onRegister 입니다 ")

                if (error == DJISDKError.REGISTRATION_SUCCESS) {
                    DJISDKManager.getInstance().startConnectionToProduct()
                    Log.d("test", "SDK 연결 성공 ")
                } else {
                    Log.d("test", "SDK 연결 실패")
                }
            }

            override fun onProductDisconnect() {
                TODO("Not yet implemented")
            }

            override fun onProductConnect(baseProduct: BaseProduct) {
                Toast.makeText(applicationContext, "[2] 연결되었습니다", Toast.LENGTH_LONG).show()
                Log.d("test", "[2] $baseProduct 연결되었습니다  ")
            }

            override fun onComponentChange(
                p0: BaseProduct.ComponentKey?,
                p1: BaseComponent?,
                p2: BaseComponent?
            ) {
                TODO("Not yet implemented")
            }

            override fun onDatabaseDownloadProgress(p0: Long, p1: Long) {
                TODO("Not yet implemented")
            }

            override fun onInitProcess(p0: DJISDKInitEvent?, p1: Int) {
                TODO("Not yet implemented")
            }

            override fun onProductChanged(p0: BaseProduct?) {
                TODO("Not yet implemented")
            }
        }
        try {
            Log.d("test","try!!!")
            DJISDKManager.getInstance().registerApp(applicationContext, mDJISDKManagerCallback)

        }
        catch (e:Exception){
            Log.d("test","안되는 이유 : ${e.printStackTrace()}")
        }
    }


    }