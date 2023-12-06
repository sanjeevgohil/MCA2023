//multiple inheritance using interface
interface C1
{
    var a : Int
    var b : Int
}
interface D1
{
    var c : Int
    var d : Int
}
class D2 : C1, D1
{
    override var a: Int
        get() = 10
        set(value) {}
    override var b: Int
        get() = 20
        set(value) {}
    override var c: Int
        get() = 30
        set(value) {}
    override var d: Int
        get() = 40
        set(value) {}

    fun display(){
        println("Value of A : $a \nValue of B : $b \nValue of C : $c \nValue of D : $d")
    }

}
fun main(args: Array<String>) {
    var d = D2()
    d.display()
}