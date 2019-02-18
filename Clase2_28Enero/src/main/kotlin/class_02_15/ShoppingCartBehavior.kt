package class_02_15

class ShoppingCartBehavior(private val shoppingCart: ShoppingCart) {

                fun removeProduct(product: Product): Boolean {
                    if (shoppingCart.products.isEmpty()) {
                        return true
                    }

                    if (shoppingCart.products.contains(product)) {
                        return shoppingCart.products.remove(product)
                    }

                    return false
                }

                fun addProduct(product: Product): Boolean{
                    if (shoppingCart.products.isEmpty()) {
                        return shoppingCart.products.add(product)
                    }

                    if(shoppingCart.products.contains(product)){
                        return shoppingCart.products.add(product)
                    }

                    return false
                }

                fun setCustomer(custumer: Custumer): Boolean{
                    if (shoppingCart.custumer!=custumer) {
                        setOf<Custumer>()
                        return true
                    }

                    println(custumer)
                    return false
                }


}