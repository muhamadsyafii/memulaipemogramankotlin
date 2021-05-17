// type your solution here
fun main() {
    println("=Ex Range 1..5 : ")
    val range = 1..5
    for (i in range){
        println("Value is $i!")
    }

    println()
    println("=Ex Range 1.rangeTo(5) : ")
    val range1 = 1.rangeTo(5)
    for (i in range1){
        println("value is $i!")
    }

    println()
    println("Ex Range 1.rangeTo(10) step 3 : ")
    val range2 = 1.rangeTo(10) step 3
    for (i in range2){
        println("value is $i!")
    }

    println()
    println("=Ex Range (index, value) in ranges.withIndex()) : ")
    val range3 = 1.rangeTo(10) step 3
    for ((index,value) in range3.withIndex()){
        println("value $value with index $index")
    }

    println()
    println("=Ex Range ranges.forEach { value -> } : ")
    val range4 = 1.rangeTo(10) step 3
    range4.forEach { value ->
        println("value is $value")
    }

    println()
    println("=Ex Range ranges.forEachIndexed { index, _ } : ")
    val range5 = 1.rangeTo(10) step 3
    range5.forEachIndexed { index, _ ->
        println("index $index")
    }

}