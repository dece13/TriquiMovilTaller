package com.example.triqui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.triqui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private  var jugadorUno: Boolean=true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        SeleccionarCasilla()


    }

    fun ComprobarGanadorX() {
        //Comprobacion Horizontal
        if (binding.PosUno.text.equals("X")&&binding.PosDos.text.equals("X")&&binding.PosTres.text.equals("X")){
            //Jugador 1 ganó
            binding.Indicativo.setText("Jugador X ganó")
        }
        if (binding.PosCuatro.text.equals("X")&&binding.PosCinco.text.equals("X")&&binding.PosSeis.text.equals("X")){
            //Jugador 1 ganó
            binding.Indicativo.setText("Jugador X ganó")
        }
        if (binding.PosSiete.text.equals("X")&&binding.PosOcho.text.equals("X")&&binding.PosNueve.text.equals("X")){
            //Jugador 1 ganó
            binding.Indicativo.setText("Jugador X ganó")
        }
        //Comprobacion Vertical
        if (binding.PosUno.text.equals("X")&&binding.PosCuatro.text.equals("X")&&binding.PosSiete.text.equals("X")){
            //Jugador 1 ganó
            binding.Indicativo.setText("Jugador X ganó")
        }
        if (binding.PosDos.text.equals("X")&&binding.PosCinco.text.equals("X")&&binding.PosOcho.text.equals("X")){
            //Jugador 1 ganó
            binding.Indicativo.setText("Jugador X ganó")
        }
        if (binding.PosTres.text.equals("X")&&binding.PosSeis.text.equals("X")&&binding.PosNueve.text.equals("X")){
            //Jugador 1 ganó
            binding.Indicativo.setText("Jugador X ganó")
        }
        //Comprobacion Diagonal
        if (binding.PosUno.text.equals("X")&&binding.PosCinco.text.equals("X")&&binding.PosNueve.text.equals("X")){
            //Jugador 1 ganó
            binding.Indicativo.setText("Jugador X ganó")
        }
        if (binding.PosTres.text.equals("X")&&binding.PosCinco.text.equals("X")&&binding.PosSiete.text.equals("X")){
            //Jugador 1 ganó
            binding.Indicativo.setText("Jugador X ganó")
        }
    }
    fun ComprobarGanadorO() {
        //Comprobacion Horizontal
        if (binding.PosUno.text.equals("O")&&binding.PosDos.text.equals("O")&&binding.PosTres.text.equals("O")){
            //Jugador 1 ganó
            binding.Indicativo.setText("Jugador O ganó")
        }
        if (binding.PosCuatro.text.equals("O")&&binding.PosCinco.text.equals("O")&&binding.PosSeis.text.equals("O")){
            //Jugador 1 ganó
            binding.Indicativo.setText("Jugador O ganó")
        }
        if (binding.PosSiete.text.equals("O")&&binding.PosOcho.text.equals("O")&&binding.PosNueve.text.equals("O")){
            //Jugador 1 ganó
            binding.Indicativo.setText("Jugador O ganó")
        }
        //Comprobacion Vertical
        if (binding.PosUno.text.equals("O")&&binding.PosCuatro.text.equals("O")&&binding.PosSiete.text.equals("O")){
            //Jugador 1 ganó
            binding.Indicativo.setText("Jugador O ganó")
        }
        if (binding.PosDos.text.equals("O")&&binding.PosCinco.text.equals("O")&&binding.PosOcho.text.equals("O")){
            //Jugador 1 ganó
            binding.Indicativo.setText("Jugador O ganó")
        }
        if (binding.PosTres.text.equals("O")&&binding.PosSeis.text.equals("O")&&binding.PosNueve.text.equals("O")){
            //Jugador 1 ganó
            binding.Indicativo.setText("Jugador O ganó")
        }
        //Comprobacion Diagonal
        if (binding.PosUno.text.equals("O")&&binding.PosCinco.text.equals("O")&&binding.PosNueve.text.equals("O")){
            //Jugador 1 ganó
            binding.Indicativo.setText("Jugador O ganó")
        }
        if (binding.PosTres.text.equals("O")&&binding.PosCinco.text.equals("O")&&binding.PosSiete.text.equals("O")){
            //Jugador 1 ganó
            binding.Indicativo.setText("Jugador O ganó")
        }
    }
    fun SeleccionarCasilla() {
        binding.PosUno.setOnClickListener {
            MarcarCasilla(1)
        }
        binding.PosDos.setOnClickListener {
            MarcarCasilla(2)
        }
        binding.PosTres.setOnClickListener {
            MarcarCasilla(3)
        }
        binding.PosCuatro.setOnClickListener {
            MarcarCasilla(4)
        }
        binding.PosCinco.setOnClickListener {
            MarcarCasilla(5)
        }
        binding.PosSeis.setOnClickListener {
            MarcarCasilla(6)
        }
        binding.PosSiete.setOnClickListener {
            MarcarCasilla(7)
        }
        binding.PosOcho.setOnClickListener {
            MarcarCasilla(8)
        }
        binding.PosNueve.setOnClickListener {
            MarcarCasilla(9)
        }
    }
    fun MarcarCasilla(int: Int) {
        var posACambiar=binding.PosUno
        when(int){
            1->{
                posACambiar=binding.PosUno
            }
            2->{
                posACambiar=binding.PosDos
            }
            3->{
                posACambiar=binding.PosTres
            }
            4->{
                posACambiar=binding.PosCuatro
            }
            5->{
                posACambiar=binding.PosCinco
            }
            6->{
                posACambiar=binding.PosSeis
            }
            7->{
                posACambiar=binding.PosSiete
            }
            8->{
                posACambiar=binding.PosOcho
            }
            9->{
                posACambiar=binding.PosNueve
            }
        }

        if(posACambiar.text.equals("-")){
            if(jugadorUno){
                posACambiar.setText("X");
                jugadorUno=false
                binding.Indicativo.setText("Turno jugador O")
                ComprobarGanadorX()
            }else
            {
                posACambiar.setText("O");
                jugadorUno=true
                binding.Indicativo.setText("Turno jugador X")
                ComprobarGanadorO()
            }
        }
    }

}