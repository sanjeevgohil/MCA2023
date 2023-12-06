fun main(args: Array<String>) {
    val a1 = grade1.agrade.pr

    println("If Student Get More Than 90% the grade will be : $a1")
}
enum class grade1(val g: String,val pr : Int) {
    agrade("A+",90){
        fun getpr():Int{
            return pr
        }
    },
    bgrade("A",80){
        fun getpr():Int{
            return pr
        }
    },
    cgrade("B",70){
        fun getpr():Int{
            return pr
        }
    }
}