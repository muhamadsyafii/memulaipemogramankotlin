fun main() {
    println("= Example Map : ")
    //this is imutable
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    println(capital["Jakarta"])
    println(capital.getValue("Jakarta"))

    val mapKey = capital.keys
    val mapValue = capital.values
    println(mapKey)
    println(mapValue)

    //this is mutable
    val mutableCapital = capital.toMutableMap()
    mutableCapital["Amsterdam"] = "Netherlands" // or mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital["Berlin"] = "Berlin" // or mutableCapital.put("Berlin", "Germany")

    println(mutableCapital)
}