package com.hongphuoc.bt1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnPersonalInfo = findViewById<Button>(R.id.btnPersonalInfo)
        btnPersonalInfo.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        val btnArray = findViewById<Button>(R.id.btnArray)
        btnArray.setOnClickListener {
            val intent = Intent(this, ArrayActivity::class.java)
            startActivity(intent)
        }

        val btnString = findViewById<Button>(R.id.btnString)
        btnString.setOnClickListener {
            val intent = Intent(this, StringActivity::class.java)
            startActivity(intent)
        }
    }
}