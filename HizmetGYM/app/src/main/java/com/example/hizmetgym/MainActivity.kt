package com.example.hizmetgym

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val logo = findViewById<ImageButton>(R.id.Logo)
        logo.setOnClickListener {
            startActivity(Intent(this, MainScreen::class.java))
        }
    }
}