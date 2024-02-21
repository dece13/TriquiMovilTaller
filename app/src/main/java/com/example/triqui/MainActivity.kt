package com.example.triqui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.VISIBLE
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import com.example.triqui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private  var jugadorUno: Boolean=true
    private var enJuego: Boolean=true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if(enJuego){
            binding.Repetir.visibility = View.INVISIBLE
        }
        SeleccionarCasilla()
        Repetir()




    }
    fun Repetir() {
        binding.Repetir.setOnClickListener {
            binding.Indicativo.text="Turno jugador X"
            jugadorUno=true
            binding.PosUno.text = "-"
            binding.PosDos.text = "-"
            binding.PosTres.text = "-"
            binding.PosCuatro.text = "-"
            binding.PosCinco.text = "-"
            binding.PosSeis.text = "-"
            binding.PosSiete.text = "-"
            binding.PosOcho.text = "-"
            binding.PosNueve.text = "-"
            enJuego=true
            binding.Repetir.visibility = View.INVISIBLE

        }
    }

    fun ComprobarGanadorX() {
        //Comprobacion Horizontal
        if (binding.PosUno.text.equals("X")&&binding.PosDos.text.equals("X")&&binding.PosTres.text.equals("X")){
            //Jugador 1 ganó
            binding.Indicativo.text = "Jugador X ganó"
            enJuego=false
            binding.Repetir.visibility = View.VISIBLE
        }
        if (binding.PosCuatro.text.equals("X")&&binding.PosCinco.text.equals("X")&&binding.PosSeis.text.equals("X")){
            //Jugador 1 ganó
            binding.Indicativo.text = "Jugador X ganó"
            enJuego=false
            binding.Repetir.visibility = View.VISIBLE
        }
        if (binding.PosSiete.text.equals("X")&&binding.PosOcho.text.equals("X")&&binding.PosNueve.text.equals("X")){
            //Jugador 1 ganó
            binding.Indicativo.text = "Jugador X ganó"
            binding.Repetir.visibility = View.VISIBLE
            enJuego=false
        }
        //Comprobacion Vertical
        if (binding.PosUno.text.equals("X")&&binding.PosCuatro.text.equals("X")&&binding.PosSiete.text.equals("X")){
            //Jugador 1 ganó
            binding.Indicativo.text = "Jugador X ganó"
            binding.Repetir.visibility = View.VISIBLE
            enJuego=false
        }
        if (binding.PosDos.text.equals("X")&&binding.PosCinco.text.equals("X")&&binding.PosOcho.text.equals("X")){
            //Jugador 1 ganó
            binding.Indicativo.text = "Jugador X ganó"
            binding.Repetir.visibility = View.VISIBLE
            enJuego=false
        }
        if (binding.PosTres.text.equals("X")&&binding.PosSeis.text.equals("X")&&binding.PosNueve.text.equals("X")){
            //Jugador 1 ganó
            binding.Indicativo.text = "Jugador X ganó"
            binding.Repetir.visibility = View.VISIBLE
            enJuego=false
        }
        //Comprobacion Diagonal
        if (binding.PosUno.text.equals("X")&&binding.PosCinco.text.equals("X")&&binding.PosNueve.text.equals("X")){
            //Jugador 1 ganó
            binding.Indicativo.text = "Jugador X ganó"
            binding.Repetir.visibility = View.VISIBLE
            enJuego=false
        }
        if (binding.PosTres.text.equals("X")&&binding.PosCinco.text.equals("X")&&binding.PosSiete.text.equals("X")){
            //Jugador 1 ganó
            binding.Indicativo.text = "Jugador X ganó"
            binding.Repetir.visibility = View.VISIBLE
            enJuego=false
        }
    }
    fun ComprobarGanadorO() {
        //Comprobacion Horizontal
        if (binding.PosUno.text.equals("O")&&binding.PosDos.text.equals("O")&&binding.PosTres.text.equals("O")){
            //Jugador 1 ganó
            binding.Indicativo.text = "Jugador O ganó"
            binding.Repetir.visibility = View.VISIBLE
            enJuego=false
        }
        if (binding.PosCuatro.text.equals("O")&&binding.PosCinco.text.equals("O")&&binding.PosSeis.text.equals("O")){
            //Jugador 1 ganó
            binding.Indicativo.text = "Jugador O ganó"
            binding.Repetir.visibility = View.VISIBLE
            enJuego=false
        }
        if (binding.PosSiete.text.equals("O")&&binding.PosOcho.text.equals("O")&&binding.PosNueve.text.equals("O")){
            //Jugador 1 ganó
            binding.Indicativo.text = "Jugador O ganó"
            binding.Repetir.visibility = View.VISIBLE
            enJuego=false
        }
        //Comprobacion Vertical
        if (binding.PosUno.text.equals("O")&&binding.PosCuatro.text.equals("O")&&binding.PosSiete.text.equals("O")){
            //Jugador 1 ganó
            binding.Indicativo.text = "Jugador O ganó"
            binding.Repetir.visibility = View.VISIBLE
            enJuego=false
        }
        if (binding.PosDos.text.equals("O")&&binding.PosCinco.text.equals("O")&&binding.PosOcho.text.equals("O")){
            //Jugador 1 ganó
            binding.Indicativo.text = "Jugador O ganó"
            binding.Repetir.visibility = View.VISIBLE
            enJuego=false
        }
        if (binding.PosTres.text.equals("O")&&binding.PosSeis.text.equals("O")&&binding.PosNueve.text.equals("O")){
            //Jugador 1 ganó
            binding.Indicativo.text = "Jugador O ganó"
            binding.Repetir.visibility = View.VISIBLE
            enJuego=false
        }
        //Comprobacion Diagonal
        if (binding.PosUno.text.equals("O")&&binding.PosCinco.text.equals("O")&&binding.PosNueve.text.equals("O")){
            //Jugador 1 ganó
            binding.Indicativo.text = "Jugador O ganó"
            binding.Repetir.visibility = View.VISIBLE
            enJuego=false
        }
        if (binding.PosTres.text.equals("O")&&binding.PosCinco.text.equals("O")&&binding.PosSiete.text.equals("O")){
            //Jugador 1 ganó
            binding.Indicativo.text = "Jugador O ganó"
            binding.Repetir.visibility = View.VISIBLE
            enJuego=false
        }
    }
    fun FinalJuego() {

    }

    fun Empate(): Boolean {
        var empatados=true
        if(binding.PosUno.text.equals("-")||binding.PosDos.text.equals("-")||binding.PosTres.text.equals("-")||binding.PosCuatro.text.equals("-")||binding.PosCinco.text.equals("-")||binding.PosSeis.text.equals("-")||binding.PosSiete.text.equals("-")||binding.PosOcho.text.equals("-")||binding.PosNueve.text.equals("-")){
            empatados=false
        }
        return empatados
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

        if(posACambiar.text.equals("-")&&enJuego){
            if(jugadorUno){
                posACambiar.text = "X";
                jugadorUno=false
                binding.Indicativo.text = "Turno jugador O"
                if(Empate()==true){
                    binding.Indicativo.text="Hubo empate"
                    binding.Repetir.visibility = View.VISIBLE
                    enJuego=false
                }
                ComprobarGanadorX()
            }else{

                posACambiar.text = "O";
                jugadorUno=true
                binding.Indicativo.text = "Turno jugador X"
                if(Empate()==true){
                    binding.Indicativo.text="Hubo empate"
                    binding.Repetir.visibility = View.VISIBLE
                    enJuego=false
                }
                ComprobarGanadorO()
            }
        }
    }

}