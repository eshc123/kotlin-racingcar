package racingcar.domain

object CarFactory {
    fun generateCars(carNames: List<String>) = List(carNames.size) { Car(carNames[it]) }
}
