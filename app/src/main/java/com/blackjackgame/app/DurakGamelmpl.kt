//package com.blackjackgame.app
//
//class DurakGamelmpl : DurakGame {
//    private val remainingCard = ArrayList(cards)
//
//    private var cardsPlayer = arrayListOf<Card>()
//    private var cardsBot = arrayListOf<Card>()
//
//
//    override fun startGame(){
//
//    }
//
//    override fun deckCounter(): Int {
//       val deck = remainingCard.size
//        return deck
//    }
//
//    private fun getRandomCart(): Card {
//       val random = (0 until remainingCard.size).random()
//       val randomCard = remainingCard[random]
//        remainingCard.remove(randomCard)
//       return randomCard
//    }
//
//
//    override fun getCardsBot(): Int {
//        cardsBot = arrayListOf(getRandomCart(),getRandomCart(),getRandomCart(),getRandomCart(),getRandomCart(),getRandomCart())
//        return cardsBot
//    }
//
//    override fun getCardsPlayer(): List<Card> {
//        cardsPlayer = arrayListOf(getRandomCart(),getRandomCart(),getRandomCart(),getRandomCart(),getRandomCart(),getRandomCart())
//        return cardsPlayer
//    }
//
//    override  fun getTrump():Card {
//        val trumpCart = getRandomCart()
//        remainingCard.add(trumpCart)
//        return trumpCart
//    }
//
//    override fun firstTurn():Boolean {
//       val startListPlayer = cardsPlayer.filter { it.suit == getTrump().suit }
//       val startListBot = cardsBot.filter { it.suit == getTrump().suit }
//
//       return
//
//    }
//
//    override fun turn(cards:List<Card>): TurnResult {
//
//    }
//
//    override fun endTurn() {
//
//    }
//
//    override fun takeCards() {
//
//    }
//
//    override fun checkIfWin(): GameResult {
//        val cardWinPlayer = cardsPlayer.size
//        val cardWinBot = cardsBot.size
//       if(cardWinPlayer < cardWinBot){
//           return GameResult.WIN
//       }else if(cardWinPlayer > cardWinBot){
//           return GameResult.LOSE
//       }else{
//           return GameResult.DRAW
//       }
//
//   }
//}