package com.blackjackgame.app

import com.blackjackgame.app.CardRank.ACE

class BlackJackGameImpl : BlackJackGame {

    private var gamerCards = arrayListOf<Card>()
    private var dealerCards = arrayListOf<Card>()

   private val remainingCards = ArrayList(cards)
  private  val cardsInPlay = ArrayList<Card>()

   private fun getRandomCardRank(): Card {
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
        val dealerCardsSum = getOpponentCardsValue()

        //TODO добавить цикл
        if (dealerCardsSum < 18) {
            val newDealerCard = getAdditionalCard()
            dealerCards.add(newDealerCard)
        }
        return dealerCards
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