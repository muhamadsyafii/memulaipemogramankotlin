// type your solution here
fun main() {
    val text = "Kotlin"
    val firstChar = text[0]

    print("First character of $text is $firstChar")

    println()
    //with for loop
    val textKotlin = "Kotlin"
    for (char in textKotlin){
        print("$char ")
    }

    println()
    //Escaped String
    val statement = "Kotlin is Awesome!"
    val statement1 = "Kotlin is \"Awesome!\""
    println(statement)
    println(statement1)

    println()
    //Unicode
    val unicode = "Unicode test: \u00A9"
    print(unicode)

    println()
    //Raw String
    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()

    print(line)
}