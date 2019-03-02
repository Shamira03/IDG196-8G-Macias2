package com.gmail.macias3roa

class CambioBehavior(private val cambio: Cambio){
    private val shoppingCartBehavior = ShoppingCartBehavior(shoppingCart = ShoppingCart())

    fun addCambio(money:Money, qty: Int): Boolean{

        if (!cambio.monedas.contains(money)) {
            cambio.monedas[money] = qty
            println(money)
            return true
        }
        if(cambio.monedas.contains(money)){
            cambio.monedas[money] = qty
            return true
        }
        return false
    }

    fun returnCambio(pago:Int): Boolean{
        if(pago<shoppingCartBehavior.getTotal()){
            return false
        }

        return true
    }

    fun getMoney():HashMap<Money, Int>{
        println(cambio.monedas)
        return cambio.monedas
    }
}