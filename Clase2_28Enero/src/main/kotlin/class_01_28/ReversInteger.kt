package class_01_28

class ReversInteger {
       fun reverseInteger(x:Int): Int{
            var tmpl: Int = x
            var digit: Int
            var reverse = 0

            while (tmpl != 0){
                digit = tmpl % 10
                tmpl /= 10

                reverse = reverse * 10 + digit
            }
        return reverse
    }
}