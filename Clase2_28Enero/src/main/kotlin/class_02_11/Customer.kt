package class_02_11

import com.sun.xml.internal.fastinfoset.util.StringArray

class Customer {

    var id : String = ""
    var nombre: String = ""
    var correo: String = ""

    fun isValid (id : String, nombre : String, correo : String) : Boolean{
        var cliente = arrayListOf<String>(id ,nombre ,correo)
        for (c in cliente){
            if(id.isEmpty() || nombre.isEmpty() || correo.isEmpty()){
                return false
            }
            else{
                cliente.add(c)
                return true
            }
        }
        return true
    }
}