import java.util.Scanner

//write a program to print series beetween given two number
fun main() {

    var s1 = Scanner(System.`in`)
    print("Enter First Number:")
    var a = s1.nextInt()
    print("Enter Last Number:")
    var b = s1.nextInt()

    for (i in a..b)    //1..10 in book
    {
        println("Number is :$i")
    }
}