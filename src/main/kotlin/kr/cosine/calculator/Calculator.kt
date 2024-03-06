package kr.cosine.calculator

import kr.cosine.calculator.operation.Operation

class Calculator {

    var finalValue = 0.0

    fun calculate(operation: Operation, input: Double) {
        finalValue = operation.calculate(finalValue, input)
    }
}