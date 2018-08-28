package com.kotlindemo.chapters

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.kotlindemo.MainActivity
import com.kotlindemo.R
import kotlinx.android.synthetic.main.activity_basic_syntax_kotlin.*
import java.util.logging.Logger

class BasicSyntaxActivity : AppCompatActivity() {
    var counter: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_syntax_kotlin)

        val log = Logger.getLogger(MainActivity::class.java.name)
        log.info("${counter++} :: Hello World")
        Log.e("${counter++}", "ddddd")
        setListener()
        showMe()
    }

    private fun setListener() {
        btnCallAgain.setOnClickListener({
            showMe()
        })

        btnInitDemo.setOnClickListener {
//            InitOrderDemo("blah");
        }
    }

    private fun showMe() {
        definingFunctions()
        definingVaridables()// it is not for output but jst for illustrating
        usingStringTemplate()
        usingConditionalOperators()
        typeChecksAndAutoMaticCasting()
        usingForLoop()
        usingWhileFun()
        usingWhenExpression()
        usingRanges()
        usingCollection()
    }

    private fun usingCollection() {
        val items = listOf("apple", "banana", "kiwifruit")
        for (item in items) {
            Log.e("", item)
        }


        val items2 = setOf("apple", "banana", "kiwifruit", "avocados")
        when {
            "orange" in items2 -> Log.e("${counter++}", "orange is juicy")
            "apple" in items2 -> Log.e("${counter++}", "Apple is too fine")
        }

        items2.filter { it.startsWith("a") }
                .sortedBy { it }
                .map { it.toUpperCase() }
                .forEach { Log.e("${counter++}", "$it") }
    }

    private fun usingRanges() {
        inDemo()
        Log.e("--", "----------------")
        iteratingOverARange()
        Log.e("--", "----------------")
        iteratingOverAProgression()
        Log.e("--", "----------------")

    }

    private fun iteratingOverAProgression() {
        for (x in 1..10 step 2) {
            Log.e("${counter++}", "$x")

        }
    }

    private fun iteratingOverARange() {
        for (x in 1..5) {
            Log.e("${counter++}", "$x")
        }
    }

    private fun inDemo() {
        var fruits = listOf("Apple", "Banana", "Orange", "Kiwi")
        if ("Banana" in fruits) {
            Log.e("${counter++}", "Banana is in fruits list")
        } else {
            Log.e("${counter++}", "Banana is not in fruits list")
        }
        if ("banana" in fruits) {
            Log.e("${counter++}", "banana is in fruits list")
        } else {
            Log.e("${counter++}", "banana is not in fruits list")
        }
    }

    private fun usingWhenExpression() {
        Log.e("${counter++}", describe(1))
        Log.e("${counter++}", describe("Hello"))
        Log.e("${counter++}", describe(1000L))
        Log.e("${counter++}", describe(2))
        Log.e("${counter++}", describe("Other"))
    }

    fun describe(obj: Any): String = when (obj) {
        1 -> "$obj is one"
        "Hello" -> "$obj is Greeting"
        is Long -> "$obj is Long"
        !is String -> "$obj is it is not String"
        else -> "$obj is Unknown"
    }

    private fun usingWhileFun() {
        val items = listOf("apple", "Banana", "Orange")
        var index = 0
        while (index < items.size) {
            Log.e("${counter++}", "item at index $index is ${items[index]}")
            index++
        }
    }

    private fun usingForLoop() {
        val items = listOf<String>("Apple", "Banana", "Orange")
        Log.e("---", "---")

        for (item in items) {
            Log.e("${counter++}", "item = $item")
        }

        Log.e("---", "---")

        for (index in items.indices) { // taking for loop of indices instead of items
            Log.e("${counter}", "item at index $index is ${items[index]}")
        }

    }

    private fun typeChecksAndAutoMaticCasting() {
        printLength(1000)
        printLength("lololol")
        printLength(listOf(Any()))

    }

    private fun printLength(obj: Any) {
        Log.e("${counter++}", "$obj string length is ${getStringLength(obj)
                ?: ",Oops error not a string"}")

        //If the expression to the left of ?: is not null, the elvis operator returns it, otherwise it returns the expression to the right.
        // Note that the right-hand side expression is evaluated only if the left-hand side is null.
    }


    private fun getStringLength(obj: Any): Int? {
        //The is operator checks if an expression is an instance of a type.
        // If an immutable local variable or property is checked for a specific type, there's no need to cast it explicitly:
        if (obj is String) {
            // `obj` is automatically cast to `String` in this branch
            return obj.length
        }

        // `obj` is still of type `Any` outside of the type-checked branch
        return null

    }

    private fun usingConditionalOperators() {

        /**Using conditional expressions*/
        Log.e("${counter++}", "maxOfType1:${maxOfType1(1, 2)}")
        Log.e("${counter++}", "maxOfType2:${maxOfType2(1, 2)}")
        Log.e("${counter++}", "maxOfType3:${maxOfType3(1, 2)}")
        Log.e("${counter++}", "maxOfType4:${maxOfType4(1, 2)}")


        //Using nullable values and checking for null
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