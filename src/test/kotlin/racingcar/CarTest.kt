package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import racingcar.domain.Car

class CarTest {
    @Test
    fun `Car는 이름과 위치를 가진다`() {
        val car = Car(name = "test", position = 1)
        assertThat(car.name).isEqualTo("test")
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
