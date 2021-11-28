package com.balu.kotlinprojects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader

class secondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val  minput = InputStreamReader(assets.open("temp.txt"))
        val reader = BufferedReader(minput)

        var line: String
        var displayData: String = ""

        while(reader.readLine().also { line = it } != null){
            val row: List<String> = line.split(",")
            displayData = displayData + row[0] + "\t" + row[1] +"\n"

        }
        var txtData: TextView =findViewById(R.id.data)
    }
}