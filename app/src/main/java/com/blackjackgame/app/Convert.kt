package com.blackjackgame.app

fun Card.convert(): Int{
    when(this) {
        Card(CardRank.ACE, CardSuit.CLUBS, 11) -> return R.drawable.card_clubs_1
        Card(CardRank.ACE, CardSuit.DIAMONDS, 11) -> return R.drawable.card_diamonds_1
        Card(CardRank.ACE, CardSuit.HEARTS, 11) -> return R.drawable.card_hearts_1
        Card(CardRank.ACE, CardSuit.SPADES, 11) -> return R.drawable.card_spades_1

        Card(CardRank.KING, CardSuit.CLUBS, 4) -> return R.drawable.card_clubs_13
        Card(CardRank.KING, CardSuit.DIAMONDS, 4) -> return R.drawable.card_diamonds_13
        Card(CardRank.KING, CardSuit.HEARTS, 4) -> return R.drawable.card_hearts_13
        Card(CardRank.KING, CardSuit.SPADES, 4) -> return R.drawable.card_spades_13

        Card(CardRank.QUEEN, CardSuit.CLUBS, 3) -> return R.drawable.card_clubs_12
        Card(CardRank.QUEEN, CardSuit.DIAMONDS, 3) -> return R.drawable.card_diamonds_12
        Card(CardRank.QUEEN, CardSuit.HEARTS, 3) -> return R.drawable.card_hearts_12
        Card(CardRank.QUEEN, CardSuit.SPADES, 3) -> return R.drawable.card_spades_12

        Card(CardRank.JACK,CardSuit.CLUBS,2) -> return R.drawable.card_clubs_11
        Card(CardRank.JACK,CardSuit.DIAMONDS,2) -> return R.drawable.card_diamonds_11
        Card(CardRank.JACK,CardSuit.HEARTS,2) -> return R.drawable.card_hearts_11
        Card(CardRank.JACK,CardSuit.SPADES,2) -> return R.drawable.card_spades_11

        Card(CardRank.TEN,CardSuit.CLUBS,10) -> return R.drawable.card_clubs_10
        Card(CardRank.TEN,CardSuit.DIAMONDS,10) -> return R.drawable.card_diamonds_10
        Card(CardRank.TEN,CardSuit.HEARTS,10) -> return R.drawable.card_hearts_10
        Card(CardRank.TEN,CardSuit.SPADES,10) -> return R.drawable.card_spades_10

        Card(CardRank.NINE,CardSuit.CLUBS,9) -> return R.drawable.card_clubs_9
        Card(CardRank.NINE,CardSuit.DIAMONDS,9) -> return R.drawable.card_diamonds_9
        Card(CardRank.NINE,CardSuit.HEARTS,9) -> return R.drawable.card_hearts_9
        Card(CardRank.NINE,CardSuit.SPADES,9) -> return R.drawable.card_spades_9

        Card(CardRank.EIGHT,CardSuit.CLUBS,8) -> return R.drawable.card_clubs_8
        Card(CardRank.EIGHT,CardSuit.DIAMONDS,8) -> return R.drawable.card_diamonds_8
        Card(CardRank.EIGHT,CardSuit.HEARTS,8) -> return R.drawable.card_hearts_8
        Card(CardRank.EIGHT,CardSuit.SPADES,8) -> return R.drawable.card_spades_8

        Card(CardRank.SEVEN,CardSuit.CLUBS,7) -> return R.drawable.card_clubs_7
        Card(CardRank.SEVEN,CardSuit.DIAMONDS,7) -> return R.drawable.card_diamonds_7
        Card(CardRank.SEVEN,CardSuit.HEARTS,7) -> return R.drawable.card_hearts_7
        Card(CardRank.SEVEN,CardSuit.SPADES,7) -> return R.drawable.card_spades_7

        Card(CardRank.SIX,CardSuit.CLUBS,6) -> return R.drawable.card_clubs_6
        Card(CardRank.SIX,CardSuit.DIAMONDS,6) -> return R.drawable.card_diamonds_6
        Card(CardRank.SIX,CardSuit.HEARTS,6) -> return R.drawable.card_hearts_6
        Card(CardRank.SIX,CardSuit.SPADES,6) -> return R.drawable.card_spades_6
    }
    return -1
}