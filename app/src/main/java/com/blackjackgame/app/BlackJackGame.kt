package com.blackjackgame.app

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

