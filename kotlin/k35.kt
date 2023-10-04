import java.util.Scanner

//write a program to print the total of given range number
fun main() {

    var s1 = Scanner(System.`in`)
    print("Enter First Number:")
    var a = s1.nextInt()
    print("Enter Last Number:")
    var b = s1.nextInt()

    var tot = 0
    for (i in a..b)    //1..10 in book
    {
        println("Number is :$i")
        tot = tot+i
    }
    println("Total is :"+tot)
}