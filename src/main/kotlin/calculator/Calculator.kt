package calculator

import calculator.Operator.Companion.toOperator

object Calculator {
    fun calculate(input: String?): Double {
        if (input.isNullOrBlank()) throw IllegalArgumentException("계산할 수 없는 입력값입니다.")

        val formula = validateFormula(input)

        return compute(formula)
    }

    private fun compute(formula: List<String>): Double {
        var result = formula.firstOrNull()?.toDouble() ?: throw NumberFormatException()

        for (i in 1..formula.lastIndex step 2) {
            result = result.operate(formula[i + 1].toDouble(), formula[i].toOperator())
        }
        return result
    }

    private fun validateFormula(formula: String): List<String> {
        formula.split(" ").let { list ->
            if (list.size % 2 == 0) throw IllegalArgumentException("올바른 수식이 아닙니다.")
            return list
        }
    }

    private fun Double.operate(
        other: Double,
        operator: Operator,
    ): Double =
        when (operator) {
            Operator.PLUS -> this + other
            Operator.MINUS -> this - other
            Operator.MULTIPLY -> this * other
            Operator.DIVIDE -> this / other
        }
}
