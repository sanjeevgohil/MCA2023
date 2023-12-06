//inheritance
open class A
{
    fun dispA(){
        println("Class A")
    }
}
class B : A()
{
    fun dispB(){
        println("Class B")
    }
}
fun main() {
    val B1 = B()
    B1.dispA()
    B1.dispB()
}