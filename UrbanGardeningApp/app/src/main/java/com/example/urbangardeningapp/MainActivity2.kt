package com.example.urbangardeningapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnOfferGarden = findViewById<Button>(R.id.button_offering_a_garden)
        btnOfferGarden.setOnClickListener {
            val intent = Intent(this, PropertyDetails::class.java)
            startActivity(intent)
        }
        val btnSeekingGarden = findViewById<Button>(R.id.looking_for_a_garden)
        btnSeekingGarden.setOnClickListener {
            val intent = Intent(this, Map::class.java)
            startActivity(intent)
        }
    }

}