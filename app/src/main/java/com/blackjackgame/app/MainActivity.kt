package com.blackjackgame.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton: Button = findViewById(R.id.button_start)

        val textCardBot: TextView = findViewById(R.id.text_cards_bot)

        val textSumCardBot: TextView = findViewById(R.id.text_sum_cards_bot)

        val checkButton: Button = findViewById(R.id.button_check)

        val texSumCardPlayer: TextView = findViewById(R.id.text_sum_player)

        val textCardPlayer: TextView = findViewById(R.id.text_card_player)

        val takeCardButton: Button = findViewById(R.id.button_take_a_card)

        val textWin: TextView = findViewById(R.id.text_wins)

        val textStatistics: TextView = findViewById(R.id.text_statistics)

        val blackJack = BlackJackGameMock()

        startButton.setOnClickListener{
            textWin.text = ""
            textCardBot.text = ""
            textCardPlayer.text = ""
            textSumCardBot.text = ""
            texSumCardPlayer.text = ""
            textCardPlayer.text = blackJack.getStartingCards().toString()
        }

        checkButton.setOnClickListener{
            textCardBot.text = blackJack.getOpponentCards().toString()
            textSumCardBot.text = blackJack.getOpponentCardsValue().toString()
            texSumCardPlayer.text = blackJack.getCardsValue().toString()
            textWin.text = blackJack.checkIfWin().toString()
            textStatistics.text = textStatistics.text.toString() + " " + textWin.toString()
        }
        takeCardButton.setOnClickListener{
           textCardPlayer.text = textCardPlayer.text.toString() + " " + blackJack.getAdditionalCard().toString()
        }

    }
}