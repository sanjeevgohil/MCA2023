import java.util.Scanner

//write a program to prime number
fun main() {
    var s1 = Scanner(System.`in`)
    print("Enter Any Number:")
    var num = s1.nextInt()

    var flag = false

    for (i in 2..num-1)
    {
        if (num%i == 0)
        {
            flag = true
            println("Number Divide By : $i")
        }
    }
    if (flag == false)
    {
        println("Number is Prime Number")
    }
    else{
        println("Number is Not Prime Number")
    }
}