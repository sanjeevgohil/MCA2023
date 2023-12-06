//class property with class
class Student(var nm : String,var age : Int)
{
     fun disp()
     {
         println("Name of Student is :$nm and Age is :$age")
     }

}
fun main() {

    val stud = Student("Sanjeev",21)
    stud.disp()
}