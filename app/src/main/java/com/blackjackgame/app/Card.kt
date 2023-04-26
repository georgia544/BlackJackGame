package com.blackjackgame.app

data class Card(val name: CardRank, val suit: CardSuit, val value: Int)

val cards = listOf(
    Card(CardRank.ACE, CardSuit.CLUBS, 11),
    Card(CardRank.ACE, CardSuit.DIAMONDS, 11),
    Card(CardRank.ACE, CardSuit.HEARTS, 11),
    Card(CardRank.ACE, CardSuit.SPADES, 11),

    Card(CardRank.KING, CardSuit.CLUBS, 4),
    Card(CardRank.KING, CardSuit.HEARTS, 4),
    Card(CardRank.KING, CardSuit.DIAMONDS, 4),
    Card(CardRank.KING, CardSuit.SPADES, 4),

    Card(CardRank.QUEEN, CardSuit.CLUBS, 3),
    Card(CardRank.QUEEN, CardSuit.HEARTS, 3),
    Card(CardRank.QUEEN, CardSuit.DIAMONDS, 3),
    Card(CardRank.QUEEN, CardSuit.SPADES, 3),

    Card(CardRank.JACK, CardSuit.CLUBS, 2),
    Card(CardRank.JACK, CardSuit.HEARTS, 2),
    Card(CardRank.JACK, CardSuit.DIAMONDS, 2),
    Card(CardRank.JACK, CardSuit.SPADES, 2),

    Card(CardRank.TEN, CardSuit.CLUBS, 10),
    Card(CardRank.TEN, CardSuit.HEARTS, 10),
    Card(CardRank.TEN, CardSuit.DIAMONDS, 10),
    Card(CardRank.TEN, CardSuit.SPADES, 10),

    Card(CardRank.NINE, CardSuit.CLUBS, 9),
    Card(CardRank.NINE, CardSuit.HEARTS, 9),
    Card(CardRank.NINE, CardSuit.DIAMONDS, 9),
    Card(CardRank.NINE, CardSuit.SPADES, 9),

    Card(CardRank.EIGHT, CardSuit.CLUBS, 8),
    Card(CardRank.EIGHT, CardSuit.HEARTS, 8),
    Card(CardRank.EIGHT, CardSuit.DIAMONDS, 8),
    Card(CardRank.EIGHT, CardSuit.SPADES, 8),

    Card(CardRank.SEVEN, CardSuit.CLUBS, 7),
    Card(CardRank.SEVEN, CardSuit.HEARTS, 7),
    Card(CardRank.SEVEN, CardSuit.DIAMONDS, 7),
    Card(CardRank.SEVEN, CardSuit.SPADES, 7),

    Card(CardRank.SIX, CardSuit.CLUBS, 6),
    Card(CardRank.SIX, CardSuit.HEARTS, 6),
    Card(CardRank.SIX, CardSuit.DIAMONDS, 6),
    Card(CardRank.SIX, CardSuit.SPADES, 6)
)

val remainingCards = ArrayList(cards)
val cardsInPlay = ArrayList<Card>()

//[2,3]
// [4] 1
//3  2
fun getRandomCardRank(): Card {
    val random = (0 until remainingCards.size).random()
    val randomCard = remainingCards[random]
    cardsInPlay.add(randomCard)
    remainingCards.remove(randomCard)
    return randomCard

}


enum class CardRank {
    ACE,
    KING,
    QUEEN,
    JACK,
    TEN,
    NINE,
    EIGHT,
    SEVEN,
    SIX
}

enum class CardSuit {
    DIAMONDS,
    HEARTS,
    CLUBS,
    SPADES
}