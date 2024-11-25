package racingcar

import racingcar.domain.CarFactory
import racingcar.domain.RaceManager
import racingcar.view.InputView
import racingcar.view.ResultView

fun main() {
    val racingCarGame = RacingCarGame()
    racingCarGame.run()
}

class RacingCarGame {
    fun run() {
        val carNames = InputView.inputCarNames()
        val moveCount = InputView.inputMoveCount()
        val raceManager = RaceManager(moveCount, CarFactory.generateCars(carNames))
        ResultView.printResultTitle()

        val raceHistories = raceManager.startRacing()
        ResultView.printRaceHistories(raceHistories)
        ResultView.printRacingChampion(raceHistories.last().findRacingChampions())
    }
}
