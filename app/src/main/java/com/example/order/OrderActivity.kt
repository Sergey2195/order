package com.example.order

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.order.databinding.ActivityOrderBinding

class OrderActivity : AppCompatActivity() {
    lateinit var binding: ActivityOrderBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrderBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var login = intent.getStringExtra("login")
        var password = intent.getStringExtra("password")
        binding.tvGreeting.text = "Hello, $login!"
    }
}