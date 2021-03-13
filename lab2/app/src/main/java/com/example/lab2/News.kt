package com.example.lab2.News

import androidx.annotation.DrawableRes
import com.example.lab2.R

data class News(
        val head: String,
        val date: String,
        val info: String,
        @DrawableRes
        val image: Int?
)

fun newsList(): Array<News> {
    return arrayOf(
            News(
                    head = "Странные люди замечены в Египте",
                    date = "10 августа 1987 года",
                    info = "Группа странных людей замечена в Египте. В процессе своего путешествия они разбили несколько транспортных средств.",
                    image = R.drawable.pic1
            ),
            News(
                    head = "Что можно сказать при помощи языка жестов",
                    date = "10 августа 1987 года",
                    info = "Да много чего лол",
                    image = R.drawable.pic2
            ),
            News(
                    head = "Для чего на самом деле нужно строительное оборудование?",
                    date = "10 августа 1987 года",
                    info = "Чтобы ответить на этот вопрос потребовалось экспертное мнение Эксперта по строй технике Дио Брандэ.",
                    image = R.drawable.pic3
            ),
            News(
                    head = "Кто то выкопал качалку древних ацтеков",
                    date = "10 августа 1987 года4",
                    info = "Древняя качалка древних ацтеков с древними каменными людьми из колонны.",
                    image = R.drawable.pic4
            ),
            News(
                    head = "С чего начинался фонд Скоростного Вагона?",
                    date = "10 августа 1987 года",
                    info = "Изначально спидвагон носил шляпу. А еще он нашел нефть. Собсна все, а что еще нужно?",
                    image = R.drawable.pic5
            ),
            News(
                    head = "Что плохого в казино?",
                    date = "10 августа 1987 года",
                    info = "Много чего, один чел чуть не проиграл свою душу(и не только свою).",
                    image = R.drawable.pic6
            ),
            News(
                    head = "Сколько лет этому человеку?",
                    date = "10 августа 1987 года",
                    info = "15 лол",
                    image = R.drawable.pic7
            ),
            News(
                    head = "Цыганские фокусы",
                    date = "10 августа 1987 года",
                    info = "Абдул опять что-то поджог, на этот раз машину. К сожалению, возле машины внезапно появился медведь.",
                    image = R.drawable.pic8 //это было сделано специально
            ),
            News(
                    head = "Араки забыл что он Араки",
                    date = "10 августа 1987 года",
                    info = "Араки забыл что он Араки и начал писать какую-то фигню вместо жожи, после пиллармэнов можно дропать.",
                    image = R.drawable.pic9
            ),
            News(
                    head = "Что такое JOJO-референс?",
                    date = "10 августа 1987 года",
                    info = "Подумайте о чем угодно. Подумали? Поздравляю, это тоже JOJO-референс. Все есть JOJO-референс.",
                    image = R.drawable.pic10
            ),
            News(
                    head = "Как много людей смогло уклониться от Emerald Splash, при условии что от него никто не может уклониться??",
                    date = "10 августа 1987 года",
                    info = "Все. Все, кого Какёин им атаковал.",
                    image = R.drawable.pic11
            )
    )
}