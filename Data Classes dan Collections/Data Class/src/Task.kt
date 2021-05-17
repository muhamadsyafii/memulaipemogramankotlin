// type your solution here
class User(val name : String, val age : Int){

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass !=other?.javaClass) return false

        other as User

        if (name !=other.name) return false
        if (age !=other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age

        return result
    }
}

data class DataUser(val name : String, val age : Int){
    fun intro(){
        println("My name is $name, I am $age years old")
    }
}

fun main() {

    val user = User("Muhamad Syafii", 24)
    val user1 = User("Syafii", 24)
    val user2 = User("Pilkupil", 24)

    val dataUser = DataUser("Muhamad Syafii", 24)
    val dataUser1 = DataUser("Risma Adisty", 20)
    val dataUser2 = DataUser("Nilasari", 20)
    val dataUser4 = dataUser.copy()
    val dataUser5 = dataUser.copy(age = 18)

    println(user)
    println(dataUser)
    println(dataUser.equals(dataUser1))
    println(dataUser.equals(dataUser2))
    println(user.equals(user1))
    println(user.equals(user2))
    println(dataUser4)
    println(dataUser5)


    println()
    println("= Destructuring Declarations : ")
    val name = dataUser.component1()
    val age = dataUser.component2()
    dataUser.intro()
    println("My name is $name, I am $age years old")

}