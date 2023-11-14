package com.example.seminario2

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat


class TresEnRayaActivity  : AppCompatActivity() {

    private lateinit var botton1 : Button
    private lateinit var botton2 : Button
    private lateinit var botton3 : Button
    private lateinit var botton4 : Button
    private lateinit var botton5 : Button
    private lateinit var botton6 : Button
    private lateinit var botton7 : Button
    private lateinit var botton8 : Button
    private lateinit var botton9 : Button

    private lateinit var fondoComun: Drawable




    var boton1: Boolean = false
    var turno_ma: Boolean = false
    var boton2: Boolean = false
    var boton3: Boolean = false
    var boton4: Boolean = false
    var boton5: Boolean = false
    var boton6: Boolean = false
    var boton7: Boolean = false
    var boton8: Boolean = false
    var boton9: Boolean = false
    var partida_fin: Boolean = false
    private lateinit var boton_reinicio : Button
    private lateinit var texto : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_3_en_raya)

        fondoComun = ColorDrawable(ContextCompat.getColor(this, R.color.black))

        botton1 = findViewById<Button>(R.id.button1)
        botton2 = findViewById<Button>(R.id.button2)
        botton3 = findViewById<Button>(R.id.button3)
        botton4 = findViewById<Button>(R.id.button4)
        botton5 = findViewById<Button>(R.id.button5)
        botton6 = findViewById<Button>(R.id.button6)
        botton7 = findViewById<Button>(R.id.button7)
        botton8 = findViewById<Button>(R.id.button8)
        botton9 = findViewById<Button>(R.id.button9)

        // reiniciar el juego al pulsar el boton
        boton_reinicio = findViewById<Button>(R.id.btnReset)


        boton_reinicio.setOnClickListener {
            // metodo que reinicia la activad
            recreate()
        }

        // varaible escribir el resultado
        texto  = findViewById<TextView>(R.id.textView)

        // crear bloqueo de botones para no poder sobre escribir

        // crear una matriz de booleanos para bloquear que el jugador no puede sobre escribir a la maquina
        botton1.setOnClickListener {
            if(partida_fin!=true) {

                if (!partida_fin && fondoComun is ColorDrawable) {
                    botton1.setBackgroundResource(R.drawable.x)
                    boton1 = true
                    turno_ma = true
                    comprobarResultado()
                    turno_maquina()
                }
            }

        }
        botton2.setOnClickListener {
            if (!partida_fin && fondoComun is ColorDrawable) {
                botton2.setBackgroundResource(R.drawable.x)
                boton2 = true
                turno_ma = true
                comprobarResultado()
                turno_maquina()
            }
        }

        botton3.setOnClickListener {
            if (!partida_fin && fondoComun is ColorDrawable) {
                botton3.setBackgroundResource(R.drawable.x)
                boton3 = true
                turno_ma = true
                comprobarResultado()
                turno_maquina()
            }
        }

        botton4.setOnClickListener {
            if (!partida_fin && fondoComun is ColorDrawable) {
                botton4.setBackgroundResource(R.drawable.x)
                boton4 = true
                turno_ma = true
                comprobarResultado()
                turno_maquina()
            }
        }

        botton5.setOnClickListener {
            if (!partida_fin && fondoComun is ColorDrawable) {
                botton5.setBackgroundResource(R.drawable.x)
                boton5 = true
                turno_ma = true
                comprobarResultado()
                turno_maquina()
            }
        }

        botton6.setOnClickListener {
            if (!partida_fin && fondoComun is ColorDrawable) {
                botton6.setBackgroundResource(R.drawable.x)
                boton6 = true
                turno_ma = true
                comprobarResultado()
                turno_maquina()
            }
        }

        botton7.setOnClickListener {
            if (!partida_fin && fondoComun is ColorDrawable) {
                botton7.setBackgroundResource(R.drawable.x)
                boton7 = true
                turno_ma = true
                comprobarResultado()
                turno_maquina()
            }
        }

        botton8.setOnClickListener {
            if (!partida_fin && fondoComun is ColorDrawable) {
                botton8.setBackgroundResource(R.drawable.x)
                boton8 = true
                turno_ma = true
                comprobarResultado()
                turno_maquina()
            }
        }

        botton9.setOnClickListener {
            if (!partida_fin && fondoComun is ColorDrawable) {
                botton9.setBackgroundResource(R.drawable.x)
                boton9 = true
                turno_ma = true
                comprobarResultado()
                turno_maquina()
            }
        }


        boton_reinicio.setOnClickListener{
            recreate()
        }

    }


    fun comprobarResultado(){
        if (botton1.background == ContextCompat.getDrawable(this, R.drawable.x) && botton2.background.constantState == ContextCompat.getDrawable(this, R.drawable.x)?.constantState && botton3.background.constantState == ContextCompat.getDrawable(this, R.drawable.x)?.constantState ||
            botton4.background == ContextCompat.getDrawable(this, R.drawable.x) && botton5.background.constantState == ContextCompat.getDrawable(this, R.drawable.x)?.constantState && botton6.background.constantState == ContextCompat.getDrawable(this, R.drawable.x)?.constantState ||
            botton7.background == ContextCompat.getDrawable(this, R.drawable.x) && botton8.background.constantState == ContextCompat.getDrawable(this, R.drawable.x)?.constantState && botton9.background.constantState == ContextCompat.getDrawable(this, R.drawable.x)?.constantState ||
            botton1.background == ContextCompat.getDrawable(this, R.drawable.x) && botton5.background.constantState == ContextCompat.getDrawable(this, R.drawable.x)?.constantState && botton9.background.constantState == ContextCompat.getDrawable(this, R.drawable.x)?.constantState ||
            botton3.background == ContextCompat.getDrawable(this, R.drawable.x) && botton5.background.constantState == ContextCompat.getDrawable(this, R.drawable.x)?.constantState && botton7.background.constantState == ContextCompat.getDrawable(this, R.drawable.x)?.constantState ||
            botton1.background == ContextCompat.getDrawable(this, R.drawable.x) && botton4.background.constantState == ContextCompat.getDrawable(this, R.drawable.x)?.constantState && botton7.background.constantState == ContextCompat.getDrawable(this, R.drawable.x)?.constantState ||
            botton2.background == ContextCompat.getDrawable(this, R.drawable.x) && botton5.background.constantState == ContextCompat.getDrawable(this, R.drawable.x)?.constantState && botton8.background.constantState == ContextCompat.getDrawable(this, R.drawable.x)?.constantState ||
            botton3.background == ContextCompat.getDrawable(this, R.drawable.x) && botton6.background.constantState == ContextCompat.getDrawable(this, R.drawable.x)?.constantState && botton9.background.constantState == ContextCompat.getDrawable(this, R.drawable.x)?.constantState){
            texto.text = "Has ganado"
            partida_fin = true
        } else if (botton1.background.constantState == ContextCompat.getDrawable(this, R.drawable.circulo)?.constantState && botton2.background.constantState == ContextCompat.getDrawable(this, R.drawable.circulo)?.constantState && botton3.background.constantState == ContextCompat.getDrawable(this, R.drawable.circulo)?.constantState ||
            botton4.background.constantState == ContextCompat.getDrawable(this, R.drawable.circulo)?.constantState && botton5.background.constantState == ContextCompat.getDrawable(this, R.drawable.circulo)?.constantState && botton6.background.constantState == ContextCompat.getDrawable(this, R.drawable.circulo)?.constantState ||
            botton7.background.constantState == ContextCompat.getDrawable(this, R.drawable.circulo)?.constantState && botton8.background.constantState == ContextCompat.getDrawable(this, R.drawable.circulo)?.constantState && botton9.background.constantState == ContextCompat.getDrawable(this, R.drawable.circulo)?.constantState ||
            botton1.background.constantState == ContextCompat.getDrawable(this, R.drawable.circulo)?.constantState && botton5.background.constantState == ContextCompat.getDrawable(this, R.drawable.circulo)?.constantState && botton9.background.constantState == ContextCompat.getDrawable(this, R.drawable.circulo)?.constantState ||
            botton3.background.constantState == ContextCompat.getDrawable(this, R.drawable.circulo)?.constantState && botton5.background.constantState == ContextCompat.getDrawable(this, R.drawable.circulo)?.constantState && botton7.background.constantState == ContextCompat.getDrawable(this, R.drawable.circulo)?.constantState ||
            botton1.background.constantState == ContextCompat.getDrawable(this, R.drawable.circulo)?.constantState && botton4.background.constantState == ContextCompat.getDrawable(this, R.drawable.circulo)?.constantState && botton7.background.constantState == ContextCompat.getDrawable(this, R.drawable.circulo)?.constantState ||
            botton2.background.constantState == ContextCompat.getDrawable(this, R.drawable.circulo)?.constantState && botton5.background.constantState == ContextCompat.getDrawable(this, R.drawable.circulo)?.constantState && botton8.background.constantState == ContextCompat.getDrawable(this, R.drawable.circulo)?.constantState ||
            botton3.background.constantState == ContextCompat.getDrawable(this, R.drawable.circulo)?.constantState && botton6.background.constantState == ContextCompat.getDrawable(this, R.drawable.circulo)?.constantState && botton9.background.constantState == ContextCompat.getDrawable(this, R.drawable.circulo)?.constantState){
            texto.text = "Has perdido"
            partida_fin = true
        }
    }


    fun turno_maquina() {
        if (!partida_fin ) {
            val fondoMaquina = ContextCompat.getDrawable(this, R.drawable.circulo)

            if (!boton1) {
                botton1.background = fondoMaquina
                boton1 = true
                comprobarResultado()
            } else if (!boton2) {
                botton2.background = fondoMaquina
                boton2 = true
                comprobarResultado()
            } else if (!boton3) {
                botton3.background = fondoMaquina
                boton3 = true
                comprobarResultado()
            } else if (!boton4) {
                botton4.background = fondoMaquina
                boton4 = true
                comprobarResultado()
            } else if (!boton5) {
                botton5.background = fondoMaquina
                boton5 = true
                comprobarResultado()
            } else if (!boton6) {
                botton6.background = fondoMaquina
                boton6 = true
                comprobarResultado()
            } else if (!boton7) {
                botton7.background = fondoMaquina
                boton7 = true
                comprobarResultado()
            } else if (!boton8) {
                botton8.background = fondoMaquina
                boton8 = true
                comprobarResultado()
            } else if (!boton9) {
                botton9.background = fondoMaquina
                boton9 = true
                comprobarResultado()
            }
        }
        /*comprobarResultado()*/

        }

    //volver al menu
    fun volver (view : View){
        val intent = Intent(this, MainActivity::class.java).apply {  }
        startActivity(intent)
    }

}