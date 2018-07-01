package com.obaap.materialdesign

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager

class SplashScreen : AppCompatActivity() {
    private val SPLASH_TIME:Long = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //requestWindowFeature(Window.FEATURE_NO_TITLE)
        getSupportActionBar()!!.hide()
        setContentView(R.layout.activity_splash_screen)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        Handler().postDelayed(Runnable {
            val intent =Intent(this@SplashScreen,MainActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_TIME)

    }
}
