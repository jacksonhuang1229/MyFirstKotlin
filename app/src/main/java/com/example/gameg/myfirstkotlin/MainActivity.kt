package com.example.gameg.myfirstkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

import a.b.getName
import a.b.MyClass
import android.content.Intent
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle("MainActivity")

        val tv:TextView = findViewById(R.id.tv)
        val a = 10
        val b = 20
        val message = "$a + $b = ${add(a,b)}"
        tv.setText(message)

        Log.d("test" , " MainActivity")

        println(getName())
        println(MyClass())

        val bt: Button = findViewById(R.id.button)
        bt.setOnClickListener{

            Log.d("test" , " click")

            startActivity(Intent(this, RecyclerViewSampleActivity::class.java))
        }
    }

    fun add(a:Int, b:Int): Int {
        return a+b;
    }
}
