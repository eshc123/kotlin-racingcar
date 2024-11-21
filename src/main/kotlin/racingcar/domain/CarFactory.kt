package racingcar.domain

object CarFactory {
    fun generateCars(carCount: Int) = List(carCount) { Car() }
}
