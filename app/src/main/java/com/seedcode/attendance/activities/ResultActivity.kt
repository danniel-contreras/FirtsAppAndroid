package com.seedcode.attendance.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import  com.seedcode.attendance.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val txtResult = findViewById<TextView>(R.id.txtResult)
        val name: String = intent.extras?.getString("EXTRA").orEmpty()
        txtResult.text = "Hola $name"
    }
}