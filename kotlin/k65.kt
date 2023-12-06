//interface with default arguments
interface San
{
    fun disp()
    {
        println("This is Display Function in interface")
    }
    fun add(a:Int=10,b:Int=20)
}
class SA : San
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
    val a1 = SA()
    a1.disp()
    a1.add(1,2)
}