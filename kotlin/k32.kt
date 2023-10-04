import java.util.Scanner

//write a program to print the series in reverse order
fun main() {

    var s1 = Scanner(System.`in`)
    print("Enter First Number:")
    var a = s1.nextInt()
    print("Enter Last Number:")
    var b = s1.nextInt()

    for (i in a downTo b)    //1..10 in book
    {
        println("Number is :$i")
    }
}