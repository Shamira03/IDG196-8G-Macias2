package com.gmail.macias3roa

class CustomerBehavior(private val customer: Custumer) {

    fun removePayment(payment: Payment): Boolean {
        if (customer.payments.isEmpty()) {
            return true
        }

        if (customer.payments.contains(payment)) {
            return customer.payments.remove(payment)
        }

        return false
    }

    fun addPayment(payment: Payment):Boolean{
        if (customer.payments.isEmpty()) {
            return customer.payments.add(payment)
        }

        if(customer.payments.contains(payment)){
            return false
        }

        return customer.payments.add(payment)
    }

    fun setShoppingCart(shoppingCart:ShoppingCart): Boolean{
        if (customer.shoppingCart!=shoppingCart) {
            setOf<ShoppingCart>()
            return true
        }

        println(shoppingCart)
        return false
    }
}