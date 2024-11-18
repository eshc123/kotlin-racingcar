package racingcar

import racingcar.core.RaceManager
import racingcar.ui.InputView

fun main() {
    val racingCarGame = RacingCarGame()
    racingCarGame.run()
}

class RacingCarGame {
    fun run() {
        val (carCount, moveCount) = InputView.inputValues()

        val raceManager = RaceManager(carCount, moveCount)

        raceManager.startRacing()
    }
}
