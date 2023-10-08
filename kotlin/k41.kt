//write a program to print revers order
fun main() {
    var num = 2627
    var rem = 0
    while (num>0)
    {
        rem = num%10    //12345%10 = 5
        print("$rem")
        num = num/10    //12345/10 = 1234
    }
}