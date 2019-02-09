package class_02_01

import junit.framework.Assert.assertFalse
import org.junit.Assert
import org.junit.Test

class PalindromeTest {
    private val palindrome = Palindrome()
    @Test
    fun testIfendswith0(){
        val number = -100
        assertFalse(palindrome.isPalindrome(number))
    }

    @Test
    fun testIfmultiplode10ynoes0(){
        val number = 1000
        assertFalse(palindrome.isPalindrome(number))
    }

}