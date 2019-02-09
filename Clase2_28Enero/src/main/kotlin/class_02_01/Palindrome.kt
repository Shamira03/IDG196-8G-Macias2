package class_02_01

class Palindrome {
    fun isPalindrome(number:Int): Boolean{
        if(number<0){
            return false
        }
        if(number % 10 == 0){
            return false
        }
        if(number == 0){
            return true
        }

        return true
    }
}