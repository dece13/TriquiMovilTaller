package com.example.triqui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.triqui.databinding.ActivityGreetingBinding
import com.example.triqui.databinding.ActivityHomeBinding

class GreetingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGreetingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityGreetingBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}