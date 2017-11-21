package com.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
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
            println("name=" + name)// prints your name
            println("age =$age")// prints your age using $ string concatenation type
            getIntInfo()
        })
    }

    private fun getIntInfo() {
        var bigInt: Int = Int.MAX_VALUE
        var smallInt: Int = Int.MIN_VALUE

        println("bigInt :: $bigInt smallInt :: $smallInt")

    }
}
