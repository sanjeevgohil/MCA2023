//write a program to total of  digit
fun main() {
    var num : Int = 2627
    var rem = 0
    var tot=0
    while (num>0)
    {
        rem = num%10
        tot = tot+rem
        num = num/10
    }
    println("Total of Digits :$tot")
}