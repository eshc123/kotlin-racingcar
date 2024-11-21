package racingcar.domain

object RaceConditionChecker {
    private const val MINIMUM_ADVANCE_NUMBER = 4

    fun isAdvancePossible(number: Int): Boolean = number >= MINIMUM_ADVANCE_NUMBER
}
