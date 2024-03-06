package kr.cosine.calculator.operation.impl

import kr.cosine.calculator.operation.Operation

class MultiplyOperation : Operation {

    override fun calculate(original: Double, input: Double): Double {
        return original * input
    }
}