package com.example.urbangardeningapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GardenView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_garden_view)

        val btnChoose = findViewById<Button>(R.id.button_book)
        btnChoose.setOnClickListener {
            val intent = Intent(this, ConfirmationMessageBAckToHomepage::class.java)
            startActivity(intent)
        }
    }
}