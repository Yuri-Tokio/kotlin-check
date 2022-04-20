package com.example.kotlincheckpoint

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlincheckpoint.adapter.ItemAdapter

class SubtracaoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subtracao)

        val etN1: TextView = findViewById(R.id.etN1Sub)
        val etN2: TextView = findViewById(R.id.etN2Sub)
        val btIgual: TextView = findViewById(R.id.btIgualSub)
        val tvResultado: TextView = findViewById(R.id.tvResultadoSub)

        btIgual.setOnClickListener {
            tvResultado.text = "${etN1.text.toString()} - ${etN2.text.toString()} = "+(etN1.text.toString().toDouble()-etN2.text.toString().toDouble()).toString()
            registrarSubtracao(etN1.text.toString(),etN2.text.toString(),tvResultado.text.toString())
        }

        val rvListaSubtracoes: RecyclerView = findViewById(R.id.rvListaSubtracoes)
        rvListaSubtracoes.layoutManager = LinearLayoutManager(this)
        rvListaSubtracoes.adapter = ItemAdapter(DatabaseSubtracoes.listaSubtracoes)
    }

    fun registrarSubtracao(valor1:String, valor2:String, resultado:String){
        DatabaseSubtracoes.listaSubtracoes.add(Operacao(valor1 = valor1.toDouble(), valor2 = valor2.toDouble(), resultado = resultado.toDouble()))
    }
}