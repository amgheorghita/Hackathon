package com.example.urbangardeningapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AnotherGardenOrGoBack : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another_garden_or_go_back)

        val btnAnotherPlot = findViewById<Button>(R.id.button_offering_a_garden)
        btnAnotherPlot.setOnClickListener {
            val intent = Intent(this, PropertyDetails::class.java)
            startActivity(intent)
        }

        val btnContinue = findViewById<Button>(R.id.button_continue)
        btnContinue.setOnClickListener {
            val intent = Intent(this, Map::class.java)
            startActivity(intent)
        }
    }
}