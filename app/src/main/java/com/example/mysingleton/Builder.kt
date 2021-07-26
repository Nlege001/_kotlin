package com.example.mysingleton




interface Greeting{
    fun createGreeting() : Greets
    abstract fun showGreeting(): Greets
}

abstract class GreetHello : Greeting{
    override fun createGreeting() : Greets{
        return showGreeting()
    }
}

interface Greets{
    fun showGreeting()
}

class kotlinGreet : Greets{
    override fun showGreeting() {
        println("Hello Kotlin")
    }
}