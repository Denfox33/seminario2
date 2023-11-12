package com.example.seminario2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView


class nuevaActividad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nueva_actividad)

        val textList = intent.getStringArrayListExtra("textList")

        // Verificar si textList no es nulo antes de usarlo
        if (textList != null) {
            val listView = findViewById<ListView>(R.id.listaNueva)
            val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, textList)
            listView.adapter = adapter
        }
    }
}






