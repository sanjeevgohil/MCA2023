//interface
interface S1
{
    fun disp()
    fun stop()
}
class ABC : S1
{
    override fun disp() {
        println("This is Display Function")
    }

    override fun stop() {
        println("This is Stop Function")
    }

}
fun main() {
    val a1 = ABC()
    a1.disp()
    a1.stop()
}