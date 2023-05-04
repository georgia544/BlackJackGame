package com.blackjackgame.app

fun main(){
        val game = BlackJackGameImpl()

        repeat(10) {

                game.startGame()

                println(game.getStartingCards())
                println(game.getAdditionalCard())

                println(game.getCardsValue())
                println(game.getOpponentCards())
                println(game.getOpponentCardsValue())

                println(game.checkIfWin())
                println(game.getStats())
                Thread.sleep(3000L)
        }
}