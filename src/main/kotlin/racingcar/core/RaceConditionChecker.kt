package racingcar.core

object RaceConditionChecker {
    private const val MINIMUM_ADVANCE_NUMBER = 4
    private const val MINIMUM_RANDOM_NUMBER = 0
    private const val MAXIMUM_RANDOM_NUMBER = 9

    private val RANDOM_NUMBER_RANGE = MINIMUM_RANDOM_NUMBER..MAXIMUM_RANDOM_NUMBER

    internal fun getRandomNumber(): Int = RANDOM_NUMBER_RANGE.random()

    fun isAdvancePossible(): Boolean = getRandomNumber() >= MINIMUM_ADVANCE_NUMBER
}
