package com.example.kotlincheckpoint

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



        val rvListaSomas:RecyclerView = findViewById(R.id.rvListaSomas)
        rvListaSomas.layoutManager = LinearLayoutManager(this)
        rvListaSomas.adapter = ItemAdapter(Database.listaContas)
    }

    fun registrarConta(valor1:String, valor2:String, resultado:String){
        Database.listaContas.add(Operacao(valor1 = valor1.toDouble(), valor2 = valor2.toDouble(), resultado = resultado.toDouble()))
    }
}