package com.example.lab3
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3.News.okHttpClient
import okhttp3.*
import org.json.JSONObject
import java.io.IOException


class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        supportActionBar?.title = "Новости"
    }
}