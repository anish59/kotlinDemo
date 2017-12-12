package com.kotlindemo

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

/**
 * val is used as final when you know its value is not gonna change
 * var is used as a variable when you need to change its value
 */
// don't override inspect suggestion, keep the code as it is cuzz they are for understanding purpose.
class MainActivity : AppCompatActivity() {

    var pCount = 0 //println count
    lateinit var context: Context
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        context = this@MainActivity
//        val name: String = "Anish"
//        var age: Int = 23

        //you can write it in following manner
        val name = "Anish"
        var age = 23



        btn1.setOnClickListener(View.OnClickListener { view ->
            valVarInfo(name, age)
            getIntInfo()
            showUnderStringCalculation()
            stringManipulation()
            showArrayDemo()
            arrayRangeDemo()
        })

        btn2.setOnClickListener(View.OnClickListener { View ->
            conditionalStatementDemo()
        })

        btn3.setOnClickListener(View.OnClickListener {
            // Function and Function calling demo
            showTankToast(context)
            showToast(context, dummyFunctionOne(1, 2).toString())
            showToast(context, dummyFunctionTwo(1, "I Am No"))
            stringManipulation()
        })
    }

    private fun heigherOrderFunctionDemo() {
        // Use filter to find evens
        val numList = 1..20

        // If a function has only 1 parameter you don't
        // have to declare, but just use it instead
        val evenList = numList.filter { it % 2 == 0 }
        evenList.forEach { n -> println(n) }

//        startActivity<MainActivity>("id" to 3, "name" to "Hello toolbar")
    }


    private fun conditionalStatementDemo() {
        val age = 23
        // ----- CONDITIONALS -----
        // Conditional Operators : >, <, >=, <=, ==, !=
        // Logical Operators : &&, ||, !
        ifDemo(age)
        whenDemo(age)
        forDemo()
        whileDemo()
    }

    private fun whileDemo() {
        val randNo = Random()
        val magicNum = randNo.nextInt(50) + 1
        var guessNo = 0
        while (magicNum != guessNo) {
            guessNo++
        }
        println("(${pCount++}) MagicNum = $magicNum and incremented guessed no= $guessNo")
    }

    private fun forDemo() {
        arrayRangeDemo()// calling this method again as it contains the functionality of for
    }

    private fun whenDemo(age: Int) {
        /**------------------- when condition -----------------------------**/
        //when works like switch in kotlin (and many other language i suppose)

        when (age) {
            0, 1, 2, 3 -> {
                println("(${pCount++}) Don't go anywhere")
            }
            in 4..18 -> {
                println("(${pCount++}) Go to school")
            }
            in 18..23 -> {
                println("(${pCount++}) Go to college")
            }
            else -> {
                println("(${pCount++}) Go to job and end your life")
            }
        }
    }

    private fun ifDemo(age: Int) {
        /**------------------- if condition -----------------------------**/

        if (age < 3) {
            println("(${pCount++}) Don't go anywhere")
        } else if ((age > 5) && (age < 18)) {
            println("(${pCount++}) Go to School")
        } else {
            println("(${pCount++}) just go to college and then die")
        }
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

        for (i in stepValues.reversed()) {
            println("reversed step values: $i")
        }


        var arrayOne = arrayOf(5, 2, 3)
        for (i in arrayOne.indices) {
            println("(${pCount++}) index of array: $i")
        }
        println("______________________________")
        for (i in arrayOne) {
            println("(${pCount++}) element of array: $i")
        }

        for ((index, value) in arrayOne.withIndex()) {
            println("Index:   $index and  value:  $value")
        }


    }

    private fun showArrayDemo() {
        val myArray = arrayOf(1, 2.78, "Anish Vahora", true)

        println("(${pCount++}) myArray size = ${myArray.size}")
        println("(${pCount++}) array element at 2 position = ${myArray[2]}")
        println("(${pCount++}) if array contains 2.78 ${myArray.contains(2.78)}")

        val partArray = myArray.copyOfRange(0, 3)
        println("-------------------------------")
        for (any in partArray) {
            println("(${pCount++}) elements of partArray = $any")
        }
        println("---*************************---")

        val squareArray = Array(5, { x -> x * x }) //look for the syntax Array() instead arrayOf
        println("(${pCount++})  index square in array (size 5) kept is  = ${squareArray[3]}")


    }

    private fun stringManipulation() {
        val a: Int = 2
        val b = 5

        val c = a.plus(5)
        println("$a , $b, $c")
        showToast(context, "plus:  $a , $b, $c")
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

    private fun dummyFunctionOne(no1: Int, no2: Int) = no1 + no2  //DataType are in Capital // it is returning a value too

    // or you can write the same function as below
    private fun dummyFunctionTwo(no1: Int, str: String): String {
        var result = "" // variable must either have type annotation or must be initialised
        //or var result: String
        result = str + no1
        return result

//        or simply you can do in one line as below
//        var result: String = "I am no. $no1"
//        return result

    }

    private fun showTankToast(context: Context) {
        Toast.makeText(context, "███۞███████ ]▄▄▄▄▄▄▄▄▄▄▄▄▃\n" +
                "▂▄▅█████████▅▄▃▂\n" +
                "I███████████████████].\n" +
                "◥⊙▲⊙▲⊙▲⊙▲⊙▲⊙▲⊙◤...", Toast.LENGTH_LONG).show()
        // ----- HIGHER ORDER FUNCTIONS -----
        // Higher order functions either accepts or returns
        // another function

    }

    private fun showToast(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }
}
