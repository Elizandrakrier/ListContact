package com.example.testandogithub

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testandogithub.databinding.ItemListBinding

class ListAdapter : RecyclerView.Adapter<ListAdapter.ListItemViewHolder>(){

    private val infoList = listOf<InfoContact>(
        InfoContact("Júlia", "119834729883"),
        InfoContact("Júlia", "119834729883"),
        InfoContact("Júlia", "119834729883"),
        InfoContact("Júlia", "119834729883"),
        InfoContact("Júlia", "119834729883"),
        InfoContact("Júlia", "119834729883"),
        InfoContact("Júlia", "119834729883"),
        InfoContact("Júlia", "119834729883"),
        InfoContact("Júlia", "119834729883"),
        InfoContact("Júlia", "119834729883"),
        InfoContact("Júlia", "119834729883"),
        InfoContact("Júlia", "119834729883"),
        InfoContact("Júlia", "119834729883"),
        InfoContact("Júlia", "119834729883"),
        InfoContact("Júlia", "119834729883"),
        InfoContact("Júlia", "119834729883"),
        InfoContact("Júlia", "119834729883"),
        InfoContact("Júlia", "119834729883"),
        InfoContact("Júlia", "119834729883"),
        InfoContact("Júlia", "119834729883"),
        InfoContact("Leandro", "119834479283"),
        InfoContact("Leandro", "119834479283"),
        InfoContact("Leandro", "119834479283"),
        InfoContact("Leandro", "119834479283"),
        InfoContact("Leandro", "119834479283"),
        InfoContact("Leandro", "119834479283"),
        InfoContact("Leandro", "119834479283"),
        InfoContact("Leandro", "119834479283"),
        InfoContact("Leandro", "119834479283"),
        InfoContact("Leandro", "119834479283"),
        InfoContact("Leandro", "119834479283"),
        InfoContact("Leandro", "119834479283"),
        InfoContact("Leandro", "119834479283"),
        InfoContact("Leandro", "119834479283"),
        InfoContact("Leandro", "119834479283"),
        InfoContact("Leandro", "119834479283"),
        InfoContact("Leandro", "119834479283"),
        InfoContact("Leandro", "119834479283"),
        InfoContact("Leandro", "119834479283"),
        InfoContact("Leandro", "119834479283"),
        InfoContact("Leandro", "119834479283"),
        InfoContact("Leandro", "119834479283"),
        InfoContact("Leandro", "119834479283"),
        InfoContact("Leandro", "119834479283"),
        InfoContact("Leandro", "119834479283"),
        InfoContact("Leandro", "119834479283"),
        InfoContact("Leandro", "119834479283"),
        InfoContact("Leandro", "119834479283")
    )


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        return ListItemViewHolder(
            ItemListBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        holder.bind(infoList[position])
    }

    override fun getItemCount(): Int = infoList.size

    class ListItemViewHolder (binding: ItemListBinding) : RecyclerView.ViewHolder(binding.root){
        val nome = binding.txtName
        val numero = binding.txtNumber

        fun bind (infoContact: InfoContact){
            nome.text = infoContact.name
            numero.text = infoContact.number
        }
    }
}