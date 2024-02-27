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

        // Obtener el idioma seleccionado del intent
        val idiomaSeleccionado = intent.getStringExtra("idiomaSeleccionado")

        // Determinar el saludo correspondiente al idioma seleccionado
        var saludo = when (idiomaSeleccionado) {
            "Ingles" -> "Hello"
            "Español" -> "Hola"
            "Italiano" -> "Ciao"
            "Aleman" -> "Hallo"
            "Mandarin" -> "你好"
            "Frances" -> "Salut"
            "Portugues" -> "Olá"
            else -> "Saludo no especificado"
        }

        binding.SaludoText.text = saludo

        binding.goBackButton.setOnClickListener {
            finish()  // Cerrar la actividad actual y volver a la actividad anterior
        }

    }
}