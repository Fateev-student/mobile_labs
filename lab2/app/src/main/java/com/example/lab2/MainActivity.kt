package com.example.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.lab2.News.newsList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val newsRecyclerView: RecyclerView = findViewById(R.id.recycler_view)
        val newsAdapter = NewsAdapter(newsList())
        newsRecyclerView.adapter = newsAdapter
    }
}