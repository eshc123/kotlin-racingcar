package racingcar.core

import racingcar.model.Car
import racingcar.ui.ResultView
import racingcar.ui.ResultView.printResultTitle

class RaceManager(
    private val carCount: Int,
    private val moveCount: Int,
    private var carList: List<Car> = Car.generateCars(carCount),
) {
    fun startRacing() {
        printResultTitle()

        repeat(moveCount) {
            carList = getUpdatedCarList(carList)
            ResultView.printCarPositionResults(carList.map { "-".repeat(it.position) })
        }
    }

    private fun getUpdatedCarList(carList: List<Car>): List<Car> =
        carList.map { car ->
            car.updateCarPosition(RaceConditionChecker.isAdvancePossible())
        }
}
