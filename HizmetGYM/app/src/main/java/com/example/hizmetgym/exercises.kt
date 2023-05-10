package com.example.hizmetgym

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class exercises: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.exercises)
        val logo = findViewById<ImageButton>(R.id.exercise3)
        logo.setOnClickListener {
            startActivity(Intent(this, exercise1::class.java))
        }
        findViewById<Button>(R.id.Takvim)
            .setOnClickListener {
                startActivity(Intent(this,Takvim::class.java))
            }
    }}