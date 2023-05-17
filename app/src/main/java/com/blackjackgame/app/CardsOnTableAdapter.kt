package com.blackjackgame.app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class CardsOnTableAdapter(private var cardsOnTable: ArrayList<CardsOnTableItem>) :
    RecyclerView.Adapter<CardsOnTableAdapter.CardViewHolder>() {

    fun updateItems(list:ArrayList<CardsOnTableItem>){
        cardsOnTable = list
        notifyDataSetChanged()
    }

    class CardViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val topImage: ImageView = view.findViewById(R.id.top_card)
        val bottomImage: ImageView = view.findViewById(R.id.bottom_card)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.cards_on_table_item, parent, false)

        return CardViewHolder(view)
    }


    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.topImage.setImageResource(cardsOnTable[position].topImage?:0)
        holder.bottomImage.setImageResource(cardsOnTable[position].bottomImage?:0)
    }

    override fun getItemCount(): Int = cardsOnTable.size
}