package com.example.gameg.myfirstkotlin

import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_view.view.*

class RecyclerViewSampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("test" , "RecyclerViewSampleActivity")

        setContentView(R.layout.activity_recyclerview)

        setTitle(" RecyclerViewSampleActivity")

        val recyclerview:RecyclerView = findViewById(R.id.recyclerview)

        val list:List<String> = listOf(" element 1 " , " element 2" , " element 3")

        val adapter = MyAdapter(list, this)

        recyclerview.adapter = adapter

        // Creates a vertical Layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)
    }

    class MyAdapter(val list: List<String>, val context: Context) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

        override fun getItemCount(): Int {
            return list.size;
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            holder?.text?.text = list.get(position)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)

            return MyViewHolder(view)

        }
        inner class MyViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

            val text = itemView?.tv_text
        }
    }

}