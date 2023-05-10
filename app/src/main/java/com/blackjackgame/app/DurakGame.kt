package com.blackjackgame.app

interface DurakGame {
    fun startGame() //начало игры
    fun getStartingCardsBot():List<Card> //получаем по 6 карт бота ебаного
    fun getStartingCardsPlayer():List<Card> // 6 карт игроку ссаному
    fun getTrump():Card //определяем козырную карту
    fun firstTurn():Boolean //кто первый ходит, true-игрок, false - бот
    fun turn(cards:List<Card>):TurnResult //ход-бито, подкинул/походил
    fun endTurn():PlayersQueue //закончить ход и поменять ход игрока
    fun takeCards(cards: List<Card>) //забрать карты со стола в руку
    fun getAdditionalCards():List<Card> //добор карт до 6
    fun checkIfWin(): GameResult //кто выиграл
}

class DurakMock:DurakGame{
    override fun startGame() {

    }

    override fun getStartingCards(): List<Card> {
        return ArrayList()
    }

    override fun getTrump(): Card {
        return Card(CardRank.ACE,CardSuit.DIAMONDS,8)
    }

    override fun firstTurn(): Boolean {
        return true
    }

    override fun turn(cards: List<Card>): TurnResult {
        return TurnResult()
    }

    override fun endTurn(): PlayersQueue {
        return PlayersQueue()
    }

    override fun takeCards(cards: List<Card>) {

    }

    override fun getAdditionalCards(): List<Card> {
        return ArrayList()
    }

    override fun checkIfWin(): GameResult {
        return GameResult.WIN
    }


}