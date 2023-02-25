package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private var playerchoise: Int = 0
    fun startBtn(view: View){
        check()
    }
    fun btnRock(view: View){
        playerchoise = 1
    }
    fun btnPaper(view: View){
        playerchoise = 2
    }
    fun btnSpoke(view: View){
        playerchoise = 3
    }
    fun btnCrock(view: View){
        playerchoise = 4
    }
    fun btnlizard(view: View){
        playerchoise = 5
    }
    fun check(): String {
        var bot: Int = 0
        bot = (1..5).random()
        var Text = findViewById<TextView>(R.id.TextForExample)
        when(playerchoise){
            1 -> when(bot){
                2 -> Text.toString() == "Вы Победили"
                3 -> Text.toString() == "Вы Проиграли"
                4 -> Text.toString() ==  "Вы Победили"
                5 -> Text.toString() ==  "Вы Проиграли"
            }
            2 -> when(bot){
                1 -> Text.toString() == "Вы Победили"
                3 -> Text.toString() == "Вы Проиграли"
                4 -> Text.toString() ==  "Вы Победили"
                5 -> Text.toString() ==  "Вы Проиграли"
            }
            3 -> when(bot){
                1 -> Text.toString() == "Вы Победили"
                3 -> Text.toString() == "Вы Проиграли"
                4 -> Text.toString() ==  "Вы Победили"
                5 -> Text.toString() ==  "Вы Проиграли"
            }
            4 -> when(bot){
                1 -> Text.toString() == "Вы Победили"
                3 -> Text.toString() == "Вы Проиграли"
                4 -> Text.toString() ==  "Вы Победили"
                5 -> Text.toString() ==  "Вы Проиграли"
            }
            5 -> when(bot){
                1 -> Text.toString() == "Вы Победили"
                3 -> Text.toString() == "Вы Проиграли"
                4 -> Text.toString() ==  "Вы Победили"
                5 -> Text.toString() ==  "Вы Проиграли"
            }

        }
        return (Text.toString()=="Ничья").toString()
    }
}