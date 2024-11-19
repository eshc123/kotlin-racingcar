package racingcar.ui

object InputView {
    fun inputCarCount(): Int {
        println("자동차 대수는 몇 대인가요?")
        return getNumber(readlnOrNull())
    }

    fun inputMoveCount(): Int {
        println("시도할 횟수는 몇 회인가요?")
        return getNumber(readlnOrNull())
    }

    private fun getNumber(input: String?): Int {
        val number = input?.toIntOrNull()
        requireNotNull(number) { "입력한 값이 숫자가 아닙니다." }
        return number
    }
}
