package com.example.order

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.order.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.makeOrderButton.setOnClickListener {
            var intent = Intent(this, OrderActivity::class.java)
            val login = binding.editTextLogin.text.toString()
            var password = binding.editTextPassword.text.toString()
            if (binding.editTextLogin.text.toString().isEmpty()|| binding.editTextPassword.text.toString().isEmpty()){
                notFull()
            } else {
                intent.putExtra("login", login)
                intent.putExtra("password", password)
                startActivity(intent)
            }
        }
    }
    fun notFull(){
        Toast.makeText(applicationContext, "Not all fields are filled", Toast.LENGTH_LONG).show()
    }
}