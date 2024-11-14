package calculator

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

class CalculatorTest {
    private val calculator = Calculator()

    @Test
    fun `입력값이 null일 때 IllegalArgumentException를 던진다`() {
        assertThatThrownBy {
            calculator.calculate(null)
        }.isInstanceOf(IllegalArgumentException::class.java)
            .hasMessage("계산할 수 없는 입력값입니다.")
    }

    @Test
    fun `빈 공백 문자일 때 IllegalArgumentException를 던진다`() {
        assertThatThrownBy {
            calculator.calculate(" ")
        }.isInstanceOf(IllegalArgumentException::class.java)
            .hasMessage("계산할 수 없는 입력값입니다.")
    }

    @Test
    fun `사칙연산 기호가 아닌 경우 IllegalArgumentException를 던진다`() {
        assertThatThrownBy {
            calculator.calculate("1 더하기 1")
        }.isInstanceOf(IllegalArgumentException::class.java)
            .hasMessage("사칙연산 기호가 아닙니다.")
    }

    @Test
    fun `완성된 수식이 아닌 경우 IllegalArgumentException를 던진다`() {
        assertThatThrownBy {
            calculator.calculate("1 + 1 -")
        }.isInstanceOf(IllegalArgumentException::class.java)
            .hasMessage("올바른 수식이 아닙니다.")
    }

    @Test
    fun `숫자가 아닌 값이 피연산자인 경우 NumberFormatException을 던진다`() {
        assertThatThrownBy {
            calculator.calculate("일 + 1")
        }.isInstanceOf(NumberFormatException::class.java)
    }

    @Test
    fun `사칙 연산을 제대로 수행할 수 있다`() {
        val actual = calculator.calculate("20 + 29 * 48 - 201 / 4")
        assertThat(actual).isEqualTo(537.75)
    }
}
