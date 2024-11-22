package racingcar.domain

class RaceManager(
    private val moveCount: Int,
    private var cars: List<Car>,
) {
    var raceHistories: List<RaceHistory> = emptyList()
        private set

    fun startRacing() {
        repeat(moveCount) {
            cars = getMovedCars(cars)

            raceHistories = raceHistories + RaceHistory(cars)
        }
    }

    fun getRacingChampions(): List<String> {
        val maxPosition = cars.maxByOrNull { it.position }?.position

        return cars.filter { it.position == maxPosition }.map { it.name }
    }

    private fun getMovedCars(cars: List<Car>): List<Car> =
        cars.map {
            it.moveIfPossible(RaceConditionChecker.isAdvancePossible(RandomNumberGenerator.generate()))
        }
}
