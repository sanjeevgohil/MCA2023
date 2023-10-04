import java.util.Scanner

//write a program to print the total of 10 number
fun main() {

    var tot = 0
    for (i in 1..10)    //1..10 in book
    {
        println("Number is :$i")
        tot += i
    }
    println("Total is :"+tot)
}