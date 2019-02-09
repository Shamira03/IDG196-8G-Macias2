package class_02_08

import com.sun.org.apache.bcel.internal.generic.RETURN

class Expression {
    fun isValid (caracteres: String): Boolean{
        var contadorP = 0
        var contadorL = 0
        var contadorC = 0
        for (c in caracteres) {
            if(contadorP < 0){
                return false
            }
            if(contadorL < 0){
                return false
            }
            if(contadorC < 0){
                return false
            }
            if (c =='(') {
                contadorP++
            }
            else if (c ==')'){
                contadorP--
            }
            if ( c == '{') {
                contadorL++
            }
            else if ( c == '}'){
                contadorL--
            }
            if ( c == '[') {
                contadorC++
            }
            else if ( c == ']'){
                contadorC--
            }
        }
        return contadorC == 0


        return false
    }
}