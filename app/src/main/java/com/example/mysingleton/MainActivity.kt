package com.example.mysingleton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.mysingleton.MainActivity.Greeting.hello



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.singleID)
        val text = findViewById<TextView>(R.id.textViewID)

        button1.setOnClickListener {
            text.text = hello
        }
    }

    // Singleton Class
    object Greeting{
        var hello = "Hello Kotlin"
        }
    }












