package calculator

enum class Operator(
    val symbol: String,
) {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/"),
    ;

    companion object {
        fun from(value: String): Operator =
            entries.find {
                it.symbol == value
            } ?: throw IllegalArgumentException("사칙연산 기호가 아닙니다.")

        fun Double.operate(
            other: Double,
            operator: Operator,
        ): Double =
            when (operator) {
                PLUS -> this + other
                MINUS -> this - other
                MULTIPLY -> this * other
                DIVIDE -> this / other
            }
    }
}
