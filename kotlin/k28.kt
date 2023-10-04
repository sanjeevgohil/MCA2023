import java.util.Scanner

//write a program to find largest number from given three numbers using when
fun main() {
    var s1 = Scanner(System.`in`)
    print("Enter 1st Number:")
    var a = s1.nextInt()
    print("Enter 2nd Number:")
    var b = s1.nextInt()
    print("Enter 3rd Number:")
    var c = s1.nextInt()

    when{
        a>b && a>c -> print("First Number is Max")
        b>a && b>c -> print("Second Number is Max")
        c>a && c>b -> print("Third Number is Max")
        else -> print("More then one Number is Max")
    }
}