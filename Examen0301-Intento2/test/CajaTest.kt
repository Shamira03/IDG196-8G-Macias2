package com.gmail.macias3roa

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class CajaTest{
    private val custumer = Custumer("Shamira", "macias3roa@gmail.com")
    val product = Product(
        "credencial",
        100,
        "0910102"
    )
    val shoppingCartBehavior = ShoppingCartBehavior(custumer.shoppingCart)
    val cajaBehavior = CajaBehavior()
    val cambio: HashMap<Int, Int> = hashMapOf()
    val total = 20
    val monto = 50
    @Before
    fun setup() {
        println("its a me setup")
        cajaBehavior.dinero.clear()
        cambio.clear()
        custumer.shoppingCart.products.clear()
    }

    @Test
    fun `return empty hashMap if it does not have money`() {
        assertEquals(cambio, (cajaBehavior.charge(total, monto)))
    }

    @Test
    fun `return 3 coins of 10`() {
        cajaBehavior.dinero.add(10)
        cambio[10] = 3
        assertEquals(cambio, (cajaBehavior.charge(total, monto)))
    }

    @Test
    fun `return empty if it does not have enough denominations`() {
        cajaBehavior.dinero.add(10)
        assertEquals(cambio, (cajaBehavior.charge(48, monto)))
    }

    @Test
    fun `return 5 coins of 5`() {
        cajaBehavior.dinero.add(5)
        cambio[5] = 5
        assertEquals(cambio, (cajaBehavior.charge(25, monto)))

    }

    @Test
    fun `return 1 coin of 5 and 2 20 bills`() {
        cajaBehavior.dinero.add(5)
        cajaBehavior.dinero.add(20)
        cambio[5] = 1
        cambio[20] = 2
        assertEquals(cambio, (cajaBehavior.charge(5, monto)))

    }

    @Test
    fun `return 1 coin of 5 and 2 20 bills and 2 200 bills`() {
        cajaBehavior.dinero.add(5)
        cajaBehavior.dinero.add(200)
        cajaBehavior.dinero.add(20)
        cambio[5] = 1
        cambio[200] = 2
        cambio[20] = 2
        assertEquals(cambio, (cajaBehavior.charge(55, 500)))

    }
    @Test
    fun `return 400 en compra de credencial y paga con 500`(){
        cajaBehavior.dinero.add(5)
        cajaBehavior.dinero.add(200)
        cajaBehavior.dinero.add(20)
        shoppingCartBehavior.addProduct(product,1)
        var Carrito = shoppingCartBehavior.getTotal()
        cambio[200] = 2
        assertEquals(cambio, (cajaBehavior.charge(Carrito, 500)))
    }

    @Test
    fun `return 100 en compra de credencial y paga con 300 y compra 2 credenciales`(){
        cajaBehavior.dinero.add(5)
        cajaBehavior.dinero.add(200)
        cajaBehavior.dinero.add(20)
        shoppingCartBehavior.addProduct(product,2)
        var Carrito = shoppingCartBehavior.getTotal()
        cambio[200] = 1
        cambio[20] = 5
        assertEquals(cambio, (cajaBehavior.charge(Carrito, 500)))
    }
}