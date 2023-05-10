package com.blackjackgame.app

import com.blackjackgame.app.CardRank.ACE

class BlackJackGameImpl : BlackJackGame {

    private var gamerCards = arrayListOf<Card>()
    private var dealerCards = arrayListOf<Card>()

   private val remainingCards = ArrayList(cards)
  private  val cardsInPlay = ArrayList<Card>()

   private fun getRandomCardRank(): Card {
       println(remainingCards)
        val random = (0 until remainingCards.size).random()
        val randomCard = remainingCards[random]
        cardsInPlay.add(randomCard)
        remainingCards.remove(randomCard)
        return randomCard

    }
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
        val aceList = gamerCards.filter { it.name == ACE }
        val listWithoutAce = gamerCards.filter { it.name != ACE }
        listWithoutAce.forEach {
                sum += it.value
            }
        aceList.forEach{
            if (sum<11){
                sum += it.value
            }else{
                sum +=1
            }
        }

        return sum
    }

    override fun getOpponentCardsValue(): Int {
        var sum = 0
        val aceList = dealerCards.filter { it.name == ACE }
        val listWithoutAce = dealerCards.filter { it.name != ACE }
        listWithoutAce.forEach {
            sum += it.value
        }
        aceList.forEach{
            if (sum<11){
                sum += it.value
            }else{
                sum +=1
            }
        }
        return sum
    }

    override fun getOpponentCards(): List<Card> {
        dealerCards = arrayListOf(getRandomCardRank(), getRandomCardRank())
        var dealerCardsSum = getOpponentCardsValue()


        while (dealerCardsSum < 18) {
            val newDealerCard = getAdditionalCard()
            dealerCards.add(newDealerCard)
            dealerCardsSum = getOpponentCardsValue()
        }
        return dealerCards
    }


    private var statistics = Statistics(0,0,0)

    override fun checkIfWin(): GameResult {

        val dealerCardsSum = getOpponentCardsValue()
        val gamerCardsSum = getCardsValue()
        if ((dealerCardsSum < gamerCardsSum) && gamerCardsSum <= 21) {
          statistics= statistics.copy(win=statistics.win+1)
            return GameResult.WIN
        }
        if (dealerCardsSum > 21 && gamerCardsSum <= 21){
            statistics= statistics.copy(win=statistics.win+1)
            return GameResult.WIN
        }
        if (dealerCardsSum == gamerCardsSum) {
            statistics= statistics.copy(draw=statistics.draw+1)
            return GameResult.DRAW
        }
        if (dealerCardsSum > 21 && gamerCardsSum > 21){
            statistics= statistics.copy(draw=statistics.draw+1)
            return GameResult.DRAW
        }
        statistics= statistics.copy(lose=statistics.lose+1)
        return GameResult.LOSE
    }

    override fun getStats(): Statistics {
        return statistics
    }


}

enum class GameResult {
    IN_PROGRESS,
    WIN,
    LOSE,
    DRAW
}