package com.gmail.macias3roa


import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class CajaBehaviorTest{
    private val name = "credencial"
    private val price = 100
    private val barcode = "12345678"
    private val product = Product(name, price, barcode)

    private val money = 5
    private val dinero = Money(money)
    private val cambio = Cambio()

    private val shoppingCart = ShoppingCart()

    @Before
    fun setup() {
        println("its a me setup")
        cambio.monedas.clear()
        shoppingCart.products.clear()
    }

    @Test
    fun `agrega moneda si no existe`(){
        cambio.monedas.put(dinero,0)

        val cambioBehavior = CambioBehavior(cambio)
        val monedaNoExistente = Money(10)
        assertTrue(cambioBehavior.addCambio(monedaNoExistente, 1))
    }

    @Test
    fun `agregar moneda si ya existe`(){
        val cambioBehavior = CambioBehavior(cambio)
        cambio.monedas.put(dinero,4)
        val monedaExistente = Money(5)
        assertTrue(cambioBehavior.addCambio(monedaExistente,2))
    }

    @Test
    fun `regresar monedas existentes en caja`(){
        val cambioBehavior = CambioBehavior(cambio)
        cambio.monedas.put(dinero,4)

        val expected = (cambio.monedas)
        val actual = cambioBehavior.getMoney()
        assertEquals(expected,actual)
    }

    @Test
    fun `regresa un precio total`(){
        val shoppingCartBehavior = ShoppingCartBehavior(shoppingCart)
        shoppingCart.products.put(product, 3)
        val expected= 300
        val actual = shoppingCartBehavior.getTotal()
        assertEquals(expected,actual)
    }

    @Test
    fun `Pago insuficiente`(){

        val cambioBehavior = CambioBehavior(cambio)
        val shoppingCartBehavior = ShoppingCartBehavior(shoppingCart)
        assertFalse(cambioBehavior.returnCambio(shoppingCartBehavior.getTotal()))
    }
}