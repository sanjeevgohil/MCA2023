//interface can be inherit
interface S2
{
    fun disp()
}
interface S3 : S2
{
    fun stop()
}
class A6 : S3
{
    override fun disp() {
        println("This is Display Function")
    }

    override fun stop() {
        println("This is Stop Function")
    }

}
fun main() {
    val a1 = A6()
    a1.disp()
    a1.stop()
}