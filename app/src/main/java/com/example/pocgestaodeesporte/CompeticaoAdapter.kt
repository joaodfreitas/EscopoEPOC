package com.example.pocgestaodeesporte

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CompeticaoAdapter(private val competicoes: List<String>) : RecyclerView.Adapter<CompeticaoAdapter.CompeticaoViewHolder>() {

    class CompeticaoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(android.R.id.text1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CompeticaoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(android.R.layout.simple_list_item_1, parent, false)
        return CompeticaoViewHolder(view)
    }

    override fun onBindViewHolder(holder: CompeticaoViewHolder, position: Int) {
        holder.textView.text = competicoes[position]
    }

    override fun getItemCount(): Int = competicoes.size
}