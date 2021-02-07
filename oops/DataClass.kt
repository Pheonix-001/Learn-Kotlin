//POJO : Plain Old Java Object

package oops

    fun main() {

        val user = User("Jayant", 3)
        println(user)

        val user2 = User("Jayant", 3)
        val user3 = User("ajay", 83)

        println("user == user2: ${user == user2}")
        println("user == user3: ${user == user3}")
        println("user === user2: ${user === user2}")

        println(user.hashCode())
        println(user2.hashCode())
        println(user3.hashCode())

        // copy() function
        println(user.copy())
        println(user2.copy())
        println(user3.copy())

        println("name = ${user.component1()}")
        println("id = ${user.component2()}")


    }

data class User(val name: String, val id: Int)

