<img src = https://github.com/Nlege001/_kotlin/blob/master/FOX_Logo-removebg-preview.png width = 200>

# Software engineering Internship - ```Android SDKs Team```

# Architectural Design Project - ```Fox SDK Team```
 - This was one of the demo projects I did while I was working with the FOX SDKs team.

### This is a sample application that implements 6 of the 23 architectural design principles.(Refer to the file 'mainActivity.kt' to see how each is implemented)
   - [Singleton Architectural Approach](#1)
   - [Builder Architectural Approach](#2)
   - [Decorator Architectural Approach](#3)
   - [Bridge Architectural Approach](#4)
   - [Adapter Architectural Approach](#5)
   - [Abstract Architectural Approach](#6)
  

## How to run application
  - Clone the Github repository (Link: https://github.com/Nlege001/_kotlin.git)
  - Open Android studio and open existing project
  - Select the file path and open the cloned github file
  - Read along the code and see comments to understand how each architctural pattern can be used in Object Oriented Programming


## Section Explanations


### 1. The Singleton Architectural Approach

- This Approach Ensures that a class only has one instance, and provide a global point of access to it.

```Kotlin
// Singleton Class: TODO THE SINGLETON APPROACH CREATES AN INSTANCE ONCE AND GIVES THAT INSTANCE A GLOBAL SCOPE
    object Greeting{
        var hello = "Hello Kotlin"
        }
```

### 2. The Builder Architectural Approach
- This approach Separates the construction of a complex object from its representation so that the same construction processes can create different representations.

```Kotlin
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

```
### 3. The Decorator Architectural Approach
- This approach attachs additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.
```Kotlin
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
```
### 4. The Bridge Architectural Approach
- Helps in Decoupling an abstraction from its implementation so that the two can vary independently.
```Kotlin
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

```


      
## Snippet of the sample App
<img src = https://github.com/Nlege001/_kotlin/blob/master/mySingleton.jpg width = 200>
