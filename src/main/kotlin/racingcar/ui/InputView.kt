package racingcar.ui

object InputView {
    fun inputValues(): Pair<Int, Int> {
        val carCount = getNumber(inputCarCount())
        val moveCount = getNumber(inputMoveCount())
        return Pair(carCount, moveCount)
    }

    private fun inputCarCount(): String? {
        println("자동차 대수는 몇 대인가요?")
        return readlnOrNull()
    }

    private fun inputMoveCount(): String? {
        println("시도할 횟수는 몇 회인가요?")
        return readlnOrNull()
    }

    private fun getNumber(input: String?): Int {
        val number = input?.toIntOrNull()
        require(number != null) { "입력한 값이 숫자가 아닙니다." }
        return number
    }
}
