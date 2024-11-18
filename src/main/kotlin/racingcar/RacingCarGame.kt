package racingcar

import racingcar.core.RaceManager
import racingcar.ui.InputView

fun main() {
    val racingCarGame = RacingCarGame()
    racingCarGame.run()
}

class RacingCarGame {
    fun run() {
        val carCount = InputView.inputCarCount()
        val moveCount = InputView.inputMoveCount()

        val raceManager = RaceManager(carCount, moveCount)

        raceManager.startRacing()
    }
}
