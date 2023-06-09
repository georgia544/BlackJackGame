package com.blackjackgame.app

interface DurakGame {
    fun startGame() //начало игры
    fun deckCounter(): Int// счетчик колоды
    fun getCardsBot(): Int //получаем по 6 карт бота ебаного
    fun getCardsPlayer():List<Card> // 6 карт игроку ссаному
    fun getTrump():Card //определяем козырную карту
    fun firstTurn():Boolean //кто первый ходит
    fun isMyTurn():Boolean // чей ход
    fun turn(cards:List<Card>): Boolean//ход-бито, подкинул/походил
    fun requestBotTurn(): Boolean// бот ебанный
    fun table(): List<TableEntity>
    fun endTurn() //закончить ход и поменять ход игрока добрать карты
    fun takeCards() //забрать карты со стола в руку
    fun checkIfWin(): GameResult //кто выиграл
}

