package io.github.kotlin.fibonacci

import kotlin.test.Test
import kotlin.test.assertEquals

class MyMathsTest {

    @Test
    fun testAdd() {
        assertEquals(5, MyMaths.add(2, 3))
    }

    @Test
    fun testMultiply() {
        assertEquals(6, MyMaths.multiply(2, 3))
    }

    @Test
    fun testFactorial() {
        assertEquals(24, MyMaths.factorial(4))
    }

}
