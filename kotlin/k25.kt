import java.util.Scanner

//write a program to charater and check character is vowel or Consonent
fun main() {
    var s1 = Scanner(System.`in`)
    print("Enter Character:")
    var c = s1.next().single()

    c = c.toUpperCase()
    if (c == 'A'||c =='E'||c =='I'||c =='O'||c =='U')
        println("Character is Vowel")
    else
        println("Character is Consonent")
}