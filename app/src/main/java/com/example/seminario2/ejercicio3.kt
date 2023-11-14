package com.example.seminario2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ListView

class ejercicio3 : AppCompatActivity() {
    private lateinit var editText: EditText
    private lateinit var listView: ListView
    private val textList = mutableListOf<String>()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio3)
        editText = findViewById(R.id.editText)
        listView = findViewById(R.id.listaNueva)
    }

    fun agregarALista(view: View) {
        val texto = editText.text.toString()
        if (texto.isNotEmpty()) {
            textList.add(texto)
            editText.text.clear()
        }
    }

    fun verLista(view: View) {
        val intent = Intent(this, nuevaActividad::class.java)
        intent.putStringArrayListExtra("textList", ArrayList(textList))
        startActivity(intent)
    }

    fun volver(view: View) {
        finish()
    }
}
