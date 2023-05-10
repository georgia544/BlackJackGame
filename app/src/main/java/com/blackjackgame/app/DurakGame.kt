package com.blackjackgame.app

interface DurakGame {
    fun startGame() //начало игры
    fun getStartingCardsBot():List<Card> //получаем по 6 карт бота ебаного
    fun getStartingCardsPlayer():List<Card> // 6 карт игроку ссаному
    fun getTrump():Card //определяем козырную карту
    fun firstTurn():Boolean //кто первый ходит
    fun turn(cards:List<Card>):TurnResult //ход-бито, подкинул/походил
    fun endTurn():PlayersQueue //закончить ход и поменять ход игрока
    fun takeCards(cards: List<Card>) //забрать карты со стола в руку
    fun getAdditionalCards():List<Card> //добор карт до 6
    fun checkIfWin(): GameResult //кто выиграл
}