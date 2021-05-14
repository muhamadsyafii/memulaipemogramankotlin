// type your solution here
fun main() {
    println("=Nullable Types : ")
    val text : String? = null
    if (text !=null){
        val textLength = text.length
        println(textLength)
    }else{
        println("Is Null")
    }

}