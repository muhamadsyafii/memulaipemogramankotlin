// type your solution here
fun main() {
    println("==Integer MIN and MAX")
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE
    println(maxInt)
    println(minInt)

    println()
    println()
    println("==Integer MIN and MAX with over range int")
    val overRange = Int.MAX_VALUE + 1
    println("Max Int : $maxInt")
    println("Over range int : $overRange")

    println()
    println()
    println("==Operator + : ")
    val numberOne = 1
    val numberTwo = 2
    println(numberOne + numberTwo)

    println()
    println()
    println("==Operator / : ")
    val numberOne1 = 20
    val numberTwo1 = 10
    println(numberOne1 / numberTwo1)


    println()
    println()
    println("==Operator + and * : ")
    println(5 + 4 * 4)
    println((5 + 4 ) * 4)

    println()
    println()
    println("==String to Int : ")
    val stringNumber = "23"
    val intNumber = 3
    println(intNumber + stringNumber.toInt())

    println()
    println()
    println("==Readable number : ")
    val readableNumber = 1_000_000
    println(readableNumber)

}