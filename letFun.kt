fun main() {

    val name: String? = "jayant"

    if(name != null) {
        print(name)
    }

    // or

        // it will run if name is not null like upper if statement
    name?.let {it ->
        println("hello")
    }
}


