package com.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button

/**
 * val is used as final when you know its value is not gonna change
 * var is used as a variable when you need to change its value
 */
class MainActivity : AppCompatActivity() {

    var pCount = 0 //println count
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val name: String = "Anish"
//        var age: Int = 23

        //you can write it in following manner
        val name = "Anish"
        var age = 23

        val btn = findViewById<Button>(R.id.btnId) as Button
        btn.setOnClickListener(View.OnClickListener { view ->
            println("(${pCount++}) name=" + name)// prints your name. And ${pCount++} depicts under string calculation
            println("(${pCount++}) age =$age")// prints your age using $ string concatenation type
            getIntInfo()
        })
    }

    private fun getIntInfo() {
        val bigInt: Int = Int.MAX_VALUE
        val smallInt: Int = Int.MIN_VALUE

        println("(${pCount++}) bigInt :: $bigInt smallInt :: $smallInt")

        val letterGrade = 'A'
        println("(${pCount++}) A is a char : $letterGrade")
        println("(${pCount++}) A is a char : ${letterGrade is Char}") //actually its always true .. just to show "instance of" functionality
        println("(${pCount++}) 65 to Char: " + 65.toChar())
        println("(${pCount++}) A to Int: " + 'A'.toInt())
        println("(${pCount++}) 3.14 to Int: " + 3.14.toInt())

        showUnderStringCalculation()
    }

    private fun showUnderStringCalculation() {
        println("(${pCount++}) 1 + 2 is ${1 + 2}") //under string calculation

        var a = "A"
        var b = "B"
        var c = "Blah Blah"
        var d = "A"
        println("(${pCount++}) is a length = b length ${(a.length) == (b.length)}")
        println("(${pCount++}) is a length = c length ${(a.length) == (c.length)}")

        println("(${pCount++}) is a equals b ${a.equals(b)}")
        println("(${pCount++}) is a == b ${a == b}")//will result same as above, no issue with == and equals

        println("(${pCount++})  value A compareTo value B is ${a.compareTo(b)}")
        println("(${pCount++}) value B compareTo value A is ${b.compareTo(a)}")
        println("(${pCount++})  value A compareTo A is ${a.compareTo(d)}")

    }
}
