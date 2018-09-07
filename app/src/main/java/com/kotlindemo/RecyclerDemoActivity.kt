package com.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycler_demo.*

class RecyclerDemoActivity : AppCompatActivity() {
    private var demoAdapter: DemoAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_demo)

        var names = ArrayList<String>()
        names.add("one")
        names.add("two")
        names.add("three")
        names.add("four")

        demoAdapter = DemoAdapter(this)
        rv!!.layoutManager = LinearLayoutManager(this)
        rv!!.adapter = demoAdapter


        demoAdapter!!.setNames(names) // !! stands for if not null

    }
}