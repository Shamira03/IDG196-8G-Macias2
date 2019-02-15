package class_02_11

import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.Test

class ShoppingCartTest {
    private val customer = Customer()

    @Test
    fun testIfCampoVacio(){
        val c = Customer()
        c.id = "001"
        c.nombre = ""
        c.correo = "itzel@cetys.edu.mx"

        assertFalse(customer.isValid(c.id, c.nombre, c.correo))
    }
}