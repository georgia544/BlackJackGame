package com.blackjackgame.app

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import cdflynn.android.library.turn.TurnLayoutManager
import cdflynn.android.library.turn.TurnLayoutManager.Orientation

class DurakFragment : Fragment(R.layout.fragment_durak) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<ImageButton>(R.id.menu_fragment).setOnClickListener {
            DurakGameMenuDialog().show(parentFragmentManager, null)

        }

        val durakGame: DurakGame = DurakGameMock()
        durakGame.startGame()

        val cardsPlayerContainer: RecyclerView = view.findViewById(R.id.player_cards)
        val cardsPlayerAdapter = CardAdapter(arrayListOf())
        cardsPlayerContainer.adapter = cardsPlayerAdapter
//        cardsPlayerContainer.layoutManager = TurnLayoutManager(
//            context,              // provide a context
//            TurnLayoutManager.Gravity.END,        // from which direction should the list items orbit?
//            Orientation.HORIZONTAL, // Is this a vertical or horizontal scroll?
//            1500,               // The radius of the item rotation
//            0,                 // Extra offset distance
//            true
//        )


        cardsPlayerAdapter.updateItems(
            ArrayList(
                durakGame.getCardsPlayer().map {
                    CardItem(it.convert())
                })
        )

        val cardsBotContainer: RecyclerView = view.findViewById(R.id.bot_cards)
        val cardsBotAdapter = CardBotAdapter(0)
        cardsBotContainer.adapter = cardsBotAdapter

        cardsBotAdapter.updateAmount(durakGame.getCardsBot())

    }
}