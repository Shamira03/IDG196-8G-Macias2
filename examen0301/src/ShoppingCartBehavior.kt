package com.gmail.macias3roa

class ShoppingCartBehavior(private val shoppingCart: ShoppingCart) {

    fun removeProduct(product: Product,qty: Int): Boolean {
        if (shoppingCart.products.isEmpty()) {
            return true
        }

        if (shoppingCart.products.contains(product)) {
            var temporal = shoppingCart.products[product]
            if(temporal!! < qty){
                var newq = temporal-qty
                shoppingCart.products[product] = newq
                return true
            }
            else{
                shoppingCart.products.remove(product)
                return true
            }
        }

        return false
    }

    fun addProduct(product: Product, qty : Int): Boolean{
        if (shoppingCart.products.isEmpty()) {
            shoppingCart.products[product] = qty
            return true
        }

        if(!shoppingCart.products.contains(product)){
            shoppingCart.products[product] = qty
            return true
        }

        if(shoppingCart.products.contains(product)){
            var temporal = shoppingCart.products[product]
            var new = temporal!!+qty
            shoppingCart.products[product] = new
            return true
        }
        return false
    }

    fun getTotal():Int{
        var total = 0
        shoppingCart.products.forEach(fun(product,cantidad){
            total+=product.price*cantidad
        })

        println(total)
        return total
    }
}