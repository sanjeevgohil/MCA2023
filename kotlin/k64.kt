//overriding functions

interface S
{
    fun disp()
    {
        println("This is Display Function in interface")
    }
    fun add(a:Int,b:Int)
}
class As : S
{
    override fun disp() {
        super.disp()
        println("This is Display Function in class")
    }

    override fun add(a: Int, b: Int) {
        println("Total is : ${a+b}")
    }

}
fun main() {
    val a1 = As()
    a1.disp()
    a1.add(20,30)
}