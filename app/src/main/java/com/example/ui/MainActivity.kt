package com.example.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import com.example.ui.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameEditText: EditText = findViewById(R.id.nameEditText)
        val yearOfBirthEditText: EditText = findViewById(R.id.yearOfBirthEditText)
        val submitButton: Button = findViewById(R.id.submitButton)
        val checkBox: CheckBox = findViewById(R.id.checkBox) // UI-only element

        submitButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val yearOfBirth = yearOfBirthEditText.text.toString().toIntOrNull()

            if (name.isNotEmpty() && yearOfBirth != null) {
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("name", name)
                intent.putExtra("yearOfBirth", yearOfBirth)
                startActivity(intent)
            } else {
                // Handle invalid input
                nameEditText.error = "Please enter your name"
                yearOfBirthEditText.error = "Enter a valid year"
            }
        }
    }
}