package com.example.midtermprojectcis_240

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val summaryText = findViewById<TextView>(R.id.orderSummary)

        val name = intent.getStringExtra("NAME")
        val size = intent.getStringExtra("SIZE")
        val extra = intent.getStringExtra("EXTRA")

        summaryText.text =
            "Order Summary\n\n" +
                    "Name: $name\n" +
                    "Coffee Size: $size\n" +
                    "Extra Espresso Shot: $extra"
    }
}