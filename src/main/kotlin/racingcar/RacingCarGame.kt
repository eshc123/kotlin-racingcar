package racingcar

import racingcar.domain.CarFactory
import racingcar.domain.RaceManager
import racingcar.ui.InputView

fun main() {
    val racingCarGame = RacingCarGame()
    racingCarGame.run()
}

class RacingCarGame {
    fun run() {
        val carCount = InputView.inputCarCount()
        val moveCount = InputView.inputMoveCount()

        val raceManager = RaceManager(moveCount, CarFactory.generateCars(carCount))

        raceManager.startRacing()
    }
}
