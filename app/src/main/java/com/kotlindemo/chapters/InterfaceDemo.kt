package com.kotlindemo.chapters

import android.util.Log

interface InterfaceDemo {
    val var1: String //abstract, compulsory to implement
    fun doCall()// compulsory to implement
     fun  doCallBody() { // not compulsory
        Log.e("LOG", "interface method body")
    }
}