package com.kotlindemo.chapters

public class InitOrderDemo(var name: String) {

    //Kotlin classes allow printing properties in the declaration itself by using the also function as shown below
    var value1: String = "first property $name".also(::println)



    init {
        println("first init block $name")
    }

    var value2: String = "second property ${value1}".also(::println)

    init {
        println("Second init block $name")
    }

    public fun doCallThis() {
        println("Cal method")
    }

    public fun methodThatReturnsString(): String {
        return "Hey I am a string and returning to my caller!!"
    }
}