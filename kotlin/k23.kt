import java.util.Scanner

//write a program to number is max given two number
fun main() {
    var s1 = Scanner(System.`in`)
    print("Enter 1st number:")
    var a = s1.nextInt()
    print("Enter 2nd number:")
    var b = s1.nextInt()

    var c = if (a>b) "1st $a Number is Max" else "2nd $b Number is Max"

    print("$c")
}