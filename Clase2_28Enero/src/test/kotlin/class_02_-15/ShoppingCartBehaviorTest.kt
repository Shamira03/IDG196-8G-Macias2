package `class_02_-15`

import class_02_15.*
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class ShoppingCartBehaviorTest {
    private val name = "credencial"
    private val price = "100"
    private val barcode = "12345678"
    private val qty = "1"
    private val product = Product(name, price, barcode, qty)
    private val shoppingCart = ShoppingCart(
        "12/03",
        Custumer("Jhon Wayne", "jwayne@example.com")
    )

    @Before
    fun setup() {
        println("its a me setup")
        shoppingCart.products.clear()
    }

    @Test
    fun `remove product returns true if product list is empty`() {
        val shoppingCartBehavior = ShoppingCartBehavior(shoppingCart)
        assertTrue(shoppingCartBehavior.removeProduct(product))
    }

    @Test
    fun `can't remove a product that does not exist`() {
        shoppingCart.products.add(product)

        val shoppingCartBehavior = ShoppingCartBehavior(shoppingCart)
        val nonExistingProduct = Product("carta", "150", "34566432", "1")
        assertFalse(shoppingCartBehavior.removeProduct(nonExistingProduct))
    }

    @Test
    fun `remove a product that exists`() {
        shoppingCart.products.add(product)

        val shoppingCartBehavior = ShoppingCartBehavior(shoppingCart)
        assertTrue(shoppingCartBehavior.removeProduct(product))
    }
}