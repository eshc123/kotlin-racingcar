package calculator

import calculator.Operator.Companion.operate

object Calculator {
    private const val FORMULA_DELIMITER = " "
    private const val FORMULA_OPERATOR_INTERVAL = 2

    fun calculate(input: String?): Double {
        require(!input.isNullOrBlank()) { "계산할 수 없는 입력값입니다." }

        val formula = parseFormula(input)

        require(validateFormula(formula)) { "올바른 수식이 아닙니다." }

        return compute(formula)
    }

    private fun compute(formula: List<String>): Double {
        var result = formula.firstOrNull()?.toDouble() ?: throw NumberFormatException()
        for (i in 1..formula.lastIndex step FORMULA_OPERATOR_INTERVAL) {
            result = result.operate(formula[i + 1].toDouble(), Operator.from(formula[i]))
        }
        return result
    }

    private fun parseFormula(formula: String): List<String> = formula.split(FORMULA_DELIMITER)

    private fun validateFormula(symbols: List<String>) = symbols.size % 2 != 0
}
