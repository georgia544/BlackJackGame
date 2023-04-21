package com.blackjackgame.app

data class Card(val name: CardRank, val value: Int)

enum class CardRank{
    ACE,
    KING,
    QUEEN,
    JACK,
    TEN,
    NINE,
    EIGHT,
    SEVEN,
    SIX,
    FIVE,
    FOUR,
    THREE,
    TWO
}