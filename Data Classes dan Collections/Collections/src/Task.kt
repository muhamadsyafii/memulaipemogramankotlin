// type your solution here
fun main() {
    println("= Example List : ")
    val numberList = listOf(1, 2, 3, 4, 5)
    val charList = listOf('a', 'b', 'c')
    val anyList = mutableListOf('a', "Kotlin", 3, true)

    anyList.add('d') //add items to the end of the list
    anyList.add(1, "Love") // menambah item pada indeks ke-1
    anyList[3] = false // mengubah nilai item pada indeks ke-3
    anyList.removeAt(1) // menghapus item User() berdasarkan index atau posisi nilai di dalam Array

    println(numberList)
    println(charList)
    println(anyList)
}