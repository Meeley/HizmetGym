package com.example.hizmetgym

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_screen)
        val logo = findViewById<ImageButton>(R.id.önkafa)
        logo.setOnClickListener {
            startActivity(Intent(this, exercises::class.java))
        }
        val logo2 = findViewById<ImageButton>(R.id.öngöğüs)
        logo2.setOnClickListener {
            startActivity(Intent(this, exercises::class.java))
        }
        val logo3 = findViewById<ImageButton>(R.id.önkarin)
        logo3.setOnClickListener {
            startActivity(Intent(this, exercises::class.java))
        }
        val logo4 = findViewById<ImageButton>(R.id.önkollar)
        logo4.setOnClickListener {
            startActivity(Intent(this, exercises::class.java))
        }
        val logo5 = findViewById<ImageButton>(R.id.önbacak)
        logo5.setOnClickListener {
            startActivity(Intent(this, exercises::class.java))
        }
       val logo6=  findViewById<ImageButton>(R.id.dön)
        logo6.setOnClickListener {
            startActivity(Intent(this, MainScreena::class.java))
        }
        findViewById<Button>(R.id.Takvim)
            .setOnClickListener {
                startActivity(Intent(this,Takvim::class.java))
            }

}}