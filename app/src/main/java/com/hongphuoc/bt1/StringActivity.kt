package com.hongphuoc.bt1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar

class StringActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_string)

        val toolbar = findViewById<MaterialToolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        val etStringInput = findViewById<EditText>(R.id.etStringInput)
        val btnProcessString = findViewById<Button>(R.id.btnProcessString)
        val tvStringResult = findViewById<TextView>(R.id.tvStringResult)

        btnProcessString.setOnClickListener {
            val inputText = etStringInput.text.toString()
            if (inputText.isNotEmpty()) {
                val reversedString = inputText.split(" ").reversed().joinToString(" ").uppercase()
                tvStringResult.text = "Kết quả: $reversedString"
                Toast.makeText(this, reversedString, Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}