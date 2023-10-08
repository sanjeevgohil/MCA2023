import java.util.Scanner

//write a program to
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