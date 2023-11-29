package com.example.threadexchange

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializar vistas y manejar eventos aquí
    }

    fun goToCreditActivity(view: View) {
        //crear el intent
        val intent = Intent(this@MainActivity, CreditActivity::class.java)
        //tomar el valor del cuadro de texto.
        val etNombre = this.findViewById<EditText>(R.id.eTnombre)
        intent.putExtra("nombre", etNombre.text.toString())
        //iniciar la nueva actividad
        startActivity(intent)
    }
}