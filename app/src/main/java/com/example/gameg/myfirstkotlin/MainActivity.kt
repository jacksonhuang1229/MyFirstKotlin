package com.example.gameg.myfirstkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

import a.b.getName
import a.b.MyClass

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv:TextView = findViewById(R.id.tv)
        val a = 10
        val b = 20
        val message = "$a + $b = ${add(a,b)}"
        tv.setText(message)

        println(getName())
        println(MyClass())
    }

    fun add(a:Int, b:Int): Int {
        return a+b;
    }
}
