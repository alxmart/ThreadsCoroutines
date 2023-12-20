package com.luizafmartinez.threadscoroutines

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.luizafmartinez.threadscoroutines.databinding.ActivityMainBinding
import com.luizafmartinez.threadscoroutines.databinding.ActivitySegundaBinding

class SegundaActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivitySegundaBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnFechar.setOnClickListener {
            finish()
        }




    }
}