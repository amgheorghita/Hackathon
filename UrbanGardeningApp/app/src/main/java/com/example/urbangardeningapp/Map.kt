package com.example.urbangardeningapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Map : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        val btnChoose = findViewById<Button>(R.id.button_choose)
        btnChoose.setOnClickListener {
            val intent = Intent(this, GardenView::class.java)
            startActivity(intent)
        }
    }
}