package com.maspam.foodmarketkotlin.ui.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.maspam.foodmarketkotlin.MainActivity
import com.maspam.foodmarketkotlin.R

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        /*
       Handler is Deprecated
       Use Looper.getMainLooper function in parameter Handler to use Handler function
       but looper is always running until this app is broke/destoryed
       */

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java));
        }, 3000)


    }
}