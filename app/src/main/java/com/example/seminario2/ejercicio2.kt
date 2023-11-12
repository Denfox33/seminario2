package com.example.seminario2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ejercicio2 : AppCompatActivity() {
    private lateinit var texto1EditText: EditText
    private lateinit var ingresaDatosButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio2)

        texto1EditText = findViewById(R.id.textoMostrado)
        ingresaDatosButton = findViewById(R.id.ingresasDatos)
        val textoMostrado = findViewById<TextView>(R.id.textoMostrado)

        ingresaDatosButton.setOnClickListener {
            val textoIngresado = texto1EditText.text.toString()
            val numeroIngresado = 11 // Número que introducimos

            val textoAMostrar = "Texto ingresado: $textoIngresado\nNúmero ingresado: $numeroIngresado"
            textoMostrado.text = textoAMostrar
        }
    }

    // Volver al menú
    fun volver(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}