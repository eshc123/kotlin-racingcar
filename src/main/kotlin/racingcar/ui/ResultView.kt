package racingcar.ui

object ResultView {
    fun printResultTitle() {
        println("실행 결과")
    }

    fun printCarPositionResults(carPositionResults: List<String>) {
        carPositionResults.forEach { carPositionResult ->
            println(carPositionResult)
        }
        println()
    }
}
