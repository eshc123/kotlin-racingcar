package racingcar

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import racingcar.model.Car

class CarTest {
    @Test
    fun `Car는 전진할 수 있는 조건일 때 한 칸 전진할 수 있다`() {
        val car = Car(position = 1)
        val actual = car.moveIfPossible(true)
        assertTrue(actual.position == 2)
    }

    @Test
    fun `Car는 전진할 수 없는 조건일 때 전진하지 않는다`() {
        val car = Car(position = 1)
        val actual = car.moveIfPossible(false)
        assertTrue(actual.position == 1)
    }
}
