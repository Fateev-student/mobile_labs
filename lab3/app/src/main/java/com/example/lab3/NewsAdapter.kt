package com.example.lab3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lab3.News.IpsumNews

class NewsAdapter(private val newsList: Array<IpsumNews>, private val onClickCallback: (Int) -> Unit ) : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)  {
        val headerTextView: TextView = itemView.findViewById(R.id.list_item_header)
        val dateTextView: TextView = itemView.findViewById(R.id.list_item_date)
        val cutTextView: TextView = itemView.findViewById(R.id.list_item_cut)
        val imageView : ImageView = itemView.findViewById(R.id.list_item_img)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item,parent,false)
        return NewsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val newsItem = newsList[position]

        holder.headerTextView.text = newsItem!!.name
        holder.dateTextView.text = newsItem.date
        holder.cutTextView.text = newsItem!!.expansion
        holder.imageView.setImageResource(newsItem.image!!)

        holder.itemView.setOnClickListener {
            onClickCallback(position)
        }
    }
}