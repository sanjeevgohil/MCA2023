import java.util.Scanner

//write a program to print series upto n number
fun main() {

    var s1 = Scanner(System.`in`)
    print("Enter Any Number:")
    var a = s1.nextInt()

    for (i in 1..a)    //1..10 in book
    {
        println("Number is :$i")
    }
}