package racingcar.core

import racingcar.model.Car
import racingcar.ui.ResultView
import racingcar.ui.ResultView.printResultTitle

class RaceManager(
    private val carCount: Int,
    private val moveCount: Int,
    private var cars: List<Car> = Car.generateCars(carCount),
) {
    fun startRacing() {
        printResultTitle()

        repeat(moveCount) {
            cars = getUpdatedCarList(cars)
            ResultView.printCarPositionResults(cars.map { CAR_POSITION_STEP.repeat(it.position) })
        }
    }

    private fun getUpdatedCarList(carList: List<Car>): List<Car> =
        carList.map {
            it.moveIfPossible(RaceConditionChecker.isAdvancePossible())
        }

    companion object {
        private const val CAR_POSITION_STEP = "-"
    }
}
