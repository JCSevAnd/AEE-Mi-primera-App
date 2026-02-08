package com.example.mi_primera_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mi_primera_app.databinding.ActivitySobreNosotrosBinding

class SobreNosotrosActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySobreNosotrosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySobreNosotrosBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}