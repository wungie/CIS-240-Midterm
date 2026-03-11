package com.example.midtermprojectcis_240

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivityLifecycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")
        setContentView(R.layout.activity_main)

        val nameInput = findViewById<EditText>(R.id.editName)
        val sizeGroup = findViewById<RadioGroup>(R.id.sizeGroup)
        val extraShot = findViewById<CheckBox>(R.id.checkExtra)
        val submitBtn = findViewById<Button>(R.id.btnSubmit)

        submitBtn.setOnClickListener {

            val name = nameInput.text.toString()

            if (name.isEmpty()) {
                Toast.makeText(this, "Name is required!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val selectedSizeId = sizeGroup.checkedRadioButtonId
            val size = findViewById<RadioButton>(selectedSizeId)?.text.toString()

            val extra = if (extraShot.isChecked) "Yes" else "No"

            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("NAME", name)
            intent.putExtra("SIZE", size)
            intent.putExtra("EXTRA", extra)

            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }
}