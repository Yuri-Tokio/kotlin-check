package com.example.kotlincheckpoint

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SubtracaoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subtracao)

        val etN1: TextView = findViewById(R.id.etN1)
        val etN2: TextView = findViewById(R.id.etN2)
        val btIgual: TextView = findViewById(R.id.btIgual)
        val tvResultado: TextView = findViewById(R.id.tvResultado)

        btIgual.setOnClickListener {
            tvResultado.text = "${etN1.text.toString()} - ${etN2.text.toString()} = "+(etN1.text.toString().toDouble()-etN2.text.toString().toDouble()).toString()
        }

    }
}