fun main() {
    println("= Example set : ")
    val integerSet = setOf(1, 2, 4, 2, 1, 5)
    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)
    println(integerSet)
    println(setA == setB)
    println(5 in setA)

    println()
    val setC = setOf(1, 5, 7)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)
    println(union)
    println(intersect)

    println()
    val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
    mutableSet.add(6) // menambah item di akhir set
    mutableSet.remove(1) //menghapus item yang memiliki nilai 1
    println(mutableSet)
}