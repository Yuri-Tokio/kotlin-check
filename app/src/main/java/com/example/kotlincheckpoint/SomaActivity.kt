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

        val etN1: TextView = findViewById(R.id.etN1Som)
        val etN2: TextView = findViewById(R.id.etN2Som)
        val btIgual: TextView = findViewById(R.id.btIgualSom)
        val tvResultado: TextView = findViewById(R.id.tvResultadoSom)

        btIgual.setOnClickListener {
            tvResultado.text = "${etN1.text.toString()} + ${etN2.text.toString()} = "+(etN1.text.toString().toDouble()+etN2.text.toString().toDouble()).toString()
            registrarConta(etN1.text.toString(),etN2.text.toString(),tvResultado.text.toString())
        }


        val rvListaSomas:RecyclerView = findViewById(R.id.rvListaSomas)
        rvListaSomas.layoutManager = LinearLayoutManager(this)
        rvListaSomas.adapter = ItemAdapter(DatabaseSomas.listaSomas)
    }

    fun registrarConta(valor1:String, valor2:String, resultado:String){
        DatabaseSomas.listaSomas.add(Operacao(valor1 = valor1, valor2 = valor2, resultado = resultado))
    }
}