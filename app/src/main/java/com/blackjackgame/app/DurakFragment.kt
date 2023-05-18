package com.blackjackgame.app

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isInvisible
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cdflynn.android.library.turn.TurnLayoutManager
import cdflynn.android.library.turn.TurnLayoutManager.Orientation

class DurakFragment : Fragment(R.layout.fragment_durak) {
    private val durakGame: DurakGame = DurakGameMock()
    private val cardsOnTableAdapter = CardsOnTableAdapter(arrayListOf())
    private val cardsPlayerAdapter = CardAdapter(arrayListOf(), durakGame, ::updateUI)
    private val cardsBotAdapter = CardBotAdapter(0)
    private lateinit var deckCounterTextView: TextView
    private lateinit var cardShirtImageView: ImageView
    private lateinit var trumpCardImageView: ImageView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<ImageButton>(R.id.menu_fragment).setOnClickListener {
            DurakGameMenuDialog().show(parentFragmentManager, null)

        }


        durakGame.startGame()


        val cardsPlayerContainer: RecyclerView = view.findViewById(R.id.player_cards)

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

        cardsBotContainer.adapter = cardsBotAdapter
        cardsBotAdapter.updateAmount(durakGame.getCardsBot())


        val cardsOnTableContainer: RecyclerView = view.findViewById(R.id.cards_on_table)

        cardsOnTableContainer.layoutManager = GridLayoutManager(context, 3)
        cardsOnTableContainer.adapter = cardsOnTableAdapter




        cardsOnTableAdapter.updateItems(
            ArrayList(
                durakGame.table().map {
                    CardsOnTableItem(
                        topImage = it.upperCard?.convert(),
                        bottomImage = it.bottomCard?.convert()
                    )
                }
            )
        )



        deckCounterTextView = view.findViewById<TextView>(R.id.deck_counter)
        deckCounterTextView.text = durakGame.deckCounter().toString()

        trumpCardImageView = view.findViewById<ImageView>(R.id.trump)
        trumpCardImageView.setImageResource(durakGame.getTrump().convert())


        val endOfTurnButton = view.findViewById<Button>(R.id.end_of_turn_button)
        endOfTurnButton.setOnClickListener {
            if (durakGame.isMyTurn()) {
                durakGame.endTurn()

            } else {
                durakGame.takeCards()
            }
            durakGame.requestBotTurn()
            updateUI()
        }

        val deckCounterTextView = view.findViewById<TextView>(R.id.deck_counter)
        cardShirtImageView = view.findViewById<ImageView>(R.id.card_shirt)

        if (durakGame.deckCounter() == 1) {
            cardShirtImageView.visibility = View.INVISIBLE
            deckCounterTextView.visibility = View.INVISIBLE
            trumpCardImageView.visibility = View.VISIBLE

        } else if (durakGame.deckCounter() == 0) {

            cardShirtImageView.visibility = View.INVISIBLE
            deckCounterTextView.visibility = View.INVISIBLE
            trumpCardImageView.visibility = View.INVISIBLE
        }


    }

    fun updateUI() {
        cardsOnTableAdapter.updateItems(
            ArrayList(
                durakGame.table().map {
                    CardsOnTableItem(
                        topImage = it.upperCard?.convert(),
                        bottomImage = it.bottomCard?.convert()
                    )
                }
            )
        )
        cardsPlayerAdapter.updateItems(
            ArrayList(
                durakGame.getCardsPlayer().map {
                    CardItem(it.convert())
                })
        )

        cardsBotAdapter.updateAmount(durakGame.getCardsBot())

        deckCounterTextView.text = durakGame.deckCounter().toString()

        if (durakGame.deckCounter() == 1) {
            cardShirtImageView.visibility = View.INVISIBLE
            deckCounterTextView.visibility = View.INVISIBLE
            trumpCardImageView.visibility = View.VISIBLE

        } else if (durakGame.deckCounter() == 0) {

            cardShirtImageView.visibility = View.INVISIBLE
            deckCounterTextView.visibility = View.INVISIBLE
            trumpCardImageView.visibility = View.INVISIBLE
        }
    }
}