fun main() {

//    println(sum(34,31))
//    print(sum2(23, 4))

    greeting(name = "Anuj", greet = "Good afternoon")
    greeting()
    greeting("Good morning", "Shivam")

}

// simple function in kotlin
fun sum(a: Int, b: Int) : Int {
    return a + b
}

// same sum function in one-line
fun sum2(a: Int, b: Int) : Int = a + b

// Setting default parameter
fun greeting (greet: String = "Good Night", name: String = "jay") {
    println("hello $name, $greet")
}

