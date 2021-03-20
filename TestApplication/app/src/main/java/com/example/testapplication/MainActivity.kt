package com.example.testapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.text.Html
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import okhttp3.*
import org.json.JSONObject
import java.io.IOException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        runAsync(url)
    }

    var client = OkHttpClient()
    var url = "https://api.icndb.com/jokes/random"

    fun runAsync(url: String?) {
        val text:TextView = findViewById(R.id.textview)
        val request = Request.Builder()
                .url(url)
                .build()
        client.newCall(request).enqueue(object : Callback {
            @Override
            override fun onFailure(call: Call, error: IOException) {
                error.printStackTrace()
            }

            @Throws(IOException::class)
            @Override
            override fun onResponse(call: Call, response: Response) {
                val responseBody: String = response.body()!!.string()
                val txt = (JSONObject(responseBody).getJSONObject("value").get("joke")).toString()
                runOnUiThread {
                    text.text = Html.fromHtml(txt)
                }
            }
        })
    }
}