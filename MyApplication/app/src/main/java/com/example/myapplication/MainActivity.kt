package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.util.Log
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onStart() {
        super.onStart()
        Log.d("lab1","MainActivity onStart() called")
        val toDetailActivityButton : Button = findViewById(R.id.to_detail_activity_button)
        val toUrlButton : Button = findViewById(R.id.to_url_button)

        toDetailActivityButton.setOnClickListener {
            startActivity(
                    Intent(this,DetailActivity::class.java)
            )
        }

        toUrlButton.setOnClickListener {
            startActivity(
                    Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=j3hOd7u35no&ab_channel=Sislak11"))
            )
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d("lab1","MainActivity onResume() called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("lab1","MainActivity onRestart() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("lab1","MainActivity onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("lab1","MainActivity onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("lab1","MainActivity onDestroy() called")
    }
}