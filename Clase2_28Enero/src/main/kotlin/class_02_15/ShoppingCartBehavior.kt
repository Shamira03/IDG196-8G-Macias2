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
}