package com.kotlindemo.chapters

class ConstructorAndMethodDemo {

    lateinit var name: String

    init {
        println("i will be called first even before the constructor and in order of init blocks(if more than one present)")
    }

    init {
        println("I m called as init")
    }

    public constructor(name: String) {
        this.name = name
        println("check it !!$name")
    }


    public fun iWontReturnAnything() {
        println("I will return nothing")
    }

    public fun IwillReturnString(): String {
        return "I M The String"
    }
}