package com.deofibrianico.mako.ankogdk

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.jetbrains.anko.*

class SecondActivity : AppCompatActivity() {

    private var name: String = ""
    lateinit var nameTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        verticalLayout{
            padding = dip(16)
            nameTextView = textView()
        }

        val intent = intent
        name = intent.getStringExtra("name")
        nameTextView.text = name
    }
}