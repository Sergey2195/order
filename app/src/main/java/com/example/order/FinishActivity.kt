package com.example.order

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val tvResult = findViewById<TextView>(R.id.textView)
        tvResult.text = intent.getStringExtra("order").toString()
    }
}