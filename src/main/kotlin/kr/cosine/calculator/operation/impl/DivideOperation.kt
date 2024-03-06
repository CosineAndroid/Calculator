package kr.cosine.calculator.operation.impl

import kr.cosine.calculator.operation.Operation

class DivideOperation : Operation {

    override fun calculate(original: Double, input: Double): Double {
        return original / input
    }
}