package com.gaurav.native_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import io.flutter.embedding.android.FlutterActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startActivity(FlutterActivity.createDefaultIntent(this))


        Handler().postDelayed({
            // Start SecondActivity after 5 seconds
            val intent = Intent(this, HelloWorldActivity::class.java)
            startActivity(intent)
            finish()
        }, 5000) // 5000 milliseconds = 5 seconds


    }
}