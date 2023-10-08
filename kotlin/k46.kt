import java.util.Scanner

//write a program to prime number in 1 to 50
fun main() {
    var num = 50
    for (i in 1..num)
    {
        var flag = false
        for (j in 2..i-1)
        {
            if (i%j == 0)
            {
                flag = true
            }
        }
        if (flag == false)
        {
            println("Prime Number is: $i")
        }
    }
}