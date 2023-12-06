//class with constructor
class Student2()
{
    var nm : String = ""
    var age : Int = 0

    constructor(nm : String,age : Int) : this() {
        this.nm = nm
        this.age = age
    }
}
fun main() {

    val stud = Student2("Sanjeev",22)

    println("Name is :${stud.nm}")
    println("Age is :${stud.age}")
}