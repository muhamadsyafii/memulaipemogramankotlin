// type your solution here
fun main() {
    println("=Range 1..10 :")
    val rangeInt = 1..10
    println(rangeInt)

    println()
    println("=Range 1..10 step 2 :")
    val rangeInt2 = 1..10 step 2
    rangeInt2.forEach{
        print("$it ")
    }
    println(rangeInt2.step)

    println()
    println("=Range 0.downTo(1) :")
    val tenToOne = 10.downTo(1)
    if (7 in tenToOne){
        println("value 7 available")
    }

    println()
    println("=Range 11 !in tenToOne :")
    val tenToOne1 = 10.downTo(1)
    if (11 !in tenToOne1){
        println("No value 11 in range")
    }

}