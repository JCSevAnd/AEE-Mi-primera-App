package com.example.mi_primera_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import com.example.mi_primera_app.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val usuario = binding.etUsuario.text.toString()
            val password = binding.etPassword.text.toString()

            if (usuario.isNotEmpty()) {
                val intent = Intent(this, InicioActivity::class.java)

                intent.putExtra("EXTRA_USUARIO", usuario)

                startActivity(intent)
            }
        }
    }
}