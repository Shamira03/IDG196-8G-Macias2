package class_02_15

data class Custumer(
    val name: String,
    val email: String
){
    val payments: ArrayList<Payment> = arrayListOf()
}