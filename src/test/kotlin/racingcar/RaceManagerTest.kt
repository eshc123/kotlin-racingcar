package racingcar

import io.kotest.matchers.shouldBe
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import racingcar.domain.CarFactory
import racingcar.domain.RaceManager
import racingcar.domain.checker.RandomRaceConditionChecker
import racingcar.fake.FakeRaceConditionChecker

class RaceManagerTest {
    @Test
    fun `자동차 경주 우승자 이름을 얻을 수 있다`() {
        val cars = CarFactory.generateCars(listOf("pobi", "crong", "honux"))
        val raceManager = RaceManager(moveCount = 5, cars = cars)

        val raceResult = raceManager.startRacing(RandomRaceConditionChecker())

        raceResult.findRacingChampions() shouldBe raceResult.raceHistories.last().findMaxPositionCarNames()
    }

    @Test
    fun `자동차 경주 후 자동차의 위치를 알 수 있다`() {
        val cars = CarFactory.generateCars(listOf("pobi", "crong", "honux"))
        val testChecker = FakeRaceConditionChecker(5)
        val raceManager = RaceManager(3, cars)

        val result = raceManager.startRacing(testChecker)
        result.raceHistories.last().cars.forEach {
            assertThat(it.position == 3)
        }
    }
}
