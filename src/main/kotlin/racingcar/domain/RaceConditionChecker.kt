package racingcar.domain

object RaceConditionChecker {
    private const val MINIMUM_ADVANCE_NUMBER = 4
    private const val MINIMUM_RANDOM_NUMBER = 0
    private const val MAXIMUM_RANDOM_NUMBER = 9

    val RANDOM_NUMBER_RANGE = MINIMUM_RANDOM_NUMBER..MAXIMUM_RANDOM_NUMBER

    fun isAdvancePossible(number: Int): Boolean = number >= MINIMUM_ADVANCE_NUMBER
}
