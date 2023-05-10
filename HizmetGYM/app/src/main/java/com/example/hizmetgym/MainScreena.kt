package com.example.hizmetgym

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainScreena : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_screena)
        val logo = findViewById<ImageButton>(R.id.arkasırt)
        logo.setOnClickListener {
            startActivity(Intent(this, exercises::class.java))
        }
        val logo2 = findViewById<ImageButton>(R.id.arkaomuz)
        logo2.setOnClickListener {
            startActivity(Intent(this, exercises::class.java))
        }
        val logo3 = findViewById<ImageButton>(R.id.arkaaltomuz)
        logo3.setOnClickListener {
            startActivity(Intent(this, exercises::class.java))
        }
        val logo4 = findViewById<ImageButton>(R.id.arkakarin)
        logo4.setOnClickListener {
            startActivity(Intent(this, exercises::class.java))
        }
        val logo5 = findViewById<ImageButton>(R.id.arkaeller)
        logo5.setOnClickListener {
            startActivity(Intent(this, exercises::class.java))
        }
        val logo6 = findViewById<ImageButton>(R.id.arkabaldır)
        logo6.setOnClickListener {
            startActivity(Intent(this, exercises::class.java))
        }
        val logo7 = findViewById<ImageButton>(R.id.arkabacak)
        logo7.setOnClickListener {
            startActivity(Intent(this, exercises::class.java))
        }
       val logo8 = findViewById<ImageButton>(R.id.dön)
        logo8.setOnClickListener {
            startActivity(Intent(this, MainScreen::class.java))
        }
        findViewById<Button>(R.id.Takvim)
            .setOnClickListener {
                startActivity(Intent(this,Takvim::class.java))
            }

    }}