import java.util.Scanner

//write a program to number is max given three number(laddder)
fun main() {
    var s1 = Scanner(System.`in`)
    print("Enter 1st number:")
    var a = s1.nextInt()
    print("Enter 2nd number:")
    var b = s1.nextInt()
    print("Enter 3rd number:")
    var c = s1.nextInt()

    if (a>b && a>c)
            println("1st Number is Max")
    else if (b>a && b>c)
            println("2nd Number is Max")
    else if (c>a && c>b)
            println("3rd Number is Max")
    else
        println("More Than One Number Is Max")
}