package com.balu.kotlinprojects

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClick  = findViewById<Button>(R.id.mybutton)
        val textView = findViewById<TextView>(R.id.textView2)
        var timesClicked = 0
        buttonClick.setOnClickListener{
            timesClicked += 1
            textView.text = timesClicked.toString()
        }
    }
}

