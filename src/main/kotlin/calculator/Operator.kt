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
    }
}
