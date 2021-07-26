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
        //########################################################################
        //Builder Buttons
        val button2 = findViewById<Button>(R.id.button2)
        val text2 = findViewById<TextView>(R.id.textView3)

        button2.setOnClickListener {
            text2.text = hi.getParam1()
        }
        //########################################################################

        //Decorator Buttons
        val button3 = findViewById<Button>(R.id.button3)
        val text3 = findViewById<TextView>(R.id.textView4)

        button3.setOnClickListener {
            text3.text = enhancedGreeting.displayGreeting().toString()
        }
        //########################################################################
        //Abstract Button
        val button5 = findViewById<Button>(R.id.button5)
        val text5 = findViewById<TextView>(R.id.textView5)
        button5.setOnClickListener{
            text5.text = greetsHello.showGreetings().toString()
        }
        //########################################################################
        //Adapter Button
        val button6 = findViewById<Button>(R.id.button6)
        val text6 = findViewById<TextView>(R.id.textView6)
        button6.setOnClickListener {
            text6.text = adapterVal.adapterHelloKotlin("adapterHello").toString()
        }


        //########################################################################
        //Brdige Button

        val button7 = findViewById<Button>(R.id.button7)
        val text7 = findViewById<TextView>(R.id.textView7)
        button7.setOnClickListener {
            text7.text = first.showBrdigeGreeting().toString()
        }



        //########################################################################
        //Reset button
        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            text.text = "singleton"
            text2.text = "Builder"
            text3.text = "Decorator"
            text5.text = "Abstract Text"
            text6.text = "Adapter Text"
            text7.text = "Builder Text"
        }

    }
    //########################################################################
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
    //Decorator class : TODO The decorator pattern is used to extend or alter the functionality of objects at run-time by wrapping them in an object of a decorator class. This provides a flexible alternative to using inheritance to modify behaviour.
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

    //#######################################################################################################################################
    // Abstract factory design pattern : TODO Provide an interface for creating families of related or dependent objects without specifying their concrete classes
    interface Greetings{
        fun createGreeting() : Greetskotlin
    }

    class GreetHelloKotlin : Greetings{
        override fun createGreeting() : Greetskotlin {
            return kotlinGreeting()
        }
    }

    interface Greetskotlin{
        fun showGreetings() : String
    }

    class kotlinGreeting : Greetskotlin{
        override fun showGreetings() : String {
            return("Hello Kotlin Abstract")
        }
    }
    val greetHello = GreetHelloKotlin()
    val greetsHello = greetHello.createGreeting()

    //#######################################################################################################################################
    //Adapter design pattern  TODO: The adapter pattern is used to provide a link between two otherwise incompatible types by wrapping the "adaptee" with a class that supports the interface required by the client.
    interface AdapterGreeting{
        fun adapterHelloKotlin(adapterHello : String) : String
    }

    class AdapterGreetingKoltin : AdapterGreeting{
        override fun adapterHelloKotlin(adapterHello: String) : String {
            return("Hello kotlin")
        }
    }
    //the class below takes an adaptee role
    class AdapteeGreeting{
        fun adapterHelloKoltin(adaptee : String){
            println("Hello Adaptee kotlin")
        }
    }

    // Adapter class
    class AdapterHelloKotlin(private val adapteeGreeting : AdapteeGreeting) : AdapterGreeting{
        override fun adapterHelloKotlin(adapterHello: String): String {
            val adapteeGreet = getAdapterGreeting()
            adapteeGreeting.adapterHelloKoltin(adapteeGreet)
            return("Hello kotlin Adapter")
        }

        private fun getAdapterGreeting() : String = "Hello"
    }
    val adapteeVal = AdapteeGreeting()
    val adapterVal = AdapterHelloKotlin(adapteeVal)

    //#######################################################################################################################################
    //Bridge design pattern : TODO Decouple an abstraction from its implementation so that the two can vary independently.
    interface BridgeGreeting{
        fun getBridgeGreeting() : String
    }

    class firstBridgeGreeting : BridgeGreeting{
        override fun getBridgeGreeting() : String {
            return ("Hello first bridge greeting")
        }
    }

    class secondBridgeGreeting : BridgeGreeting{
        override fun getBridgeGreeting() : String {
            return("Hello second bridge greeting")
        }
    }


    interface BridgeGreet{
        val bridge : BridgeGreeting
        fun showBrdigeGreeting() : String
    }

    class Bridges(override val bridge : BridgeGreeting) : BridgeGreet{
        override fun showBrdigeGreeting() : String {
            bridge.getBridgeGreeting()
            return("Hello Bridge Greeting")

        }
    }
    val first = Bridges(bridge = firstBridgeGreeting())

























