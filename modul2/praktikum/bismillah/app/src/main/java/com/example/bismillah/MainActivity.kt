package com.example.bismillah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlin.collections.List
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cardAdaptor()

    }

    private fun cardAdaptor(){
        val card = listOf<ModelAdapter>(
            ModelAdapter(1,"Andi", R.drawable.human),
            ModelAdapter(2,"Anton", R.drawable.human),
            ModelAdapter(3,"Aris", R.drawable.human),
            ModelAdapter(4,"Jono", R.drawable.human),
            ModelAdapter(5,"Joni", R.drawable.human)
        )
        val mainadapter = MainAdapter(card, object : MainAdapter.OnAdapterListener{
            override fun onClick(model: ModelAdapter) {
                val tampil = "Halo, $(model.name)"
                Toast.makeText(applicationContext, tampil, Toast.LENGTH_SHORT).show()
            }
        })
        findViewById<RecyclerView>(R.id.recyclerView).adapter = mainadapter
    }

}

