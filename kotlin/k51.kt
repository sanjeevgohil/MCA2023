//class
class Abc1
{
    var a : Int = 0
    var b : Int = 0

    fun calc(){
        var ans = a+b
        println("Value of A is : $a")
        println("Value of A is : $b")
        println("Total is : $ans")
    }
}
fun main() {

    val A1 = Abc1()
    A1.a = 10
    A1.b = 20
    A1.calc()
}