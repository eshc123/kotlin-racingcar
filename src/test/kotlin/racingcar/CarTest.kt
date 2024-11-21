package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import racingcar.domain.Car

class CarTest {
    @Test
    fun `Car의 이름은 5자를 초과할 수 없다`() {
        assertThatThrownBy {
            Car(name = "자동차이름1", position = 1)
        }.isInstanceOf(IllegalArgumentException::class.java)
            .hasMessage("자동차 이름은 5자를 초과할 수 없습니다.")
    }

    @Test
    fun `Car 이름이 5자를 초과하면 IllegalArgumentException이 발생한다`() {
        assertThatThrownBy {
            Car(name = "crongg")
        }.isInstanceOf(IllegalArgumentException::class.java)
            .hasMessage("자동차 이름은 5자를 초과할 수 없습니다.")
    }

    @Test
    fun `Car는 이름과 위치를 가진다`() {
        val car = Car(name = "자동차이름", position = 1)
        assertThat(car.name).isEqualTo("자동차이름")
        assertThat(car.position).isEqualTo(1)
    }

    @Test
    fun `Car는 전진할 수 있는 조건일 때 한 칸 전진할 수 있다`() {
        val car = Car(name = "test", position = 1)
        val actual = car.moveIfPossible(true)
        assertTrue(actual.position == 2)
    }

    @Test
    fun `Car는 전진할 수 없는 조건일 때 전진하지 않는다`() {
        val car = Car(name = "test", position = 1)
        val actual = car.moveIfPossible(false)
        assertTrue(actual.position == 1)
    }
}
