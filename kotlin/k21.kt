
import java.util.Scanner

//write a program to check input number is odd or even
fun main() {
    val s1 = Scanner(System.`in`)
    print("Enter Any Number:")
    val no = s1.nextInt()

    if (no%2==0)
        println("Number is Even")
    else
        println("Number is Odd")
}