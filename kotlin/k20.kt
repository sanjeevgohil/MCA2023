import java.util.Scanner

//write a program to interchange two integer value
fun main() {

    val s1 = Scanner(System.`in`)

    print("Enter 1st Number:")
    var a = s1.nextInt()
    print("Enter 2nd Number:")
    var b = s1.nextInt()

    println("Value of A is :$a")
    println("Value of B is :$b")

    a = a+b
    b = a-b
    a = a-b

    println("Value of A is: $a")
    println("Vlaue of B is: $b")
}