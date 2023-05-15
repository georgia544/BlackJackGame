package com.blackjackgame.app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class CardBotAdapter(private var amount:Int) :
    RecyclerView.Adapter<CardBotAdapter.CardViewHolder>() {

    fun updateAmount(updatedAmount:Int){
        amount=updatedAmount
        notifyDataSetChanged()
    }

    class CardViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_item_bot, parent, false)

        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
    }

    override fun getItemCount() = amount

}