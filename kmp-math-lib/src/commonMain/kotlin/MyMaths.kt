package io.github.kotlin.fibonacci

class MyMaths {
    companion object {

        fun add(op1: Int, op2: Int): Int {
            return op1 + op2
        }

        fun multiply(op1: Int, op2: Int): Int {
            return op1 * op2
        }

        fun factorial(op1: Int): Int {
            while (op1 > 1) {
                return op1 * factorial(op1 - 1)
            }
            return 1
        }
    }
}
