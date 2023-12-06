//inheritance with argument

open class A2(open var a:Int, open var b:Int)
class B2(override var a:Int, override var b:Int,var c:Int) : A2(a,b)
{
    fun dispB(){
        println("Total is :"+(a+b+c))
    }
}
fun main() {
    val b2 = B2(10,20,30)
    b2.dispB()
}