package class_02_11

class Product {
    var id : String = ""
    var precio: String = ""
    var cantidad: String = ""
    var descripcion: String = ""

    fun PisValid (id : String, precio : String, cantidad : String, descripcion : String) : Boolean{
        var product = arrayListOf<String>(id ,precio ,cantidad, descripcion)
        for (c in product){
            if(id.isEmpty() || precio.isEmpty() || cantidad.isEmpty()){
                return false
            }
            else{
                product.add(c)
                print(product)
                return true
            }
        }
        return true
    }
}