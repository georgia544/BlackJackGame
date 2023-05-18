package com.blackjackgame.app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class CardAdapter(private var cardItems: ArrayList<CardItem>,private val durakGame: DurakGame,
) : //TODO private val onTurn:()->Unit
    RecyclerView.Adapter<CardAdapter.CardViewHolder>() {

    fun addItem(cardItem: CardItem) {
        cardItems.add(cardItem)
        notifyDataSetChanged()
    }

    fun updateItems(list:ArrayList<CardItem>){
        cardItems = list
        notifyDataSetChanged()
    }


   class CardViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(R.id.draw_card_player)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.cards_item, parent, false)

        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.image.setImageResource(cardItems[position].images)
        holder.image.setOnClickListener {
           val chosenCard= durakGame.getCardsPlayer()[position]
            durakGame.turn(listOf(chosenCard))
            durakGame.requestBotTurn()
        }
    }

    override fun getItemCount() = cardItems.size

}