//class
class Student1(var nm : String,var age : Int)
fun main() {

    val stud = Student1("Sanjeev",21)
    val snm = stud.nm
    val sage = stud.age

    println("Name is ::$snm and Age is ::$sage")
}