package com.example.mysingleton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    // Singleton Class
    object Greeting{
        var hello = "Hello Kotlin"

        fun print_val(){
            println(hello)
        }
    }


}





}
