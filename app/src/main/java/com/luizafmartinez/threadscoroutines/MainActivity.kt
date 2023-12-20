package com.luizafmartinez.threadscoroutines

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.luizafmartinez.threadscoroutines.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnAbrir.setOnClickListener {
            startActivity(
                Intent(this, SegundaActivity::class.java)
            )
        }

        binding.btnIniciar.setOnClickListener {

            repeat(30) { indice ->
                Log.i("info_thread", "Executando: $indice")
                Thread.sleep(1000)  // 1000 ms = 1 segundo
            }
        }

    }

    inner class MinhaClasse : Thread() {

        override fun run() {
            super.run()



        }

    }

}











