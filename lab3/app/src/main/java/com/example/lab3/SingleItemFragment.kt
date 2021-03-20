package com.example.lab3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.lab3.News.newsList

class SingleItemFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentView = inflater.inflate(R.layout.fragment_single_item, container, false)

        val news = newsList()[
                arguments?.getInt("newsId")!!
        ]

        val newsImage = fragmentView.findViewById<ImageView>(R.id.list_item_img)
        val newsHeader = fragmentView.findViewById<TextView>(R.id.list_item_header)
        val newsDate = fragmentView.findViewById<TextView>(R.id.list_item_date)
        val newsText = fragmentView.findViewById<TextView>(R.id.list_item_cut)

        newsHeader.text = news.head
        newsDate.text = news.date
        newsText.text = (news.info + "\n" + news.someText)
        newsImage.setImageResource(news.image!!)

        return fragmentView
    }

}