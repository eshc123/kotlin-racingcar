package racingcar.core

import racingcar.model.Car
import racingcar.ui.ResultView
import racingcar.ui.ResultView.printResultTitle

class RaceManager(
    private val carCount: Int,
    private val moveCount: Int,
    private var carList: List<Car> = initCarList(carCount),
) {
    fun startRacing() {
        printResultTitle()

        repeat(moveCount) {
            carList =
                carList.map { car ->
                    car.updateCarPosition(RaceConditionChecker.isAdvancePossible())
                }
            ResultView.printCarPositionResults(carList.map { "-".repeat(it.position) })
        }
    }

    companion object {
        private fun initCarList(carCount: Int) = List(carCount) { Car() }
    }
}
