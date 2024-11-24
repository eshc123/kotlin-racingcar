package racingcar.domain

object CarFactory {
    fun generateCars(carNames: List<String>) = carNames.map { Car(it) }
}
