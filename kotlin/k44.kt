//write a program to palindrom
fun main() {
    var num = 151
    var num1 = num
    var rem = 0
    var tot = 0
    while (num>0)
    {
        rem = num%10
        tot = tot*10+rem
        num = num/10
    }
    if(num1 == tot)
        println("Number is Palindrom")
    else
        println("Number is Not Palindrom")
}