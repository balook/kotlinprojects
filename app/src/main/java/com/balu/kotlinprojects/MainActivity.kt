package com.balu.kotlinprojects

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fileText: String = applicationContext.assets.open("temp.txt").bufferedReader().use {
            it.readText()
        }

        print(fileText)

        var intent = Intent(this,secondActivity::class.java)
        startActivity(intent)
    }
}

