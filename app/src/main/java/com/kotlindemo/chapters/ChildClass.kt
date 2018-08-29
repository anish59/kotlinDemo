package com.kotlindemo.chapters

import android.util.Log

public class ChildClass : ParentClass() {
    override fun methodDad() {
        super.methodDad()
        Log.e("LOG", "I am son calling my DAD")
    }

    override fun methodDad2() {
        Log.e("LOG", "I am not calling super method")
        Log.e("LOG",parentVariable1)
    }

}