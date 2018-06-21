package com.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.logging.Logger

class KotlinRevisedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) { // ? denotes nullable
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_syntax_kotlin)

    }

}
