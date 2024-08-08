package com.dji.dair
import dji.v5.common.utils.GeoidManager
import dji.v5.ux.core.communication.DefaultGlobalPreferences
import dji.v5.ux.core.communication.GlobalPreferencesManager
import dji.v5.ux.core.util.UxSharedPreferencesUtil
import dji.v5.ux.sample.showcase.defaultlayout.DefaultLayoutActivity
import android.util.Log

//MAIN [1]
//DJIMainActivity 클래스를 상속받는 하위 클래스 DJIAircraftMainActivity
class DJIAircraftMainActivity : DJIMainActivity() {



    override fun prepareUxActivity() {
        Log.d("test","[1] DJIAircraftMainActivity")
        //UX 초기화
        UxSharedPreferencesUtil.initialize(this)
        //앱 전역에서 사용될 관리자 초기화
        GlobalPreferencesManager.initialize(DefaultGlobalPreferences(this))
        // 지오이드(해수면 기준으로 측정된 지표) 관리자 초기화
        GeoidManager.getInstance().init(this)

        enableDefaultLayout(DefaultLayoutActivity::class.java)
        //enableDefaultLayout(DefaultLayoutActivity::class.java)
        //enableWidgetList(WidgetsActivity::class.java)
    }

    override fun prepareTestingToolsActivity() {
        Log.d("test","[1] prepareTestingToolsActivity")
        //enableTestingTools(DAIRApplication::class.java)
    }
}

