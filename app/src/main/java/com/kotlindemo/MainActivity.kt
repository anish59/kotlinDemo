package com.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import java.lang.reflect.Array

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
            valVarInfo(name, age)
            getIntInfo()
            showUnderStringCalculation()
            stringManipulation()
            showArrayDemo()
            arrayRangeDemo()

        })
    }

    private fun arrayRangeDemo() {
        val oneTo10 = 1..10
        val mOneTo10 = 1.rangeTo(10) //same thing
        val alpha = "A".rangeTo("Z") //or "A".."Z"

        println("(${pCount++})_________________________")
        for (i in oneTo10) {
            println("oneTo10 : $i")
        }
        println("_____________________________")


        for (i in mOneTo10) {
            println("mOneTo10 : $i")
        }

        println("_____________________________")

        //increment range with step difference

        val stepValues = 1.rangeTo(10).step(3)
        for (i in stepValues) {
            println("stepValues : $i")
        }
        println("_____________________________")

        for(i in stepValues.reversed()){
            println("reversed step values: $i")
        }
    }

    private fun showArrayDemo() {
        var myArray = arrayOf(1, 2.78, "Anish Vahora", true)

        println("(${pCount++}) myArray size = ${myArray.size}")
        println("(${pCount++}) array element at 2 position = ${myArray[2]}")
        println("(${pCount++}) if array contains 2.78 ${myArray.contains(2.78)}")

        val partArray = myArray.copyOfRange(0, 3)
        println("------------------------------")
        for (any in partArray) {
            println("(${pCount++}) elements of partArray = $any")
        }
        println("---*************************---")

        val squareArray = Array(5, { x -> x * x }) //look for the syntax Array() instead arrayOf
        println("(${pCount++})  index square in array (size 5) kept is  = ${squareArray[3]}")


    }

    private fun stringManipulation() {
        val rs = "Random String"
        println("(${pCount++}) At 2nd index of 'Random String'=  + ${rs.get(1)}")
        println("(${pCount++}) At 2nd index of 'Random String'=  + ${rs[1]}") //another better way to represent the same
        println("(${pCount++}) show string from index 3 to 7=  + ${rs.subSequence(3, 8)}")
        println("(${pCount++}) doest it contains 'dom' : ${rs.contains("dom")}")
    }

    private fun valVarInfo(name: String, age: Int) {
        println("(${pCount++}) name=" + name)// prints your name. And ${pCount++} depicts under string calculation
        println("(${pCount++}) age =$age")// prints your age using $ string concatenation type
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

    }

    private fun showUnderStringCalculation() {
        println("(${pCount++}) 1 + 2 is ${1 + 2}") //under string calculation

        val a = "A"
        val b = "B"
        val c = "Blah Blah"
        val d = "A"
        println("(${pCount++}) is a length = b length ${(a.length) == (b.length)}")
        println("(${pCount++}) is a length = c length ${(a.length) == (c.length)}")

        println("(${pCount++}) is a equals b ${a.equals(b)}")
        println("(${pCount++}) is a == b ${a == b}")//will result same as above, no issue with == and equals

        println("(${pCount++})  value A compareTo value B is ${a.compareTo(b)}")
        println("(${pCount++}) value B compareTo value A is ${b.compareTo(a)}")
        println("(${pCount++})  value A compareTo A is ${a.compareTo(d)}")

    }
}
