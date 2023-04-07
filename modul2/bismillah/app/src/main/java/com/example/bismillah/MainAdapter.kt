package com.example.bismillah

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainAdapter(
    private val listName: List<ModelAdapter>,
    private val listener: OnAdapterListener

) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.card_main, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MainAdapter.ViewHolder, position: Int) {

        val model = listName[position]
        holder.imageView.setImageResource(model.image)
        holder.textView.text = model.name
        holder.itemView.setOnClickListener {
            listener.onClick(model)
        }

    }

    override fun getItemCount(): Int {
        return listName.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView = view.findViewById<TextView>(R.id.textView)
        val imageView = view.findViewById<ImageView>(R.id.imageView)
    }

    interface OnAdapterListener {
        fun onClick(model: ModelAdapter)
    }
}