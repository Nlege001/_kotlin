package com.example.mysingleton




interface Greet{
    fun displayGreeting()
}

abstract class NormalGreeting : Greet{
    override fun displayGreeting()  {
        println("Hello Kotlin")
    }
}

abstract class EnhancedGreeting(val greet : Greet ) : Greet by greet{
    override fun displayGreeting() {
        println("Hello Hello Kotlin")
        greet.displayGreeting()
    }
}