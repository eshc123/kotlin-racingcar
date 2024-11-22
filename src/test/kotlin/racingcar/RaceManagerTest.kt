package racingcar

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test
import racingcar.domain.CarFactory
import racingcar.domain.RaceManager

class RaceManagerTest {
    @Test
    fun `자동차 경주 우승자 이름을 얻을 수 있다`() {
        val cars = CarFactory.generateCars(listOf("pobi", "crong", "honux"))
        val raceManager = RaceManager(moveCount = 5, cars = cars)

        raceManager.startRacing()
        val finalRaceHistory = raceManager.raceHistories.last()
        val maxPosition = finalRaceHistory.cars.maxByOrNull { it.position }?.position
        val champions = finalRaceHistory.cars.filter { it.position == maxPosition }.map { it.name }
        raceManager.getRacingChampions() shouldBe champions
    }
}
