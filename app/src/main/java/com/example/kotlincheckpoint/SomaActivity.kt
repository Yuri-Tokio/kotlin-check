package com.example.kotlincheckpoint


import android.widget.TextView
import android.os.Bundle
import android.os.PersistableBundle
import android.provider.ContactsContract
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlincheckpoint.adapter.ItemAdapter

class SomaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soma)

        val etN1: TextView = findViewById(R.id.etN1)
        val etN2: TextView = findViewById(R.id.etN2)
        val btIgual: TextView = findViewById(R.id.btIgual)
        val tvResultado: TextView = findViewById(R.id.tvResultado)

        btIgual.setOnClickListener {
            tvResultado.text = "${etN1.text.toString()} + ${etN2.text.toString()} = "+(etN1.text.toString().toDouble()+etN2.text.toString().toDouble()).toString()
        }

        val rvListaSomas:RecyclerView = findViewById(R.id.rvListaSomas)
        rvListaSomas.layoutManager = LinearLayoutManager(this)
        rvListaSomas.adapter = ItemAdapter(Database.listaContas)
    }

    fun registrarConta(valor1:String, valor2:String, resultado:String){
        Database.listaContas.add(Operacao(valor1 = valor1.toDouble(), valor2 = valor2.toDouble(), resultado = resultado.toDouble()))
    }
}