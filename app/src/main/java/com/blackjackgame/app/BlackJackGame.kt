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

    fun getStats(): List<Int> // показывает статистику игр
}

class BlackJackGameMac: BlackJackGame{
    override fun startGame() {

    }

    override fun getStartingCards(): List<Card> {
        return  ArrayList()
    }

    override fun getAdditionalCard(): Card {
        return Card(,2,2)
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

    override fun checkIfWin(): Boolean {
        return true
    }

    override fun getStats(): List<Int> {
        return ArrayList()
    }
}