// type your solution here
fun main() {
    println("== Safe Call and Elvis Operator : ")
    val text : String? = null
    val textLength = text?.length
    val textLength1 = text!!.length
    println(textLength)

    //this is error exception
    println(textLength1)
}