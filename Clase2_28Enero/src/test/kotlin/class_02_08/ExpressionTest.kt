package class_02_08

import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.Test

class ExpressionTest {
    private val expression = Expression()
    @Test
    fun testIfSolos(){
        val caracteres = "()"

        assertTrue(expression.isValid(caracteres))
    }

    @Test
    fun testIfSolosMal(){
        val caracteres = "(("

        assertFalse(expression.isValid(caracteres))
    }

    @Test
    fun testIfParentesisDentroParentesis(){
        val caracteres = "(())"

        assertTrue(expression.isValid(caracteres))
    }

    @Test
    fun testIfParDeParentesis(){
        val caracteres = "()()"


        assertTrue(expression.isValid(caracteres))
    }

    @Test
    fun testIfParDeParentesisMAL(){
        val caracteres = "))(("


        assertFalse(expression.isValid(caracteres))
    }

    @Test
    fun testIfLlavesSolas(){
        val caracteres = "{}"

        assertTrue(expression.isValid(caracteres))
    }

    @Test
    fun testIfLlavesSolasMAL(){
        val caracteres = "{{"

        assertFalse(expression.isValid(caracteres))
    }

    @Test
    fun testIfLlavesDentroLlaves(){
        val caracteres = "{{}}"

        assertTrue(expression.isValid(caracteres))
    }

    @Test
    fun testIfParDeLlavesMAL(){
        val caracteres = "}}{{"

        assertFalse(expression.isValid(caracteres))
    }

    @Test
    fun testIfCorchetesSolos(){
        val caracteres = "[]"

        assertTrue(expression.isValid(caracteres))
    }

    @Test
    fun testIfCorchetesSolosMAL(){
        val caracteres = "]["

        assertFalse(expression.isValid(caracteres))
    }

    @Test
    fun testIfCorchetesDentroCorchetes(){
        val caracteres = "[[]]"

        assertTrue(expression.isValid(caracteres))
    }

    @Test
    fun testIfParDeCorchetesMAL(){
        val caracteres = "]][]"

        assertFalse(expression.isValid(caracteres))
    }

    @Test
    fun testIfParentesisYLlaves(){
        var caracteres = "(){}"

        assertTrue(expression.isValid(caracteres))
    }

    @Test
    fun testIfParentesisDentroLlaves(){
        var caracteres = "{()}"

        assertTrue(expression.isValid(caracteres))
    }

    @Test
    fun testIfLlavesDentroParentesisMAL(){
        var caracteres = "{(})"

        assertFalse(expression.isValid(caracteres))
    }

    @Test
    fun testIfProfe(){
        var caracteres = "({[]})"

        assertTrue(expression.isValid(caracteres))
    }
}