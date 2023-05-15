package com.blackjackgame.app

class DurakGameMock:DurakGame {
    override fun startGame() {

    }

    override fun deckCounter(): Int {
        return 21
    }

    override fun getCardsBot(): Int {
        return 5
    }

    override fun getCardsPlayer(): List<Card> {
        return arrayListOf(
            Card(CardRank.JACK, CardSuit.CLUBS, 0),
            Card(CardRank.QUEEN, CardSuit.HEARTS, 0),
            Card(CardRank.EIGHT, CardSuit.CLUBS, 0),
            Card(CardRank.KING, CardSuit.SPADES, 0),
            Card(CardRank.SEVEN, CardSuit.DIAMONDS, 0)

        )
    }

    override fun getTrump(): Card {
        return Card(CardRank.TEN,CardSuit.HEARTS,0)
    }

    override fun firstTurn(): Boolean {
        return true
    }

    override fun isMyTurn(): Boolean {
        return true
    }

    override fun turn(cards: List<Card>): Boolean {
        return false
    }

    override fun requestBotTurn(): Boolean {
        return false
    }

    override fun table(): List<TableEntity> {
        return arrayListOf(
            TableEntity(
                Card(CardRank.TEN, CardSuit.CLUBS, 0), Card(CardRank.QUEEN, CardSuit.CLUBS, 0)
            ),
            TableEntity(
                Card(CardRank.QUEEN, CardSuit.DIAMONDS, 0), Card(CardRank.ACE, CardSuit.DIAMONDS, 0)
            )
        )
    }

    override fun endTurn() {
    }

    override fun takeCards() {

    }

    override fun checkIfWin(): GameResult {
        return GameResult.LOSE
    }
}