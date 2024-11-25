package racingcar.domain

import racingcar.domain.RaceConditionChecker.RANDOM_NUMBER_RANGE

class RaceManager(
    private val moveCount: Int,
    private var cars: List<Car>,
) {
    fun startRacing(): RaceResult {
        var raceHistories: List<RaceHistory> = emptyList()
        repeat(moveCount) {
            cars = getMovedCars(cars)
            raceHistories = raceHistories + RaceHistory(cars)
        }
        return RaceResult(raceHistories)
    }

    private fun getMovedCars(cars: List<Car>): List<Car> =
        cars.map {
            it.moveIfPossible(RaceConditionChecker.isAdvancePossible(RANDOM_NUMBER_RANGE.random()))
        }
}
