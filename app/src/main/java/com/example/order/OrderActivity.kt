package com.example.order

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
        binding.radioGroup.setOnCheckedChangeListener { radioGroup, i ->
            if (binding.buttonCoffee.isChecked){
                binding.spinnerCoffee.visibility = View.VISIBLE
                binding.spinnerTea.visibility = View.INVISIBLE
            }else {
                binding.spinnerCoffee.visibility = View.INVISIBLE
                binding.spinnerTea.visibility = View.VISIBLE
            }
        }
    }
}