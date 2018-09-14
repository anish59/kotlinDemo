package com.kotlindemo

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.kotlindemo.fragment.FragDemoOne
import kotlinx.android.synthetic.main.activity_bottom_navigation_tab_demo.*

class BottomNavigationTabDemoActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation_tab_demo)
//        bnv = findViewById(R.id.bnv)
        bnv!!.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    Toast.makeText(this, "1", Toast.LENGTH_SHORT).show()
                    changeFragment(0)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_dashboard -> {

                    Toast.makeText(this, "2", Toast.LENGTH_SHORT).show()
                    changeFragment(1)

                    return@OnNavigationItemSelectedListener true

                }
                R.id.navigation_notifications -> {
                    Toast.makeText(this, "3", Toast.LENGTH_SHORT).show()
                    changeFragment(2)


                    return@OnNavigationItemSelectedListener true

                }
            }
            return@OnNavigationItemSelectedListener false
        })

        changeFragment(0)
    }

    private fun changeFragment(position: Int) {
        var newFragment: Fragment? = null
        when (position) {
            0 -> {
                newFragment = FragDemoOne()
                val arg = Bundle()
                arg.putString("name", "One")
                newFragment.arguments = arg
            }
            1 -> {
                newFragment = FragDemoOne()
                val arg = Bundle()
                arg.putString("name", "two")
                newFragment.arguments = arg
            }
            2 -> {
                newFragment = FragDemoOne()
                val arg = Bundle()
                arg.putString("name", "three")
                newFragment.arguments = arg
            }
        }

        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, newFragment).commit()
    }
}
