package class_01_28

import org.junit.Assert.assertEquals
import org.junit.Test

class ReversIntegerTest {
    private val reversInteger = ReversInteger()
    @Test
    fun testIfReversesPostiveNumber(){
        val value = 1234
        val expected = 4321

        val actual = reversInteger.reverseInteger(value)
        assertEquals(expected, actual)
    }
    @Test
    fun testIfReversesNegativeNumber(){
        val value = -1234
        val expected = -4321

        val actual = reversInteger.reverseInteger(value)
        assertEquals(expected, actual)
    }
}