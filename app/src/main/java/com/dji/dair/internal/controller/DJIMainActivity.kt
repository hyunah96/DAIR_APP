package com.dji.dair
import android.Manifest
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.dji.dair.internal.models.BaseMainActivityVm
import com.dji.dair.internal.models.MSDKInfoVm
import com.dji.dair.internal.models.MSDKManagerVM
import com.dji.dair.internal.models.globalViewModels
import com.dji.dair.internal.repository.FTPConnectionManager
import dji.v5.utils.common.PermissionUtil


abstract class DJIMainActivity: AppCompatActivity() {

    //val tag: String = LogUtils.getTag(this)

    private val permissionArray = arrayListOf(
        Manifest.permission.RECORD_AUDIO, //오디오 권한
        Manifest.permission.KILL_BACKGROUND_PROCESSES, //다른 앱의 프로세스를 종료 할 수 있는 권한
        Manifest.permission.ACCESS_COARSE_LOCATION, //사용자의 위치 정보 알 수 있는 권한 (네트워크 신호 예:wifi , 셀룰러 네트워크를 이용하여 파악)
        Manifest.permission.ACCESS_FINE_LOCATION, //사용자의 정확한 위치 정보 알 수 있는 권한 (GPS)
    )

    //생성자 호출 후 바로 실행되는 코드 블럭 init (인스턴스화 할 때 가장 먼저 초기화 되는 부분)
    init {
        permissionArray.apply {
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                add(Manifest.permission.READ_MEDIA_IMAGES)
                add(Manifest.permission.READ_MEDIA_VIDEO)
                add(Manifest.permission.READ_MEDIA_AUDIO)
            }
            else {
                add(Manifest.permission.READ_EXTERNAL_STORAGE)
                add(Manifest.permission.WRITE_EXTERNAL_STORAGE)
            }
        }

    }

    private val baseMainActivityVm: BaseMainActivityVm by viewModels()
    private val msdkInfoVm: MSDKInfoVm by viewModels()
    private val msdkManagerVM : MSDKManagerVM by globalViewModels()
    private val handler: Handler = Handler(Looper.getMainLooper())
    private var ftpManger: FTPConnectionManager? = null
    private val checkNetworkState: CheckNetworkState by lazy {
        CheckNetworkState(this)
    }



    //추상 메서드 선언 , 하위 클래스인 DJIAircraftMainActivity 에서 구현
    abstract fun prepareUxActivity()

    abstract fun prepareTestingToolsActivity()



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        Log.d("test","DJIMainActivity onCreate()")
        Log.d("test","build version : "+ Build.VERSION.SDK_INT);

        ftpManger = FTPConnectionManager()
        checkNetworkState.register()

        //로그인 버튼


        // 일부 휴대폰은 시스템 데스크톱에서 액세스할 때 기본 유형의 활동이 다시 시작될 수 있습니다.
        // 이는 업계 표준이며 기본적으로 모든 앱에 필요한 사항이므로 확인이 필요합니다.
        // 有一些手机从系统桌面进入的时候可能会重启main类型的activity
        // 需要校验这种情况，业界标准做法，基本所有app都需要这个
        if (!isTaskRoot && intent.hasCategory(Intent.CATEGORY_LAUNCHER) && Intent.ACTION_MAIN == intent.action) {

            finish()
            return

        }
        window.decorView.apply {
            systemUiVisibility =
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or View.SYSTEM_UI_FLAG_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        }
        observeSDKMananer()
        checkPermissionAndRequest()
    }



    //사용자가 권한 요청 대화 상자에서 권한을 승인하거나 거부한 후에 호출되는 콜백 함수
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        Log.d("test","onRequestPermissionsResult")
        if(checkPermission()) {
            Log.d("test","checkPermission true ")
            handleAfterPermissionPermitted()
        }
        else
        {
            Log.d("test","checkPermission else ")
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d("test","DJIMainActivity onResume()")

        if(checkPermission()) {
            Log.d("test","checkPermission : ${checkPermission()}")
            observeSDKMananer()
            handleAfterPermissionPermitted()
        }
        else {
            Log.d("test","checkPermission : ${checkPermission()}")
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        checkNetworkState.unregister()
        Log.d("test","onDestroy!!!!!!!!!")
    }

    private fun handleAfterPermissionPermitted() {
        prepareTestingToolsActivity()
    }

    //권한 체크
    private fun checkPermission(): Boolean{
        for(i in permissionArray.indices) {

            Log.d("test"," i = " + permissionArray[i])
            if(!PermissionUtil.isPermissionGranted(this,permissionArray[i])) {
                return false
            }
        }
        return true
    }



    //MSDK 연결을 관찰하고 제품 연결 상태나 변경 등을 감지
    private fun observeSDKMananer() {
        Log.d("test","observeSDKMananer")
        msdkManagerVM.lvRegisterState.observe(this) {
            resultPair ->
            Log.d("test","resultPair : $resultPair")
            if(resultPair.first) {
                Toast.makeText(this,"SDK 연결 성공",Toast.LENGTH_SHORT).show()
                Log.d("test","observeSDKMananer, Register Success")
                msdkInfoVm.initListener()
                handler.postDelayed({
                    prepareUxActivity()
                },4000)
            }
            else {
                Log.d("test","observeSDKMananer false")
            }
        }
    }



    private fun checkPermissionAndRequest() {
        if(!checkPermission()) {
            requestPermission()
        }
    }

    private fun requestPermission() {
        requestPermissionLauncher.launch(permissionArray.toArray(arrayOf()))

    }

    private val requestPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) {
        result ->
        result?.entries?.forEach{
            if (it.value == false) {
                requestPermission()
                return@forEach
            }
        }
    }


    private fun <T> enableButton(view:View , cl:Class<T>) {
        Log.d("test","enableButton")
        view.isEnabled = true
        view.setOnClickListener{
            Intent(this,cl).also {
                Log.d("test","enableButton start")
                    startActivity(it)
            }

        }
    }

    fun <T> enableDefaultLayout(cl: Class<T>) {
        Log.d("test","enableDefaultLayout")
        val login = findViewById<Button>(R.id.login_btn)
        handler.postDelayed({
            enableButton(login,cl)
        },3000)
    }


}