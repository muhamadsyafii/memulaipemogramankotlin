import kotlin.random.Random

// type your solution here
fun main() {
    val value = 7
    println("=Without else : ")
    when(value){
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
    }

    println()
    println("=With else : ")
    when(value){
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
        else -> println("value cannot be reached")
    }

    println()
    println("=With println outer when : ")
    val stringOfValue = when(value){
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
        else -> println("value cannot be reached")
    }
    println(stringOfValue)

    println()
    println("=With curly braces with {} : ")
    val stringOfValue1 = when (value){
        6 -> {
            println("Six")
            "value is 6"
        }
        7 -> {
            println("Seven")
            "value is 7"
        }
        8 -> {
            println("Eight")
            "value is 8"
        }
        else -> {
            println("undefined")
            "value cannot be reached"
        }
    }

    println(stringOfValue1)

    println()
    println("=With curly braces with is or !is in {} : ")
    val anyType : Any = 100L
    when(anyType){
        is Long -> println("the value has a Long type")
        is String -> println("the value has a String type")
        else -> println("undefined")
    }

    println()
    println("=With curly braces with in or !in in {} : ")
    val value1 = 27
    val ranges = 10..50
    when(value1){
        in ranges -> println("value is in range")
        !in ranges -> println("value is outside in range")
        else -> "value undefined"
    }

    println()
    println("=When expression inside variable : ")
    val registerNumber = when(val regis = getRegisterNumber()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }

    println(registerNumber)

}

fun getRegisterNumber() = Random.nextInt(100)