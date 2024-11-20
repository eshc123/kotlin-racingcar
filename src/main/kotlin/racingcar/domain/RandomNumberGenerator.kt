package racingcar.domain

object RandomNumberGenerator {
    private const val MINIMUM_RANDOM_NUMBER = 0
    private const val MAXIMUM_RANDOM_NUMBER = 9

    private val RANDOM_NUMBER_RANGE = MINIMUM_RANDOM_NUMBER..MAXIMUM_RANDOM_NUMBER

    fun generate() = RANDOM_NUMBER_RANGE.random()
}
