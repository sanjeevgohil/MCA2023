import java.util.Scanner

//write a program to interchange two integer value
fun main() {
    print("Enter 1st Number:")
    var a = readln()
    print("Enter 2nd Number:")
    var b = readln()

    println("Value of A is :$a")
    println("Value of B is :$b")

    var c = a
    a = b
    b = c

    println("Value of A is: $a")
    println("Vlaue of B is: $b")
}