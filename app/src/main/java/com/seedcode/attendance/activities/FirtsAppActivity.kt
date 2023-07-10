package com.seedcode.attendance.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.seedcode.attendance.R

class FirtsAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firts_app)
        //Al arrancar la pantalla
        val btnClick = findViewById<AppCompatButton>(R.id.btn_click)
        val editText = findViewById<AppCompatEditText>(R.id.edit_text)

        btnClick.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            val name = editText.text.toString()
            if (name.isNotEmpty()) {
                intent.putExtra("EXTRA", name)
                startActivity(intent)
            }
        }
    }
}