package com.example.triqui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import com.example.triqui.databinding.ActivityHomeBinding
import com.example.triqui.databinding.ActivityMainBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding:ActivityHomeBinding
    private lateinit var selectedText: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.JuegoB.setOnClickListener {
            var intent = Intent(baseContext, TriquiActivity::class.java)
            startActivity(intent)
        }

        binding.Saludo.setOnClickListener {
            val intent = Intent(baseContext, GreetingActivity::class.java)
            selectedText=binding.Selec.selectedItem.toString()
            intent.putExtra("idiomaSeleccionado", selectedText)
            startActivity(intent)
        }

        binding.PaisInf.setOnClickListener {
            var intent = Intent(baseContext, PaisesActivity::class.java)
            startActivity(intent)
        }

    }
}