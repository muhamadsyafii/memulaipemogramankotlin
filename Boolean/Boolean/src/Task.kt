// type your solution here
fun main() {
    println("==Conjunction atau AND (&&)==")
    //Conjunction atau AND (&&)
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = now >= officeOpen || now > officeClosed

    print(isOpen)

    println()
    println()
    println("==Disjunction atau OR (||)==")
    //Disjunction atau OR (||)
    val isClosed = now < officeOpen || now > officeClosed
    print("Office is closed : $isClosed")

    println()
    println()
    println("==Negation atau NOT (!)==")
    //DNegation atau NOT (!)
    val officeOpen1 = 7
    val now1 = 10
    val isOpen1 = now1 < officeOpen1

    if (!isOpen1){
        print("Office is closed")
    }else{
        print("Office is open")
    }
}