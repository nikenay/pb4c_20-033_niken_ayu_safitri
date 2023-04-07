package com.example.praktikum2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class WarnaAdapter(private val warnaList:ArrayList<Warna> )
    : RecyclerView.Adapter<WarnaAdapter.WarnaViewHolder>(){

    var onItemClick : ((Warna) -> Unit)? = null

    class WarnaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView: ImageView= itemView.findViewById(R.id.imageView)
        val textView: TextView=itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WarnaAdapter.WarnaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_warna, parent, false)
        return WarnaViewHolder(view)
    }

    override fun onBindViewHolder(holder: WarnaViewHolder, position: Int) {
        val warna = warnaList[position]
        holder.imageView.setImageResource(warna.image)
        holder.textView.text = warna.name

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(warna)
        }
    }

    override fun getItemCount(): Int {
        return warnaList.size
    }

}