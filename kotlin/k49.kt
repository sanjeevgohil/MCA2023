//with argument with return
fun main(){
    val nm : String = "Sanjeev"
    val lnm : String = "Gohil"
    val fullnm :String = dispnm1(nm,lnm)

    println("Name is : $fullnm")
    println("Name is : ${dispnm1(nm,lnm)}")
    println("Name is : "+dispnm1(nm,lnm))
}

fun dispnm1(nm:String,lnm:String):String{
    val full_nm : String = nm+lnm
    return full_nm
}