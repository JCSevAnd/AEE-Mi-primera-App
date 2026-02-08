package com.example.mi_primera_app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mi_primera_app.databinding.ActivityContactoBinding

class ContactoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityContactoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityContactoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEnviar.setOnClickListener {
            val nombre = binding.etNombre.text.toString()
            val email = binding.etEmail.text.toString()
            val mensaje = binding.etMensaje.text.toString()

            val infoContacto = "De: $nombre ($email) - Mensaje: $mensaje"

            val resultIntent = Intent()
            resultIntent.putExtra("DATOS_FORMULARIO", infoContacto)

            setResult(RESULT_OK, resultIntent)

            finish()
        }
    }
}