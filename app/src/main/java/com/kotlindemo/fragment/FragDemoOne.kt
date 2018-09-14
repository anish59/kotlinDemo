package com.kotlindemo.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kotlindemo.R
import kotlinx.android.synthetic.main.fragment_layout.view.*

class FragDemoOne : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_layout, container, false)
        val name = arguments.getString("name")
//        val txtName = view.findViewById<View>(R.id.txtName) as TextView
       view.txtName.text = name
        return view
    }
}