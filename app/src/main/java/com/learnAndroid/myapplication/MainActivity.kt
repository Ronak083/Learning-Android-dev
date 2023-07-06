package com.learnAndroid.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_relative_layout)
        println("On Create Called")
    }

    override fun onStart() {
        super.onStart()
        println("On Start Called")
    }

    override fun onResume() {
        super.onResume()
        println("On Resume Called")
    }

    override fun onPause() {
        super.onPause()
        println("On Pause Called")
    }

    override fun onStop() {
        super.onStop()
        println("On Stop Called")
    }

    override fun onRestart() {
        super.onRestart()
        println("On Restart Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("On Destroy Called")
    }
}