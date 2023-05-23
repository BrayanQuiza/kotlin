package com.adsi.aplicacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private fun ingresarNombre() {
        val lblNombre:TextView=findViewById(R.id.lblusuario)
        val campoNombre:EditText = findViewById(R.id.txtNombre)
        var nombre = campoNombre.text
        lblNombre.text = nombre

        Toast.makeText(this, "Bienvenid@ $nombre", Toast.LENGTH_SHORT).show()   }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton1: Button = findViewById(R.id.btnBoton)
        boton1.setOnClickListener { ingresarNombre() }

    }
}