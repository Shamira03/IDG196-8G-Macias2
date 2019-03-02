package com.gmail.macias3roa

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class ShoppingCartBehaviorTest {
    private val name = "credencial"
    private val price = 100
    private val barcode = "12345678"
    private val product = Product(name, price, barcode)
    private val shoppingCart = ShoppingCart()

    @Before
    fun setup() {
        println("its a me setup")
        shoppingCart.products.clear()
    }

    @Test
    fun `remove product returns true if product list is empty`() {
        val shoppingCartBehavior = ShoppingCartBehavior(shoppingCart)
        assertTrue(shoppingCartBehavior.removeProduct(product, 0))
    }

    @Test
    fun `can't remove a product that does not exist`() {
        shoppingCart.products.put(product,0)

        val shoppingCartBehavior = ShoppingCartBehavior(shoppingCart)
        val nonExistingProduct = Product("carta", 150, "34566432")
        assertFalse(shoppingCartBehavior.removeProduct(nonExistingProduct, 1))
    }

    @Test
    fun `remove a product that exists`() {
        shoppingCart.products.put(product,0)

        val shoppingCartBehavior = ShoppingCartBehavior(shoppingCart)
        assertTrue(shoppingCartBehavior.removeProduct(product, 9))
    }

    @Test
    fun `can add a new product if it doesn't exist`() {
        shoppingCart.products.put(product, 0)

        val shoppingCartBehavior = ShoppingCartBehavior(shoppingCart)
        val nonExistingProduct = Product("carta", 150, "34566432")
        assertTrue(shoppingCartBehavior.addProduct(nonExistingProduct, 1))
    }

    @Test
    fun `regresa un total`(){
        val shoppingCartBehavior = ShoppingCartBehavior(shoppingCart)
        shoppingCart.products.put(product, 3)
        val expected= 300
        val actual = shoppingCartBehavior.getTotal()
        assertEquals(expected,actual)
    }

}