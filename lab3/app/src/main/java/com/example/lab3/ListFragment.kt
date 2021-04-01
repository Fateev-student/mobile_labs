package com.example.lab3

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lab3.News.IpsumNews
import com.example.lab3.News.newNewsList
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main

class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var list = emptyArray<IpsumNews>()
        CoroutineScope(Main).launch{
            list = async{newNewsList()}.await()
        }
        val fragmentView = inflater.inflate(R.layout.fragment_list, container, false)
        val recyclerView:RecyclerView = fragmentView.findViewById(R.id.news_recycler_view)


            recyclerView.adapter = NewsAdapter(
                list
            ) { position ->
                val intent = Intent(activity, SingleItemActivity::class.java)
                intent.putExtra("position", position)
                startActivity(intent)
            }

        return fragmentView
    }
}