package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import racingcar.domain.RaceConditionChecker

class RaceConditionCheckerTest {
    @ParameterizedTest
    @ValueSource(ints = [0, 1, 2, 3])
    fun `0에서 3 사이의 숫자인 경우 전진할 수 없는 조건이다`(number: Int) {
        val actual: Boolean = RaceConditionChecker.isAdvancePossible(number)
        assertThat(actual).isEqualTo(false)
    }

    @ParameterizedTest
    @ValueSource(ints = [4, 5, 6, 7, 8, 9])
    fun `4에서 9 사이의 숫자인 경우 전진할 수 없는 조건이다`(number: Int) {
        val actual: Boolean = RaceConditionChecker.isAdvancePossible(number)
        assertThat(actual).isEqualTo(true)
    }
}
