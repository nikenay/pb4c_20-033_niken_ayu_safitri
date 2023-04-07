package com.example.praktikum2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView


class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val warna = intent.getParcelableExtra<Warna>("warna")
        if (warna != null) {
            val textView: TextView = findViewById(R.id.detailActivityTv)
            val imageView: ImageView = findViewById(R.id.detailActivityIv)

            textView.text = warna.name
            imageView.setImageResource(warna.image)

        }
    }
}

