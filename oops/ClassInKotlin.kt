package oops

fun main() {

    // creating p1 object of Person class

    val p1 = Person("Anuj")
    println(p1.name)

    val b1 = Boy(19)
    println(b1.age)

    val b2 = Boy2(34)
    println(b2.age)

}

// making a class
// to make constructor, constructor() function is optional

class Person constructor(_name: String) {
    val name: String

    init {
        name = _name
    }
}

class Boy(_age: Int) {
    val age: Int

    init {
        age = _age
    }
}


// Shortcut to make same Boy class
class Boy2(val age: Int)



