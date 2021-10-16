package com.mvvm.app.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.mvvm.app.R
import com.mvvm.app.ui.login.LoginActivity
import com.mvvm.app.utils.Constant.SPLASH_SCREEN_TIME_OUT



class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed(Runnable {
            //we are creating intent with LoginActivity
            val intent = Intent(this, LoginActivity::class.java)
            //activity will start here
            startActivity(intent)
            //current activity will finish here
            finish()
            //the current activity will get finished.
        }, SPLASH_SCREEN_TIME_OUT)
    }

}