package com.blackjackgame.app

class DurakGamelmpl : DurakGame {
    private var deckCard = arrayListOf<Card>()


    private val remainingCard = ArrayList(cards)


    override fun startGame(){

    }

    private fun getRandomCart(): Card {
       val random = (0 until remainingCard.size).random()
       val randomCard = remainingCard[random]

       return randomCard
    }


    override fun getStartingCardsBot(): List<Card> {
        deckCard = arrayListOf(getRandomCart(),getRandomCart(),getRandomCart(),getRandomCart(),getRandomCart(),getRandomCart())
        return deckCard
    }

    override fun getStartingCardsPlayer(): List<Card> {
        deckCard = arrayListOf(getRandomCart(),getRandomCart(),getRandomCart(),getRandomCart(),getRandomCart(),getRandomCart())
        return deckCard
    }

    override  fun getTrump():Card {
        val trumpCart = getRandomCart()
        deckCard.add(trumpCart)
        return trumpCart
    }

    override fun firstTurn(): Boolean {

    }

    override fun turn(cards:List<Card>): TurnResult {

    }

    override fun endTurn(): PlayersQueue {

    }

    override fun takeCards(cards: List<Card>) {

    }
    override fun getAdditionalCards():List<Card> {

    }

    override fun checkIfWin(): GameResult {

    }
}