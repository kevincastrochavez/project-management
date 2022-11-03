package com.example.projectmanagement

import android.os.Bundle
import android.view.View
import android.view.WindowManager

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setupActionBar()
    }

    private fun setupActionBar() {
        setSupportActionBar(findViewById(R.id.toolbar_sign_up_activity))

        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_ios_24)
        }

        findViewById<View?>(R.id.toolbar_sign_up_activity).setOnClickListener { onBackPressed() }
    }
}
