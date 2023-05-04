package com.blackjackgame.app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class CardAdapter(private val cardItems: ArrayList<CardItem>) :
    RecyclerView.Adapter<CardAdapter.CardViewHolder>() {

    fun addItem(cardItem: CardItem){
        cardItems.add(cardItem)
        notifyDataSetChanged()
    }


        class CardViewHolder(view: View) : RecyclerView.ViewHolder(view){
            val images : ImageView = view.findViewById(R.id.draw_card)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder{
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.cards_iteam, parent, false)

            return CardViewHolder(view)
        }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.images.setImageResource(cardItems[position].images)
    }

    override fun getItemCount() = cardItems.size

}