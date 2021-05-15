// type your solution here
fun main() {
    println("=Expression status Office hours :")
    val openOffice = 7
    val now = 8
    val office = if(now > openOffice) "Office already open" else "Office closed"
    println(office)

    println()
    println("=Expression with sum : ")
    sum(1, 2)

}

fun sum(value1 : Int, value2 : Int) = println("Value : ${value1 + value2}")