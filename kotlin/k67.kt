//enum (enumration datatype)
fun main(args: Array<String>) {
    val a1 = grade.agrade.g
    val a2 = grade.bgrade.g
    val a3 = grade.cgrade.g
    println("If Stident Get More Than 90% the grade will be : $a1")
    println("If Stident Get More Than 80% the grade will be : $a2")
    println("If Stident Get More Than 70% the grade will be : $a3")
}
enum class grade(val g: String) {
    agrade("A+"),
    bgrade("A"),
    cgrade("B")
}