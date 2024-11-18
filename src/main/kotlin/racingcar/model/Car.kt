package racingcar.model

data class Car(
    val position: Int = INITIAL_POSITION,
) {
    fun updateCarPosition(isAdvancePossible: Boolean): Car =
        if (isAdvancePossible) {
            copy(position = this.position + 1)
        } else {
            this
        }

    companion object {
        private const val INITIAL_POSITION = 0

        fun generateCars(carCount: Int) = List(carCount) { Car() }
    }
}
