//write a program to print A to Z
fun main() {
    var c = 'A';
    while (c<='Z')
    {
        print(" $c = ${c.toInt()}")
        c++
    }
}