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
        const val INITIAL_POSITION = 0
    }
}
