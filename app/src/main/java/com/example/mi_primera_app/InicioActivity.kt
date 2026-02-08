package com.example.mi_primera_app

import android.content.Intent
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.mi_primera_app.databinding.ActivityInicioBinding

class InicioActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInicioBinding

    private val contactoResultLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == RESULT_OK) {
            val datos = result.data?.getStringExtra("DATOS_FORMULARIO")
            binding.tvDatosRecibidos.text = datos
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInicioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nombreUsuario = intent.getStringExtra("EXTRA_USUARIO")
        binding.tvBienvenida.text = "Bienvenido, $nombreUsuario"

        binding.btnContacto.setOnClickListener {
            val intent = Intent(this, ContactoActivity::class.java)
            contactoResultLauncher.launch(intent)
        }

        binding.btnSobreNosotros.setOnClickListener {
            val intent = Intent(this, SobreNosotrosActivity::class.java)
            startActivity(intent)
        }

        binding.btnLocalizacion.setOnClickListener {
            val intent = Intent(this, LocalizacionActivity::class.java)
            startActivity(intent)
        }
    }
}