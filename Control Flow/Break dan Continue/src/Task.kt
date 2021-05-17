// type your solution here
fun main() {
    println("=Break and Continue ex 1 = ")
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)
    for (i in listOfInt){
        println(i)
    }

    println()
    println("=Break and Continue ex 2 = ")
    val listOfInt1 = listOf(1, 2, 3, null, 5, null, 7)
    for (i in listOfInt1){
        if (i == null) continue
        println(i)
    }

    println()
    println("=Break and Continue ex 3 = ")
    val listOfInt2 = listOf(1, 2, 3, null, 5, null, 7)
    for (i in listOfInt2){
        if (i == null) break
        println(i)
    }

    println()
    println("=Break and Continue Labels ex 3 = ")
    loop@ for (i in 1..10){
        println("Outsite Loop")

        for (j in 1..10){
            println("Inside Loop")
            if ( j > 5) break@loop
        }
    }



}