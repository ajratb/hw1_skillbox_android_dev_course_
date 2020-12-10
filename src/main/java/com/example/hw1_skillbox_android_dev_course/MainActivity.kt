package com.example.hw1_skillbox_android_dev_course

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b1 = findViewById<Button>(R.id.button1)
        b1.setOnClickListener {
            Log.e("!@#", "Button One was pressed!")
        }
        val b2 = findViewById<Button>(R.id.button2)
        b2.setOnClickListener {
            Log.e("!@#", "Button Two was pressed!")
        }
        val b3 = findViewById<Button>(R.id.button3)
        b3.setOnClickListener {
            Log.e("!@#", "Button Three was pressed!")
        }
    }
}