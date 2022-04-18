package com.example.kotlincheckpoint.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlincheckpoint.R
import com.example.kotlincheckpoint.Operacao

class ItemAdapter(val dados:List<Operacao>):RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class  ItemViewHolder(view: View):RecyclerView.ViewHolder(view){
        val tvItemValor1:TextView = view.findViewById(R.id.tvItemValor1)
        val tvItemValor2:TextView = view.findViewById(R.id.tvItemValor2)
        val tvItemResultado:TextView = view.findViewById(R.id.tvItemResultado)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_lista,parent,false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val operacao = dados[position]
        holder.tvItemValor2.text = operacao.valor2.toString()
        holder.tvItemValor1.text = operacao.valor1.toString()
        holder.tvItemResultado.text = operacao.resultado.toString()
    }

    override fun getItemCount(): Int {
        return dados.size
    }

}
