package class_02_15

data class ShoppingCart (
    val buyDate : String,
    val custumer : Custumer
){
    val products: ArrayList<Product> = arrayListOf()
}