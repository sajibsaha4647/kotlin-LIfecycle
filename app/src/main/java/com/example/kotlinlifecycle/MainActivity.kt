package com.example.kotlinlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Lifecycle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycle.addObserver(Observer())
        println("main call oncreate")

    }

    override fun onResume() {
        super.onResume()
        println("main call onResume")
    }

    override fun onPause() {
        super.onPause()
        println("main call onPause")
    }

    override fun onStop() {
        super.onStop()
        println("main call onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("main call onDestroy")
    }

}


