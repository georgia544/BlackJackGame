package com.blackjackgame.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton: Button = findViewById(R.id.button_start)

        val cardsBotConteiner: RecyclerView = findViewById(R.id.cards_bot_conteiner)

        val textSumCardBot: TextView = findViewById(R.id.text_sum_cards_bot)

        val checkButton: Button = findViewById(R.id.button_check)

        val texSumCardPlayer: TextView = findViewById(R.id.text_sum_player)

        val textCardPlayer: TextView = findViewById(R.id.text_card_player)

        val takeCardButton: Button = findViewById(R.id.button_take_a_card)

        val textWin: TextView = findViewById(R.id.text_wins)

        val textStatistics: TextView = findViewById(R.id.text_statistics)

        val blackJack:BlackJackGame = BlackJackGameImpl()

        val cardItem = arrayListOf<CardItem>()

        val cardsBotAdapter = CardAdapter(cardItem)

        cardsBotConteiner.adapter = cardsBotAdapter

        val linearLayoutManagerBot = LinearLayoutManager(this)

        linearLayoutManagerBot.orientation = LinearLayoutManager.HORIZONTAL

        cardsBotConteiner.layoutManager = linearLayoutManagerBot



        //объединить кнопки старт и чек
        //сделать кнгопку take a cart карт только когщда она имеет смысл

     //   startButton.isEnabled

        startButton.setOnClickListener{//надо показывать сумму карт +
            textWin.text = ""
            blackJack.startGame()

            textCardPlayer.text = ""
            textSumCardBot.text = ""  // поменять местами сумму бота и игрока +
            texSumCardPlayer.text = ""
            textCardPlayer.text = blackJack.getStartingCards().toString()
            texSumCardPlayer.text = blackJack.getCardsValue().toString()
        }

        checkButton.setOnClickListener{
            blackJack.getOpponentCards().forEach{

               cardsBotAdapter.addItem(CardItem(it.convert()))
           }

            textSumCardBot.text = blackJack.getOpponentCardsValue().toString()
            textWin.text = blackJack.checkIfWin().toString()
            textStatistics.text = blackJack.getStats().toString()
        }
        takeCardButton.setOnClickListener{
           textCardPlayer.text = textCardPlayer.text.toString() + " " + blackJack.getAdditionalCard().toString()
           texSumCardPlayer.text = blackJack.getCardsValue().toString()
        }

    }
}