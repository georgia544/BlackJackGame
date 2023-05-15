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

class DurakMock:DurakGame{
    override fun startGame() {

    }

    override fun getStartingCardsBot(): List<Card> {
        return ArrayList()
    }

    override fun getStartingCardsPlayer(): List<Card> {
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