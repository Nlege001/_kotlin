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

- This Approach Ensure a class only has one instance, and provide a global point of access to it.

```Kotlin
// Singleton Class: TODO THE SINGLETON APPROACH CREATES AN INSTANCE ONCE AND GIVES THAT INSTANCE A GLOBAL SCOPE
    object Greeting{
        var hello = "Hello Kotlin"
        }
```
      
      
## Snippet of the sample App
<img src = https://github.com/Nlege001/_kotlin/blob/master/mySingleton.jpg width = 200>
