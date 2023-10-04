import java.util.Scanner

//write a program to input year is leap year or not
fun main() {
    var s1 = Scanner(System.`in`)
    print("Enter Yaer:")
    var y = s1.nextInt()

    if (y%4==0)
            println("Year Is Leap Year")
    else
            println("Year is Not Leap Year")

}