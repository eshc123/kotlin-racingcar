package racingcar.core

object RaceConditionChecker {
    private const val MINIMUM_ADVANCE_NUMBER = 4
    private const val MINIMUM_RANDOM_NUMBER = 0
    private const val MAXIMUM_RANDOM_NUMBER = 9

    private val randomNumberRange = MINIMUM_RANDOM_NUMBER..MAXIMUM_RANDOM_NUMBER

    private fun getRandomNumber(): Int = randomNumberRange.random()

    fun isAdvancePossible(): Boolean = getRandomNumber() >= MINIMUM_ADVANCE_NUMBER
}
