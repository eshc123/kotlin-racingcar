package racingcar.domain

data class RaceHistory(
    val cars: List<Car>,
) {
    fun findRacingChampions(): List<String> {
        val maxPositionCar = findMaxPositionCar()

        return findSamePositionCar(maxPositionCar)
    }

    private fun findMaxPositionCar(): Car {
        return cars.maxByOrNull { it.position } ?: throw IllegalArgumentException("차량 리스트가 비었습니다.")
    }

    private fun findSamePositionCar(maxPositionCar: Car): List<String> {
        return cars.filter { maxPositionCar.position == it.position }
            .map { it.name }
    }
}
