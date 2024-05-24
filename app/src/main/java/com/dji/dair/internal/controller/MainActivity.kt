package com.dji.dair
import android.Manifest
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.RelativeLayout
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
import java.lang.Exception
import android.content.Intent

class MainActivity : ComponentActivity() {


    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        loginButton = findViewById(R.id.login_btn)


        checkPermissionAndRequest()

        loginButton.setOnClickListener {
            val intent = Intent(this, DAIRActivity::class.java)
            startActivity(intent)
        }




    }

    private fun checkPermissionAndRequest() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {

            Log.d("test", "버전은 : ${Build.VERSION.SDK_INT}")
            checkAndRequestPermissions()
        } else {
            //initializeSDK()
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

        if (permissionsNeeded.isNotEmpty()) {
            Log.d("test","permissionsNeeded.isNotEmpty")
            ActivityCompat.requestPermissions(this, permissionsNeeded.toTypedArray(), 1)
        } else {
            Log.d("test","else")
            Log.d("test","$permissionsNeeded")
            // 모든 권한이 이미 부여된 경우 SDK를 초기화
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
    }

    private fun initializeSDK() {
        try {
            Log.d("test","initializeSDK")
            DJISDKManager.getInstance()
                .registerApp(this, object : DJISDKManager.SDKManagerCallback {
                    override fun onRegister(error: DJIError) {
                        if (error == DJISDKError.REGISTRATION_SUCCESS) {
                            runOnUiThread {

                                Toast.makeText(applicationContext, "SDK 연결 성공 ", Toast.LENGTH_LONG)
                                    .show()
                                Log.d("test","연결 성공")
                                loginButton.isEnabled = true
                                DJISDKManager.getInstance().startConnectionToProduct()

                            }
                        } else {
                            runOnUiThread {
                                Toast.makeText(applicationContext, "SDK 연결 실패", Toast.LENGTH_LONG)
                                    .show()
                                Log.d("test","연결 실패 ")
                                Log.d("test","실패 이유는 : $error")
                                loginButton.isEnabled = false
                            }
                        }

                    }

                    override fun onComponentChange(
                        p0: BaseProduct.ComponentKey?,
                        p1: BaseComponent?,
                        p2: BaseComponent?
                    ) {
                    }

                    override fun onProductDisconnect() {
                    }

                    override fun onDatabaseDownloadProgress(p0: Long, p1: Long) {
                    }


                    override fun onInitProcess(p0: DJISDKInitEvent?, p1: Int) {
                        Log.d("test", "onInitProcess event: $p0, progress: $p1")
                    }

                    override fun onProductChanged(p0: BaseProduct?) {

                    }

                    override fun onProductConnect(p0: BaseProduct?) {

                        Log.d("test","연결되었습니다 $p0")
                        Log.d("test", "연결되었습니다. 제품 모델: ${p0?.model}, 펌웨어 버전: ${p0?.firmwarePackageVersion}")
                    }

                })
        }
        catch (e:Exception){
            Log.d("test","오류는 : $e")
        }
    }


}