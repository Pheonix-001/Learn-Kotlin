fun main(){

//    // var for mutable variable
//    var a: Int = 34
//    // val for immutable variable
//    val b: Int = 23
//    println(a)
//    println(b)
//
//    var name: String = "Jayant Gupta"
//    println("Name = ${name.toUpperCase()}")
//    println("Name = ${name.toLowerCase()}")

//    var age: Int = 35

//    // if-else condition -->
//    val canVote = if(age<18) {
//        "You cannot vote"
//    }
//    else {
//        "You can vote"
//    }
//    print(canVote)

//    // Switch-case in Kotlin
//    var name = "jayant"
//    var a = when(name) {
//        "jayant"-> {
//            "jayant"
//            println("my name is jayant")
//        } "aman"-> {
//            println("my name is aman")
//        } "vivek"-> {
//            println("my name is viven")
//        } else-> {
//            println("no name match")
//        }
//    }
//    print(a)

//    // Arrays in kotlin
//    var days = arrayOf("monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday")

//    // using for-each loop to iterate an array
//    for(day in days) {
//        println(day)
//    }
//
//    println(days.size)
//    println(days.get(2))
//    println(days.toString())

//    // Creating iterator object ot iterate an array
//    var i = days.iterator()
//
//    print("iterate through iterator object = ")
//    while(i.hasNext()) {
//        print("${i.next()} ")
//    }
//    println()
//
//    // iterate through forEach() function
//    days.forEach {
//        println(it)
//    }

//    // Iterate through while loop
//    var i = 0
//    while (i < days.size) {
//        println(days.get(i))
//        i++
//    }

//    // Iterate through do-while loop
//    do {
//        println(days.get(i))
//        i++
//    }while (i < days.size)

//    // List in kotlin  ,    by default kotlin gives us immutable list
//    var names = listOf("Mohit", "Rohit", "Aman", "Vivek", "Suresh", "Sanjay", 1, 2, 3)

//    // to create a mutable (changeable) list use - mutableListOf()  function
//    var names = mutableListOf<String>("Mohit", "Rohit", "Vivek", "Suresh", "Sanjay")
//    names[0] = "jayant"

//    for( name in names ) {
//        println(name)
//    }
//    println(names.first())
//    print(names.last())


//    // Ranges in kotlin       .. -> rangeIn
//    println("Print number in range 0 - 9")
//    for (i in 0..9) {
//        print(i)
//    }
//    println()
//
//    println("Print number in range 0 - 9 with skipping 2nd index")
//    for (i in 0..9 step 2) {
//        print(i)
//    }
//    println()
//
//    println("Print number in descending order 9 - 0")
//    for (i in 9 downTo 0) {
//        print(i)
//    }


//    var a = 5
//    if (a in 0..10) {
//        print("hello")
//    } else {
//        print("world")
//    }
//    println()
//
//    if (a !in 0..10) {
//        print("i love")
//    } else {
//        print("kotlin")
//    }







}