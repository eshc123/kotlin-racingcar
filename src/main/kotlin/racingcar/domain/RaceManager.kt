package racingcar.domain

import racingcar.ui.ResultView
import racingcar.ui.ResultView.printResultTitle

class RaceManager(
    private val moveCount: Int,
    private var cars: List<Car>,
) {
    fun startRacing() {
        printResultTitle()

        repeat(moveCount) {
            cars = getMovedCars(cars)
            ResultView.printCarResults(cars)
        }
    }

    private fun getMovedCars(cars: List<Car>): List<Car> =
        cars.map {
            it.moveIfPossible(RaceConditionChecker.isAdvancePossible(RandomNumberGenerator.generate()))
        }
}
