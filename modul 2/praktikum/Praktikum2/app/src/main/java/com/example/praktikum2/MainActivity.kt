package com.example.praktikum2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*


class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var warnaList: ArrayList<Warna>
    private lateinit var warnaAdapter: WarnaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager= LinearLayoutManager(this)

        warnaList = ArrayList()

        warnaList.add(Warna(R.drawable.merah, "Merah"))
        warnaList.add(Warna(R.drawable.kuning,"Kuning"))
        warnaList.add(Warna(R.drawable.hijau, "Hijau"))
        warnaList.add(Warna(R.drawable.biru, "Biru"))
        warnaList.add(Warna(R.drawable.oren, "Oren"))
        warnaList.add(Warna(R.drawable.ungu, "Ungu"))
        warnaList.add(Warna(R.drawable.hitam,  "Hitam"))
        warnaList.add(Warna(R.drawable.coklat, "Coklat"))

        warnaAdapter= WarnaAdapter(warnaList)
        recyclerView.adapter = warnaAdapter

        warnaAdapter.onItemClick= {
            val intent=Intent(this, DetailActivity::class.java)
            intent.putExtra("warna", it)
            startActivity(intent)
        }
    }
}