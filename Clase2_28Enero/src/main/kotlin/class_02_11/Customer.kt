package class_02_11

import com.sun.xml.internal.fastinfoset.util.StringArray

class Customer {

    var id : String = ""
    var nombre: String = ""
    var correo: String = ""
    var clientes = ArrayList<StringArray>()

    fun isValid (id : String, nombre : String, correo : String) : Boolean{

            if(id.isEmpty() || nombre.isEmpty() || correo.isEmpty()){
                return false
            }

        return true
    }
}