package com.example.projectmanagement

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager

class IntroActivity : AppCompatActivity() {
//    private var btnSignUp : String = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        findViewById<View?>(R.id.btn_sign_up_intro).setOnClickListener {
            startActivity(Intent(this@IntroActivity, SignUpActivity::class.java))
        }
    }
}