package com.example.mysingleton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.mysingleton.MainActivity.Greeting.hello


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Singleton Buttons
        val button1 = findViewById<Button>(R.id.singleID)
        val text = findViewById<TextView>(R.id.textViewID)

        button1.setOnClickListener {
            text.text = Greeting.hello
        }

        //Builder Buttons
        val button2 = findViewById<Button>(R.id.button2)
        val text2 = findViewById<TextView>(R.id.textView3)

        button2.setOnClickListener {
            text2.text = hi.getParam1()
        }


        //Decorator Buttons
        val button3 = findViewById<Button>(R.id.button3)
        val text3 = findViewById<TextView>(R.id.textView4)

        button3.setOnClickListener {
            text3.text = enhancedGreeting.displayGreeting().toString()
        }

        //Reset button
        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            text.text = "singleton"
            text2.text = "Builder"
            text3.text = "Decorator"
        }


    }

    // Singleton Class: TODO THE SINGLETON APPROACH CREATES AN INSTANCE ONCE AND GIVES THAT INSTANCE A GLOBAL SCOPE
    object Greeting{
        var hello = "Hello Kotlin"
        }
    //#######################################################################################################################################



    //Builder class : TODO THE BUILDER DESIGN PATTERN HELPS TO provide a flexible solution to various object creation problems in object-oriented programming
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


    //#######################################################################################################################################
    //Decorator class : TODO that allows behavior to be added to an individual object, dynamically, without affecting the behavior of other objects from the same class
    interface Greet{
        fun displayGreeting() : String
    }

    class NormalGreeting : Greet{
        override fun displayGreeting(): String {
            return("Hello Kotlin")
        }
    }
    //Decorator class
    class EnhancedGreeting(val greet : Greet ) : Greet by greet{
        override fun displayGreeting(): String {
            return("Hello Kotlin Decorator")
        }
    }

    val normalGreeting = NormalGreeting()
    val enhancedGreeting = EnhancedGreeting(normalGreeting)



    }














