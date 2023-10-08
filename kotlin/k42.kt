//write a program to count digit
fun main() {
    var num : Int = 2627
    var rem = 0
    while (num>0)
    {
        num = num/10
        rem++
    }
    println("Total Digits Count :$rem")
}