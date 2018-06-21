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

    }


    //Function having two Int parameters with Int return type:
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    //Function with an expression body and inferred return type:
    fun sumInShort(a: Int, b: Int) = a + b
}