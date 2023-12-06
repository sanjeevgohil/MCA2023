//inheritance
open class A1
{
    val a : Int = 10
    val b : Int = 20
}
class B1 : A1()
{
    fun dispB(){
        println("Total is :"+(a+b))
    }
}
fun main() {
    val B2 = B1()
    B2.dispB()
}