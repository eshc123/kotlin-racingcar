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
        fun String.toOperator(): Operator =
            entries.find {
                it.symbol == this
            } ?: throw IllegalArgumentException("사칙연산 기호가 아닙니다.")
    }
}
