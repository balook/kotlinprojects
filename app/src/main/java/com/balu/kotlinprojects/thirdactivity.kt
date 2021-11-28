package com.balu.kotlinprojects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


import android.util.Log
import org.apache.commons.io.IOUtils
import java.io.*
import java.lang.Exception


class thirdactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thirdactivity)



        try {
//          val file = File(dataDir, "evil")
            val file = File(dataDir,"evil")
            val  openRawResource: InputStreamReader = InputStreamReader(assets.open("temp.txt"))
//            val openRawResource: InputStream = resources.openRawResource(R.raw.evil)
            val fileOutputStream = FileOutputStream(file)
            IOUtils.copy(openRawResource, fileOutputStream as OutputStream)
            openRawResource.close()
            fileOutputStream.close()
            Log.d("FUCK-U", file.getAbsolutePath())
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }
}