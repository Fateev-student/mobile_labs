package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        Log.d("lab1","DetailActivity onCreate() called")
    }

    override fun onStart() {
        super.onStart()
        Log.d("lab1","DetailActivity onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("lab1","DetailActivity onResume() called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("lab1","DetailActivity onRestart() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("lab1","DetailActivity onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("lab1","DetailActivity onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("lab1","DetailActivity onDestroy() called")
    }
}