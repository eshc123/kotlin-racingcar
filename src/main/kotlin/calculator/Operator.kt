package calculator

enum class Operator(
    val symbol: String,
) {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/"),
    ;

    fun operate(
        first: Double,
        second: Double,
    ): Double =
        when (this) {
            PLUS -> first + second
            MINUS -> first - second
            MULTIPLY -> first * second
            DIVIDE -> {
                require(second != 0.0) { "0으로 나눌 수 없습니다." }
                first / second
            }
        }

    companion object {
        fun from(value: String): Operator =
            entries.find {
                it.symbol == value
            } ?: throw IllegalArgumentException("\'${value}\'은(는) 사칙연산 기호가 아닙니다.")
    }
}
