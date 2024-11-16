package calculator

import calculator.Operator.Companion.operate

object Calculator {
    fun calculate(input: String?): Double {
        require(!input.isNullOrBlank()) { "계산할 수 없는 입력값입니다." }

        val formula = validateFormula(input)

        return compute(formula)
    }

    private fun compute(formula: List<String>): Double {
        var result = formula.firstOrNull()?.toDouble() ?: throw NumberFormatException()
        for (i in 1..formula.lastIndex step 2) {
            result = result.operate(formula[i + 1].toDouble(), Operator.from(formula[i]))
        }
        return result
    }

    private fun validateFormula(formula: String): List<String> {
        formula.split(" ").let { list ->
            if (list.size % 2 == 0) throw IllegalArgumentException("올바른 수식이 아닙니다.")
            return list
        }
    }
}
