package com.example.triqui

import android.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.triqui.databinding.ActivityHomeBinding
import com.example.triqui.databinding.ActivityPaisesBinding
import org.json.JSONObject

class PaisesActivity : AppCompatActivity() {
    data class Country(val name: String, val capital: String, val nomInt:String,val abreviacion:String)
    private lateinit var binding: ActivityPaisesBinding
    var countries = mutableListOf<Country>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPaisesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadCountries()

        // Crear un adaptador para la ListView
        val adapter = CountryAdapter(this, countries)

        // Asignar el adaptador a la ListView
        binding.listaPaises.adapter = adapter

        binding.listaPaises.setOnItemClickListener { parent, view, position, id ->
            val selectedCountry = countries[position].name
            val intent = Intent(baseContext, DetallePaisActivity::class.java)
            intent.putExtra("selectedCountry", selectedCountry)
            startActivity(intent)
        }
        binding.Regreso.setOnClickListener {
            finish()  // Cerrar la actividad actual y volver a la actividad anterior
        }
    }

    fun loadCountries() {
        val json_string = this.assets.open("paises.json")
            .bufferedReader().use {
                it.readText()
            }
        var json = JSONObject(json_string)
        var paisesJsonArray = json.getJSONArray("paises")
        for (i in 0 until paisesJsonArray.length()) {
            val jsonObject = paisesJsonArray.getJSONObject(i)
            val capital = jsonObject.getString("capital")
            val name = jsonObject.getString("nombre_pais")
            val nomInter = jsonObject.getString("nombre_pais_int")
            val abrev = jsonObject.getString("sigla")

            // Crear el objeto país y agregarlo al arreglo
            val country = Country(name, capital, nomInter, abrev)
            countries.add(country)
        }
    }

    }