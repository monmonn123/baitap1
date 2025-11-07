package com.hongphuoc.bt1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar

class ArrayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_array)

        val toolbar = findViewById<MaterialToolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        val etArrayInput = findViewById<EditText>(R.id.etArrayInput)
        val btnProcessArray = findViewById<Button>(R.id.btnProcessArray)
        val tvEvenNumbers = findViewById<TextView>(R.id.tvEvenNumbers)
        val tvOddNumbers = findViewById<TextView>(R.id.tvOddNumbers)

        btnProcessArray.setOnClickListener {
            val inputText = etArrayInput.text.toString()
            if (inputText.isNotEmpty()) {
                val numbers = inputText.split(",").mapNotNull { it.trim().toIntOrNull() }
                val evenNumbers = numbers.filter { it % 2 == 0 }
                val oddNumbers = numbers.filter { it % 2 != 0 }

                tvEvenNumbers.text = "Số chẵn: ${evenNumbers.joinToString()}"
                tvOddNumbers.text = "Số lẻ: ${oddNumbers.joinToString()}"
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}