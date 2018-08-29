package com.kotlindemo.chapters

import android.util.Log

open class ParentClass {
    // open lets you override the class (its method and variables)
    open var parentVariable1: String = "parentVariable1"// open for child class to access

    open fun methodDad() { // open for allowing overriding
        Log.e("LOG", "I am the DAD")
    }

    open fun methodDad2() {
        Log.e("LOG", "I wont be called if not called -->super")
    }
}