package kr.cosine.calculator

import kr.cosine.calculator.operation.Operation
import kr.cosine.calculator.operation.impl.DivideOperation
import kr.cosine.calculator.operation.impl.MinusOperation
import kr.cosine.calculator.operation.impl.MultiplyOperation
import kr.cosine.calculator.operation.impl.PlusOperation

private val calculator = Calculator()

fun main(args: Array<String>) {
    calculate(true)
}

private fun calculate(first: Boolean) {
    var firstValue: Double? = null
    if (first) {
        firstValue = getInput()
    }
    val operation = getOperation()
    val secondValue = getInput()

    if (firstValue != null) {
        calculator.finalValue = firstValue
    }
    calculator.calculate(operation, secondValue)

    println("결과")
    println(calculator.finalValue)
    println("")

    calculate(false)
}

private fun getInput(): Double {
    println("숫자를 입력해주세요.")
    val firstValue: Double
    while (true) {
        val input = readln().toDoubleOrNull()
        if (input == null) {
            println("숫자만 입력할 수 있습니다.")
        } else {
            firstValue = input
            break
        }
    }
    return firstValue
}

private fun getOperation(): Operation {
    println("연산 기호를 입력해주세요.")
    val operation: Operation
    while (true) {
        val newOperation = when (readln()) {
            "+" -> PlusOperation()
            "-" -> MinusOperation()
            "*" -> MultiplyOperation()
            "/" -> DivideOperation()
            else -> null
        }
        if (newOperation == null) {
            println("존재하지 않는 연산 기호입니다.")
        } else {
            operation = newOperation
            break
        }
    }
    return operation
}