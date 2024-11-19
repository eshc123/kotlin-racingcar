package racingcar

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import racingcar.core.RaceConditionChecker

class RaceConditionCheckerTest {
    @Test
    fun `0에서 9 사이의 무작위 숫자를 구할 수 있다`() {
        val actual = RaceConditionChecker.RANDOM_NUMBER_RANGE.random()
        assertTrue(actual in 0..9)
    }
}
