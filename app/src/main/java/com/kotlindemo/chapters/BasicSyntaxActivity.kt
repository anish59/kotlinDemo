package com.kotlindemo.chapters

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.kotlindemo.MainActivity
import com.kotlindemo.R
import java.util.logging.Logger

class BasicSyntaxActivity : AppCompatActivity() {
    var counter: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_syntax_kotlin)

        val log = Logger.getLogger(MainActivity::class.java.name)
        log.info("${counter++} :: Hello World")
        Log.e("${counter++}", "ddddd")

        definingFunctions()
        definingVaridables()// it is not for output but jst for illustrating
        usingStringTemplate()
        usingConditionalOperators()

    }

    private fun usingConditionalOperators() {

        /**Using conditional expressions*/
        Log.e("${counter++}", "maxOfType1:${maxOfType1(1, 2)}")
        Log.e("${counter++}", "maxOfType2:${maxOfType2(1, 2)}")
        Log.e("${counter++}", "maxOfType3:${maxOfType3(1, 2)}")
        Log.e("${counter++}", "maxOfType4:${maxOfType4(1, 2)}")

        printProduct("a", "1")
        printProduct("a", "b")
        printProduct("2", "1")
    }

    private fun printProduct(arg1: String, arg2: String) {
        val x = arg1.toIntOrNull()
        val y = arg2.toIntOrNull()

        if (x != null && y != null) {
            Log.e("${counter}", "X*Y= ${x * y}")
        } else {
            println(" x or y some1 is null")
            Log.e("${counter++}", " x or y some1 is null")
        }
    }

    private fun usingStringTemplate() {
        var a = 1
        // simple name in template:
        var s1 = "a is $a"

        a = 2
        val s2 = "${s1.replace("is", "was")} but now is $a"
        Log.e("${counter++}", s2)
    }

    // Defining Functions
    private fun definingFunctions() {
        Log.e("${counter++}-sum", sum(1, 2).toString())
        Log.e("${counter++}-sumInShort", sumInShort(1, 2).toString())
        printSum(4, 9)
    }


    //defining variables
    private fun definingVaridables() {

        /** Assign-once (read-only) local variable:  or say immutable variable*/
        val a: Int = 1 //immediate assignment
        val b = 2 // `Int` type is inferred i.e data type is understood
        val c: Int // Type required when no initializer is provided
        c = 3 //deferred assignment
        // c=4 error

        /** Mutable variable:*/
        var x = 5 // Int type is inferred
        x += 1
    }


    //Function having two Int parameters with Int return type:
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    //Function with an expression body and inferred return type:
    fun sumInShort(a: Int, b: Int) = a + b

    fun printSum(a: Int, b: Int): Unit { // Unit means void in kotlin , you can also remove it there is no need of it as it is void
        println("${counter++}- a=$a and b=$b ans sum=${a + b}")
    }

    private fun maxOfType1(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    private fun maxOfType2(a: Int, b: Int): Int {
        return if (a > b) a else b
    }

    private fun maxOfType3(a: Int, b: Int): Int = if (a > b) a else b

    private fun maxOfType4(a: Int, b: Int) = if (a > b) a else b // inferred type
}