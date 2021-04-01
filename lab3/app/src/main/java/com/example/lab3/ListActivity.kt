package com.example.lab3
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3.News.IpsumNews
import com.example.lab3.News.newNewsList
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import okhttp3.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        supportActionBar?.title = "Новости"

        var myNewsList = emptyArray<IpsumNews>()
        CoroutineScope(Dispatchers.IO).launch{
            myNewsList = newNewsList()
        }
        Log.d("LOOOOG", myNewsList[0].name)
        Log.d("LOOOOG", myNewsList[0].expansion)
        Log.d("LOOOOG", myNewsList[0].army_type)
    }
}
