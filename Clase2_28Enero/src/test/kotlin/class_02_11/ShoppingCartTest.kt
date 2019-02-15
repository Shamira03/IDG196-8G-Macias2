package class_02_11

import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.Test

class ShoppingCartTest {
    private val cart = ShoppingCart()
    private val customer = Customer()
    private val product = Product ()

    @Test
    fun testIfCampoVacio(){
        val c = Customer()
        c.id = "001"
        c.nombre = ""
        c.correo = "itzel@cetys.edu.mx"

        assertFalse(customer.isValid(c.id, c.nombre, c.correo))
    }

    @Test
    fun testIfAdd(){
        val c = Customer()
        c.id = "001"
        c.nombre = "Ivannia"
        c.correo = "ivannia@cetys.edu.mx"

        assertTrue(customer.isValid(c.id, c.nombre, c.correo))
    }

    @Test
    fun testIfProductoVacio(){
        val p = Product()
        p.id = "00x1"
        p.precio = ""
        p.cantidad = "3"
        p.descripcion = ""

        assertFalse(product.PisValid(p.id, p.precio, p.cantidad, p.descripcion))
    }

    @Test
    fun testIfAddProduct(){
        val p = Product()
        p.id = "00x1"
        p.precio = "100"
        p.cantidad = "3"
        p.descripcion = ""

        assertTrue(product.PisValid(p.id, p.precio, p.cantidad, p.descripcion))
    }
}