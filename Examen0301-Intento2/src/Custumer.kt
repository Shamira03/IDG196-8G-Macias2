package com.gmail.macias3roa

data class Custumer(
    val name: String,
    val email: String
){
    val payments: ArrayList<Payment> = arrayListOf()
    var shoppingCart : ShoppingCart = ShoppingCart()
}