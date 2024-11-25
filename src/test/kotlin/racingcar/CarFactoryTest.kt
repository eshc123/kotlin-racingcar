package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import racingcar.domain.CarFactory

class CarFactoryTest {
    @Test
    fun `입력한 이름의 자동차들을 생성할 수 있다`() {
        val cars = CarFactory.generateCars(listOf("pobi", "crong", "honux"))
        assertThat(cars[0].name).isEqualTo("pobi")
        assertThat(cars[1].name).isEqualTo("crong")
        assertThat(cars[2].name).isEqualTo("honux")
    }
}
