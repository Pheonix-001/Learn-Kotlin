fun main() {

    val list = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8)

    println("Filter function")
    val newList = list.filter({ it->
        it % 2 == 0
    }).map({
        it * it
    }).forEach({
        println("$it")
    })


    println(newList)



}

