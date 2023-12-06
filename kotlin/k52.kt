//class
class Abc2
{
    var a : Int = 0
    var b : Int = 0

    fun disp():Int{
        var ans = a+b
        return ans
    }
}
fun main() {

    val A1 = Abc2()
    A1.a = 10
    A1.b = 20
    var answer = A1.disp()

    println("Answer is : $answer")
}