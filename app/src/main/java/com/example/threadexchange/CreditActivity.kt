package com.example.threadexchange

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CreditActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_credit)

        // Obtener una referencia al TextView en el layout
        val tvInfo = findViewById<TextView>(R.id.tvMessage)

        // Recoger el nombre de la aplicación del intent
        val nombreUsuario = intent.getStringExtra("nombre")
        // Crear la cadena del saludo
        tvInfo.text = getString(R.string.info,nombreUsuario)

        // Configurar el botón de contacto
        val contactarButton: Button = findViewById(R.id.Contactar)
        contactarButton.setOnClickListener {
            enviarCorreoConsulta(nombreUsuario)
        }
    }

    private fun enviarCorreoConsulta(nombreApp: String?) {
        val direccionCorreo = "tudirecciondecorreo@example.com"
        val asunto = "Consulta de la app $nombreApp"

        // Crear un intent implícito para enviar correo electrónico
        val intent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("mailto:$direccionCorreo")
            putExtra(Intent.EXTRA_SUBJECT, asunto)
        }
        startActivity(intent)
    }
}
