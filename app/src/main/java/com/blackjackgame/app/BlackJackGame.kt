package com.blackjackgame.app

import java.util.ArrayList

interface BlackJackGame {
    fun startGame() // начало игры

    fun getStartingCards(): List<Card> // берем 2 карты

    fun getAdditionalCard(): Card // взять еще одну карту если надо
    fun stopGettingCards() // перестаем брать карты

    fun getCardsValue(): Int // показываем сумму карт

    fun getOpponentCards(): List<Card> // показывает карты соперника
    fun getOpponentCardsValue(): Int // показывает сумму карт соперника

    fun checkIfWin(): GameResult // проверяем кто выиграл

    fun getStats(): Statistics // показывает статистику игр
}

class BlackJackGameMock: BlackJackGame{
    override fun startGame() {

    }

    override fun getStartingCards(): List<Card> {
        return  ArrayList()
    }

    override fun getAdditionalCard(): Card {
        return Card(CardRank.KING,CardSuit.DIAMONDS,4)
    }

    override fun stopGettingCards() {

    }

    override fun getCardsValue(): Int {
        return 18
    }

    override fun getOpponentCards(): List<Card> {
        return ArrayList()
    }

    override fun getOpponentCardsValue(): Int {
        return 19
    }

    override fun checkIfWin(): GameResult  {
        return GameResult.LOSE
    }

    override fun getStats(): Statistics {
        return Statistics(1,1,5)
    }
}