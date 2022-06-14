package com.example.order

import android.content.Intent
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
                binding.checkBoxLemon.visibility = View.INVISIBLE
            }else {
                binding.spinnerCoffee.visibility = View.INVISIBLE
                binding.spinnerTea.visibility = View.VISIBLE
                binding.checkBoxLemon.visibility = View.VISIBLE
            }
        }
        binding.buttonOrder.setOnClickListener {
            var intent = Intent(this, FinishActivity::class.java)
            var string: String = "$login $password "
            if (binding.buttonCoffee.isChecked){
                string += "Coffee"
            }else {
                string += "Tea"
            }
            string += binding.spinnerCoffee.selectedItem.toString()
            string += binding.spinnerTea.selectedItem.toString()
            string += if (binding.checkBoxLemon.isChecked && binding.buttonTea.isChecked){
                "lemon"
            }else{""}
            string += if (binding.checkBoxMilk.isChecked){
                "milk"
            }else{""}
            string += if (binding.checkBoxSugar.isChecked){
                "sugar"
            }else{""}
            intent.putExtra("order", string)
            startActivity(intent)
        }
    }
}