package com.example.lab3

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lab3.News.newNewsList

class ListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentView = inflater.inflate(R.layout.fragment_list, container, false)
        val recyclerView:RecyclerView = fragmentView.findViewById(R.id.news_recycler_view)

        recyclerView.adapter = NewsAdapter(
            newNewsList()
        ) { newsId ->
            val intent = Intent(activity,SingleItemActivity::class.java)
            intent.putExtra("newsId",newsId)
            startActivity(intent)
        }
        return fragmentView
    }


}