package com.example.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.ui.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val nameTextView: TextView = findViewById(R.id.nameTextView)
        val ageTextView: TextView = findViewById(R.id.ageTextView)

        val name = intent.getStringExtra("name")
        val yearOfBirth = intent.getIntExtra("yearOfBirth", 0)

        if (name != null && yearOfBirth != 0) {
            val currentYear = 2024
            val age = currentYear - yearOfBirth

            nameTextView.text = "Name: $name"
            ageTextView.text = "Age: $age"
        } else {
            nameTextView.text = "Invalid data received."
            ageTextView.text = ""
        }
    }
}