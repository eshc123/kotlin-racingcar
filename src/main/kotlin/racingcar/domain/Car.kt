package racingcar.domain

data class Car(
    val name: String,
    val position: Int = INITIAL_POSITION,
) {
    init {
        require(name.length <= MAXIMUM_NAME_LENGTH) { "자동차 이름은 ${MAXIMUM_NAME_LENGTH}자를 초과할 수 없습니다." }
    }

    fun moveIfPossible(isAdvancePossible: Boolean): Car =
        if (isAdvancePossible) {
            copy(position = this.position + 1)
        } else {
            this
        }

    companion object {
        private const val INITIAL_POSITION = 0
        private const val MAXIMUM_NAME_LENGTH = 5
    }
}
