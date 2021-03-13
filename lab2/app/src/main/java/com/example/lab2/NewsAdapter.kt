package com.example.lab2

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lab2.News.News

class NewsAdapter(private val newsList: Array<News>) : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val headerTextView: TextView
        val dateTextView: TextView
        val infoTextView: TextView
        val imageView : ImageView

        init {
            headerTextView = itemView.findViewById(R.id.list_item_header)
            dateTextView = itemView.findViewById(R.id.list_item_date)
            infoTextView = itemView.findViewById(R.id.list_item_info)
            imageView = itemView.findViewById(R.id.list_item_img)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item,parent,false)
        return NewsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return newsList.size
        Log.d("SiiiiiiiiiiiiiiiZE",newsList.size.toString())
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val newsItem:News = newsList[position % newsList.size]
        holder.headerTextView.text = newsItem.head
        holder.dateTextView.text = newsItem.date
        holder.infoTextView.text = newsItem.info
        holder.imageView.setImageResource(newsItem.image!!)
    }
}