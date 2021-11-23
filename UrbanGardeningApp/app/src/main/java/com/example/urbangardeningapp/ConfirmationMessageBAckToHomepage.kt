package com.example.urbangardeningapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ConfirmationMessageBAckToHomepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmation_message_back_to_homepage)

        val btnAnotherPlot = findViewById<Button>(R.id.button_book_another)
        btnAnotherPlot.setOnClickListener {
            val intent = Intent(this, Map::class.java)
            startActivity(intent)
        }

        val btnContinue = findViewById<Button>(R.id.button_profile)
        btnContinue.setOnClickListener {

        }
    }
}