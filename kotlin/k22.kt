import java.util.Scanner

//write a program to check input number is odd or even
fun main() {
    var s1 = Scanner(System.`in`)
    print("Enter Any number:")
    var a = s1.nextInt()

    var b = if (a%2==0) "Number is Even" else "Number is Odd"

    println("$a $b")
}