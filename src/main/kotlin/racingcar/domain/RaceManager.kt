package racingcar.domain

import racingcar.domain.checker.RaceConditionChecker
import racingcar.domain.checker.RandomRaceConditionChecker

class RaceManager(
    private val moveCount: Int,
    private var cars: List<Car>,
    private val raceConditionChecker: RaceConditionChecker = RandomRaceConditionChecker(),
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
            it.moveIfPossible(raceConditionChecker.isAdvancePossible())
        }
}
