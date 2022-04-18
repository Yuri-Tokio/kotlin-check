package com.example.kotlincheckpoint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView

class tela2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soma)

        val etPrimeiroSomado: EditText = findViewById(R.id.primeiroSomado)
        val etSegundoSomado: EditText = findViewById(R.id.segundoSomado)
        val tvResultadoSoma: TextView = findViewById(R.id.resultadoSoma)
        val btSomar: TextView = findViewById(R.id.btSomar)

        fun atualizarTela(saida:TextView)
        }
    }
}