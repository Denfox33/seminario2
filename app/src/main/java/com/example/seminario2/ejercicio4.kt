package com.example.seminario2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ejercicio4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio4)

        val nombrePais = findViewById<TextView>(R.id.nombrePais)
        val banderaPais = findViewById<ImageView>(R.id.banderaPais)
        val habitantesPais = findViewById<TextView>(R.id.habitantesPais)

        val botonEsp = findViewById<Button>(R.id.Esp)
        val botonFran = findViewById<Button>(R.id.Fran)

        botonEsp.setOnClickListener {
            // Cuando se presiona el botón "España"
            nombrePais.text = "España"
            banderaPais.setImageResource(R.drawable.esp)
            habitantesPais.text = "47,000,000 habitantes"

            // Mostrar las vistas correspondientes
            nombrePais.visibility = View.VISIBLE
            banderaPais.visibility = View.VISIBLE
            habitantesPais.visibility = View.VISIBLE



        }

        botonFran.setOnClickListener {
            // Cuando se presiona el botón "Francia"
            nombrePais.text = "Francia"
            banderaPais.setImageResource(R.drawable.fra)
            habitantesPais.text = "67,000,000 habitantes"

            // Mostrar las vistas correspondientes
            nombrePais.visibility = View.VISIBLE
            banderaPais.visibility = View.VISIBLE
            habitantesPais.visibility = View.VISIBLE


        }
    }
}
