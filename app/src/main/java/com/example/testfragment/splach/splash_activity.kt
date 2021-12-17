package com.example.testfragment.splach

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.testfragment.R
import com.example.testfragment.home_activity

class splash_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

       Handler(Looper.getMainLooper()).postDelayed({
                startsplash()

       },2000)
    }

    private fun startsplash() {
         var Intent = Intent(this,home_activity::class.java)
startActivity(Intent)
        finish()
    }
}