//inheritance with argument with interface(Self)
interface X
{
    fun Xyz(){
        println("Class X")
    }
}
interface Y
{
    fun xyz(){
        println("Class Y")
    }
}
open class A3(open var a:Int, open var b:Int)
class B3(override var a:Int, override var b:Int,var c:Int) : A3(a,b) ,X,Y
{
    fun dispB(){
        println("Total is :"+(a+b+c))
    }
}
fun main() {
    val b2 = B3(10,20,30)
    b2.dispB()
    b2.Xyz()
    b2.xyz()
}