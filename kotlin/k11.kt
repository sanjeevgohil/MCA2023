//parsing
fun main(){
    print("Enter Any Number :")
    val strnum = readLine()!! //make null abstract value because of we convert without value

    val intnum = strnum.toInt()
    println("Integer Value :$intnum")
}
