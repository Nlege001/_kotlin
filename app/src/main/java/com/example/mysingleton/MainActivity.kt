package com.example.mysingleton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.KeyEventDispatcher
import com.example.mysingleton.MainActivity.Greeting.hello




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Singleton Buttons
        val button1 = findViewById<Button>(R.id.singleID)
        val text = findViewById<TextView>(R.id.textViewID)

        button1.setOnClickListener {
            text.text = hello
        }




        //Builder Buttons
        val button2 = findViewById<Button>(R.id.button2)
        val text2 = findViewById<TextView>(R.id.textView3)

        button2.setOnClickListener {
            text2.text = hi.getParam1()
        }

    }

    // Singleton Class: TODO THE SINGLETON APPROACH CREATES AN INSTANCE ONCE AND GIVES THAT INSTANCE A GLOBAL SCOPE
    object Greeting{
        var hello = "Hello Kotlin"
        }




    //Builder class
    class component constructor(builder: Builder){
        var param1: String? = null

        class Builder{
            private var param1: String? = null

            //setter
            fun setparam1(param1: String) = apply { this.param1= param1 }

            //getter
            fun getParam1() = param1
        }

        init{
            param1 = builder.getParam1()
        }
    }
    val hi = component.Builder().setparam1("Hello Kotlin")









    }














