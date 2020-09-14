package com.example.toasty_custom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import es.dmoral.toasty.Toasty

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val customBtn = findViewById<Button>(R.id.btnCustom)

        customBtn.setOnClickListener {
            Toasty.custom(applicationContext,"Custom Toast",R.drawable.ic_baseline_pan_tool_24
            ,R.color.SomeColor,5,true,true).show()
        }
    }
}