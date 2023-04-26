package com.blackjackgame.app

class BlackJackGameImpl : BlackJackGame {

    private var gamerCards = arrayListOf<Card>()
    private var dealerCards = arrayListOf<Card>()


    override fun startGame() {
        gamerCards.clear()
        dealerCards.clear()
        remainingCards.addAll(cardsInPlay)
        cardsInPlay.clear()
    }


    override fun getStartingCards(): List<Card> {
        gamerCards = arrayListOf(getRandomCardRank(), getRandomCardRank())
        return gamerCards
    }

    override fun getAdditionalCard(): Card {
        val newGamerCard = getRandomCardRank()
        gamerCards.add(newGamerCard)
        return newGamerCard

    }

    override fun stopGettingCards() {
    }

    override fun getCardsValue(): Int {
        var sum = 0
        gamerCards.forEach {
            sum += it.value
        }
        return sum
    }


    override fun getOpponentCards(): List<Card> {
        dealerCards = arrayListOf(getRandomCardRank(), getRandomCardRank())
        val dealerCardsSum = getOpponentCardsValue()

        if (dealerCardsSum < 18) {
            val newDealerCard = getAdditionalCard()
            dealerCards.add(newDealerCard)
        }
        return dealerCards
    }

    override fun getOpponentCardsValue(): Int {
        var sum = 0
        dealerCards.forEach {
            sum += it.value
        }
        return sum
    }

    override fun checkIfWin(): GameResult {
        val dealerCardsSum = getOpponentCardsValue()
        val gamerCardsSum = getCardsValue()
        if ((dealerCardsSum < gamerCardsSum) && gamerCardsSum <= 21) return GameResult.WIN
        if (dealerCardsSum > 21 && gamerCardsSum <= 21) return GameResult.WIN
        if (dealerCardsSum == gamerCardsSum) return GameResult.DRAW
        if (dealerCardsSum > 21 && gamerCardsSum > 21) return GameResult.DRAW
        return GameResult.LOSE
    }

    override fun getStats(): List<Int> {
        TODO("Not yet implemented")
    }


}

enum class GameResult {
    WIN,
    LOSE,
    DRAW
}