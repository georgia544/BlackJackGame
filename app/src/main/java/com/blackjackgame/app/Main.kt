package com.blackjackgame.app

fun main(){
        val game = DurakGamelmpl()

        repeat(3) {
                println(game.getCardsPlayer())
                println(game.getCardsBot())
                println(game.checkIfWin())
                println(game.deckCounter())

        }

}