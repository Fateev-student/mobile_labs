package com.example.testapplication

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import okhttp3.*
import java.io.IOException
import android.text.Html
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.json.JSONObject

class MainActivity : AppCompatActivity() {

    val URL = "https://random-data-api.com/api/lorem_ipsum/random_lorem_ipsum"
    var okHttpClient: OkHttpClient = OkHttpClient()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn:Button = this.findViewById(R.id.nextBtn)
        makeRequest(URL_ipsum)
    }

    data class IpsumNews(
            var short_sentence: String,
            var long_sentence: String,
            var very_long_sentence: String,
            var date: String
    )

    val URL_ipsum = "https://random-data-api.com/api/lorem_ipsum/random_lorem_ipsum"
    var smth: String? = "1"
    fun newNewsList(): Array<IpsumNews> {
        var news = emptyArray<IpsumNews>()
        var response: String
        for(i in 0..9){
            response = makeRequest(URL_ipsum)
            news += IpsumNews((JSONObject(response).get("short_sentence")).toString(),
                    (JSONObject(response).get("long_sentence")).toString(),
                    (JSONObject(response).get("very_long_sentence")).toString(),
                    "10 августа 1987 года"
            )
        }
        return news
    }

    private fun makeRequest(URL: String): String {
        val request: Request = Request.Builder().url(URL).build()
        var json: String = ""
        okHttpClient.newCall(request).enqueue(object: Callback {
            override fun onFailure(call: Call?, e: IOException?) {
            }

            override fun onResponse(call: Call?, response: Response?) {
                json = response?.body()?.string().toString()
                runOnUiThread{
                    smth = json
                    val text: TextView = findViewById(R.id.textview)
                    text.text = smth
                }
            }
        })
        return json
    }




    private fun loadRandomFact() {
        runOnUiThread {
        }

        val request: Request = Request.Builder().url(URL).build()
        okHttpClient.newCall(request).enqueue(object: Callback {
            override fun onFailure(call: Call?, e: IOException?) {
            }

            override fun onResponse(call: Call?, response: Response?) {
                val json = response?.body()?.string()
                val txt = (JSONObject(json).get("short_sentence")).toString()

                runOnUiThread {
                    val text: TextView = findViewById(R.id.textview)
                    text.text = Html.fromHtml(txt)
                }
            }
        })

    }
}

