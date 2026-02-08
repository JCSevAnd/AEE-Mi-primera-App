package com.example.mi_primera_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mi_primera_app.databinding.ActivityLocalizacionBinding

class LocalizacionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLocalizacionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLocalizacionBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}