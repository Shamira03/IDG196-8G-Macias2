package class_02_08

import com.sun.org.apache.bcel.internal.generic.RETURN

class Expression {
    fun isValid (caracteres: String): Boolean{
        var se = ArrayList<Char>()
        for (c in caracteres) {

            if (c == '(' || c == '[' || c == '{') {
                se.add(c)
            }
            else if (se.size>0) {
                if (c == ')') {
                    if (se[se.size - 1] == '(') {
                        se.removeAt(se.size - 1)
                    }
                } else if (c == ']') {
                    if (se[se.size - 1] == '[') {
                        se.removeAt(se.size - 1)
                    }
                } else if (c == '}') {
                    if (se[se.size - 1] == '{') {
                        se.removeAt(se.size - 1)
                    }
                }
            }else
                return false
        }
        return se.size == 0
    }
}