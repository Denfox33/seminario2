package com.example.seminario2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //iniciar 3 en raya
    fun iniciarActividad (view : View){
        val intent = Intent(this, TresEnRayaActivity::class.java).apply {  }
        startActivity(intent)
    }

    //iniciear ejercicio 2
    // Función para iniciar actividad ejercicio3
    fun iniciarEjercicio2(view: View) {
        val intent = Intent(this, ejercicio2::class.java)
        startActivity(intent)
    }

    // Iniciar ejercicio 3
    fun  inicarEjercicio3(view: View) {
        val intent = Intent(this, ejercicio3::class.java)
        startActivity(intent)
    }
    // iniciar ejercicio 4
    fun iniciarEjericicio4 (view: View) {
        val intent = Intent(this, ejercicio4::class.java)
        startActivity(intent)
    }
     // iniciar la maqueta 1
    fun iniciarMaqueta1 (view: View) {
        val intent = Intent(this, maqueta1::class.java)
        startActivity(intent)
    }

    //iniciar maqueta 3
    fun iniciarMaqueta3 (view: View) {
        val intent = Intent(this, maqueta3::class.java)
        startActivity(intent)
    }

    // iniciar maqueta 4
    fun iniciarMaqueta4 (view: View) {
        val intent = Intent(this, maqueta4::class.java)
        startActivity(intent)
    }

    // iniciar maqueta 5
    fun iniciarMaqueta5 (view: View) {
        val intent = Intent(this, maqueta5::class.java)
        startActivity(intent)
    }

}