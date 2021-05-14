// type your solution here
fun main() {
    val user = setUser("Muhamad Syafii", 24)
    println(user)

    printUser("Muhamad Syafii")
}

fun setUser(name : String, age : Int) = "Your name is $name, and you $age years old"

fun printUser(name : String){
    println("Your name is $name")
}