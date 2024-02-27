package com.example.triqui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.triqui.databinding.ActivityDetallePaisBinding
import com.example.triqui.databinding.ActivityHomeBinding
import org.json.JSONObject

class DetallePaisActivity : AppCompatActivity() {
    private lateinit var binding:ActivityDetallePaisBinding
    var countries = mutableListOf<PaisesActivity.Country>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDetallePaisBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val selectedCountry = intent.getSerializableExtra("selectedCountry") as String
        loadCountries()
        countries.forEachIndexed { index, country ->
            if(selectedCountry.equals(country.name)){
                binding.CapitalPais.text=country.capital
                binding.NombrePais.text=country.name
                binding.NomInternacional.text=country.nomInt
            }
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
            val country = PaisesActivity.Country(name, capital, nomInter, abrev)
            countries.add(country)
        }
    }
}