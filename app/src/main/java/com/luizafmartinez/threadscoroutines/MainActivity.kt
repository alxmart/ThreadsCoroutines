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

            MinhaThread().start()
            /*
            repeat(15) { indice ->
                Log.i("info_thread", "Executando: $indice T: ${Thread.currentThread().name}")
                Thread.sleep(1000)// Equivale a 1 segundo / total: 30 seg exec
            }
            */
        }
    }

    inner class MinhaThread : Thread() {
        override fun run() {
            super.run()

            repeat(30) { indice ->
                Log.i("info_thread", "Executando: $indice T: ${currentThread().name}")
                sleep(1000)// Equivale a 1 segundo / total: 30 seg exec
            }

        }
    }

}
