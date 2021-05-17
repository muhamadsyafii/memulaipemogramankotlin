fun main() {
    println("=filter() dan filterNot() =")
    println("=filter() : ")
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val eventList = numberList.filter { it % 2 == 0 }
    println(eventList)

    println()
    println("=filterNot() : ")
    val notEventList = numberList.filterNot { it % 2 == 0 }
    println(notEventList)

    println()
    println("=map() : ")
    val multipliedBy5 = numberList.map { it * 5 }
    println(multipliedBy5)

    println()
    println("=count() : ")
    println(numberList.count())
    println(numberList.count{it % 3 == 0})

    println()
    println("=firstOrNull() & lastOrNull() : ")
    val firstOddNumber = numberList.find { it % 2 == 1 }
    val firstOrNullNumber = numberList.firstOrNull{it % 2 == 3}
    println(firstOddNumber)
    println(firstOrNullNumber)

    println()
    println("=first() & last() : ")
    // val moreThan10 = numberList.first{it > 10}
    // println(moreThan10)
    // Output: Exception in thread "main" java.util.NoSuchElementException: Collection contains no element matching the predicate.


    println()
    println("=sum() : ")
    val total = numberList.sum()
    println(total)


    println()
    println("=sorted() : ")
    println("ascending : ")
    val ascendingList = numberList.sorted()
    println(ascendingList)

    println("descending : ")
    val kotlinChar = listOf('K','O', 'T', 'L', 'I', 'N')
    val numberDescending = listOf(1, 2, 3, 4, 5)
    val descendingList = kotlinChar.sortedDescending()
    println(descendingList)
    println(numberDescending.sortedDescending())
}