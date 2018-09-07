package com.kotlindemo

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast

class DemoAdapter() : RecyclerView.Adapter<DemoAdapter.MyViewHolder>() {
    private lateinit var names: ArrayList<String>
    private lateinit var context: Context

    constructor(context: Context) : this() {
        this.context = context
    }

    fun setNames(names: ArrayList<String>) {
        this.names = ArrayList()
        this.names = names
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.setData(names[position])
    }

    override fun getItemCount(): Int {
        return names.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false)
        return MyViewHolder(view);
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txt: TextView = itemView.findViewById<View>(R.id.txt) as TextView

        init {
            txt.setOnClickListener {
                Toast.makeText(context, "txt says hello", Toast.LENGTH_SHORT).show()
            }
        }

        fun setData(name: String) {
            txt.text = name
        }

    }
}