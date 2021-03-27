package com.example.lab3.News

import android.text.Html
import android.widget.TextView
import com.example.lab3.R
import androidx.annotation.DrawableRes
import okhttp3.*
import org.json.JSONObject
import java.io.IOException


data class News(
    val head: String,
    val date: String,
    val info: String,
    val someText: String,
    @DrawableRes
    val image: Int?
)

data class IpsumNews(
        var short_sentence: String,
        var long_sentence: String,
        var very_long_sentence: String,
        var date: String,
        @DrawableRes
        var image: Int?
)

val URL_ipsum = "https://random-data-api.com/api/lorem_ipsum/random_lorem_ipsum"
var okHttpClient: OkHttpClient = OkHttpClient()

fun newNewsList(): Array<IpsumNews> {
    var news = emptyArray<IpsumNews>()
    var response: String?
    for(i in 0..9){
        response = makeRequest(URL_ipsum)
        news += IpsumNews((JSONObject(response).get("short_sentence")).toString(),
                (JSONObject(response).get("long_sentence")).toString(),
                (JSONObject(response).get("very_long_sentence")).toString(),
                "10 августа 1987 года",
                R.drawable.pic11
                )
    }
    return news
}

fun makeRequest(URL: String): String? {
    val request: Request = Request.Builder().url(URL).build()
    var json: String? = ""
    okHttpClient.newCall(request).enqueue(object: Callback {
        override fun onFailure(call: Call?, e: IOException?) {
        }

        override fun onResponse(call: Call?, response: Response?) {
            json = response?.body()?.string()

        }
    })
    return json
}
fun newsList(): Array<News>{
    return arrayOf(
        News(
            head = "Странные люди замечены в Египте",
            date = "10 августа 1987 года",
            info = "Группа странных людей замечена в Египте. В процессе своего путешествия они разбили несколько транспортных средств.",
            someText = "something something something something something something something something something something something ",
            image = R.drawable.pic1
        ),
        News(
            head = "Что можно сказать при помощи языка жестов",
            date = "10 августа 1987 года",
            info = "Да много чего лол",
            someText = "something something something something something something something something something something something ",
            image = R.drawable.pic2
        ),
        News(
            head = "Для чего на самом деле нужно строительное оборудование?",
            date = "10 августа 1987 года",
            info = "Чтобы ответить на этот вопрос потребовалось экспертное мнение Эксперта по строй технике Дио Брандэ.",
            someText = "something something something something something something something something something something something ",
            image = R.drawable.pic3
        ),
        News(
            head = "Кто то выкопал качалку древних ацтеков",
            date = "10 августа 1987 года",
            info = "Древняя качалка древних ацтеков с древними каменными людьми из колонны.",
            someText = "something something something something something something something something something something something ",
            image = R.drawable.pic4
        ),
        News(
            head = "С чего начинался фонд Скоростного Вагона?",
            date = "10 августа 1987 года",
            info = "Изначально спидвагон носил шляпу. А еще он нашел нефть. Собсна все, а что еще нужно?",
            someText = "something something something something something something something something something something something ",
            image = R.drawable.pic5
        ),
        News(
            head = "Что плохого в казино?",
            date = "10 августа 1987 года",
            info = "Много чего, один чел чуть не проиграл свою душу(и не только свою).",
            someText = "something something something something something something something something something something something ",
            image = R.drawable.pic6
        ),
        News(
            head = "Сколько лет этому человеку?",
            date = "10 августа 1987 года",
            info = "15 лол",
            someText = "something something something something something something something something something something something ",
            image = R.drawable.pic7
        ),
        News(
            head = "Цыганские фокусы",
            date = "10 августа 1987 года",
            info = "Абдул опять что-то поджог, на этот раз машину. К сожалению, возле машины внезапно появился медведь.",
            someText = "something something something something something something something something something something something ",
            image = R.drawable.pic8
        ),
        News(
            head = "Араки забыл что он Араки",
            date = "10 августа 1987 года",
            info = "Араки забыл что он Араки и начал писать какую-то фигню вместо жожи, после пиллармэнов можно дропать.",
            someText = "something something something something something something something something something something something ",
            image = R.drawable.pic9
        ),
        News(
            head = "Что такое JOJO-референс?",
            date = "10 августа 1987 года",
            info = "Подумайте о чем угодно. Подумали? Поздравляю, это тоже JOJO-референс. Все есть JOJO-референс.",
            someText = "something something something something something something something something something something something ",
            image = R.drawable.pic10
        ),
        News(
            head = "Как много людей смогло уклониться от Emerald Splash, при условии что от него никто не может уклониться??",
            someText = "something something something something something something something something something something something ",
            date = "10 августа 1987 года",
            info = "Все. Все, кого Какёин им атаковал.",
            image = R.drawable.pic11
        )
    )
}