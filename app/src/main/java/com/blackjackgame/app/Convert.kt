package com.blackjackgame.app

fun Card.convert(): Int {
    when (true) {
        checkIfEquals(CardRank.ACE, CardSuit.CLUBS) -> return R.drawable.ace_of_clubs
        checkIfEquals(CardRank.ACE, CardSuit.DIAMONDS) -> return R.drawable.ace_of_diamonds
        checkIfEquals(CardRank.ACE, CardSuit.HEARTS) -> return R.drawable.ace_of_hearts
        checkIfEquals(CardRank.ACE, CardSuit.SPADES) -> return R.drawable.ace_of_spades

        checkIfEquals(CardRank.KING, CardSuit.CLUBS) -> return R.drawable.king_of_clubs2
        checkIfEquals(CardRank.KING, CardSuit.DIAMONDS) -> return R.drawable.king_of_diamonds2
        checkIfEquals(CardRank.KING, CardSuit.HEARTS) -> return R.drawable.king_of_hearts2
        checkIfEquals(CardRank.KING, CardSuit.SPADES) -> return R.drawable.king_of_spades2

        checkIfEquals(CardRank.QUEEN, CardSuit.CLUBS) -> return R.drawable.queen_of_clubs2
        checkIfEquals(CardRank.QUEEN, CardSuit.DIAMONDS) -> return R.drawable.queen_of_diamonds2
        checkIfEquals(CardRank.QUEEN, CardSuit.HEARTS) -> return R.drawable.queen_of_hearts2
        checkIfEquals(CardRank.QUEEN, CardSuit.SPADES) -> return R.drawable.queen_of_spades2

        checkIfEquals(CardRank.JACK, CardSuit.CLUBS) -> return R.drawable.jack_of_clubs2
        checkIfEquals(CardRank.JACK, CardSuit.DIAMONDS) -> return R.drawable.jack_of_diamonds2
        checkIfEquals(CardRank.JACK, CardSuit.HEARTS) -> return R.drawable.jack_of_hearts2
        checkIfEquals(CardRank.JACK, CardSuit.SPADES) -> return R.drawable.jack_of_spades2

        checkIfEquals(CardRank.TEN, CardSuit.CLUBS) -> return R.drawable.clubs_10
        checkIfEquals(CardRank.TEN, CardSuit.DIAMONDS) -> return R.drawable.diamonds_10
        checkIfEquals(CardRank.TEN, CardSuit.HEARTS) -> return R.drawable.hearts_10
        checkIfEquals(CardRank.TEN, CardSuit.SPADES) -> return R.drawable.spades_10

        checkIfEquals(CardRank.NINE, CardSuit.CLUBS) -> return R.drawable.clubs_9
        checkIfEquals(CardRank.NINE, CardSuit.DIAMONDS) -> return R.drawable.diamonds_9
        checkIfEquals(CardRank.NINE, CardSuit.HEARTS) -> return R.drawable.hearts_9
        checkIfEquals(CardRank.NINE, CardSuit.SPADES) -> return R.drawable.spades_9

        checkIfEquals(CardRank.EIGHT, CardSuit.CLUBS) -> return R.drawable.clubs_8
        checkIfEquals(CardRank.EIGHT, CardSuit.DIAMONDS) -> return R.drawable.diamonds_8
        checkIfEquals(CardRank.EIGHT, CardSuit.HEARTS) -> return R.drawable.hearts_8
        checkIfEquals(CardRank.EIGHT, CardSuit.SPADES) -> return R.drawable.spades_8

        checkIfEquals(CardRank.SEVEN, CardSuit.CLUBS) -> return R.drawable.clubs_7
        checkIfEquals(CardRank.SEVEN, CardSuit.DIAMONDS) -> return R.drawable.diamonds_7
        checkIfEquals(CardRank.SEVEN, CardSuit.HEARTS) -> return R.drawable.hearts_7
        checkIfEquals(CardRank.SEVEN, CardSuit.SPADES) -> return R.drawable.spades_7

        checkIfEquals(CardRank.SIX, CardSuit.CLUBS) -> return R.drawable.clubs_6
        checkIfEquals(CardRank.SIX, CardSuit.DIAMONDS) -> return R.drawable.diamonds_6
        checkIfEquals(CardRank.SIX, CardSuit.HEARTS) -> return R.drawable.hearts_6
        checkIfEquals(CardRank.SIX, CardSuit.SPADES) -> return R.drawable.spades_6
        true -> return -1
        false -> return -1
    }
}

private fun Card.checkIfEquals(cardRank: CardRank, cardSuit: CardSuit): Boolean {
    return this.name == cardRank && this.suit == cardSuit
}